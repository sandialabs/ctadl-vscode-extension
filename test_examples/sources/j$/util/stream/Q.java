package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.InterfaceC0278f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Q extends T implements InterfaceC0358g2 {

    /* renamed from: b  reason: collision with root package name */
    final InterfaceC0278f0 f12369b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(InterfaceC0278f0 interfaceC0278f0, boolean z10) {
        super(z10);
        this.f12369b = interfaceC0278f0;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        this.f12369b.accept(j2);
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
