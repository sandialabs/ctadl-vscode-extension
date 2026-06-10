package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public enum r implements InterfaceC0257g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            xVar.m(true);
        } else if (ordinal == 1) {
            xVar.m(false);
        } else if (ordinal == 2) {
            xVar.q(true);
        } else if (ordinal == 3) {
            xVar.q(false);
        }
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
