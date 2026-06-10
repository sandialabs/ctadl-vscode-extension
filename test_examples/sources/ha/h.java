package ha;

/* loaded from: classes.dex */
public class h extends g {
    public static final void O0(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer P0(String str) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        v7.g.f(str, "<this>");
        a1.b.v(10);
        int length = str.length();
        if (length != 0) {
            int i13 = 0;
            char charAt = str.charAt(0);
            if (v7.g.h(charAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i11 = Integer.MIN_VALUE;
                        z10 = true;
                        int i14 = -59652323;
                        while (i10 < length) {
                            int digit = Character.digit((int) str.charAt(i10), 10);
                            if (digit >= 0 && ((i13 >= i14 || (i14 == -59652323 && i13 >= (i14 = i11 / 10))) && (i12 = i13 * 10) >= i11 + digit)) {
                                i13 = i12 - digit;
                                i10++;
                            }
                        }
                        if (!z10) {
                            return Integer.valueOf(i13);
                        }
                        return Integer.valueOf(-i13);
                    } else if (charAt == '+') {
                    }
                }
            } else {
                i10 = 0;
            }
            i11 = -2147483647;
            z10 = false;
            int i142 = -59652323;
            while (i10 < length) {
            }
            if (!z10) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long Q0(String str) {
        int i10;
        long j2;
        v7.g.f(str, "<this>");
        a1.b.v(10);
        int length = str.length();
        if (length != 0) {
            boolean z10 = false;
            char charAt = str.charAt(0);
            if (v7.g.h(charAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        j2 = Long.MIN_VALUE;
                        z10 = true;
                        long j10 = 0;
                        long j11 = -256204778801521550L;
                        while (i10 < length) {
                            int digit = Character.digit((int) str.charAt(i10), 10);
                            if (digit >= 0) {
                                if (j10 < j11) {
                                    if (j11 == -256204778801521550L) {
                                        j11 = j2 / 10;
                                        if (j10 < j11) {
                                        }
                                    }
                                }
                                long j12 = j10 * 10;
                                long j13 = digit;
                                if (j12 >= j2 + j13) {
                                    j10 = j12 - j13;
                                    i10++;
                                }
                            }
                        }
                        if (!z10) {
                            return Long.valueOf(j10);
                        }
                        return Long.valueOf(-j10);
                    } else if (charAt == '+') {
                    }
                }
            } else {
                i10 = 0;
            }
            j2 = -9223372036854775807L;
            long j102 = 0;
            long j112 = -256204778801521550L;
            while (i10 < length) {
            }
            if (!z10) {
            }
        }
        return null;
    }
}
