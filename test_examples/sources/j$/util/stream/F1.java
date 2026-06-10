package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0277f;

/* loaded from: classes2.dex */
final class F1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ InterfaceC0277f f12308h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f12309i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ j$.util.function.K0 f12310j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ InterfaceC0381m f12311k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(W2 w22, InterfaceC0277f interfaceC0277f, BiConsumer biConsumer, j$.util.function.K0 k02, InterfaceC0381m interfaceC0381m) {
        super(w22);
        this.f12308h = interfaceC0277f;
        this.f12309i = biConsumer;
        this.f12310j = k02;
        this.f12311k = interfaceC0381m;
    }

    @Override // j$.util.stream.AbstractC0421w0, j$.util.stream.E3
    public final int P() {
        if (((C0373k) this.f12311k).b().contains(EnumC0369j.UNORDERED)) {
            return V2.f12409r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        return new G1(this.f12310j, this.f12309i, this.f12308h);
    }
}
