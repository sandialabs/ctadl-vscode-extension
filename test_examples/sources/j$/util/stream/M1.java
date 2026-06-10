package j$.util.stream;

import j$.util.function.InterfaceC0270b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ InterfaceC0270b0 f12354h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ long f12355i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(W2 w22, InterfaceC0270b0 interfaceC0270b0, long j2) {
        super(w22);
        this.f12354h = interfaceC0270b0;
        this.f12355i = j2;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        return new N1(this.f12355i, this.f12354h);
    }
}
