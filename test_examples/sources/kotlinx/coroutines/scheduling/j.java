package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.s;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f15532a = a1.c.D1("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f15533b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f15534d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f15535e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f15536f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f15537g;

    static {
        int i10 = s.f15496a;
        if (i10 < 2) {
            i10 = 2;
        }
        f15533b = a1.c.E1("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
        c = a1.c.E1("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f15534d = TimeUnit.SECONDS.toNanos(a1.c.D1("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f15535e = d.f15526i;
        f15536f = new h(0);
        f15537g = new h(1);
    }
}
