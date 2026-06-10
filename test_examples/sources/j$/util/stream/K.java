package j$.util.stream;

import j$.util.C0320n;
import j$.util.function.C0272c0;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
final class K extends M implements InterfaceC0358g2 {
    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        q(Long.valueOf(j2));
    }

    @Override // j$.util.function.K0
    public final Object get() {
        if (this.f12349a) {
            return C0320n.d(((Long) this.f12350b).longValue());
        }
        return null;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }
}
