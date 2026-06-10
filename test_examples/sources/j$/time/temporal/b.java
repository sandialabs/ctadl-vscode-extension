package j$.time.temporal;

/* loaded from: classes2.dex */
public enum b implements r {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f12018a;

    static {
        j$.time.d.h(1L);
        j$.time.d.h(1000L);
        j$.time.d.h(1000000L);
        j$.time.d.i();
    }

    b(String str) {
        this.f12018a = str;
    }

    @Override // j$.time.temporal.r
    public final k e(k kVar, long j2) {
        return kVar.j(j2, this);
    }

    @Override // j$.time.temporal.r
    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12018a;
    }
}
