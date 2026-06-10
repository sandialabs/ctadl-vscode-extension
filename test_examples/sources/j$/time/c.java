package j$.time;

import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.t;

/* loaded from: classes2.dex */
public enum c implements j$.time.temporal.l, j$.time.temporal.m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a  reason: collision with root package name */
    private static final c[] f11892a = values();

    public static c u(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new DateTimeException("Invalid value for DayOfWeek: " + i10);
        }
        return f11892a[i10 - 1];
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.DAY_OF_WEEK : oVar != null && oVar.e(this);
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? t() : j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? oVar.h() : j$.time.temporal.n.c(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(t(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return t();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new s("Unsupported field: " + oVar);
        }
        return oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        return qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.DAYS : j$.time.temporal.n.b(this, qVar);
    }

    public final int t() {
        return ordinal() + 1;
    }

    public final c v(long j2) {
        int i10 = ((int) (j2 % 7)) + 7;
        return f11892a[(i10 + ordinal()) % 7];
    }
}
