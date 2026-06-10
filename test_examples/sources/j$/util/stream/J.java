package j$.util.stream;

import j$.util.C0319m;

/* loaded from: classes2.dex */
final class J extends M implements InterfaceC0353f2 {
    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        q(Integer.valueOf(i10));
    }

    @Override // j$.util.function.K0
    public final Object get() {
        if (this.f12349a) {
            return C0319m.d(((Integer) this.f12350b).intValue());
        }
        return null;
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
