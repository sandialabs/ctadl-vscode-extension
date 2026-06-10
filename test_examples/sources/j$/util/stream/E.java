package j$.util.stream;

import j$.util.AbstractC0317k;
import j$.util.C0313g;
import j$.util.C0318l;
import j$.util.C0322p;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0267a;
import j$.util.function.C0283i;
import j$.util.function.C0291m;
import j$.util.function.C0297p;
import j$.util.function.C0302s;
import j$.util.function.C0308v;
import j$.util.function.C0311y;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0299q;
import j$.util.function.InterfaceC0304t;
import j$.util.function.InterfaceC0309w;
import j$.util.function.InterfaceC0312z;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f12303a;

    private /* synthetic */ E(DoubleStream doubleStream) {
        this.f12303a = doubleStream;
    }

    public static /* synthetic */ G y(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof F ? ((F) doubleStream).f12307a : new E(doubleStream);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ IntStream D(InterfaceC0309w interfaceC0309w) {
        return IntStream.VivifiedWrapper.convert(this.f12303a.mapToInt(C0308v.a(interfaceC0309w)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void J(InterfaceC0293n interfaceC0293n) {
        this.f12303a.forEach(C0291m.a(interfaceC0293n));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l R(InterfaceC0285j interfaceC0285j) {
        return AbstractC0317k.b(this.f12303a.reduce(C0283i.a(interfaceC0285j)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double U(double d5, InterfaceC0285j interfaceC0285j) {
        return this.f12303a.reduce(d5, C0283i.a(interfaceC0285j));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean V(InterfaceC0304t interfaceC0304t) {
        return this.f12303a.noneMatch(C0302s.a(interfaceC0304t));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean Z(InterfaceC0304t interfaceC0304t) {
        return this.f12303a.allMatch(C0302s.a(interfaceC0304t));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l average() {
        return AbstractC0317k.b(this.f12303a.average());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G b(InterfaceC0293n interfaceC0293n) {
        return y(this.f12303a.peek(C0291m.a(interfaceC0293n)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream boxed() {
        return S2.y(this.f12303a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f12303a.close();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ long count() {
        return this.f12303a.count();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G distinct() {
        return y(this.f12303a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof E) {
            obj = ((E) obj).f12303a;
        }
        return this.f12303a.equals(obj);
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l findAny() {
        return AbstractC0317k.b(this.f12303a.findAny());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l findFirst() {
        return AbstractC0317k.b(this.f12303a.findFirst());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G h(InterfaceC0304t interfaceC0304t) {
        return y(this.f12303a.filter(C0302s.a(interfaceC0304t)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f12303a.hashCode();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G i(InterfaceC0299q interfaceC0299q) {
        return y(this.f12303a.flatMap(C0297p.a(interfaceC0299q)));
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ boolean isParallel() {
        return this.f12303a.isParallel();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.r iterator() {
        return C0322p.a(this.f12303a.iterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f12303a.iterator();
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC0386n0 j(InterfaceC0312z interfaceC0312z) {
        return C0378l0.y(this.f12303a.mapToLong(C0311y.a(interfaceC0312z)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G limit(long j2) {
        return y(this.f12303a.limit(j2));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void m0(InterfaceC0293n interfaceC0293n) {
        this.f12303a.forEachOrdered(C0291m.a(interfaceC0293n));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l max() {
        return AbstractC0317k.b(this.f12303a.max());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ C0318l min() {
        return AbstractC0317k.b(this.f12303a.min());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Object o(j$.util.function.K0 k02, j$.util.function.y0 y0Var, BiConsumer biConsumer) {
        return this.f12303a.collect(j$.util.function.J0.a(k02), j$.util.function.x0.a(y0Var), C0267a.a(biConsumer));
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i onClose(Runnable runnable) {
        return C0355g.y(this.f12303a.onClose(runnable));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G p(j$.util.function.C c) {
        return y(this.f12303a.map(j$.util.function.B.a(c)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G parallel() {
        return y(this.f12303a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i parallel() {
        return C0355g.y(this.f12303a.parallel());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Stream q(InterfaceC0299q interfaceC0299q) {
        return S2.y(this.f12303a.mapToObj(C0297p.a(interfaceC0299q)));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sequential() {
        return y(this.f12303a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i sequential() {
        return C0355g.y(this.f12303a.sequential());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G skip(long j2) {
        return y(this.f12303a.skip(j2));
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ G sorted() {
        return y(this.f12303a.sorted());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ j$.util.E spliterator() {
        return j$.util.C.e(this.f12303a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.e(this.f12303a.spliterator());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double sum() {
        return this.f12303a.sum();
    }

    @Override // j$.util.stream.G
    public final C0313g summaryStatistics() {
        this.f12303a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ double[] toArray() {
        return this.f12303a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i unordered() {
        return C0355g.y(this.f12303a.unordered());
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean x(InterfaceC0304t interfaceC0304t) {
        return this.f12303a.anyMatch(C0302s.a(interfaceC0304t));
    }
}
