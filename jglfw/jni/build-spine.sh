#!/usr/bin/env bash
set -euo pipefail

if [[ $# -lt 1 || $# -gt 2 ]]; then
	echo "Usage: $0 <spine-checkout> [launcher|editor]" >&2
	exit 1
fi
SPINE="$(cd "$1" && pwd)"
VARIANT="${2:-launcher}"
DIR="$(cd "$(dirname "$0")" && pwd)"
JAR="${JAVA_HOME:?Set JAVA_HOME to a JDK}/bin/jar"
case "$VARIANT" in
	launcher)
		NAME=jglfw-launcher
		DEST="$SPINE/spine-launcher/libs/jglfw-launcher-natives.jar"
		;;
	editor)
		NAME=jglfw
		DEST="$SPINE/other/spine-backend-jglfw/libs/spine-backend-jglfw-natives.jar"
		;;
	*) echo "Unknown native variant: $VARIANT" >&2; exit 1 ;;
esac
[[ -d "$(dirname "$DEST")" ]] || { echo "Not a Spine checkout: $SPINE" >&2; exit 1; }
[[ "$(uname -s)" == Darwin ]] || { echo "Build these natives on macOS." >&2; exit 1; }

for TARGET in macosx macosx-aarch64; do
	bash "$DIR/build.sh" --build=release --target="$TARGET" --variant="$VARIANT"
done

OUTPUT="$DIR/target/spine-$VARIANT-natives.jar"
"$JAR" cf "$OUTPUT" \
	-C "$DIR/target/$VARIANT/macosx" "lib${NAME}64.dylib" \
	-C "$DIR/target/$VARIANT/macosx-aarch64" "lib${NAME}arm64.dylib"
if [[ "$VARIANT" == launcher ]]; then
	bash "$DIR/test-mac-variants.sh" "$OUTPUT" "$SPINE/spine-launcher/libs/jglfw-compat-natives.jar"
fi
cp "$OUTPUT" "$DEST"
echo "Installed $DEST"
