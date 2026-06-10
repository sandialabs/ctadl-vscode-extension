package r8;

import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u implements b9.w {
    public abstract Type T();

    public final boolean equals(Object obj) {
        return (obj instanceof u) && v7.g.a(T(), ((u) obj).T());
    }

    public final int hashCode() {
        return T().hashCode();
    }

    @Override // b9.d
    public b9.a j(h9.c cVar) {
        Object obj;
        v7.g.f(cVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            h9.b d5 = ((b9.a) next).d();
            if (v7.g.a(d5 != null ? d5.b() : null, cVar)) {
                obj = next;
                break;
            }
        }
        return (b9.a) obj;
    }

    public final String toString() {
        return getClass().getName() + ": " + T();
    }
}
