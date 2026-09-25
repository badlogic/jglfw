#!/usr/bin/env bash
set -euo pipefail

if [[ $# != 2 ]]; then
	echo "Usage: $0 <launcher-natives.jar> <editor-natives.jar>" >&2
	exit 1
fi
DIR="$(cd "$(dirname "$0")" && pwd)"
LAUNCHER="$(cd "$(dirname "$1")" && pwd)/$(basename "$1")"
EDITOR="$(cd "$(dirname "$2")" && pwd)/$(basename "$2")"
JAR="${JAVA_HOME:?Set JAVA_HOME to a JDK}/bin/jar"
[[ "$(uname -s)" == Darwin ]] || { echo "Run this test on macOS." >&2; exit 1; }
case "$(uname -m)" in
	arm64) ARCH=arm64 ;;
	x86_64) ARCH=64 ;;
	*) echo "Unsupported host architecture" >&2; exit 1 ;;
esac
WORK="$(mktemp -d)"
trap 'rm -rf "$WORK"' EXIT
cd "$WORK"
"$JAR" xf "$LAUNCHER" "libjglfw-launcher$ARCH.dylib"
"$JAR" xf "$EDITOR" "libjglfw$ARCH.dylib"
clang "$DIR/test-native-variants.c" -lobjc -o "$WORK/check"
for ORDER in launcher-first editor-first; do
	"$WORK/check" "$WORK/libjglfw-launcher$ARCH.dylib" "$WORK/libjglfw$ARCH.dylib" "$ORDER"
done
