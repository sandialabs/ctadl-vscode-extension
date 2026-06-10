package j$.util.stream;

import j$.util.AbstractC0317k;
import j$.util.C0314h;
import j$.util.C0318l;
import j$.util.C0319m;
import j$.util.C0436t;
import j$.util.C0437u;
import j$.util.InterfaceC0438v;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0267a;
import j$.util.function.IntFunction;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public interface IntStream extends InterfaceC0365i {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f12336a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f12336a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object C(j$.util.function.K0 k02, j$.util.function.B0 b02, BiConsumer biConsumer) {
            return this.f12336a.collect(j$.util.function.J0.a(k02), j$.util.function.A0.a(b02), C0267a.a(biConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean F(j$.util.function.O o10) {
            return this.f12336a.anyMatch(j$.util.function.N.a(o10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void S(j$.util.function.K k3) {
            this.f12336a.forEachOrdered(j$.util.function.J.a(k3));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream T(IntFunction intFunction) {
            return S2.y(this.f12336a.mapToObj(j$.util.function.L.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream W(IntFunction intFunction) {
            return convert(this.f12336a.flatMap(j$.util.function.L.a(intFunction)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void a0(j$.util.function.K k3) {
            this.f12336a.forEach(j$.util.function.J.a(k3));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G asDoubleStream() {
            return E.y(this.f12336a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC0386n0 asLongStream() {
            return C0378l0.y(this.f12336a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0318l average() {
            return AbstractC0317k.b(this.f12336a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ G b0(j$.util.function.S s10) {
            return E.y(this.f12336a.mapToDouble(j$.util.function.Q.a(s10)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return S2.y(this.f12336a.boxed());
        }

        @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f12336a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f12336a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC0386n0 d(j$.util.function.V v3) {
            return C0378l0.y(this.f12336a.mapToLong(j$.util.function.U.a(v3)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f12336a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream e0(j$.util.function.O o10) {
            return convert(this.f12336a.filter(j$.util.function.N.a(o10)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f12336a;
            }
            return this.f12336a.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0319m f0(j$.util.function.G g10) {
            return AbstractC0317k.c(this.f12336a.reduce(j$.util.function.F.a(g10)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0319m findAny() {
            return AbstractC0317k.c(this.f12336a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0319m findFirst() {
            return AbstractC0317k.c(this.f12336a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream g0(j$.util.function.K k3) {
            return convert(this.f12336a.peek(j$.util.function.J.a(k3)));
        }

        public final /* synthetic */ int hashCode() {
            return this.f12336a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC0365i
        public final /* synthetic */ boolean isParallel() {
            return this.f12336a.isParallel();
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ InterfaceC0438v iterator() {
            return C0436t.a(this.f12336a.iterator());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ Iterator iterator() {
            return this.f12336a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream k(j$.util.function.Y y10) {
            return convert(this.f12336a.map(j$.util.function.X.a(y10)));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j2) {
            return convert(this.f12336a.limit(j2));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0319m max() {
            return AbstractC0317k.c(this.f12336a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C0319m min() {
            return AbstractC0317k.c(this.f12336a.min());
        }

        @Override // j$.util.stream.InterfaceC0365i
        public final /* synthetic */ InterfaceC0365i onClose(Runnable runnable) {
            return C0355g.y(this.f12336a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f12336a.parallel());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ InterfaceC0365i parallel() {
            return C0355g.y(this.f12336a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int r(int i10, j$.util.function.G g10) {
            return this.f12336a.reduce(i10, j$.util.function.F.a(g10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean s(j$.util.function.O o10) {
            return this.f12336a.allMatch(j$.util.function.N.a(o10));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f12336a.sequential());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ InterfaceC0365i sequential() {
            return C0355g.y(this.f12336a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j2) {
            return convert(this.f12336a.skip(j2));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f12336a.sorted());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ j$.util.H spliterator() {
            return j$.util.F.e(this.f12336a.spliterator());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC0365i, j$.util.stream.G
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.O.e(this.f12336a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f12336a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final C0314h summaryStatistics() {
            this.f12336a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f12336a.toArray();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean u(j$.util.function.O o10) {
            return this.f12336a.noneMatch(j$.util.function.N.a(o10));
        }

        @Override // j$.util.stream.InterfaceC0365i
        public final /* synthetic */ InterfaceC0365i unordered() {
            return C0355g.y(this.f12336a.unordered());
        }
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
            IntStream.this = r1;
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f12336a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.s(j$.util.function.M.b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.F(j$.util.function.M.b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return F.y(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C0382m0.y(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC0317k.f(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.C(j$.util.function.I0.a(supplier), j$.util.function.z0.a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.e0(j$.util.function.M.b(intPredicate)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC0317k.g(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC0317k.g(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
            return convert(IntStream.this.W(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.a0(j$.util.function.I.a(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.S(j$.util.function.I.a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C0437u.a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j2) {
            return convert(IntStream.this.limit(j2));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.k(j$.util.function.W.d(intUnaryOperator)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return F.y(IntStream.this.b0(j$.util.function.P.b(intToDoubleFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C0382m0.y(IntStream.this.d(j$.util.function.T.a(intToLongFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.T(IntFunction.VivifiedWrapper.convert(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC0317k.g(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC0317k.g(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.u(j$.util.function.M.b(intPredicate));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C0360h.y(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C0360h.y(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.g0(j$.util.function.I.a(intConsumer)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.r(i10, j$.util.function.E.a(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC0317k.g(IntStream.this.f0(j$.util.function.E.a(intBinaryOperator)));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C0360h.y(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j2) {
            return convert(IntStream.this.skip(j2));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.G.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C0360h.y(IntStream.this.unordered());
        }
    }

    Object C(j$.util.function.K0 k02, j$.util.function.B0 b02, BiConsumer biConsumer);

    boolean F(j$.util.function.O o10);

    void S(j$.util.function.K k3);

    Stream T(IntFunction intFunction);

    IntStream W(IntFunction intFunction);

    void a0(j$.util.function.K k3);

    G asDoubleStream();

    InterfaceC0386n0 asLongStream();

    C0318l average();

    G b0(j$.util.function.S s10);

    Stream boxed();

    long count();

    InterfaceC0386n0 d(j$.util.function.V v3);

    IntStream distinct();

    IntStream e0(j$.util.function.O o10);

    C0319m f0(j$.util.function.G g10);

    C0319m findAny();

    C0319m findFirst();

    IntStream g0(j$.util.function.K k3);

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    InterfaceC0438v iterator();

    IntStream k(j$.util.function.Y y10);

    IntStream limit(long j2);

    C0319m max();

    C0319m min();

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    IntStream parallel();

    int r(int i10, j$.util.function.G g10);

    boolean s(j$.util.function.O o10);

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    IntStream sequential();

    IntStream skip(long j2);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    j$.util.H spliterator();

    int sum();

    C0314h summaryStatistics();

    int[] toArray();

    boolean u(j$.util.function.O o10);
}
