package j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0258h implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.o f11937a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11938b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11939d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0258h(j$.time.temporal.a aVar, int i10, int i11, boolean z10) {
        if (aVar == null) {
            throw new NullPointerException("field");
        }
        if (!aVar.h().f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        } else if (i11 >= i10) {
            this.f11937a = aVar;
            this.f11938b = i10;
            this.c = i11;
            this.f11939d = z10;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.f11937a;
        Long e10 = zVar.e(oVar);
        if (e10 == null) {
            return false;
        }
        C b5 = zVar.b();
        long longValue = e10.longValue();
        j$.time.temporal.t h10 = oVar.h();
        h10.b(longValue, oVar);
        BigDecimal valueOf = BigDecimal.valueOf(h10.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(h10.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z10 = this.f11939d;
        int i10 = this.f11938b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i10), this.c), RoundingMode.FLOOR).toPlainString().substring(2);
            b5.getClass();
            if (z10) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i10 > 0) {
            if (z10) {
                b5.getClass();
                sb.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                b5.getClass();
                sb.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12 = xVar.l() ? this.f11938b : 0;
        int i13 = xVar.l() ? this.c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i12 > 0 ? ~i10 : i10;
        }
        if (this.f11939d) {
            char charAt = charSequence.charAt(i10);
            xVar.g().getClass();
            if (charAt != '.') {
                return i12 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i14 = i10;
        int i15 = i12 + i14;
        if (i15 > length) {
            return ~i14;
        }
        int min = Math.min(i13 + i14, length);
        int i16 = i14;
        int i17 = 0;
        while (true) {
            if (i16 >= min) {
                i11 = i16;
                break;
            }
            int i18 = i16 + 1;
            int a10 = xVar.g().a(charSequence.charAt(i16));
            if (a10 >= 0) {
                i17 = (i17 * 10) + a10;
                i16 = i18;
            } else if (i18 < i15) {
                return ~i14;
            } else {
                i11 = i18 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i17).movePointLeft(i11 - i14);
        j$.time.temporal.t h10 = this.f11937a.h();
        BigDecimal valueOf = BigDecimal.valueOf(h10.e());
        return xVar.o(this.f11937a, movePointLeft.multiply(BigDecimal.valueOf(h10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i14, i11);
    }

    public final String toString() {
        String str = this.f11939d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f11937a + "," + this.f11938b + "," + this.c + str + ")";
    }
}
