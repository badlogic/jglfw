package com.badlogic.jglfw;

public class Glfw {
	public static final int GLFW_RELEASE = 0;
	public static final int GLFW_PRESS = 1;
	
	public static final int GLFW_KEY_UNKNOWN      = -1;
	public static final int GLFW_KEY_SPACE        = 32;
	public static final int GLFW_KEY_SPECIAL      = 256;
	public static final int GLFW_KEY_ESC          = (GLFW_KEY_SPECIAL+1);
	public static final int GLFW_KEY_F1           = (GLFW_KEY_SPECIAL+2);
	public static final int GLFW_KEY_F2           = (GLFW_KEY_SPECIAL+3);
	public static final int GLFW_KEY_F3           = (GLFW_KEY_SPECIAL+4);
	public static final int GLFW_KEY_F4           = (GLFW_KEY_SPECIAL+5);
	public static final int GLFW_KEY_F5           = (GLFW_KEY_SPECIAL+6);
	public static final int GLFW_KEY_F6           = (GLFW_KEY_SPECIAL+7);
	public static final int GLFW_KEY_F7           = (GLFW_KEY_SPECIAL+8);
	public static final int GLFW_KEY_F8           = (GLFW_KEY_SPECIAL+9);
	public static final int GLFW_KEY_F9           = (GLFW_KEY_SPECIAL+10);
	public static final int GLFW_KEY_F10          = (GLFW_KEY_SPECIAL+11);
	public static final int GLFW_KEY_F11          = (GLFW_KEY_SPECIAL+12);
	public static final int GLFW_KEY_F12          = (GLFW_KEY_SPECIAL+13);
	public static final int GLFW_KEY_F13          = (GLFW_KEY_SPECIAL+14);
	public static final int GLFW_KEY_F14          = (GLFW_KEY_SPECIAL+15);
	public static final int GLFW_KEY_F15          = (GLFW_KEY_SPECIAL+16);
	public static final int GLFW_KEY_F16          = (GLFW_KEY_SPECIAL+17);
	public static final int GLFW_KEY_F17          = (GLFW_KEY_SPECIAL+18);
	public static final int GLFW_KEY_F18          = (GLFW_KEY_SPECIAL+19);
	public static final int GLFW_KEY_F19          = (GLFW_KEY_SPECIAL+20);
	public static final int GLFW_KEY_F20          = (GLFW_KEY_SPECIAL+21);
	public static final int GLFW_KEY_F21          = (GLFW_KEY_SPECIAL+22);
	public static final int GLFW_KEY_F22          = (GLFW_KEY_SPECIAL+23);
	public static final int GLFW_KEY_F23          = (GLFW_KEY_SPECIAL+24);
	public static final int GLFW_KEY_F24          = (GLFW_KEY_SPECIAL+25);
	public static final int GLFW_KEY_F25          = (GLFW_KEY_SPECIAL+26);
	public static final int GLFW_KEY_UP           = (GLFW_KEY_SPECIAL+27);
	public static final int GLFW_KEY_DOWN         = (GLFW_KEY_SPECIAL+28);
	public static final int GLFW_KEY_LEFT         = (GLFW_KEY_SPECIAL+29);
	public static final int GLFW_KEY_RIGHT        = (GLFW_KEY_SPECIAL+30);
	public static final int GLFW_KEY_LSHIFT       = (GLFW_KEY_SPECIAL+31);
	public static final int GLFW_KEY_RSHIFT       = (GLFW_KEY_SPECIAL+32);
	public static final int GLFW_KEY_LCTRL        = (GLFW_KEY_SPECIAL+33);
	public static final int GLFW_KEY_RCTRL        = (GLFW_KEY_SPECIAL+34);
	public static final int GLFW_KEY_LALT         = (GLFW_KEY_SPECIAL+35);
	public static final int GLFW_KEY_RALT         = (GLFW_KEY_SPECIAL+36);
	public static final int GLFW_KEY_TAB          = (GLFW_KEY_SPECIAL+37);
	public static final int GLFW_KEY_ENTER        = (GLFW_KEY_SPECIAL+38);
	public static final int GLFW_KEY_BACKSPACE    = (GLFW_KEY_SPECIAL+39);
	public static final int GLFW_KEY_INSERT       = (GLFW_KEY_SPECIAL+40);
	public static final int GLFW_KEY_DEL          = (GLFW_KEY_SPECIAL+41);
	public static final int GLFW_KEY_PAGEUP       = (GLFW_KEY_SPECIAL+42);
	public static final int GLFW_KEY_PAGEDOWN     = (GLFW_KEY_SPECIAL+43);
	public static final int GLFW_KEY_HOME         = (GLFW_KEY_SPECIAL+44);
	public static final int GLFW_KEY_END          = (GLFW_KEY_SPECIAL+45);
	public static final int GLFW_KEY_KP_0         = (GLFW_KEY_SPECIAL+46);
	public static final int GLFW_KEY_KP_1         = (GLFW_KEY_SPECIAL+47);
	public static final int GLFW_KEY_KP_2         = (GLFW_KEY_SPECIAL+48);
	public static final int GLFW_KEY_KP_3         = (GLFW_KEY_SPECIAL+49);
	public static final int GLFW_KEY_KP_4         = (GLFW_KEY_SPECIAL+50);
	public static final int GLFW_KEY_KP_5         = (GLFW_KEY_SPECIAL+51);
	public static final int GLFW_KEY_KP_6         = (GLFW_KEY_SPECIAL+52);
	public static final int GLFW_KEY_KP_7         = (GLFW_KEY_SPECIAL+53);
	public static final int GLFW_KEY_KP_8         = (GLFW_KEY_SPECIAL+54);
	public static final int GLFW_KEY_KP_9         = (GLFW_KEY_SPECIAL+55);
	public static final int GLFW_KEY_KP_DIVIDE    = (GLFW_KEY_SPECIAL+56);
	public static final int GLFW_KEY_KP_MULTIPLY  = (GLFW_KEY_SPECIAL+57);
	public static final int GLFW_KEY_KP_SUBTRACT  = (GLFW_KEY_SPECIAL+58);
	public static final int GLFW_KEY_KP_ADD       = (GLFW_KEY_SPECIAL+59);
	public static final int GLFW_KEY_KP_DECIMAL   = (GLFW_KEY_SPECIAL+60);
	public static final int GLFW_KEY_KP_EQUAL     = (GLFW_KEY_SPECIAL+61);
	public static final int GLFW_KEY_KP_ENTER     = (GLFW_KEY_SPECIAL+62);
	public static final int GLFW_KEY_KP_NUM_LOCK  = (GLFW_KEY_SPECIAL+63);
	public static final int GLFW_KEY_CAPS_LOCK    = (GLFW_KEY_SPECIAL+64);
	public static final int GLFW_KEY_SCROLL_LOCK  = (GLFW_KEY_SPECIAL+65);
	public static final int GLFW_KEY_PAUSE        = (GLFW_KEY_SPECIAL+66);
	public static final int GLFW_KEY_LSUPER       = (GLFW_KEY_SPECIAL+67);
	public static final int GLFW_KEY_RSUPER       = (GLFW_KEY_SPECIAL+68);
	public static final int GLFW_KEY_MENU         = (GLFW_KEY_SPECIAL+69);
	public static final int GLFW_KEY_LAST         =GLFW_KEY_MENU;

