package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.format.E;
import j$.time.n;
import j$.time.temporal.l;
import j$.time.temporal.o;
import j$.time.temporal.p;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class e extends a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11895a = new e();

    private e() {
    }

    public static boolean h(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    public final LocalDate i(HashMap hashMap, E e10) {
        l lVar;
        int i10;
        j$.time.temporal.a aVar;
        long h10;
        long longValue;
        Object obj = j$.time.temporal.a.EPOCH_DAY;
        if (hashMap.containsKey(obj)) {
            lVar = LocalDate.y(((Long) hashMap.remove(obj)).longValue());
        } else {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.PROLEPTIC_MONTH;
            Long l2 = (Long) hashMap.remove(aVar2);
            if (l2 != null) {
                if (e10 != E.LENIENT) {
                    aVar2.r(l2.longValue());
                }
                a.e(hashMap, j$.time.temporal.a.MONTH_OF_YEAR, j$.time.a.e(l2.longValue(), 12L) + 1);
                a.e(hashMap, j$.time.temporal.a.YEAR, j$.time.a.g(l2.longValue(), 12L));
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR_OF_ERA;
            Long l4 = (Long) hashMap.remove(aVar3);
            if (l4 != null) {
                if (e10 != E.LENIENT) {
                    aVar3.r(l4.longValue());
                }
                Long l7 = (Long) hashMap.remove(j$.time.temporal.a.ERA);
                if (l7 == null) {
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
                    Long l10 = (Long) hashMap.get(aVar4);
                    if (e10 != E.STRICT) {
                        if (l10 != null && l10.longValue() <= 0) {
                            longValue = l4.longValue();
                            longValue = j$.time.a.h(1L, longValue);
                            a.e(hashMap, aVar4, longValue);
                        }
                        longValue = l4.longValue();
                        a.e(hashMap, aVar4, longValue);
                    } else if (l10 != null) {
                        int i11 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                        longValue = l4.longValue();
                        if (i11 > 0) {
                            a.e(hashMap, aVar4, longValue);
                        }
                        longValue = j$.time.a.h(1L, longValue);
                        a.e(hashMap, aVar4, longValue);
                    } else {
                        hashMap.put(aVar3, l4);
                    }
                } else {
                    if (l7.longValue() == 1) {
                        aVar = j$.time.temporal.a.YEAR;
                        h10 = l4.longValue();
                    } else if (l7.longValue() != 0) {
                        throw new DateTimeException("Invalid value for era: " + l7);
                    } else {
                        aVar = j$.time.temporal.a.YEAR;
                        h10 = j$.time.a.h(1L, l4.longValue());
                    }
                    a.e(hashMap, aVar, h10);
                }
            } else {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ERA;
                if (hashMap.containsKey(aVar5)) {
                    aVar5.r(((Long) hashMap.get(aVar5)).longValue());
                }
            }
            j$.time.temporal.a aVar6 = j$.time.temporal.a.YEAR;
            if (hashMap.containsKey(aVar6)) {
                j$.time.temporal.a aVar7 = j$.time.temporal.a.MONTH_OF_YEAR;
                boolean z10 = true;
                if (hashMap.containsKey(aVar7)) {
                    j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_MONTH;
                    if (hashMap.containsKey(aVar8)) {
                        int o10 = aVar6.o(((Long) hashMap.remove(aVar6)).longValue());
                        if (e10 == E.LENIENT) {
                            lVar = LocalDate.of(o10, 1, 1).C(j$.time.a.h(((Long) hashMap.remove(aVar7)).longValue(), 1L)).B(j$.time.a.h(((Long) hashMap.remove(aVar8)).longValue(), 1L));
                        } else {
                            int o11 = aVar7.o(((Long) hashMap.remove(aVar7)).longValue());
                            int o12 = aVar8.o(((Long) hashMap.remove(aVar8)).longValue());
                            if (e10 == E.SMART) {
                                if (o11 != 4 && o11 != 6 && o11 != 9 && o11 != 11) {
                                    if (o11 == 2) {
                                        Month month = Month.FEBRUARY;
                                        long j2 = o10;
                                        int i12 = n.f12012a;
                                        if ((3 & j2) != 0 || (j2 % 100 == 0 && j2 % 400 != 0)) {
                                            z10 = false;
                                        }
                                        i10 = month.u(z10);
                                        o12 = Math.min(o12, i10);
                                    }
                                }
                                i10 = 30;
                                o12 = Math.min(o12, i10);
                            }
                            lVar = LocalDate.of(o10, o11, o12);
                        }
                    } else {
                        o oVar = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                        if (hashMap.containsKey(oVar)) {
                            o oVar2 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                            if (hashMap.containsKey(oVar2)) {
                                int a10 = aVar6.h().a(((Long) hashMap.remove(aVar6)).longValue(), aVar6);
                                if (e10 == E.LENIENT) {
                                    long h11 = j$.time.a.h(((Long) hashMap.remove(aVar7)).longValue(), 1L);
                                    lVar = LocalDate.of(a10, 1, 1).j(h11, j$.time.temporal.b.MONTHS).j(j$.time.a.h(((Long) hashMap.remove(oVar)).longValue(), 1L), j$.time.temporal.b.WEEKS).j(j$.time.a.h(((Long) hashMap.remove(oVar2)).longValue(), 1L), j$.time.temporal.b.DAYS);
                                } else {
                                    int a11 = aVar7.h().a(((Long) hashMap.remove(aVar7)).longValue(), aVar7);
                                    int a12 = oVar.h().a(((Long) hashMap.remove(oVar)).longValue(), oVar);
                                    lVar = LocalDate.of(a10, a11, 1).j((oVar2.h().a(((Long) hashMap.remove(oVar2)).longValue(), oVar2) - 1) + ((a12 - 1) * 7), j$.time.temporal.b.DAYS);
                                    if (e10 == E.STRICT && lVar.f(aVar7) != a11) {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                    }
                                }
                            } else {
                                o oVar3 = j$.time.temporal.a.DAY_OF_WEEK;
                                if (hashMap.containsKey(oVar3)) {
                                    int a13 = aVar6.h().a(((Long) hashMap.remove(aVar6)).longValue(), aVar6);
                                    if (e10 == E.LENIENT) {
                                        lVar = a.f(LocalDate.of(a13, 1, 1), j$.time.a.h(((Long) hashMap.remove(aVar7)).longValue(), 1L), j$.time.a.h(((Long) hashMap.remove(oVar)).longValue(), 1L), j$.time.a.h(((Long) hashMap.remove(oVar3)).longValue(), 1L));
                                    } else {
                                        int a14 = aVar7.h().a(((Long) hashMap.remove(aVar7)).longValue(), aVar7);
                                        lVar = LocalDate.of(a13, a14, 1).j((oVar.h().a(((Long) hashMap.remove(oVar)).longValue(), oVar) - 1) * 7, j$.time.temporal.b.DAYS).h(new p(j$.time.c.u(oVar3.h().a(((Long) hashMap.remove(oVar3)).longValue(), oVar3)).t()));
                                        if (e10 == E.STRICT && lVar.f(aVar7) != a14) {
                                            throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                o oVar4 = j$.time.temporal.a.DAY_OF_YEAR;
                if (hashMap.containsKey(oVar4)) {
                    int a15 = aVar6.h().a(((Long) hashMap.remove(aVar6)).longValue(), aVar6);
                    if (e10 == E.LENIENT) {
                        lVar = LocalDate.z(a15, 1).j(j$.time.a.h(((Long) hashMap.remove(oVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    } else {
                        lVar = LocalDate.z(a15, oVar4.h().a(((Long) hashMap.remove(oVar4)).longValue(), oVar4));
                    }
                } else {
                    o oVar5 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
                    if (hashMap.containsKey(oVar5)) {
                        o oVar6 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                        if (hashMap.containsKey(oVar6)) {
                            int a16 = aVar6.h().a(((Long) hashMap.remove(aVar6)).longValue(), aVar6);
                            if (e10 == E.LENIENT) {
                                lVar = LocalDate.z(a16, 1).j(j$.time.a.h(((Long) hashMap.remove(oVar5)).longValue(), 1L), j$.time.temporal.b.WEEKS).j(j$.time.a.h(((Long) hashMap.remove(oVar6)).longValue(), 1L), j$.time.temporal.b.DAYS);
                            } else {
                                int a17 = oVar5.h().a(((Long) hashMap.remove(oVar5)).longValue(), oVar5);
                                lVar = LocalDate.z(a16, 1).j((oVar6.h().a(((Long) hashMap.remove(oVar6)).longValue(), oVar6) - 1) + ((a17 - 1) * 7), j$.time.temporal.b.DAYS);
                                if (e10 == E.STRICT && lVar.f(aVar6) != a16) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                                }
                            }
                        } else {
                            o oVar7 = j$.time.temporal.a.DAY_OF_WEEK;
                            if (hashMap.containsKey(oVar7)) {
                                int a18 = aVar6.h().a(((Long) hashMap.remove(aVar6)).longValue(), aVar6);
                                if (e10 == E.LENIENT) {
                                    lVar = a.f(LocalDate.z(a18, 1), 0L, j$.time.a.h(((Long) hashMap.remove(oVar5)).longValue(), 1L), j$.time.a.h(((Long) hashMap.remove(oVar7)).longValue(), 1L));
                                } else {
                                    lVar = LocalDate.z(a18, 1).j((oVar5.h().a(((Long) hashMap.remove(oVar5)).longValue(), oVar5) - 1) * 7, j$.time.temporal.b.DAYS).h(new p(j$.time.c.u(oVar7.h().a(((Long) hashMap.remove(oVar7)).longValue(), oVar7)).t()));
                                    if (e10 == E.STRICT && lVar.f(aVar6) != a18) {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            lVar = null;
        }
        return (LocalDate) lVar;
    }
}
