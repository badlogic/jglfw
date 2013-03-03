//========================================================================
// GLFW - An OpenGL library
// Platform:    Cocoa/NSOpenGL
// API Version: 3.0
// WWW:         http://www.glfw.org/
//------------------------------------------------------------------------
// Copyright (c) 2009-2010 Camilla Berglund <elmindreda@elmindreda.org>
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

// Needed for _NSGetProgname
#include <crt_externs.h>


//------------------------------------------------------------------------
// Delegate for window related notifications
//------------------------------------------------------------------------

@interface GLFWWindowDelegate : NSObject
{
    _GLFWwindow* window;
}

- (id)initWithGlfwWindow:(_GLFWwindow *)initWndow;

@end

@implementation GLFWWindowDelegate

- (id)initWithGlfwWindow:(_GLFWwindow *)initWindow
{
    self = [super init];
    if (self != nil)
        window = initWindow;

    return self;
}

- (BOOL)windowShouldClose:(id)sender
{
    _glfwInputWindowCloseRequest(window);
    return NO;
}

- (void)windowDidResize:(NSNotification *)notification
{
    [window->nsgl.context update];

    int width, height;
    _glfwPlatformGetWindowSize(window, &width, &height);
    _glfwInputWindowSize(window, width, height);
}

- (void)windowDidMove:(NSNotification *)notification
{
    [window->nsgl.context update];

    int x, y;
    _glfwPlatformGetWindowPos(window, &x, &y);
    _glfwInputWindowPos(window, x, y);
}

- (void)windowDidMiniaturize:(NSNotification *)notification
{
    _glfwInputWindowIconify(window, GL_TRUE);
}

- (void)windowDidDeminiaturize:(NSNotification *)notification
{
    _glfwInputWindowIconify(window, GL_FALSE);
}

- (void)windowDidBecomeKey:(NSNotification *)notification
{
    _glfwInputWindowFocus(window, GL_TRUE);
}

- (void)windowDidResignKey:(NSNotification *)notification
{
    _glfwInputWindowFocus(window, GL_FALSE);
}

@end


//------------------------------------------------------------------------
// Delegate for application related notifications
//------------------------------------------------------------------------

@interface GLFWApplicationDelegate : NSObject
@end

@implementation GLFWApplicationDelegate

- (NSApplicationTerminateReply)applicationShouldTerminate:(NSApplication *)sender
{
    _GLFWwindow* window;

    for (window = _glfw.windowListHead;  window;  window = window->next)
        _glfwInputWindowCloseRequest(window);

    return NSTerminateCancel;
}

- (void)applicationDidHide:(NSNotification *)notification
{
    _GLFWwindow* window;

    for (window = _glfw.windowListHead;  window;  window = window->next)
        _glfwInputWindowVisibility(window, GL_FALSE);
}

- (void)applicationDidUnhide:(NSNotification *)notification
{
    _GLFWwindow* window;

    for (window = _glfw.windowListHead;  window;  window = window->next)
    {
        if ([window->ns.object isVisible])
            _glfwInputWindowVisibility(window, GL_TRUE);
    }
}

@end

