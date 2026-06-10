package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O extends T implements InterfaceC0348e2 {

    /* renamed from: b  reason: collision with root package name */
    final InterfaceC0293n f12360b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(InterfaceC0293n interfaceC0293n, boolean z10) {
        super(z10);
        this.f12360b = interfaceC0293n;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.f12360b.accept(d5);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.InterfaceC0348e2
    public final /* synthetic */ void q(Double d5) {
        AbstractC0421w0.q0(this, d5);
    }
}
