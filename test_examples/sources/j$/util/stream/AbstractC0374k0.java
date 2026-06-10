package j$.util.stream;

import j$.util.C0315i;
import j$.util.C0318l;
import j$.util.C0320n;
import j$.util.InterfaceC0442z;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0284i0;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0296o0;
import j$.util.function.InterfaceC0301r0;

/* renamed from: j$.util.stream.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0374k0 extends AbstractC0335c implements InterfaceC0386n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0374k0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0374k0(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.K Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.K) {
            return (j$.util.K) spliterator;
        }
        if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final Object A(j$.util.function.K0 k02, j$.util.function.E0 e02, BiConsumer biConsumer) {
        C0404s c0404s = new C0404s(biConsumer, 2);
        k02.getClass();
        e02.getClass();
        return z1(new C0422w1(W2.LONG_VALUE, c0404s, e02, k02, 0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final boolean B(InterfaceC0290l0 interfaceC0290l0) {
        return ((Boolean) z1(AbstractC0421w0.q1(interfaceC0290l0, EnumC0409t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 B1(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC0421w0.T0(abstractC0421w0, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final void C1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        InterfaceC0278f0 c0346e0;
        j$.util.K Q1 = Q1(spliterator);
        if (interfaceC0363h2 instanceof InterfaceC0278f0) {
            c0346e0 = (InterfaceC0278f0) interfaceC0363h2;
        } else if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            interfaceC0363h2.getClass();
            c0346e0 = new C0346e0(0, interfaceC0363h2);
        }
        while (!interfaceC0363h2.i() && Q1.f(c0346e0)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final W2 D1() {
        return W2.LONG_VALUE;
    }

    public void G(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        z1(new Q(interfaceC0278f0, false));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final G M(InterfaceC0296o0 interfaceC0296o0) {
        interfaceC0296o0.getClass();
        return new C0416v(this, V2.f12407p | V2.n, interfaceC0296o0, 5);
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator N1(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        return new k3(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 Q(j$.util.function.v0 v0Var) {
        v0Var.getClass();
        return new C0428y(this, V2.f12407p | V2.n, v0Var, 2);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final IntStream X(InterfaceC0301r0 interfaceC0301r0) {
        interfaceC0301r0.getClass();
        return new C0424x(this, V2.f12407p | V2.n, interfaceC0301r0, 5);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final Stream Y(InterfaceC0284i0 interfaceC0284i0) {
        interfaceC0284i0.getClass();
        return new C0420w(this, V2.f12407p | V2.n, interfaceC0284i0, 2);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final boolean a(InterfaceC0290l0 interfaceC0290l0) {
        return ((Boolean) z1(AbstractC0421w0.q1(interfaceC0290l0, EnumC0409t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final G asDoubleStream() {
        return new C0432z(this, V2.f12407p | V2.n, 2);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0318l average() {
        long[] jArr = (long[]) A(new C0330b(24), new C0330b(25), new C0330b(26));
        long j2 = jArr[0];
        return j2 > 0 ? C0318l.d(jArr[1] / j2) : C0318l.a();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final Stream boxed() {
        return Y(new C0351f0(1));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final long count() {
        return ((AbstractC0374k0) Q(new C0330b(21))).sum();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).j0(new C0330b(22));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0320n e(InterfaceC0270b0 interfaceC0270b0) {
        interfaceC0270b0.getClass();
        return (C0320n) z1(new A1(W2.LONG_VALUE, interfaceC0270b0, 3));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 f(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0428y(this, 0, interfaceC0278f0, 5);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0320n findAny() {
        return (C0320n) z1(new H(false, W2.LONG_VALUE, C0320n.a(), new S1(20), new C0330b(11)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0320n findFirst() {
        return (C0320n) z1(new H(true, W2.LONG_VALUE, C0320n.a(), new S1(20), new C0330b(11)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 g(InterfaceC0284i0 interfaceC0284i0) {
        return new C0428y(this, V2.f12407p | V2.n | V2.f12411t, interfaceC0284i0, 3);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final boolean h0(InterfaceC0290l0 interfaceC0290l0) {
        return ((Boolean) z1(AbstractC0421w0.q1(interfaceC0290l0, EnumC0409t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final InterfaceC0442z iterator() {
        return j$.util.d0.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 k0(InterfaceC0290l0 interfaceC0290l0) {
        interfaceC0290l0.getClass();
        return new C0428y(this, V2.f12411t, interfaceC0290l0, 4);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 limit(long j2) {
        if (j2 >= 0) {
            return AbstractC0421w0.p1(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final long m(long j2, InterfaceC0270b0 interfaceC0270b0) {
        interfaceC0270b0.getClass();
        return ((Long) z1(new M1(W2.LONG_VALUE, interfaceC0270b0, j2))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0320n max() {
        return e(new C0351f0(0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0320n min() {
        return e(new S1(29));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final A0 r1(long j2, IntFunction intFunction) {
        return AbstractC0421w0.j1(j2);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 skip(long j2) {
        int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC0421w0.p1(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final InterfaceC0386n0 sorted() {
        return new B2(this);
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final j$.util.K spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final long sum() {
        return m(0L, new C0351f0(2));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0315i summaryStatistics() {
        return (C0315i) A(new S1(10), new C0351f0(3), new C0351f0(4));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final long[] toArray() {
        return (long[]) AbstractC0421w0.f1((D0) A1(new C0330b(23))).b();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final InterfaceC0365i unordered() {
        return !F1() ? this : new Y(this, V2.f12409r, 1);
    }

    public void z(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        z1(new Q(interfaceC0278f0, true));
    }
}