// Converts a Mac OS X keycode to a GLFW keycode
//
static int convertMacKeyCode(unsigned int macKeyCode)
{
    // Keyboard symbol translation table
    // TODO: Need to find mappings for F13-F15, volume down/up/mute, and eject.
    static const unsigned int table[128] =
    {
        /* 00 */ GLFW_KEY_A,
        /* 01 */ GLFW_KEY_S,
        /* 02 */ GLFW_KEY_D,
        /* 03 */ GLFW_KEY_F,
        /* 04 */ GLFW_KEY_H,
        /* 05 */ GLFW_KEY_G,
        /* 06 */ GLFW_KEY_Z,
        /* 07 */ GLFW_KEY_X,
        /* 08 */ GLFW_KEY_C,
        /* 09 */ GLFW_KEY_V,
        /* 0a */ GLFW_KEY_GRAVE_ACCENT,
        /* 0b */ GLFW_KEY_B,
        /* 0c */ GLFW_KEY_Q,
        /* 0d */ GLFW_KEY_W,
        /* 0e */ GLFW_KEY_E,
        /* 0f */ GLFW_KEY_R,
        /* 10 */ GLFW_KEY_Y,
        /* 11 */ GLFW_KEY_T,
        /* 12 */ GLFW_KEY_1,
        /* 13 */ GLFW_KEY_2,
        /* 14 */ GLFW_KEY_3,
        /* 15 */ GLFW_KEY_4,
        /* 16 */ GLFW_KEY_6,
        /* 17 */ GLFW_KEY_5,
        /* 18 */ GLFW_KEY_EQUAL,
        /* 19 */ GLFW_KEY_9,
        /* 1a */ GLFW_KEY_7,
        /* 1b */ GLFW_KEY_MINUS,
        /* 1c */ GLFW_KEY_8,
        /* 1d */ GLFW_KEY_0,
        /* 1e */ GLFW_KEY_RIGHT_BRACKET,
        /* 1f */ GLFW_KEY_O,
        /* 20 */ GLFW_KEY_U,
        /* 21 */ GLFW_KEY_LEFT_BRACKET,
        /* 22 */ GLFW_KEY_I,
        /* 23 */ GLFW_KEY_P,
        /* 24 */ GLFW_KEY_ENTER,
        /* 25 */ GLFW_KEY_L,
        /* 26 */ GLFW_KEY_J,
        /* 27 */ GLFW_KEY_APOSTROPHE,
        /* 28 */ GLFW_KEY_K,
        /* 29 */ GLFW_KEY_SEMICOLON,
        /* 2a */ GLFW_KEY_BACKSLASH,
        /* 2b */ GLFW_KEY_COMMA,
        /* 2c */ GLFW_KEY_SLASH,
        /* 2d */ GLFW_KEY_N,
        /* 2e */ GLFW_KEY_M,
        /* 2f */ GLFW_KEY_PERIOD,
        /* 30 */ GLFW_KEY_TAB,
        /* 31 */ GLFW_KEY_SPACE,
        /* 32 */ GLFW_KEY_WORLD_1,
        /* 33 */ GLFW_KEY_BACKSPACE,
        /* 34 */ -1,
        /* 35 */ GLFW_KEY_ESCAPE,
        /* 36 */ GLFW_KEY_RIGHT_SUPER,
        /* 37 */ GLFW_KEY_LEFT_SUPER,
        /* 38 */ GLFW_KEY_LEFT_SHIFT,
        /* 39 */ GLFW_KEY_CAPS_LOCK,
        /* 3a */ GLFW_KEY_LEFT_ALT,
        /* 3b */ GLFW_KEY_LEFT_CONTROL,
        /* 3c */ GLFW_KEY_RIGHT_SHIFT,
        /* 3d */ GLFW_KEY_RIGHT_ALT,
        /* 3e */ GLFW_KEY_RIGHT_CONTROL,
        /* 3f */ -1, /* Function */
        /* 40 */ GLFW_KEY_F17,
        /* 41 */ GLFW_KEY_KP_DECIMAL,
        /* 42 */ -1,
        /* 43 */ GLFW_KEY_KP_MULTIPLY,
        /* 44 */ -1,
        /* 45 */ GLFW_KEY_KP_ADD,
        /* 46 */ -1,
        /* 47 */ GLFW_KEY_NUM_LOCK, /* Really KeypadClear... */
        /* 48 */ -1, /* VolumeUp */
        /* 49 */ -1, /* VolumeDown */
        /* 4a */ -1, /* Mute */
        /* 4b */ GLFW_KEY_KP_DIVIDE,
        /* 4c */ GLFW_KEY_KP_ENTER,
        /* 4d */ -1,
        /* 4e */ GLFW_KEY_KP_SUBTRACT,
        /* 4f */ GLFW_KEY_F18,
        /* 50 */ GLFW_KEY_F19,
        /* 51 */ GLFW_KEY_KP_EQUAL,
        /* 52 */ GLFW_KEY_KP_0,
        /* 53 */ GLFW_KEY_KP_1,
        /* 54 */ GLFW_KEY_KP_2,
        /* 55 */ GLFW_KEY_KP_3,
        /* 56 */ GLFW_KEY_KP_4,
        /* 57 */ GLFW_KEY_KP_5,
        /* 58 */ GLFW_KEY_KP_6,
        /* 59 */ GLFW_KEY_KP_7,
        /* 5a */ GLFW_KEY_F20,
        /* 5b */ GLFW_KEY_KP_8,
        /* 5c */ GLFW_KEY_KP_9,
        /* 5d */ -1,
        /* 5e */ -1,
        /* 5f */ -1,
        /* 60 */ GLFW_KEY_F5,
        /* 61 */ GLFW_KEY_F6,
        /* 62 */ GLFW_KEY_F7,
        /* 63 */ GLFW_KEY_F3,
        /* 64 */ GLFW_KEY_F8,
        /* 65 */ GLFW_KEY_F9,
        /* 66 */ -1,
        /* 67 */ GLFW_KEY_F11,
        /* 68 */ -1,
        /* 69 */ GLFW_KEY_PRINT_SCREEN,
        /* 6a */ GLFW_KEY_F16,
        /* 6b */ GLFW_KEY_F14,
        /* 6c */ -1,
        /* 6d */ GLFW_KEY_F10,
        /* 6e */ -1,
        /* 6f */ GLFW_KEY_F12,
        /* 70 */ -1,
        /* 71 */ GLFW_KEY_F15,
        /* 72 */ GLFW_KEY_INSERT, /* Really Help... */
        /* 73 */ GLFW_KEY_HOME,
        /* 74 */ GLFW_KEY_PAGE_UP,
        /* 75 */ GLFW_KEY_DELETE,
        /* 76 */ GLFW_KEY_F4,
        /* 77 */ GLFW_KEY_END,
        /* 78 */ GLFW_KEY_F2,
        /* 79 */ GLFW_KEY_PAGE_DOWN,
        /* 7a */ GLFW_KEY_F1,
        /* 7b */ GLFW_KEY_LEFT,
        /* 7c */ GLFW_KEY_RIGHT,
        /* 7d */ GLFW_KEY_DOWN,
        /* 7e */ GLFW_KEY_UP,
        /* 7f */ -1,
    };

    if (macKeyCode >= 128)
        return -1;

    return table[macKeyCode];
}


