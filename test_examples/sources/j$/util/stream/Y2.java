package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* loaded from: classes2.dex */
final class Y2 extends AbstractC0334b3 implements InterfaceC0293n {
    final double[] c = new double[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0334b3
    public final void a(Object obj, long j2) {
        InterfaceC0293n interfaceC0293n = (InterfaceC0293n) obj;
        for (int i10 = 0; i10 < j2; i10++) {
            interfaceC0293n.accept(this.c[i10]);
        }
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12438b;
        this.f12438b = i10 + 1;
        this.c[i10] = d5;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }
}
