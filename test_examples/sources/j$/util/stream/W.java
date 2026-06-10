package j$.util.stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements j$.util.function.K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12418a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0363h2 f12419b;

    public /* synthetic */ W(int i10, InterfaceC0363h2 interfaceC0363h2) {
        this.f12418a = i10;
        this.f12419b = interfaceC0363h2;
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        int i11 = this.f12418a;
        InterfaceC0363h2 interfaceC0363h2 = this.f12419b;
        switch (i11) {
            case 0:
                interfaceC0363h2.accept(i10);
                return;
            default:
                ((X) interfaceC0363h2).f12437a.accept(i10);
                return;
        }
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        switch (this.f12418a) {
            case 0:
                k3.getClass();
                return new j$.util.function.H(this, k3);
            default:
                k3.getClass();
                return new j$.util.function.H(this, k3);
        }
    }
}
