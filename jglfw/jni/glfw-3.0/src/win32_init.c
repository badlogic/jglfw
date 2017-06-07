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

// Create key code translation tables
//
static void createKeyTables(void)
{
	int scancode;

	memset(_glfw.win32.keycodes, -1, sizeof(_glfw.win32.keycodes));
	memset(_glfw.win32.scancodes, -1, sizeof(_glfw.win32.scancodes));

	_glfw.win32.keycodes[0x00B] = GLFW_KEY_0;
	_glfw.win32.keycodes[0x002] = GLFW_KEY_1;
	_glfw.win32.keycodes[0x003] = GLFW_KEY_2;
	_glfw.win32.keycodes[0x004] = GLFW_KEY_3;
	_glfw.win32.keycodes[0x005] = GLFW_KEY_4;
	_glfw.win32.keycodes[0x006] = GLFW_KEY_5;
	_glfw.win32.keycodes[0x007] = GLFW_KEY_6;
	_glfw.win32.keycodes[0x008] = GLFW_KEY_7;
	_glfw.win32.keycodes[0x009] = GLFW_KEY_8;
	_glfw.win32.keycodes[0x00A] = GLFW_KEY_9;
	_glfw.win32.keycodes[0x01E] = GLFW_KEY_A;
	_glfw.win32.keycodes[0x030] = GLFW_KEY_B;
	_glfw.win32.keycodes[0x02E] = GLFW_KEY_C;
	_glfw.win32.keycodes[0x020] = GLFW_KEY_D;
	_glfw.win32.keycodes[0x012] = GLFW_KEY_E;
	_glfw.win32.keycodes[0x021] = GLFW_KEY_F;
	_glfw.win32.keycodes[0x022] = GLFW_KEY_G;
	_glfw.win32.keycodes[0x023] = GLFW_KEY_H;
	_glfw.win32.keycodes[0x017] = GLFW_KEY_I;
	_glfw.win32.keycodes[0x024] = GLFW_KEY_J;
	_glfw.win32.keycodes[0x025] = GLFW_KEY_K;
	_glfw.win32.keycodes[0x026] = GLFW_KEY_L;
	_glfw.win32.keycodes[0x032] = GLFW_KEY_M;
	_glfw.win32.keycodes[0x031] = GLFW_KEY_N;
	_glfw.win32.keycodes[0x018] = GLFW_KEY_O;
	_glfw.win32.keycodes[0x019] = GLFW_KEY_P;
	_glfw.win32.keycodes[0x010] = GLFW_KEY_Q;
	_glfw.win32.keycodes[0x013] = GLFW_KEY_R;
	_glfw.win32.keycodes[0x01F] = GLFW_KEY_S;
	_glfw.win32.keycodes[0x014] = GLFW_KEY_T;
	_glfw.win32.keycodes[0x016] = GLFW_KEY_U;
	_glfw.win32.keycodes[0x02F] = GLFW_KEY_V;
	_glfw.win32.keycodes[0x011] = GLFW_KEY_W;
	_glfw.win32.keycodes[0x02D] = GLFW_KEY_X;
	_glfw.win32.keycodes[0x015] = GLFW_KEY_Y;
	_glfw.win32.keycodes[0x02C] = GLFW_KEY_Z;

	_glfw.win32.keycodes[0x028] = GLFW_KEY_APOSTROPHE;
	_glfw.win32.keycodes[0x02B] = GLFW_KEY_BACKSLASH;
	_glfw.win32.keycodes[0x033] = GLFW_KEY_COMMA;
	_glfw.win32.keycodes[0x00D] = GLFW_KEY_EQUAL;
	_glfw.win32.keycodes[0x029] = GLFW_KEY_GRAVE_ACCENT;
	_glfw.win32.keycodes[0x01A] = GLFW_KEY_LEFT_BRACKET;
	_glfw.win32.keycodes[0x00C] = GLFW_KEY_MINUS;
	_glfw.win32.keycodes[0x034] = GLFW_KEY_PERIOD;
	_glfw.win32.keycodes[0x01B] = GLFW_KEY_RIGHT_BRACKET;
	_glfw.win32.keycodes[0x027] = GLFW_KEY_SEMICOLON;
	_glfw.win32.keycodes[0x035] = GLFW_KEY_SLASH;
	_glfw.win32.keycodes[0x056] = GLFW_KEY_WORLD_2;

	_glfw.win32.keycodes[0x00E] = GLFW_KEY_BACKSPACE;
	_glfw.win32.keycodes[0x153] = GLFW_KEY_DELETE;
	_glfw.win32.keycodes[0x14F] = GLFW_KEY_END;
	_glfw.win32.keycodes[0x01C] = GLFW_KEY_ENTER;
	_glfw.win32.keycodes[0x001] = GLFW_KEY_ESCAPE;
	_glfw.win32.keycodes[0x147] = GLFW_KEY_HOME;
	_glfw.win32.keycodes[0x152] = GLFW_KEY_INSERT;
	_glfw.win32.keycodes[0x15D] = GLFW_KEY_MENU;
	_glfw.win32.keycodes[0x151] = GLFW_KEY_PAGE_DOWN;
	_glfw.win32.keycodes[0x149] = GLFW_KEY_PAGE_UP;
	_glfw.win32.keycodes[0x045] = GLFW_KEY_PAUSE;
	_glfw.win32.keycodes[0x146] = GLFW_KEY_PAUSE;
	_glfw.win32.keycodes[0x039] = GLFW_KEY_SPACE;
	_glfw.win32.keycodes[0x00F] = GLFW_KEY_TAB;
	_glfw.win32.keycodes[0x03A] = GLFW_KEY_CAPS_LOCK;
	_glfw.win32.keycodes[0x145] = GLFW_KEY_NUM_LOCK;
	_glfw.win32.keycodes[0x046] = GLFW_KEY_SCROLL_LOCK;
	_glfw.win32.keycodes[0x03B] = GLFW_KEY_F1;
	_glfw.win32.keycodes[0x03C] = GLFW_KEY_F2;
	_glfw.win32.keycodes[0x03D] = GLFW_KEY_F3;
	_glfw.win32.keycodes[0x03E] = GLFW_KEY_F4;
	_glfw.win32.keycodes[0x03F] = GLFW_KEY_F5;
	_glfw.win32.keycodes[0x040] = GLFW_KEY_F6;
	_glfw.win32.keycodes[0x041] = GLFW_KEY_F7;
	_glfw.win32.keycodes[0x042] = GLFW_KEY_F8;
	_glfw.win32.keycodes[0x043] = GLFW_KEY_F9;
	_glfw.win32.keycodes[0x044] = GLFW_KEY_F10;
	_glfw.win32.keycodes[0x057] = GLFW_KEY_F11;
	_glfw.win32.keycodes[0x058] = GLFW_KEY_F12;
	_glfw.win32.keycodes[0x064] = GLFW_KEY_F13;
	_glfw.win32.keycodes[0x065] = GLFW_KEY_F14;
	_glfw.win32.keycodes[0x066] = GLFW_KEY_F15;
	_glfw.win32.keycodes[0x067] = GLFW_KEY_F16;
	_glfw.win32.keycodes[0x068] = GLFW_KEY_F17;
	_glfw.win32.keycodes[0x069] = GLFW_KEY_F18;
	_glfw.win32.keycodes[0x06A] = GLFW_KEY_F19;
	_glfw.win32.keycodes[0x06B] = GLFW_KEY_F20;
	_glfw.win32.keycodes[0x06C] = GLFW_KEY_F21;
	_glfw.win32.keycodes[0x06D] = GLFW_KEY_F22;
	_glfw.win32.keycodes[0x06E] = GLFW_KEY_F23;
	_glfw.win32.keycodes[0x076] = GLFW_KEY_F24;
	_glfw.win32.keycodes[0x038] = GLFW_KEY_LEFT_ALT;
	_glfw.win32.keycodes[0x01D] = GLFW_KEY_LEFT_CONTROL;
	_glfw.win32.keycodes[0x02A] = GLFW_KEY_LEFT_SHIFT;
	_glfw.win32.keycodes[0x15B] = GLFW_KEY_LEFT_SUPER;
	_glfw.win32.keycodes[0x137] = GLFW_KEY_PRINT_SCREEN;
	_glfw.win32.keycodes[0x138] = GLFW_KEY_RIGHT_ALT;
	_glfw.win32.keycodes[0x11D] = GLFW_KEY_RIGHT_CONTROL;
	_glfw.win32.keycodes[0x036] = GLFW_KEY_RIGHT_SHIFT;
	_glfw.win32.keycodes[0x15C] = GLFW_KEY_RIGHT_SUPER;
	_glfw.win32.keycodes[0x150] = GLFW_KEY_DOWN;
	_glfw.win32.keycodes[0x14B] = GLFW_KEY_LEFT;
	_glfw.win32.keycodes[0x14D] = GLFW_KEY_RIGHT;
	_glfw.win32.keycodes[0x148] = GLFW_KEY_UP;

	_glfw.win32.keycodes[0x052] = GLFW_KEY_KP_0;
	_glfw.win32.keycodes[0x04F] = GLFW_KEY_KP_1;
	_glfw.win32.keycodes[0x050] = GLFW_KEY_KP_2;
	_glfw.win32.keycodes[0x051] = GLFW_KEY_KP_3;
	_glfw.win32.keycodes[0x04B] = GLFW_KEY_KP_4;
	_glfw.win32.keycodes[0x04C] = GLFW_KEY_KP_5;
	_glfw.win32.keycodes[0x04D] = GLFW_KEY_KP_6;
	_glfw.win32.keycodes[0x047] = GLFW_KEY_KP_7;
	_glfw.win32.keycodes[0x048] = GLFW_KEY_KP_8;
	_glfw.win32.keycodes[0x049] = GLFW_KEY_KP_9;
	_glfw.win32.keycodes[0x04E] = GLFW_KEY_KP_ADD;
	_glfw.win32.keycodes[0x053] = GLFW_KEY_KP_DECIMAL;
	_glfw.win32.keycodes[0x135] = GLFW_KEY_KP_DIVIDE;
	_glfw.win32.keycodes[0x11C] = GLFW_KEY_KP_ENTER;
	_glfw.win32.keycodes[0x037] = GLFW_KEY_KP_MULTIPLY;
	_glfw.win32.keycodes[0x04A] = GLFW_KEY_KP_SUBTRACT;

	for (scancode = 0; scancode < 512; scancode++)
	{
		if (_glfw.win32.keycodes[scancode] > 0)
			_glfw.win32.scancodes[_glfw.win32.keycodes[scancode]] = scancode;
	}
}

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

	createKeyTables();

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

