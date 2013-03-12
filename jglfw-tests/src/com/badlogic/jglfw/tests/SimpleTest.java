
package com.badlogic.jglfw.tests;

import static com.badlogic.jglfw.Glfw.*;

import com.badlogic.jglfw.GlfwCallback;

import java.util.Arrays;

import javax.swing.JFrame;

import com.badlogic.jglfw.gl.GL;

public class SimpleTest {
	public static void main (String[] args) throws Exception {
		if (!glfwInit()) {
			System.out.println("Couldn't initialize GLFW");
			System.exit(-1);
		}
		glfwWindowHint(GLFW_DEPTH_BITS, 16); // this is needed on virtualbox...
		long window = glfwCreateWindow(800, 600, "Test", 0, 0);
		if (window == 0) {
			throw new RuntimeException("Couldn't create window");
		}
		glfwMakeContextCurrent(window);
		while (!glfwWindowShouldClose(window)) {
			GL.glViewport(0, 0, 640, 480);
			GL.glClear(GL.GL_COLOR_BUFFER_BIT);
			GL.glRotatef(0.01f, 0, 0, 1);
			GL.glBegin(GL.GL_TRIANGLES);
			GL.glVertex2f(-0.5f, -0.5f);
			GL.glVertex2f(0.5f, -0.5f);
			GL.glVertex2f(0, 0.5f);
			GL.glEnd();
			glfwPollEvents();
			glfwSwapBuffers(window);
		}
		glfwDestroyWindow(window);
		glfwTerminate();
	}
}
