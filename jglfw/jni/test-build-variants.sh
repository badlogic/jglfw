#!/usr/bin/env bash
set -euo pipefail

DIR="$(cd "$(dirname "$0")" && pwd)"
WORK="$(mktemp -d)"
trap 'rm -rf "$WORK"' EXIT
mkdir -p "$WORK/jni" "$WORK/bin" "$WORK/jdk/bin" "$WORK/spine/spine-launcher/libs" \
	"$WORK/spine/other/spine-backend-jglfw/libs"
cp "$DIR/build.sh" "$DIR/build-spine.sh" "$WORK/jni/"
export JAVA_HOME="$WORK/jdk" LOG="$WORK/commands" PATH="$WORK/bin:$PATH"

cat > "$WORK/bin/clang" <<'EOF'
#!/usr/bin/env bash
set -euo pipefail
printf 'clang %s\n' "$*" >> "$LOG"
while [[ $# -gt 0 ]]; do
	if [[ "$1" == -o ]]; then
		printf 'fixture\n' > "$2"
		exit 0
	fi
	shift
done
exit 1
EOF
cat > "$WORK/bin/nm" <<'EOF'
#!/usr/bin/env bash
set -euo pipefail
if [[ "$1" == -gU ]]; then
	[[ "${BAD_JNI:-false}" == true ]] || echo '000 T _Java_com_badlogic_jglfw_Glfw_glfwTerminate'
	[[ "${BAD_EXPORT:-false}" != true ]] || echo '000 T _glfwInit'
else
	for CLASS in GLFWWindow GLFWWindowDelegate GLFWApplicationDelegate GLFWContentView; do
		printf '000 S _OBJC_CLASS_$_SpineLauncher%s\n' "$CLASS"
	done
	[[ "${BAD_CLASS:-false}" != true ]] || echo '000 S _OBJC_CLASS_$_GLFWWindow'
fi
EOF
cat > "$WORK/jdk/bin/jar" <<'EOF'
#!/usr/bin/env bash
set -euo pipefail
MODE="$1" ARCHIVE="$2"
shift 2
[[ "$MODE" != cf ]] || : > "$ARCHIVE"
while [[ $# -gt 0 ]]; do
	[[ "$1" == -C && -f "$2/$3" ]]
	printf '%s\n' "$3" >> "$ARCHIVE"
	shift 3
done
EOF
cat > "$WORK/bin/strip" <<'EOF'
#!/usr/bin/env bash
printf 'strip %s\n' "$*" >> "$LOG"
EOF
cat > "$WORK/bin/codesign" <<'EOF'
#!/usr/bin/env bash
printf 'codesign %s\n' "$*" >> "$LOG"
EOF
cat > "$WORK/bin/uname" <<'EOF'
#!/usr/bin/env bash
echo Darwin
EOF
cat > "$WORK/jni/test-mac-variants.sh" <<'EOF'
#!/usr/bin/env bash
set -euo pipefail
[[ -f "$1" && -f "$2" ]]
printf 'coload %s\n' "$*" >> "$LOG"
[[ "${BAD_COLOAD:-false}" != true ]]
EOF
chmod +x "$WORK/bin/"* "$WORK/jdk/bin/jar"

COMPAT="$WORK/spine/spine-launcher/libs/jglfw-compat-natives.jar"
LEGACY="$WORK/spine/spine-launcher/libs/pre42-mac-aarch64-natives.jar"
EDITOR="$WORK/spine/other/spine-backend-jglfw/libs/spine-backend-jglfw-natives.jar"
LAUNCHER="$WORK/spine/spine-launcher/libs/jglfw-launcher-natives.jar"
printf 'frozen compatibility\n' > "$COMPAT"
printf 'legacy compatibility\n' > "$LEGACY"
printf 'editor baseline\n' > "$EDITOR"
cp "$COMPAT" "$WORK/compat-baseline"
cp "$LEGACY" "$WORK/legacy-baseline"
cp "$EDITOR" "$WORK/editor-baseline"

bash "$WORK/jni/build-spine.sh" "$WORK/spine" > "$WORK/build.log"
cmp "$COMPAT" "$WORK/compat-baseline"
cmp "$LEGACY" "$WORK/legacy-baseline"
cmp "$EDITOR" "$WORK/editor-baseline"
[[ "$(wc -l < "$LAUNCHER")" -eq 2 ]]
grep -Fxq libjglfw-launcher64.dylib "$LAUNCHER"
grep -Fxq libjglfw-launcherarm64.dylib "$LAUNCHER"
for CLASS in GLFWWindow GLFWWindowDelegate GLFWApplicationDelegate GLFWContentView; do
	grep -Fq -- "-D$CLASS=SpineLauncher$CLASS" "$LOG"
done
grep -Fq -- '-fvisibility=hidden' "$LOG"
grep -Fq -- '-arch arm64' "$LOG"
grep -Fq -- '-arch x86_64' "$LOG"
# Launcher arm64 links for macOS 12 (chained fixups); its x86_64 stays at 10.7.
grep -q -- '-arch arm64 .*-mmacosx-version-min=12.0' "$LOG"
grep -q -- '-arch x86_64 .*-mmacosx-version-min=10.7' "$LOG"
! grep -q -- '-arch x86_64 .*-mmacosx-version-min=12' "$LOG"
[[ "$(grep -c '^codesign ' "$LOG")" -eq 2 ]]
[[ "$(grep -c '^coload ' "$LOG")" -eq 1 ]]
cp "$LAUNCHER" "$WORK/launcher-baseline"
: > "$LOG"

bash "$WORK/jni/build-spine.sh" "$WORK/spine" editor > "$WORK/build.log"
cmp "$COMPAT" "$WORK/compat-baseline"
cmp "$LEGACY" "$WORK/legacy-baseline"
cmp "$LAUNCHER" "$WORK/launcher-baseline"
[[ "$(wc -l < "$EDITOR")" -eq 2 ]]
grep -Fxq libjglfw64.dylib "$EDITOR"
grep -Fxq libjglfwarm64.dylib "$EDITOR"
! grep -Fq -- '-DGLFWWindow=' "$LOG"
! grep -Fq -- '-fvisibility=hidden' "$LOG"
! grep -Fq -- '-mmacosx-version-min=12' "$LOG" # Old launchers on macOS 11 can load new editors.

for FAILURE in BAD_CLASS BAD_EXPORT BAD_JNI; do
	if env "$FAILURE=true" bash "$WORK/jni/build.sh" --target=macosx --variant=launcher > "$WORK/rejected.log" 2>&1; then
		echo "Accepted $FAILURE" >&2
		exit 1
	fi
done
for OPTION in --target=invalid --build=invalid --variant=invalid; do
	if bash "$WORK/jni/build.sh" --target=macosx "$OPTION" > "$WORK/rejected.log" 2>&1; then
		echo "Accepted $OPTION" >&2
		exit 1
	fi
done
if BAD_COLOAD=true bash "$WORK/jni/build-spine.sh" "$WORK/spine" launcher > "$WORK/rejected.log" 2>&1; then
	echo 'Installed natives after a failed co-load test' >&2
	exit 1
fi
cmp "$LAUNCHER" "$WORK/launcher-baseline"
env -u JAVA_HOME bash "$WORK/jni/build.sh" --help > /dev/null
echo 'PASS: native build variants, artifact isolation, signing, co-load hook and failure checks (mock toolchain).'
