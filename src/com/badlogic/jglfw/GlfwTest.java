package com.badlogic.jglfw;

import static com.badlogic.jglfw.Glfw.*;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;
import com.badlogic.jglfw.gl.GL;

public class GlfwTest {
	public static void main(String[] args) throws InterruptedException {
		new JniGenSharedLibraryLoader("libs/jglfw-natives.jar").load("jglfw");
		
		if(!glfwInit()) {
			System.out.println("NOOOO");
			System.exit(-1);
		}
		System.out.println(glfwGetVersion());		
		
		for(GlfwVideoMode mode: glfwGetVideoModes()) {
			System.out.println(mode);
		}
		System.out.println("Desktop: " + glfwGetDesktopMode());
		glfwOpenWindowHint(GLFW_WINDOW_NO_RESIZE, 0);
		glfwOpenWindow(480, 320, 0, 0, 0, 0, 0, 0, GLFW_WINDOW);
		System.out.println("" + glfwGetWindowSizeWidth() + ", " + glfwGetWindowSizeHeight());
		
		glfwSetWindowSize(640, 480);
		glfwSetWindowPos(400, 400);
		glfwSetWindowTitle("This is #�io�Test");
		glfwIconifyWindow();
		Thread.sleep(1000);
		glfwRestoreWindow();
		
		glfwSetMousePos(320, 240);
		
		boolean running = true;
		while(running) {
			GL.glClearColor(1, 0, 0, 1);
			GL.glClear(GL.GL_COLOR_BUFFER_BIT);
			
			GL.glBegin(GL.GL_TRIANGLES);
			GL.glVertex2f(-1, -1);
			GL.glVertex2f(1, -1);
			GL.glVertex2f(0, 1);
			GL.glEnd();
			
			System.out.println("" + glfwGetMousePosX() + ", " + glfwGetMousePosY() + ", " + glfwGetMouseWheel());
			glfwSwapBuffers();
			running = glfwGetWindowParam(GLFW_OPENED) != 0 && 
					 !glfwGetKey(GLFW_KEY_ESC) &&
					 !glfwGetMouseButton(GLFW_MOUSE_BUTTON_LEFT);
		}
		
		glfwTerminate();
	}
}
