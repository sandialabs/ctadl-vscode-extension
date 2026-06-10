package jb;

import c8.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<Object> f12820a;

    public a() {
        this(0);
    }

    public /* synthetic */ a(int i10) {
        this(new ArrayList());
    }

    public a(List<Object> list) {
        g.f(list, "_values");
        this.f12820a = list;
    }

    public final <T> T a(int i10) {
        return (T) this.f12820a.get(i10);
    }

    public final <T> T b(b<?> bVar) {
        T t10;
        g.f(bVar, "clazz");
        Iterator<T> it = this.f12820a.iterator();
        do {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (bVar.c(next)) {
                t10 = next;
                continue;
            }
        } while (t10 == null);
        return t10;
    }

    public final String toString() {
        return g.k(c.L2(this.f12820a), "DefinitionParameters");
    }
}
