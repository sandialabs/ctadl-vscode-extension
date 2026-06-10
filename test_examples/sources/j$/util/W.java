package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class W extends AbstractC0261c implements E {
    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.E
    public final void d(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
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

    @Override // j$.util.E
    public final boolean p(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return false;
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ E trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
