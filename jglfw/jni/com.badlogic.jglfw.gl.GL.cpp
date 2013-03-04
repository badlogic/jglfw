#include <com.badlogic.jglfw.gl.GL.h>

//@line:545

	#include <GL/glfw3.h>
	#include "GL/glext.h"
	
//@line:550

	JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_init(JNIEnv* env, jclass clazz) {


//@line:553

	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearIndex(JNIEnv* env, jclass clazz, jfloat c) {


//@line:556

		glClearIndex((GLfloat)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearColor(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:560

		glClearColor((GLclampf)red, (GLclampf)green, (GLclampf)blue, (GLclampf)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClear(JNIEnv* env, jclass clazz, jint mask) {


//@line:564

		glClear((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:568

		glIndexMask((GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorMask(JNIEnv* env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {


//@line:572

		glColorMask((GLboolean)red, (GLboolean)green, (GLboolean)blue, (GLboolean)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glAlphaFunc(JNIEnv* env, jclass clazz, jint func, jfloat ref) {


//@line:576

		glAlphaFunc((GLenum)func, (GLclampf)ref);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBlendFunc(JNIEnv* env, jclass clazz, jint sfactor, jint dfactor) {


//@line:580

		glBlendFunc((GLenum)sfactor, (GLenum)dfactor);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLogicOp(JNIEnv* env, jclass clazz, jint opcode) {


//@line:584

		glLogicOp((GLenum)opcode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCullFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:588

		glCullFace((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFrontFace(JNIEnv* env, jclass clazz, jint mode) {


//@line:592

		glFrontFace((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPointSize(JNIEnv* env, jclass clazz, jfloat size) {


//@line:596

		glPointSize((GLfloat)size);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLineWidth(JNIEnv* env, jclass clazz, jfloat width) {


//@line:600

		glLineWidth((GLfloat)width);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLineStipple(JNIEnv* env, jclass clazz, jint factor, jshort pattern) {


//@line:604

		glLineStipple((GLint)factor, (GLushort)pattern);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonMode(JNIEnv* env, jclass clazz, jint face, jint mode) {


//@line:608

		glPolygonMode((GLenum)face, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonOffset(JNIEnv* env, jclass clazz, jfloat factor, jfloat units) {


//@line:612

		glPolygonOffset((GLfloat)factor, (GLfloat)units);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPolygonStipple(JNIEnv* env, jclass clazz, jobject obj_mask, jint maskByteOffset) {
	unsigned char* mask = (unsigned char*)env->GetDirectBufferAddress(obj_mask);


//@line:616

		glPolygonStipple((const GLubyte*)(mask + maskByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPolygonStipple(JNIEnv* env, jclass clazz, jobject obj_mask, jint maskByteOffset) {
	unsigned char* mask = (unsigned char*)env->GetDirectBufferAddress(obj_mask);


//@line:620

		glGetPolygonStipple((GLubyte*)(mask + maskByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlag(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:624

		glEdgeFlag((GLboolean)flag);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlagv(JNIEnv* env, jclass clazz, jobject obj_flag, jint flagByteOffset) {
	unsigned char* flag = (unsigned char*)env->GetDirectBufferAddress(obj_flag);


//@line:628

		glEdgeFlagv((const GLboolean*)(flag + flagByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScissor(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:632

		glScissor((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClipPlane(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint equationByteOffset) {
	unsigned char* equation = (unsigned char*)env->GetDirectBufferAddress(obj_equation);


//@line:636

		glClipPlane((GLenum)plane, (const GLdouble*)(equation + equationByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetClipPlane(JNIEnv* env, jclass clazz, jint plane, jobject obj_equation, jint equationByteOffset) {
	unsigned char* equation = (unsigned char*)env->GetDirectBufferAddress(obj_equation);


//@line:640

		glGetClipPlane((GLenum)plane, (GLdouble*)(equation + equationByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawBuffer(JNIEnv* env, jclass clazz, jint mode) {


//@line:644

		glDrawBuffer((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glReadBuffer(JNIEnv* env, jclass clazz, jint mode) {


//@line:648

		glReadBuffer((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnable(JNIEnv* env, jclass clazz, jint cap) {


//@line:652

		glEnable((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDisable(JNIEnv* env, jclass clazz, jint cap) {


//@line:656

		glDisable((GLenum)cap);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsEnabled(JNIEnv* env, jclass clazz, jint cap) {


//@line:660

		return (GLboolean)glIsEnabled((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnableClientState(JNIEnv* env, jclass clazz, jint cap) {


//@line:664

		glEnableClientState((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDisableClientState(JNIEnv* env, jclass clazz, jint cap) {


//@line:668

		glDisableClientState((GLenum)cap);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetBooleanv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:672

		glGetBooleanv((GLenum)pname, (GLboolean*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetDoublev(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:676

		glGetDoublev((GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetFloatv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:680

		glGetFloatv((GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetIntegerv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:684

		glGetIntegerv((GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushAttrib(JNIEnv* env, jclass clazz, jint mask) {


//@line:688

		glPushAttrib((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopAttrib(JNIEnv* env, jclass clazz) {


//@line:692

		glPopAttrib();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushClientAttrib(JNIEnv* env, jclass clazz, jint mask) {


//@line:696

		glPushClientAttrib((GLbitfield)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopClientAttrib(JNIEnv* env, jclass clazz) {


//@line:700

		glPopClientAttrib();
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glRenderMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:704

		return (GLint)glRenderMode((GLenum)mode);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glGetError(JNIEnv* env, jclass clazz) {


//@line:708

		return (GLenum)glGetError();
	

}

JNIEXPORT jobject JNICALL Java_com_badlogic_jglfw_gl_GL_glGetString(JNIEnv* env, jclass clazz, jint name) {


//@line:712

		return env->NewStringUTF((const char*)glGetString((GLenum)name));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFinish(JNIEnv* env, jclass clazz) {


//@line:716

		glFinish();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFlush(JNIEnv* env, jclass clazz) {


//@line:720

		glFlush();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glHint(JNIEnv* env, jclass clazz, jint target, jint mode) {


//@line:724

		glHint((GLenum)target, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearDepth(JNIEnv* env, jclass clazz, jdouble depth) {


//@line:728

		glClearDepth((GLclampd)depth);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthFunc(JNIEnv* env, jclass clazz, jint func) {


//@line:732

		glDepthFunc((GLenum)func);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthMask(JNIEnv* env, jclass clazz, jboolean flag) {


//@line:736

		glDepthMask((GLboolean)flag);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDepthRange(JNIEnv* env, jclass clazz, jdouble near_val, jdouble far_val) {


//@line:740

		glDepthRange((GLclampd)near_val, (GLclampd)far_val);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearAccum(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:744

		glClearAccum((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glAccum(JNIEnv* env, jclass clazz, jint op, jfloat value) {


//@line:748

		glAccum((GLenum)op, (GLfloat)value);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMatrixMode(JNIEnv* env, jclass clazz, jint mode) {


//@line:752

		glMatrixMode((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glOrtho(JNIEnv* env, jclass clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble near_val, jdouble far_val) {


//@line:756

		glOrtho((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)near_val, (GLdouble)far_val);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFrustum(JNIEnv* env, jclass clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble near_val, jdouble far_val) {


//@line:760

		glFrustum((GLdouble)left, (GLdouble)right, (GLdouble)bottom, (GLdouble)top, (GLdouble)near_val, (GLdouble)far_val);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glViewport(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height) {


//@line:764

		glViewport((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushMatrix(JNIEnv* env, jclass clazz) {


//@line:768

		glPushMatrix();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopMatrix(JNIEnv* env, jclass clazz) {


//@line:772

		glPopMatrix();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadIdentity(JNIEnv* env, jclass clazz) {


//@line:776

		glLoadIdentity();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadMatrixd(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:780

		glLoadMatrixd((const GLdouble*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadMatrixf(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:784

		glLoadMatrixf((const GLfloat*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMultMatrixd(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:788

		glMultMatrixd((const GLdouble*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMultMatrixf(JNIEnv* env, jclass clazz, jobject obj_m, jint mByteOffset) {
	unsigned char* m = (unsigned char*)env->GetDirectBufferAddress(obj_m);


//@line:792

		glMultMatrixf((const GLfloat*)(m + mByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRotated(JNIEnv* env, jclass clazz, jdouble angle, jdouble x, jdouble y, jdouble z) {


//@line:796

		glRotated((GLdouble)angle, (GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRotatef(JNIEnv* env, jclass clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {


//@line:800

		glRotatef((GLfloat)angle, (GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScaled(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:804

		glScaled((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glScalef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:808

		glScalef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTranslated(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:812

		glTranslated((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTranslatef(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:816

		glTranslatef((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsList(JNIEnv* env, jclass clazz, jint list) {


//@line:820

		return (GLboolean)glIsList((GLuint)list);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDeleteLists(JNIEnv* env, jclass clazz, jint list, jint range) {


//@line:824

		glDeleteLists((GLuint)list, (GLsizei)range);
	

}

JNIEXPORT jint JNICALL Java_com_badlogic_jglfw_gl_GL_glGenLists(JNIEnv* env, jclass clazz, jint range) {


//@line:828

		return (GLuint)glGenLists((GLsizei)range);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNewList(JNIEnv* env, jclass clazz, jint list, jint mode) {


//@line:832

		glNewList((GLuint)list, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEndList(JNIEnv* env, jclass clazz) {


//@line:836

		glEndList();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCallList(JNIEnv* env, jclass clazz, jint list) {


//@line:840

		glCallList((GLuint)list);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCallLists(JNIEnv* env, jclass clazz, jint n, jint type, jobject obj_lists, jint listsByteOffset) {
	unsigned char* lists = (unsigned char*)env->GetDirectBufferAddress(obj_lists);


//@line:844

		glCallLists((GLsizei)n, (GLenum)type, (const GLvoid*)(lists + listsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glListBase(JNIEnv* env, jclass clazz, jint base) {


//@line:848

		glListBase((GLuint)base);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBegin(JNIEnv* env, jclass clazz, jint mode) {


//@line:852

		glBegin((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEnd(JNIEnv* env, jclass clazz) {


//@line:856

		glEnd();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2d(JNIEnv* env, jclass clazz, jdouble x, jdouble y) {


//@line:860

		glVertex2d((GLdouble)x, (GLdouble)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2f(JNIEnv* env, jclass clazz, jfloat x, jfloat y) {


//@line:864

		glVertex2f((GLfloat)x, (GLfloat)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2i(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:868

		glVertex2i((GLint)x, (GLint)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2s(JNIEnv* env, jclass clazz, jshort x, jshort y) {


//@line:872

		glVertex2s((GLshort)x, (GLshort)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:876

		glVertex3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:880

		glVertex3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3i(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:884

		glVertex3i((GLint)x, (GLint)y, (GLint)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z) {


//@line:888

		glVertex3s((GLshort)x, (GLshort)y, (GLshort)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {


//@line:892

		glVertex4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:896

		glVertex4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4i(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint w) {


//@line:900

		glVertex4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {


//@line:904

		glVertex4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:908

		glVertex2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:912

		glVertex2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:916

		glVertex2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:920

		glVertex2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:924

		glVertex3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:928

		glVertex3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:932

		glVertex3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:936

		glVertex3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:940

		glVertex4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:944

		glVertex4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:948

		glVertex4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertex4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:952

		glVertex4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3b(JNIEnv* env, jclass clazz, jbyte nx, jbyte ny, jbyte nz) {


//@line:956

		glNormal3b((GLbyte)nx, (GLbyte)ny, (GLbyte)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3d(JNIEnv* env, jclass clazz, jdouble nx, jdouble ny, jdouble nz) {


//@line:960

		glNormal3d((GLdouble)nx, (GLdouble)ny, (GLdouble)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3f(JNIEnv* env, jclass clazz, jfloat nx, jfloat ny, jfloat nz) {


//@line:964

		glNormal3f((GLfloat)nx, (GLfloat)ny, (GLfloat)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3i(JNIEnv* env, jclass clazz, jint nx, jint ny, jint nz) {


//@line:968

		glNormal3i((GLint)nx, (GLint)ny, (GLint)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3s(JNIEnv* env, jclass clazz, jshort nx, jshort ny, jshort nz) {


//@line:972

		glNormal3s((GLshort)nx, (GLshort)ny, (GLshort)nz);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:976

		glNormal3bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:980

		glNormal3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:984

		glNormal3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:988

		glNormal3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormal3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:992

		glNormal3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexd(JNIEnv* env, jclass clazz, jdouble c) {


//@line:996

		glIndexd((GLdouble)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexf(JNIEnv* env, jclass clazz, jfloat c) {


//@line:1000

		glIndexf((GLfloat)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexi(JNIEnv* env, jclass clazz, jint c) {


//@line:1004

		glIndexi((GLint)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexs(JNIEnv* env, jclass clazz, jshort c) {


//@line:1008

		glIndexs((GLshort)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexub(JNIEnv* env, jclass clazz, jbyte c) {


//@line:1012

		glIndexub((GLubyte)c);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexdv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:1016

		glIndexdv((const GLdouble*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexfv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:1020

		glIndexfv((const GLfloat*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexiv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:1024

		glIndexiv((const GLint*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexsv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:1028

		glIndexsv((const GLshort*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexubv(JNIEnv* env, jclass clazz, jobject obj_c, jint cByteOffset) {
	unsigned char* c = (unsigned char*)env->GetDirectBufferAddress(obj_c);


//@line:1032

		glIndexubv((const GLubyte*)(c + cByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3b(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue) {


//@line:1036

		glColor3b((GLbyte)red, (GLbyte)green, (GLbyte)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3d(JNIEnv* env, jclass clazz, jdouble red, jdouble green, jdouble blue) {


//@line:1040

		glColor3d((GLdouble)red, (GLdouble)green, (GLdouble)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue) {


//@line:1044

		glColor3f((GLfloat)red, (GLfloat)green, (GLfloat)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3i(JNIEnv* env, jclass clazz, jint red, jint green, jint blue) {


//@line:1048

		glColor3i((GLint)red, (GLint)green, (GLint)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3s(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue) {


//@line:1052

		glColor3s((GLshort)red, (GLshort)green, (GLshort)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue) {


//@line:1056

		glColor3ub((GLubyte)red, (GLubyte)green, (GLubyte)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ui(JNIEnv* env, jclass clazz, jint red, jint green, jint blue) {


//@line:1060

		glColor3ui((GLuint)red, (GLuint)green, (GLuint)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3us(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue) {


//@line:1064

		glColor3us((GLushort)red, (GLushort)green, (GLushort)blue);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4b(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:1068

		glColor4b((GLbyte)red, (GLbyte)green, (GLbyte)blue, (GLbyte)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4d(JNIEnv* env, jclass clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha) {


//@line:1072

		glColor4d((GLdouble)red, (GLdouble)green, (GLdouble)blue, (GLdouble)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4f(JNIEnv* env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {


//@line:1076

		glColor4f((GLfloat)red, (GLfloat)green, (GLfloat)blue, (GLfloat)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4i(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:1080

		glColor4i((GLint)red, (GLint)green, (GLint)blue, (GLint)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4s(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {


//@line:1084

		glColor4s((GLshort)red, (GLshort)green, (GLshort)blue, (GLshort)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ub(JNIEnv* env, jclass clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {


//@line:1088

		glColor4ub((GLubyte)red, (GLubyte)green, (GLubyte)blue, (GLubyte)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ui(JNIEnv* env, jclass clazz, jint red, jint green, jint blue, jint alpha) {


//@line:1092

		glColor4ui((GLuint)red, (GLuint)green, (GLuint)blue, (GLuint)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4us(JNIEnv* env, jclass clazz, jshort red, jshort green, jshort blue, jshort alpha) {


//@line:1096

		glColor4us((GLushort)red, (GLushort)green, (GLushort)blue, (GLushort)alpha);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1100

		glColor3bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1104

		glColor3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1108

		glColor3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1112

		glColor3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1116

		glColor3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3ubv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1120

		glColor3ubv((const GLubyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3uiv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1124

		glColor3uiv((const GLuint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor3usv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1128

		glColor3usv((const GLushort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4bv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1132

		glColor4bv((const GLbyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1136

		glColor4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1140

		glColor4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1144

		glColor4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1148

		glColor4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4ubv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1152

		glColor4ubv((const GLubyte*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4uiv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1156

		glColor4uiv((const GLuint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColor4usv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1160

		glColor4usv((const GLushort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1d(JNIEnv* env, jclass clazz, jdouble s) {


//@line:1164

		glTexCoord1d((GLdouble)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1f(JNIEnv* env, jclass clazz, jfloat s) {


//@line:1168

		glTexCoord1f((GLfloat)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1i(JNIEnv* env, jclass clazz, jint s) {


//@line:1172

		glTexCoord1i((GLint)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1s(JNIEnv* env, jclass clazz, jshort s) {


//@line:1176

		glTexCoord1s((GLshort)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2d(JNIEnv* env, jclass clazz, jdouble s, jdouble t) {


//@line:1180

		glTexCoord2d((GLdouble)s, (GLdouble)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2f(JNIEnv* env, jclass clazz, jfloat s, jfloat t) {


//@line:1184

		glTexCoord2f((GLfloat)s, (GLfloat)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2i(JNIEnv* env, jclass clazz, jint s, jint t) {


//@line:1188

		glTexCoord2i((GLint)s, (GLint)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2s(JNIEnv* env, jclass clazz, jshort s, jshort t) {


//@line:1192

		glTexCoord2s((GLshort)s, (GLshort)t);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3d(JNIEnv* env, jclass clazz, jdouble s, jdouble t, jdouble r) {


//@line:1196

		glTexCoord3d((GLdouble)s, (GLdouble)t, (GLdouble)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3f(JNIEnv* env, jclass clazz, jfloat s, jfloat t, jfloat r) {


//@line:1200

		glTexCoord3f((GLfloat)s, (GLfloat)t, (GLfloat)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3i(JNIEnv* env, jclass clazz, jint s, jint t, jint r) {


//@line:1204

		glTexCoord3i((GLint)s, (GLint)t, (GLint)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3s(JNIEnv* env, jclass clazz, jshort s, jshort t, jshort r) {


//@line:1208

		glTexCoord3s((GLshort)s, (GLshort)t, (GLshort)r);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4d(JNIEnv* env, jclass clazz, jdouble s, jdouble t, jdouble r, jdouble q) {


//@line:1212

		glTexCoord4d((GLdouble)s, (GLdouble)t, (GLdouble)r, (GLdouble)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4f(JNIEnv* env, jclass clazz, jfloat s, jfloat t, jfloat r, jfloat q) {


//@line:1216

		glTexCoord4f((GLfloat)s, (GLfloat)t, (GLfloat)r, (GLfloat)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4i(JNIEnv* env, jclass clazz, jint s, jint t, jint r, jint q) {


//@line:1220

		glTexCoord4i((GLint)s, (GLint)t, (GLint)r, (GLint)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4s(JNIEnv* env, jclass clazz, jshort s, jshort t, jshort r, jshort q) {


//@line:1224

		glTexCoord4s((GLshort)s, (GLshort)t, (GLshort)r, (GLshort)q);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1228

		glTexCoord1dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1232

		glTexCoord1fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1236

		glTexCoord1iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord1sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1240

		glTexCoord1sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1244

		glTexCoord2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1248

		glTexCoord2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1252

		glTexCoord2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1256

		glTexCoord2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1260

		glTexCoord3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1264

		glTexCoord3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1268

		glTexCoord3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1272

		glTexCoord3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1276

		glTexCoord4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1280

		glTexCoord4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1284

		glTexCoord4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoord4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1288

		glTexCoord4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2d(JNIEnv* env, jclass clazz, jdouble x, jdouble y) {


//@line:1292

		glRasterPos2d((GLdouble)x, (GLdouble)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2f(JNIEnv* env, jclass clazz, jfloat x, jfloat y) {


//@line:1296

		glRasterPos2f((GLfloat)x, (GLfloat)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2i(JNIEnv* env, jclass clazz, jint x, jint y) {


//@line:1300

		glRasterPos2i((GLint)x, (GLint)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2s(JNIEnv* env, jclass clazz, jshort x, jshort y) {


//@line:1304

		glRasterPos2s((GLshort)x, (GLshort)y);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z) {


//@line:1308

		glRasterPos3d((GLdouble)x, (GLdouble)y, (GLdouble)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z) {


//@line:1312

		glRasterPos3f((GLfloat)x, (GLfloat)y, (GLfloat)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3i(JNIEnv* env, jclass clazz, jint x, jint y, jint z) {


//@line:1316

		glRasterPos3i((GLint)x, (GLint)y, (GLint)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z) {


//@line:1320

		glRasterPos3s((GLshort)x, (GLshort)y, (GLshort)z);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4d(JNIEnv* env, jclass clazz, jdouble x, jdouble y, jdouble z, jdouble w) {


//@line:1324

		glRasterPos4d((GLdouble)x, (GLdouble)y, (GLdouble)z, (GLdouble)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4f(JNIEnv* env, jclass clazz, jfloat x, jfloat y, jfloat z, jfloat w) {


//@line:1328

		glRasterPos4f((GLfloat)x, (GLfloat)y, (GLfloat)z, (GLfloat)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4i(JNIEnv* env, jclass clazz, jint x, jint y, jint z, jint w) {


//@line:1332

		glRasterPos4i((GLint)x, (GLint)y, (GLint)z, (GLint)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4s(JNIEnv* env, jclass clazz, jshort x, jshort y, jshort z, jshort w) {


//@line:1336

		glRasterPos4s((GLshort)x, (GLshort)y, (GLshort)z, (GLshort)w);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1340

		glRasterPos2dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1344

		glRasterPos2fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1348

		glRasterPos2iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos2sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1352

		glRasterPos2sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1356

		glRasterPos3dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1360

		glRasterPos3fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1364

		glRasterPos3iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos3sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1368

		glRasterPos3sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4dv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1372

		glRasterPos4dv((const GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4fv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1376

		glRasterPos4fv((const GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4iv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1380

		glRasterPos4iv((const GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRasterPos4sv(JNIEnv* env, jclass clazz, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1384

		glRasterPos4sv((const GLshort*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectd(JNIEnv* env, jclass clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {


//@line:1388

		glRectd((GLdouble)x1, (GLdouble)y1, (GLdouble)x2, (GLdouble)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectf(JNIEnv* env, jclass clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {


//@line:1392

		glRectf((GLfloat)x1, (GLfloat)y1, (GLfloat)x2, (GLfloat)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRecti(JNIEnv* env, jclass clazz, jint x1, jint y1, jint x2, jint y2) {


//@line:1396

		glRecti((GLint)x1, (GLint)y1, (GLint)x2, (GLint)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRects(JNIEnv* env, jclass clazz, jshort x1, jshort y1, jshort x2, jshort y2) {


//@line:1400

		glRects((GLshort)x1, (GLshort)y1, (GLshort)x2, (GLshort)y2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectdv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:1404

		glRectdv((const GLdouble*)(v1 + v1ByteOffset), (const GLdouble*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectfv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:1408

		glRectfv((const GLfloat*)(v1 + v1ByteOffset), (const GLfloat*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectiv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:1412

		glRectiv((const GLint*)(v1 + v1ByteOffset), (const GLint*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glRectsv(JNIEnv* env, jclass clazz, jobject obj_v1, jint v1ByteOffset, jobject obj_v2, jint v2ByteOffset) {
	unsigned char* v1 = (unsigned char*)env->GetDirectBufferAddress(obj_v1);
	unsigned char* v2 = (unsigned char*)env->GetDirectBufferAddress(obj_v2);


//@line:1416

		glRectsv((const GLshort*)(v1 + v1ByteOffset), (const GLshort*)(v2 + v2ByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glShadeModel(JNIEnv* env, jclass clazz, jint mode) {


//@line:1420

		glShadeModel((GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightf(JNIEnv* env, jclass clazz, jint light, jint pname, jfloat param) {


//@line:1424

		glLightf((GLenum)light, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLighti(JNIEnv* env, jclass clazz, jint light, jint pname, jint param) {


//@line:1428

		glLighti((GLenum)light, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightfv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1432

		glLightfv((GLenum)light, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightiv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1436

		glLightiv((GLenum)light, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetLightfv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1440

		glGetLightfv((GLenum)light, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetLightiv(JNIEnv* env, jclass clazz, jint light, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1444

		glGetLightiv((GLenum)light, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModelf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1448

		glLightModelf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModeli(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1452

		glLightModeli((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModelfv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1456

		glLightModelfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLightModeliv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1460

		glLightModeliv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialf(JNIEnv* env, jclass clazz, jint face, jint pname, jfloat param) {


//@line:1464

		glMaterialf((GLenum)face, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMateriali(JNIEnv* env, jclass clazz, jint face, jint pname, jint param) {


//@line:1468

		glMateriali((GLenum)face, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialfv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1472

		glMaterialfv((GLenum)face, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMaterialiv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1476

		glMaterialiv((GLenum)face, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMaterialfv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1480

		glGetMaterialfv((GLenum)face, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMaterialiv(JNIEnv* env, jclass clazz, jint face, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1484

		glGetMaterialiv((GLenum)face, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorMaterial(JNIEnv* env, jclass clazz, jint face, jint mode) {


//@line:1488

		glColorMaterial((GLenum)face, (GLenum)mode);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelZoom(JNIEnv* env, jclass clazz, jfloat xfactor, jfloat yfactor) {


//@line:1492

		glPixelZoom((GLfloat)xfactor, (GLfloat)yfactor);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelStoref(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1496

		glPixelStoref((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelStorei(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1500

		glPixelStorei((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelTransferf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1504

		glPixelTransferf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelTransferi(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1508

		glPixelTransferi((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapfv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1512

		glPixelMapfv((GLenum)map, (GLint)mapsize, (const GLfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapuiv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1516

		glPixelMapuiv((GLenum)map, (GLint)mapsize, (const GLuint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPixelMapusv(JNIEnv* env, jclass clazz, jint map, jint mapsize, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1520

		glPixelMapusv((GLenum)map, (GLint)mapsize, (const GLushort*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapfv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1524

		glGetPixelMapfv((GLenum)map, (GLfloat*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapuiv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1528

		glGetPixelMapuiv((GLenum)map, (GLuint*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetPixelMapusv(JNIEnv* env, jclass clazz, jint map, jobject obj_values, jint valuesByteOffset) {
	unsigned char* values = (unsigned char*)env->GetDirectBufferAddress(obj_values);


//@line:1532

		glGetPixelMapusv((GLenum)map, (GLushort*)(values + valuesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBitmap(JNIEnv* env, jclass clazz, jint width, jint height, jfloat xorig, jfloat yorig, jfloat xmove, jfloat ymove, jobject obj_bitmap, jint bitmapByteOffset) {
	unsigned char* bitmap = (unsigned char*)env->GetDirectBufferAddress(obj_bitmap);


//@line:1536

		glBitmap((GLsizei)width, (GLsizei)height, (GLfloat)xorig, (GLfloat)yorig, (GLfloat)xmove, (GLfloat)ymove, (const GLubyte*)(bitmap + bitmapByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glReadPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1540

		glReadPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawPixels(JNIEnv* env, jclass clazz, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1544

		glDrawPixels((GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyPixels(JNIEnv* env, jclass clazz, jint x, jint y, jint width, jint height, jint type) {


//@line:1548

		glCopyPixels((GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLenum)type);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilFunc(JNIEnv* env, jclass clazz, jint func, jint ref, jint mask) {


//@line:1552

		glStencilFunc((GLenum)func, (GLint)ref, (GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilMask(JNIEnv* env, jclass clazz, jint mask) {


//@line:1556

		glStencilMask((GLuint)mask);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glStencilOp(JNIEnv* env, jclass clazz, jint fail, jint zfail, jint zpass) {


//@line:1560

		glStencilOp((GLenum)fail, (GLenum)zfail, (GLenum)zpass);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glClearStencil(JNIEnv* env, jclass clazz, jint s) {


//@line:1564

		glClearStencil((GLint)s);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGend(JNIEnv* env, jclass clazz, jint coord, jint pname, jdouble param) {


//@line:1568

		glTexGend((GLenum)coord, (GLenum)pname, (GLdouble)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGenf(JNIEnv* env, jclass clazz, jint coord, jint pname, jfloat param) {


//@line:1572

		glTexGenf((GLenum)coord, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGeni(JNIEnv* env, jclass clazz, jint coord, jint pname, jint param) {


//@line:1576

		glTexGeni((GLenum)coord, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGendv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1580

		glTexGendv((GLenum)coord, (GLenum)pname, (const GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGenfv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1584

		glTexGenfv((GLenum)coord, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexGeniv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1588

		glTexGeniv((GLenum)coord, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGendv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1592

		glGetTexGendv((GLenum)coord, (GLenum)pname, (GLdouble*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGenfv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1596

		glGetTexGenfv((GLenum)coord, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexGeniv(JNIEnv* env, jclass clazz, jint coord, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1600

		glGetTexGeniv((GLenum)coord, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:1604

		glTexEnvf((GLenum)target, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvi(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1608

		glTexEnvi((GLenum)target, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnvfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1612

		glTexEnvfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexEnviv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1616

		glTexEnviv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexEnvfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1620

		glGetTexEnvfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexEnviv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1624

		glGetTexEnviv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameterf(JNIEnv* env, jclass clazz, jint target, jint pname, jfloat param) {


//@line:1628

		glTexParameterf((GLenum)target, (GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameteri(JNIEnv* env, jclass clazz, jint target, jint pname, jint param) {


//@line:1632

		glTexParameteri((GLenum)target, (GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameterfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1636

		glTexParameterfv((GLenum)target, (GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexParameteriv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1640

		glTexParameteriv((GLenum)target, (GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexParameterfv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1644

		glGetTexParameterfv((GLenum)target, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexParameteriv(JNIEnv* env, jclass clazz, jint target, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1648

		glGetTexParameteriv((GLenum)target, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexLevelParameterfv(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1652

		glGetTexLevelParameterfv((GLenum)target, (GLint)level, (GLenum)pname, (GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexLevelParameteriv(JNIEnv* env, jclass clazz, jint target, jint level, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1656

		glGetTexLevelParameteriv((GLenum)target, (GLint)level, (GLenum)pname, (GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalFormat, jint width, jint border, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1660

		glTexImage1D((GLenum)target, (GLint)level, (GLint)internalFormat, (GLsizei)width, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalFormat, jint width, jint height, jint border, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1664

		glTexImage2D((GLenum)target, (GLint)level, (GLint)internalFormat, (GLsizei)width, (GLsizei)height, (GLint)border, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetTexImage(JNIEnv* env, jclass clazz, jint target, jint level, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1668

		glGetTexImage((GLenum)target, (GLint)level, (GLenum)format, (GLenum)type, (GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap1d(JNIEnv* env, jclass clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:1672

		glMap1d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)stride, (GLint)order, (const GLdouble*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap1f(JNIEnv* env, jclass clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:1676

		glMap1f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)stride, (GLint)order, (const GLfloat*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap2d(JNIEnv* env, jclass clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:1680

		glMap2d((GLenum)target, (GLdouble)u1, (GLdouble)u2, (GLint)ustride, (GLint)uorder, (GLdouble)v1, (GLdouble)v2, (GLint)vstride, (GLint)vorder, (const GLdouble*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMap2f(JNIEnv* env, jclass clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jobject obj_points, jint pointsByteOffset) {
	unsigned char* points = (unsigned char*)env->GetDirectBufferAddress(obj_points);


//@line:1684

		glMap2f((GLenum)target, (GLfloat)u1, (GLfloat)u2, (GLint)ustride, (GLint)uorder, (GLfloat)v1, (GLfloat)v2, (GLint)vstride, (GLint)vorder, (const GLfloat*)(points + pointsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapdv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1688

		glGetMapdv((GLenum)target, (GLenum)query, (GLdouble*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapfv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1692

		glGetMapfv((GLenum)target, (GLenum)query, (GLfloat*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGetMapiv(JNIEnv* env, jclass clazz, jint target, jint query, jobject obj_v, jint vByteOffset) {
	unsigned char* v = (unsigned char*)env->GetDirectBufferAddress(obj_v);


//@line:1696

		glGetMapiv((GLenum)target, (GLenum)query, (GLint*)(v + vByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1d(JNIEnv* env, jclass clazz, jdouble u) {


//@line:1700

		glEvalCoord1d((GLdouble)u);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1f(JNIEnv* env, jclass clazz, jfloat u) {


//@line:1704

		glEvalCoord1f((GLfloat)u);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1dv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:1708

		glEvalCoord1dv((const GLdouble*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord1fv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:1712

		glEvalCoord1fv((const GLfloat*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2d(JNIEnv* env, jclass clazz, jdouble u, jdouble v) {


//@line:1716

		glEvalCoord2d((GLdouble)u, (GLdouble)v);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2f(JNIEnv* env, jclass clazz, jfloat u, jfloat v) {


//@line:1720

		glEvalCoord2f((GLfloat)u, (GLfloat)v);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2dv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:1724

		glEvalCoord2dv((const GLdouble*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalCoord2fv(JNIEnv* env, jclass clazz, jobject obj_u, jint uByteOffset) {
	unsigned char* u = (unsigned char*)env->GetDirectBufferAddress(obj_u);


//@line:1728

		glEvalCoord2fv((const GLfloat*)(u + uByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid1d(JNIEnv* env, jclass clazz, jint un, jdouble u1, jdouble u2) {


//@line:1732

		glMapGrid1d((GLint)un, (GLdouble)u1, (GLdouble)u2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid1f(JNIEnv* env, jclass clazz, jint un, jfloat u1, jfloat u2) {


//@line:1736

		glMapGrid1f((GLint)un, (GLfloat)u1, (GLfloat)u2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid2d(JNIEnv* env, jclass clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {


//@line:1740

		glMapGrid2d((GLint)un, (GLdouble)u1, (GLdouble)u2, (GLint)vn, (GLdouble)v1, (GLdouble)v2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glMapGrid2f(JNIEnv* env, jclass clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {


//@line:1744

		glMapGrid2f((GLint)un, (GLfloat)u1, (GLfloat)u2, (GLint)vn, (GLfloat)v1, (GLfloat)v2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalPoint1(JNIEnv* env, jclass clazz, jint i) {


//@line:1748

		glEvalPoint1((GLint)i);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalPoint2(JNIEnv* env, jclass clazz, jint i, jint j) {


//@line:1752

		glEvalPoint2((GLint)i, (GLint)j);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalMesh1(JNIEnv* env, jclass clazz, jint mode, jint i1, jint i2) {


//@line:1756

		glEvalMesh1((GLenum)mode, (GLint)i1, (GLint)i2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEvalMesh2(JNIEnv* env, jclass clazz, jint mode, jint i1, jint i2, jint j1, jint j2) {


//@line:1760

		glEvalMesh2((GLenum)mode, (GLint)i1, (GLint)i2, (GLint)j1, (GLint)j2);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogf(JNIEnv* env, jclass clazz, jint pname, jfloat param) {


//@line:1764

		glFogf((GLenum)pname, (GLfloat)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogi(JNIEnv* env, jclass clazz, jint pname, jint param) {


//@line:1768

		glFogi((GLenum)pname, (GLint)param);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogfv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1772

		glFogfv((GLenum)pname, (const GLfloat*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFogiv(JNIEnv* env, jclass clazz, jint pname, jobject obj_params, jint paramsByteOffset) {
	unsigned char* params = (unsigned char*)env->GetDirectBufferAddress(obj_params);


//@line:1776

		glFogiv((GLenum)pname, (const GLint*)(params + paramsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glFeedbackBuffer(JNIEnv* env, jclass clazz, jint size, jint type, jobject obj_buffer, jint bufferByteOffset) {
	unsigned char* buffer = (unsigned char*)env->GetDirectBufferAddress(obj_buffer);


//@line:1780

		glFeedbackBuffer((GLsizei)size, (GLenum)type, (GLfloat*)(buffer + bufferByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPassThrough(JNIEnv* env, jclass clazz, jfloat token) {


//@line:1784

		glPassThrough((GLfloat)token);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glSelectBuffer(JNIEnv* env, jclass clazz, jint size, jobject obj_buffer, jint bufferByteOffset) {
	unsigned char* buffer = (unsigned char*)env->GetDirectBufferAddress(obj_buffer);


//@line:1788

		glSelectBuffer((GLsizei)size, (GLuint*)(buffer + bufferByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glInitNames(JNIEnv* env, jclass clazz) {


//@line:1792

		glInitNames();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glLoadName(JNIEnv* env, jclass clazz, jint name) {


//@line:1796

		glLoadName((GLuint)name);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPushName(JNIEnv* env, jclass clazz, jint name) {


//@line:1800

		glPushName((GLuint)name);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPopName(JNIEnv* env, jclass clazz) {


//@line:1804

		glPopName();
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glGenTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);


//@line:1808

		glGenTextures((GLsizei)n, (GLuint*)(textures + texturesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDeleteTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);


//@line:1812

		glDeleteTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glBindTexture(JNIEnv* env, jclass clazz, jint target, jint texture) {


//@line:1816

		glBindTexture((GLenum)target, (GLuint)texture);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glPrioritizeTextures(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_priorities, jint prioritiesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);
	unsigned char* priorities = (unsigned char*)env->GetDirectBufferAddress(obj_priorities);


//@line:1820

		glPrioritizeTextures((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (const GLclampf*)(priorities + prioritiesByteOffset));
	

}

static inline jboolean wrapped_Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident
(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_residences, jint residencesByteOffset, unsigned char* textures, unsigned char* residences) {

//@line:1824

		return (GLboolean)glAreTexturesResident((GLsizei)n, (const GLuint*)(textures + texturesByteOffset), (GLboolean*)(residences + residencesByteOffset));
	
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident(JNIEnv* env, jclass clazz, jint n, jobject obj_textures, jint texturesByteOffset, jobject obj_residences, jint residencesByteOffset) {
	unsigned char* textures = (unsigned char*)env->GetDirectBufferAddress(obj_textures);
	unsigned char* residences = (unsigned char*)env->GetDirectBufferAddress(obj_residences);

	jboolean JNI_returnValue = wrapped_Java_com_badlogic_jglfw_gl_GL_glAreTexturesResident(env, clazz, n, obj_textures, texturesByteOffset, obj_residences, residencesByteOffset, textures, residences);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_com_badlogic_jglfw_gl_GL_glIsTexture(JNIEnv* env, jclass clazz, jint texture) {


//@line:1828

		return (GLboolean)glIsTexture((GLuint)texture);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexSubImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1832

		glTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLsizei)width, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject obj_pixels, jint pixelsByteOffset) {
	unsigned char* pixels = (unsigned char*)env->GetDirectBufferAddress(obj_pixels);


//@line:1836

		glTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLsizei)width, (GLsizei)height, (GLenum)format, (GLenum)type, (const GLvoid*)(pixels + pixelsByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {


//@line:1840

		glCopyTexImage1D((GLenum)target, (GLint)level, (GLenum)internalformat, (GLint)x, (GLint)y, (GLsizei)width, (GLint)border);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {


//@line:1844

		glCopyTexImage2D((GLenum)target, (GLint)level, (GLenum)internalformat, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height, (GLint)border);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexSubImage1D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width) {


//@line:1848

		glCopyTexSubImage1D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)x, (GLint)y, (GLsizei)width);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glCopyTexSubImage2D(JNIEnv* env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {


//@line:1852

		glCopyTexSubImage2D((GLenum)target, (GLint)level, (GLint)xoffset, (GLint)yoffset, (GLint)x, (GLint)y, (GLsizei)width, (GLsizei)height);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glVertexPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1856

		glVertexPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glNormalPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1860

		glNormalPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glColorPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1864

		glColorPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glIndexPointer(JNIEnv* env, jclass clazz, jint type, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1868

		glIndexPointer((GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glTexCoordPointer(JNIEnv* env, jclass clazz, jint size, jint type, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1872

		glTexCoordPointer((GLint)size, (GLenum)type, (GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glEdgeFlagPointer(JNIEnv* env, jclass clazz, jint stride, jobject obj_ptr, jint ptrByteOffset) {
	unsigned char* ptr = (unsigned char*)env->GetDirectBufferAddress(obj_ptr);


//@line:1876

		glEdgeFlagPointer((GLsizei)stride, (const GLvoid*)(ptr + ptrByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glArrayElement(JNIEnv* env, jclass clazz, jint i) {


//@line:1880

		glArrayElement((GLint)i);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawArrays(JNIEnv* env, jclass clazz, jint mode, jint first, jint count) {


//@line:1884

		glDrawArrays((GLenum)mode, (GLint)first, (GLsizei)count);
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glDrawElements(JNIEnv* env, jclass clazz, jint mode, jint count, jint type, jobject obj_indices, jint indicesByteOffset) {
	unsigned char* indices = (unsigned char*)env->GetDirectBufferAddress(obj_indices);


//@line:1888

		glDrawElements((GLenum)mode, (GLsizei)count, (GLenum)type, (const GLvoid*)(indices + indicesByteOffset));
	

}

JNIEXPORT void JNICALL Java_com_badlogic_jglfw_gl_GL_glInterleavedArrays(JNIEnv* env, jclass clazz, jint format, jint stride, jobject obj_pointer, jint pointerByteOffset) {
	unsigned char* pointer = (unsigned char*)env->GetDirectBufferAddress(obj_pointer);


//@line:1892

		glInterleavedArrays((GLenum)format, (GLsizei)stride, (const GLvoid*)(pointer + pointerByteOffset));
	

}