	public static final int GLFW_MOUSE_BUTTON_1      = 0;
	public static final int GLFW_MOUSE_BUTTON_2      = 1;
	public static final int GLFW_MOUSE_BUTTON_3      = 2;
	public static final int GLFW_MOUSE_BUTTON_4      = 3;
	public static final int GLFW_MOUSE_BUTTON_5      = 4;
	public static final int GLFW_MOUSE_BUTTON_6      = 5;
	public static final int GLFW_MOUSE_BUTTON_7      = 6;
	public static final int GLFW_MOUSE_BUTTON_8      = 7;
	public static final int GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8;

	public static final int GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1;
	public static final int GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2;
	public static final int GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	public static final int GLFW_JOYSTICK_1          = 0;
	public static final int GLFW_JOYSTICK_2          = 1;
	public static final int GLFW_JOYSTICK_3          = 2;
	public static final int GLFW_JOYSTICK_4          = 3;
	public static final int GLFW_JOYSTICK_5          = 4;
	public static final int GLFW_JOYSTICK_6          = 5;
	public static final int GLFW_JOYSTICK_7          = 6;
	public static final int GLFW_JOYSTICK_8          = 7;
	public static final int GLFW_JOYSTICK_9          = 8;
	public static final int GLFW_JOYSTICK_10         = 9;
	public static final int GLFW_JOYSTICK_11         = 10;
	public static final int GLFW_JOYSTICK_12         = 11;
	public static final int GLFW_JOYSTICK_13         = 12;
	public static final int GLFW_JOYSTICK_14         = 13;
	public static final int GLFW_JOYSTICK_15         = 14;
	public static final int GLFW_JOYSTICK_16         = 15;
	public static final int GLFW_JOYSTICK_LAST       = GLFW_JOYSTICK_16;

	public static final int GLFW_WINDOW               = 0x00010001;
	public static final int GLFW_FULLSCREEN           = 0x00010002;

