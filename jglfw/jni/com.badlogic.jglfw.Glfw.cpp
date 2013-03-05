#include <com.badlogic.jglfw.Glfw.h>

//@line:266
 
	#include <GL/glfw3.h>
	
	// keeping this in statics is not the smartest move, but oh well...
	static jclass callbackClass = 0;
	static jmethodID errorId = 0;
	static jmethodID monitorId = 0;
	static jmethodID windowPosId = 0;
	static jmethodID windowSizeId = 0;
	static jmethodID windowCloseId = 0;
	static jmethodID windowRefreshId = 0;
	static jmethodID windowFocusId = 0;
	static jmethodID windowIconifyId = 0;
	static jmethodID keyId = 0;
	static jmethodID characterId = 0;
	static jmethodID mouseButtonId = 0;
	static jmethodID cursorPosId = 0;
	static jmethodID cursorEnterId = 0;
	static jmethodID scrollId = 0;
	static jobject callback = 0;
	static JNIEnv* staticEnv;
	
	void error(int errorCode, const char* description) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, errorId, (jint)errorCode, staticEnv->NewStringUTF(description));
		}
	}
	
	void windowPos(GLFWwindow* window, int x, int y) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, windowPosId, (jlong)window, (jint)x, (jint)y);
		}
	}
	
	void windowSize(GLFWwindow* window, int width, int height) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, windowSizeId, (jlong)window, (jint)width, (jint)height);
		}
	}
	
	int windowClose(GLFWwindow* window) {
		if(callback) {
			return (staticEnv->CallBooleanMethod(callback, windowCloseId, (jlong)window)?GL_TRUE:GL_FALSE);
		}
		return GL_TRUE;
	}
	
	void windowRefresh(GLFWwindow* window) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, windowRefreshId, (jlong)window);
		}
	}
	
	void windowFocus(GLFWwindow* window, int focused) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, windowFocusId, (jlong)window, (jboolean)(GL_TRUE==focused));
		}
	}
	
	void windowIconify(GLFWwindow* window, int iconified) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, windowIconifyId, (jlong)window, (jboolean)(GL_TRUE==iconified));
		}
	}
	
	void mouseButton(GLFWwindow* window, int button, int action) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, mouseButtonId, (jlong)window, (jint)button, (jint)action);
		}
	}
	
	void cursorPos(GLFWwindow* window, int x, int y) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, cursorPosId, (jlong)window, (jint)x, (jint)y);
		}
	}
	
	void cursorEnter(GLFWwindow* window, int entered) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, cursorEnterId, (jlong)window, (jboolean)(GL_TRUE==entered));
		}
	}
	
	void scroll(GLFWwindow* window, double xpos, double ypos) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, scrollId, (jlong)window, (jdouble)xpos, (jdouble)ypos);
		}
	}
	
	void key(GLFWwindow* window, int key, int action) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, keyId, (jlong)window, (jint)key, (jint)key);
		}
	}
	
	void character(GLFWwindow* window, unsigned int character) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, characterId, (jlong)window, (jchar)character);
		}
	}
	
	void monitor(GLFWmonitor* monitor, int event) {
		if(callback) {
			staticEnv->CallVoidMethod(callback, monitorId, (jlong)monitor, (jboolean)(GLFW_CONNECTED==event));
		}
	}
	
	JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwInitJni(JNIEnv* env, jclass clazz) {


//@line:380

		if(!callbackClass) {
			jclass exception = env->FindClass("java/lang/Exception");
		
			callbackClass = (jclass)env->NewGlobalRef(env->FindClass("com/badlogic/jglfw/GlfwCallback"));
			if(!callbackClass) {
				env->ThrowNew(exception, "Couldn't find class Glfw3Callback");
				return false;
			}
		
			errorId = env->GetMethodID(callbackClass, "error", "(ILjava/lang/String;)V");
			if(!errorId) {
				env->ThrowNew(exception, "Couldn't find error() method");
				return false;
			}
		
			monitorId = env->GetMethodID(callbackClass, "monitor", "(JZ)V");
			if(!monitorId) {
				env->ThrowNew(exception, "Couldn't find monitor() method");
				return false;
			}

			windowPosId = env->GetMethodID(callbackClass, "windowPos", "(JII)V");
			if(!windowPosId) {
				env->ThrowNew(exception, "Couldn't find windowPosId() method");
				return false;
			}
			
			windowSizeId = env->GetMethodID(callbackClass, "windowSize", "(JII)V");
			if(!windowSizeId) {
				env->ThrowNew(exception, "Couldn't find windowSizeId() method");
				return false;
			}

			windowCloseId = env->GetMethodID(callbackClass, "windowClose", "(J)Z");
			if(!windowCloseId) {
				env->ThrowNew(exception, "Couldn't find windowCloseId() method");
				return false;
			}

			windowRefreshId = env->GetMethodID(callbackClass, "windowRefresh", "(J)V");
			if(!windowRefreshId) {
				env->ThrowNew(exception, "Couldn't find windowRefresh() method");
				return false;
			}

			windowFocusId = env->GetMethodID(callbackClass, "windowFocus", "(JZ)V");
			if(!windowFocusId) {
				env->ThrowNew(exception, "Couldn't find windowFocus() method");
				return false;
			}

			windowIconifyId = env->GetMethodID(callbackClass, "windowIconify", "(JZ)V");
			if(!windowIconifyId) {
				env->ThrowNew(exception, "Couldn't find windowIconify() method");
				return false;
			}

			keyId = env->GetMethodID(callbackClass, "key", "(JII)V");
			if(!keyId) {
				env->ThrowNew(exception, "Couldn't find key() method");
				return false;
			}

			characterId = env->GetMethodID(callbackClass, "character", "(JC)V");
			if(!characterId) {
				env->ThrowNew(exception, "Couldn't find character() method");
				return false;
			}
			
			mouseButtonId = env->GetMethodID(callbackClass, "mouseButton", "(JIZ)V");
			if(!mouseButtonId) {
				env->ThrowNew(exception, "Couldn't find mouseButton() method");
				return false;
			}
			
			cursorPosId = env->GetMethodID(callbackClass, "cursorPos", "(JII)V");
			if(!cursorPosId) {
				env->ThrowNew(exception, "Couldn't find cursorPos() method");
				return false;
			}
			
			cursorEnterId = env->GetMethodID(callbackClass, "cursorEnter", "(JZ)V");
			if(!cursorEnterId) {
				env->ThrowNew(exception, "Couldn't find cursorEnter() method");
				return false;
			}
			
			scrollId = env->GetMethodID(callbackClass, "scroll", "(JDD)V");
			if(!scrollId) {
				env->ThrowNew(exception, "Couldn't find scroll() method");
				return false;
			}
		}
	
		jboolean result = glfwInit() == GL_TRUE;
		if(result) {
			glfwSetErrorCallback(error);
			glfwSetMonitorCallback(monitor);
			
		}
		return result;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwTerminate(JNIEnv* env, jclass clazz) {


//@line:484

		glfwTerminate();
	

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVersionString(JNIEnv* env, jclass clazz) {


//@line:492

		return env->NewStringUTF(glfwGetVersionString());
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetMonitorsJni
(JNIEnv* env, jclass clazz, jlongArray obj_monitors, long long* monitors) {

//@line:504

		int count = 0;
		GLFWmonitor** mons = glfwGetMonitors(&count);
		if(!mons) return 0;
		
		for(int i = 0; i < count; i++) {
			monitors[i] = (jlong)mons[i];
		}
		return count;
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorsJni(JNIEnv* env, jclass clazz, jlongArray obj_monitors) {
	long long* monitors = (long long*)env->GetPrimitiveArrayCritical(obj_monitors, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetMonitorsJni(env, clazz, obj_monitors, monitors);

	env->ReleasePrimitiveArrayCritical(obj_monitors, monitors, 0);

	return JNI_returnValue;
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetPrimaryMonitor(JNIEnv* env, jclass clazz) {


//@line:515

		return (jlong)glfwGetPrimaryMonitor();
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorX(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:519

		int x = 0;
		int y = 0;
		glfwGetMonitorPos((GLFWmonitor*)monitor, &x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorY(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:526

		int x = 0;
		int y = 0;
		glfwGetMonitorPos((GLFWmonitor*)monitor, &x, &y);
		return y;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorPhysicalWidth(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:533

		int width = 0;
		int height = 0;
		glfwGetMonitorPhysicalSize((GLFWmonitor*)monitor, &width, &height);
		return width;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorPhysicalHeight(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:540

		int width = 0;
		int height = 0;
		glfwGetMonitorPhysicalSize((GLFWmonitor*)monitor, &width, &height);
		return height;
	

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMonitorName(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:547

		return env->NewStringUTF(glfwGetMonitorName((GLFWmonitor*)monitor));
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni
(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_modes, int* modes) {

//@line:567

		int numModes = 0;
		const GLFWvidmode* vidModes = glfwGetVideoModes((GLFWmonitor*)monitor, &numModes);
		for(int i = 0, j = 0; i < numModes; i++) {
			modes[j++] = vidModes[i].width;
			modes[j++] = vidModes[i].height;
			modes[j++] = vidModes[i].redBits;
			modes[j++] = vidModes[i].greenBits;
			modes[j++] = vidModes[i].blueBits;
		}
		return numModes;
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_modes) {
	int* modes = (int*)env->GetPrimitiveArrayCritical(obj_modes, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni(env, clazz, monitor, obj_modes, modes);

	env->ReleasePrimitiveArrayCritical(obj_modes, modes, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVideoModeJni(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_buffer) {
	int* buffer = (int*)env->GetPrimitiveArrayCritical(obj_buffer, 0);


//@line:592

		GLFWvidmode mode = glfwGetVideoMode((GLFWmonitor*)monitor);
		buffer[0] = mode.width;
		buffer[1] = mode.height;
		buffer[2] = mode.redBits;
		buffer[3] = mode.greenBits;
		buffer[4] = mode.blueBits;
	
	env->ReleasePrimitiveArrayCritical(obj_buffer, buffer, 0);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetGamma(JNIEnv* env, jclass clazz, jlong monitor, jfloat gamma) {


//@line:601

		glfwSetGamma((GLFWmonitor*)monitor, gamma);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetGammaRamp(JNIEnv* env, jclass clazz) {


//@line:605

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetGammaRamp(JNIEnv* env, jclass clazz) {


//@line:609

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwDefaultWindowHints(JNIEnv* env, jclass clazz) {


//@line:613

		glfwDefaultWindowHints();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwWindowHint(JNIEnv* env, jclass clazz, jint target, jint hint) {


//@line:617

		glfwWindowHint(target, hint);
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_Glfw_glfwCreateWindowJni
(JNIEnv* env, jclass clazz, jint width, jint height, jstring obj_title, jlong monitor, jlong share, char* title) {

//@line:631

		GLFWwindow* window = glfwCreateWindow(width, height, title, (GLFWmonitor*)monitor, (GLFWwindow*)share);
		if(window) {
			glfwSetWindowPosCallback(window, windowPos);
			glfwSetWindowSizeCallback(window, windowSize);
			glfwSetWindowCloseCallback(window, windowClose);
			glfwSetWindowRefreshCallback(window, windowRefresh);
			glfwSetWindowFocusCallback(window, windowFocus);
			glfwSetWindowIconifyCallback(window, windowIconify);
			glfwSetKeyCallback(window, key);
			glfwSetCharCallback(window, character);
			glfwSetMouseButtonCallback(window, mouseButton);
			glfwSetCursorPosCallback(window, cursorPos);
			glfwSetCursorEnterCallback(window, cursorEnter);
			glfwSetScrollCallback(window, scroll);
		}
		return (jlong)window;
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw_glfwCreateWindowJni(JNIEnv* env, jclass clazz, jint width, jint height, jstring obj_title, jlong monitor, jlong share) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwCreateWindowJni(env, clazz, width, height, obj_title, monitor, share, title);

	env->ReleaseStringUTFChars(obj_title, title);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwDestroyWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:650

		glfwDestroyWindow((GLFWwindow*)window);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwWindowShouldClose(JNIEnv* env, jclass clazz, jlong window) {


//@line:654

		return GL_TRUE == glfwWindowShouldClose((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowShouldClose(JNIEnv* env, jclass clazz, jlong window, jint value) {


//@line:658

		glfwSetWindowShouldClose((GLFWwindow*)window, value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowTitle(JNIEnv* env, jclass clazz, jlong window, jstring obj_title) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);


//@line:662

		glfwSetWindowTitle((GLFWwindow*)window, title);
	
	env->ReleaseStringUTFChars(obj_title, title);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowPos(JNIEnv* env, jclass clazz, jlong window, jint x, jint y) {


//@line:666

		glfwSetWindowPos((GLFWwindow*)window, x, y);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowX(JNIEnv* env, jclass clazz, jlong window) {


//@line:670

		int x = 0;
		int y = 0;
		glfwGetWindowPos((GLFWwindow*)window, &x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowY(JNIEnv* env, jclass clazz, jlong window) {


//@line:677

		int x = 0;
		int y = 0;
		glfwGetWindowPos((GLFWwindow*)window, &x, &y);
		return y;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowWidth(JNIEnv* env, jclass clazz, jlong window) {


//@line:684

		int width = 0;
		int height = 0;
		glfwGetWindowSize((GLFWwindow*)window, &width, &height);
		return width;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowHeight(JNIEnv* env, jclass clazz, jlong window) {


//@line:691

		int width = 0;
		int height = 0;
		glfwGetWindowSize((GLFWwindow*)window, &width, &height);
		return height;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowSize(JNIEnv* env, jclass clazz, jlong window, jint width, jint height) {


//@line:698

		glfwSetWindowSize((GLFWwindow*)window, width, height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwIconifyWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:702

		glfwIconifyWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwRestoreWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:706

		glfwRestoreWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwHideWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:710

		glfwHideWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwShowWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:714

		glfwShowWindow((GLFWwindow*)window);
	

}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowMonitor(JNIEnv* env, jclass clazz, jlong window) {


//@line:718

		return (jlong)glfwGetWindowMonitor((GLFWwindow*)window);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowParam(JNIEnv* env, jclass clazz, jlong window, jint param) {


//@line:722

		return glfwGetWindowParam((GLFWwindow*)window, param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwPollEventsJni(JNIEnv* env, jclass clazz, jobject javaCallback) {


//@line:740

		callback = javaCallback;
		staticEnv = env;
		glfwPollEvents();
		callback = 0;
		staticEnv = 0;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwWaitEventsJni(JNIEnv* env, jclass clazz, jobject javaCallback) {


//@line:752

		callback = javaCallback;
		staticEnv = env;
		glfwWaitEvents();
		callback = 0;
		staticEnv = 0;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode) {


//@line:760

		return glfwGetInputMode((GLFWwindow*)window, mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode, jint value) {


//@line:764

		glfwSetInputMode((GLFWwindow*)window, mode, value);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetKey(JNIEnv* env, jclass clazz, jlong window, jint key) {


//@line:768

		return glfwGetKey((GLFWwindow*)window, key) == GLFW_PRESS;
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMouseButton(JNIEnv* env, jclass clazz, jlong window, jint button) {


//@line:772

		return glfwGetMouseButton((GLFWwindow*)window, button) == GLFW_PRESS;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetCursorPosX(JNIEnv* env, jclass clazz, jlong window) {


//@line:776

		int x = 0;
		int y = 0;
		glfwGetCursorPos((GLFWwindow*)window, &x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetCursorPosY(JNIEnv* env, jclass clazz, jlong window) {


//@line:783

		int x = 0;
		int y = 0;
		glfwGetCursorPos((GLFWwindow*)window, &x, &y);
		return y;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetCursorPos(JNIEnv* env, jclass clazz, jlong window, jint x, jint y) {


//@line:790

		glfwSetCursorPos((GLFWwindow*)window, x, y);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickParam(JNIEnv* env, jclass clazz, jint joy, jint param) {


//@line:794

		return glfwGetJoystickParam(joy, param);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickAxes
(JNIEnv* env, jclass clazz, jint joy, jfloatArray obj_axes, float* axes) {

//@line:798

		return glfwGetJoystickAxes(joy, axes, env->GetArrayLength(obj_axes));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickAxes(JNIEnv* env, jclass clazz, jint joy, jfloatArray obj_axes) {
	float* axes = (float*)env->GetPrimitiveArrayCritical(obj_axes, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickAxes(env, clazz, joy, obj_axes, axes);

	env->ReleasePrimitiveArrayCritical(obj_axes, axes, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons
(JNIEnv* env, jclass clazz, jint joy, jbyteArray obj_buttons, char* buttons) {

//@line:802

		return glfwGetJoystickButtons(joy, (unsigned char*)buttons, env->GetArrayLength(obj_buttons));
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons(JNIEnv* env, jclass clazz, jint joy, jbyteArray obj_buttons) {
	char* buttons = (char*)env->GetPrimitiveArrayCritical(obj_buttons, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons(env, clazz, joy, obj_buttons, buttons);

	env->ReleasePrimitiveArrayCritical(obj_buttons, buttons, 0);

	return JNI_returnValue;
}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickName(JNIEnv* env, jclass clazz, jint joy) {


//@line:806

		return env->NewStringUTF(glfwGetJoystickName(joy));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetClipboardString(JNIEnv* env, jclass clazz, jlong window, jstring obj_string) {
	char* string = (char*)env->GetStringUTFChars(obj_string, 0);


//@line:810

		glfwSetClipboardString((GLFWwindow*)window, string);
	
	env->ReleaseStringUTFChars(obj_string, string);

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetClipboardString(JNIEnv* env, jclass clazz, jlong window) {


//@line:814

		return env->NewStringUTF(glfwGetClipboardString((GLFWwindow*)window));
	

}

JNIEXPORT jdouble JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetTime(JNIEnv* env, jclass clazz) {


//@line:818

		return glfwGetTime();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetTime(JNIEnv* env, jclass clazz, jdouble time) {


//@line:822

		glfwSetTime(time);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwMakeContextCurrent(JNIEnv* env, jclass clazz, jlong window) {


//@line:826

		glfwMakeContextCurrent((GLFWwindow*)window);
	

}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetCurrentContext(JNIEnv* env, jclass clazz) {


//@line:830

		return (jlong)glfwGetCurrentContext();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSwapBuffers(JNIEnv* env, jclass clazz, jlong window) {


//@line:834

		glfwSwapBuffers((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSwapInterval(JNIEnv* env, jclass clazz, jint interval) {


//@line:838

		glfwSwapInterval(interval);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported
(JNIEnv* env, jclass clazz, jstring obj_extension, char* extension) {

//@line:842

		return glfwExtensionSupported(extension) == GL_TRUE;
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported(JNIEnv* env, jclass clazz, jstring obj_extension) {
	char* extension = (char*)env->GetStringUTFChars(obj_extension, 0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported(env, clazz, obj_extension, extension);

	env->ReleaseStringUTFChars(obj_extension, extension);

	return JNI_returnValue;
}

