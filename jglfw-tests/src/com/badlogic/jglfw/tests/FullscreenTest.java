
package com.badlogic.jglfw.tests;

import static com.badlogic.jglfw.Glfw.*;

import com.badlogic.jglfw.GlfwCallback;

import java.util.Arrays;

import com.badlogic.jglfw.gl.GL;

public class FullscreenTest {
	static long window;

	public static void main (String[] args) throws InterruptedException {
		if (!glfwInit()) {
			System.out.println("Couldn't initialize GLFW");
			System.exit(-1);
		}
		glfwSetCallback(new GlfwCallback() {
			@Override
			public void error (int error, String description) {
				System.out.println("error: " + description);
			}

			@Override
			public void monitor (long monitor, boolean connected) {
				System.out.println("monitor " + monitor + " " + (connected ? "connected" : "disconnected"));
			}

			@Override
			public void windowPos (long window, int x, int y) {
				System.out.println("window position changed: " + x + ", " + y);
			}

			@Override
			public void windowSize (long window, int width, int height) {
				System.out.println("window size changed: " + width + ", " + height);
			}

			@Override
			public boolean windowClose (long window) {
				System.out.println("window closing");
				return true;
			}

			@Override
			public void windowRefresh (long window) {
				System.out.println("window refresh needed");
			}

			@Override
			public void windowFocus (long window, boolean focused) {
				System.out.println("window " + (focused ? "focused" : "lost focus"));
			}

			@Override
			public void windowIconify (long window, boolean iconified) {
				System.out.println("window " + (iconified ? "iconified" : "deiconified"));
			}

			@Override
			public void key (long w, int key, int action) {
				String actionStr = "pressed";
				if (action == GLFW_RELEASE) actionStr = "released";
				if (action == GLFW_REPEAT) actionStr = "repeated";
				System.out.println("key " + key + " " + actionStr);
			}

			@Override
			public void character (long window, char character) {
				System.out.println("character " + character);
			}

			@Override
			public void mouseButton (long w, int button, boolean pressed) {
				System.out.println("mouse button " + button + " " + (pressed ? "pressed" : "released"));

				if (pressed) {
					long newWindow;
					if (glfwGetWindowMonitor(window) != 0) { // Already fullscreen.
						newWindow = glfwCreateWindow(640, 480, "Test", 0, 0);
					} else {
						long monitor = glfwGetPrimaryMonitor();
						newWindow = glfwCreateWindow(640, 480, "Test", monitor, 0);
					}
					if (newWindow == 0) {
						throw new RuntimeException("Couldn't create window");
					}
					glfwMakeContextCurrent(newWindow);
					glfwDestroyWindow(window);
					window = newWindow;
				}
			}

			@Override
			public void cursorPos (long window, int x, int y) {
				System.out.println("cursor position " + x + ", " + y);
			}

			@Override
			public void cursorEnter (long window, boolean entered) {
				System.out.println("cursor " + (entered ? "entered" : "left"));
			}

			@Override
			public void scroll (long window, double scrollX, double scrollY) {
				System.out.println("scrolled " + scrollX + ", " + scrollY);
			}

		});

		glfwWindowHint(GLFW_DEPTH_BITS, 16); // this is needed on virtualbox...
		window = glfwCreateWindow(800, 600, "Test", 0, 0);
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
