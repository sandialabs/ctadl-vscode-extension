package j$.util.stream;

import j$.util.C0318l;
import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class I extends M implements InterfaceC0348e2 {
    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        q(Double.valueOf(d5));
    }

    @Override // j$.util.function.K0
    public final Object get() {
        if (this.f12349a) {
            return C0318l.d(((Double) this.f12350b).doubleValue());
        }
        return null;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }
}
