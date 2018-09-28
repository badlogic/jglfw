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
#include <Availability.h>

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
    // [window->nsgl.context update]; // This crashes 10.7.x! Need to call update from _glfwPlatformShowWindow.

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
	// clear last modifier keys
	window->lastModifierKeys = 0;
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


// Translates macOS key modifiers into GLFW ones
//
static int translateFlags(NSUInteger flags)
{
	int mods = 0;
	
	if (flags & NSEventModifierFlagShift)
		mods |= GLFW_MOD_SHIFT;
	if (flags & NSEventModifierFlagControl)
		mods |= GLFW_MOD_CONTROL;
	if (flags & NSEventModifierFlagOption)
		mods |= GLFW_MOD_ALT;
	if (flags & NSEventModifierFlagCommand)
		mods |= GLFW_MOD_SUPER;
	
	return mods;
}

// Translates a macOS keycode to a GLFW keycode
//
static int translateKey(unsigned int key)
{
	if (key >= sizeof(_glfw.ns.keycodes) / sizeof(_glfw.ns.keycodes[0]))
		return GLFW_KEY_UNKNOWN;
	
	return _glfw.ns.keycodes[key];
}

// Translate a GLFW keycode to a Cocoa modifier flag
//
static NSUInteger translateKeyToModifierFlag(int key)
{
	switch (key)
	{
		case GLFW_KEY_LEFT_SHIFT:
		case GLFW_KEY_RIGHT_SHIFT:
			return NSEventModifierFlagShift;
		case GLFW_KEY_LEFT_CONTROL:
		case GLFW_KEY_RIGHT_CONTROL:
			return NSEventModifierFlagControl;
		case GLFW_KEY_LEFT_ALT:
		case GLFW_KEY_RIGHT_ALT:
			return NSEventModifierFlagOption;
		case GLFW_KEY_LEFT_SUPER:
		case GLFW_KEY_RIGHT_SUPER:
			return NSEventModifierFlagCommand;
	}
	
	return 0;
}


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
	else {
        [super sendEvent:event];
	}
}

@end


//------------------------------------------------------------------------
// Content view class for the GLFW window
//------------------------------------------------------------------------

@interface GLFWContentView : NSView
{
    _GLFWwindow* window;
    NSTrackingArea* trackingArea;
	int lastModifierKeys;
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
		window->lastModifierKeys = 0;
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
	const int key = translateKey([event keyCode]);
	const int mods = translateFlags([event modifierFlags]);
	
	_glfwInputKey(window, key, [event keyCode], GLFW_PRESS, mods);
	
	
	if ([event modifierFlags] & NSCommandKeyMask)
	{
		// If the GLFWApplication sendEvent command key fix could not be used,
		// just send a key up immediately.
		if (![NSApp isKindOfClass:[GLFWApplication class]])
		{
			_glfwInputKey(window, key, [event keyCode], GLFW_RELEASE, mods);
		}
	}
	else
	{
		NSUInteger i, length;
		NSString* characters;
		characters = [event characters];
		length = [characters length];
		
		for (i = 0;  i < length;  i++)
			_glfwInputChar(window, [characters characterAtIndex:i]);
	}
}

- (void)flagsChanged:(NSEvent *)event
{
	int action;
	const unsigned int modifierFlags =
	[event modifierFlags] & NSEventModifierFlagDeviceIndependentFlagsMask;
	int scanCode = [event keyCode];
	int key = translateKey(scanCode);
	const int mods = translateFlags(modifierFlags);
	
	// Fix for Wacom, see https://github.com/EsotericSoftware/spine-editor/issues/174
	// Wacom sends keyCode 0 for modifier keys, so we need
	// to generate a keyCode for the modifier key that was
	// pressed outselfs
	if (scanCode == 0) {
		int changedMods = mods ^ window->lastModifierKeys;
		if (changedMods & GLFW_MOD_ALT) scanCode = 0x3D; // right alt
		if (changedMods & GLFW_MOD_CONTROL) scanCode = 0x3E; // right control
		if (changedMods & GLFW_MOD_SHIFT) scanCode = 0x3C; // right shift
		if (changedMods & GLFW_MOD_SUPER) scanCode = 0x36; // right command / super
			
		key = translateKey(scanCode);
	}
	
	const NSUInteger keyFlag = translateKeyToModifierFlag(key);
	
	if (keyFlag & modifierFlags)
	{
		if (window->keys[key] == GLFW_PRESS)
			action = GLFW_RELEASE;
		else
			action = GLFW_PRESS;
	}
	else
		action = GLFW_RELEASE;
	
	window->lastModifierKeys = mods;
	
	_glfwInputKey(window, key, scanCode, action, mods);
}

- (void)keyUp:(NSEvent *)event
{
	const int key = translateKey([event keyCode]);
	const int mods = translateFlags([event modifierFlags]);

	_glfwInputKey(window, key, [event keyCode], GLFW_RELEASE, mods);
}

- (void)scrollWheel:(NSEvent *)event
{
    double deltaX = [event deltaX];
    double deltaY = [event deltaY];

    if (fabs(deltaX) > 0.0 || fabs(deltaY) > 0.0)
        _glfwInputScroll(window, deltaX, deltaY);
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

@interface GLFWWindow : NSWindow {}
@end
@implementation GLFWWindow
- (BOOL)canBecomeKeyWindow {
    return YES; // Required for NSBorderlessWindowMask windows.
}
@end

// Create the Cocoa window
//
static GLboolean createWindow(_GLFWwindow* window,
                              const _GLFWwndconfig* wndconfig)
{
    unsigned int styleMask = 0;

    if (wndconfig->monitor || wndconfig->undecorated)
        styleMask = NSBorderlessWindowMask;
    else
    {
        styleMask = NSTitledWindowMask | NSClosableWindowMask |
                    NSMiniaturizableWindowMask;

        if (wndconfig->resizable)
            styleMask |= NSResizableWindowMask;
    }

    window->ns.object = [[GLFWWindow alloc]
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
	 [window->ns.view setWantsBestResolutionOpenGLSurface:YES];

    [window->ns.object setTitle:[NSString stringWithUTF8String:wndconfig->title]];
    [window->ns.object setContentView:window->ns.view];
    [window->ns.object setDelegate:window->ns.delegate];
    [window->ns.object setAcceptsMouseMovedEvents:YES];
    [window->ns.object center];

    if ([window->ns.object respondsToSelector:@selector(setRestorable:)])
        [window->ns.object setRestorable:NO];

#ifdef __MAC_10_7
    [window->ns.object setCollectionBehavior: NSWindowCollectionBehaviorFullScreenPrimary];
#endif

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
    [window->ns.object performSelectorOnMainThread:@selector(makeKeyAndOrderFront:) 
    	withObject:nil waitUntilDone:NO];
    _glfwInputWindowVisibility(window, GL_TRUE);
    [window->nsgl.context update]; // This is only here because it can't be called in windowDidResize!
}

void _glfwPlatformHideWindow(_GLFWwindow* window)
{
    [window->ns.object orderOut:nil];
    _glfwInputWindowVisibility(window, GL_FALSE);
}

void _glfwPlatformPollEvents(void)
{
	NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];

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

    [pool drain];
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

