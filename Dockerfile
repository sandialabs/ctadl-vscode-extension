# Linux image for running the extension's VS Code tests headlessly. Driven by
# scripts/test-container.sh, which on macOS gets its Docker daemon from colima.
#
# The repo is bind-mounted at /work at run time and nothing is COPYed in except
# the entrypoint, so this image is purely the runtime environment and does not
# need rebuilding when sources change.
FROM node:22-bookworm-slim

# `npm test` downloads and launches a real VS Code. Its Electron dynamically
# links the desktop stack even with nothing on screen, and still requires a
# display, which xvfb-run supplies. Sorted so additions are easy to review.
RUN apt-get update && apt-get install -y --no-install-recommends \
        ca-certificates \
        dbus-x11 \
        fonts-liberation \
        git \
        libasound2 \
        libatk-bridge2.0-0 \
        libatk1.0-0 \
        libcairo2 \
        libcups2 \
        libdbus-1-3 \
        libdrm2 \
        libgbm1 \
        libglib2.0-0 \
        libgtk-3-0 \
        libnspr4 \
        libnss3 \
        libpango-1.0-0 \
        libsecret-1-0 \
        libx11-6 \
        libx11-xcb1 \
        libxcb1 \
        libxcomposite1 \
        libxdamage1 \
        libxext6 \
        libxfixes3 \
        libxkbcommon0 \
        libxkbfile1 \
        libxrandr2 \
        libxshmfence1 \
        xauth \
        xvfb \
    && rm -rf /var/lib/apt/lists/*

COPY scripts/container-entrypoint.sh /usr/local/bin/container-entrypoint
RUN chmod +x /usr/local/bin/container-entrypoint

WORKDIR /work
ENTRYPOINT ["/usr/local/bin/container-entrypoint"]
