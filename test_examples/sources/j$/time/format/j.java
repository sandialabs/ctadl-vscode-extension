package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11940a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11941b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f11940a = i10;
        this.f11941b = obj;
    }

    private static void a(StringBuilder sb, int i10) {
        sb.append((char) ((i10 / 10) + 48));
        sb.append((char) ((i10 % 10) + 48));
    }

    static int b(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt >= '0' && charAt <= '9') {
            return charAt - '0';
        }
        return -1;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        int i10 = this.f11940a;
        Object obj = this.f11941b;
        switch (i10) {
            case 0:
                Long e10 = zVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (e10 == null) {
                    return false;
                }
                sb.append("GMT");
                long longValue = e10.longValue();
                int i11 = (int) longValue;
                if (longValue == i11) {
                    if (i11 != 0) {
                        int abs = Math.abs((i11 / 3600) % 100);
                        int abs2 = Math.abs((i11 / 60) % 60);
                        int abs3 = Math.abs(i11 % 60);
                        sb.append(i11 < 0 ? "-" : "+");
                        if (((G) obj) == G.FULL) {
                            a(sb, abs);
                            sb.append(':');
                            a(sb, abs2);
                            if (abs3 == 0) {
                                return true;
                            }
                        } else {
                            if (abs >= 10) {
                                sb.append((char) ((abs / 10) + 48));
                            }
                            sb.append((char) ((abs % 10) + 48));
                            if (abs2 == 0 && abs3 == 0) {
                                return true;
                            }
                            sb.append(':');
                            a(sb, abs2);
                            if (abs3 == 0) {
                                return true;
                            }
                        }
                        sb.append(':');
                        a(sb, abs3);
                        return true;
                    }
                    return true;
                }
                throw new ArithmeticException();
            default:
                sb.append((String) obj);
                return true;
        }
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int b5;
        int i12;
        int i13;
        int i14;
        int b10;
        int i15;
        long j2;
        j$.time.temporal.a aVar;
        x xVar2;
        int i16;
        int i17 = this.f11940a;
        Object obj = this.f11941b;
        switch (i17) {
            case 0:
                int length = charSequence.length() + i10;
                if (xVar.s(charSequence, i10, "GMT", 0, 3)) {
                    int i18 = i10 + 3;
                    if (i18 != length) {
                        char charAt = charSequence.charAt(i18);
                        if (charAt == '+') {
                            i11 = 1;
                        } else {
                            i11 = charAt == '-' ? -1 : -1;
                        }
                        int i19 = i18 + 1;
                        int i20 = 0;
                        if (((G) obj) == G.FULL) {
                            int i21 = i19 + 1;
                            int b11 = b(charSequence, i19);
                            int i22 = i21 + 1;
                            int b12 = b(charSequence, i21);
                            if (b11 >= 0 && b12 >= 0) {
                                int i23 = i22 + 1;
                                if (charSequence.charAt(i22) == ':') {
                                    b5 = (b11 * 10) + b12;
                                    int i24 = i23 + 1;
                                    int b13 = b(charSequence, i23);
                                    i14 = i24 + 1;
                                    int b14 = b(charSequence, i24);
                                    if (b13 >= 0 && b14 >= 0) {
                                        i13 = (b13 * 10) + b14;
                                        int i25 = i14 + 2;
                                        if (i25 < length && charSequence.charAt(i14) == ':') {
                                            b10 = b(charSequence, i14 + 1);
                                            i15 = b(charSequence, i25);
                                            if (b10 >= 0 && i15 >= 0) {
                                                i20 = (b10 * 10) + i15;
                                                i14 += 3;
                                            }
                                        }
                                        j2 = ((i13 * 60) + (b5 * 3600) + i20) * i11;
                                        aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                        xVar2 = xVar;
                                        i16 = i10;
                                        i18 = i14;
                                    }
                                }
                            }
                        } else {
                            int i26 = i19 + 1;
                            b5 = b(charSequence, i19);
                            if (b5 >= 0) {
                                if (i26 < length) {
                                    int b15 = b(charSequence, i26);
                                    if (b15 >= 0) {
                                        b5 = (b5 * 10) + b15;
                                        i26++;
                                    }
                                    int i27 = i26 + 2;
                                    if (i27 < length && charSequence.charAt(i26) == ':' && i27 < length && charSequence.charAt(i26) == ':') {
                                        int b16 = b(charSequence, i26 + 1);
                                        int b17 = b(charSequence, i27);
                                        if (b16 >= 0 && b17 >= 0) {
                                            i12 = (b16 * 10) + b17;
                                            i26 += 3;
                                            int i28 = i26 + 2;
                                            if (i28 < length && charSequence.charAt(i26) == ':') {
                                                b10 = b(charSequence, i26 + 1);
                                                int b18 = b(charSequence, i28);
                                                if (b10 >= 0 && b18 >= 0) {
                                                    i14 = i26;
                                                    i15 = b18;
                                                    i13 = i12;
                                                    i20 = (b10 * 10) + i15;
                                                    i14 += 3;
                                                    j2 = ((i13 * 60) + (b5 * 3600) + i20) * i11;
                                                    aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                                    xVar2 = xVar;
                                                    i16 = i10;
                                                    i18 = i14;
                                                }
                                            }
                                            i13 = i12;
                                            i14 = i26;
                                            j2 = ((i13 * 60) + (b5 * 3600) + i20) * i11;
                                            aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                            xVar2 = xVar;
                                            i16 = i10;
                                            i18 = i14;
                                        }
                                    }
                                }
                                i12 = 0;
                                i13 = i12;
                                i14 = i26;
                                j2 = ((i13 * 60) + (b5 * 3600) + i20) * i11;
                                aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                xVar2 = xVar;
                                i16 = i10;
                                i18 = i14;
                            }
                        }
                        return xVar2.o(aVar, j2, i16, i18);
                    }
                    aVar = j$.time.temporal.a.OFFSET_SECONDS;
                    j2 = 0;
                    xVar2 = xVar;
                    i16 = i10;
                    return xVar2.o(aVar, j2, i16, i18);
                }
                return ~i10;
            default:
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) obj;
                return !xVar.s(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        int i10 = this.f11940a;
        Object obj = this.f11941b;
        switch (i10) {
            case 0:
                return "LocalizedOffset(" + ((G) obj) + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
