package ua;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<Element, Collection, Builder> implements qa.b<Collection> {
    @Override // qa.a
    public Collection e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return (Collection) j(cVar);
    }

    public abstract Builder f();

    public abstract int g(Builder builder);

    public abstract Iterator<Element> h(Collection collection);

    public abstract int i(Collection collection);

    public final Object j(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        Builder f10 = f();
        int g10 = g(f10);
        ta.a b5 = cVar.b(a());
        b5.C();
        while (true) {
            int t10 = b5.t(a());
            if (t10 != -1) {
                k(b5, t10 + g10, f10, true);
            } else {
                b5.a(a());
                return m(f10);
            }
        }
    }

    public abstract void k(ta.a aVar, int i10, Builder builder, boolean z10);

    public abstract Builder l(Collection collection);

    public abstract Collection m(Builder builder);
}
