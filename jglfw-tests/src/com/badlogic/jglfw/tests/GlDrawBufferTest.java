package com.badlogic.jglfw.tests;

import static com.badlogic.jglfw.Glfw.*;
import static com.badlogic.jglfw.gl.GL.*;

import java.nio.CharBuffer;
import java.nio.FloatBuffer;

import com.badlogic.jglfw.GlfwCallbackAdapter;
import com.badlogic.jglfw.utils.Memory;

public class GlDrawBufferTest {
	public static void main (String[] args) {
		glfwInit();
//		glfwWindowHint(GLFW_DEPTH_BITS, 16);
		long window = glfwCreateWindow(800, 600, "GL Draw Buffer Test", glfwGetPrimaryMonitor(), 0);
		glfwMakeContextCurrent(window);
		glfwSetCallback(new GlfwCallbackAdapter() {
			@Override
			public void windowSize (long window, int width, int height) {
				glViewport(0, 0, width, height);
			}
		});
		
		FloatBuffer vertices = Memory.malloc(9 * 4).asFloatBuffer();
		vertices.put(new float[] {-0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0.5f, 0 });
		CharBuffer indices = Memory.malloc(3 * 2).asCharBuffer();
		indices.put(new char[] { 0, 1, 2 });
		
		while(!glfwWindowShouldClose(window) || glfwGetKey(window,  GLFW_KEY_ESCAPE)) {
			glClearColor(1,  0,  0,  1);
			glClear(GL_COLOR_BUFFER_BIT);
			
			glRotatef(0.1f, 0, 0, 1);
			
			glEnableClientState(GL_VERTEX_ARRAY);
			glVertexPointer(3, GL_FLOAT, 3 * 4, vertices, 0);
			glDrawElements(GL_TRIANGLES, 3, GL_UNSIGNED_SHORT, indices, 0);
			
			glfwPollEvents();
			glfwSwapBuffers(window);
		}
		
		Memory.free(vertices);
		Memory.free(indices);
		glfwTerminate();
	}
}
