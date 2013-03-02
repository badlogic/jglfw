#include <com.badlogic.jglfw.gl.GL.h>

//@line:4748

	#include <GL/glfw3.h>
	#include <GL/glext.h>
	#if defined(_WIN32)
	#ifndef APIENTRY
	#define GLEW_APIENTRY_DEFINED
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define APIENTRY __stdcall
	#  elif (_MSC_VER >= 800) || defined(_STDCALL_SUPPORTED) || defined(__BORLANDC__)
	#    define APIENTRY __stdcall
	#  else
	#    define APIENTRY
	#  endif
	#endif
	#ifndef GLAPI
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define GLAPI extern
	#  endif
	#endif

	#ifndef CALLBACK
	#define GLEW_CALLBACK_DEFINED
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define CALLBACK __attribute__ ((__stdcall__))
	#  elif (defined(_M_MRX000) || defined(_M_IX86) || defined(_M_ALPHA) || defined(_M_PPC)) && !defined(MIDL_PASS)
	#    define CALLBACK __stdcall
	#  else
	#    define CALLBACK
	#  endif
	#endif

	#ifndef WINGDIAPI
	#define GLEW_WINGDIAPI_DEFINED
	#define WINGDIAPI __declspec(dllimport)
	#endif

	#if (defined(_MSC_VER) || defined(__BORLANDC__)) && !defined(_WCHAR_T_DEFINED)
	typedef unsigned short wchar_t;
	#  define _WCHAR_T_DEFINED
	#endif

	#if !defined(_W64)
	#  if !defined(__midl) && (defined(_X86_) || defined(_M_IX86)) && defined(_MSC_VER) && _MSC_VER >= 1300
	#    define _W64 __w64
	#  else
	#    define _W64
	#  endif
	#endif
	#if !defined(_PTRDIFF_T_DEFINED) && !defined(_PTRDIFF_T_) && !defined(__MINGW64__)
	#  ifdef _WIN64
	typedef __int64 ptrdiff_t;
	#  else
	typedef _W64 int ptrdiff_t;
	#  endif
	#  define _PTRDIFF_T_DEFINED
	#  define _PTRDIFF_T_
	#endif

	#ifndef GLAPI
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#    define GLAPI extern
	#  else
	#    define GLAPI WINGDIAPI
	#  endif
	#endif

	#ifndef GLAPIENTRY
	#define GLAPIENTRY APIENTRY
	#endif

	#ifndef GLEWAPIENTRY
	#define GLEWAPIENTRY APIENTRY
	#endif

	#ifdef GLEW_STATIC
	#  define GLEWAPI extern
	#else
	#  ifdef GLEW_BUILD
	#    define GLEWAPI extern __declspec(dllexport)
	#  else
	#    define GLEWAPI extern __declspec(dllimport)
	#  endif
	#endif

	#else

	#include <stddef.h>

	#if (defined(__sgi) || defined(__sun)) && !defined(__GNUC__)
	#include <inttypes.h>
	#else
	#include <stdint.h>
	#endif

	#define GLEW_APIENTRY_DEFINED
	#define APIENTRY

	#ifdef GLEW_STATIC
	#  define GLEWAPI extern
	#else
	#  if defined(__GNUC__) && __GNUC__>=4
	#   define GLEWAPI extern __attribute__ ((visibility("default")))
	#  elif defined(__SUNPRO_C) || defined(__SUNPRO_CC)
	#   define GLEWAPI extern __global
	#  else
	#   define GLEWAPI extern
	#  endif
	#endif

	#ifndef GLAPI
	#define GLAPI extern
	#endif

	#ifndef GLAPIENTRY
	#define GLAPIENTRY
	#endif

	#ifndef GLEWAPIENTRY
	#define GLEWAPIENTRY
	#endif

	#endif

	typedef unsigned int GLenum;
	typedef unsigned int GLbitfield;
	typedef unsigned int GLuint;
	typedef int GLint;
	typedef int GLsizei;
	typedef unsigned char GLboolean;
	typedef signed char GLbyte;
	typedef short GLshort;
	typedef unsigned char GLubyte;
	typedef unsigned short GLushort;
	typedef unsigned long GLulong;
	typedef float GLfloat;
	typedef float GLclampf;
	typedef double GLdouble;
	typedef double GLclampd;
	typedef void GLvoid;
	#if defined(_MSC_VER) && _MSC_VER < 1400
	typedef __int64 GLint64EXT;
	typedef unsigned __int64 GLuint64EXT;
	#elif defined(_MSC_VER) || defined(__BORLANDC__)
	typedef signed long long GLint64EXT;
	typedef unsigned long long GLuint64EXT;
	#else
	#  if defined(__MINGW32__) || defined(__CYGWIN__)
	#include <inttypes.h>
	#  endif
	typedef int64_t GLint64EXT;
	typedef uint64_t GLuint64EXT;
	#endif
	typedef GLint64EXT  GLint64;
	typedef GLuint64EXT GLuint64;
	typedef struct __GLsync *GLsync;

	typedef char GLchar;
JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glAccum(JNIEnv* env, jclass clazz, jint op, jfloat value) {


//@line:4906

		glAccum((GLenum)op, (GLfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glAlphaFunc(JNIEnv* env, jclass clazz, jint func, jfloat ref) {


//@line:4910

		glAlphaFunc((GLenum)func, (GLclampf)ref);
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident
(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_residences, jint residencesByteOffset, unsigned char* textures, unsigned char* residences) {

//@line:4914

		return (GLboolean)glAreTexturesResident((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (GLboolean*)(residences + residencesByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_residences, jint residencesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);
	unsigned char* residences = (unsigned char*)env->GetDirectBufferAddress(obj_residences);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident(env, clazz, n, obj_textures, texturesByteOffset, obj_residences, residencesByteOffset, textures, residences);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glArrayElement(JNIEnv* env, jclass clazz, jint i) {


//@line:4918

		glArrayElement((GLint)i);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBegin(JNIEnv* env, jclass clazz, jint mode) {


//@line:4922

		glBegin((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:4926

		glBindTexture((GLenum)target, (GLuint)texture);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBitmap(JNIEnv* env, jclass clazz, jint width, jint height, jfloat xorig, jfloat yorig, jfloat xmove, jfloat ymove, jobject obj_bitmap, jint bitmapByteOffset) {
	unsigned char* bitmap = (unsigned char*)env->GetDirectBufferAddress(obj_bitmap);


//@line:4930

		glBitmap((GLsizei)width, (GLsizei)height, (GLfloat)xorig, (GLfloat)yorig, (GLfloat)xmove, (GLfloat)ymove, (const GLubyte*)(bitmap + bitmapByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:4934

		glBlendFunc((GLenum)sfactor, (GLenum)dfactor);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCallList(JNIEnv* env, jclass clazz, jint list) {


//@line:4938

		glCallList((GLuint)list);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCallLists(JNIEnv* env, jclass clazz, jint n, jint type, jobject obj_lists, jint listsByteOffset) {
	unsigned char* lists = (unsigned char*)env->GetDirectBufferAddress(obj_lists);


//@line:4942

		glCallLists((GLsizei)n, (GLenum)type, (const GLvoid*)(lists + listsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:4946

		glClear((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearAccum(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:4950

		glClearAccum((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:4954

		glClearColor((GLclampf)red, (GLclampf)green, (GLclampf)blue, (GLclampf)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearDepth(JNIEnv* env, jclass clazz, jdouble depth) {


//@line:4958

		glClearDepth((GLclampd)depth);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearIndex(JNIEnv* env, jclass clazz, jfloat c) {


//@line:4962

		glClearIndex((GLfloat)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:4966

		glClearStencil((GLint)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClipPlane(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint equationByteOffset) {
	unsigned char* equation = (unsigned char*)env->GetDirectBufferAddress(obj_equation);


//@line:4970

		glClipPlane((GLenum)plane, (const GLdouble*)(equation + equationByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3b(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue) {


//@line:4974

		glColor3b((GLbyte)red, (GLbyte)green, (GLbyte)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:4978

		glColor3bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3d(JNIEnv* env, jclass clazz, jdouble red, jdouble green, jdouble blue) {


//@line:4982

		glColor3d((GLdouble)red, (GLdouble)green, (GLdouble)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:4986

		glColor3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue) {


//@line:4990

		glColor3f((GLfloat)red, (GLfloat)green, (GLfloat)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:4994

		glColor3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3i(JNIEnv* env, jclass clazz, jint red, jint green, jint blue) {


//@line:4998

		glColor3i((GLint)red, (GLint)green, (GLint)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5002

		glColor3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3s(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue) {


//@line:5006

		glColor3s((GLshort)red, (GLshort)green, (GLshort)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5010

		glColor3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue) {


//@line:5014

		glColor3ub((GLubyte)red, (GLubyte)green, (GLubyte)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ubv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5018

		glColor3ubv((const GLubyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ui(JNIEnv* env, jclass clazz, jint red, jint green, jint blue) {


//@line:5022

		glColor3ui((GLuint)red, (GLuint)green, (GLuint)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3uiv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5026

		glColor3uiv((const GLuint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3us(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue) {


//@line:5030

		glColor3us((GLushort)red, (GLushort)green, (GLushort)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3usv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5034

		glColor3usv((const GLushort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4b(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:5038

		glColor4b((GLbyte)red, (GLbyte)green, (GLbyte)blue, (GLbyte)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5042

		glColor4bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4d(JNIEnv* env, jclass clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha) {


//@line:5046

		glColor4d((GLdouble)red, (GLdouble)green, (GLdouble)blue, (GLdouble)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5050

		glColor4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:5054

		glColor4f((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5058

		glColor4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4i(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:5062

		glColor4i((GLint)red, (GLint)green, (GLint)blue, (GLint)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5066

		glColor4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4s(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {


//@line:5070

		glColor4s((GLshort)red, (GLshort)green, (GLshort)blue, (GLshort)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5074

		glColor4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:5078

		glColor4ub((GLubyte)red, (GLubyte)green, (GLubyte)blue, (GLubyte)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ubv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5082

		glColor4ubv((const GLubyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ui(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:5086

		glColor4ui((GLuint)red, (GLuint)green, (GLuint)blue, (GLuint)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4uiv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5090

		glColor4uiv((const GLuint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4us(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {


//@line:5094

		glColor4us((GLushort)red, (GLushort)green, (GLushort)blue, (GLushort)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4usv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5098

		glColor4usv((const GLushort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:5102

		glColorMask((GLboolean)red, (GLboolean)green, (GLboolean)blue, (GLboolean)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorMaterial(JNIEnv* env, jclass clazz, jint face, jint mode) {


//@line:5106

		glColorMaterial((GLenum)face, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:5110

		glColorPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint type) {


//@line:5114

		glCopyPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)type);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint border) {


//@line:5118

		glCopyTexImage1D((GLenum)target, (GLint)level, (GLenum)internalFormat, (GLint)x, (GLint)y, (GLsizei)width, (GLint)border);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint height, jint border) {


//@line:5122

		glCopyTexImage2D((GLenum)target, (GLint)level, (GLenum)internalFormat, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLint)border);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexSubImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width) {


//@line:5126

		glCopyTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)x, (GLint)y, (GLsizei)width);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:5130

		glCopyTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:5134

		glCullFace((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDeleteLists(JNIEnv* env, jclass clazz, jint list, jint range) {


//@line:5138

		glDeleteLists((GLuint)list, (GLsizei)range);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDeleteTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);


//@line:5142

		glDeleteTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:5146

		glDepthFunc((GLenum)func);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:5150

		glDepthMask((GLboolean)flag);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthRange(JNIEnv* env, jclass clazz, jdouble zNear, jdouble zFar) {


//@line:5154

		glDepthRange((GLclampd)zNear, (GLclampd)zFar);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:5158

		glDisable((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDisableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:5162

		glDisableClientState((GLenum)array);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:5166

		glDrawArrays((GLenum)mode, (GLint)first, (GLsizei)count);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawBuffer(JNIEnv* env, jclass clazz, jint mode) {


//@line:5170

		glDrawBuffer((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawElements(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint indicesByteOffset) {
	unsigned char* indices = (unsigned char*)env->GetDirectBufferAddress(obj_indices);


//@line:5174

		glDrawElements((GLenum)mode, (GLsizei)count, (GLenum)type, (const GLvoid*)(indices + indicesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawPixels(JNIEnv* env, jclass clazz, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:5178

		glDrawPixels((GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlag(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:5182

		glEdgeFlag((GLboolean)flag);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlagPointer(JNIEnv* env, jclass clazz, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:5186

		glEdgeFlagPointer((GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlagv(JNIEnv* env, jclass clazz, jobject obj_flag, jint flagByteOffset) {
	unsigned char* flag = (unsigned char*)env->GetDirectBufferAddress(obj_flag);


//@line:5190

		glEdgeFlagv((const GLboolean*)(flag + flagByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:5194

		glEnable((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnableClientState(JNIEnv* env, jclass clazz, jint array) {


//@line:5198

		glEnableClientState((GLenum)array);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnd(JNIEnv* env, jclass clazz) {


//@line:5202

		glEnd();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEndList(JNIEnv* env, jclass clazz) {


//@line:5206

		glEndList();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1d(JNIEnv* env, jclass clazz, jdouble u) {


//@line:5210

		glEvalCoord1d((GLdouble)u);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1dv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:5214

		glEvalCoord1dv((const GLdouble*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1f(JNIEnv* env, jclass clazz, jfloat u) {


//@line:5218

		glEvalCoord1f((GLfloat)u);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1fv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:5222

		glEvalCoord1fv((const GLfloat*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2d(JNIEnv* env, jclass clazz, jdouble u, jdouble v) {


//@line:5226

		glEvalCoord2d((GLdouble)u, (GLdouble)v);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2dv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:5230

		glEvalCoord2dv((const GLdouble*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2f(JNIEnv* env, jclass clazz, jfloat u, jfloat v) {


//@line:5234

		glEvalCoord2f((GLfloat)u, (GLfloat)v);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2fv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:5238

		glEvalCoord2fv((const GLfloat*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalMesh1(JNIEnv* env, jclass clazz, jint mode, jint i1, jint i2) {


//@line:5242

		glEvalMesh1((GLenum)mode, (GLint)i1, (GLint)i2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalMesh2(JNIEnv* env, jclass clazz, jint mode, jint i1, jint i2, jint j1, jint j2) {


//@line:5246

		glEvalMesh2((GLenum)mode, (GLint)i1, (GLint)i2, (GLint)j1, (GLint)j2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalPoint1(JNIEnv* env, jclass clazz, jint i) {


//@line:5250

		glEvalPoint1((GLint)i);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalPoint2(JNIEnv* env, jclass clazz, jint i, jint j) {


//@line:5254

		glEvalPoint2((GLint)i, (GLint)j);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFeedbackBuffer(JNIEnv* env, jclass clazz, jint size, jint type, jobject obj_buffer, jint bufferByteOffset) {
	unsigned char* buffer = (unsigned char*)env->GetDirectBufferAddress(obj_buffer);


//@line:5258

		glFeedbackBuffer((GLsizei)size, (GLenum)type, (GLfloat*)(buffer + bufferByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFinish(JNIEnv* env, jclass clazz) {


//@line:5262

		glFinish();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFlush(JNIEnv* env, jclass clazz) {


//@line:5266

		glFlush();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:5270

		glFogf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogfv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5274

		glFogfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogi(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:5278

		glFogi((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogiv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5282

		glFogiv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:5286

		glFrontFace((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFrustum(JNIEnv* env, jclass clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble zNear, jdouble zFar) {


//@line:5290

		glFrustum((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)zNear, (GLdouble)zFar);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glGenLists(JNIEnv* env, jclass clazz, jint range) {


//@line:5294

		return (GLuint)glGenLists((GLsizei)range);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGenTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);


//@line:5298

		glGenTextures((GLsizei)n, (GLuint*)(textures + texturesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetBooleanv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5302

		glGetBooleanv((GLenum)pname, (GLboolean*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetClipPlane(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint equationByteOffset) {
	unsigned char* equation = (unsigned char*)env->GetDirectBufferAddress(obj_equation);


//@line:5306

		glGetClipPlane((GLenum)plane, (GLdouble*)(equation + equationByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetDoublev(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5310

		glGetDoublev((GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glGetError(JNIEnv* env, jclass clazz) {


//@line:5314

		return (GLenum)glGetError();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetFloatv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5318

		glGetFloatv((GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetIntegerv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5322

		glGetIntegerv((GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetLightfv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5326

		glGetLightfv((GLenum)light, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetLightiv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5330

		glGetLightiv((GLenum)light, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapdv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5334

		glGetMapdv((GLenum)target, (GLenum)query, (GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapfv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5338

		glGetMapfv((GLenum)target, (GLenum)query, (GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapiv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5342

		glGetMapiv((GLenum)target, (GLenum)query, (GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMaterialfv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5346

		glGetMaterialfv((GLenum)face, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMaterialiv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5350

		glGetMaterialiv((GLenum)face, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapfv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5354

		glGetPixelMapfv((GLenum)map, (GLfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapuiv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5358

		glGetPixelMapuiv((GLenum)map, (GLuint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapusv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5362

		glGetPixelMapusv((GLenum)map, (GLushort*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPointerv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5366

		glGetPointerv((GLenum)pname, (GLvoid**)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPolygonStipple(JNIEnv* env, jclass clazz, jobject obj_mask, jint maskByteOffset) {
	unsigned char* mask = (unsigned char*)env->GetDirectBufferAddress(obj_mask);


//@line:5370

		glGetPolygonStipple((GLubyte*)(mask + maskByteOffset));
	

}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_gl_GL_glGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:5374

		return env->NewStringUTF((const char*)glGetString((GLenum)name));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexEnvfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5378

		glGetTexEnvfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexEnviv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5382

		glGetTexEnviv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGendv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5386

		glGetTexGendv((GLenum)coord, (GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGenfv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5390

		glGetTexGenfv((GLenum)coord, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGeniv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5394

		glGetTexGeniv((GLenum)coord, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexImage(JNIEnv* env, jclass clazz, jint target, jint level, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:5398

		glGetTexImage((GLenum)target, (GLint)level, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexLevelParameterfv(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5402

		glGetTexLevelParameterfv((GLenum)target, (GLint)level, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexLevelParameteriv(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5406

		glGetTexLevelParameteriv((GLenum)target, (GLint)level, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexParameterfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5410

		glGetTexParameterfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexParameteriv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5414

		glGetTexParameteriv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:5418

		glHint((GLenum)target, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:5422

		glIndexMask((GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:5426

		glIndexPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexd(JNIEnv* env, jclass clazz, jdouble c) {


//@line:5430

		glIndexd((GLdouble)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexdv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:5434

		glIndexdv((const GLdouble*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexf(JNIEnv* env, jclass clazz, jfloat c) {


//@line:5438

		glIndexf((GLfloat)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexfv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:5442

		glIndexfv((const GLfloat*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexi(JNIEnv* env, jclass clazz, jint c) {


//@line:5446

		glIndexi((GLint)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexiv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:5450

		glIndexiv((const GLint*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexs(JNIEnv* env, jclass clazz, jshort c) {


//@line:5454

		glIndexs((GLshort)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexsv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:5458

		glIndexsv((const GLshort*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexub(JNIEnv* env, jclass clazz, jbyte c) {


//@line:5462

		glIndexub((GLubyte)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexubv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:5466

		glIndexubv((const GLubyte*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glInitNames(JNIEnv* env, jclass clazz) {


//@line:5470

		glInitNames();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glInterleavedArrays(JNIEnv* env, jclass clazz, jint format, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:5474

		glInterleavedArrays((GLenum)format, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:5478

		return (GLboolean)glIsEnabled((GLenum)cap);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsList(JNIEnv* env, jclass clazz, jint list) {


//@line:5482

		return (GLboolean)glIsList((GLuint)list);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:5486

		return (GLboolean)glIsTexture((GLuint)texture);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModelf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:5490

		glLightModelf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModelfv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5494

		glLightModelfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModeli(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:5498

		glLightModeli((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModeliv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5502

		glLightModeliv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightf(JNIEnv* env, jclass clazz, jint light, jint pname, jfloat param) {


//@line:5506

		glLightf((GLenum)light, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightfv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5510

		glLightfv((GLenum)light, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLighti(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:5514

		glLighti((GLenum)light, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightiv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5518

		glLightiv((GLenum)light, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLineStipple(JNIEnv* env, jclass clazz, jint factor, jshort pattern) {


//@line:5522

		glLineStipple((GLint)factor, (GLushort)pattern);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:5526

		glLineWidth((GLfloat)width);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glListBase(JNIEnv* env, jclass clazz, jint base) {


//@line:5530

		glListBase((GLuint)base);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadIdentity(JNIEnv* env, jclass clazz) {


//@line:5534

		glLoadIdentity();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadMatrixd(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:5538

		glLoadMatrixd((const GLdouble*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadMatrixf(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:5542

		glLoadMatrixf((const GLfloat*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadName(JNIEnv* env, jclass clazz, jint name) {


//@line:5546

		glLoadName((GLuint)name);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLogicOp(JNIEnv* env, jclass clazz, jint opcode) {


//@line:5550

		glLogicOp((GLenum)opcode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap1d(JNIEnv* env, jclass clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:5554

		glMap1d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)stride, (GLint)order, (const GLdouble*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap1f(JNIEnv* env, jclass clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:5558

		glMap1f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)stride, (GLint)order, (const GLfloat*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap2d(JNIEnv* env, jclass clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:5562

		glMap2d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)ustride, (GLint)uorder, (GLdouble)v1, (GLdouble)v2, (GLint)vstride, (GLint)vorder, (const GLdouble*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap2f(JNIEnv* env, jclass clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:5566

		glMap2f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)ustride, (GLint)uorder, (GLfloat)v1, (GLfloat)v2, (GLint)vstride, (GLint)vorder, (const GLfloat*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid1d(JNIEnv* env, jclass clazz, jint un, jdouble u1, jdouble u2) {


//@line:5570

		glMapGrid1d((GLint)un, (GLdouble)u1, (GLdouble)u2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid1f(JNIEnv* env, jclass clazz, jint un, jfloat u1, jfloat u2) {


//@line:5574

		glMapGrid1f((GLint)un, (GLfloat)u1, (GLfloat)u2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid2d(JNIEnv* env, jclass clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {


//@line:5578

		glMapGrid2d((GLint)un, (GLdouble)u1, (GLdouble)u2, (GLint)vn, (GLdouble)v1, (GLdouble)v2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid2f(JNIEnv* env, jclass clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {


//@line:5582

		glMapGrid2f((GLint)un, (GLfloat)u1, (GLfloat)u2, (GLint)vn, (GLfloat)v1, (GLfloat)v2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialf(JNIEnv* env, jclass clazz, jint face, jint pname, jfloat param) {


//@line:5586

		glMaterialf((GLenum)face, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialfv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5590

		glMaterialfv((GLenum)face, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMateriali(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:5594

		glMateriali((GLenum)face, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialiv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:5598

		glMaterialiv((GLenum)face, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMatrixMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:5602

		glMatrixMode((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMultMatrixd(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:5606

		glMultMatrixd((const GLdouble*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMultMatrixf(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:5610

		glMultMatrixf((const GLfloat*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNewList(JNIEnv* env, jclass clazz, jint list, jint mode) {


//@line:5614

		glNewList((GLuint)list, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3b(JNIEnv* env, jclass clazz, jbyte nx, jbyte ny, jbyte nz) {


//@line:5618

		glNormal3b((GLbyte)nx, (GLbyte)ny, (GLbyte)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5622

		glNormal3bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3d(JNIEnv* env, jclass clazz, jdouble nx, jdouble ny, jdouble nz) {


//@line:5626

		glNormal3d((GLdouble)nx, (GLdouble)ny, (GLdouble)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5630

		glNormal3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3f(JNIEnv* env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {


//@line:5634

		glNormal3f((GLfloat)nx, (GLfloat)ny, (GLfloat)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5638

		glNormal3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3i(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:5642

		glNormal3i((GLint)nx, (GLint)ny, (GLint)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5646

		glNormal3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3s(JNIEnv* env, jclass clazz, jshort nx, jshort ny, jshort nz) {


//@line:5650

		glNormal3s((GLshort)nx, (GLshort)ny, (GLshort)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5654

		glNormal3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormalPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:5658

		glNormalPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glOrtho(JNIEnv* env, jclass clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble zNear, jdouble zFar) {


//@line:5662

		glOrtho((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)zNear, (GLdouble)zFar);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPassThrough(JNIEnv* env, jclass clazz, jfloat token) {


//@line:5666

		glPassThrough((GLfloat)token);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapfv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5670

		glPixelMapfv((GLenum)map, (GLsizei)mapsize, (const GLfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapuiv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5674

		glPixelMapuiv((GLenum)map, (GLsizei)mapsize, (const GLuint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapusv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:5678

		glPixelMapusv((GLenum)map, (GLsizei)mapsize, (const GLushort*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelStoref(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:5682

		glPixelStoref((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:5686

		glPixelStorei((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelTransferf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:5690

		glPixelTransferf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelTransferi(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:5694

		glPixelTransferi((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelZoom(JNIEnv* env, jclass clazz, jfloat xfactor, jfloat yfactor) {


//@line:5698

		glPixelZoom((GLfloat)xfactor, (GLfloat)yfactor);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPointSize(JNIEnv* env, jclass clazz, jfloat size) {


//@line:5702

		glPointSize((GLfloat)size);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonMode(JNIEnv* env, jclass clazz, jint face, jint mode) {


//@line:5706

		glPolygonMode((GLenum)face, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:5710

		glPolygonOffset((GLfloat)factor, (GLfloat)units);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonStipple(JNIEnv* env, jclass clazz, jobject obj_mask, jint maskByteOffset) {
	unsigned char* mask = (unsigned char*)env->GetDirectBufferAddress(obj_mask);


//@line:5714

		glPolygonStipple((const GLubyte*)(mask + maskByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopAttrib(JNIEnv* env, jclass clazz) {


//@line:5718

		glPopAttrib();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopClientAttrib(JNIEnv* env, jclass clazz) {


//@line:5722

		glPopClientAttrib();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopMatrix(JNIEnv* env, jclass clazz) {


//@line:5726

		glPopMatrix();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopName(JNIEnv* env, jclass clazz) {


//@line:5730

		glPopName();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPrioritizeTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_priorities, jint prioritiesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);
	unsigned char* priorities = (unsigned char*)env->GetDirectBufferAddress(obj_priorities);


//@line:5734

		glPrioritizeTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (const GLclampf*)(priorities + prioritiesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushAttrib(JNIEnv* env, jclass clazz, jint mask) {


//@line:5738

		glPushAttrib((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushClientAttrib(JNIEnv* env, jclass clazz, jint mask) {


//@line:5742

		glPushClientAttrib((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushMatrix(JNIEnv* env, jclass clazz) {


//@line:5746

		glPushMatrix();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushName(JNIEnv* env, jclass clazz, jint name) {


//@line:5750

		glPushName((GLuint)name);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2d(JNIEnv* env, jclass clazz, jdouble x, jdouble y) {


//@line:5754

		glRasterPos2d((GLdouble)x, (GLdouble)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5758

		glRasterPos2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2f(JNIEnv* env, jclass clazz, jfloat x, jfloat y) {


//@line:5762

		glRasterPos2f((GLfloat)x, (GLfloat)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5766

		glRasterPos2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2i(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:5770

		glRasterPos2i((GLint)x, (GLint)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5774

		glRasterPos2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2s(JNIEnv* env, jclass clazz, jshort x, jshort y) {


//@line:5778

		glRasterPos2s((GLshort)x, (GLshort)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5782

		glRasterPos2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:5786

		glRasterPos3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5790

		glRasterPos3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:5794

		glRasterPos3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5798

		glRasterPos3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3i(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:5802

		glRasterPos3i((GLint)x, (GLint)y, (GLint)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5806

		glRasterPos3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z) {


//@line:5810

		glRasterPos3s((GLshort)x, (GLshort)y, (GLshort)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5814

		glRasterPos3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {


//@line:5818

		glRasterPos4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5822

		glRasterPos4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:5826

		glRasterPos4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5830

		glRasterPos4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4i(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint w) {


//@line:5834

		glRasterPos4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5838

		glRasterPos4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {


//@line:5842

		glRasterPos4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5846

		glRasterPos4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glReadBuffer(JNIEnv* env, jclass clazz, jint mode) {


//@line:5850

		glReadBuffer((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glReadPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:5854

		glReadPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectd(JNIEnv* env, jclass clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {


//@line:5858

		glRectd((GLdouble)x1, (GLdouble)y1, (GLdouble)x2, (GLdouble)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectdv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:5862

		glRectdv((const GLdouble*)(v1 + v1ByteOffset), (const GLdouble*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectf(JNIEnv* env, jclass clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {


//@line:5866

		glRectf((GLfloat)x1, (GLfloat)y1, (GLfloat)x2, (GLfloat)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectfv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:5870

		glRectfv((const GLfloat*)(v1 + v1ByteOffset), (const GLfloat*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRecti(JNIEnv* env, jclass clazz, jint x1, jint y1, jint x2, jint y2) {


//@line:5874

		glRecti((GLint)x1, (GLint)y1, (GLint)x2, (GLint)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectiv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:5878

		glRectiv((const GLint*)(v1 + v1ByteOffset), (const GLint*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRects(JNIEnv* env, jclass clazz, jshort x1, jshort y1, jshort x2, jshort y2) {


//@line:5882

		glRects((GLshort)x1, (GLshort)y1, (GLshort)x2, (GLshort)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectsv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:5886

		glRectsv((const GLshort*)(v1 + v1ByteOffset), (const GLshort*)(v2 + v2ByteOffset));
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glRenderMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:5890

		return (GLint)glRenderMode((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRotated(JNIEnv* env, jclass clazz, jdouble angle, jdouble x, jdouble y, jdouble z) {


//@line:5894

		glRotated((GLdouble)angle, (GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRotatef(JNIEnv* env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {


//@line:5898

		glRotatef((GLfloat)angle, (GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScaled(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:5902

		glScaled((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScalef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:5906

		glScalef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:5910

		glScissor((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glSelectBuffer(JNIEnv* env, jclass clazz, jint size, jobject obj_buffer, jint bufferByteOffset) {
	unsigned char* buffer = (unsigned char*)env->GetDirectBufferAddress(obj_buffer);


//@line:5914

		glSelectBuffer((GLsizei)size, (GLuint*)(buffer + bufferByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glShadeModel(JNIEnv* env, jclass clazz, jint mode) {


//@line:5918

		glShadeModel((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:5922

		glStencilFunc((GLenum)func, (GLint)ref, (GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:5926

		glStencilMask((GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:5930

		glStencilOp((GLenum)fail, (GLenum)zfail, (GLenum)zpass);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1d(JNIEnv* env, jclass clazz, jdouble s) {


//@line:5934

		glTexCoord1d((GLdouble)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5938

		glTexCoord1dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1f(JNIEnv* env, jclass clazz, jfloat s) {


//@line:5942

		glTexCoord1f((GLfloat)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5946

		glTexCoord1fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1i(JNIEnv* env, jclass clazz, jint s) {


//@line:5950

		glTexCoord1i((GLint)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5954

		glTexCoord1iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1s(JNIEnv* env, jclass clazz, jshort s) {


//@line:5958

		glTexCoord1s((GLshort)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5962

		glTexCoord1sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2d(JNIEnv* env, jclass clazz, jdouble s, jdouble t) {


//@line:5966

		glTexCoord2d((GLdouble)s, (GLdouble)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5970

		glTexCoord2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2f(JNIEnv* env, jclass clazz, jfloat s, jfloat t) {


//@line:5974

		glTexCoord2f((GLfloat)s, (GLfloat)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5978

		glTexCoord2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2i(JNIEnv* env, jclass clazz, jint s, jint t) {


//@line:5982

		glTexCoord2i((GLint)s, (GLint)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5986

		glTexCoord2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2s(JNIEnv* env, jclass clazz, jshort s, jshort t) {


//@line:5990

		glTexCoord2s((GLshort)s, (GLshort)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:5994

		glTexCoord2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3d(JNIEnv* env, jclass clazz, jdouble s, jdouble t, jdouble r) {


//@line:5998

		glTexCoord3d((GLdouble)s, (GLdouble)t, (GLdouble)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6002

		glTexCoord3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3f(JNIEnv* env, jclass clazz, jfloat s, jfloat t, jfloat r) {


//@line:6006

		glTexCoord3f((GLfloat)s, (GLfloat)t, (GLfloat)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6010

		glTexCoord3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3i(JNIEnv* env, jclass clazz, jint s, jint t, jint r) {


//@line:6014

		glTexCoord3i((GLint)s, (GLint)t, (GLint)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6018

		glTexCoord3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3s(JNIEnv* env, jclass clazz, jshort s, jshort t, jshort r) {


//@line:6022

		glTexCoord3s((GLshort)s, (GLshort)t, (GLshort)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6026

		glTexCoord3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4d(JNIEnv* env, jclass clazz, jdouble s, jdouble t, jdouble r, jdouble q) {


//@line:6030

		glTexCoord4d((GLdouble)s, (GLdouble)t, (GLdouble)r, (GLdouble)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6034

		glTexCoord4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4f(JNIEnv* env, jclass clazz, jfloat s, jfloat t, jfloat r, jfloat q) {


//@line:6038

		glTexCoord4f((GLfloat)s, (GLfloat)t, (GLfloat)r, (GLfloat)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6042

		glTexCoord4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4i(JNIEnv* env, jclass clazz, jint s, jint t, jint r, jint q) {


//@line:6046

		glTexCoord4i((GLint)s, (GLint)t, (GLint)r, (GLint)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6050

		glTexCoord4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4s(JNIEnv* env, jclass clazz, jshort s, jshort t, jshort r, jshort q) {


//@line:6054

		glTexCoord4s((GLshort)s, (GLshort)t, (GLshort)r, (GLshort)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6058

		glTexCoord4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoordPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:6062

		glTexCoordPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:6066

		glTexEnvf((GLenum)target, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6070

		glTexEnvfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvi(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:6074

		glTexEnvi((GLenum)target, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnviv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6078

		glTexEnviv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGend(JNIEnv* env, jclass clazz, jint coord, jint pname, jdouble param) {


//@line:6082

		glTexGend((GLenum)coord, (GLenum)pname, (GLdouble)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGendv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6086

		glTexGendv((GLenum)coord, (GLenum)pname, (const GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGenf(JNIEnv* env, jclass clazz, jint coord, jint pname, jfloat param) {


//@line:6090

		glTexGenf((GLenum)coord, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGenfv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6094

		glTexGenfv((GLenum)coord, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGeni(JNIEnv* env, jclass clazz, jint coord, jint pname, jint param) {


//@line:6098

		glTexGeni((GLenum)coord, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGeniv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6102

		glTexGeniv((GLenum)coord, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:6106

		glTexImage1D((GLenum)target, (GLint)level, (GLint)internalformat, (GLsizei)width, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:6110

		glTexImage2D((GLenum)target, (GLint)level, (GLint)internalformat, (GLsizei)width, (GLsizei)height, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameterf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:6114

		glTexParameterf((GLenum)target, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameterfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6118

		glTexParameterfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:6122

		glTexParameteri((GLenum)target, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameteriv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:6126

		glTexParameteriv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexSubImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:6130

		glTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLsizei)width, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:6134

		glTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTranslated(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:6138

		glTranslated((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTranslatef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:6142

		glTranslatef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2d(JNIEnv* env, jclass clazz, jdouble x, jdouble y) {


//@line:6146

		glVertex2d((GLdouble)x, (GLdouble)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6150

		glVertex2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2f(JNIEnv* env, jclass clazz, jfloat x, jfloat y) {


//@line:6154

		glVertex2f((GLfloat)x, (GLfloat)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6158

		glVertex2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2i(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:6162

		glVertex2i((GLint)x, (GLint)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6166

		glVertex2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2s(JNIEnv* env, jclass clazz, jshort x, jshort y) {


//@line:6170

		glVertex2s((GLshort)x, (GLshort)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6174

		glVertex2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:6178

		glVertex3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6182

		glVertex3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:6186

		glVertex3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6190

		glVertex3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3i(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:6194

		glVertex3i((GLint)x, (GLint)y, (GLint)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6198

		glVertex3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z) {


//@line:6202

		glVertex3s((GLshort)x, (GLshort)y, (GLshort)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6206

		glVertex3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {


//@line:6210

		glVertex4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6214

		glVertex4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:6218

		glVertex4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6222

		glVertex4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4i(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint w) {


//@line:6226

		glVertex4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6230

		glVertex4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {


//@line:6234

		glVertex4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:6238

		glVertex4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertexPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:6242

		glVertexPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:6246

		glViewport((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

