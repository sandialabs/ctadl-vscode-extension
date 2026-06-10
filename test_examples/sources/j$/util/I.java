package j$.util;

import j$.util.function.C0276e0;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements K {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f12078a;

    private /* synthetic */ I(Spliterator.OfLong ofLong) {
        this.f12078a = ofLong;
    }

    public static /* synthetic */ K e(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof J ? ((J) ofLong).f12079a : new I(ofLong);
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return this.f12078a.tryAdvance(C0279g.a(consumer));
    }

    @Override // j$.util.K
    public final /* synthetic */ void b(InterfaceC0278f0 interfaceC0278f0) {
        this.f12078a.forEachRemaining(C0276e0.a(interfaceC0278f0));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12078a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof I) {
            obj = ((I) obj).f12078a;
        }
        return this.f12078a.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12078a.estimateSize();
    }

    @Override // j$.util.K
    public final /* synthetic */ boolean f(InterfaceC0278f0 interfaceC0278f0) {
        return this.f12078a.tryAdvance(C0276e0.a(interfaceC0278f0));
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12078a.forEachRemaining(C0279g.a(consumer));
    }

    @Override // j$.util.N
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12078a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12078a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12078a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f12078a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12078a.hashCode();
    }

    @Override // j$.util.N
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12078a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ K trySplit() {
        return e(this.f12078a.trySplit());
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ N trySplit() {
        return L.e(this.f12078a.trySplit());
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return O.e(this.f12078a.trySplit());
    }
}
