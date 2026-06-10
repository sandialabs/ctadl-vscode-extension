package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends X1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    static J0 P1(AbstractC0335c abstractC0335c, Spliterator spliterator) {
        S1 s12 = new S1(11);
        S1 s13 = new S1(12);
        return new J0((Collection) new C0422w1(W2.REFERENCE, new S1(13), s13, s12, 3).y(abstractC0335c, spliterator));
    }

    @Override // j$.util.stream.AbstractC0335c
    final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        if (V2.DISTINCT.i(abstractC0335c.g1())) {
            return abstractC0335c.y1(spliterator, false, intFunction);
        }
        if (V2.ORDERED.i(abstractC0335c.g1())) {
            return P1(abstractC0335c, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new S(new C0389o(0, atomicBoolean, concurrentHashMap), false).y(abstractC0335c, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new J0(keySet);
    }

    @Override // j$.util.stream.AbstractC0335c
    final Spliterator I1(AbstractC0335c abstractC0335c, Spliterator spliterator) {
        return V2.DISTINCT.i(abstractC0335c.g1()) ? abstractC0335c.O1(spliterator) : V2.ORDERED.i(abstractC0335c.g1()) ? P1(abstractC0335c, spliterator).spliterator() : new C0349e3(abstractC0335c.O1(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        return V2.DISTINCT.i(i10) ? interfaceC0363h2 : V2.SORTED.i(i10) ? new C0393p(interfaceC0363h2) : new C0397q(this, interfaceC0363h2);
    }
}