//------------------------------------------------------------------------
// Content view class for the GLFW window
//------------------------------------------------------------------------

@interface GLFWContentView : NSView
{
    _GLFWwindow* window;
    NSTrackingArea* trackingArea;
}

- (id)initWithGlfwWindow:(_GLFWwindow *)initWindow;

@end

@implementation GLFWContentView

- (id)initWithGlfwWindow:(_GLFWwindow *)initWindow
{
    self = [super init];
    if (self != nil)
    {
        window = initWindow;
        trackingArea = nil;

        [self updateTrackingAreas];
    }

    return self;
}

-(void)dealloc
{
    [trackingArea release];
    [super dealloc];
}

- (BOOL)isOpaque
{
    return YES;
}

- (BOOL)canBecomeKeyView
{
    return YES;
}

- (BOOL)acceptsFirstResponder
{
    return YES;
}

- (void)mouseDown:(NSEvent *)event
{
    _glfwInputMouseClick(window, GLFW_MOUSE_BUTTON_LEFT, GLFW_PRESS);
}

- (void)mouseDragged:(NSEvent *)event
{
    [self mouseMoved:event];
}

- (void)mouseUp:(NSEvent *)event
{
    _glfwInputMouseClick(window, GLFW_MOUSE_BUTTON_LEFT, GLFW_RELEASE);
}

- (void)mouseMoved:(NSEvent *)event
{
    if (window->cursorMode == GLFW_CURSOR_CAPTURED)
        _glfwInputCursorMotion(window, [event deltaX], [event deltaY]);
    else
    {
        const NSRect contentRect =
            [window->ns.object contentRectForFrameRect:[window->ns.object frame]];
        const NSPoint p = [event locationInWindow];

        // Cocoa coordinate system has origin at lower left
        const int x = lround(floor(p.x));
        const int y = contentRect.size.height - lround(ceil(p.y));

        _glfwInputCursorMotion(window, x, y);
    }
}

- (void)rightMouseDown:(NSEvent *)event
{
    _glfwInputMouseClick(window, GLFW_MOUSE_BUTTON_RIGHT, GLFW_PRESS);
}

- (void)rightMouseDragged:(NSEvent *)event
{
    [self mouseMoved:event];
}

- (void)rightMouseUp:(NSEvent *)event
{
    _glfwInputMouseClick(window, GLFW_MOUSE_BUTTON_RIGHT, GLFW_RELEASE);
}

- (void)otherMouseDown:(NSEvent *)event
{
    _glfwInputMouseClick(window, [event buttonNumber], GLFW_PRESS);
}

- (void)otherMouseDragged:(NSEvent *)event
{
    [self mouseMoved:event];
}

- (void)otherMouseUp:(NSEvent *)event
{
    _glfwInputMouseClick(window, [event buttonNumber], GLFW_RELEASE);
}

