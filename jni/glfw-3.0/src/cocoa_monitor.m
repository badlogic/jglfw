//========================================================================
// GLFW - An OpenGL library
// Platform:    Cocoa
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
#include <limits.h>

#include <IOKit/graphics/IOGraphicsLib.h>


// Get the name of the specified display
//
const char* getDisplayName(CGDirectDisplayID displayID)
{
    char* name;
    CFDictionaryRef info, names;
    CFStringRef value;
    CFIndex size;

    info = IODisplayCreateInfoDictionary(CGDisplayIOServicePort(displayID),
                                         kIODisplayOnlyPreferredName);
    names = CFDictionaryGetValue(info, CFSTR(kDisplayProductName));

    if (!CFDictionaryGetValueIfPresent(names, CFSTR("en_US"),
                                       (const void**) &value))
    {
        CFRelease(info);
        return strdup("Unknown");
    }

    size = CFStringGetMaximumSizeForEncoding(CFStringGetLength(value),
                                             kCFStringEncodingUTF8);
    name = (char*) malloc(size + 1);
    CFStringGetCString(value, name, size, kCFStringEncodingUTF8);

    CFRelease(info);

    return name;
}

// Check whether the display mode should be included in enumeration
//
static GLboolean modeIsGood(CGDisplayModeRef mode)
{
    uint32_t flags = CGDisplayModeGetIOFlags(mode);
    if (!(flags & kDisplayModeValidFlag) || !(flags & kDisplayModeSafeFlag))
        return GL_FALSE;

    if (flags & kDisplayModeInterlacedFlag)
        return GL_FALSE;

    if (flags & kDisplayModeTelevisionFlag)
        return GL_FALSE;

    if (flags & kDisplayModeStretchedFlag)
        return GL_FALSE;

    CFStringRef format = CGDisplayModeCopyPixelEncoding(mode);
    if (CFStringCompare(format, CFSTR(IO16BitDirectPixels), 0) &&
        CFStringCompare(format, CFSTR(IO32BitDirectPixels), 0))
    {
        CFRelease(format);
        return GL_FALSE;
    }

    CFRelease(format);
    return GL_TRUE;
}

// Convert Core Graphics display mode to GLFW video mode
//
static GLFWvidmode vidmodeFromCGDisplayMode(CGDisplayModeRef mode)
{
    GLFWvidmode result;
    result.width = CGDisplayModeGetWidth(mode);
    result.height = CGDisplayModeGetHeight(mode);

    CFStringRef format = CGDisplayModeCopyPixelEncoding(mode);

    if (CFStringCompare(format, CFSTR(IO16BitDirectPixels), 0) == 0)
    {
        result.redBits = 5;
        result.greenBits = 5;
        result.blueBits = 5;
    }
    else
    {
        result.redBits = 8;
        result.greenBits = 8;
        result.blueBits = 8;
    }

    CFRelease(format);
    return result;
}

// Starts reservation for display fading
//
static CGDisplayFadeReservationToken beginFadeReservation(void)
{
    CGDisplayFadeReservationToken token = kCGDisplayFadeReservationInvalidToken;

    if (CGAcquireDisplayFadeReservation(5, &token) == kCGErrorSuccess)
        CGDisplayFade(token, 0.3, kCGDisplayBlendNormal, kCGDisplayBlendSolidColor, 0.0, 0.0, 0.0, TRUE);

    return token;
}

