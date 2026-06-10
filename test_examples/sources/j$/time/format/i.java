package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i implements InterfaceC0257g {
    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        Long e10 = zVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l d5 = zVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d5.c(aVar) ? Long.valueOf(zVar.d().o(aVar)) : null;
        int i10 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int o10 = aVar.o(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j2 = (longValue - 315569520000L) + 62167219200L;
            long g10 = j$.time.a.g(j2, 315569520000L) + 1;
            LocalDateTime B = LocalDateTime.B(j$.time.a.e(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (g10 > 0) {
                sb.append('+');
                sb.append(g10);
            }
            sb.append(B);
            if (B.w() == 0) {
                sb.append(":00");
            }
        } else {
            long j10 = longValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime B2 = LocalDateTime.B(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(B2);
            if (B2.w() == 0) {
                sb.append(":00");
            }
            if (j11 < 0) {
                if (B2.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb.insert(length, j11);
                } else {
                    sb.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (o10 > 0) {
            sb.append('.');
            int i11 = 100000000;
            while (true) {
                if (o10 <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = o10 / i11;
                sb.append((char) (i12 + 48));
                o10 -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        w wVar = new w();
        wVar.a(DateTimeFormatter.f11912h);
        wVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        wVar.m(aVar, 2);
        wVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        wVar.m(aVar2, 2);
        wVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        wVar.m(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i13 = 0;
        wVar.b(aVar4, 0, 9, true);
        wVar.e('Z');
        C0256f h10 = wVar.t().h();
        x d5 = xVar.d();
        int f10 = h10.f(d5, charSequence, i10);
        if (f10 < 0) {
            return f10;
        }
        long longValue = d5.j(j$.time.temporal.a.YEAR).longValue();
        int intValue = d5.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = d5.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = d5.j(aVar).intValue();
        int intValue4 = d5.j(aVar2).intValue();
        Long j2 = d5.j(aVar3);
        Long j10 = d5.j(aVar4);
        int intValue5 = j2 != null ? j2.intValue() : 0;
        int intValue6 = j10 != null ? j10.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i12 = intValue5;
            i13 = 1;
            i11 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.p();
            i11 = intValue3;
            i12 = 59;
        } else {
            i11 = intValue3;
            i12 = intValue5;
        }
        try {
            return xVar.o(aVar4, intValue6, i10, xVar.o(j$.time.temporal.a.INSTANT_SECONDS, j$.time.a.f(longValue / 10000, 315569520000L) + LocalDateTime.of(((int) longValue) % 10000, intValue, intValue2, i11, intValue4, i12, 0).D(i13).G(ZoneOffset.UTC), i10, f10));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
