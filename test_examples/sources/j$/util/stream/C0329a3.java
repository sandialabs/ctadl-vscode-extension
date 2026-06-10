package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.stream.a3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0329a3 extends AbstractC0334b3 implements InterfaceC0278f0 {
    final long[] c = new long[128];

    @Override // j$.util.stream.AbstractC0334b3
    public final void a(Object obj, long j2) {
        InterfaceC0278f0 interfaceC0278f0 = (InterfaceC0278f0) obj;
        for (int i10 = 0; i10 < j2; i10++) {
            interfaceC0278f0.accept(this.c[i10]);
        }
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        int i10 = this.f12438b;
        this.f12438b = i10 + 1;
        this.c[i10] = j2;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }
}
