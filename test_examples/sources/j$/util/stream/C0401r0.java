package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0304t;

/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0401r0 extends AbstractC0405s0 implements InterfaceC0348e2 {
    final /* synthetic */ EnumC0409t0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0304t f12523d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401r0(InterfaceC0304t interfaceC0304t, EnumC0409t0 enumC0409t0) {
        super(enumC0409t0);
        this.c = enumC0409t0;
        this.f12523d = interfaceC0304t;
    }

    @Override // j$.util.stream.AbstractC0405s0, j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        boolean z10;
        boolean z11;
        if (this.f12537a) {
            return;
        }
        boolean e10 = ((j$.util.function.r) this.f12523d).e(d5);
        EnumC0409t0 enumC0409t0 = this.c;
        z10 = enumC0409t0.f12542a;
        if (e10 == z10) {
            this.f12537a = true;
            z11 = enumC0409t0.f12543b;
            this.f12538b = z11;
        }
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
