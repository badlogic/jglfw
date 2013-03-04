package com.badlogic.jglfw.tests;

import com.badlogic.jglfw.GlfwCallbackAdapter;
import com.badlogic.jglfw.gl.GL;

import static com.badlogic.jglfw.gl.GL.*;
import static com.badlogic.jglfw.Glfw.*;


public class ShaderTest {
	public static void main (String[] args) {
		glfwInit();
		glfwWindowHint(GLFW_DEPTH_BITS, 16);
		long window = glfwCreateWindow(480, 320, "Shader Test", 0, 0);
		glfwMakeContextCurrent(window);
		glfwSetCallback(new GlfwCallbackAdapter() {
			@Override
			public void windowSize (long window, int width, int height) {
				glViewport(0, 0, width, height);
			}
		});
		
		String vertexShader = "void main() { gl_Position = ftransform(); }";
		String fragmentShader = "void main() { gl_FragColor = vec4(0.4,0.4,0.8,1.0); }";
		
		int vShader = GL.glCreateShader(GL.GL_VERTEX_SHADER);
		GL.glShaderSource(vShader, vertexShader);
		GL.glCompileShader(vShader);
		int fShader = GL.glCreateShader(GL.GL_FRAGMENT_SHADER);
		GL.glShaderSource(fShader, fragmentShader);
		GL.glCompileShader(fShader);
		int program = GL.glCreateProgram();
		GL.glAttachShader(program, vShader);
		GL.glAttachShader(program, fShader);
		GL.glLinkProgram(program);
		
		GL.glUseProgram(program);
		
		while(!glfwWindowShouldClose(window)) {
			glClearColor(1,  0,  0,  1);
			glClear(GL_COLOR_BUFFER_BIT);
			
			GL.glRotatef(0.01f, 0, 0, 1);
			GL.glBegin(GL.GL_TRIANGLES);
			GL.glVertex2f(-0.5f, -0.5f);
			GL.glVertex2f(0.5f, -0.5f);
			GL.glVertex2f(0, 0.5f);
			GL.glEnd();
			
			glfwPollEvents();
			glfwSwapBuffers(window);
		}
		
		glfwTerminate();	
	}
}
