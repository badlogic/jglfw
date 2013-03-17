package com.badlogic.jglfw.tests;

import com.badlogic.jglfw.al.ALC;
import com.badlogic.jglfw.utils.SharedLibraryLoader;

public class AlcTest {
	public static void main(String[] args) {
		new SharedLibraryLoader().load("openal");
		new SharedLibraryLoader().load("jglfw");
		ALC.alcOpenDevice(null);
	}
}
