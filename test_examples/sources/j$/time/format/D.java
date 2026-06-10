package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D implements j$.time.temporal.l {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f11907b;
    j$.time.chrono.d c;

    /* renamed from: d  reason: collision with root package name */
    private E f11908d;

    /* renamed from: e  reason: collision with root package name */
    private ChronoLocalDate f11909e;

    /* renamed from: f  reason: collision with root package name */
    private j$.time.j f11910f;

    /* renamed from: a  reason: collision with root package name */
    final HashMap f11906a = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    j$.time.m f11911g = j$.time.m.f12009d;

    private void A(j$.time.temporal.a aVar, j$.time.temporal.a aVar2, Long l2) {
        Long l4 = (Long) this.f11906a.put(aVar2, l2);
        if (l4 != null && l4.longValue() != l2.longValue()) {
            throw new DateTimeException("Conflict found: " + aVar2 + " " + l4 + " differs from " + aVar2 + " " + l2 + " while resolving  " + aVar);
        }
    }

    private void k(j$.time.temporal.l lVar) {
        Iterator it = this.f11906a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.o oVar = (j$.time.temporal.o) entry.getKey();
            if (lVar.c(oVar)) {
                try {
                    long o10 = lVar.o(oVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (o10 != longValue) {
                        throw new DateTimeException("Conflict found: Field " + oVar + " " + o10 + " differs from " + oVar + " " + longValue + " derived from " + lVar);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void u() {
        HashMap hashMap = this.f11906a;
        if (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f11907b;
            if (zoneId != null) {
                v(zoneId);
                return;
            }
            Long l2 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                v(ZoneOffset.x(l2.intValue()));
            }
        }
    }

    private void v(ZoneId zoneId) {
        HashMap hashMap = this.f11906a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        Instant w10 = Instant.w(((Long) hashMap.remove(aVar)).longValue());
        ((j$.time.chrono.e) this.c).getClass();
        ZonedDateTime u10 = ZonedDateTime.u(w10, zoneId);
        z(u10.x());
        A(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(u10.b().H()));
    }

    private void w(long j2, long j10, long j11, long j12) {
        j$.time.j A;
        j$.time.m mVar;
        if (this.f11908d == E.LENIENT) {
            long d5 = j$.time.a.d(j$.time.a.d(j$.time.a.d(j$.time.a.f(j2, 3600000000000L), j$.time.a.f(j10, 60000000000L)), j$.time.a.f(j11, 1000000000L)), j12);
            A = j$.time.j.B(j$.time.a.e(d5, 86400000000000L));
            mVar = j$.time.m.c((int) j$.time.a.g(d5, 86400000000000L));
        } else {
            int o10 = j$.time.temporal.a.MINUTE_OF_HOUR.o(j10);
            int o11 = j$.time.temporal.a.NANO_OF_SECOND.o(j12);
            if (this.f11908d == E.SMART && j2 == 24 && o10 == 0 && j11 == 0 && o11 == 0) {
                A = j$.time.j.f12002g;
                mVar = j$.time.m.c(1);
            } else {
                A = j$.time.j.A(j$.time.temporal.a.HOUR_OF_DAY.o(j2), o10, j$.time.temporal.a.SECOND_OF_MINUTE.o(j11), o11);
                mVar = j$.time.m.f12009d;
            }
        }
        y(A, mVar);
    }

    private void x() {
        j$.time.temporal.a aVar;
        long j2;
        HashMap hashMap = this.f11906a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        long j10 = 0;
        if (hashMap.containsKey(aVar2)) {
            long longValue = ((Long) hashMap.remove(aVar2)).longValue();
            E e10 = this.f11908d;
            if (e10 == E.STRICT || (e10 == E.SMART && longValue != 0)) {
                aVar2.r(longValue);
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            A(aVar2, aVar3, Long.valueOf(longValue));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar4)) {
            long longValue2 = ((Long) hashMap.remove(aVar4)).longValue();
            E e11 = this.f11908d;
            if (e11 == E.STRICT || (e11 == E.SMART && longValue2 != 0)) {
                aVar4.r(longValue2);
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j10 = longValue2;
            }
            A(aVar4, aVar5, Long.valueOf(j10));
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar6)) {
            j$.time.temporal.a aVar7 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar7)) {
                long longValue3 = ((Long) hashMap.remove(aVar6)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar7)).longValue();
                if (this.f11908d == E.LENIENT) {
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j2 = j$.time.a.d(j$.time.a.f(longValue3, 12L), longValue4);
                } else {
                    aVar6.r(longValue3);
                    aVar7.r(longValue3);
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j2 = (longValue3 * 12) + longValue4;
                }
                A(aVar6, aVar, Long.valueOf(j2));
            }
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue5 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f11908d != E.LENIENT) {
                aVar8.r(longValue5);
            }
            A(aVar8, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            A(aVar8, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            A(aVar8, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            A(aVar8, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue6 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f11908d != E.LENIENT) {
                aVar9.r(longValue6);
            }
            A(aVar9, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            A(aVar9, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue7 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f11908d != E.LENIENT) {
                aVar10.r(longValue7);
            }
            A(aVar10, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            A(aVar10, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar11)) {
            long longValue8 = ((Long) hashMap.remove(aVar11)).longValue();
            if (this.f11908d != E.LENIENT) {
                aVar11.r(longValue8);
            }
            A(aVar11, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            A(aVar11, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            A(aVar11, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        j$.time.temporal.a aVar12 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar12)) {
            long longValue9 = ((Long) hashMap.remove(aVar12)).longValue();
            if (this.f11908d != E.LENIENT) {
                aVar12.r(longValue9);
            }
            A(aVar12, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            A(aVar12, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        j$.time.temporal.a aVar13 = j$.time.temporal.a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar13)) {
            long longValue10 = ((Long) hashMap.get(aVar13)).longValue();
            E e12 = this.f11908d;
            E e13 = E.LENIENT;
            if (e12 != e13) {
                aVar13.r(longValue10);
            }
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar14)) {
                long longValue11 = ((Long) hashMap.remove(aVar14)).longValue();
                if (this.f11908d != e13) {
                    aVar14.r(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                A(aVar14, aVar13, Long.valueOf(longValue10));
            }
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar15)) {
                long longValue12 = ((Long) hashMap.remove(aVar15)).longValue();
                if (this.f11908d != e13) {
                    aVar15.r(longValue12);
                }
                A(aVar15, aVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar16 = j$.time.temporal.a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar16)) {
            j$.time.temporal.a aVar17 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar17)) {
                j$.time.temporal.a aVar18 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar18) && hashMap.containsKey(aVar13)) {
                    w(((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar17)).longValue(), ((Long) hashMap.remove(aVar18)).longValue(), ((Long) hashMap.remove(aVar13)).longValue());
                }
            }
        }
    }

    private void y(j$.time.j jVar, j$.time.m mVar) {
        j$.time.j jVar2 = this.f11910f;
        if (jVar2 == null) {
            this.f11910f = jVar;
        } else if (!jVar2.equals(jVar)) {
            throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f11910f + " " + jVar);
        } else {
            j$.time.m mVar2 = this.f11911g;
            mVar2.getClass();
            j$.time.m mVar3 = j$.time.m.f12009d;
            boolean z10 = true;
            if (!(mVar2 == mVar3)) {
                if (mVar != mVar3) {
                    z10 = false;
                }
                if (!z10 && !this.f11911g.equals(mVar)) {
                    throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f11911g + " " + mVar);
                }
            }
        }
        this.f11911g = mVar;
    }

    private void z(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f11909e;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f11909e + " " + chronoLocalDate);
            }
        } else if (chronoLocalDate != null) {
            if (((j$.time.chrono.a) this.c).equals(chronoLocalDate.a())) {
                this.f11909e = chronoLocalDate;
                return;
            }
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);
        }
    }

    @Override // j$.time.temporal.l
    public final boolean c(j$.time.temporal.o oVar) {
        ChronoLocalDate chronoLocalDate;
        j$.time.j jVar;
        if (!this.f11906a.containsKey(oVar) && (((chronoLocalDate = this.f11909e) == null || !chronoLocalDate.c(oVar)) && (((jVar = this.f11910f) == null || !jVar.c(oVar)) && (oVar == null || (oVar instanceof j$.time.temporal.a) || !oVar.e(this))))) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int f(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ j$.time.temporal.t i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.c(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long o(j$.time.temporal.o oVar) {
        if (oVar != null) {
            Long l2 = (Long) this.f11906a.get(oVar);
            if (l2 != null) {
                return l2.longValue();
            }
            ChronoLocalDate chronoLocalDate = this.f11909e;
            if (chronoLocalDate == null || !chronoLocalDate.c(oVar)) {
                j$.time.j jVar = this.f11910f;
                if (jVar == null || !jVar.c(oVar)) {
                    if (oVar instanceof j$.time.temporal.a) {
                        throw new j$.time.temporal.s("Unsupported field: " + oVar);
                    }
                    return oVar.j(this);
                }
                return this.f11910f.o(oVar);
            }
            return this.f11909e.o(oVar);
        }
        throw new NullPointerException("field");
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.n.k()) {
            return this.f11907b;
        }
        if (qVar == j$.time.temporal.n.d()) {
            return this.c;
        }
        if (qVar == j$.time.temporal.n.e()) {
            ChronoLocalDate chronoLocalDate = this.f11909e;
            if (chronoLocalDate != null) {
                return LocalDate.u(chronoLocalDate);
            }
            return null;
        } else if (qVar == j$.time.temporal.n.f()) {
            return this.f11910f;
        } else {
            if (qVar != j$.time.temporal.n.j() && qVar != j$.time.temporal.n.h()) {
                if (qVar == j$.time.temporal.n.i()) {
                    return null;
                }
                return qVar.d(this);
            }
            return qVar.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(E e10, Set set) {
        ChronoLocalDate chronoLocalDate;
        j$.time.j jVar;
        ChronoLocalDate chronoLocalDate2;
        j$.time.j jVar2;
        ZonedDateTime atZone;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        j$.time.m mVar;
        j$.time.m mVar2;
        j$.time.temporal.a aVar3;
        Long valueOf;
        HashMap hashMap = this.f11906a;
        if (set != null) {
            hashMap.keySet().retainAll(set);
        }
        this.f11908d = e10;
        u();
        z(((j$.time.chrono.e) this.c).i(hashMap, this.f11908d));
        x();
        if (hashMap.size() > 0) {
            int i10 = 0;
            loop0: while (i10 < 50) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    j$.time.temporal.o oVar = (j$.time.temporal.o) entry.getKey();
                    j$.time.temporal.l i11 = oVar.i(hashMap, this, this.f11908d);
                    if (i11 != null) {
                        if (i11 instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) i11;
                            ZoneId zoneId = this.f11907b;
                            if (zoneId == null) {
                                this.f11907b = chronoZonedDateTime.n();
                            } else if (!zoneId.equals(chronoZonedDateTime.n())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f11907b);
                            }
                            i11 = chronoZonedDateTime.g();
                        }
                        if (i11 instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) i11;
                            y(chronoLocalDateTime.b(), j$.time.m.f12009d);
                            z(chronoLocalDateTime.m());
                        } else if (i11 instanceof ChronoLocalDate) {
                            z((ChronoLocalDate) i11);
                        } else if (!(i11 instanceof j$.time.j)) {
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        } else {
                            y((j$.time.j) i11, j$.time.m.f12009d);
                        }
                    } else if (!hashMap.containsKey(oVar)) {
                        break;
                    }
                    i10++;
                }
            }
            if (i10 == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i10 > 0) {
                u();
                z(((j$.time.chrono.e) this.c).i(hashMap, this.f11908d));
                x();
            }
        }
        long j2 = 0;
        if (this.f11910f == null) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar4)) {
                long longValue = ((Long) hashMap.remove(aVar4)).longValue();
                j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(aVar5)) {
                    long longValue2 = (((Long) hashMap.get(aVar5)).longValue() % 1000) + (longValue * 1000);
                    A(aVar4, aVar5, Long.valueOf(longValue2));
                    hashMap.remove(aVar5);
                    aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue2 * 1000);
                } else {
                    aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue * 1000000);
                }
                hashMap.put(aVar3, valueOf);
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(obj)) {
                    hashMap.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) hashMap.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l2 = (Long) hashMap.get(obj2);
            if (l2 != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l4 = (Long) hashMap.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l7 = (Long) hashMap.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l10 = (Long) hashMap.get(obj5);
                if ((l4 != null || (l7 == null && l10 == null)) && (l4 == null || l7 != null || l10 == null)) {
                    w(l2.longValue(), l4 != null ? l4.longValue() : 0L, l7 != null ? l7.longValue() : 0L, l10 != null ? l10.longValue() : 0L);
                    hashMap.remove(obj2);
                    hashMap.remove(obj3);
                    hashMap.remove(obj4);
                    hashMap.remove(obj5);
                }
                chronoLocalDate = this.f11909e;
                if (chronoLocalDate != null) {
                    k(chronoLocalDate);
                }
                jVar = this.f11910f;
                if (jVar != null) {
                    k(jVar);
                    if (this.f11909e != null && hashMap.size() > 0) {
                        k(this.f11909e.q(this.f11910f));
                    }
                }
                if (this.f11909e != null && this.f11910f != null) {
                    mVar = this.f11911g;
                    mVar.getClass();
                    mVar2 = j$.time.m.f12009d;
                    if (!(mVar != mVar2)) {
                        this.f11909e = this.f11909e.l(this.f11911g);
                        this.f11911g = mVar2;
                    }
                }
                if (this.f11910f == null && (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    if (hashMap.containsKey(aVar)) {
                        hashMap.put(aVar, 0L);
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                        aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
                    } else {
                        long longValue3 = ((Long) hashMap.get(aVar)).longValue();
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / 1000));
                        aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
                        j2 = longValue3 / 1000000;
                    }
                    hashMap.put(aVar2, Long.valueOf(j2));
                }
                chronoLocalDate2 = this.f11909e;
                if (chronoLocalDate2 != null || (jVar2 = this.f11910f) == null) {
                }
                if (this.f11907b != null) {
                    atZone = chronoLocalDate2.q(jVar2).atZone(this.f11907b);
                } else {
                    Long l11 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
                    if (l11 == null) {
                        return;
                    }
                    atZone = this.f11909e.q(this.f11910f).atZone(ZoneOffset.x(l11.intValue()));
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.INSTANT_SECONDS;
                hashMap.put(aVar6, Long.valueOf(atZone.o(aVar6)));
                return;
            }
        }
        if (this.f11908d != E.LENIENT && hashMap.size() > 0) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                j$.time.temporal.o oVar2 = (j$.time.temporal.o) entry2.getKey();
                if ((oVar2 instanceof j$.time.temporal.a) && oVar2.isTimeBased()) {
                    ((j$.time.temporal.a) oVar2).r(((Long) entry2.getValue()).longValue());
                }
            }
        }
        chronoLocalDate = this.f11909e;
        if (chronoLocalDate != null) {
        }
        jVar = this.f11910f;
        if (jVar != null) {
        }
        if (this.f11909e != null) {
            mVar = this.f11911g;
            mVar.getClass();
            mVar2 = j$.time.m.f12009d;
            if (!(mVar != mVar2)) {
            }
        }
        if (this.f11910f == null) {
            aVar = j$.time.temporal.a.NANO_OF_SECOND;
            if (hashMap.containsKey(aVar)) {
            }
            hashMap.put(aVar2, Long.valueOf(j2));
        }
        chronoLocalDate2 = this.f11909e;
        if (chronoLocalDate2 != null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f11906a);
        sb.append(',');
        sb.append(this.c);
        if (this.f11907b != null) {
            sb.append(',');
            sb.append(this.f11907b);
        }
        if (this.f11909e != null || this.f11910f != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f11909e;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f11910f != null) {
                    sb.append('T');
                }
            }
            sb.append(this.f11910f);
        }
        return sb.toString();
    }
}
