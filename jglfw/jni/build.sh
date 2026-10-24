#!/bin/bash
set -euo pipefail
cd "$(dirname "$0")"

BUILD=debug
VARIANT=editor
TARGET=

STRIP="strip -S -x "
CC=clang
CC_FLAGS="-c -m64 -Wfatal-errors -Wall -fPIC -D_GLFW_COCOA -D_GLFW_NSGL -D_GLFW_USE_OPENGL -D_GLFW_USE_MENUBAR -DNS_FORMAT_ARGUMENT(A)= -D_Nullable_result=_Nullable"
CXX=clang
CXX_FLAGS="-c -m64 -Wfatal-errors -Wall -std=c++11 -stdlib=libc++ -fPIC -D_GLFW_COCOA -D_GLFW_NSGL -D_GLFW_USE_OPENGL -D_GLFW_USE_MENUBAR -DNS_FORMAT_ARGUMENT(A)= -D_Nullable_result=_Nullable"

HEADERS="-I./ -Iglfw-3.0/include -Iglfw-3.0/src -Igl-headers/ -Ijni-headers"
CC_SOURCES=(
    "glfw-3.0/src/clipboard.c"
    "glfw-3.0/src/context.c"
    "glfw-3.0/src/gamma.c"
    "glfw-3.0/src/init.c"
    "glfw-3.0/src/input.c"
    "glfw-3.0/src/joystick.c"
    "glfw-3.0/src/monitor.c"
    "glfw-3.0/src/time.c"
    "glfw-3.0/src/window.c"
    "glfw-3.0/src/cocoa_clipboard.m"
    "glfw-3.0/src/cocoa_gamma.c"
	"glfw-3.0/src/cocoa_init.m"
    "glfw-3.0/src/cocoa_joystick.m"
    "glfw-3.0/src/cocoa_monitor.m"
	"glfw-3.0/src/cocoa_time.c"
    "glfw-3.0/src/cocoa_window.m"
    "glfw-3.0/src/nsgl_context.m"
    "memcpy_wrap.c"
)
CXX_SOURCES=(
    "com.badlogic.jglfw.gl.GL.cpp"
    "com.badlogic.jglfw.Glfw.cpp"
    "com.badlogic.jglfw.utils.Memory.cpp"
)

LINKER_FLAGS="-shared -m64 -framework Cocoa -framework OpenGL -framework IOKit -lpthread"
MACOS_MIN=10.7
LIBRARIES="-lm"

JNI_MD="mac"
OUTPUT_PREFIX="lib"
OUTPUT_NAME="jglfw"
OUTPUT_SUFFIX=".dylib"

function usage {
  cat <<EOF
Usage: $0 [options]
Options:
  --build=release|debug     Build type (default: debug).
  --target=macosx|macosx-aarch64
                           Required target architecture.
  --variant=editor|launcher Native namespace (default: editor).
  --help                   Displays this information and exits.
EOF
  exit $1
}

trace() { printf '+ '; printf '%q ' "$@"; printf '\n'; "$@"; }

while [ "$#" -gt 0 ]; do
  NAME=${1%%=*}
  VALUE=${1#*=}
  case $NAME in
	'--target') TARGET="$VALUE" ;;
	'--build') BUILD="$VALUE" ;;
	'--variant') VARIANT="$VALUE" ;;
	'--help')
	  usage 0
	  ;;
	*)
	  echo "Unrecognized option or syntax error in option '$1'"
	  usage 1
	  ;;
  esac
  shift
done

case "$TARGET" in
  macosx|macosx-aarch64) ;;
  *) echo "Specify --target=macosx or --target=macosx-aarch64" >&2; exit 1 ;;
esac
case "$BUILD" in
  release|debug) ;;
  *) echo "Unknown build type: $BUILD" >&2; exit 1 ;;
esac
case "$VARIANT" in
  editor) ;;
  launcher)
    OUTPUT_NAME="jglfw-launcher"
    # Objective-C names are process-global, even across separate dylibs.
    NAMESPACE="-DGLFWWindow=SpineLauncherGLFWWindow -DGLFWWindowDelegate=SpineLauncherGLFWWindowDelegate -DGLFWApplicationDelegate=SpineLauncherGLFWApplicationDelegate -DGLFWContentView=SpineLauncherGLFWContentView"
    CC_FLAGS="$CC_FLAGS -fvisibility=hidden $NAMESPACE"
    CXX_FLAGS="$CXX_FLAGS -fvisibility=hidden $NAMESPACE"
    ;;
  *) echo "Unknown native variant: $VARIANT" >&2; exit 1 ;;
esac
NATIVES_JAR="../libs/$OUTPUT_NAME-natives.jar"
BUILD_DIR="target/$VARIANT/$TARGET"
OUTPUT_DIR="$BUILD_DIR"

