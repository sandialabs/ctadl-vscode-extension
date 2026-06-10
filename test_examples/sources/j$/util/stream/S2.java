package j$.util.stream;

import j$.util.AbstractC0317k;
import j$.util.C0316j;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0267a;
import j$.util.function.C0269b;
import j$.util.function.C0275e;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0277f;
import j$.util.function.Predicate;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class S2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Stream f12380a;

    private /* synthetic */ S2(java.util.stream.Stream stream) {
        this.f12380a = stream;
    }

    public static /* synthetic */ Stream y(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new S2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean E(Predicate predicate) {
        return this.f12380a.anyMatch(j$.util.function.H0.a(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void H(Consumer consumer) {
        this.f12380a.forEachOrdered(C0279g.a(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object I(j$.util.function.K0 k02, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f12380a.collect(j$.util.function.J0.a(k02), C0267a.a(biConsumer), C0267a.a(biConsumer2));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream K(j$.util.function.Q0 q02) {
        return IntStream.VivifiedWrapper.convert(this.f12380a.mapToInt(j$.util.function.P0.a(q02)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream L(Function function) {
        return y(this.f12380a.map(j$.util.function.D.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream N(Function function) {
        return y(this.f12380a.flatMap(j$.util.function.D.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C0316j O(InterfaceC0277f interfaceC0277f) {
        return AbstractC0317k.a(this.f12380a.reduce(C0275e.a(interfaceC0277f)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream c(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f12380a.flatMapToInt(j$.util.function.D.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean c0(Predicate predicate) {
        return this.f12380a.allMatch(j$.util.function.H0.a(predicate));
    }

    @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f12380a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f12380a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC0386n0 d0(Function function) {
        return C0378l0.y(this.f12380a.flatMapToLong(j$.util.function.D.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return y(this.f12380a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof S2) {
            obj = ((S2) obj).f12380a;
        }
        return this.f12380a.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C0316j findAny() {
        return AbstractC0317k.a(this.f12380a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C0316j findFirst() {
        return AbstractC0317k.a(this.f12380a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f12380a.forEach(C0279g.a(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f12380a.hashCode();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean i0(Predicate predicate) {
        return this.f12380a.noneMatch(j$.util.function.H0.a(predicate));
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ boolean isParallel() {
        return this.f12380a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f12380a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC0386n0 j0(j$.util.function.T0 t02) {
        return C0378l0.y(this.f12380a.mapToLong(j$.util.function.S0.a(t02)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object l(Object obj, BiFunction biFunction, InterfaceC0277f interfaceC0277f) {
        return this.f12380a.reduce(obj, C0269b.a(biFunction), C0275e.a(interfaceC0277f));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G l0(j$.util.function.N0 n02) {
        return E.y(this.f12380a.mapToDouble(j$.util.function.M0.a(n02)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j2) {
        return y(this.f12380a.limit(j2));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C0316j max(Comparator comparator) {
        return AbstractC0317k.a(this.f12380a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C0316j min(Comparator comparator) {
        return AbstractC0317k.a(this.f12380a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ G n(Function function) {
        return E.y(this.f12380a.flatMapToDouble(j$.util.function.D.a(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object o0(Object obj, InterfaceC0277f interfaceC0277f) {
        return this.f12380a.reduce(obj, C0275e.a(interfaceC0277f));
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i onClose(Runnable runnable) {
        return C0355g.y(this.f12380a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i parallel() {
        return C0355g.y(this.f12380a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i sequential() {
        return C0355g.y(this.f12380a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j2) {
        return y(this.f12380a.skip(j2));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return y(this.f12380a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return y(this.f12380a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.e(this.f12380a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream t(Predicate predicate) {
        return y(this.f12380a.filter(j$.util.function.H0.a(predicate)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f12380a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f12380a.toArray(j$.util.function.L.a(intFunction));
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i unordered() {
        return C0355g.y(this.f12380a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream v(Consumer consumer) {
        return y(this.f12380a.peek(C0279g.a(consumer)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object w(InterfaceC0381m interfaceC0381m) {
        return this.f12380a.collect(C0377l.a(interfaceC0381m));
    }
}
