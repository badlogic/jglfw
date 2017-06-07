
package com.badlogic.jglfw;

import java.util.ArrayList;

public class GlfwCallbacks implements GlfwCallback {
	private ArrayList<GlfwCallback> processors = new ArrayList(4);

	public void add (GlfwCallback callback) {
		processors.add(callback);
	}

	public void remove (GlfwCallback callback) {
		processors.remove(callback);
	}

	public void error (int error, String description) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).error(error, description);
	}

	public void monitor (long monitor, boolean connected) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).monitor(monitor, connected);
	}

	public void windowPos (long window, int x, int y) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).windowPos(window, x, y);
	}

	public void windowSize (long window, int width, int height) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).windowSize(window, width, height);
	}

	public boolean windowClose (long window) {
		for (int i = 0, n = processors.size(); i < n; i++)
			if (!processors.get(i).windowClose(window)) return false;
		return true;
	}

	public void windowRefresh (long window) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).windowRefresh(window);
	}

	public void windowFocus (long window, boolean focused) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).windowFocus(window, focused);
	}

	public void windowIconify (long window, boolean iconified) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).windowIconify(window, iconified);
	}

	public void key (long window, int key, int scancode, int action, int mods) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).key(window, key, scancode, action, mods);
	}

	public void character (long window, char character) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).character(window, character);
	}

	public void mouseButton (long window, int button, boolean pressed) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).mouseButton(window, button, pressed);
	}

	public void cursorPos (long window, int x, int y) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).cursorPos(window, x, y);
	}

	public void cursorEnter (long window, boolean entered) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).cursorEnter(window, entered);
	}

	public void scroll (long window, double scrollX, double scrollY) {
		for (int i = 0, n = processors.size(); i < n; i++)
			processors.get(i).scroll(window, scrollX, scrollY);
	}
}
