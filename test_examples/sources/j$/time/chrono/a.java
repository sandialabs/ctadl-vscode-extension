package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class a implements d {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(HashMap hashMap, j$.time.temporal.a aVar, long j2) {
        Long l2 = (Long) hashMap.get(aVar);
        if (l2 != null && l2.longValue() != j2) {
            throw new DateTimeException("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + j2);
        }
        hashMap.put(aVar, Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDate f(LocalDate localDate, long j2, long j10, long j11) {
        long j12;
        LocalDate j13 = localDate.j(j2, j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        LocalDate j14 = j13.j(j10, bVar);
        if (j11 <= 7) {
            if (j11 < 1) {
                j14 = j14.j(j$.time.a.h(j11, 7L) / 7, bVar);
                j12 = j11 + 6;
            }
            return j14.h(new p(j$.time.c.u((int) j11).t()));
        }
        j12 = j11 - 1;
        j14 = j14.j(j12 / 7, bVar);
        j11 = (j12 % 7) + 1;
        return j14.h(new p(j$.time.c.u((int) j11).t()));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((d) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            ((a) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
