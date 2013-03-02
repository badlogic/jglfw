//========================================================================
// GLFW - An OpenGL library
// Platform:    Win32/WGL
// API version: 3.0
// WWW:         http://www.glfw.org/
//------------------------------------------------------------------------
// Copyright (c) 2002-2006 Marcus Geelnard
// Copyright (c) 2006-2010 Camilla Berglund <elmindreda@elmindreda.org>
//
// This software is provided 'as-is', without any express or implied
// warranty. In no event will the authors be held liable for any damages
// arising from the use of this software.
//
// Permission is granted to anyone to use this software for any purpose,
// including commercial applications, and to alter it and redistribute it
// freely, subject to the following restrictions:
//
// 1. The origin of this software must not be misrepresented; you must not
//    claim that you wrote the original software. If you use this software
//    in a product, an acknowledgment in the product documentation would
//    be appreciated but is not required.
//
// 2. Altered source versions must be plainly marked as such, and must not
//    be misrepresented as being the original software.
//
// 3. This notice may not be removed or altered from any source
//    distribution.
//
//========================================================================

#include "internal.h"

#include <stdlib.h>
#include <malloc.h>

#ifdef __BORLANDC__
// With the Borland C++ compiler, we want to disable FPU exceptions
#include <float.h>
#endif // __BORLANDC__


#if defined(_GLFW_BUILD_DLL)

// GLFW DLL entry point
//
BOOL WINAPI DllMain(HINSTANCE instance, DWORD reason, LPVOID reserved)
{
    return TRUE;
}

#endif // _GLFW_BUILD_DLL

// Load necessary libraries (DLLs)
//
static GLboolean initLibraries(void)
{
#ifndef _GLFW_NO_DLOAD_WINMM
    // winmm.dll (for joystick and timer support)

    _glfw.win32.winmm.instance = LoadLibrary(L"winmm.dll");
    if (!_glfw.win32.winmm.instance)
        return GL_FALSE;

    _glfw.win32.winmm.joyGetDevCaps = (JOYGETDEVCAPS_T)
        GetProcAddress(_glfw.win32.winmm.instance, "joyGetDevCapsW");
    _glfw.win32.winmm.joyGetPos = (JOYGETPOS_T)
        GetProcAddress(_glfw.win32.winmm.instance, "joyGetPos");
    _glfw.win32.winmm.joyGetPosEx = (JOYGETPOSEX_T)
        GetProcAddress(_glfw.win32.winmm.instance, "joyGetPosEx");
    _glfw.win32.winmm.timeGetTime = (TIMEGETTIME_T)
        GetProcAddress(_glfw.win32.winmm.instance, "timeGetTime");

    if (!_glfw.win32.winmm.joyGetDevCaps ||
        !_glfw.win32.winmm.joyGetPos ||
        !_glfw.win32.winmm.joyGetPosEx ||
        !_glfw.win32.winmm.timeGetTime)
    {
        return GL_FALSE;
    }
#endif // _GLFW_NO_DLOAD_WINMM

    return GL_TRUE;
}

// Unload used libraries (DLLs)
//
static void freeLibraries(void)
{
#ifndef _GLFW_NO_DLOAD_WINMM
    if (_glfw.win32.winmm.instance != NULL)
    {
        FreeLibrary(_glfw.win32.winmm.instance);
        _glfw.win32.winmm.instance = NULL;
    }
#endif // _GLFW_NO_DLOAD_WINMM
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW internal API                      //////
//////////////////////////////////////////////////////////////////////////

// Returns a wide string version of the specified UTF-8 string
//
WCHAR* _glfwCreateWideStringFromUTF8(const char* source)
{
    WCHAR* target;
    int length;

    length = MultiByteToWideChar(CP_UTF8, 0, source, -1, NULL, 0);
    if (!length)
        return NULL;

    target = (WCHAR*) malloc(sizeof(WCHAR) * (length + 1));

    if (!MultiByteToWideChar(CP_UTF8, 0, source, -1, target, length + 1))
    {
        free(target);
        return NULL;
    }

    return target;
}

// Returns a UTF-8 string version of the specified wide string
//
char* _glfwCreateUTF8FromWideString(const WCHAR* source)
{
    char* target;
    int length;

    length = WideCharToMultiByte(CP_UTF8, 0, source, -1, NULL, 0, NULL, NULL);
    if (!length)
        return NULL;

    target = (char*) malloc(length + 1);

    if (!WideCharToMultiByte(CP_UTF8, 0, source, -1, target, length + 1, NULL, NULL))
    {
        free(target);
        return NULL;
    }

    return target;
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW platform API                      //////
//////////////////////////////////////////////////////////////////////////

int _glfwPlatformInit(void)
{
    // To make SetForegroundWindow work as we want, we need to fiddle
    // with the FOREGROUNDLOCKTIMEOUT system setting (we do this as early
    // as possible in the hope of still being the foreground process)
    SystemParametersInfo(SPI_GETFOREGROUNDLOCKTIMEOUT, 0,
                         &_glfw.win32.foregroundLockTimeout, 0);
    SystemParametersInfo(SPI_SETFOREGROUNDLOCKTIMEOUT, 0, UIntToPtr(0),
                         SPIF_SENDCHANGE);

    if (!initLibraries())
        return GL_FALSE;

#ifdef __BORLANDC__
    // With the Borland C++ compiler, we want to disable FPU exceptions
    // (this is recommended for OpenGL applications under Windows)
    _control87(MCW_EM, MCW_EM);
#endif

    if (!_glfwInitContextAPI())
        return GL_FALSE;

    _glfwInitTimer();

    _glfwInitJoysticks();

    return GL_TRUE;
}

void _glfwPlatformTerminate(void)
{
    if (_glfw.win32.classAtom)
    {
        UnregisterClass(_GLFW_WNDCLASSNAME, GetModuleHandle(NULL));
        _glfw.win32.classAtom = 0;
    }

    _glfwTerminateContextAPI();

    _glfwTerminateJoysticks();

    freeLibraries();

    // Restore previous FOREGROUNDLOCKTIMEOUT system setting
    SystemParametersInfo(SPI_SETFOREGROUNDLOCKTIMEOUT, 0,
                         UIntToPtr(_glfw.win32.foregroundLockTimeout),
                         SPIF_SENDCHANGE);
}

const char* _glfwPlatformGetVersionString(void)
{
    const char* version = _GLFW_VERSION_FULL " Win32"
#if defined(_GLFW_WGL)
        " WGL"
#elif defined(_GLFW_EGL)
        " EGL"
#endif
#if defined(__MINGW32__)
        " MinGW"
#elif defined(_MSC_VER)
        " VisualC "
#elif defined(__BORLANDC__)
        " BorlandC"
#endif
#if !defined(_GLFW_NO_DLOAD_WINMM)
        " LoadLibrary(winmm)"
#endif
#if defined(_GLFW_BUILD_DLL)
        " DLL"
#endif
        ;

    return version;
}

