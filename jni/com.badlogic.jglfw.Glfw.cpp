#include <com.badlogic.jglfw.Glfw.h>

//@line:167
 
	#include <GL/glfw.h>	
	JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_Glfw_glfwInit(JNIEnv* env, jclass clazz) {


//@line:171

		return glfwInit() == GL_TRUE;
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwTerminate(JNIEnv* env, jclass clazz) {


//@line:175

		glfwTerminate();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetVersionJni(JNIEnv* env, jclass clazz, jintArray obj_version) {
	int* version = (int*)env->GetPrimitiveArrayCritical(obj_version, 0);


//@line:185
			
		version[0] = GLFW_VERSION_MAJOR;
		version[1] = GLFW_VERSION_MINOR;
		version[2] = GLFW_VERSION_REVISION;
	
	env->ReleasePrimitiveArrayCritical(obj_version, version, 0);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwOpenWindow(JNIEnv* env, jclass clazz, jint width, jint height, jint redBits, jint greenBits, jint blueBits, jint alphaBits, jint depthBits, jint stencilBits, jint mode) {


//@line:191

		glfwOpenWindow(width, height, redBits, greenBits, blueBits, alphaBits, depthBits, stencilBits, mode);				
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwOpenWindowHint(JNIEnv* env, jclass clazz, jint target, jint hint) {


//@line:195

		glfwOpenWindowHint(target, hint);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwCloseWindow(JNIEnv* env, jclass clazz) {


//@line:199

		glfwCloseWindow();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowCloseCallback(JNIEnv* env, jclass clazz) {


//@line:203

		// FIXME
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowTitle(JNIEnv* env, jclass clazz, jstring obj_title) {
	char* title = (char*)env->GetStringUTFChars(obj_title, 0);


//@line:207

		glfwSetWindowTitle(title);
	
	env->ReleaseStringUTFChars(obj_title, title);

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowSize(JNIEnv* env, jclass clazz, jint width, jint height) {


//@line:211

		glfwSetWindowSize(width, height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwSetWindowPos(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:215

		glfwSetWindowPos(x, y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_Glfw_glfwGetWindowSize(JNIEnv* env, jclass clazz, jintArray obj_size) {
	int* size = (int*)env->GetPrimitiveArrayCritical(obj_size, 0);


//@line:222

		glfwGetWindowSize(&size[0], &size[1]);
	
	env->ReleasePrimitiveArrayCritical(obj_size, size, 0);

}

