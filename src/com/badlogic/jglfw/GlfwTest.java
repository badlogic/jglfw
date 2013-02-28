package com.badlogic.jglfw;

import static com.badlogic.jglfw.Glfw.*;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

public class GlfwTest {
	public static void main(String[] args) throws InterruptedException {
		new JniGenSharedLibraryLoader("libs/jglfw-natives.jar").load("jglfw");
		
		if(!glfwInit()) {
			System.out.println("NOOOO");
			System.exit(-1);
		}
		System.out.println(glfwGetVersion());		
		glfwOpenWindow(480, 320, 0, 0, 0, 0, 0, 0, GLFW_WINDOW);
		int[] size = new int[2];
		glfwGetWindowSize(size);
		System.out.println(size);
		Thread.sleep(5000);
		glfwTerminate();
	}
}
