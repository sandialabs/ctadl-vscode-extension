package c9;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import m8.e;
import n7.q;

/* loaded from: classes.dex */
public final class b implements m8.e {

    /* renamed from: i  reason: collision with root package name */
    public final h9.c f6565i;

    public b(h9.c cVar) {
        this.f6565i = cVar;
    }

    @Override // m8.e
    public final boolean i(h9.c cVar) {
        return e.b.b(this, cVar);
    }

    @Override // m8.e
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<m8.c> iterator() {
        EmptyList.f12981i.getClass();
        return q.f16127i;
    }

    @Override // m8.e
    public final m8.c j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        if (v7.g.a(cVar, this.f6565i)) {
            return a.f6564a;
        }
        return null;
    }
}
