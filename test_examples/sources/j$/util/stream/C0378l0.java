package j$.util.stream;

import j$.util.AbstractC0317k;
import j$.util.C0315i;
import j$.util.C0318l;
import j$.util.C0320n;
import j$.util.C0440x;
import j$.util.InterfaceC0442z;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0267a;
import j$.util.function.C0268a0;
import j$.util.function.C0276e0;
import j$.util.function.C0282h0;
import j$.util.function.C0288k0;
import j$.util.function.C0294n0;
import j$.util.function.C0300q0;
import j$.util.function.C0307u0;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0284i0;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0296o0;
import j$.util.function.InterfaceC0301r0;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.l0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0378l0 implements InterfaceC0386n0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f12494a;

    private /* synthetic */ C0378l0(LongStream longStream) {
        this.f12494a = longStream;
    }

    public static /* synthetic */ InterfaceC0386n0 y(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0382m0 ? ((C0382m0) longStream).f12498a : new C0378l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ Object A(j$.util.function.K0 k02, j$.util.function.E0 e02, BiConsumer biConsumer) {
        return this.f12494a.collect(j$.util.function.J0.a(k02), j$.util.function.D0.a(e02), C0267a.a(biConsumer));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ boolean B(InterfaceC0290l0 interfaceC0290l0) {
        return this.f12494a.allMatch(C0288k0.a(interfaceC0290l0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ void G(InterfaceC0278f0 interfaceC0278f0) {
        this.f12494a.forEach(C0276e0.a(interfaceC0278f0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ G M(InterfaceC0296o0 interfaceC0296o0) {
        return E.y(this.f12494a.mapToDouble(C0294n0.a(interfaceC0296o0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 Q(j$.util.function.v0 v0Var) {
        return y(this.f12494a.map(C0307u0.a(v0Var)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ IntStream X(InterfaceC0301r0 interfaceC0301r0) {
        return IntStream.VivifiedWrapper.convert(this.f12494a.mapToInt(C0300q0.a(interfaceC0301r0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ Stream Y(InterfaceC0284i0 interfaceC0284i0) {
        return S2.y(this.f12494a.mapToObj(C0282h0.a(interfaceC0284i0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ boolean a(InterfaceC0290l0 interfaceC0290l0) {
        return this.f12494a.noneMatch(C0288k0.a(interfaceC0290l0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ G asDoubleStream() {
        return E.y(this.f12494a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0318l average() {
        return AbstractC0317k.b(this.f12494a.average());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ Stream boxed() {
        return S2.y(this.f12494a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f12494a.close();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ long count() {
        return this.f12494a.count();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 distinct() {
        return y(this.f12494a.distinct());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0320n e(InterfaceC0270b0 interfaceC0270b0) {
        return AbstractC0317k.d(this.f12494a.reduce(C0268a0.a(interfaceC0270b0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0378l0) {
            obj = ((C0378l0) obj).f12494a;
        }
        return this.f12494a.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 f(InterfaceC0278f0 interfaceC0278f0) {
        return y(this.f12494a.peek(C0276e0.a(interfaceC0278f0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0320n findAny() {
        return AbstractC0317k.d(this.f12494a.findAny());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0320n findFirst() {
        return AbstractC0317k.d(this.f12494a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 g(InterfaceC0284i0 interfaceC0284i0) {
        return y(this.f12494a.flatMap(C0282h0.a(interfaceC0284i0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ boolean h0(InterfaceC0290l0 interfaceC0290l0) {
        return this.f12494a.anyMatch(C0288k0.a(interfaceC0290l0));
    }

    public final /* synthetic */ int hashCode() {
        return this.f12494a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ boolean isParallel() {
        return this.f12494a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0442z iterator() {
        return C0440x.a(this.f12494a.iterator());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f12494a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 k0(InterfaceC0290l0 interfaceC0290l0) {
        return y(this.f12494a.filter(C0288k0.a(interfaceC0290l0)));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 limit(long j2) {
        return y(this.f12494a.limit(j2));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ long m(long j2, InterfaceC0270b0 interfaceC0270b0) {
        return this.f12494a.reduce(j2, C0268a0.a(interfaceC0270b0));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0320n max() {
        return AbstractC0317k.d(this.f12494a.max());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ C0320n min() {
        return AbstractC0317k.d(this.f12494a.min());
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i onClose(Runnable runnable) {
        return C0355g.y(this.f12494a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i parallel() {
        return C0355g.y(this.f12494a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0386n0 parallel() {
        return y(this.f12494a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0365i sequential() {
        return C0355g.y(this.f12494a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ InterfaceC0386n0 sequential() {
        return y(this.f12494a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 skip(long j2) {
        return y(this.f12494a.skip(j2));
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ InterfaceC0386n0 sorted() {
        return y(this.f12494a.sorted());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ j$.util.K spliterator() {
        return j$.util.I.e(this.f12494a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0386n0, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.e(this.f12494a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ long sum() {
        return this.f12494a.sum();
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final C0315i summaryStatistics() {
        this.f12494a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ long[] toArray() {
        return this.f12494a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final /* synthetic */ InterfaceC0365i unordered() {
        return C0355g.y(this.f12494a.unordered());
    }

    @Override // j$.util.stream.InterfaceC0386n0
    public final /* synthetic */ void z(InterfaceC0278f0 interfaceC0278f0) {
        this.f12494a.forEachOrdered(C0276e0.a(interfaceC0278f0));
    }
}