	public static final int GLFW_OPENED               = 0x00020001;
	public static final int GLFW_ACTIVE               = 0x00020002;
	public static final int GLFW_ICONIFIED            = 0x00020003;
	public static final int GLFW_ACCELERATED          = 0x00020004;
	public static final int GLFW_RED_BITS             = 0x00020005;
	public static final int GLFW_GREEN_BITS           = 0x00020006;
	public static final int GLFW_BLUE_BITS            = 0x00020007;
	public static final int GLFW_ALPHA_BITS           = 0x00020008;
	public static final int GLFW_DEPTH_BITS           = 0x00020009;
	public static final int GLFW_STENCIL_BITS         = 0x0002000A;

	public static final int GLFW_REFRESH_RATE         = 0x0002000B;
	public static final int GLFW_ACCUM_RED_BITS       = 0x0002000C;
	public static final int GLFW_ACCUM_GREEN_BITS     = 0x0002000D;
	public static final int GLFW_ACCUM_BLUE_BITS      = 0x0002000E;
	public static final int GLFW_ACCUM_ALPHA_BITS     = 0x0002000F;
	public static final int GLFW_AUX_BUFFERS          = 0x00020010;
	public static final int GLFW_STEREO               = 0x00020011;
	public static final int GLFW_WINDOW_NO_RESIZE     = 0x00020012;
	public static final int GLFW_FSAA_SAMPLES         = 0x00020013;
	public static final int GLFW_OPENGL_VERSION_MAJOR = 0x00020014;
	public static final int GLFW_OPENGL_VERSION_MINOR = 0x00020015;
	public static final int GLFW_OPENGL_FORWARD_COMPAT = 0x00020016;
	public static final int GLFW_OPENGL_DEBUG_CONTEXT = 0x00020017;
	public static final int GLFW_OPENGL_PROFILE       = 0x00020018;

	public static final int GLFW_OPENGL_CORE_PROFILE  = 0x00050001;
	public static final int GLFW_OPENGL_COMPAT_PROFILE = 0x00050002;

	public static final int GLFW_MOUSE_CURSOR         = 0x00030001;
	public static final int GLFW_STICKY_KEYS          = 0x00030002;
	public static final int GLFW_STICKY_MOUSE_BUTTONS = 0x00030003;
	public static final int GLFW_SYSTEM_KEYS          = 0x00030004;
	public static final int GLFW_KEY_REPEAT           = 0x00030005;
	public static final int GLFW_AUTO_POLL_EVENTS     = 0x00030006;

	public static final int GLFW_WAIT                 = 0x00040001;
	public static final int GLFW_NOWAIT               = 0x00040002;

	public static final int GLFW_PRESENT              = 0x00050001;
	public static final int GLFW_AXES                 = 0x00050002;
	public static final int GLFW_BUTTONS              = 0x00050003;

	public static final int GLFW_NO_RESCALE_BIT       = 0x00000001;
	public static final int GLFW_ORIGIN_UL_BIT        = 0x00000002;
	public static final int GLFW_BUILD_MIPMAPS_BIT    = 0x00000004;
	public static final int GLFW_ALPHA_MAP_BIT        = 0x00000008;

	public static final double GLFW_INFINITY  = 100000.0;
	
	// @off
	/*JNI 
	#include <GL/glfw.h>	
	*/
	
	public static native boolean glfwInit(); /*
		return glfwInit() == GL_TRUE;
	*/
	
	public static native void glfwTerminate(); /*
		glfwTerminate();
	*/
	
	public static String glfwGetVersion() {
		int[] version = new int[3];
		glfwGetVersionJni(version);
		return version[0] + "." + version[1] + "." + version[2];
	}
	
	private static native void glfwGetVersionJni(int[] version); /*			
		version[0] = GLFW_VERSION_MAJOR;
		version[1] = GLFW_VERSION_MINOR;
		version[2] = GLFW_VERSION_REVISION;
	*/
	
	public static native void glfwOpenWindow(int width, int height, int redBits, int greenBits, int blueBits, int alphaBits, int depthBits, int stencilBits, int mode); /*
		glfwOpenWindow(width, height, redBits, greenBits, blueBits, alphaBits, depthBits, stencilBits, mode);				
	*/
	
	public static native void glfwOpenWindowHint(int target, int hint); /*
		glfwOpenWindowHint(target, hint);
	*/
	
	public static native void glfwCloseWindow(); /*
		glfwCloseWindow();
	*/
	
	public static native void glfwSetWindowCloseCallback(); /*
		// FIXME
	*/
	
	public static native void glfwSetWindowTitle(String title); /*
		glfwSetWindowTitle(title);
	*/
	
	public static native void glfwSetWindowSize(int width, int height); /*
		glfwSetWindowSize(width, height);
	*/
	
	public static native void glfwSetWindowPos(int x, int y); /*
		glfwSetWindowPos(x, y);
	*/
	
	/**
	 * @param size int array with at least 2 elements, width is stored in size[0], height in size[1]
	 */
	public static native void glfwGetWindowSize(int[] size); /*
		glfwGetWindowSize(&size[0], &size[1]);
	*/
}
