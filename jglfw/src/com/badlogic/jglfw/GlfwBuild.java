package com.badlogic.jglfw;

import com.badlogic.gdx.jnigen.AntScriptGenerator;
import com.badlogic.gdx.jnigen.BuildConfig;
import com.badlogic.gdx.jnigen.BuildExecutor;
import com.badlogic.gdx.jnigen.BuildTarget;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.NativeCodeGenerator;

public class GlfwBuild {
	public static String[] merge(String[] a, String ... b) {
		String[] n = new String[a.length + b.length];
		System.arraycopy(a, 0, n, 0, a.length);
		System.arraycopy(b, 0, n, a.length, b.length);
		return n;
	}
	
	public static void main(String[] args) throws Exception {
		NativeCodeGenerator jniGen = new NativeCodeGenerator();
		jniGen.generate("src/", "bin/", "jni", new String[] { "**/GL.java", "**/Glfw.java", "**/Memory.java" }, null);
		
		String[] commonSrc = { 
			"glfw-3.0/src/clipboard.c",
			"glfw-3.0/src/context.c",
			"glfw-3.0/src/gamma.c", 
			"glfw-3.0/src/init.c",
			"glfw-3.0/src/input.c",
			"glfw-3.0/src/joystick.c",
			"glfw-3.0/src/monitor.c",
			"glfw-3.0/src/time.c",
			"glfw-3.0/src/window.c"
		};
		
		/* WINDOWS */
		BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
		win32.cIncludes = merge(commonSrc,
			"glfw-3.0/src/win32_clipboard.c",
			"glfw-3.0/src/win32_gamma.c",
			"glfw-3.0/src/win32_init.c",
			"glfw-3.0/src/win32_joystick.c",
			"glfw-3.0/src/win32_monitor.c",
			"glfw-3.0/src/win32_time.c",
			"glfw-3.0/src/win32_window.c",
			"glfw-3.0/src/wgl_context.c"
		);
		win32.cFlags += " -D_GLFW_WIN32 -D_GLFW_WGL -D_GLFW_USE_OPENGL";
		win32.headerDirs = new String[] { "glfw-3.0/include", "glfw-3.0/src", "glew-headers/" };
		win32.libraries = "-lopengl32 -lwinmm -lgdi32";
		
		BuildTarget win32home = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
		win32home.compilerPrefix = "";
		win32home.excludeFromMasterBuildFile = true;
		win32home.cIncludes = win32.cIncludes;
		win32home.cFlags += " -D_GLFW_WIN32 -D_GLFW_WGL -D_GLFW_USE_OPENGL";
		win32home.headerDirs = win32.headerDirs;
		win32home.buildFileName = "build-windows32home.xml";
		win32home.libraries = win32.libraries;
		
		BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
		win64.cIncludes = win32.cIncludes;
		win64.cFlags += " -D_GLFW_WIN32 -D_GLFW_WGL -D_GLFW_USE_OPENGL";
		win64.headerDirs = win32.headerDirs;
		win64.libraries = win32.libraries;
		
		/* LINUX */
		BuildTarget linux32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
		linux32.cIncludes = merge(commonSrc,
			"glfw-3.0/src/x11_clipboard.c",
			"glfw-3.0/src/x11_gamma.c",
			"glfw-3.0/src/x11_init.c",
			"glfw-3.0/src/x11_joystick.c",
			"glfw-3.0/src/x11_monitor.c",
			"glfw-3.0/src/x11_time.c",
			"glfw-3.0/src/x11_unicode.c",
			"glfw-3.0/src/x11_window.c",
			"glfw-3.0/src/glx_context.c"
		);
		linux32.cFlags += " -D_GLFW_X11 -D_GLFW_GLX -D_GLFW_USE_OPENGL -D_GLFW_HAS_DLOPEN";
		linux32.headerDirs = new String[] { "glfw-3.0/include", "glfw-3.0/src", "glew-headers/" };
		linux32.libraries = "-lX11 -lXrandr -lXxf86vm";
		
		BuildTarget linux64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
		linux64.cIncludes = linux32.cIncludes;
		linux64.cFlags += " -D_GLFW_X11 -D_GLFW_GLX -D_GLFW_USE_OPENGL -D_GLFW_HAS_DLOPEN";
		linux64.headerDirs = linux32.headerDirs;
		linux64.libraries = linux32.libraries;
		
		/* MAC OS X */
		BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);
		mac.cIncludes = merge(commonSrc,
			"glfw-3.0/src/cocoa_clipboard.m",
			"glfw-3.0/src/cocoa_gamma.c",
			"glfw-3.0/src/cocoa_init.m",
			"glfw-3.0/src/cocoa_joystick.m",
			"glfw-3.0/src/cocoa_monitor.m",
			"glfw-3.0/src/cocoa_time.c",
			"glfw-3.0/src/cocoa_window.m",
			"glfw-3.0/src/nsgl_context.m"
		);
		mac.cFlags += " -D_GLFW_COCOA -D_GLFW_NSGL -D_GLFW_USE_OPENGL -D_GLFW_USE_MENUBAR";
		mac.headerDirs = new String[] { "glfw-3.0/include", "glfw-3.0/src", "glew-headers/" };
		mac.libraries = "-framework Cocoa -framework OpenGL -framework IOKit";

		
		BuildConfig config = new BuildConfig("jglfw");
		new AntScriptGenerator().generate(config, win32home, win32, win64, linux32, linux64, mac);
		BuildExecutor.executeAnt("jni/build-windows32home.xml", "-v -Dhas-compiler=true clean");
		BuildExecutor.executeAnt("jni/build-windows32home.xml", "-v -Dhas-compiler=true");
//		BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true clean");
//		BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true");
//		BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true clean");
//		BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true");
//		BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true clean");
//		BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true");
		BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
		
//		GlfwTest.main(new String[0]);
	}
}
