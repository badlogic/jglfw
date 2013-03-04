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
