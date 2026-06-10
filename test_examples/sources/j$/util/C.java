package j$.util;

import j$.util.function.C0279g;
import j$.util.function.C0291m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements E {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f12069a;

    private /* synthetic */ C(Spliterator.OfDouble ofDouble) {
        this.f12069a = ofDouble;
    }

    public static /* synthetic */ E e(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof D ? ((D) ofDouble).f12070a : new C(ofDouble);
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f12069a.tryAdvance(C0279g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12069a.characteristics();
    }

    @Override // j$.util.E
    public final /* synthetic */ void d(InterfaceC0293n interfaceC0293n) {
        this.f12069a.forEachRemaining(C0291m.a(interfaceC0293n));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C) {
            obj = ((C) obj).f12069a;
        }
        return this.f12069a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12069a.estimateSize();
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12069a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12069a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12069a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12069a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12069a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12069a.hashCode();
    }

    @Override // j$.util.E
    public final /* synthetic */ boolean p(InterfaceC0293n interfaceC0293n) {
        return this.f12069a.tryAdvance(C0291m.a(interfaceC0293n));
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12069a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ E trySplit() {
        return e(this.f12069a.trySplit());
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.e(this.f12069a.trySplit());
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.e(this.f12069a.trySplit());
    }
}
