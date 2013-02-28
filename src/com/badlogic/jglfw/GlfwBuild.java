package com.badlogic.jglfw;

import com.badlogic.gdx.jnigen.AntScriptGenerator;
import com.badlogic.gdx.jnigen.BuildConfig;
import com.badlogic.gdx.jnigen.BuildExecutor;
import com.badlogic.gdx.jnigen.BuildTarget;
import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;
import com.badlogic.gdx.jnigen.NativeCodeGenerator;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import static com.badlogic.jglfw.Glfw.*;

public class GlfwBuild {
	public static void main(String[] args) throws Exception {
		NativeCodeGenerator jniGen = new NativeCodeGenerator();
		jniGen.generate();
		
		BuildConfig config = new BuildConfig("jglfw");
		BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
		win32.compilerPrefix = "";
		win32.cIncludes = new String[] { "glfw-2.7.7/lib/*.c", "glfw-2.7.7/lib/win32/*.c" };
		win32.cExcludes = new String[] { "**/win32_dllmain.c" };	
		win32.headerDirs = new String[] { "glfw-2.7.7/include","glfw-2.7.7/lib", "glfw-2.7.7/lib/win32" };
		win32.libraries = "-lopengl32 -lwinmm -lgdi32";
		
		BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
		win64.cIncludes = new String[] { "glfw-2.7.7/lib/*.c", "glfw-2.7.7/lib/win32/*.c" };
		win64.cExcludes = new String[] { "**/win32_dllmain.c" };	
		win64.headerDirs = new String[] { "glfw-2.7.7/include","glfw-2.7.7/lib", "glfw-2.7.7/lib/win32" };
		win64.libraries = "-lopengl32 -lwinmm -lgdi32";
		
		new AntScriptGenerator().generate(config, win32, win64);
		BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean");
		BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true");
		BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
		
		new JniGenSharedLibraryLoader("libs/jglfw-natives.jar").load("jglfw");
		
		if(!glfwInit()) {
			System.out.println("NOOOO");
			System.exit(-1);
		}
		System.out.println(glfwGetVersion());		
		glfwOpenWindow(480, 320, 0, 0, 0, 0, 0, 0, GLFW_WINDOW);
		Thread.sleep(5000);
		glfwTerminate();
	}
}
