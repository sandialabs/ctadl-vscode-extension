package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class Y extends AbstractC0261c implements K {
    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.K
    public final void b(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
    }

    @Override // j$.util.K
    public final boolean f(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return false;
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ K trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
