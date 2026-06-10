package j$.util;

import j$.util.function.C0279g;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements H {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f12076a;

    private /* synthetic */ F(Spliterator.OfInt ofInt) {
        this.f12076a = ofInt;
    }

    public static /* synthetic */ H e(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof G ? ((G) ofInt).f12077a : new F(ofInt);
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f12076a.tryAdvance(C0279g.a(consumer));
    }

    @Override // j$.util.H
    public final /* synthetic */ void c(j$.util.function.K k3) {
        this.f12076a.forEachRemaining(j$.util.function.J.a(k3));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12076a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof F) {
            obj = ((F) obj).f12076a;
        }
        return this.f12076a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12076a.estimateSize();
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12076a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12076a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12076a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12076a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12076a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12076a.hashCode();
    }

    @Override // j$.util.H
    public final /* synthetic */ boolean k(j$.util.function.K k3) {
        return this.f12076a.tryAdvance(j$.util.function.J.a(k3));
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12076a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ H trySplit() {
        return e(this.f12076a.trySplit());
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.e(this.f12076a.trySplit());
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.e(this.f12076a.trySplit());
    }
}
