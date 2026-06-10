package j$.util.function;

/* renamed from: j$.util.function.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0287k implements InterfaceC0293n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0293n f12247a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0293n f12248b;

    public /* synthetic */ C0287k(InterfaceC0293n interfaceC0293n, InterfaceC0293n interfaceC0293n2) {
        this.f12247a = interfaceC0293n;
        this.f12248b = interfaceC0293n2;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        j$.time.a.c(this.f12247a, this.f12248b, d5);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }
}
