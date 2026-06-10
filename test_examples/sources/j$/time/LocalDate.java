package j$.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.k, j$.time.temporal.m, ChronoLocalDate, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f11875a;

    /* renamed from: b  reason: collision with root package name */
    private final short f11876b;
    private final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    private LocalDate(int i10, int i11, int i12) {
        this.f11875a = i10;
        this.f11876b = (short) i11;
        this.c = (short) i12;
    }

    private static LocalDate F(int i10, int i11, int i12) {
        int i13;
        if (i11 == 2) {
            j$.time.chrono.e.f11895a.getClass();
            i13 = j$.time.chrono.e.h((long) i10) ? 29 : 28;
        } else if (i11 != 4 && i11 != 6 && i11 != 9 && i11 != 11) {
            return new LocalDate(i10, i11, i12);
        } else {
            i13 = 30;
        }
        i12 = Math.min(i12, i13);
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate of(int i10, int i11, int i12) {
        long j2 = i10;
        j$.time.temporal.a.YEAR.r(j2);
        j$.time.temporal.a.MONTH_OF_YEAR.r(i11);
        j$.time.temporal.a.DAY_OF_MONTH.r(i12);
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.e.f11895a.getClass();
                if (j$.time.chrono.e.h(j2)) {
                    i13 = 29;
                }
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.v(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f11912h;
        if (dateTimeFormatter != null) {
            return (LocalDate) dateTimeFormatter.f(charSequence, new f(0));
        }
        throw new NullPointerException("formatter");
    }

    public static LocalDate u(j$.time.temporal.l lVar) {
        if (lVar != null) {
            LocalDate localDate = (LocalDate) lVar.r(j$.time.temporal.n.e());
            if (localDate != null) {
                return localDate;
            }
            throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    private int v(j$.time.temporal.o oVar) {
        int i10;
        int i11 = g.f11995a[((j$.time.temporal.a) oVar).ordinal()];
        int i12 = this.f11875a;
        short s10 = this.c;
        switch (i11) {
            case 1:
                return s10;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return getDayOfYear();
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                i10 = (s10 - 1) / 7;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return i12 >= 1 ? i12 : 1 - i12;
            case 5:
                return w().t();
            case 6:
                i10 = (s10 - 1) % 7;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case ma.i.f16046m /* 9 */:
                return ((getDayOfYear() - 1) / 7) + 1;
            case ma.i.f16047o /* 10 */:
                return this.f11876b;
            case 11:
                throw new s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i12;
            case 13:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new s("Unsupported field: " + oVar);
        }
        return i10 + 1;
    }

    public static LocalDate y(long j2) {
        long j10;
        long j11 = (j2 + 719528) - 60;
        if (j11 < 0) {
            long j12 = ((j11 + 1) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i10 = (int) j14;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.o(j13 + j10 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate z(int i10, int i11) {
        long j2 = i10;
        j$.time.temporal.a.YEAR.r(j2);
        j$.time.temporal.a.DAY_OF_YEAR.r(i11);
        j$.time.chrono.e.f11895a.getClass();
        boolean h10 = j$.time.chrono.e.h(j2);
        if (i11 == 366 && !h10) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        Month v3 = Month.v(((i11 - 1) / 31) + 1);
        if (i11 > (v3.u(h10) + v3.t(h10)) - 1) {
            v3 = v3.w();
        }
        return new LocalDate(i10, v3.ordinal() + 1, (i11 - v3.t(h10)) + 1);
    }

    @Override // j$.time.temporal.k
    /* renamed from: A */
    public final LocalDate j(long j2, r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            switch (g.f11996b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return B(j2);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    return D(j2);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    return C(j2);
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    return E(j2);
                case 5:
                    return E(a.f(j2, 10L));
                case 6:
                    return E(a.f(j2, 100L));
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return E(a.f(j2, 1000L));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return e(a.d(o(aVar), j2), aVar);
                default:
                    throw new s("Unsupported unit: " + rVar);
            }
        }
        return (LocalDate) rVar.e(this, j2);
    }

    public final LocalDate B(long j2) {
        return j2 == 0 ? this : y(a.d(p(), j2));
    }

    public final LocalDate C(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j10 = (this.f11875a * 12) + (this.f11876b - 1) + j2;
        return F(j$.time.temporal.a.YEAR.o(a.g(j10, 12L)), ((int) a.e(j10, 12L)) + 1, this.c);
    }

    public final LocalDate D(long j2) {
        return B(a.f(j2, 7L));
    }

    public final LocalDate E(long j2) {
        return j2 == 0 ? this : F(j$.time.temporal.a.YEAR.o(this.f11875a + j2), this.f11876b, this.c);
    }

    @Override // j$.time.temporal.k
    /* renamed from: G */
    public final LocalDate e(long j2, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.r(j2);
            int i10 = g.f11995a[aVar.ordinal()];
            short s10 = this.f11876b;
            short s11 = this.c;
            int i11 = this.f11875a;
            switch (i10) {
                case 1:
                    int i12 = (int) j2;
                    return s11 == i12 ? this : of(i11, s10, i12);
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    return I((int) j2);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    return D(j2 - o(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    if (i11 < 1) {
                        j2 = 1 - j2;
                    }
                    return J((int) j2);
                case 5:
                    return B(j2 - w().t());
                case 6:
                    return B(j2 - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return B(j2 - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return y(j2);
                case ma.i.f16046m /* 9 */:
                    return D(j2 - o(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case ma.i.f16047o /* 10 */:
                    int i13 = (int) j2;
                    if (s10 == i13) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.r(i13);
                    return F(i11, i13, s11);
                case 11:
                    return C(j2 - (((i11 * 12) + s10) - 1));
                case 12:
                    return J((int) j2);
                case 13:
                    return o(j$.time.temporal.a.ERA) == j2 ? this : J(1 - i11);
                default:
                    throw new s("Unsupported field: " + oVar);
            }
        }
        return (LocalDate) oVar.k(this, j2);
    }

    @Override // j$.time.temporal.k
    /* renamed from: H */
    public final LocalDate h(j$.time.temporal.m mVar) {
        return mVar instanceof LocalDate ? (LocalDate) mVar : (LocalDate) mVar.k(this);
    }

    public final LocalDate I(int i10) {
        return getDayOfYear() == i10 ? this : z(this.f11875a, i10);
    }

    public final LocalDate J(int i10) {
        if (this.f11875a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.r(i10);
        return F(i10, this.f11876b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.d a() {
        return j$.time.chrono.e.f11895a;
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.a f10;
        if (zoneId != null) {
            LocalDateTime A = LocalDateTime.A(this, j.f12002g);
            if (!(zoneId instanceof ZoneOffset) && (f10 = zoneId.getRules().f(A)) != null && f10.o()) {
                A = f10.e();
            }
            return ZonedDateTime.v(A, zoneId, null);
        }
        throw new NullPointerException("zone");
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar.isDateBased() : oVar != null && oVar.e(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return t((LocalDate) chronoLocalDate);
        }
        int compare = Long.compare(p(), chronoLocalDate.p());
        if (compare == 0) {
            j$.time.chrono.d a10 = a();
            j$.time.chrono.d a11 = chronoLocalDate.a();
            ((j$.time.chrono.a) a10).getClass();
            a11.getClass();
            return 0;
        }
        return compare;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && t((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.l
    public final int f(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? v(oVar) : j$.time.temporal.n.a(this, oVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.a(this);
        }
        throw new NullPointerException("formatter");
    }

    public int getDayOfYear() {
        return (Month.v(this.f11876b).t(x()) + this.c) - 1;
    }

    public int getYear() {
        return this.f11875a;
    }

    public int hashCode() {
        int i10 = this.f11875a;
        return (((i10 << 11) + (this.f11876b << 6)) + this.c) ^ (i10 & (-2048));
    }

    @Override // j$.time.temporal.l
    public final t i(j$.time.temporal.o oVar) {
        int i10;
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (!aVar.isDateBased()) {
                throw new s("Unsupported field: " + oVar);
            }
            int i11 = g.f11995a[aVar.ordinal()];
            short s10 = this.f11876b;
            if (i11 == 1) {
                i10 = s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : x() ? 29 : 28;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    return t.i(1L, (Month.v(s10) != Month.FEBRUARY || x()) ? 5L : 4L);
                } else if (i11 != 4) {
                    return oVar.h();
                } else {
                    return t.i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                i10 = x() ? 366 : 365;
            }
            return t.i(1L, i10);
        }
        return oVar.f(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        return kVar.e(p(), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final LocalDate l(m mVar) {
        if (mVar instanceof m) {
            return C(mVar.d()).B(mVar.b());
        }
        if (mVar != null) {
            return (LocalDate) mVar.a(this);
        }
        throw new NullPointerException("amountToAdd");
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.EPOCH_DAY ? p() : oVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.f11875a * 12) + this.f11876b) - 1 : v(oVar) : oVar.j(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long p() {
        long j2;
        long j10 = this.f11875a;
        long j11 = this.f11876b;
        long j12 = (365 * j10) + 0;
        if (j10 >= 0) {
            j2 = ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12;
        } else {
            j2 = j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))));
        }
        long j13 = (((367 * j11) - 362) / 12) + j2 + (this.c - 1);
        if (j11 > 2) {
            j13--;
            if (!x()) {
                j13--;
            }
        }
        return j13 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final LocalDateTime q(j jVar) {
        return LocalDateTime.A(this, jVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(q qVar) {
        if (qVar == j$.time.temporal.n.e()) {
            return this;
        }
        if (qVar != j$.time.temporal.n.k() && qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.h() && qVar != j$.time.temporal.n.f()) {
            return qVar == j$.time.temporal.n.d() ? j$.time.chrono.e.f11895a : qVar == j$.time.temporal.n.i() ? j$.time.temporal.b.DAYS : qVar.d(this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int t(LocalDate localDate) {
        int i10 = this.f11875a - localDate.f11875a;
        if (i10 == 0) {
            int i11 = this.f11876b - localDate.f11876b;
            return i11 == 0 ? this.c - localDate.c : i11;
        }
        return i10;
    }

    public String toString() {
        int i10;
        int i11 = this.f11875a;
        int abs = Math.abs(i11);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb.append(i11 - 10000);
                i10 = 1;
            } else {
                sb.append(i11 + 10000);
                i10 = 0;
            }
            sb.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb.append('+');
            }
            sb.append(i11);
        }
        String str = "-0";
        short s10 = this.f11876b;
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        short s11 = this.c;
        if (s11 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append((int) s11);
        return sb.toString();
    }

    public final c w() {
        return c.u(((int) a.e(p() + 3, 7L)) + 1);
    }

    public final boolean x() {
        j$.time.chrono.e.f11895a.getClass();
        return j$.time.chrono.e.h(this.f11875a);
    }
}
