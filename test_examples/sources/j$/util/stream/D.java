package j$.util.stream;

import j$.util.C0313g;
import j$.util.C0318l;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0299q;
import j$.util.function.InterfaceC0304t;
import j$.util.function.InterfaceC0309w;
import j$.util.function.InterfaceC0312z;

/* loaded from: classes2.dex */
abstract class D extends AbstractC0335c implements G {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.E Q1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.E) {
            return (j$.util.E) spliterator;
        }
        if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 B1(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC0421w0.R0(abstractC0421w0, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final void C1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        InterfaceC0293n c0408t;
        j$.util.E Q1 = Q1(spliterator);
        if (interfaceC0363h2 instanceof InterfaceC0293n) {
            c0408t = (InterfaceC0293n) interfaceC0363h2;
        } else if (H3.f12326a) {
            H3.a(AbstractC0335c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            interfaceC0363h2.getClass();
            c0408t = new C0408t(0, interfaceC0363h2);
        }
        while (!interfaceC0363h2.i() && Q1.p(c0408t)) {
        }
    }

    @Override // j$.util.stream.G
    public final IntStream D(InterfaceC0309w interfaceC0309w) {
        interfaceC0309w.getClass();
        return new C0424x(this, V2.f12407p | V2.n, interfaceC0309w, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final W2 D1() {
        return W2.DOUBLE_VALUE;
    }

    public void J(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        z1(new O(interfaceC0293n, false));
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator N1(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        return new C0359g3(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.stream.G
    public final C0318l R(InterfaceC0285j interfaceC0285j) {
        interfaceC0285j.getClass();
        return (C0318l) z1(new A1(W2.DOUBLE_VALUE, interfaceC0285j, 0));
    }

    @Override // j$.util.stream.G
    public final double U(double d5, InterfaceC0285j interfaceC0285j) {
        interfaceC0285j.getClass();
        return ((Double) z1(new C0430y1(W2.DOUBLE_VALUE, interfaceC0285j, d5))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final boolean V(InterfaceC0304t interfaceC0304t) {
        return ((Boolean) z1(AbstractC0421w0.m1(interfaceC0304t, EnumC0409t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final boolean Z(InterfaceC0304t interfaceC0304t) {
        return ((Boolean) z1(AbstractC0421w0.m1(interfaceC0304t, EnumC0409t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final C0318l average() {
        double[] dArr = (double[]) o(new C0330b(5), new C0330b(6), new C0330b(7));
        if (dArr[2] > 0.0d) {
            int i10 = AbstractC0385n.f12501a;
            double d5 = dArr[0] + dArr[1];
            double d10 = dArr[dArr.length - 1];
            if (Double.isNaN(d5) && Double.isInfinite(d10)) {
                d5 = d10;
            }
            return C0318l.d(d5 / dArr[2]);
        }
        return C0318l.a();
    }

    @Override // j$.util.stream.G
    public final G b(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0416v(this, 0, interfaceC0293n, 3);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return q(new S1(16));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((AbstractC0374k0) j(new C0330b(4))).sum();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((Z1) ((Z1) boxed()).distinct()).l0(new C0330b(8));
    }

    @Override // j$.util.stream.G
    public final C0318l findAny() {
        return (C0318l) z1(new H(false, W2.DOUBLE_VALUE, C0318l.a(), new S1(19), new C0330b(10)));
    }

    @Override // j$.util.stream.G
    public final C0318l findFirst() {
        return (C0318l) z1(new H(true, W2.DOUBLE_VALUE, C0318l.a(), new S1(19), new C0330b(10)));
    }

    @Override // j$.util.stream.G
    public final G h(InterfaceC0304t interfaceC0304t) {
        interfaceC0304t.getClass();
        return new C0416v(this, V2.f12411t, interfaceC0304t, 2);
    }

    @Override // j$.util.stream.G
    public final G i(InterfaceC0299q interfaceC0299q) {
        return new C0416v(this, V2.f12407p | V2.n | V2.f12411t, interfaceC0299q, 1);
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final j$.util.r iterator() {
        return j$.util.d0.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final InterfaceC0386n0 j(InterfaceC0312z interfaceC0312z) {
        interfaceC0312z.getClass();
        return new C0428y(this, V2.f12407p | V2.n, interfaceC0312z, 0);
    }

    @Override // j$.util.stream.G
    public final G limit(long j2) {
        if (j2 >= 0) {
            return AbstractC0421w0.l1(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    public void m0(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        z1(new O(interfaceC0293n, true));
    }

    @Override // j$.util.stream.G
    public final C0318l max() {
        return R(new S1(15));
    }

    @Override // j$.util.stream.G
    public final C0318l min() {
        return R(new S1(14));
    }

    @Override // j$.util.stream.G
    public final Object o(j$.util.function.K0 k02, j$.util.function.y0 y0Var, BiConsumer biConsumer) {
        C0404s c0404s = new C0404s(biConsumer, 0);
        k02.getClass();
        y0Var.getClass();
        return z1(new C0422w1(W2.DOUBLE_VALUE, c0404s, y0Var, k02, 1));
    }

    @Override // j$.util.stream.G
    public final G p(j$.util.function.C c) {
        c.getClass();
        return new C0416v(this, V2.f12407p | V2.n, c, 0);
    }

    @Override // j$.util.stream.G
    public final Stream q(InterfaceC0299q interfaceC0299q) {
        interfaceC0299q.getClass();
        return new C0420w(this, V2.f12407p | V2.n, interfaceC0299q, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final A0 r1(long j2, IntFunction intFunction) {
        return AbstractC0421w0.X0(j2);
    }

    @Override // j$.util.stream.G
    public final G skip(long j2) {
        int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC0421w0.l1(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new C0435z2(this);
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final j$.util.E spliterator() {
        return Q1(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) o(new C0330b(9), new C0330b(2), new C0330b(3));
        int i10 = AbstractC0385n.f12501a;
        double d5 = dArr[0] + dArr[1];
        double d10 = dArr[dArr.length - 1];
        return (Double.isNaN(d5) && Double.isInfinite(d10)) ? d10 : d5;
    }

    @Override // j$.util.stream.G
    public final C0313g summaryStatistics() {
        return (C0313g) o(new S1(8), new S1(17), new S1(18));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC0421w0.d1((B0) A1(new C0330b(1))).b();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final InterfaceC0365i unordered() {
        return !F1() ? this : new C0432z(this, V2.f12409r, 0);
    }

    @Override // j$.util.stream.G
    public final boolean x(InterfaceC0304t interfaceC0304t) {
        return ((Boolean) z1(AbstractC0421w0.m1(interfaceC0304t, EnumC0409t0.ANY))).booleanValue();
    }
}
