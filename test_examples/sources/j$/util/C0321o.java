package j$.util;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0321o implements InterfaceC0293n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f12281a;

    public /* synthetic */ C0321o(Consumer consumer) {
        this.f12281a = consumer;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.f12281a.accept(Double.valueOf(d5));
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }
}
