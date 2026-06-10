package na;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.chrono.ChronoLocalDate;
import java.util.List;

@qa.d(with = pa.e.class)
/* loaded from: classes.dex */
public final class d implements Comparable<d> {
    public static final a Companion = new a();

    /* renamed from: i  reason: collision with root package name */
    public final LocalDate f16148i;

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<d> serializer() {
            return pa.e.f16793a;
        }
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        v7.g.e(localDate, "MIN");
        new d(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        v7.g.e(localDate2, "MAX");
        new d(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(int i10, Month month, int i11) {
        this(r2);
        v7.g.f(month, "month");
        List<Month> list = f.f16150a;
        try {
            LocalDate of = LocalDate.of(i10, month.ordinal() + 1, i11);
            v7.g.e(of, "try {\n                jt…xception(e)\n            }");
        } catch (DateTimeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public d(LocalDate localDate) {
        v7.g.f(localDate, "value");
        this.f16148i = localDate;
    }

    public final int a() {
        return this.f16148i.getDayOfYear();
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        v7.g.f(dVar2, "other");
        return this.f16148i.compareTo((ChronoLocalDate) dVar2.f16148i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (v7.g.a(this.f16148i, ((d) obj).f16148i)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16148i.hashCode();
    }

    public final String toString() {
        String localDate = this.f16148i.toString();
        v7.g.e(localDate, "value.toString()");
        return localDate;
    }
}
