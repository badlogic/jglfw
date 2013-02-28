package com.badlogic.jglfw;

public interface GlfwCallback {
	/**
	 * Called when the window is about to close
	 * @return whether to close the window or not
	 */
	public boolean windowClosed();
	
}
