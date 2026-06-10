package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.j;
import j$.time.temporal.k;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends k, Comparable<ChronoZonedDateTime<?>> {
    d a();

    j b();

    ZoneOffset d();

    LocalDateTime g();

    ZoneId n();

    long s();

    Instant toInstant();
}
