package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.k, ChronoZonedDateTime<LocalDate>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f11889a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f11890b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f11889a = localDateTime;
        this.f11890b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime t(long j2, int i10, ZoneId zoneId) {
        ZoneOffset d5 = zoneId.getRules().d(Instant.ofEpochSecond(j2, i10));
        return new ZonedDateTime(LocalDateTime.B(j2, i10, d5), zoneId, d5);
    }

    public static ZonedDateTime u(Instant instant, ZoneId zoneId) {
        if (instant != null) {
            if (zoneId != null) {
                return t(instant.getEpochSecond(), instant.getNano(), zoneId);
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("instant");
    }

    public static ZonedDateTime v(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        if (localDateTime != null) {
            if (zoneId != null) {
                if (zoneId instanceof ZoneOffset) {
                    return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
                }
                ZoneRules rules = zoneId.getRules();
                List g10 = rules.g(localDateTime);
                if (g10.size() == 1) {
                    zoneOffset = (ZoneOffset) g10.get(0);
                } else if (g10.size() == 0) {
                    j$.time.zone.a f10 = rules.f(localDateTime);
                    localDateTime = localDateTime.E(f10.h().f());
                    zoneOffset = f10.i();
                } else if ((zoneOffset == null || !g10.contains(zoneOffset)) && (zoneOffset = (ZoneOffset) g10.get(0)) == null) {
                    throw new NullPointerException("offset");
                }
                return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("localDateTime");
    }

    private ZonedDateTime w(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.f11890b)) {
            ZoneId zoneId = this.c;
            ZoneRules rules = zoneId.getRules();
            LocalDateTime localDateTime = this.f11889a;
            if (rules.g(localDateTime).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
            }
        }
        return this;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.d a() {
        x().getClass();
        return j$.time.chrono.e.f11895a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j b() {
        return this.f11889a.b();
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a) && (oVar == null || !oVar.e(this))) {
            return false;
        }
        return true;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset d() {
        return this.f11890b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k e(long j2, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = p.f12014a[aVar.ordinal()];
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.f11889a;
            return i10 != 1 ? i10 != 2 ? v(localDateTime.e(j2, oVar), zoneId, this.f11890b) : w(ZoneOffset.x(aVar.o(j2))) : t(j2, localDateTime.v(), zoneId);
        }
        return (ZonedDateTime) oVar.k(this, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f11889a.equals(zonedDateTime.f11889a) && this.f11890b.equals(zonedDateTime.f11890b) && this.c.equals(zonedDateTime.c);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = p.f12014a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? this.f11889a.f(oVar) : this.f11890b.v();
            }
            throw new s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.chrono.b.a(this, oVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalDateTime g() {
        return this.f11889a;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k h(LocalDate localDate) {
        return v(LocalDateTime.A(localDate, this.f11889a.b()), this.c, this.f11890b);
    }

    public final int hashCode() {
        return (this.f11889a.hashCode() ^ this.f11890b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f11889a.i(oVar);
            }
            return oVar.h();
        }
        return oVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k j(long j2, r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            boolean isDateBased = rVar.isDateBased();
            LocalDateTime j10 = this.f11889a.j(j2, rVar);
            ZoneOffset zoneOffset = this.f11890b;
            ZoneId zoneId = this.c;
            if (isDateBased) {
                return v(j10, zoneId, zoneOffset);
            }
            if (j10 != null) {
                if (zoneOffset != null) {
                    if (zoneId != null) {
                        return zoneId.getRules().g(j10).contains(zoneOffset) ? new ZonedDateTime(j10, zoneId, zoneOffset) : t(j10.G(zoneOffset), j10.v(), zoneId);
                    }
                    throw new NullPointerException("zone");
                }
                throw new NullPointerException("offset");
            }
            throw new NullPointerException("localDateTime");
        }
        return (ZonedDateTime) rVar.e(this, j2);
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public final int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(s(), chronoZonedDateTime.s());
        if (compare == 0) {
            int x3 = b().x() - chronoZonedDateTime.b().x();
            if (x3 == 0) {
                int compareTo = this.f11889a.compareTo((ChronoLocalDateTime) chronoZonedDateTime.g());
                if (compareTo == 0) {
                    int compareTo2 = this.c.getId().compareTo(chronoZonedDateTime.n().getId());
                    if (compareTo2 == 0) {
                        j$.time.chrono.d a10 = a();
                        j$.time.chrono.d a11 = chronoZonedDateTime.a();
                        ((j$.time.chrono.a) a10).getClass();
                        a11.getClass();
                        return 0;
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return x3;
        }
        return compare;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId n() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = p.f12014a[((j$.time.temporal.a) oVar).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f11889a.o(oVar) : this.f11890b.v() : s();
        }
        return oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar == j$.time.temporal.n.e()) {
            return x();
        }
        if (qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.k()) {
            return qVar == j$.time.temporal.n.h() ? this.f11890b : qVar == j$.time.temporal.n.f() ? b() : qVar == j$.time.temporal.n.d() ? a() : qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : qVar.d(this);
        }
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final long s() {
        return ((x().p() * 86400) + b().H()) - this.f11890b.v();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(s(), b().x());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11889a.toString());
        ZoneOffset zoneOffset = this.f11890b;
        sb.append(zoneOffset.toString());
        String sb2 = sb.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return sb2 + '[' + zoneId.toString() + ']';
        }
        return sb2;
    }

    public final LocalDate x() {
        return this.f11889a.m();
    }

    public final LocalDateTime y() {
        return this.f11889a;
    }
}
