package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.j;
import j$.time.temporal.k;
import j$.time.temporal.m;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends k, m, Comparable<ChronoLocalDateTime<?>> {
    d a();

    j b();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    LocalDate m();
}
