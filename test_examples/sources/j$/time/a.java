package j$.time;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0293n;
import j$.util.function.Predicate;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static void a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static /* synthetic */ boolean b(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    public static /* synthetic */ void c(InterfaceC0293n interfaceC0293n, InterfaceC0293n interfaceC0293n2, double d5) {
        interfaceC0293n.accept(d5);
        interfaceC0293n2.accept(d5);
    }

    public static /* synthetic */ long d(long j2, long j10) {
        long j11 = j2 + j10;
        boolean z10 = true;
        boolean z11 = (j10 ^ j2) < 0;
        if ((j2 ^ j11) < 0) {
            z10 = false;
        }
        if (z11 || z10) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long e(long j2, long j10) {
        long j11 = j2 % j10;
        if (j11 == 0) {
            return 0L;
        }
        return (((j2 ^ j10) >> 63) | 1) > 0 ? j11 : j11 + j10;
    }

    public static /* synthetic */ long f(long j2, long j10) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (numberOfLeadingZeros > 65) {
            return j2 * j10;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z10 = true;
            int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            boolean z11 = i10 >= 0;
            if (j10 == Long.MIN_VALUE) {
                z10 = false;
            }
            if (z11 | z10) {
                long j11 = j2 * j10;
                if (i10 == 0 || j11 / j2 == j10) {
                    return j11;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long g(long j2, long j10) {
        long j11 = j2 / j10;
        return (j2 - (j10 * j11) != 0 && (((j2 ^ j10) >> 63) | 1) < 0) ? j11 - 1 : j11;
    }

    public static /* synthetic */ long h(long j2, long j10) {
        long j11 = j2 - j10;
        boolean z10 = true;
        boolean z11 = (j10 ^ j2) >= 0;
        if ((j2 ^ j11) < 0) {
            z10 = false;
        }
        if (z11 || z10) {
            return j11;
        }
        throw new ArithmeticException();
    }
}
