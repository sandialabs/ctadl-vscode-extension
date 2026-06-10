package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.E;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class h implements o {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12020a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ h[] f12021b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.o
            public final boolean e(l lVar) {
                return lVar.c(a.DAY_OF_YEAR) && lVar.c(a.MONTH_OF_YEAR) && lVar.c(a.YEAR) && h.o(lVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.o
            public final t f(l lVar) {
                if (e(lVar)) {
                    long o10 = lVar.o(h.QUARTER_OF_YEAR);
                    if (o10 == 1) {
                        long o11 = lVar.o(a.YEAR);
                        j$.time.chrono.e.f11895a.getClass();
                        return j$.time.chrono.e.h(o11) ? t.i(1L, 91L) : t.i(1L, 90L);
                    } else if (o10 == 2) {
                        return t.i(1L, 91L);
                    } else {
                        if (o10 != 3 && o10 != 4) {
                            return h();
                        }
                        return t.i(1L, 92L);
                    }
                }
                throw new s("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.o
            public final t h() {
                return t.k(90L, 92L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.o
            public final l i(HashMap hashMap, l lVar, E e10) {
                LocalDate of;
                long j2;
                a aVar = a.YEAR;
                Long l2 = (Long) hashMap.get(aVar);
                o oVar = h.QUARTER_OF_YEAR;
                Long l4 = (Long) hashMap.get(oVar);
                if (l2 != null && l4 != null) {
                    int o10 = aVar.o(l2.longValue());
                    long longValue = ((Long) hashMap.get(h.DAY_OF_QUARTER)).longValue();
                    h.t(lVar);
                    if (e10 == E.LENIENT) {
                        of = LocalDate.of(o10, 1, 1).C(j$.time.a.f(j$.time.a.h(l4.longValue(), 1L), 3L));
                        j2 = j$.time.a.h(longValue, 1L);
                    } else {
                        of = LocalDate.of(o10, ((oVar.h().a(l4.longValue(), oVar) - 1) * 3) + 1, 1);
                        if (longValue < 1 || longValue > 90) {
                            (e10 == E.STRICT ? f(of) : h()).b(longValue, this);
                        }
                        j2 = longValue - 1;
                    }
                    hashMap.remove(this);
                    hashMap.remove(aVar);
                    hashMap.remove(oVar);
                    return of.B(j2);
                }
                return null;
            }

            @Override // j$.time.temporal.o
            public final long j(l lVar) {
                int[] iArr;
                if (e(lVar)) {
                    int f10 = lVar.f(a.DAY_OF_YEAR);
                    int f11 = lVar.f(a.MONTH_OF_YEAR);
                    long o10 = lVar.o(a.YEAR);
                    iArr = h.f12020a;
                    int i10 = (f11 - 1) / 3;
                    j$.time.chrono.e.f11895a.getClass();
                    return f10 - iArr[i10 + (j$.time.chrono.e.h(o10) ? 4 : 0)];
                }
                throw new s("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.o
            public final k k(k kVar, long j2) {
                long j10 = j(kVar);
                h().b(j2, this);
                a aVar = a.DAY_OF_YEAR;
                return kVar.e((j2 - j10) + kVar.o(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.o
            public final boolean e(l lVar) {
                return lVar.c(a.MONTH_OF_YEAR) && h.o(lVar);
            }

            @Override // j$.time.temporal.o
            public final t h() {
                return t.i(1L, 4L);
            }

            @Override // j$.time.temporal.o
            public final long j(l lVar) {
                if (e(lVar)) {
                    return (lVar.o(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new s("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.o
            public final k k(k kVar, long j2) {
                long j10 = j(kVar);
                h().b(j2, this);
                a aVar = a.MONTH_OF_YEAR;
                return kVar.e(((j2 - j10) * 3) + kVar.o(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.o
            public final boolean e(l lVar) {
                return lVar.c(a.EPOCH_DAY) && h.o(lVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.o
            public final t f(l lVar) {
                if (e(lVar)) {
                    return h.u(LocalDate.u(lVar));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final t h() {
                return t.k(52L, 53L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.o
            public final l i(HashMap hashMap, l lVar, E e10) {
                LocalDate e11;
                long j2;
                LocalDate D;
                long j10;
                o oVar = h.WEEK_BASED_YEAR;
                Long l2 = (Long) hashMap.get(oVar);
                a aVar = a.DAY_OF_WEEK;
                Long l4 = (Long) hashMap.get(aVar);
                if (l2 != null && l4 != null) {
                    int a10 = oVar.h().a(l2.longValue(), oVar);
                    long longValue = ((Long) hashMap.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    h.t(lVar);
                    LocalDate of = LocalDate.of(a10, 1, 4);
                    if (e10 == E.LENIENT) {
                        long longValue2 = l4.longValue();
                        if (longValue2 > 7) {
                            j10 = longValue2 - 1;
                            D = of.D(j10 / 7);
                        } else {
                            j2 = 1;
                            if (longValue2 < 1) {
                                D = of.D(j$.time.a.h(longValue2, 7L) / 7);
                                j10 = longValue2 + 6;
                            }
                            e11 = of.D(j$.time.a.h(longValue, j2)).e(longValue2, aVar);
                        }
                        of = D;
                        j2 = 1;
                        longValue2 = (j10 % 7) + 1;
                        e11 = of.D(j$.time.a.h(longValue, j2)).e(longValue2, aVar);
                    } else {
                        int o10 = aVar.o(l4.longValue());
                        if (longValue >= 1) {
                            if (longValue > 52) {
                            }
                            e11 = of.D(longValue - 1).e(o10, aVar);
                        }
                        (e10 == E.STRICT ? h.u(of) : h()).b(longValue, this);
                        e11 = of.D(longValue - 1).e(o10, aVar);
                    }
                    hashMap.remove(this);
                    hashMap.remove(oVar);
                    hashMap.remove(aVar);
                    return e11;
                }
                return null;
            }

            @Override // j$.time.temporal.o
            public final long j(l lVar) {
                if (e(lVar)) {
                    return h.v(LocalDate.u(lVar));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final k k(k kVar, long j2) {
                h().b(j2, this);
                return kVar.j(j$.time.a.h(j2, j(kVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.o
            public final boolean e(l lVar) {
                return lVar.c(a.EPOCH_DAY) && h.o(lVar);
            }

            @Override // j$.time.temporal.o
            public final t h() {
                return a.YEAR.h();
            }

            @Override // j$.time.temporal.o
            public final long j(l lVar) {
                int y10;
                if (e(lVar)) {
                    y10 = h.y(LocalDate.u(lVar));
                    return y10;
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final k k(k kVar, long j2) {
                int z10;
                if (e(kVar)) {
                    int a10 = h().a(j2, h.WEEK_BASED_YEAR);
                    LocalDate u10 = LocalDate.u(kVar);
                    a aVar = a.DAY_OF_WEEK;
                    int f10 = u10.f(aVar);
                    int v3 = h.v(u10);
                    if (v3 == 53) {
                        z10 = h.z(a10);
                        if (z10 == 52) {
                            v3 = 52;
                        }
                    }
                    LocalDate of = LocalDate.of(a10, 1, 4);
                    return kVar.h(of.B(((v3 - 1) * 7) + (f10 - of.f(aVar))));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f12021b = new h[]{hVar, hVar2, hVar3, hVar4};
        f12020a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean o(l lVar) {
        return ((j$.time.chrono.a) j$.time.chrono.b.b(lVar)).equals(j$.time.chrono.e.f11895a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(l lVar) {
        if (!((j$.time.chrono.a) j$.time.chrono.b.b(lVar)).equals(j$.time.chrono.e.f11895a)) {
            throw new DateTimeException("Resolve requires IsoChronology");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t u(LocalDate localDate) {
        return t.i(1L, z(y(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(LocalDate localDate) {
        boolean z10;
        int ordinal = localDate.w().ordinal();
        int i10 = 1;
        int dayOfYear = localDate.getDayOfYear() - 1;
        int i11 = (3 - ordinal) + dayOfYear;
        int i12 = (i11 - ((i11 / 7) * 7)) - 3;
        if (i12 < -3) {
            i12 += 7;
        }
        if (dayOfYear < i12) {
            return (int) t.i(1L, z(y(localDate.I(180).E(-1L)))).d();
        }
        int i13 = ((dayOfYear - i12) / 7) + 1;
        if (i13 == 53) {
            if (i12 != -3 && (i12 != -2 || !localDate.x())) {
                z10 = false;
                if (!z10) {
                    return i10;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        i10 = i13;
        return i10;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12021b.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(LocalDate localDate) {
        int year = localDate.getYear();
        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - localDate.w().ordinal() < -2 ? year - 1 : year;
        } else if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (localDate.x() ? 1 : 0)) - localDate.w().ordinal() >= 0 ? year + 1 : year;
        } else {
            return year;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(int i10) {
        LocalDate of = LocalDate.of(i10, 1, 1);
        if (of.w() != j$.time.c.THURSDAY) {
            return (of.w() == j$.time.c.WEDNESDAY && of.x()) ? 53 : 52;
        }
        return 53;
    }

    public t f(l lVar) {
        return h();
    }

    public /* synthetic */ l i(HashMap hashMap, l lVar, E e10) {
        return null;
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.o
    public final boolean isTimeBased() {
        return false;
    }
}
