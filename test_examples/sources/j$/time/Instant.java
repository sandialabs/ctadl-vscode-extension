package j$.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, j$.time.temporal.m, Comparable<Instant>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final long f11873a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11874b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j2, int i10) {
        this.f11873a = j2;
        this.f11874b = i10;
    }

    public static Instant ofEpochSecond(long j2, long j10) {
        return t(a.d(j2, a.g(j10, 1000000000L)), (int) a.e(j10, 1000000000L));
    }

    private static Instant t(long j2, int i10) {
        if ((i10 | j2) == 0) {
            return EPOCH;
        }
        if (j2 < -31557014167219200L || j2 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j2, i10);
    }

    public static Instant u(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        if (lVar != null) {
            try {
                return ofEpochSecond(lVar.o(j$.time.temporal.a.INSTANT_SECONDS), lVar.f(j$.time.temporal.a.NANO_OF_SECOND));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e10);
            }
        }
        throw new NullPointerException("temporal");
    }

    public static Instant v(long j2) {
        return t(a.g(j2, 1000L), ((int) a.e(j2, 1000L)) * 1000000);
    }

    public static Instant w(long j2) {
        return t(j2, 0);
    }

    private Instant x(long j2, long j10) {
        if ((j2 | j10) == 0) {
            return this;
        }
        return ofEpochSecond(a.d(a.d(this.f11873a, j2), j10 / 1000000000), this.f11874b + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND : oVar != null && oVar.e(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.f11873a, instant.f11873a);
        return compare != 0 ? compare : this.f11874b - instant.f11874b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k e(long j2, j$.time.temporal.o oVar) {
        int i10;
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.r(j2);
            int i11 = e.f11898a[aVar.ordinal()];
            long j10 = this.f11873a;
            int i12 = this.f11874b;
            if (i11 == 1) {
                if (j2 != i12) {
                    i10 = (int) j2;
                    return t(j10, i10);
                }
                return this;
            } else if (i11 == 2) {
                i10 = ((int) j2) * 1000;
                if (i10 != i12) {
                    return t(j10, i10);
                }
                return this;
            } else {
                if (i11 == 3) {
                    i10 = ((int) j2) * 1000000;
                    if (i10 != i12) {
                        return t(j10, i10);
                    }
                } else if (i11 != 4) {
                    throw new s("Unsupported field: " + oVar);
                } else if (j2 != j10) {
                    return t(j2, i12);
                }
                return this;
            }
        }
        return (Instant) oVar.k(this, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f11873a == instant.f11873a && this.f11874b == instant.f11874b;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = e.f11898a[((j$.time.temporal.a) oVar).ordinal()];
            int i11 = this.f11874b;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.o(this.f11873a);
                        }
                        throw new s("Unsupported field: " + oVar);
                    }
                    return i11 / 1000000;
                }
                return i11 / 1000;
            }
            return i11;
        }
        return j$.time.temporal.n.c(this, oVar).a(oVar.j(this), oVar);
    }

    public long getEpochSecond() {
        return this.f11873a;
    }

    public int getNano() {
        return this.f11874b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k h(LocalDate localDate) {
        return (Instant) localDate.k(this);
    }

    public int hashCode() {
        long j2 = this.f11873a;
        return (this.f11874b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.c(this, oVar);
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k j(long j2, r rVar) {
        long j10;
        if (rVar instanceof j$.time.temporal.b) {
            switch (e.f11899b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return plusNanos(j2);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    return x(j2 / 1000000, (j2 % 1000000) * 1000);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    return x(j2 / 1000, (j2 % 1000) * 1000000);
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    return plusSeconds(j2);
                case 5:
                    j10 = 60;
                    j2 = a.f(j2, j10);
                    return plusSeconds(j2);
                case 6:
                    j10 = 3600;
                    j2 = a.f(j2, j10);
                    return plusSeconds(j2);
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    j10 = 43200;
                    j2 = a.f(j2, j10);
                    return plusSeconds(j2);
                case 8:
                    j10 = 86400;
                    j2 = a.f(j2, j10);
                    return plusSeconds(j2);
                default:
                    throw new s("Unsupported unit: " + rVar);
            }
        }
        return (Instant) rVar.e(this, j2);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(this.f11873a, j$.time.temporal.a.INSTANT_SECONDS).e(this.f11874b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        int i10;
        if (oVar instanceof j$.time.temporal.a) {
            int i11 = e.f11898a[((j$.time.temporal.a) oVar).ordinal()];
            int i12 = this.f11874b;
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = i12 / 1000;
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        return this.f11873a;
                    }
                    throw new s("Unsupported field: " + oVar);
                } else {
                    i10 = i12 / 1000000;
                }
                return i10;
            }
            return i12;
        }
        return oVar.j(this);
    }

    public Instant plusNanos(long j2) {
        return x(0L, j2);
    }

    public Instant plusSeconds(long j2) {
        return x(j2, 0L);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (qVar != j$.time.temporal.n.d() && qVar != j$.time.temporal.n.k() && qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.h() && qVar != j$.time.temporal.n.e() && qVar != j$.time.temporal.n.f()) {
            return qVar.d(this);
        }
        return null;
    }

    public long toEpochMilli() {
        long f10;
        int i10;
        int i11 = this.f11874b;
        long j2 = this.f11873a;
        if (j2 >= 0 || i11 <= 0) {
            f10 = a.f(j2, 1000L);
            i10 = i11 / 1000000;
        } else {
            f10 = a.f(j2 + 1, 1000L);
            i10 = (i11 / 1000000) - 1000;
        }
        return a.d(f10, i10);
    }

    public String toString() {
        return DateTimeFormatter.f11915k.a(this);
    }
}
