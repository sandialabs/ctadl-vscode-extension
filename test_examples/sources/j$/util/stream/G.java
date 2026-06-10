package j$.util.stream;

import j$.util.C0313g;
import j$.util.C0318l;
import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0299q;
import j$.util.function.InterfaceC0304t;
import j$.util.function.InterfaceC0309w;
import j$.util.function.InterfaceC0312z;

/* loaded from: classes2.dex */
public interface G extends InterfaceC0365i {
    IntStream D(InterfaceC0309w interfaceC0309w);

    void J(InterfaceC0293n interfaceC0293n);

    C0318l R(InterfaceC0285j interfaceC0285j);

    double U(double d5, InterfaceC0285j interfaceC0285j);

    boolean V(InterfaceC0304t interfaceC0304t);

    boolean Z(InterfaceC0304t interfaceC0304t);

    C0318l average();

    G b(InterfaceC0293n interfaceC0293n);

    Stream boxed();

    long count();

    G distinct();

    C0318l findAny();

    C0318l findFirst();

    G h(InterfaceC0304t interfaceC0304t);

    G i(InterfaceC0299q interfaceC0299q);

    @Override // 
    j$.util.r iterator();

    InterfaceC0386n0 j(InterfaceC0312z interfaceC0312z);

    G limit(long j2);

    void m0(InterfaceC0293n interfaceC0293n);

    C0318l max();

    C0318l min();

    Object o(j$.util.function.K0 k02, j$.util.function.y0 y0Var, BiConsumer biConsumer);

    G p(j$.util.function.C c);

    @Override // 
    G parallel();

    Stream q(InterfaceC0299q interfaceC0299q);

    @Override // 
    G sequential();

    G skip(long j2);

    G sorted();

    @Override // 
    j$.util.E spliterator();

    double sum();

    C0313g summaryStatistics();

    double[] toArray();

    boolean x(InterfaceC0304t interfaceC0304t);
}
