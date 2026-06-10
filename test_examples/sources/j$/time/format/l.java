package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements InterfaceC0257g {
    static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d  reason: collision with root package name */
    static final l f11947d = new l("+HH:MM:ss", "Z");

    /* renamed from: e  reason: collision with root package name */
    static final l f11948e = new l("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f11949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("pattern");
        }
        int i10 = 0;
        while (true) {
            String[] strArr = c;
            if (i10 >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
            if (strArr[i10].equals(str)) {
                this.f11950b = i10;
                this.f11949a = str2;
                return;
            }
            i10++;
        }
    }

    private boolean a(int[] iArr, int i10, CharSequence charSequence, boolean z10) {
        int i11 = this.f11950b;
        if ((i11 + 3) / 2 < i10) {
            return false;
        }
        int i12 = iArr[0];
        if (i11 % 2 == 0 && i10 > 1) {
            int i13 = i12 + 1;
            if (i13 <= charSequence.length() && charSequence.charAt(i12) == ':') {
                i12 = i13;
            }
            return z10;
        }
        if (i12 + 2 > charSequence.length()) {
            return z10;
        }
        int i14 = i12 + 1;
        char charAt = charSequence.charAt(i12);
        int i15 = i14 + 1;
        char charAt2 = charSequence.charAt(i14);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i16 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i16 >= 0 && i16 <= 59) {
                iArr[i10] = i16;
                iArr[0] = i15;
                return false;
            }
        }
        return z10;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        Long e10 = zVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int i10 = (int) longValue;
        if (longValue == i10) {
            if (i10 != 0) {
                int abs = Math.abs((i10 / 3600) % 100);
                int abs2 = Math.abs((i10 / 60) % 60);
                int abs3 = Math.abs(i10 % 60);
                int length = sb.length();
                sb.append(i10 < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i11 = this.f11950b;
                if (i11 >= 3 || (i11 >= 1 && abs2 > 0)) {
                    int i12 = i11 % 2;
                    String str = ":";
                    sb.append(i12 == 0 ? ":" : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    if (i11 >= 7 || (i11 >= 5 && abs3 > 0)) {
                        if (i12 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f11949a);
            return true;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // j$.time.format.InterfaceC0257g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int i11;
        long j2;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        boolean z10;
        int length = charSequence.length();
        int length2 = this.f11949a.length();
        if (length2 == 0) {
            if (i10 == length) {
                aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                i11 = i10;
                j2 = 0;
                return xVar.o(aVar2, j2, i10, i11);
            }
        } else if (i10 == length) {
            return ~i10;
        } else {
            if (xVar.s(charSequence, i10, this.f11949a, 0, length2)) {
                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                i11 = i10 + length2;
                j2 = 0;
                aVar2 = aVar;
                return xVar.o(aVar2, j2, i10, i11);
            }
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == '+' || charAt == '-') {
            int i12 = charAt == '-' ? -1 : 1;
            int[] iArr = new int[4];
            iArr[0] = i10 + 1;
            if (!a(iArr, 1, charSequence, true)) {
                if (!a(iArr, 2, charSequence, this.f11950b >= 3) && !a(iArr, 3, charSequence, false)) {
                    z10 = false;
                    if (!z10) {
                        aVar = j$.time.temporal.a.OFFSET_SECONDS;
                        int i13 = iArr[0];
                        j2 = ((iArr[2] * 60) + (iArr[1] * 3600) + iArr[3]) * i12;
                        i11 = i13;
                        aVar2 = aVar;
                        return xVar.o(aVar2, j2, i10, i11);
                    }
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        if (length2 != 0) {
            return ~i10;
        }
        aVar = j$.time.temporal.a.OFFSET_SECONDS;
        i11 = i10 + length2;
        j2 = 0;
        aVar2 = aVar;
        return xVar.o(aVar2, j2, i10, i11);
    }

    public final String toString() {
        String replace = this.f11949a.replace("'", "''");
        return "Offset(" + c[this.f11950b] + ",'" + replace + "')";
    }
}
