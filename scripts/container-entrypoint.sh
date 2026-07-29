#!/usr/bin/env bash
#
# Entrypoint of the test image (see Dockerfile). Runs inside the container with
# the repo bind-mounted at /work; scripts/test-container.sh is what launches it.
#
# Installs dependencies when the lockfile has moved on, then runs the given
# command (default: `npm test`) under a virtual X display.

set -euo pipefail

cd /work

# node_modules is a Docker volume, not the host's directory: the host's copy is
# installed by and for macOS. npm writes .package-lock.json into it after every
# install, which makes it the natural stamp file for "is this volume current?".
if [ ! -e node_modules/.package-lock.json ] ||
   [ package-lock.json -nt node_modules/.package-lock.json ]; then
    echo "==> npm ci"
    npm ci --no-audit --no-fund
fi

if [ "$#" -eq 0 ]; then
    set -- npm test
fi

echo "==> xvfb-run -a $*"
# -a picks a free display number, so concurrent containers don't collide.
exec xvfb-run -a "$@"
