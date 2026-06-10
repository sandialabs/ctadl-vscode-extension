package j$.util.stream;

/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0394p0 extends AbstractC0405s0 implements InterfaceC0353f2 {
    final /* synthetic */ EnumC0409t0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j$.util.function.O f12513d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0394p0(j$.util.function.O o10, EnumC0409t0 enumC0409t0) {
        super(enumC0409t0);
        this.c = enumC0409t0;
        this.f12513d = o10;
    }

    @Override // j$.util.stream.AbstractC0405s0, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        boolean z10;
        boolean z11;
        if (this.f12537a) {
            return;
        }
        boolean e10 = ((j$.util.function.M) this.f12513d).e(i10);
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
        h((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
