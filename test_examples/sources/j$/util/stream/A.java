package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC0293n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A extends D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void J(InterfaceC0293n interfaceC0293n) {
        j$.util.E Q1;
        if (isParallel()) {
            super.J(interfaceC0293n);
            return;
        }
        Q1 = D.Q1(M1());
        Q1.d(interfaceC0293n);
    }

    @Override // j$.util.stream.AbstractC0335c
    final boolean J1() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void m0(InterfaceC0293n interfaceC0293n) {
        j$.util.E Q1;
        if (isParallel()) {
            super.m0(interfaceC0293n);
            return;
        }
        Q1 = D.Q1(M1());
        Q1.d(interfaceC0293n);
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }
}
