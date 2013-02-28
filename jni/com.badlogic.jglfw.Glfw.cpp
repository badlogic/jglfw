#include <com.badlogic.jglfw.Glfw.h>

//@line:170
 
	#include <GL/glfw.h>
	#include <GL/glext.h>
	JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwInit(JNIEnv* env, jclass clazz) {


//@line:175

		return glfwInit() == GL_TRUE;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwTerminate(JNIEnv* env, jclass clazz) {


//@line:179

		glfwTerminate();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVersionJni(JNIEnv* env, jclass clazz, jintArray obj_version) {
	int* version = (int*)env->GetPrimitiveArrayCritical(obj_version, 0);


//@line:189
			
		version[0] = GLFW_VERSION_MAJOR;
		version[1] = GLFW_VERSION_MINOR;
		version[2] = GLFW_VERSION_REVISION;
	
	env->ReleasePrimitiveArrayCritical(obj_version, version, 0);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwOpenWindow(JNIEnv* env, jclass clazz, jint width, jint height, jint redBits, jint greenBits, jint blueBits, jint alphaBits, jint depthBits, jint stencilBits, jint mode) {


//@line:195

		glfwOpenWindow(width, height, redBits, greenBits, blueBits, alphaBits, depthBits, stencilBits, mode);				
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwOpenWindowHint(JNIEnv* env, jclass clazz, jint target, jint hint) {


//@line:199

		glfwOpenWindowHint(target, hint);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwCloseWindow(JNIEnv* env, jclass clazz) {


//@line:203

		glfwCloseWindow();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowTitle(JNIEnv* env, jclass clazz, jstring obj_title) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);


//@line:208

		glfwSetWindowTitle(title);
	
	env->ReleaseStringUTFChars(obj_title, title);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowSize(JNIEnv* env, jclass clazz, jint width, jint height) {


//@line:212

		glfwSetWindowSize(width, height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowPos(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:216

		glfwSetWindowPos(x, y);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowSizeWidth(JNIEnv* env, jclass clazz) {


//@line:220

		int width, height;
		glfwGetWindowSize(&width, &height);
		return width;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowSizeHeight(JNIEnv* env, jclass clazz) {


//@line:226

		int width, height;
		glfwGetWindowSize(&width, &height);
		return height;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwIconifyWindow(JNIEnv* env, jclass clazz) {


//@line:232

		glfwIconifyWindow();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwRestoreWindow(JNIEnv* env, jclass clazz) {


//@line:236

		glfwRestoreWindow();
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowParam(JNIEnv* env, jclass clazz, jint param) {


//@line:240

		return glfwGetWindowParam(param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSwapBuffers(JNIEnv* env, jclass clazz) {


//@line:244

		glfwSwapBuffers();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSwapInterval(JNIEnv* env, jclass clazz, jint interval) {


//@line:248

		glfwSwapInterval(interval);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni
(JNIEnv* env, jclass clazz, jintArray obj_modes, int* modes) {

//@line:268

		GLFWvidmode vidModes[200];
		int numModes = glfwGetVideoModes(vidModes, 200);
		for(int i = 0, j = 0; i < numModes; i++) {
			modes[j++] = vidModes[i].Width;
			modes[j++] = vidModes[i].Height;
			modes[j++] = vidModes[i].RedBits;
			modes[j++] = vidModes[i].GreenBits;
			modes[j++] = vidModes[i].BlueBits;
		}
		return numModes;
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni(JNIEnv* env, jclass clazz, jintArray obj_modes) {
	int* modes = (int*)env->GetPrimitiveArrayCritical(obj_modes, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetVideoModesJni(env, clazz, obj_modes, modes);

	env->ReleasePrimitiveArrayCritical(obj_modes, modes, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetDesktopModeJni(JNIEnv* env, jclass clazz, jintArray obj_buffer) {
	int* buffer = (int*)env->GetPrimitiveArrayCritical(obj_buffer, 0);


//@line:293

		GLFWvidmode mode;
		glfwGetDesktopMode(&mode);
		buffer[0] = mode.Width;
		buffer[1] = mode.Height;
		buffer[2] = mode.RedBits;
		buffer[3] = mode.GreenBits;
		buffer[4] = mode.BlueBits;
	
	env->ReleasePrimitiveArrayCritical(obj_buffer, buffer, 0);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwPollEvents(JNIEnv* env, jclass clazz) {


//@line:303

		glfwPollEvents();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwWaitEvents(JNIEnv* env, jclass clazz) {


//@line:307

		glfwWaitEvents();
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetKey(JNIEnv* env, jclass clazz, jint key) {


//@line:311

		return glfwGetKey(key) == GLFW_PRESS;
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMouseButton(JNIEnv* env, jclass clazz, jint button) {


//@line:315

		return glfwGetMouseButton(button) == GLFW_PRESS;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMousePosX(JNIEnv* env, jclass clazz) {


//@line:319

		int x, y;
		glfwGetMousePos(&x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMousePosY(JNIEnv* env, jclass clazz) {


//@line:325

		int x, y;
		glfwGetMousePos(&x, &y);
		return y;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetMousePos(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:331

		glfwSetMousePos(x, y);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetMouseWheel(JNIEnv* env, jclass clazz) {


//@line:335

		return glfwGetMouseWheel();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetMouseWheel(JNIEnv* env, jclass clazz, jint pos) {


//@line:339

		glfwSetMouseWheel(pos);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowRefreshCallback(JNIEnv* env, jclass clazz) {


//@line:343

	  // FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowCloseCallback(JNIEnv* env, jclass clazz) {


//@line:347

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowSizeCallback(JNIEnv* env, jclass clazz) {


//@line:351

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetKeyCallback(JNIEnv* env, jclass clazz) {


//@line:355

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetCharCallback(JNIEnv* env, jclass clazz) {


//@line:359

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetMouseButtonCallback(JNIEnv* env, jclass clazz) {


//@line:363

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetMousePosCallback(JNIEnv* env, jclass clazz) {


//@line:367

	// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetMouseWheelCallback(JNIEnv* env, jclass clazz) {


//@line:371

	// FIXME
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickParam(JNIEnv* env, jclass clazz, jint joy, jint param) {


//@line:375

		return glfwGetJoystickParam(joy, param);
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickPos
(JNIEnv* env, jclass clazz, jint joy, jfloatArray obj_pos, float* pos) {

//@line:379

		jsize len = env->GetArrayLength(obj_pos);
		return glfwGetJoystickPos(joy, pos, len);
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickPos(JNIEnv* env, jclass clazz, jint joy, jfloatArray obj_pos) {
	float* pos = (float*)env->GetPrimitiveArrayCritical(obj_pos, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickPos(env, clazz, joy, obj_pos, pos);

	env->ReleasePrimitiveArrayCritical(obj_pos, pos, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons
(JNIEnv* env, jclass clazz, jint joy, jbyteArray obj_buttons, char* buttons) {

//@line:384

		jsize len = env->GetArrayLength(obj_buttons);
		return glfwGetJoystickButtons(joy, (unsigned char*)buttons, len);
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons(JNIEnv* env, jclass clazz, jint joy, jbyteArray obj_buttons) {
	char* buttons = (char*)env->GetPrimitiveArrayCritical(obj_buttons, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwGetJoystickButtons(env, clazz, joy, obj_buttons, buttons);

	env->ReleasePrimitiveArrayCritical(obj_buttons, buttons, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported
(JNIEnv* env, jclass clazz, jstring obj_extension, char* extension) {

//@line:389

		return glfwExtensionSupported(extension) == GL_TRUE;
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported(JNIEnv* env, jclass clazz, jstring obj_extension) {
	char* extension = (char*)env->GetStringUTFChars(obj_extension, 0);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw_glfwExtensionSupported(env, clazz, obj_extension, extension);

	env->ReleaseStringUTFChars(obj_extension, extension);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwEnable(JNIEnv* env, jclass clazz, jint token) {


//@line:393

		glfwEnable(token);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwDisable(JNIEnv* env, jclass clazz, jint token) {


//@line:397

		glfwDisable(token);
	

}

