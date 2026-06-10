package j$.util.stream;

import j$.util.C0315i;
import j$.util.C0318l;
import j$.util.C0320n;
import j$.util.InterfaceC0442z;
import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0284i0;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0296o0;
import j$.util.function.InterfaceC0301r0;

/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0386n0 extends InterfaceC0365i {
    Object A(j$.util.function.K0 k02, j$.util.function.E0 e02, BiConsumer biConsumer);

    boolean B(InterfaceC0290l0 interfaceC0290l0);

    void G(InterfaceC0278f0 interfaceC0278f0);

    G M(InterfaceC0296o0 interfaceC0296o0);

    InterfaceC0386n0 Q(j$.util.function.v0 v0Var);

    IntStream X(InterfaceC0301r0 interfaceC0301r0);

    Stream Y(InterfaceC0284i0 interfaceC0284i0);

    boolean a(InterfaceC0290l0 interfaceC0290l0);

    G asDoubleStream();

    C0318l average();

    Stream boxed();

    long count();

    InterfaceC0386n0 distinct();

    C0320n e(InterfaceC0270b0 interfaceC0270b0);

    InterfaceC0386n0 f(InterfaceC0278f0 interfaceC0278f0);

    C0320n findAny();

    C0320n findFirst();

    InterfaceC0386n0 g(InterfaceC0284i0 interfaceC0284i0);

    boolean h0(InterfaceC0290l0 interfaceC0290l0);

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    InterfaceC0442z iterator();

    InterfaceC0386n0 k0(InterfaceC0290l0 interfaceC0290l0);

    InterfaceC0386n0 limit(long j2);

    long m(long j2, InterfaceC0270b0 interfaceC0270b0);

    C0320n max();

    C0320n min();

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    InterfaceC0386n0 parallel();

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    InterfaceC0386n0 sequential();

    InterfaceC0386n0 skip(long j2);

    InterfaceC0386n0 sorted();

    @Override // j$.util.stream.InterfaceC0365i, j$.util.stream.G
    j$.util.K spliterator();

    long sum();

    C0315i summaryStatistics();

    long[] toArray();

    void z(InterfaceC0278f0 interfaceC0278f0);
}
