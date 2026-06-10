package ia;

import kotlin.time.DurationUnit;
import v7.g;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: i  reason: collision with root package name */
    public final long f11869i;

    public /* synthetic */ f(long j2) {
        this.f11869i = j2;
    }

    public final long a(a aVar) {
        boolean z10;
        long t12;
        g.f(aVar, "other");
        boolean z11 = aVar instanceof f;
        long j2 = this.f11869i;
        if (z11) {
            int i10 = d.f11868b;
            long j10 = ((f) aVar).f11869i;
            boolean z12 = false;
            if (((j10 - 1) | 1) == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (j2 == j10) {
                    int i11 = b.f11864l;
                    return 0L;
                }
                return b.o(m0.b.t1(j10, DurationUnit.DAYS));
            }
            if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
                z12 = true;
            }
            if (z12) {
                return m0.b.t1(j2, DurationUnit.DAYS);
            }
            long j11 = j2 - j10;
            if (((j11 ^ j2) & (~(j11 ^ j10))) < 0) {
                long j12 = 1000000;
                int i12 = b.f11864l;
                t12 = b.l(m0.b.t1((j2 / j12) - (j10 / j12), DurationUnit.MILLISECONDS), m0.b.t1((j2 % j12) - (j10 % j12), DurationUnit.NANOSECONDS));
            } else {
                int i13 = b.f11864l;
                t12 = m0.b.t1(j11, DurationUnit.NANOSECONDS);
            }
            return t12;
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j2 + ')')) + " and " + aVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "other");
        return b.i(a(aVar2), 0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f11869i != ((f) obj).f11869i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f11869i;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f11869i + ')';
    }
}
