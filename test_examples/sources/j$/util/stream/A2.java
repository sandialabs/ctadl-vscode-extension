package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class A2 extends AbstractC0331b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC0335c abstractC0335c) {
        super(abstractC0335c, V2.f12408q | V2.f12406o);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        if (V2.SORTED.i(abstractC0335c.g1())) {
            return abstractC0335c.y1(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((C0) abstractC0335c.y1(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C0332b1(iArr);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        return V2.SORTED.i(i10) ? interfaceC0363h2 : V2.SIZED.i(i10) ? new F2(interfaceC0363h2) : new C0427x2(interfaceC0363h2);
    }
}
