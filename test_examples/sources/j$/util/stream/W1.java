package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W1 extends Z1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W1(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.Stream
    public final void H(Consumer consumer) {
        if (isParallel()) {
            super.H(consumer);
        } else {
            M1().forEachRemaining(consumer);
        }
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

    @Override // j$.util.stream.Z1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            M1().forEachRemaining(consumer);
        }
    }
}
