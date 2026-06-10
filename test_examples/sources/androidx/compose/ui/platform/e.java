package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class e extends a {
    public static e c;

    @Override // androidx.compose.ui.platform.f
    public final int[] a(int i10) {
        int length = d().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0) {
                int i11 = i10 - 1;
                if (d().charAt(i11) != '\n' || f(i10)) {
                    break;
                }
                i10 = i11;
            }
            if (i10 <= 0) {
                return null;
            }
            int i12 = i10 - 1;
            while (i12 > 0 && !g(i12)) {
                i12--;
            }
            return c(i12, i10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // androidx.compose.ui.platform.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] b(int i10) {
        int length = d().length();
        if (length > 0 && i10 < length) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (i10 < length && d().charAt(i10) == '\n' && !g(i10)) {
                i10++;
            }
            int i11 = i10 + 1;
            while (i11 < length && !f(i11)) {
                i11++;
            }
            return c(i10, i11);
        }
        return null;
    }

    public final boolean f(int i10) {
        return i10 > 0 && d().charAt(i10 + (-1)) != '\n' && (i10 == d().length() || d().charAt(i10) == '\n');
    }

    public final boolean g(int i10) {
        return d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n');
    }
}
