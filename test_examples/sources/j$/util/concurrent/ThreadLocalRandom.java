package j$.util.concurrent;

import j$.util.stream.AbstractC0421w0;
import j$.util.stream.C0382m0;
import j$.util.stream.F;
import j$.util.stream.IntStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f12133d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicLong f12134e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal f12135f;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal f12136g;

    /* renamed from: a  reason: collision with root package name */
    long f12137a;

    /* renamed from: b  reason: collision with root package name */
    int f12138b;
    boolean c = true;

    static {
        long h10;
        if (((Boolean) AccessController.doPrivileged(new x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            h10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                h10 = (h10 << 8) | (seed[i10] & 255);
            }
        } else {
            h10 = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f12134e = new AtomicLong(h10);
        f12135f = new ThreadLocal();
        f12136g = new y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f12136g.get()).f12138b = i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f12136g.get()).f12138b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f12136g.get();
        if (threadLocalRandom.f12138b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f12133d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f12134e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f12136g.get();
        threadLocalRandom.f12137a = h10;
        threadLocalRandom.f12138b = addAndGet;
    }

    private static int g(long j2) {
        long j10 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        return (int) (((j10 ^ (j10 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j2) {
        long j10 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d5, double d10) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d5 < d10) {
            double d11 = ((d10 - d5) * nextLong) + d5;
            return d11 >= d10 ? Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1) : d11;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i10, int i11) {
        int i12;
        int g10 = g(i());
        if (i10 < i11) {
            int i13 = i11 - i10;
            int i14 = i13 - 1;
            if ((i13 & i14) == 0) {
                i12 = g10 & i14;
            } else if (i13 > 0) {
                int i15 = g10 >>> 1;
                while (true) {
                    int i16 = i15 + i14;
                    i12 = i15 % i13;
                    if (i16 - i12 >= 0) {
                        break;
                    }
                    i15 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g10 >= i10 && g10 < i11) {
                        return g10;
                    }
                    g10 = g(i());
                }
            }
            return i12 + i10;
        }
        return g10;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return F.y(AbstractC0421w0.Y0(new z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d5, double d10) {
        if (d5 < d10) {
            return F.y(AbstractC0421w0.Y0(new z(0L, Long.MAX_VALUE, d5, d10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j2) {
        if (j2 >= 0) {
            return F.y(AbstractC0421w0.Y0(new z(0L, j2, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j2, double d5, double d10) {
        if (j2 >= 0) {
            if (d5 < d10) {
                return F.y(AbstractC0421w0.Y0(new z(0L, j2, d5, d10)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j2, long j10) {
        long j11;
        long h10 = h(i());
        if (j2 < j10) {
            long j12 = j10 - j2;
            long j13 = j12 - 1;
            if ((j12 & j13) == 0) {
                j11 = h10 & j13;
            } else if (j12 > 0) {
                while (true) {
                    long j14 = h10 >>> 1;
                    long j15 = j14 + j13;
                    j11 = j14 % j12;
                    if (j15 - j11 >= 0) {
                        break;
                    }
                    h10 = h(i());
                }
            } else {
                while (true) {
                    if (h10 >= j2 && h10 < j10) {
                        return h10;
                    }
                    h10 = h(i());
                }
            }
            return j11 + j2;
        }
        return h10;
    }

    final long i() {
        long j2 = this.f12137a - 7046029254386353131L;
        this.f12137a = j2;
        return j2;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC0421w0.i1(new A(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return IntStream.Wrapper.convert(AbstractC0421w0.i1(new A(0L, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j2) {
        if (j2 >= 0) {
            return IntStream.Wrapper.convert(AbstractC0421w0.i1(new A(0L, j2, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j2, int i10, int i11) {
        if (j2 >= 0) {
            if (i10 < i11) {
                return IntStream.Wrapper.convert(AbstractC0421w0.i1(new A(0L, j2, i10, i11)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0382m0.y(AbstractC0421w0.k1(new B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j2) {
        if (j2 >= 0) {
            return C0382m0.y(AbstractC0421w0.k1(new B(0L, j2, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j2, long j10) {
        if (j2 < j10) {
            return C0382m0.y(AbstractC0421w0.k1(new B(0L, Long.MAX_VALUE, j2, j10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j2, long j10, long j11) {
        if (j2 >= 0) {
            if (j10 < j11) {
                return C0382m0.y(AbstractC0421w0.k1(new B(0L, j2, j10, j11)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    protected final int next(int i10) {
        return (int) (h(i()) >>> (64 - i10));
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f12135f;
        Double d5 = (Double) threadLocal.get();
        if (d5 != null) {
            threadLocal.set(null);
            return d5.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d10 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d10 < 1.0d && d10 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d10) * (-2.0d)) / d10);
                threadLocal.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g10 = g(i());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return g10 & i11;
        }
        while (true) {
            int i12 = g10 >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            g10 = g(i());
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public final void setSeed(long j2) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }
}
