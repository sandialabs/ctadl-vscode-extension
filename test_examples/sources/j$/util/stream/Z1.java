package j$.util.stream;

import j$.util.C0316j;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0271c;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0277f;
import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class Z1 extends AbstractC0335c implements Stream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Z1(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z1(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 B1(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC0421w0.Q0(abstractC0421w0, spliterator, z10, intFunction);
    }

    @Override // j$.util.stream.AbstractC0335c
    final void C1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        while (!interfaceC0363h2.i() && spliterator.a(interfaceC0363h2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final W2 D1() {
        return W2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final boolean E(Predicate predicate) {
        return ((Boolean) z1(AbstractC0421w0.s1(predicate, EnumC0409t0.ANY))).booleanValue();
    }

    public void H(Consumer consumer) {
        consumer.getClass();
        z1(new S(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Object I(j$.util.function.K0 k02, BiConsumer biConsumer, BiConsumer biConsumer2) {
        k02.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return z1(new C0422w1(W2.REFERENCE, biConsumer2, biConsumer, k02, 3));
    }

    @Override // j$.util.stream.Stream
    public final IntStream K(j$.util.function.Q0 q02) {
        q02.getClass();
        return new C0424x(this, V2.f12407p | V2.n, q02, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream L(Function function) {
        function.getClass();
        return new V1(this, V2.f12407p | V2.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream N(Function function) {
        function.getClass();
        return new V1(this, V2.f12407p | V2.n | V2.f12411t, function, 1);
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator N1(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        return new C3(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.stream.Stream
    public final C0316j O(InterfaceC0277f interfaceC0277f) {
        interfaceC0277f.getClass();
        return (C0316j) z1(new A1(W2.REFERENCE, interfaceC0277f, 1));
    }

    @Override // j$.util.stream.Stream
    public final IntStream c(Function function) {
        function.getClass();
        return new C0424x(this, V2.f12407p | V2.n | V2.f12411t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final boolean c0(Predicate predicate) {
        return ((Boolean) z1(AbstractC0421w0.s1(predicate, EnumC0409t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((AbstractC0374k0) j0(new S1(1))).sum();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0386n0 d0(Function function) {
        function.getClass();
        return new C0428y(this, V2.f12407p | V2.n | V2.f12411t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, V2.f12405m | V2.f12411t);
    }

    @Override // j$.util.stream.Stream
    public final C0316j findAny() {
        return (C0316j) z1(new H(false, W2.REFERENCE, C0316j.a(), new S1(21), new C0330b(12)));
    }

    @Override // j$.util.stream.Stream
    public final C0316j findFirst() {
        return (C0316j) z1(new H(true, W2.REFERENCE, C0316j.a(), new S1(21), new C0330b(12)));
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        z1(new S(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final boolean i0(Predicate predicate) {
        return ((Boolean) z1(AbstractC0421w0.s1(predicate, EnumC0409t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final Iterator iterator() {
        return j$.util.d0.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0386n0 j0(j$.util.function.T0 t02) {
        t02.getClass();
        return new C0428y(this, V2.f12407p | V2.n, t02, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object l(Object obj, BiFunction biFunction, InterfaceC0277f interfaceC0277f) {
        biFunction.getClass();
        interfaceC0277f.getClass();
        return z1(new C0422w1(W2.REFERENCE, interfaceC0277f, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final G l0(j$.util.function.N0 n02) {
        n02.getClass();
        return new C0416v(this, V2.f12407p | V2.n, n02, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j2) {
        if (j2 >= 0) {
            return AbstractC0421w0.t1(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.Stream
    public final C0316j max(Comparator comparator) {
        comparator.getClass();
        return O(new C0271c(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final C0316j min(Comparator comparator) {
        comparator.getClass();
        return O(new C0271c(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final G n(Function function) {
        function.getClass();
        return new C0416v(this, V2.f12407p | V2.n | V2.f12411t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object o0(Object obj, InterfaceC0277f interfaceC0277f) {
        interfaceC0277f.getClass();
        return z1(new C0422w1(W2.REFERENCE, interfaceC0277f, interfaceC0277f, obj, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final A0 r1(long j2, IntFunction intFunction) {
        return AbstractC0421w0.P0(j2, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j2) {
        int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : AbstractC0421w0.t1(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new C2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream t(Predicate predicate) {
        predicate.getClass();
        return new C0420w(this, V2.f12411t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new S1(0));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0421w0.c1(A1(intFunction), intFunction).p(intFunction);
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final InterfaceC0365i unordered() {
        return !F1() ? this : new U1(this, V2.f12409r);
    }

    @Override // j$.util.stream.Stream
    public final Stream v(Consumer consumer) {
        consumer.getClass();
        return new C0420w(this, 0, consumer, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(InterfaceC0381m interfaceC0381m) {
        Object z12;
        if (isParallel()) {
            C0373k c0373k = (C0373k) interfaceC0381m;
            if (c0373k.b().contains(EnumC0369j.CONCURRENT) && (!F1() || c0373k.b().contains(EnumC0369j.UNORDERED))) {
                z12 = c0373k.f().get();
                forEach(new C0389o(5, c0373k.a(), z12));
                C0373k c0373k2 = (C0373k) interfaceC0381m;
                return !c0373k2.b().contains(EnumC0369j.IDENTITY_FINISH) ? z12 : c0373k2.e().apply(z12);
            }
        }
        interfaceC0381m.getClass();
        C0373k c0373k3 = (C0373k) interfaceC0381m;
        j$.util.function.K0 f10 = c0373k3.f();
        z12 = z1(new F1(W2.REFERENCE, c0373k3.c(), c0373k3.a(), f10, interfaceC0381m));
        C0373k c0373k22 = (C0373k) interfaceC0381m;
        if (!c0373k22.b().contains(EnumC0369j.IDENTITY_FINISH)) {
        }
    }
}
