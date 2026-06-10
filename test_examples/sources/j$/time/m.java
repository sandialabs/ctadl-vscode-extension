package j$.time;

import j$.time.chrono.ChronoLocalDate;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class m implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final m f12009d = new m(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f12010a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f12011b = 0;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS));
    }

    private m(int i10) {
        this.c = i10;
    }

    public static m c(int i10) {
        return (i10 | 0) == 0 ? f12009d : new m(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.k a(ChronoLocalDate chronoLocalDate) {
        long d5;
        j$.time.temporal.b bVar;
        j$.time.temporal.k kVar;
        if (chronoLocalDate == null) {
            throw new NullPointerException("temporal");
        }
        j$.time.chrono.d dVar = (j$.time.chrono.d) chronoLocalDate.r(j$.time.temporal.n.d());
        if (dVar != null && !j$.time.chrono.e.f11895a.equals(dVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: ISO");
        }
        if (this.f12011b == 0) {
            int i10 = this.f12010a;
            kVar = chronoLocalDate;
            if (i10 != 0) {
                d5 = i10;
                bVar = j$.time.temporal.b.YEARS;
                kVar = chronoLocalDate.j(d5, bVar);
            }
            int i11 = this.c;
            return i11 == 0 ? kVar.j(i11, j$.time.temporal.b.DAYS) : kVar;
        }
        d5 = d();
        kVar = chronoLocalDate;
        if (d5 != 0) {
            bVar = j$.time.temporal.b.MONTHS;
            kVar = chronoLocalDate.j(d5, bVar);
        }
        int i112 = this.c;
        if (i112 == 0) {
        }
    }

    public final int b() {
        return this.c;
    }

    public final long d() {
        return (this.f12010a * 12) + this.f12011b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f12010a == mVar.f12010a && this.f12011b == mVar.f12011b && this.c == mVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.f12011b, 8) + this.f12010a;
    }

    public final String toString() {
        if (this == f12009d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i10 = this.f12010a;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.f12011b;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.c;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }
}
