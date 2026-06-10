package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0326a0 extends AbstractC0341d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0326a0(Spliterator spliterator, int i10) {
        super(spliterator, i10);
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

    @Override // j$.util.stream.AbstractC0341d0, j$.util.stream.IntStream
    public final void S(j$.util.function.K k3) {
        j$.util.H Q1;
        if (isParallel()) {
            super.S(k3);
            return;
        }
        Q1 = AbstractC0341d0.Q1(M1());
        Q1.c(k3);
    }

    @Override // j$.util.stream.AbstractC0341d0, j$.util.stream.IntStream
    public final void a0(j$.util.function.K k3) {
        j$.util.H Q1;
        if (isParallel()) {
            super.a0(k3);
            return;
        }
        Q1 = AbstractC0341d0.Q1(M1());
        Q1.c(k3);
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
