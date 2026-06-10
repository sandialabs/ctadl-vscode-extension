package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* renamed from: j$.util.stream.z2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0435z2 extends B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0435z2(AbstractC0335c abstractC0335c) {
        super(abstractC0335c, V2.f12408q | V2.f12406o);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        if (V2.SORTED.i(abstractC0335c.g1())) {
            return abstractC0335c.y1(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((B0) abstractC0335c.y1(spliterator, true, intFunction)).b();
        Arrays.sort(dArr);
        return new S0(dArr);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        return V2.SORTED.i(i10) ? interfaceC0363h2 : V2.SIZED.i(i10) ? new E2(interfaceC0363h2) : new C0423w2(interfaceC0363h2);
    }
}
