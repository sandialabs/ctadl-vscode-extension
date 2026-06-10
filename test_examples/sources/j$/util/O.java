package j$.util;

import j$.util.Spliterator;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f12082a;

    private /* synthetic */ O(java.util.Spliterator spliterator) {
        this.f12082a = spliterator;
    }

    public static /* synthetic */ Spliterator e(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? L.e((Spliterator.OfPrimitive) spliterator) : new O(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f12082a.tryAdvance(C0279g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12082a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof O) {
            obj = ((O) obj).f12082a;
        }
        return this.f12082a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12082a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12082a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12082a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12082a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12082a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12082a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return e(this.f12082a.trySplit());
    }
}
