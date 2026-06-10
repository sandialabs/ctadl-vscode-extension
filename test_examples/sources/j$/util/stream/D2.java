package j$.util.stream;

import j$.util.AbstractC0261c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class D2 extends AbstractC0419v2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f12300d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D2(InterfaceC0363h2 interfaceC0363h2, Comparator comparator) {
        super(interfaceC0363h2, comparator);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f12300d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        AbstractC0261c.s(this.f12300d, this.f12560b);
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        interfaceC0363h2.g(this.f12300d.size());
        if (this.c) {
            Iterator it = this.f12300d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC0363h2.i()) {
                    break;
                }
                interfaceC0363h2.accept(next);
            }
        } else {
            ArrayList arrayList = this.f12300d;
            interfaceC0363h2.getClass();
            AbstractC0261c.q(arrayList, new C0325a(3, interfaceC0363h2));
        }
        interfaceC0363h2.end();
        this.f12300d = null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12300d = j2 >= 0 ? new ArrayList((int) j2) : new ArrayList();
    }
}
