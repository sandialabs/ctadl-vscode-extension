package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.zone.ZoneRules;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.k, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f11881a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f11882b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f11887g;
        localDateTime.getClass();
        u(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f11886f;
        localDateTime2.getClass();
        u(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (localDateTime == null) {
            throw new NullPointerException("dateTime");
        }
        this.f11881a = localDateTime;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.f11882b = zoneOffset;
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f11914j;
        if (dateTimeFormatter != null) {
            return (OffsetDateTime) dateTimeFormatter.f(charSequence, new f(2));
        }
        throw new NullPointerException("formatter");
    }

    public static OffsetDateTime t(j$.time.temporal.l lVar) {
        if (lVar instanceof OffsetDateTime) {
            return (OffsetDateTime) lVar;
        }
        try {
            ZoneOffset u10 = ZoneOffset.u(lVar);
            LocalDate localDate = (LocalDate) lVar.r(j$.time.temporal.n.e());
            j jVar = (j) lVar.r(j$.time.temporal.n.f());
            return (localDate == null || jVar == null) ? v(Instant.u(lVar), u10) : new OffsetDateTime(LocalDateTime.A(localDate, jVar), u10);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e10);
        }
    }

    public static OffsetDateTime u(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime v(Instant instant, ZoneOffset zoneOffset) {
        if (instant != null) {
            if (zoneOffset != null) {
                ZoneOffset d5 = ZoneRules.i(zoneOffset).d(instant);
                return new OffsetDateTime(LocalDateTime.B(instant.getEpochSecond(), instant.getNano(), d5), d5);
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("instant");
    }

    private OffsetDateTime x(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f11881a == localDateTime && this.f11882b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a) && (oVar == null || !oVar.e(this))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f11882b;
        ZoneOffset zoneOffset2 = this.f11882b;
        boolean equals = zoneOffset2.equals(zoneOffset);
        LocalDateTime localDateTime = offsetDateTime2.f11881a;
        LocalDateTime localDateTime2 = this.f11881a;
        if (equals) {
            compare = localDateTime2.compareTo((ChronoLocalDateTime<?>) localDateTime);
        } else {
            compare = Long.compare(localDateTime2.G(zoneOffset2), localDateTime.G(offsetDateTime2.f11882b));
            if (compare == 0) {
                compare = localDateTime2.b().x() - localDateTime.b().x();
            }
        }
        return compare == 0 ? localDateTime2.compareTo((ChronoLocalDateTime<?>) localDateTime) : compare;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k e(long j2, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = l.f12008a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f11882b;
            LocalDateTime localDateTime = this.f11881a;
            return i10 != 1 ? i10 != 2 ? x(localDateTime.e(j2, oVar), zoneOffset) : x(localDateTime, ZoneOffset.x(aVar.o(j2))) : v(Instant.ofEpochSecond(j2, localDateTime.v()), zoneOffset);
        }
        return (OffsetDateTime) oVar.k(this, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f11881a.equals(offsetDateTime.f11881a) && this.f11882b.equals(offsetDateTime.f11882b);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = l.f12008a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? this.f11881a.f(oVar) : this.f11882b.v();
            }
            throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k h(LocalDate localDate) {
        return x(this.f11881a.h(localDate), this.f11882b);
    }

    public final int hashCode() {
        return this.f11881a.hashCode() ^ this.f11882b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f11881a.i(oVar);
            }
            return oVar.h();
        }
        return oVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k j(long j2, r rVar) {
        return rVar instanceof j$.time.temporal.b ? x(this.f11881a.j(j2, rVar), this.f11882b) : (OffsetDateTime) rVar.e(this, j2);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f11881a;
        return kVar.e(localDateTime.m().p(), aVar).e(localDateTime.b().G(), j$.time.temporal.a.NANO_OF_DAY).e(this.f11882b.v(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = l.f12008a[((j$.time.temporal.a) oVar).ordinal()];
            ZoneOffset zoneOffset = this.f11882b;
            LocalDateTime localDateTime = this.f11881a;
            return i10 != 1 ? i10 != 2 ? localDateTime.o(oVar) : zoneOffset.v() : localDateTime.G(zoneOffset);
        }
        return oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar != j$.time.temporal.n.h() && qVar != j$.time.temporal.n.j()) {
            if (qVar == j$.time.temporal.n.k()) {
                return null;
            }
            j$.time.temporal.p e10 = j$.time.temporal.n.e();
            LocalDateTime localDateTime = this.f11881a;
            return qVar == e10 ? localDateTime.m() : qVar == j$.time.temporal.n.f() ? localDateTime.b() : qVar == j$.time.temporal.n.d() ? j$.time.chrono.e.f11895a : qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : qVar.d(this);
        }
        return this.f11882b;
    }

    public Instant toInstant() {
        return this.f11881a.H(this.f11882b);
    }

    public final String toString() {
        return this.f11881a.toString() + this.f11882b.toString();
    }

    public final LocalDateTime w() {
        return this.f11881a;
    }
}
