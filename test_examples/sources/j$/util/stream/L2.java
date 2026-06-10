package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class L2 extends P2 implements j$.util.H {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ M2 f12348g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(M2 m22, int i10, int i11, int i12, int i13) {
        super(m22, i10, i11, i12, i13);
        this.f12348g = m22;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void e(int i10, Object obj, Object obj2) {
        ((j$.util.function.K) obj2).accept(((int[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.N g(Object obj, int i10, int i11) {
        return j$.util.d0.k((int[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.P2
    final j$.util.N h(int i10, int i11, int i12, int i13) {
        return new L2(this.f12348g, i10, i11, i12, i13);
    }
}
