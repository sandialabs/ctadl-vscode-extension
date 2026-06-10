package j$.time.format;

import j$.time.DateTimeException;
import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k implements InterfaceC0257g {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f11942f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final j$.time.temporal.o f11943a;

    /* renamed from: b  reason: collision with root package name */
    final int f11944b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    private final F f11945d;

    /* renamed from: e  reason: collision with root package name */
    final int f11946e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j$.time.temporal.o oVar, int i10, int i11, F f10) {
        this.f11943a = oVar;
        this.f11944b = i10;
        this.c = i11;
        this.f11945d = f10;
        this.f11946e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(j$.time.temporal.o oVar, int i10, int i11, F f10, int i12) {
        this.f11943a = oVar;
        this.f11944b = i10;
        this.c = i11;
        this.f11945d = f10;
        this.f11946e = i12;
    }

    long b(z zVar, long j2) {
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(x xVar) {
        int i10 = this.f11946e;
        if (i10 != -1 && (i10 <= 0 || this.f11944b != this.c || this.f11945d != F.NOT_NEGATIVE)) {
            return false;
        }
        return true;
    }

    int d(x xVar, long j2, int i10, int i11) {
        return xVar.o(this.f11943a, j2, i10, i11);
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.f11943a;
        Long e10 = zVar.e(oVar);
        if (e10 == null) {
            return false;
        }
        long b5 = b(zVar, e10.longValue());
        C b10 = zVar.b();
        String l2 = b5 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b5));
        int length = l2.length();
        int i10 = this.c;
        if (length > i10) {
            throw new DateTimeException("Field " + oVar + " cannot be printed as the value " + b5 + " exceeds the maximum print width of " + i10);
        }
        b10.getClass();
        int i11 = this.f11944b;
        F f10 = this.f11945d;
        if (b5 >= 0) {
            int i12 = AbstractC0254d.f11933a[f10.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                }
                sb.append('+');
            } else if (i11 < 19 && b5 >= f11942f[i11]) {
                sb.append('+');
            }
        } else {
            int i13 = AbstractC0254d.f11933a[f10.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb.append('-');
            } else if (i13 == 4) {
                throw new DateTimeException("Field " + oVar + " cannot be printed as the value " + b5 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - l2.length(); i14++) {
            sb.append('0');
        }
        sb.append(l2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0111, code lost:
        r5 = r13;
        r1 = r16;
        r3 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    @Override // j$.time.format.InterfaceC0257g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(x xVar, CharSequence charSequence, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        BigInteger bigInteger;
        long j2;
        long j10;
        boolean z12;
        int i15 = i10;
        int length = charSequence.length();
        if (i15 == length) {
            return ~i15;
        }
        char charAt = charSequence.charAt(i10);
        xVar.g().getClass();
        int i16 = 0;
        int i17 = this.c;
        F f10 = this.f11945d;
        int i18 = this.f11944b;
        if (charAt == '+') {
            boolean l2 = xVar.l();
            boolean z13 = i18 == i17;
            int ordinal = f10.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 4) {
                        if (!l2) {
                        }
                        z12 = false;
                    }
                }
            } else {
                z12 = l2 ? true : true;
                z12 = false;
            }
            if (!z12) {
                return ~i15;
            }
            i11 = i15 + 1;
            z11 = true;
            z10 = false;
        } else {
            xVar.g().getClass();
            if (charAt == '-') {
                boolean l4 = xVar.l();
                boolean z14 = i18 == i17;
                int ordinal2 = f10.ordinal();
                if (!(ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 4 || !(l4 || z14))) {
                    return ~i15;
                }
                i15++;
                z10 = true;
            } else if (f10 == F.ALWAYS && xVar.l()) {
                return ~i15;
            } else {
                z10 = false;
            }
            i11 = i15;
            z11 = false;
        }
        if (!xVar.l() && !c(xVar)) {
            i12 = 1;
            i13 = i11 + i12;
            if (i13 <= length) {
                return ~i11;
            }
            if (!xVar.l() && !c(xVar)) {
                i17 = 9;
            }
            int i19 = this.f11946e;
            int max = Math.max(i19, 0) + i17;
            while (true) {
                BigInteger bigInteger2 = null;
                if (i16 >= 2) {
                    i14 = i11;
                    bigInteger = null;
                    j2 = 0;
                    break;
                }
                int min = Math.min(max + i11, length);
                int i20 = i11;
                long j11 = 0;
                while (true) {
                    if (i20 >= min) {
                        break;
                    }
                    int i21 = i20 + 1;
                    int a10 = xVar.g().a(charSequence.charAt(i20));
                    if (a10 < 0) {
                        i20 = i21 - 1;
                        if (i20 < i13) {
                            return ~i11;
                        }
                    } else {
                        if (i21 - i11 > 18) {
                            if (bigInteger2 == null) {
                                bigInteger2 = BigInteger.valueOf(j11);
                            }
                            bigInteger2 = bigInteger2.multiply(BigInteger.TEN).add(BigInteger.valueOf(a10));
                        } else {
                            j11 = (j11 * 10) + a10;
                        }
                        i20 = i21;
                    }
                }
                if (i19 <= 0 || i16 != 0) {
                    break;
                }
                max = Math.max(i12, (i20 - i11) - i19);
                i16++;
            }
            if (z10) {
                if (bigInteger == null) {
                    if (j2 == 0 && xVar.l()) {
                        return ~(i11 - 1);
                    }
                    j10 = -j2;
                    if (bigInteger == null) {
                        if (bigInteger.bitLength() > 63) {
                            bigInteger = bigInteger.divide(BigInteger.TEN);
                            i14--;
                        }
                        return d(xVar, bigInteger.longValue(), i11, i14);
                    }
                    return d(xVar, j10, i11, i14);
                } else if (bigInteger.equals(BigInteger.ZERO) && xVar.l()) {
                    return ~(i11 - 1);
                } else {
                    bigInteger = bigInteger.negate();
                }
            } else if (f10 == F.EXCEEDS_PAD && xVar.l()) {
                int i22 = i14 - i11;
                if (z11) {
                    if (i22 <= i18) {
                        return ~(i11 - 1);
                    }
                } else if (i22 > i18) {
                    return ~i11;
                }
            }
            j10 = j2;
            if (bigInteger == null) {
            }
        }
        i12 = i18;
        i13 = i11 + i12;
        if (i13 <= length) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k g() {
        return this.f11946e == -1 ? this : new k(this.f11943a, this.f11944b, this.c, this.f11945d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k h(int i10) {
        return new k(this.f11943a, this.f11944b, this.c, this.f11945d, this.f11946e + i10);
    }

    public String toString() {
        F f10 = this.f11945d;
        j$.time.temporal.o oVar = this.f11943a;
        int i10 = this.c;
        int i11 = this.f11944b;
        if (i11 == 1 && i10 == 19 && f10 == F.NORMAL) {
            return "Value(" + oVar + ")";
        } else if (i11 == i10 && f10 == F.NOT_NEGATIVE) {
            return "Value(" + oVar + "," + i11 + ")";
        } else {
            return "Value(" + oVar + "," + i11 + "," + i10 + "," + f10 + ")";
        }
    }
}
