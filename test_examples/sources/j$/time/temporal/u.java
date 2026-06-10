package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.E;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u implements o {

    /* renamed from: f  reason: collision with root package name */
    private static final t f12037f = t.i(1, 7);

    /* renamed from: g  reason: collision with root package name */
    private static final t f12038g = t.j(0, 4, 6);

    /* renamed from: h  reason: collision with root package name */
    private static final t f12039h = t.j(0, 52, 54);

    /* renamed from: i  reason: collision with root package name */
    private static final t f12040i = t.k(52, 53);

    /* renamed from: a  reason: collision with root package name */
    private final String f12041a;

    /* renamed from: b  reason: collision with root package name */
    private final v f12042b;
    private final r c;

    /* renamed from: d  reason: collision with root package name */
    private final r f12043d;

    /* renamed from: e  reason: collision with root package name */
    private final t f12044e;

    private u(String str, v vVar, r rVar, r rVar2, t tVar) {
        this.f12041a = str;
        this.f12042b = vVar;
        this.c = rVar;
        this.f12043d = rVar2;
        this.f12044e = tVar;
    }

    private static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    private int b(l lVar) {
        return n.g(lVar.f(a.DAY_OF_WEEK) - this.f12042b.e().t()) + 1;
    }

    private int c(l lVar) {
        int b5 = b(lVar);
        int f10 = lVar.f(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int f11 = lVar.f(aVar);
        int t10 = t(f11, b5);
        int a10 = a(t10, f11);
        if (a10 == 0) {
            return f10 - 1;
        }
        return a10 >= a(t10, this.f12042b.f() + ((int) lVar.i(aVar).d())) ? f10 + 1 : f10;
    }

    private long d(l lVar) {
        int b5 = b(lVar);
        int f10 = lVar.f(a.DAY_OF_MONTH);
        return a(t(f10, b5), f10);
    }

    private int g(l lVar) {
        long j2;
        int b5 = b(lVar);
        a aVar = a.DAY_OF_YEAR;
        int f10 = lVar.f(aVar);
        int t10 = t(f10, b5);
        int a10 = a(t10, f10);
        if (a10 != 0) {
            if (a10 > 50) {
                int a11 = a(t10, this.f12042b.f() + ((int) lVar.i(aVar).d()));
                return a10 >= a11 ? (a10 - a11) + 1 : a10;
            }
            return a10;
        }
        ((j$.time.chrono.e) j$.time.chrono.b.b(lVar)).getClass();
        LocalDate u10 = LocalDate.u(lVar);
        long j10 = f10;
        b bVar = b.DAYS;
        if (j10 == Long.MIN_VALUE) {
            u10 = u10.j(Long.MAX_VALUE, bVar);
            j2 = 1;
        } else {
            j2 = -j10;
        }
        return g(u10.j(j2, bVar));
    }

    private long l(l lVar) {
        int b5 = b(lVar);
        int f10 = lVar.f(a.DAY_OF_YEAR);
        return a(t(f10, b5), f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u m(v vVar) {
        return new u("DayOfWeek", vVar, b.DAYS, b.WEEKS, f12037f);
    }

    private LocalDate n(j$.time.chrono.d dVar, int i10, int i11, int i12) {
        ((j$.time.chrono.e) dVar).getClass();
        LocalDate of = LocalDate.of(i10, 1, 1);
        int t10 = t(1, b(of));
        return of.j(((Math.min(i11, a(t10, this.f12042b.f() + (of.x() ? 366 : 365)) - 1) - 1) * 7) + (i12 - 1) + (-t10), b.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u o(v vVar) {
        return new u("WeekBasedYear", vVar, j.f12026d, b.FOREVER, a.YEAR.h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u p(v vVar) {
        return new u("WeekOfMonth", vVar, b.WEEKS, b.MONTHS, f12038g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u q(v vVar) {
        return new u("WeekOfWeekBasedYear", vVar, b.WEEKS, j.f12026d, f12040i);
    }

    private t r(l lVar, a aVar) {
        int t10 = t(lVar.f(aVar), b(lVar));
        t i10 = lVar.i(aVar);
        return t.i(a(t10, (int) i10.e()), a(t10, (int) i10.d()));
    }

    private t s(l lVar) {
        int d5;
        int a10;
        a aVar = a.DAY_OF_YEAR;
        if (lVar.c(aVar)) {
            int b5 = b(lVar);
            int f10 = lVar.f(aVar);
            int t10 = t(f10, b5);
            int a11 = a(t10, f10);
            if (a11 == 0) {
                ((j$.time.chrono.e) j$.time.chrono.b.b(lVar)).getClass();
                LocalDate u10 = LocalDate.u(lVar);
                long j2 = f10 + 7;
                b bVar = b.DAYS;
                return s(j2 == Long.MIN_VALUE ? u10.j(Long.MAX_VALUE, bVar).j(1L, bVar) : u10.j(-j2, bVar));
            }
            if (a11 >= a(t10, this.f12042b.f() + ((int) lVar.i(aVar).d()))) {
                ((j$.time.chrono.e) j$.time.chrono.b.b(lVar)).getClass();
                return s(LocalDate.u(lVar).j((d5 - f10) + 1 + 7, b.DAYS));
            }
            return t.i(1L, a10 - 1);
        }
        return f12039h;
    }

    private int t(int i10, int i11) {
        int g10 = n.g(i10 - i11);
        return g10 + 1 > this.f12042b.f() ? 7 - g10 : -g10;
    }

    @Override // j$.time.temporal.o
    public final boolean e(l lVar) {
        a aVar;
        if (lVar.c(a.DAY_OF_WEEK)) {
            b bVar = b.WEEKS;
            r rVar = this.f12043d;
            if (rVar == bVar) {
                return true;
            }
            if (rVar == b.MONTHS) {
                aVar = a.DAY_OF_MONTH;
            } else {
                if (rVar != b.YEARS && rVar != v.f12046h) {
                    if (rVar != b.FOREVER) {
                        return false;
                    }
                    aVar = a.YEAR;
                }
                aVar = a.DAY_OF_YEAR;
            }
            return lVar.c(aVar);
        }
        return false;
    }

    @Override // j$.time.temporal.o
    public final t f(l lVar) {
        b bVar = b.WEEKS;
        r rVar = this.f12043d;
        if (rVar == bVar) {
            return this.f12044e;
        }
        if (rVar == b.MONTHS) {
            return r(lVar, a.DAY_OF_MONTH);
        }
        if (rVar == b.YEARS) {
            return r(lVar, a.DAY_OF_YEAR);
        }
        if (rVar == v.f12046h) {
            return s(lVar);
        }
        if (rVar == b.FOREVER) {
            return a.YEAR.h();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
    }

    @Override // j$.time.temporal.o
    public final t h() {
        return this.f12044e;
    }

    @Override // j$.time.temporal.o
    public final l i(HashMap hashMap, l lVar, E e10) {
        Object obj;
        Object obj2;
        o oVar;
        Object obj3;
        o oVar2;
        o oVar3;
        Object obj4;
        o oVar4;
        LocalDate localDate;
        Object obj5;
        Object obj6;
        Object obj7;
        LocalDate localDate2;
        LocalDate of;
        LocalDate localDate3;
        long longValue = ((Long) hashMap.get(this)).longValue();
        long j2 = (int) longValue;
        if (longValue == j2) {
            r rVar = b.WEEKS;
            t tVar = this.f12044e;
            v vVar = this.f12042b;
            r rVar2 = this.f12043d;
            if (rVar2 == rVar) {
                hashMap.remove(this);
                hashMap.put(a.DAY_OF_WEEK, Long.valueOf(n.g((tVar.a(longValue, this) - 1) + (vVar.e().t() - 1)) + 1));
            } else {
                a aVar = a.DAY_OF_WEEK;
                if (hashMap.containsKey(aVar)) {
                    int g10 = n.g(aVar.o(((Long) hashMap.get(aVar)).longValue()) - vVar.e().t()) + 1;
                    j$.time.chrono.d b5 = j$.time.chrono.b.b(lVar);
                    a aVar2 = a.YEAR;
                    if (hashMap.containsKey(aVar2)) {
                        int o10 = aVar2.o(((Long) hashMap.get(aVar2)).longValue());
                        r rVar3 = b.MONTHS;
                        if (rVar2 == rVar3) {
                            a aVar3 = a.MONTH_OF_YEAR;
                            if (hashMap.containsKey(aVar3)) {
                                long longValue2 = ((Long) hashMap.get(aVar3)).longValue();
                                if (e10 == E.LENIENT) {
                                    ((j$.time.chrono.e) b5).getClass();
                                    LocalDate j10 = LocalDate.of(o10, 1, 1).j(j$.time.a.h(longValue2, 1L), rVar3);
                                    localDate3 = j10.j(j$.time.a.d(j$.time.a.f(j$.time.a.h(j2, d(j10)), 7L), g10 - b(j10)), b.DAYS);
                                } else {
                                    int o11 = aVar3.o(longValue2);
                                    ((j$.time.chrono.e) b5).getClass();
                                    LocalDate j11 = LocalDate.of(o10, o11, 1).j((((int) (tVar.a(j2, this) - d(of))) * 7) + (g10 - b(of)), b.DAYS);
                                    if (e10 == E.STRICT && j11.o(aVar3) != longValue2) {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                    }
                                    localDate3 = j11;
                                }
                                hashMap.remove(this);
                                hashMap.remove(aVar2);
                                hashMap.remove(aVar3);
                                hashMap.remove(aVar);
                                return localDate3;
                            }
                        }
                        if (rVar2 == b.YEARS) {
                            ((j$.time.chrono.e) b5).getClass();
                            LocalDate of2 = LocalDate.of(o10, 1, 1);
                            if (e10 == E.LENIENT) {
                                localDate2 = of2.j(j$.time.a.d(j$.time.a.f(j$.time.a.h(j2, l(of2)), 7L), g10 - b(of2)), b.DAYS);
                            } else {
                                LocalDate j12 = of2.j((((int) (tVar.a(j2, this) - l(of2))) * 7) + (g10 - b(of2)), b.DAYS);
                                if (e10 == E.STRICT && j12.o(aVar2) != o10) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                                }
                                localDate2 = j12;
                            }
                            hashMap.remove(this);
                            hashMap.remove(aVar2);
                            hashMap.remove(aVar);
                            return localDate2;
                        }
                    } else if (rVar2 == v.f12046h || rVar2 == b.FOREVER) {
                        obj = vVar.f12051f;
                        if (hashMap.containsKey(obj)) {
                            obj2 = vVar.f12050e;
                            if (hashMap.containsKey(obj2)) {
                                oVar = vVar.f12051f;
                                t tVar2 = ((u) oVar).f12044e;
                                obj3 = vVar.f12051f;
                                long longValue3 = ((Long) hashMap.get(obj3)).longValue();
                                oVar2 = vVar.f12051f;
                                int a10 = tVar2.a(longValue3, oVar2);
                                if (e10 == E.LENIENT) {
                                    LocalDate n = n(b5, a10, 1, g10);
                                    obj7 = vVar.f12050e;
                                    localDate = n.j(j$.time.a.h(((Long) hashMap.get(obj7)).longValue(), 1L), rVar);
                                } else {
                                    oVar3 = vVar.f12050e;
                                    t tVar3 = ((u) oVar3).f12044e;
                                    obj4 = vVar.f12050e;
                                    long longValue4 = ((Long) hashMap.get(obj4)).longValue();
                                    oVar4 = vVar.f12050e;
                                    LocalDate n10 = n(b5, a10, tVar3.a(longValue4, oVar4), g10);
                                    if (e10 == E.STRICT && c(n10) != a10) {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                                    }
                                    localDate = n10;
                                }
                                hashMap.remove(this);
                                obj5 = vVar.f12051f;
                                hashMap.remove(obj5);
                                obj6 = vVar.f12050e;
                                hashMap.remove(obj6);
                                hashMap.remove(aVar);
                                return localDate;
                            }
                        }
                    }
                }
            }
            return null;
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.o
    public final boolean isTimeBased() {
        return false;
    }

    @Override // j$.time.temporal.o
    public final long j(l lVar) {
        int c;
        b bVar = b.WEEKS;
        r rVar = this.f12043d;
        if (rVar == bVar) {
            c = b(lVar);
        } else if (rVar == b.MONTHS) {
            return d(lVar);
        } else {
            if (rVar == b.YEARS) {
                return l(lVar);
            }
            if (rVar == v.f12046h) {
                c = g(lVar);
            } else if (rVar != b.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
            } else {
                c = c(lVar);
            }
        }
        return c;
    }

    @Override // j$.time.temporal.o
    public final k k(k kVar, long j2) {
        o oVar;
        o oVar2;
        int a10 = this.f12044e.a(j2, this);
        int f10 = kVar.f(this);
        if (a10 == f10) {
            return kVar;
        }
        if (this.f12043d == b.FOREVER) {
            v vVar = this.f12042b;
            oVar = vVar.c;
            int f11 = kVar.f(oVar);
            oVar2 = vVar.f12050e;
            return n(j$.time.chrono.b.b(kVar), (int) j2, kVar.f(oVar2), f11);
        }
        return kVar.j(a10 - f10, this.c);
    }

    public final String toString() {
        return this.f12041a + "[" + this.f12042b.toString() + "]";
    }
}
