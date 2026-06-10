package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class N2 extends P2 implements j$.util.K {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ O2 f12359g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(O2 o22, int i10, int i11, int i12, int i13) {
        super(o22, i10, i11, i12, i13);
        this.f12359g = o22;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void e(int i10, Object obj, Object obj2) {
        ((InterfaceC0278f0) obj2).accept(((long[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.N g(Object obj, int i10, int i11) {
        return j$.util.d0.l((long[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.P2
    final j$.util.N h(int i10, int i11, int i12, int i13) {
        return new N2(this.f12359g, i10, i11, i12, i13);
    }
}
