#include <com.badlogic.jglfw.Glfw3.h>

//@line:261
 
	#include <GL/glfw3.h>
	JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw3_glfwInit(JNIEnv* env, jclass clazz) {


//@line:265

		return glfwInit() == GL_TRUE;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwTerminate(JNIEnv* env, jclass clazz) {


//@line:269

		glfwTerminate();
	

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetVersionString(JNIEnv* env, jclass clazz) {


//@line:277

		return env->NewStringUTF(glfwGetVersionString());
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetErrorCallback(JNIEnv* env, jclass clazz) {


//@line:281

		// FIXME
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorsJni
(JNIEnv* env, jclass clazz, jlongArray obj_monitors, long long* monitors) {

//@line:293

		int count = 0;
		GLFWmonitor** mons = glfwGetMonitors(&count);
		if(!mons) return 0;
		
		for(int i = 0; i < count; i++) {
			monitors[i] = (jlong)mons[i];
		}
		return count;
	
}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorsJni(JNIEnv* env, jclass clazz, jlongArray obj_monitors) {
	long long* monitors = (long long*)env->GetPrimitiveArrayCritical(obj_monitors, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorsJni(env, clazz, obj_monitors, monitors);

	env->ReleasePrimitiveArrayCritical(obj_monitors, monitors, 0);

	return JNI_returnValue;
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetPrimaryMonitor(JNIEnv* env, jclass clazz) {


//@line:304

		return (jlong)glfwGetPrimaryMonitor();
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorX(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:308

		int x = 0;
		int y = 0;
		glfwGetMonitorPos((GLFWmonitor*)monitor, &x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorY(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:315

		int x = 0;
		int y = 0;
		glfwGetMonitorPos((GLFWmonitor*)monitor, &x, &y);
		return y;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorPhysicalWidth(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:322

		int width = 0;
		int height = 0;
		glfwGetMonitorPhysicalSize((GLFWmonitor*)monitor, &width, &height);
		return width;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorPhysicalHeight(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:329

		int width = 0;
		int height = 0;
		glfwGetMonitorPhysicalSize((GLFWmonitor*)monitor, &width, &height);
		return height;
	

}

JNIEXPORT jstring JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMonitorName(JNIEnv* env, jclass clazz, jlong monitor) {


//@line:336

		return env->NewStringUTF(glfwGetMonitorName((GLFWmonitor*)monitor));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetMonitorCallback(JNIEnv* env, jclass clazz) {


//@line:340

		// FIXME
	

}

static inline jint wrapped_Java_com_badlogic_jglfw_Glfw3_glfwGetVideoModesJni
(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_modes, int* modes) {

//@line:360

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

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetVideoModesJni(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_modes) {
	int* modes = (int*)env->GetPrimitiveArrayCritical(obj_modes, 0);

	jint JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw3_glfwGetVideoModesJni(env, clazz, monitor, obj_modes, modes);

	env->ReleasePrimitiveArrayCritical(obj_modes, modes, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetVideoModeJni(JNIEnv* env, jclass clazz, jlong monitor, jintArray obj_buffer) {
	int* buffer = (int*)env->GetPrimitiveArrayCritical(obj_buffer, 0);


//@line:385

		GLFWvidmode mode = glfwGetVideoMode((GLFWmonitor*)monitor);
		buffer[0] = mode.width;
		buffer[1] = mode.height;
		buffer[2] = mode.redBits;
		buffer[3] = mode.greenBits;
		buffer[4] = mode.blueBits;
	
	env->ReleasePrimitiveArrayCritical(obj_buffer, buffer, 0);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetGamma(JNIEnv* env, jclass clazz, jlong monitor, jfloat gamma) {


//@line:394

		glfwSetGamma((GLFWmonitor*)monitor, gamma);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetGammaRamp(JNIEnv* env, jclass clazz) {


//@line:398

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetGammaRamp(JNIEnv* env, jclass clazz) {


//@line:402

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwDefaultWindowHints(JNIEnv* env, jclass clazz) {


//@line:406

		glfwDefaultWindowHints();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwWindowHint(JNIEnv* env, jclass clazz, jint target, jint hint) {


//@line:410

		glfwWindowHint(target, hint);
	

}

static inline jlong wrapped_Java_com_badlogic_jglfw_Glfw3_glfwCreateWindow
(JNIEnv* env, jclass clazz, jint width, jint height, jstring obj_title, jlong monitor, jlong share, char* title) {

//@line:414

		return (jlong)glfwCreateWindow(width, height, title, (GLFWmonitor*)monitor, (GLFWwindow*)share);
	
}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw3_glfwCreateWindow(JNIEnv* env, jclass clazz, jint width, jint height, jstring obj_title, jlong monitor, jlong share) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);

	jlong JNI_returnValue = wrapped_Java_com_badlogic_jglfw_Glfw3_glfwCreateWindow(env, clazz, width, height, obj_title, monitor, share, title);

	env->ReleaseStringUTFChars(obj_title, title);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwDestroyWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:418

		glfwDestroyWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowShouldClose(JNIEnv* env, jclass clazz, jlong window, jint value) {


//@line:422

		glfwSetWindowShouldClose((GLFWwindow*)window, value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowTitle(JNIEnv* env, jclass clazz, jlong window, jstring obj_title) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);


//@line:426

		glfwSetWindowTitle((GLFWwindow*)window, title);
	
	env->ReleaseStringUTFChars(obj_title, title);

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowX(JNIEnv* env, jclass clazz, jlong window) {


//@line:430

		int x = 0;
		int y = 0;
		glfwGetWindowPos((GLFWwindow*)window, &x, &y);
		return x;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowY(JNIEnv* env, jclass clazz, jlong window) {


//@line:437

		int x = 0;
		int y = 0;
		glfwGetWindowPos((GLFWwindow*)window, &x, &y);
		return y;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowWidth(JNIEnv* env, jclass clazz, jlong window) {


//@line:444

		int width = 0;
		int height = 0;
		glfwGetWindowSize((GLFWwindow*)window, &width, &height);
		return width;
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowHeight(JNIEnv* env, jclass clazz, jlong window) {


//@line:451

		int width = 0;
		int height = 0;
		glfwGetWindowSize((GLFWwindow*)window, &width, &height);
		return height;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowSize(JNIEnv* env, jclass clazz, jlong window, jint width, jint height) {


//@line:458

		glfwSetWindowSize((GLFWwindow*)window, width, height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwIconifyWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:462

		glfwIconifyWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwRestoreWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:466

		glfwRestoreWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwHideWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:470

		glfwHideWindow((GLFWwindow*)window);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwShowWindow(JNIEnv* env, jclass clazz, jlong window) {


//@line:474

		glfwShowWindow((GLFWwindow*)window);
	

}

JNIEXPORT jlong JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowMonitor(JNIEnv* env, jclass clazz, jlong window) {


//@line:478

		return (jlong)glfwGetWindowMonitor((GLFWwindow*)window);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowParam(JNIEnv* env, jclass clazz, jlong window, jint param) {


//@line:482

		return glfwGetWindowParam((GLFWwindow*)window, param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowUserPointer(JNIEnv* env, jclass clazz) {


//@line:486

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetWindowUserPointer(JNIEnv* env, jclass clazz) {


//@line:490

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowPosCallback(JNIEnv* env, jclass clazz) {


//@line:494

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowSizeCallback(JNIEnv* env, jclass clazz) {


//@line:498

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowCloseCallback(JNIEnv* env, jclass clazz) {


//@line:502

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowRefreshCallback(JNIEnv* env, jclass clazz) {


//@line:507

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowFocusCallback(JNIEnv* env, jclass clazz) {


//@line:511

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetWindowIconifyCallback(JNIEnv* env, jclass clazz) {


//@line:515

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwPollEvents(JNIEnv* env, jclass clazz) {


//@line:519

		glfwPollEvents();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwWaitEvents(JNIEnv* env, jclass clazz) {


//@line:523

		glfwWaitEvents();
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode) {


//@line:527

		return glfwGetInputMode((GLFWwindow*)window, mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSetInputMode(JNIEnv* env, jclass clazz, jlong window, jint mode, jint value) {


//@line:531

		glfwSetInputMode((GLFWwindow*)window, mode, value);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetKey(JNIEnv* env, jclass clazz, jlong window, jint key) {


//@line:535

		return glfwGetKey((GLFWwindow*)window, key) == GLFW_PRESS;
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw3_glfwGetMouseButton(JNIEnv* env, jclass clazz, jlong window, jint button) {


//@line:539

		return glfwGetMouseButton((GLFWwindow*)window, button) == GLFW_PRESS;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw3_glfwSwapBuffers(JNIEnv* env, jclass clazz, jlong window) {


//@line:543

		glfwSwapBuffers((GLFWwindow*)window);
	

}

