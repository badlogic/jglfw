package com.badlogic.jglfw.tests;

import static com.badlogic.jglfw.Glfw.GLFW_DEPTH_BITS;
import static com.badlogic.jglfw.Glfw.glfwCreateWindow;
import static com.badlogic.jglfw.Glfw.glfwInit;
import static com.badlogic.jglfw.Glfw.glfwMakeContextCurrent;
import static com.badlogic.jglfw.Glfw.glfwPollEvents;
import static com.badlogic.jglfw.Glfw.glfwSetCallback;
import static com.badlogic.jglfw.Glfw.glfwSwapBuffers;
import static com.badlogic.jglfw.Glfw.glfwTerminate;
import static com.badlogic.jglfw.Glfw.glfwWindowHint;
import static com.badlogic.jglfw.Glfw.glfwWindowShouldClose;
import static com.badlogic.jglfw.gl.GL.GL_COLOR_BUFFER_BIT;
import static com.badlogic.jglfw.gl.GL.GL_FLOAT;
import static com.badlogic.jglfw.gl.GL.GL_TRIANGLES;
import static com.badlogic.jglfw.gl.GL.GL_UNSIGNED_SHORT;
import static com.badlogic.jglfw.gl.GL.GL_VERTEX_ARRAY;
import static com.badlogic.jglfw.gl.GL.glClear;
import static com.badlogic.jglfw.gl.GL.glClearColor;
import static com.badlogic.jglfw.gl.GL.glDrawElements;
import static com.badlogic.jglfw.gl.GL.glEnableClientState;
import static com.badlogic.jglfw.gl.GL.glRotatef;
import static com.badlogic.jglfw.gl.GL.glVertexPointer;
import static com.badlogic.jglfw.gl.GL.glViewport;

import java.nio.CharBuffer;
import java.nio.FloatBuffer;

import com.badlogic.jglfw.GlfwCallbackAdapter;
import com.badlogic.jglfw.utils.Memory;

public class LongPointerTest {
	public static void main (String[] args) {
		glfwInit();
		glfwWindowHint(GLFW_DEPTH_BITS, 16);
		long window = glfwCreateWindow(480, 320, "Long Pointer Test", 0, 0);
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
		
		while(!glfwWindowShouldClose(window)) {
			glClearColor(1,  0,  0,  1);
			glClear(GL_COLOR_BUFFER_BIT);
			
			glRotatef(0.1f, 0, 0, 1);
			
			glEnableClientState(GL_VERTEX_ARRAY);
			glVertexPointer(3, GL_FLOAT, 3 * 4, Memory.getBufferAddress(vertices));
			glDrawElements(GL_TRIANGLES, 3, GL_UNSIGNED_SHORT, Memory.getBufferAddress(indices));
			
			glfwPollEvents();
			glfwSwapBuffers(window);
		}
		
		Memory.free(vertices);
		Memory.free(indices);
		glfwTerminate();
	}
}
