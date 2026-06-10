package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.C0286j0;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0290l0;

/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0398q0 extends AbstractC0405s0 implements InterfaceC0358g2 {
    final /* synthetic */ EnumC0409t0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InterfaceC0290l0 f12520d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398q0(InterfaceC0290l0 interfaceC0290l0, EnumC0409t0 enumC0409t0) {
        super(enumC0409t0);
        this.c = enumC0409t0;
        this.f12520d = interfaceC0290l0;
    }

    @Override // j$.util.stream.AbstractC0405s0, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        boolean z10;
        boolean z11;
        if (this.f12537a) {
            return;
        }
        boolean e10 = ((C0286j0) this.f12520d).e(j2);
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
        m((Long) obj);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
