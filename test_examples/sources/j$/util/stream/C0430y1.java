package j$.util.stream;

import j$.util.function.InterfaceC0285j;

/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0430y1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ InterfaceC0285j f12581h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ double f12582i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430y1(W2 w22, InterfaceC0285j interfaceC0285j, double d5) {
        super(w22);
        this.f12581h = interfaceC0285j;
        this.f12582i = d5;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        return new C0434z1(this.f12582i, this.f12581h);
    }
}