// Ends reservation for display fading
//
static void endFadeReservation(CGDisplayFadeReservationToken token)
{
    if (token != kCGDisplayFadeReservationInvalidToken)
    {
        CGDisplayFade(token, 0.5, kCGDisplayBlendSolidColor, kCGDisplayBlendNormal, 0.0, 0.0, 0.0, FALSE);
        CGReleaseDisplayFadeReservation(token);
    }
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW internal API                      //////
//////////////////////////////////////////////////////////////////////////

// Change the current video mode
//
GLboolean _glfwSetVideoMode(_GLFWmonitor* monitor, int* width, int* height, int* bpp)
{
    CGDisplayModeRef bestMode = NULL;
    CFArrayRef modes;
    CFIndex count, i;
    unsigned int leastSizeDiff = UINT_MAX;

    modes = CGDisplayCopyAllDisplayModes(monitor->ns.displayID, NULL);
    count = CFArrayGetCount(modes);

    for (i = 0;  i < count;  i++)
    {
        CGDisplayModeRef mode = (CGDisplayModeRef) CFArrayGetValueAtIndex(modes, i);
        if (!modeIsGood(mode))
            continue;

        int modeBPP;

        // Identify display mode pixel encoding
        {
            CFStringRef format = CGDisplayModeCopyPixelEncoding(mode);

            if (CFStringCompare(format, CFSTR(IO16BitDirectPixels), 0) == 0)
                modeBPP = 16;
            else
                modeBPP = 32;

            CFRelease(format);
        }

        int modeWidth = (int) CGDisplayModeGetWidth(mode);
        int modeHeight = (int) CGDisplayModeGetHeight(mode);

        unsigned int sizeDiff = (abs(modeBPP - *bpp) << 25) |
                                ((modeWidth - *width) * (modeWidth - *width) +
                                 (modeHeight - *height) * (modeHeight - *height));

        if (sizeDiff < leastSizeDiff)
        {
            bestMode = mode;

            leastSizeDiff = sizeDiff;
        }
    }

    if (!bestMode)
    {
        CFRelease(modes);
        return GL_FALSE;
    }

    monitor->ns.previousMode = CGDisplayCopyDisplayMode(monitor->ns.displayID);

    CGDisplayFadeReservationToken token = beginFadeReservation();

    CGDisplayCapture(monitor->ns.displayID);
    CGDisplaySetDisplayMode(monitor->ns.displayID, bestMode, NULL);

    endFadeReservation(token);

    CFRelease(modes);
    return GL_TRUE;
}

// Restore the previously saved (original) video mode
//
void _glfwRestoreVideoMode(_GLFWmonitor* monitor)
{
    CGDisplayFadeReservationToken token = beginFadeReservation();

    CGDisplaySetDisplayMode(monitor->ns.displayID, monitor->ns.previousMode, NULL);
    CGDisplayRelease(monitor->ns.displayID);

    endFadeReservation(token);
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW platform API                      //////
//////////////////////////////////////////////////////////////////////////

_GLFWmonitor** _glfwPlatformGetMonitors(int* count)
{
    uint32_t i, found = 0, monitorCount;
    _GLFWmonitor** monitors;
    CGDirectDisplayID* displays;

    *count = 0;

    CGGetActiveDisplayList(0, NULL, &monitorCount);

    displays = (CGDirectDisplayID*) calloc(monitorCount, sizeof(CGDirectDisplayID));
    if (!displays)
    {
        _glfwInputError(GLFW_OUT_OF_MEMORY, NULL);
        return NULL;
    }

    CGGetActiveDisplayList(monitorCount, displays, &monitorCount);

    monitors = (_GLFWmonitor**) calloc(monitorCount, sizeof(_GLFWmonitor*));
    if (!monitors)
    {
        _glfwInputError(GLFW_OUT_OF_MEMORY, NULL);
        return NULL;
    }

    for (i = 0;  i < monitorCount;  i++)
    {
        const CGSize size = CGDisplayScreenSize(displays[i]);

        monitors[found] = _glfwCreateMonitor(getDisplayName(displays[i]),
                                             size.width, size.height);

        monitors[found]->ns.displayID = displays[i];
        found++;
    }

    free(displays);

    for (i = 0;  i < monitorCount;  i++)
    {
        if (CGDisplayIsMain(monitors[i]->ns.displayID))
        {
            _GLFWmonitor* temp = monitors[0];
            monitors[0] = monitors[i];
            monitors[i] = temp;
            break;
        }
    }

    *count = monitorCount;
    return monitors;
}

void _glfwPlatformGetMonitorPos(_GLFWmonitor* monitor, int* xpos, int* ypos)
{
    const CGRect bounds = CGDisplayBounds(monitor->ns.displayID);

    if (xpos)
        *xpos = (int) bounds.origin.x;
    if (ypos)
        *ypos = (int) bounds.origin.y;
}

GLFWvidmode* _glfwPlatformGetVideoModes(_GLFWmonitor* monitor, int* found)
{
    CFArrayRef modes;
    CFIndex count, i;
    GLFWvidmode* result;

    modes = CGDisplayCopyAllDisplayModes(monitor->ns.displayID, NULL);
    count = CFArrayGetCount(modes);

    result = (GLFWvidmode*) malloc(sizeof(GLFWvidmode) * count);
    *found = 0;

    for (i = 0;  i < count;  i++)
    {
        CGDisplayModeRef mode;

        mode = (CGDisplayModeRef) CFArrayGetValueAtIndex(modes, i);
        if (modeIsGood(mode))
        {
            result[*found] = vidmodeFromCGDisplayMode(mode);
            (*found)++;
        }
    }

    CFRelease(modes);
    return result;
}

void _glfwPlatformGetVideoMode(_GLFWmonitor* monitor, GLFWvidmode *mode)
{
    CGDisplayModeRef displayMode;

    displayMode = CGDisplayCopyDisplayMode(monitor->ns.displayID);
    *mode = vidmodeFromCGDisplayMode(displayMode);
    CGDisplayModeRelease(displayMode);
}

