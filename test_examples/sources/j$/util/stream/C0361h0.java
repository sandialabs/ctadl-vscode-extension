package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC0278f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0361h0 extends AbstractC0374k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0361h0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
    }

    @Override // j$.util.stream.AbstractC0374k0, j$.util.stream.InterfaceC0386n0
    public final void G(InterfaceC0278f0 interfaceC0278f0) {
        j$.util.K Q1;
        if (isParallel()) {
            super.G(interfaceC0278f0);
            return;
        }
        Q1 = AbstractC0374k0.Q1(M1());
        Q1.b(interfaceC0278f0);
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

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC0386n0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC0386n0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0374k0, j$.util.stream.InterfaceC0386n0
    public final void z(InterfaceC0278f0 interfaceC0278f0) {
        j$.util.K Q1;
        if (isParallel()) {
            super.z(interfaceC0278f0);
            return;
        }
        Q1 = AbstractC0374k0.Q1(M1());
        Q1.b(interfaceC0278f0);
    }
}
