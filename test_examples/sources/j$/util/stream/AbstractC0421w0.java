package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0304t;
import j$.util.function.Predicate;

/* renamed from: j$.util.stream.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0421w0 implements E3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Y0 f12564a = new Y0();

    /* renamed from: b  reason: collision with root package name */
    private static final C0 f12565b = new W0();
    private static final D0 c = new X0();

    /* renamed from: d  reason: collision with root package name */
    private static final B0 f12566d = new V0();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f12567e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f12568f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f12569g = new double[0];

    public /* synthetic */ AbstractC0421w0() {
    }

    public /* synthetic */ AbstractC0421w0(W2 w22) {
    }

    public static void A0(C0 c0, Integer[] numArr, int i10) {
        if (H3.f12326a) {
            H3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c0.b();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static void B0(D0 d02, Long[] lArr, int i10) {
        if (H3.f12326a) {
            H3.a(d02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d02.b();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static void C0(B0 b02, Consumer consumer) {
        if (consumer instanceof InterfaceC0293n) {
            b02.d((InterfaceC0293n) consumer);
        } else if (H3.f12326a) {
            H3.a(b02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.E) b02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void D0(C0 c0, Consumer consumer) {
        if (consumer instanceof j$.util.function.K) {
            c0.d((j$.util.function.K) consumer);
        } else if (H3.f12326a) {
            H3.a(c0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.H) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void E0(D0 d02, Consumer consumer) {
        if (consumer instanceof InterfaceC0278f0) {
            d02.d((InterfaceC0278f0) consumer);
        } else if (H3.f12326a) {
            H3.a(d02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.K) d02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static B0 F0(B0 b02, long j2, long j10) {
        if (j2 == 0 && j10 == b02.count()) {
            return b02;
        }
        long j11 = j10 - j2;
        j$.util.E e10 = (j$.util.E) b02.spliterator();
        InterfaceC0425x0 X0 = X0(j11);
        X0.g(j11);
        for (int i10 = 0; i10 < j2 && e10.p(new l3(1)); i10++) {
        }
        for (int i11 = 0; i11 < j11 && e10.p(X0); i11++) {
        }
        X0.end();
        return X0.build();
    }

    public static C0 G0(C0 c0, long j2, long j10) {
        if (j2 == 0 && j10 == c0.count()) {
            return c0;
        }
        long j11 = j10 - j2;
        j$.util.H h10 = (j$.util.H) c0.spliterator();
        InterfaceC0429y0 h12 = h1(j11);
        h12.g(j11);
        for (int i10 = 0; i10 < j2 && h10.k(new n3(1)); i10++) {
        }
        for (int i11 = 0; i11 < j11 && h10.k(h12); i11++) {
        }
        h12.end();
        return h12.build();
    }

    public static D0 H0(D0 d02, long j2, long j10) {
        if (j2 == 0 && j10 == d02.count()) {
            return d02;
        }
        long j11 = j10 - j2;
        j$.util.K k3 = (j$.util.K) d02.spliterator();
        InterfaceC0433z0 j12 = j1(j11);
        j12.g(j11);
        for (int i10 = 0; i10 < j2 && k3.f(new p3(1)); i10++) {
        }
        for (int i11 = 0; i11 < j11 && k3.f(j12); i11++) {
        }
        j12.end();
        return j12.build();
    }

    public static F0 I0(F0 f02, long j2, long j10, IntFunction intFunction) {
        if (j2 == 0 && j10 == f02.count()) {
            return f02;
        }
        Spliterator spliterator = f02.spliterator();
        long j11 = j10 - j2;
        A0 P0 = P0(j11, intFunction);
        P0.g(j11);
        for (int i10 = 0; i10 < j2 && spliterator.a(new C0351f0(5)); i10++) {
        }
        for (int i11 = 0; i11 < j11 && spliterator.a(P0); i11++) {
        }
        P0.end();
        return P0.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long J0(long j2, long j10) {
        long j11 = j10 >= 0 ? j2 + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator K0(W2 w22, Spliterator spliterator, long j2, long j10) {
        long j11 = j10 >= 0 ? j2 + j10 : Long.MAX_VALUE;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        int i10 = AbstractC0400q2.f12522a[w22.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return new m3((j$.util.E) spliterator, j2, j12);
                    }
                    throw new IllegalStateException("Unknown shape " + w22);
                }
                return new q3((j$.util.K) spliterator, j2, j12);
            }
            return new o3((j$.util.H) spliterator, j2, j12);
        }
        return new s3(spliterator, j2, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long L0(long j2, long j10, long j11) {
        if (j2 >= 0) {
            return Math.max(-1L, Math.min(j2 - j10, j11));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A0 P0(long j2, IntFunction intFunction) {
        return (j2 < 0 || j2 >= 2147483639) ? new C0406s1() : new C0327a1(j2, intFunction);
    }

    public static F0 Q0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long a12 = abstractC0421w0.a1(spliterator);
        if (a12 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new L0(spliterator, intFunction, abstractC0421w0).invoke();
            return z10 ? c1(f02, intFunction) : f02;
        } else if (a12 < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) a12);
            new C0399q1(spliterator, abstractC0421w0, objArr).invoke();
            return new I0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static B0 R0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        long a12 = abstractC0421w0.a1(spliterator);
        if (a12 < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b02 = (B0) new L0(0, spliterator, abstractC0421w0).invoke();
            return z10 ? d1(b02) : b02;
        } else if (a12 < 2147483639) {
            double[] dArr = new double[(int) a12];
            new C0387n1(spliterator, abstractC0421w0, dArr).invoke();
            return new S0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static C0 S0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        long a12 = abstractC0421w0.a1(spliterator);
        if (a12 < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c0 = (C0) new L0(1, spliterator, abstractC0421w0).invoke();
            return z10 ? e1(c0) : c0;
        } else if (a12 < 2147483639) {
            int[] iArr = new int[(int) a12];
            new C0391o1(spliterator, abstractC0421w0, iArr).invoke();
            return new C0332b1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static D0 T0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        long a12 = abstractC0421w0.a1(spliterator);
        if (a12 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d02 = (D0) new L0(2, spliterator, abstractC0421w0).invoke();
            return z10 ? f1(d02) : d02;
        } else if (a12 < 2147483639) {
            long[] jArr = new long[(int) a12];
            new C0395p1(spliterator, abstractC0421w0, jArr).invoke();
            return new C0375k1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static H0 U0(W2 w22, F0 f02, F0 f03) {
        int i10 = G0.f12313a[w22.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return new N0((B0) f02, (B0) f03);
                    }
                    throw new IllegalStateException("Unknown shape " + w22);
                }
                return new P0((D0) f02, (D0) f03);
            }
            return new O0((C0) f02, (C0) f03);
        }
        return new R0(f02, f03);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0425x0 X0(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new U0() : new T0(j2);
    }

    public static G Y0(j$.util.E e10) {
        return new A(e10, V2.h(e10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z0 Z0(W2 w22) {
        Object obj;
        int i10 = G0.f12313a[w22.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                obj = f12565b;
            } else if (i10 == 3) {
                obj = c;
            } else if (i10 != 4) {
                throw new IllegalStateException("Unknown shape " + w22);
            } else {
                obj = f12566d;
            }
            return (Z0) obj;
        }
        return f12564a;
    }

    private static int b1(long j2) {
        return (j2 != -1 ? V2.f12412u : 0) | V2.f12411t;
    }

    public static F0 c1(F0 f02, IntFunction intFunction) {
        if (f02.k() > 0) {
            long count = f02.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) count);
                new C0414u1(f02, objArr).invoke();
                return new I0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return f02;
    }

    public static B0 d1(B0 b02) {
        if (b02.k() > 0) {
            long count = b02.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C0410t1(b02, dArr).invoke();
                return new S0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return b02;
    }

    public static C0 e1(C0 c0) {
        if (c0.k() > 0) {
            long count = c0.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C0410t1(c0, iArr).invoke();
                return new C0332b1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return c0;
    }

    public static D0 f1(D0 d02) {
        if (d02.k() > 0) {
            long count = d02.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C0410t1(d02, jArr).invoke();
                return new C0375k1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return d02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0429y0 h1(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new C0342d1() : new C0337c1(j2);
    }

    public static IntStream i1(j$.util.H h10) {
        return new C0326a0(h10, V2.h(h10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0433z0 j1(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new C0383m1() : new C0379l1(j2);
    }

    public static InterfaceC0386n0 k1(j$.util.K k3) {
        return new C0361h0(k3, V2.h(k3));
    }

    public static G l1(AbstractC0335c abstractC0335c, long j2, long j10) {
        if (j2 >= 0) {
            return new C0396p2(abstractC0335c, b1(j10), j2, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static C0413u0 m1(InterfaceC0304t interfaceC0304t, EnumC0409t0 enumC0409t0) {
        interfaceC0304t.getClass();
        enumC0409t0.getClass();
        return new C0413u0(W2.DOUBLE_VALUE, enumC0409t0, new C0389o(3, enumC0409t0, interfaceC0304t));
    }

    public static IntStream n1(AbstractC0335c abstractC0335c, long j2, long j10) {
        if (j2 >= 0) {
            return new C0380l2(abstractC0335c, b1(j10), j2, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static C0413u0 o1(j$.util.function.O o10, EnumC0409t0 enumC0409t0) {
        o10.getClass();
        enumC0409t0.getClass();
        return new C0413u0(W2.INT_VALUE, enumC0409t0, new C0389o(1, enumC0409t0, o10));
    }

    public static void p0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC0386n0 p1(AbstractC0335c abstractC0335c, long j2, long j10) {
        if (j2 >= 0) {
            return new C0388n2(abstractC0335c, b1(j10), j2, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static void q0(InterfaceC0348e2 interfaceC0348e2, Double d5) {
        if (H3.f12326a) {
            H3.a(interfaceC0348e2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC0348e2.accept(d5.doubleValue());
        }
    }

    public static C0413u0 q1(InterfaceC0290l0 interfaceC0290l0, EnumC0409t0 enumC0409t0) {
        interfaceC0290l0.getClass();
        enumC0409t0.getClass();
        return new C0413u0(W2.LONG_VALUE, enumC0409t0, new C0389o(4, enumC0409t0, interfaceC0290l0));
    }

    public static void s0(InterfaceC0353f2 interfaceC0353f2, Integer num) {
        if (H3.f12326a) {
            H3.a(interfaceC0353f2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC0353f2.accept(num.intValue());
        }
    }

    public static C0413u0 s1(Predicate predicate, EnumC0409t0 enumC0409t0) {
        predicate.getClass();
        enumC0409t0.getClass();
        return new C0413u0(W2.REFERENCE, enumC0409t0, new C0389o(2, enumC0409t0, predicate));
    }

    public static Stream t1(AbstractC0335c abstractC0335c, long j2, long j10) {
        if (j2 >= 0) {
            return new C0372j2(abstractC0335c, b1(j10), j2, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static void u0(InterfaceC0358g2 interfaceC0358g2, Long l2) {
        if (H3.f12326a) {
            H3.a(interfaceC0358g2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC0358g2.accept(l2.longValue());
        }
    }

    public static Stream v1(Spliterator spliterator, boolean z10) {
        spliterator.getClass();
        return new W1(spliterator, V2.h(spliterator), z10);
    }

    public static void w0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void x0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] y0(E0 e02, IntFunction intFunction) {
        if (H3.f12326a) {
            H3.a(e02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (e02.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) e02.count());
            e02.f(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static void z0(B0 b02, Double[] dArr, int i10) {
        if (H3.f12326a) {
            H3.a(b02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) b02.b();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    @Override // j$.util.stream.E3
    public /* synthetic */ int P() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void V0(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void W0(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long a1(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int g1();

    @Override // j$.util.stream.E3
    public Object n0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        P1 u12 = u1();
        abstractC0421w0.w1(spliterator, u12);
        return u12.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract A0 r1(long j2, IntFunction intFunction);

    public abstract P1 u1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0363h2 w1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0363h2 x1(InterfaceC0363h2 interfaceC0363h2);

    @Override // j$.util.stream.E3
    public Object y(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        return ((P1) new R1(this, abstractC0421w0, spliterator).invoke()).get();
    }
}
