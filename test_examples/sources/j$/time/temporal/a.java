package j$.time.temporal;

import j$.time.format.E;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum a implements o {
    NANO_OF_SECOND("NanoOfSecond", t.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", t.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", t.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", t.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", t.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", t.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", t.i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", t.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", t.i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", t.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", t.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", t.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", t.i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", t.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", t.i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", t.i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", t.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", t.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", t.k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", t.k(365, 366)),
    EPOCH_DAY("EpochDay", t.i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", t.k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", t.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", t.i(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", t.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", t.k(999999999, 1000000000)),
    YEAR("Year", t.i(-999999999, 999999999), 0),
    ERA("Era", t.i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", t.i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", t.i(-64800, 64800));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f12015a;

    /* renamed from: b  reason: collision with root package name */
    private final t f12016b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, t tVar) {
        this.f12015a = str;
        this.f12016b = tVar;
    }

    a(String str, t tVar, int i10) {
        this.f12015a = str;
        this.f12016b = tVar;
    }

    @Override // j$.time.temporal.o
    public final boolean e(l lVar) {
        return lVar.c(this);
    }

    @Override // j$.time.temporal.o
    public final t f(l lVar) {
        return lVar.i(this);
    }

    @Override // j$.time.temporal.o
    public final t h() {
        return this.f12016b;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ l i(HashMap hashMap, l lVar, E e10) {
        return null;
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // j$.time.temporal.o
    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.o
    public final long j(l lVar) {
        return lVar.o(this);
    }

    @Override // j$.time.temporal.o
    public final k k(k kVar, long j2) {
        return kVar.e(j2, this);
    }

    public final int o(long j2) {
        return this.f12016b.a(j2, this);
    }

    public final void r(long j2) {
        this.f12016b.b(j2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12015a;
    }
}
