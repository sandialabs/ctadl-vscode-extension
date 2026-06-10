package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class B2 extends AbstractC0366i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B2(AbstractC0335c abstractC0335c) {
        super(abstractC0335c, V2.f12408q | V2.f12406o);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        if (V2.SORTED.i(abstractC0335c.g1())) {
            return abstractC0335c.y1(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((D0) abstractC0335c.y1(spliterator, true, intFunction)).b();
        Arrays.sort(jArr);
        return new C0375k1(jArr);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        return V2.SORTED.i(i10) ? interfaceC0363h2 : V2.SIZED.i(i10) ? new G2(interfaceC0363h2) : new C0431y2(interfaceC0363h2);
    }
}