- (void)mouseExited:(NSEvent *)event
{
    _glfwInputCursorEnter(window, GL_FALSE);
}

- (void)mouseEntered:(NSEvent *)event
{
    _glfwInputCursorEnter(window, GL_TRUE);
}

- (void)updateTrackingAreas
{
    if (trackingArea != nil)
    {
        [self removeTrackingArea:trackingArea];
        [trackingArea release];
    }

    NSTrackingAreaOptions options = NSTrackingMouseEnteredAndExited |
                                    NSTrackingActiveAlways |
                                    NSTrackingInVisibleRect;

    trackingArea = [[NSTrackingArea alloc] initWithRect:[self bounds]
                                                options:options
                                                  owner:self
                                               userInfo:nil];

    [self addTrackingArea:trackingArea];
	[super updateTrackingAreas];
}

- (void)keyDown:(NSEvent *)event
{
    NSUInteger i, length;
    NSString* characters;
    const int key = convertMacKeyCode([event keyCode]);
    if (key == -1)
        return;

    _glfwInputKey(window, key, GLFW_PRESS);

    if ([event modifierFlags] & NSCommandKeyMask)
        [super keyDown:event];
    else
    {
        characters = [event characters];
        length = [characters length];

        for (i = 0;  i < length;  i++)
            _glfwInputChar(window, [characters characterAtIndex:i]);
    }
}

- (void)flagsChanged:(NSEvent *)event
{
    int mode, key;
    unsigned int newModifierFlags =
        [event modifierFlags] | NSDeviceIndependentModifierFlagsMask;

    if (newModifierFlags > window->ns.modifierFlags)
        mode = GLFW_PRESS;
    else
        mode = GLFW_RELEASE;

    window->ns.modifierFlags = newModifierFlags;

    key = convertMacKeyCode([event keyCode]);
    if (key != -1)
      _glfwInputKey(window, key, mode);
}

- (void)keyUp:(NSEvent *)event
{
    int key = convertMacKeyCode([event keyCode]);
    if (key != -1)
        _glfwInputKey(window, key, GLFW_RELEASE);
}

- (void)scrollWheel:(NSEvent *)event
{
    double deltaX = [event deltaX];
    double deltaY = [event deltaY];

    if (fabs(deltaX) > 0.0 || fabs(deltaY) > 0.0)
        _glfwInputScroll(window, deltaX, deltaY);
}

@end


//------------------------------------------------------------------------
// GLFW application class
//------------------------------------------------------------------------

@interface GLFWApplication : NSApplication
@end

@implementation GLFWApplication

// From http://cocoadev.com/index.pl?GameKeyboardHandlingAlmost
// This works around an AppKit bug, where key up events while holding
// down the command key don't get sent to the key window.
- (void)sendEvent:(NSEvent *)event
{
    if ([event type] == NSKeyUp && ([event modifierFlags] & NSCommandKeyMask))
        [[self keyWindow] sendEvent:event];
    else
        [super sendEvent:event];
}

@end

#if defined(_GLFW_USE_MENUBAR)

// Try to figure out what the calling application is called
//
static NSString* findAppName(void)
{
    unsigned int i;
    NSDictionary* infoDictionary = [[NSBundle mainBundle] infoDictionary];

    // Keys to search for as potential application names
    NSString* GLFWNameKeys[] =
    {
        @"CFBundleDisplayName",
        @"CFBundleName",
        @"CFBundleExecutable",
    };

    for (i = 0;  i < sizeof(GLFWNameKeys) / sizeof(GLFWNameKeys[0]);  i++)
    {
        id name = [infoDictionary objectForKey:GLFWNameKeys[i]];
        if (name &&
            [name isKindOfClass:[NSString class]] &&
            ![@"" isEqualToString:name])
        {
            return name;
        }
    }

    // If we get here, the application is unbundled
    ProcessSerialNumber psn = { 0, kCurrentProcess };
    TransformProcessType(&psn, kProcessTransformToForegroundApplication);

    // Having the app in front of the terminal window is also generally
    // handy.  There is an NSApplication API to do this, but...
    SetFrontProcess(&psn);

    char** progname = _NSGetProgname();
    if (progname && *progname)
        return [NSString stringWithUTF8String:*progname];

    // Really shouldn't get here
    return @"GLFW Application";
}

