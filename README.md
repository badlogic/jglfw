JGLFW
=====
JGLFW is a crossplatform (Windows, Linux, Mac OS X) wrapper for
 * [GLFW 3.0](https://github.com/elmindreda/glfw), for window managment, OpenGL context creation and input handling
 * OpenGL, for graphics
 * OpenAL, for audio

The GLFW bindings where created manually using [gdx-jnigen](https://code.google.com/p/libgdx/wiki/SourceBuilding#Jnigen). The bindings for OpenGL and OpenAL are automatically generated from the [GLEW](http://glew.sourceforge.net/) header and the standard [OpenAL Soft](http://kcat.strangesoft.net/openal.html) headers.

Usage
-----
Download the latest nightly build from http://libgdx.badlogicgames.com/jglfw/nightlies/

Create a Java project in your prefered way and add jglfw.jar and jglfw-natives.jar to your classpath. Check the [GLFW 3.0 documentation](https://github.com/elmindreda/glfw/blob/master/include/GL/glfw3.h). OpenGL
and OpenAL should be straight forward to use. See the notes on GLFW, OpenGL and OpenAL below.

Note: on Mac OS X you need to provide the -XstartOnFirstThread JVM argument, much 
like with SWT.

Note: 32-bit Linux is currently not supported due to an issue with the build server. You can build the natives yourself, cd to jglfw/jni, then

    ant -f build-linux32.xml
	
The endresult is in `jglfw/libs/linux32`, called `libjglfw.so`. Add that to the jglfw-natives.jar file with a ZIP program of your choice. 

Working from Source
-------------------
Jglfw was developed with Eclipse, and you can find respective .classpath and .project files in the repository. Before you can work from source, it's recommended to fetch the latest nightlies from the build
server.

    ant fetch
	
This will download the jglfw-natives.jar into the jglfw/libs folder. You can now import the projects (jglfw, jglfw-tests) into Eclipse, or set up projects in an IDE you prefer.

Building
--------
The build system consists of an ant script located in the root folder. The simplest way to build jglfw is to invoke ant as follows

    ant clean package
   
This will fetch the latest jglfw-natives.jar from the build server (http://libgdx.badlogicgames.com/jglfw), compile the Java sources and put everything into a versioned zip file. That way you do not need to worry about setting up all the cross-compilation toolchains.

If you want to compile the native code yourself, you'll have a much more fun time. I only provide instructions to build on Linux and Mac OS X, on Windows you can try to use MinGW.

#### Linux (to compile for Windows 32-/64-bit and Linux 32-/64-bit)
Install dependencies and devel libs

    sudo apt-get install g++-mingw-w64-i686 g++-mingw-w64-x86-64 g++-multilib gcc-multilib libX11-dev libXrandr-dev libXxf86vm-dev libgl1-mesa-dev libgl1-mesa-glx

Compile
 
    ant clean compile-natives package
    
#### Mac
Install the latest XCode from the Mac OS X App Store. To compile the Mac OS X natives (jglfw/libs/macosx32/libjglfw.dylib, a fat shared lib for 32-/64-bit):

    ant clean compile-mac-natives

You can add the resulting .dylib to the `jglfw-natives.jar` generated on Linux as shown above.

#### Modifying the Wrapper Code

To modify the GLFW bindings, modify GLFW.java
To modify the OpenGL bindings, modify GlParser.java and GlGenerator. Customizing works through the [custom.txt](https://github.com/badlogic/jglfw/blob/master/jglfw/src/com/badlogic/jglfw/gl/custom.txt) file. You can specify your own jnigen method in there.

If you modified any of the bindings or wrapper generators, you'll need to run GlGenerator and GlfwBuild, in that order. This will regenerate all build scripts and C/C++ files.

Notes on the GLFW bindings
----------------------
The GLFW wrapper is kept as close to the original C API as possible. The following deviations exist:

  * Instead of registering multiple callback procedures via `glfwSetErrorCallback` et. al, you can set a GlfwCallback (or GlfwCallbackAdapter) via Glfw#glfwSetCallback(). This interface contains all callback methods.
  * Gamma ramps can only be set via the simple method at the moment.
    * Instead `GLFWwindow*` and `GLFWmonitor*` pointers, you'll simply get a Java long. Not type-safe, but simple.
  * You should execute all window managment and rendering code on the main thread, that is, the thread within your `main()` method was started.
  * On Mac OS X you have to supply -XStartOnFirstThread as a JVM argument (SWT shares a similar issue). This is due to how Cocoa works (or doesn't, however you want to look at it...)

Integration with Swing or AWT is not possible (so, no Applets either). You can however open Swing and AWT frames besides GLFW windows.

Notes on the OpenGL bindings
--------------------------------------------
OpenGL JNI methods are generated from the GLEW headers. A few notes:

  * Methods with pointer parameters, e.g. like in `glVertexPointer()`, have at least two Java method equivalents, one with the pointer converted to a Buffer and a byte offset, and another that only takes a long encoding a native heap memory address. If the concrete pointer parameter is known, e.g. `const float*`, a third method is generated that takes a Java array of equivalent type, plus an offset.
  * The position and limit of a direct Buffer are ignored! Supply a byte offset instead.
  * No bounds checking is performed, ever.
  * Extension methods are automatically loaded on startup, much like in the case of GLEW. 

Notes on the OpenAL bindings
--------------------------------------------
To be defined...
TODO
----
 * [X] Build system
 * [X] Nightly builds, see http://libgdx.badlogicgames.com:8080, http://libgdx.badlogicgames.com/jglfw
 * [X] GLFW wrapper
 * [X] OpenGL generator
   * [ ] Add in the last few ignored methods
 * [ ] OpenAL generator
