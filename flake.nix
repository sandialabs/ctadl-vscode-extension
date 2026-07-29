{
  inputs = {
    utils.url = "github:numtide/flake-utils";
  };
  outputs = { self, nixpkgs, utils }: utils.lib.eachDefaultSystem (system:
    let
      pkgs = nixpkgs.legacyPackages.${system};
    in
    {
      devShell = pkgs.mkShell {
        buildInputs = with pkgs; [
          nodejs_22
        ] ++ lib.optionals stdenv.isLinux [
          # `xvfb-run npm test` (README) needs a virtual X display. Linux-only:
          # on macOS the test VS Code renders through the native window server,
          # so plain `npm test` works and xvfb-run does not apply.
          xvfb-run
        ] ++ lib.optionals stdenv.isDarwin [
          # macOS has no Linux container runtime and no X server, so
          # scripts/test-container.sh runs the suite in a Linux VM instead:
          # colima brings up the VM (via the lima it wraps) and exposes a
          # Docker daemon; docker-client and docker-buildx are the CLI halves
          # that talk to it. Nothing here is needed for plain `npm test`.
          colima
          docker-client
          docker-buildx
        ];

        # `docker build` uses BuildKit, which the CLI can only reach through the
        # buildx plugin. Nix installs buildx as a plain binary rather than into
        # the plugin directory the CLI scans, so point DOCKER_CONFIG at a
        # project-local config (gitignored) and link it in there. This also
        # keeps the docker context colima creates out of the user's ~/.docker.
        shellHook = pkgs.lib.optionalString pkgs.stdenv.isDarwin ''
          export DOCKER_CONFIG="''${DOCKER_CONFIG:-$PWD/.docker}"
          mkdir -p "$DOCKER_CONFIG/cli-plugins"
          ln -sfn ${pkgs.docker-buildx}/bin/docker-buildx "$DOCKER_CONFIG/cli-plugins/docker-buildx"
        '';
      };
    }
  );
}