if [ "x$TARGET" != 'x' ]; then
	ARCH=${TARGET#*-}

    if [ "$ARCH" = "aarch64" ]; then     
      OUTPUT_NAME="$OUTPUT_NAME""arm64"    
    else        
      OUTPUT_NAME="$OUTPUT_NAME""64"
    fi 
			
    if [ "$ARCH" == "aarch64" ]; then			
        # Apple Silicon launchers require macOS 12: imports bind with chained fixups into read-only __DATA_CONST.
        if [ "$VARIANT" = launcher ]; then MACOS_MIN=12.0; fi
        CC_FLAGS="$CC_FLAGS -arch arm64"
        CXX_FLAGS="$CXX_FLAGS -arch arm64"
        LINKER_FLAGS="$LINKER_FLAGS -arch arm64"
    else
        CC_FLAGS="$CC_FLAGS -arch x86_64"
        CXX_FLAGS="$CXX_FLAGS -arch x86_64"
        LINKER_FLAGS="$LINKER_FLAGS -arch x86_64"
    fi	
    CC_FLAGS="$CC_FLAGS -mmacosx-version-min=$MACOS_MIN"
    CXX_FLAGS="$CXX_FLAGS -mmacosx-version-min=$MACOS_MIN"
    LINKER_FLAGS="$LINKER_FLAGS -mmacosx-version-min=$MACOS_MIN"

	if [ "$BUILD" = "debug" ]; then
		CXX_FLAGS="$CXX_FLAGS -g"
	else		
		CC_FLAGS="$CC_FLAGS -O3"
		CXX_FLAGS="$CXX_FLAGS -O3"
	fi
fi

HEADERS="$HEADERS -Ijni-headers/${JNI_MD}"
JAR="${JAVA_HOME:?Set JAVA_HOME to a JDK}/bin/jar"

rm -rf "$BUILD_DIR"
mkdir -p "$BUILD_DIR"

echo "--- Compiling $VARIANT for $TARGET, build type $BUILD"

echo "------ Compiling C sources"
for f in "${CC_SOURCES[@]}"; do
	OBJECT_FILE=$BUILD_DIR/`basename $f .c`
	trace $CC $CC_FLAGS $HEADERS "$f" -o $OBJECT_FILE.o
done
echo

echo "------ Compiling C++ sources"
for f in "${CXX_SOURCES[@]}"; do
	OBJECT_FILE=$BUILD_DIR/`basename $f .cpp`
	trace $CXX $CXX_FLAGS $HEADERS "$f" -o $OBJECT_FILE.o
done
echo

echo "--- Linking & stripping"
LINKER=$CXX
OBJ_FILES=`find $BUILD_DIR -name "*.o"`
OUTPUT_FILE="$OUTPUT_DIR/$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
trace $LINKER $OBJ_FILES $LIBRARIES $LINKER_FLAGS -o "$OUTPUT_FILE"
if [ "$VARIANT" = launcher ]; then
    SYMBOLS="$(nm -U "$OUTPUT_FILE")"
    for CLASS in GLFWWindow GLFWWindowDelegate GLFWApplicationDelegate GLFWContentView; do
        if ! grep -Fq "_OBJC_CLASS_\$_SpineLauncher$CLASS" <<< "$SYMBOLS"; then
            echo "Missing launcher Objective-C class: $CLASS" >&2
            exit 1
        fi
    done
    if grep -Eq '_OBJC_(META)?CLASS_\$_GLFW' <<< "$SYMBOLS"; then
        echo "Unprefixed GLFW Objective-C class in launcher native" >&2
        exit 1
    fi
    EXPORTS="$(nm -gU "$OUTPUT_FILE")"
    if ! grep -Fq ' _Java_com_badlogic_jglfw_' <<< "$EXPORTS"; then
        echo "Missing JNI exports in launcher native" >&2
        exit 1
    fi
    if grep -Eq ' (__?glfw)' <<< "$EXPORTS"; then
        echo "GLFW internals exported by launcher native" >&2
        exit 1
    fi
fi
trace $STRIP "$OUTPUT_FILE"
trace codesign --force --sign - "$OUTPUT_FILE"
echo

echo "--- Updating $NATIVES_JAR"
mkdir -p ../libs/macos
cp "$OUTPUT_FILE" ../libs/macos
if test -f "$NATIVES_JAR"; then
    trace "$JAR" uf "$NATIVES_JAR" -C "$OUTPUT_DIR" "$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
else
    trace "$JAR" cf "$NATIVES_JAR" -C "$OUTPUT_DIR" "$OUTPUT_PREFIX$OUTPUT_NAME$OUTPUT_SUFFIX"
fi