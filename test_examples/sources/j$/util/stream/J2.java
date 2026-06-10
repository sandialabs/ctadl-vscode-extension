package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class J2 extends P2 implements j$.util.E {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ K2 f12341g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(K2 k22, int i10, int i11, int i12, int i13) {
        super(k22, i10, i11, i12, i13);
        this.f12341g = k22;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.stream.P2
    final void e(int i10, Object obj, Object obj2) {
        ((InterfaceC0293n) obj2).accept(((double[]) obj)[i10]);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
    }

    @Override // j$.util.stream.P2
    final j$.util.N g(Object obj, int i10, int i11) {
        return j$.util.d0.j((double[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.P2
    final j$.util.N h(int i10, int i11, int i12, int i13) {
        return new J2(this.f12341g, i10, i11, i12, i13);
    }
}
