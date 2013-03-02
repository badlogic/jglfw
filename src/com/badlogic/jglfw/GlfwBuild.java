package com.badlogic.jglfw;

import java.util.Arrays;

import com.badlogic.gdx.jnigen.AntScriptGenerator;
import com.badlogic.gdx.jnigen.BuildConfig;
import com.badlogic.gdx.jnigen.BuildExecutor;
import com.badlogic.gdx.jnigen.BuildTarget;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;
import com.badlogic.gdx.jnigen.NativeCodeGenerator;
import com.badlogic.jglfw.gl.GL;

import static com.badlogic.jglfw.Glfw3.*;

public class GlfwBuild {
	public static String[] merge(String[] a, String ... b) {
		String[] n = new String[a.length + b.length];
		System.arraycopy(a, 0, n, 0, a.length);
		System.arraycopy(b, 0, n, a.length, b.length);
		return n;
	}
	
	public static void main(String[] args) throws Exception {
		NativeCodeGenerator jniGen = new NativeCodeGenerator();
		jniGen.generate("src/", "bin/", "jni", new String[] { "**/GL.java", "**/Glfw3.java" }, null);
		
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
		
		
		BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
		win32.compilerPrefix = "";
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
		win32.headerDirs = new String[] { "glfw-3.0/include", "glfw-3.0/src" };
		win32.libraries = "-lopengl32 -lwinmm -lgdi32";
		
//		BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
//		win64.cIncludes = new String[] { "glfw-2.7.7/lib/*.c", "glfw-2.7.7/lib/win32/*.c" };
//		win64.cExcludes = new String[] { "**/win32_dllmain.c" };	
//		win64.headerDirs = new String[] { "glfw-2.7.7/include","glfw-2.7.7/lib", "glfw-2.7.7/lib/win32" };
//		win64.libraries = "-lopengl32 -lwinmm -lgdi32";
//		
//		BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, false);
//		mac.cIncludes = new String[] { "glfw-2.7.7/lib/*.c", "glfw-2.7.7/lib/cocoa/*.c", "glfw-2.7.7/lib/cocoa/*.m" };
//		mac.cExcludes = new String[] { "**/win32_dllmain.c" };	
//		mac.headerDirs = new String[] { "glfw-2.7.7/include","glfw-2.7.7/lib", "glfw-2.7.7/lib/cocoa", "/usr/X11/include/" };
//		mac.libraries = "-framework Cocoa -framework OpenGL -framework IOKit";
		
		BuildConfig config = new BuildConfig("jglfw");
		new AntScriptGenerator().generate(config, win32);
//		BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean");
		BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true");
//		BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true clean");
//		BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true");
		BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
		
		new JniGenSharedLibraryLoader("libs/jglfw-natives.jar").load("jglfw");
		if(!glfwInit()) {
			System.out.println("Couldn't initialize GLFW");
			System.exit(-1);
		}
		System.out.println(glfwGetVersion());
		System.out.println(glfwGetVersionString());
		System.out.println(Arrays.toString(glfwGetMonitors()));
		long monitor = glfwGetPrimaryMonitor();
		System.out.println(monitor);
		System.out.println(glfwGetMonitorX(monitor) + ", " + glfwGetMonitorY(monitor));
		System.out.println(glfwGetMonitorPhysicalWidth(monitor) + ", " + glfwGetMonitorPhysicalHeight(monitor));
		System.out.println(glfwGetMonitorName(monitor));
		System.out.println(glfwGetVideoModes(monitor));
		System.out.println(glfwGetVideoMode(monitor));
		
		long window = glfwCreateWindow(480, 320, "Test", 0, 0);
		System.out.println(glfwGetWindowX(window) + ", " + glfwGetWindowY(window));
		System.out.println(glfwGetWindowWidth(window) + ", " + glfwGetWindowHeight(window));
		glfwSetWindowSize(window, 640, 480);
		glfwIconifyWindow(window);
		Thread.sleep(1000);
		glfwRestoreWindow(window);
		Thread.sleep(1000);
		glfwHideWindow(window);
		Thread.sleep(1000);
		glfwShowWindow(window);
		System.out.println(glfwGetWindowMonitor(window));
		
		while(!glfwGetKey(window, GLFW_KEY_ESCAPE) && !glfwGetMouseButton(window, GLFW_MOUSE_BUTTON_LEFT)) {
			GL.glClear(GL.GL_COLOR_BUFFER_BIT);
			glfwPollEvents();
			glfwSwapBuffers(window);
			System.out.println(glfwGetCursorPosX(window) + ", " + glfwGetCursorPosY(window));
		}
		
		glfwDestroyWindow(window);
		glfwTerminate();
	}
}
