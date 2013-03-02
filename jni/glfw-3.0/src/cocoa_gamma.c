//========================================================================
// GLFW - An OpenGL library
// Platform:    Cocoa
// API version: 3.0
// WWW:         http://www.glfw.org/
//------------------------------------------------------------------------
// Copyright (c) 2010 Camilla Berglund <elmindreda@elmindreda.org>
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

#include <limits.h>
#include <string.h>

#include <ApplicationServices/ApplicationServices.h>


//////////////////////////////////////////////////////////////////////////
//////                       GLFW platform API                      //////
//////////////////////////////////////////////////////////////////////////

void _glfwPlatformGetGammaRamp(_GLFWmonitor* monitor, GLFWgammaramp* ramp)
{
    // TODO: Support ramp sizes other than 256

    uint32_t sampleCount;
    int i;
    CGGammaValue red[GLFW_GAMMA_RAMP_SIZE];
    CGGammaValue green[GLFW_GAMMA_RAMP_SIZE];
    CGGammaValue blue[GLFW_GAMMA_RAMP_SIZE];

    if (CGDisplayGammaTableCapacity(monitor->ns.displayID) !=
        GLFW_GAMMA_RAMP_SIZE)
    {
        _glfwInputError(GLFW_PLATFORM_ERROR,
                        "Cocoa: Only gamma ramps of size 256 supported");
        return;
    }

    CGGetDisplayTransferByTable(monitor->ns.displayID,
                                GLFW_GAMMA_RAMP_SIZE,
                                red, green, blue,
                                &sampleCount);

    for (i = 0; i < GLFW_GAMMA_RAMP_SIZE; i++)
    {
        ramp->red[i] = red[i] * 65535;
        ramp->green[i] = green[i] * 65535;
        ramp->blue[i] = blue[i] * 65535;
    }
}

void _glfwPlatformSetGammaRamp(_GLFWmonitor* monitor, const GLFWgammaramp* ramp)
{
    // TODO: Support ramp sizes other than 256

    int i;
    int size = GLFW_GAMMA_RAMP_SIZE;
    CGGammaValue red[GLFW_GAMMA_RAMP_SIZE];
    CGGammaValue green[GLFW_GAMMA_RAMP_SIZE];
    CGGammaValue blue[GLFW_GAMMA_RAMP_SIZE];

    if (CGDisplayGammaTableCapacity(monitor->ns.displayID) !=
        GLFW_GAMMA_RAMP_SIZE)
    {
        _glfwInputError(GLFW_PLATFORM_ERROR,
                        "Cocoa: Only gamma ramps of size 256 supported");
        return;
    }

    // Convert to float & take the difference of the original gamma and
    // the linear function.
    for (i = 0; i < size; i++)
    {
        red[i] = ramp->red[i] / 65535.f;
        green[i] = ramp->green[i] / 65535.f;
        blue[i] = ramp->blue[i] / 65535.f;
    }

    CGSetDisplayTransferByTable(monitor->ns.displayID,
                                GLFW_GAMMA_RAMP_SIZE,
                                red, green, blue);
}

