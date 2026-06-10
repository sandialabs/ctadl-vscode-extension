package j$.util;

import j$.util.function.C0279g;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements N {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f12080a;

    private /* synthetic */ L(Spliterator.OfPrimitive ofPrimitive) {
        this.f12080a = ofPrimitive;
    }

    public static /* synthetic */ N e(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof M ? ((M) ofPrimitive).f12081a : ofPrimitive instanceof Spliterator.OfDouble ? C.e((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? F.e((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? I.e((Spliterator.OfLong) ofPrimitive) : new L(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f12080a.tryAdvance(C0279g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12080a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof L) {
            obj = ((L) obj).f12080a;
        }
        return this.f12080a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12080a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12080a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12080a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12080a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12080a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12080a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12080a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12080a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return e(this.f12080a.trySplit());
    }

    @Override // j$.util.N, j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.e(this.f12080a.trySplit());
    }
}
