package j$.time.temporal;

/* loaded from: classes2.dex */
enum i implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f12023a;

    static {
        j$.time.d dVar = j$.time.d.c;
    }

    i(String str) {
        this.f12023a = str;
    }

    @Override // j$.time.temporal.r
    public final k e(k kVar, long j2) {
        int i10 = c.f12019a[ordinal()];
        if (i10 == 1) {
            o oVar = j.c;
            return kVar.e(j$.time.a.d(kVar.f(oVar), j2), oVar);
        } else if (i10 == 2) {
            return kVar.j(j2 / 256, b.YEARS).j((j2 % 256) * 3, b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // j$.time.temporal.r
    public final boolean isDateBased() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12023a;
    }
}
