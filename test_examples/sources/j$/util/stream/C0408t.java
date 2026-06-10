package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0408t implements InterfaceC0293n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12540a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0363h2 f12541b;

    public /* synthetic */ C0408t(int i10, InterfaceC0363h2 interfaceC0363h2) {
        this.f12540a = i10;
        this.f12541b = interfaceC0363h2;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12540a;
        InterfaceC0363h2 interfaceC0363h2 = this.f12541b;
        switch (i10) {
            case 0:
                interfaceC0363h2.accept(d5);
                return;
            default:
                ((C0412u) interfaceC0363h2).f12433a.accept(d5);
                return;
        }
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        switch (this.f12540a) {
            case 0:
                interfaceC0293n.getClass();
                return new C0287k(this, interfaceC0293n);
            default:
                interfaceC0293n.getClass();
                return new C0287k(this, interfaceC0293n);
        }
    }
}
