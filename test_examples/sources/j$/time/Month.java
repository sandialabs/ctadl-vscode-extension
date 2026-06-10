package j$.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.t;

/* loaded from: classes2.dex */
public enum Month implements j$.time.temporal.l, j$.time.temporal.m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a  reason: collision with root package name */
    private static final Month[] f11879a = values();

    public static Month v(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i10);
        }
        return f11879a[i10 - 1];
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR : oVar != null && oVar.e(this);
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.MONTH_OF_YEAR ? ordinal() + 1 : j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.MONTH_OF_YEAR ? oVar.h() : j$.time.temporal.n.c(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        if (((j$.time.chrono.a) j$.time.chrono.b.b(kVar)).equals(j$.time.chrono.e.f11895a)) {
            return kVar.e(ordinal() + 1, j$.time.temporal.a.MONTH_OF_YEAR);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new s("Unsupported field: " + oVar);
        }
        return oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        return qVar == j$.time.temporal.n.d() ? j$.time.chrono.e.f11895a : qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.b(this, qVar);
    }

    public final int t(boolean z10) {
        switch (k.f12007a[ordinal()]) {
            case 1:
                return 32;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return (z10 ? 1 : 0) + 91;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return (z10 ? 1 : 0) + 152;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case ma.i.f16046m /* 9 */:
                return (z10 ? 1 : 0) + 182;
            case ma.i.f16047o /* 10 */:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public final int u(boolean z10) {
        int i10 = k.f12007a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final Month w() {
        int i10 = ((int) 1) + 12;
        return f11879a[(i10 + ordinal()) % 12];
    }
}
