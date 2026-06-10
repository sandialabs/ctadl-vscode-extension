package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class X extends AbstractC0261c implements H {
    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.H
    public final void c(j$.util.function.K k3) {
        k3.getClass();
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
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

    @Override // j$.util.H
    public final boolean k(j$.util.function.K k3) {
        k3.getClass();
        return false;
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ H trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0261c, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
