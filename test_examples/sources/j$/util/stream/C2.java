package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class C2 extends X1 {

    /* renamed from: s  reason: collision with root package name */
    private final boolean f12296s;

    /* renamed from: t  reason: collision with root package name */
    private final Comparator f12297t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(AbstractC0335c abstractC0335c) {
        super(abstractC0335c, V2.f12408q | V2.f12406o);
        this.f12296s = true;
        this.f12297t = AbstractC0261c.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2(AbstractC0335c abstractC0335c, Comparator comparator) {
        super(abstractC0335c, V2.f12408q | V2.f12407p);
        this.f12296s = false;
        comparator.getClass();
        this.f12297t = comparator;
    }

    @Override // j$.util.stream.AbstractC0335c
    public final F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        if (V2.SORTED.i(abstractC0335c.g1()) && this.f12296s) {
            return abstractC0335c.y1(spliterator, false, intFunction);
        }
        Object[] p10 = abstractC0335c.y1(spliterator, true, intFunction).p(intFunction);
        Arrays.sort(p10, this.f12297t);
        return new I0(p10);
    }

    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        if (V2.SORTED.i(i10) && this.f12296s) {
            return interfaceC0363h2;
        }
        boolean i11 = V2.SIZED.i(i10);
        Comparator comparator = this.f12297t;
        return i11 ? new H2(interfaceC0363h2, comparator) : new D2(interfaceC0363h2, comparator);
    }
}
