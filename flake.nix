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
        ];
      };
    }
  );
}
