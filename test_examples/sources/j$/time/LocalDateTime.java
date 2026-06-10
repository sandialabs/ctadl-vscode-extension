package j$.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDate f11877a;

    /* renamed from: b  reason: collision with root package name */
    private final j f11878b;
    public static final LocalDateTime MIN = A(LocalDate.MIN, j.f12000e);
    public static final LocalDateTime MAX = A(LocalDate.MAX, j.f12001f);

    private LocalDateTime(LocalDate localDate, j jVar) {
        this.f11877a = localDate;
        this.f11878b = jVar;
    }

    public static LocalDateTime A(LocalDate localDate, j jVar) {
        if (localDate != null) {
            if (jVar != null) {
                return new LocalDateTime(localDate, jVar);
            }
            throw new NullPointerException("time");
        }
        throw new NullPointerException("date");
    }

    public static LocalDateTime B(long j2, int i10, ZoneOffset zoneOffset) {
        long v3;
        if (zoneOffset != null) {
            long j10 = i10;
            j$.time.temporal.a.NANO_OF_SECOND.r(j10);
            return new LocalDateTime(LocalDate.y(a.g(j2 + zoneOffset.v(), 86400L)), j.B((((int) a.e(v3, 86400L)) * 1000000000) + j10));
        }
        throw new NullPointerException("offset");
    }

    private LocalDateTime F(LocalDate localDate, long j2, long j10, long j11, long j12) {
        j jVar = this.f11878b;
        if ((j2 | j10 | j11 | j12) == 0) {
            return K(localDate, jVar);
        }
        long j13 = j2 / 24;
        long j14 = j13 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j15 = 1;
        long j16 = ((j2 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long G = jVar.G();
        long j17 = (j16 * j15) + G;
        long g10 = a.g(j17, 86400000000000L) + (j14 * j15);
        long e10 = a.e(j17, 86400000000000L);
        if (e10 != G) {
            jVar = j.B(e10);
        }
        return K(localDate.B(g10), jVar);
    }

    private LocalDateTime K(LocalDate localDate, j jVar) {
        return (this.f11877a == localDate && this.f11878b == jVar) ? this : new LocalDateTime(localDate, jVar);
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), j.A(i13, i14, i15, i16));
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        if (instant != null) {
            if (zoneId != null) {
                return B(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("instant");
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f11913i;
        if (dateTimeFormatter != null) {
            return (LocalDateTime) dateTimeFormatter.f(charSequence, new f(1));
        }
        throw new NullPointerException("formatter");
    }

    private int t(LocalDateTime localDateTime) {
        int t10 = this.f11877a.t(localDateTime.m());
        return t10 == 0 ? this.f11878b.compareTo(localDateTime.f11878b) : t10;
    }

    public static LocalDateTime u(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDateTime) {
            return (LocalDateTime) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).y();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).w();
        }
        try {
            return new LocalDateTime(LocalDate.u(lVar), j.v(lVar));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e10);
        }
    }

    public static LocalDateTime z(int i10) {
        return new LocalDateTime(LocalDate.of(i10, 12, 31), j.z());
    }

    @Override // j$.time.temporal.k
    /* renamed from: C */
    public final LocalDateTime j(long j2, r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            switch (h.f11997a[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return F(this.f11877a, 0L, 0L, 0L, j2);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    LocalDateTime D = D(j2 / 86400000000L);
                    return D.F(D.f11877a, 0L, 0L, 0L, (j2 % 86400000000L) * 1000);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    LocalDateTime D2 = D(j2 / 86400000);
                    return D2.F(D2.f11877a, 0L, 0L, 0L, (j2 % 86400000) * 1000000);
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    return E(j2);
                case 5:
                    return F(this.f11877a, 0L, j2, 0L, 0L);
                case 6:
                    return F(this.f11877a, j2, 0L, 0L, 0L);
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    LocalDateTime D3 = D(j2 / 256);
                    return D3.F(D3.f11877a, (j2 % 256) * 12, 0L, 0L, 0L);
                default:
                    return K(this.f11877a.j(j2, rVar), this.f11878b);
            }
        }
        return (LocalDateTime) rVar.e(this, j2);
    }

    public final LocalDateTime D(long j2) {
        return K(this.f11877a.B(j2), this.f11878b);
    }

    public final LocalDateTime E(long j2) {
        return F(this.f11877a, 0L, 0L, j2, 0L);
    }

    public final long G(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((m().p() * 86400) + this.f11878b.H()) - zoneOffset.v();
        }
        throw new NullPointerException("offset");
    }

    public final Instant H(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(G(zoneOffset), this.f11878b.x());
    }

    @Override // j$.time.temporal.k
    /* renamed from: I */
    public final LocalDateTime e(long j2, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            boolean isTimeBased = ((j$.time.temporal.a) oVar).isTimeBased();
            j jVar = this.f11878b;
            LocalDate localDate = this.f11877a;
            return isTimeBased ? K(localDate, jVar.e(j2, oVar)) : K(localDate.e(j2, oVar), jVar);
        }
        return (LocalDateTime) oVar.k(this, j2);
    }

    @Override // j$.time.temporal.k
    /* renamed from: J */
    public final LocalDateTime h(LocalDate localDate) {
        return K(localDate, this.f11878b);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.d a() {
        m().getClass();
        return j$.time.chrono.e.f11895a;
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.v(this, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j b() {
        return this.f11878b;
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.e(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return t((LocalDateTime) chronoLocalDateTime);
        }
        int compareTo = m().compareTo((ChronoLocalDate) chronoLocalDateTime.m());
        if (compareTo == 0) {
            int compareTo2 = this.f11878b.compareTo(chronoLocalDateTime.b());
            if (compareTo2 == 0) {
                j$.time.chrono.d a10 = a();
                j$.time.chrono.d a11 = chronoLocalDateTime.a();
                ((j$.time.chrono.a) a10).getClass();
                a11.getClass();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f11877a.equals(localDateTime.f11877a) && this.f11878b.equals(localDateTime.f11878b);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isTimeBased() ? this.f11878b.f(oVar) : this.f11877a.f(oVar) : j$.time.temporal.n.a(this, oVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    public int getYear() {
        return this.f11877a.getYear();
    }

    public int hashCode() {
        return this.f11877a.hashCode() ^ this.f11878b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).isTimeBased()) {
                j jVar = this.f11878b;
                jVar.getClass();
                return j$.time.temporal.n.c(jVar, oVar);
            }
            return this.f11877a.i(oVar);
        }
        return oVar.f(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(m().p(), j$.time.temporal.a.EPOCH_DAY).e(this.f11878b.G(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).isTimeBased() ? this.f11878b.o(oVar) : this.f11877a.o(oVar) : oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar == j$.time.temporal.n.e()) {
            return this.f11877a;
        }
        if (qVar != j$.time.temporal.n.k() && qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.h()) {
            return qVar == j$.time.temporal.n.f() ? this.f11878b : qVar == j$.time.temporal.n.d() ? a() : qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : qVar.d(this);
        }
        return null;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate */
    public LocalDate m() {
        return this.f11877a;
    }

    public String toString() {
        return this.f11877a.toString() + 'T' + this.f11878b.toString();
    }

    public final int v() {
        return this.f11878b.x();
    }

    public final int w() {
        return this.f11878b.y();
    }

    public final boolean x(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return t(localDateTime) > 0;
        }
        int i10 = (m().p() > localDateTime.m().p() ? 1 : (m().p() == localDateTime.m().p() ? 0 : -1));
        if (i10 <= 0) {
            return i10 == 0 && this.f11878b.G() > localDateTime.f11878b.G();
        }
        return true;
    }

    public final boolean y(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return t(localDateTime) < 0;
        }
        int i10 = (m().p() > localDateTime.m().p() ? 1 : (m().p() == localDateTime.m().p() ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 && this.f11878b.G() < localDateTime.f11878b.G();
        }
        return true;
    }
}
