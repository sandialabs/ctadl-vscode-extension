#!/usr/bin/env bash
#
# Run the test suite headlessly in a Linux container.
#
# Usage:
#   scripts/test-container.sh [--rebuild] [--shell] [CMD...]
#
#   --rebuild   rebuild the image even if it is already present
#   --shell     drop into a shell in the container instead of running tests
#   CMD...      run this instead of `npm test` (still under xvfb)
#
# Why: `npm test` launches a real VS Code, which on macOS opens a window on the
# desktop and cannot run headless. This runs the same suite inside Linux, where
# xvfb provides an off-screen display.
#
# Requirements, all supplied by the nix devShell (`nix develop`, or direnv):
# the docker CLI plus, on macOS, colima — which boots the Linux VM that hosts
# the Docker daemon. The VM is started on demand and left running; stop it with
# `colima stop`.
#
# The repo is bind-mounted, so host edits take effect without a rebuild. The
# mount is read-write because the suite genuinely writes into the tree, exactly
# as a host `npm test` does: setting a Workspace-scoped config lands in
# test_examples/sources/.vscode/settings.json.
#
# node_modules, out, dist and .vscode-test are Docker volumes shadowing the
# host's copies. Those hold platform-specific artifacts — a macOS npm install,
# a macOS VS Code download — that the two platforms would otherwise keep
# overwriting for each other.

set -euo pipefail

IMAGE="${CTADL_TEST_IMAGE:-ctadl-test}"
VOLUME_PREFIX="${CTADL_TEST_VOLUME_PREFIX:-ctadl-test}"
COLIMA_PROFILE="${COLIMA_PROFILE:-default}"
COLIMA_CPU="${COLIMA_CPU:-4}"
COLIMA_MEMORY="${COLIMA_MEMORY:-8}"
COLIMA_DISK="${COLIMA_DISK:-60}"

rebuild=0
shell_mode=0
while [ "$#" -gt 0 ]; do
    case "$1" in
        --rebuild) rebuild=1; shift ;;
        --shell) shell_mode=1; shift ;;
        -h|--help)
            sed -n '3,29p' "$0" | sed 's/^# \{0,1\}//'
            exit 0
            ;;
        --) shift; break ;;
        *) break ;;
    esac
done

repo_root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

die() { echo "$*" >&2; exit 1; }

command -v docker >/dev/null 2>&1 ||
    die "docker CLI not found. Enter the dev shell first: nix develop"

# On macOS the Docker daemon lives in colima's VM. On Linux the caller already
# has one; leave their setup (and DOCKER_HOST) alone.
if [ "$(uname -s)" = "Darwin" ]; then
    command -v colima >/dev/null 2>&1 ||
        die "colima not found. Enter the dev shell first: nix develop"

    if ! colima status --profile "$COLIMA_PROFILE" >/dev/null 2>&1; then
        echo "==> starting colima (${COLIMA_CPU} cpu, ${COLIMA_MEMORY} GiB, ${COLIMA_DISK} GiB disk)"
        # No --mount flag needed: colima already mounts $HOME read-write, and
        # the repo lives under it. Colima is left running afterwards; booting
        # the VM is the slow part of a cold run.
        colima start \
            --profile "$COLIMA_PROFILE" \
            --cpu "$COLIMA_CPU" \
            --memory "$COLIMA_MEMORY" \
            --disk "$COLIMA_DISK"
    fi

    # Talk to colima's socket directly rather than relying on whichever docker
    # context happens to be current.
    socket="$(colima status --profile "$COLIMA_PROFILE" 2>&1 |
        grep -o 'unix://[^[:space:]]*docker\.sock' | head -1 || true)"
    export DOCKER_HOST="${socket:-unix://$HOME/.colima/$COLIMA_PROFILE/docker.sock}"
fi

if [ "$rebuild" -eq 1 ] || ! docker image inspect "$IMAGE" >/dev/null 2>&1; then
    echo "==> building $IMAGE"
    docker build -t "$IMAGE" -f "$repo_root/Dockerfile" "$repo_root"
fi

# Volume mount points, created here rather than left to Docker so that a fresh
# clone gets them owned by the user instead of by root.
mkdir -p "$repo_root/node_modules" "$repo_root/out" "$repo_root/dist" "$repo_root/.vscode-test"

run_args=(
    --rm
    --init                      # reap the Electron and Xvfb children
    --shm-size=1g               # Chromium outgrows the 64 MB default and crashes
    -v "$repo_root:/work"
    -v "$VOLUME_PREFIX-node-modules:/work/node_modules"
    -v "$VOLUME_PREFIX-out:/work/out"
    -v "$VOLUME_PREFIX-dist:/work/dist"
    -v "$VOLUME_PREFIX-vscode:/work/.vscode-test"
)
# Only ask for a TTY when there is one, so redirected or CI runs still work.
if [ -t 0 ]; then run_args+=(-i); fi
if [ -t 1 ]; then run_args+=(-t); fi

if [ "$shell_mode" -eq 1 ]; then
    exec docker run "${run_args[@]}" --entrypoint bash "$IMAGE" "$@"
fi

exec docker run "${run_args[@]}" "$IMAGE" "$@"
