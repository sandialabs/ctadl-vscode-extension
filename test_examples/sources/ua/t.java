package ua;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final qa.b<Element> f18012a;

    public t(qa.b bVar) {
        this.f18012a = bVar;
    }

    @Override // qa.b, qa.e, qa.a
    public abstract sa.e a();

    @Override // qa.e
    public void b(ta.d dVar, Collection collection) {
        v7.g.f(dVar, "encoder");
        int i10 = i(collection);
        sa.e a10 = a();
        ta.b j02 = dVar.j0(a10);
        Iterator<Element> h10 = h(collection);
        for (int i11 = 0; i11 < i10; i11++) {
            j02.g0(a(), i11, this.f18012a, h10.next());
        }
        j02.a(a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ua.a
    public void k(ta.a aVar, int i10, Builder builder, boolean z10) {
        n(builder, i10, aVar.A(a(), i10, this.f18012a, null));
    }

    public abstract void n(Builder builder, int i10, Element element);
}