// Set up the menu bar (manually)
// This is nasty, nasty stuff -- calls to undocumented semi-private APIs that
// could go away at any moment, lots of stuff that really should be
// localize(d|able), etc.  Loading a nib would save us this horror, but that
// doesn't seem like a good thing to require of GLFW's clients.
//
static void createMenuBar(void)
{
    NSString* appName = findAppName();

    NSMenu* bar = [[NSMenu alloc] init];
    [NSApp setMainMenu:bar];

    NSMenuItem* appMenuItem =
        [bar addItemWithTitle:@"" action:NULL keyEquivalent:@""];
    NSMenu* appMenu = [[NSMenu alloc] init];
    [appMenuItem setSubmenu:appMenu];

    [appMenu addItemWithTitle:[NSString stringWithFormat:@"About %@", appName]
                       action:@selector(orderFrontStandardAboutPanel:)
                keyEquivalent:@""];
    [appMenu addItem:[NSMenuItem separatorItem]];
    NSMenu* servicesMenu = [[NSMenu alloc] init];
    [NSApp setServicesMenu:servicesMenu];
    [[appMenu addItemWithTitle:@"Services"
                       action:NULL
                keyEquivalent:@""] setSubmenu:servicesMenu];
    [appMenu addItem:[NSMenuItem separatorItem]];
    [appMenu addItemWithTitle:[NSString stringWithFormat:@"Hide %@", appName]
                       action:@selector(hide:)
                keyEquivalent:@"h"];
    [[appMenu addItemWithTitle:@"Hide Others"
                       action:@selector(hideOtherApplications:)
                keyEquivalent:@"h"]
        setKeyEquivalentModifierMask:NSAlternateKeyMask | NSCommandKeyMask];
    [appMenu addItemWithTitle:@"Show All"
                       action:@selector(unhideAllApplications:)
                keyEquivalent:@""];
    [appMenu addItem:[NSMenuItem separatorItem]];
    [appMenu addItemWithTitle:[NSString stringWithFormat:@"Quit %@", appName]
                       action:@selector(terminate:)
                keyEquivalent:@"q"];

    NSMenuItem* windowMenuItem =
        [bar addItemWithTitle:@"" action:NULL keyEquivalent:@""];
    NSMenu* windowMenu = [[NSMenu alloc] initWithTitle:@"Window"];
    [NSApp setWindowsMenu:windowMenu];
    [windowMenuItem setSubmenu:windowMenu];

    [windowMenu addItemWithTitle:@"Miniaturize"
                          action:@selector(performMiniaturize:)
                   keyEquivalent:@"m"];
    [windowMenu addItemWithTitle:@"Zoom"
                          action:@selector(performZoom:)
                   keyEquivalent:@""];
    [windowMenu addItem:[NSMenuItem separatorItem]];
    [windowMenu addItemWithTitle:@"Bring All to Front"
                          action:@selector(arrangeInFront:)
                   keyEquivalent:@""];

    // Prior to Snow Leopard, we need to use this oddly-named semi-private API
    // to get the application menu working properly.
    [NSApp performSelector:@selector(setAppleMenu:) withObject:appMenu];
}

#endif /* _GLFW_USE_MENUBAR */

// Initialize the Cocoa Application Kit
//
static GLboolean initializeAppKit(void)
{
    if (NSApp)
        return GL_TRUE;

    // Implicitly create shared NSApplication instance
    [GLFWApplication sharedApplication];

#if defined(_GLFW_USE_MENUBAR)
    // Menu bar setup must go between sharedApplication above and
    // finishLaunching below, in order to properly emulate the behavior
    // of NSApplicationMain
    createMenuBar();
#endif

    [NSApp finishLaunching];

    return GL_TRUE;
}

// Create the Cocoa window
//
static GLboolean createWindow(_GLFWwindow* window,
                              const _GLFWwndconfig* wndconfig)
{
    unsigned int styleMask = 0;

    if (wndconfig->monitor)
        styleMask = NSBorderlessWindowMask;
    else
    {
        styleMask = NSTitledWindowMask | NSClosableWindowMask |
                    NSMiniaturizableWindowMask;

        if (wndconfig->resizable)
            styleMask |= NSResizableWindowMask;
    }

    window->ns.object = [[NSWindow alloc]
        initWithContentRect:NSMakeRect(0, 0, wndconfig->width, wndconfig->height)
                  styleMask:styleMask
                    backing:NSBackingStoreBuffered
                      defer:NO];

    if (window->ns.object == nil)
    {
        _glfwInputError(GLFW_PLATFORM_ERROR, "Cocoa: Failed to create window");
        return GL_FALSE;
    }

    window->ns.view = [[GLFWContentView alloc] initWithGlfwWindow:window];

    [window->ns.object setTitle:[NSString stringWithUTF8String:wndconfig->title]];
    [window->ns.object setContentView:window->ns.view];
    [window->ns.object setDelegate:window->ns.delegate];
    [window->ns.object setAcceptsMouseMovedEvents:YES];
    [window->ns.object center];

    if ([window->ns.object respondsToSelector:@selector(setRestorable:)])
        [window->ns.object setRestorable:NO];

    return GL_TRUE;
}


