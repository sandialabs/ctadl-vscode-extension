package j$.util.stream;

import j$.util.C0314h;
import j$.util.C0318l;
import j$.util.C0319m;
import j$.util.InterfaceC0438v;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0341d0 extends AbstractC0335c implements IntStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0341d0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0341d0(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.H Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.H) {
            return (j$.util.H) spliterator;
        }
        if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 B1(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC0421w0.S0(abstractC0421w0, spliterator, z10);
    }

    @Override // j$.util.stream.IntStream
    public final Object C(j$.util.function.K0 k02, j$.util.function.B0 b02, BiConsumer biConsumer) {
        C0404s c0404s = new C0404s(biConsumer, 1);
        k02.getClass();
        b02.getClass();
        return z1(new C0422w1(W2.INT_VALUE, c0404s, b02, k02, 4));
    }

    @Override // j$.util.stream.AbstractC0335c
    final void C1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        j$.util.function.K w10;
        j$.util.H Q1 = Q1(spliterator);
        if (interfaceC0363h2 instanceof j$.util.function.K) {
            w10 = (j$.util.function.K) interfaceC0363h2;
        } else if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            interfaceC0363h2.getClass();
            w10 = new W(0, interfaceC0363h2);
        }
        while (!interfaceC0363h2.i() && Q1.k(w10)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final W2 D1() {
        return W2.INT_VALUE;
    }

    @Override // j$.util.stream.IntStream
    public final boolean F(j$.util.function.O o10) {
        return ((Boolean) z1(AbstractC0421w0.o1(o10, EnumC0409t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator N1(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        return new i3(abstractC0421w0, c0325a, z10);
    }

    public void S(j$.util.function.K k3) {
        k3.getClass();
        z1(new P(k3, true));
    }

    @Override // j$.util.stream.IntStream
    public final Stream T(IntFunction intFunction) {
        intFunction.getClass();
        return new C0420w(this, V2.f12407p | V2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream W(IntFunction intFunction) {
        return new C0424x(this, V2.f12407p | V2.n | V2.f12411t, intFunction, 3);
    }

    public void a0(j$.util.function.K k3) {
        k3.getClass();
        z1(new P(k3, false));
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new C0432z(this, V2.f12407p | V2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0386n0 asLongStream() {
        return new Y(this, V2.f12407p | V2.n, 0);
    }

    @Override // j$.util.stream.IntStream
    public final C0318l average() {
        long[] jArr = (long[]) C(new C0330b(17), new C0330b(18), new C0330b(19));
        long j2 = jArr[0];
        return j2 > 0 ? C0318l.d(jArr[1] / j2) : C0318l.a();
    }

    @Override // j$.util.stream.IntStream
    public final G b0(j$.util.function.S s10) {
        s10.getClass();
        return new C0416v(this, V2.f12407p | V2.n, s10, 4);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return T(new S1(27));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC0374k0) d(new C0330b(16))).sum();
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0386n0 d(j$.util.function.V v3) {
        v3.getClass();
        return new C0428y(this, V2.f12407p | V2.n, v3, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).K(new C0330b(15));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e0(j$.util.function.O o10) {
        o10.getClass();
        return new C0424x(this, V2.f12411t, o10, 4);
    }

    @Override // j$.util.stream.IntStream
    public final C0319m f0(j$.util.function.G g10) {
        g10.getClass();
        return (C0319m) z1(new A1(W2.INT_VALUE, g10, 2));
    }

    @Override // j$.util.stream.IntStream
    public final C0319m findAny() {
        return (C0319m) z1(new H(false, W2.INT_VALUE, C0319m.a(), new S1(22), new C0330b(13)));
    }

    @Override // j$.util.stream.IntStream
    public final C0319m findFirst() {
        return (C0319m) z1(new H(true, W2.INT_VALUE, C0319m.a(), new S1(22), new C0330b(13)));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream g0(j$.util.function.K k3) {
        k3.getClass();
        return new C0424x(this, 0, k3, 1);
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final InterfaceC0438v iterator() {
        return j$.util.d0.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream k(j$.util.function.Y y10) {
        y10.getClass();
        return new C0424x(this, V2.f12407p | V2.n, y10, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j2) {
        if (j2 >= 0) {
            return AbstractC0421w0.n1(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.IntStream
    public final C0319m max() {
        return f0(new S1(28));
    }

    @Override // j$.util.stream.IntStream
    public final C0319m min() {
        return f0(new S1(23));
    }

    @Override // j$.util.stream.IntStream
    public final int r(int i10, j$.util.function.G g10) {
        g10.getClass();
        return ((Integer) z1(new I1(W2.INT_VALUE, g10, i10))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final A0 r1(long j2, IntFunction intFunction) {
        return AbstractC0421w0.h1(j2);
    }

    @Override // j$.util.stream.IntStream
    public final boolean s(j$.util.function.O o10) {
        return ((Boolean) z1(AbstractC0421w0.o1(o10, EnumC0409t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j2) {
        int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC0421w0.n1(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new A2(this);
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final j$.util.H spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return r(0, new S1(24));
    }

    @Override // j$.util.stream.IntStream
    public final C0314h summaryStatistics() {
        return (C0314h) C(new S1(9), new S1(25), new S1(26));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0421w0.e1((C0) A1(new C0330b(20))).b();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u(j$.util.function.O o10) {
        return ((Boolean) z1(AbstractC0421w0.o1(o10, EnumC0409t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final InterfaceC0365i unordered() {
        return !F1() ? this : new Z(this, V2.f12409r);
    }
}
