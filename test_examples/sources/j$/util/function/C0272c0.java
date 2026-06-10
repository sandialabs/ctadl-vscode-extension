package j$.util.function;

/* renamed from: j$.util.function.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0272c0 implements InterfaceC0278f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278f0 f12235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278f0 f12236b;

    public /* synthetic */ C0272c0(InterfaceC0278f0 interfaceC0278f0, InterfaceC0278f0 interfaceC0278f02) {
        this.f12235a = interfaceC0278f0;
        this.f12236b = interfaceC0278f02;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        this.f12235a.accept(j2);
        this.f12236b.accept(j2);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }
}