//////////////////////////////////////////////////////////////////////////
//////                       GLFW platform API                      //////
//////////////////////////////////////////////////////////////////////////

int _glfwPlatformCreateWindow(_GLFWwindow* window,
                              const _GLFWwndconfig* wndconfig,
                              const _GLFWfbconfig* fbconfig)
{
    if (!initializeAppKit())
        return GL_FALSE;

    // There can only be one application delegate, but we allocate it the
    // first time a window is created to keep all window code in this file
    if (_glfw.ns.delegate == nil)
    {
        _glfw.ns.delegate = [[GLFWApplicationDelegate alloc] init];
        if (_glfw.ns.delegate == nil)
        {
            _glfwInputError(GLFW_PLATFORM_ERROR,
                            "Cocoa: Failed to create application delegate");
            return GL_FALSE;
        }

        [NSApp setDelegate:_glfw.ns.delegate];
    }

    window->ns.delegate = [[GLFWWindowDelegate alloc] initWithGlfwWindow:window];
    if (window->ns.delegate == nil)
    {
        _glfwInputError(GLFW_PLATFORM_ERROR,
                        "Cocoa: Failed to create window delegate");
        return GL_FALSE;
    }

    // Mac OS X needs non-zero color size, so set resonable values
    int colorBits = fbconfig->redBits + fbconfig->greenBits + fbconfig->blueBits;
    if (colorBits == 0)
        colorBits = 24;
    else if (colorBits < 15)
        colorBits = 15;

    // Don't use accumulation buffer support; it's not accelerated
    // Aux buffers probably aren't accelerated either

    if (!createWindow(window, wndconfig))
        return GL_FALSE;

    if (!_glfwCreateContext(window, wndconfig, fbconfig))
        return GL_FALSE;

    [window->nsgl.context setView:[window->ns.object contentView]];

    if (wndconfig->monitor)
    {
        int bpp = colorBits + fbconfig->alphaBits;

        if (!_glfwSetVideoMode(window->monitor, &window->videoMode.width, &window->videoMode.height, &bpp))
            return GL_FALSE;

        _glfwPlatformShowWindow(window);
        [[window->ns.object contentView] enterFullScreenMode:[NSScreen mainScreen]
                                                 withOptions:nil];
    }

    NSPoint point = [[NSCursor currentCursor] hotSpot];
    window->cursorPosX = point.x;
    window->cursorPosY = point.y;

    return GL_TRUE;
}

void _glfwPlatformDestroyWindow(_GLFWwindow* window)
{
    [window->ns.object orderOut:nil];

    if (window->monitor)
    {
        _glfwRestoreVideoMode(window->monitor);

        // Exit full screen after the video restore to avoid a nasty display
        // flickering during the fade.
        [[window->ns.object contentView] exitFullScreenModeWithOptions:nil];
    }

    _glfwDestroyContext(window);

    [window->ns.object setDelegate:nil];
    [window->ns.delegate release];
    window->ns.delegate = nil;

    [window->ns.view release];
    window->ns.view = nil;

    [window->ns.object close];
    window->ns.object = nil;

    // TODO: Probably more cleanup
}

void _glfwPlatformSetWindowTitle(_GLFWwindow* window, const char *title)
{
    [window->ns.object setTitle:[NSString stringWithUTF8String:title]];
}

void _glfwPlatformGetWindowPos(_GLFWwindow* window, int* xpos, int* ypos)
{
    const NSRect contentRect =
        [window->ns.object contentRectForFrameRect:[window->ns.object frame]];

    if (xpos)
        *xpos = contentRect.origin.x;
    if (ypos)
        *ypos = contentRect.origin.y;
}

