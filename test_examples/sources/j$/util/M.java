package j$.util;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ N f12081a;

    private /* synthetic */ M(N n) {
        this.f12081a = n;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(N n) {
        if (n == null) {
            return null;
        }
        return n instanceof L ? ((L) n).f12080a : n instanceof E ? D.a((E) n) : n instanceof H ? G.a((H) n) : n instanceof K ? J.a((K) n) : new M(n);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12081a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N n = this.f12081a;
        if (obj instanceof M) {
            obj = ((M) obj).f12081a;
        }
        return n.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12081a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12081a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12081a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12081a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12081a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12081a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12081a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12081a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f12081a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f12081a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f12081a.trySplit());
    }
}
