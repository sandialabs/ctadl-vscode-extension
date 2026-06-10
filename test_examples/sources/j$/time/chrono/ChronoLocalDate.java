package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.j;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.o;

/* loaded from: classes2.dex */
public interface ChronoLocalDate extends k, m, Comparable<ChronoLocalDate> {
    d a();

    @Override // j$.time.temporal.l
    boolean c(o oVar);

    int compareTo(ChronoLocalDate chronoLocalDate);

    boolean equals(Object obj);

    LocalDate l(j$.time.m mVar);

    long p();

    LocalDateTime q(j jVar);
}