void _glfwPlatformSetWindowPos(_GLFWwindow* window, int x, int y)
{
    const NSRect frameRect =
        [window->ns.object frameRectForContentRect:NSMakeRect(x, y, 0, 0)];
    [window->ns.object setFrameOrigin:frameRect.origin];
}

void _glfwPlatformGetWindowSize(_GLFWwindow* window, int* width, int* height)
{
    const NSRect contentRect =
        [window->ns.object contentRectForFrameRect:[window->ns.object frame]];

    if (width)
        *width = contentRect.size.width;
    if (height)
        *height = contentRect.size.height;
}

void _glfwPlatformSetWindowSize(_GLFWwindow* window, int width, int height)
{
    [window->ns.object setContentSize:NSMakeSize(width, height)];
}

void _glfwPlatformIconifyWindow(_GLFWwindow* window)
{
    [window->ns.object miniaturize:nil];
}

void _glfwPlatformRestoreWindow(_GLFWwindow* window)
{
    [window->ns.object deminiaturize:nil];
}

void _glfwPlatformShowWindow(_GLFWwindow* window)
{
    [window->ns.object makeKeyAndOrderFront:nil];
    _glfwInputWindowVisibility(window, GL_TRUE);
}

void _glfwPlatformHideWindow(_GLFWwindow* window)
{
    [window->ns.object orderOut:nil];
    _glfwInputWindowVisibility(window, GL_FALSE);
}

void _glfwPlatformPollEvents(void)
{
    for (;;)
    {
        NSEvent* event = [NSApp nextEventMatchingMask:NSAnyEventMask
                                            untilDate:[NSDate distantPast]
                                               inMode:NSDefaultRunLoopMode
                                              dequeue:YES];
        if (event == nil)
            break;

        [NSApp sendEvent:event];
    }

    [_glfw.ns.autoreleasePool drain];
    _glfw.ns.autoreleasePool = [[NSAutoreleasePool alloc] init];
}

void _glfwPlatformWaitEvents(void)
{
    // I wanted to pass NO to dequeue:, and rely on PollEvents to
    // dequeue and send.  For reasons not at all clear to me, passing
    // NO to dequeue: causes this method never to return.
    NSEvent *event = [NSApp nextEventMatchingMask:NSAnyEventMask
                                        untilDate:[NSDate distantFuture]
                                           inMode:NSDefaultRunLoopMode
                                          dequeue:YES];
    [NSApp sendEvent:event];

    _glfwPlatformPollEvents();
}

void _glfwPlatformSetCursorPos(_GLFWwindow* window, int x, int y)
{
    if (window->monitor)
    {
        CGPoint globalPoint = CGPointMake(x, y);
        CGDisplayMoveCursorToPoint(CGMainDisplayID(), globalPoint);
    }
    else
    {
        const NSRect contentRect =
            [window->ns.object contentRectForFrameRect:[window->ns.object frame]];
        NSPoint localPoint = NSMakePoint(x, contentRect.size.height - y - 1);
        NSPoint globalPoint = [window->ns.object convertBaseToScreen:localPoint];
        CGPoint mainScreenOrigin = CGDisplayBounds(CGMainDisplayID()).origin;
        double mainScreenHeight = CGDisplayBounds(CGMainDisplayID()).size.height;
        CGPoint targetPoint = CGPointMake(globalPoint.x - mainScreenOrigin.x,
                                          mainScreenHeight - globalPoint.y -
                                            mainScreenOrigin.y);
        CGDisplayMoveCursorToPoint(CGMainDisplayID(), targetPoint);
    }
}

void _glfwPlatformSetCursorMode(_GLFWwindow* window, int mode)
{
    switch (mode)
    {
        case GLFW_CURSOR_NORMAL:
            [NSCursor unhide];
            CGAssociateMouseAndMouseCursorPosition(true);
            break;
        case GLFW_CURSOR_HIDDEN:
            break;
        case GLFW_CURSOR_CAPTURED:
            [NSCursor hide];
            CGAssociateMouseAndMouseCursorPosition(false);
            break;
    }
}


//////////////////////////////////////////////////////////////////////////
//////                        GLFW native API                       //////
//////////////////////////////////////////////////////////////////////////

GLFWAPI id glfwGetCocoaWindow(GLFWwindow* handle)
{
    _GLFWwindow* window = (_GLFWwindow*) handle;
    _GLFW_REQUIRE_INIT_OR_RETURN(nil);
    return window->ns.object;
}

