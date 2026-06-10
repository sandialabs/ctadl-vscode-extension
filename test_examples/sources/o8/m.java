package o8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements l8.w {

    /* renamed from: a  reason: collision with root package name */
    public final List<l8.v> f16448a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16449b;

    public m(String str, List list) {
        v7.g.f(list, "providers");
        v7.g.f(str, "debugName");
        this.f16448a = list;
        this.f16449b = str;
        list.size();
        kotlin.collections.c.Q2(list).size();
    }

    @Override // l8.v
    public final List<l8.u> a(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (l8.v vVar : this.f16448a) {
            m0.b.F(vVar, cVar, arrayList);
        }
        return kotlin.collections.c.L2(arrayList);
    }

    @Override // l8.w
    public final void b(h9.c cVar, ArrayList arrayList) {
        v7.g.f(cVar, "fqName");
        for (l8.v vVar : this.f16448a) {
            m0.b.F(vVar, cVar, arrayList);
        }
    }

    @Override // l8.w
    public final boolean c(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        List<l8.v> list = this.f16448a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (l8.v vVar : list) {
            if (!m0.b.C0(vVar, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // l8.v
    public final Collection<h9.c> q(h9.c cVar, u7.l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "fqName");
        v7.g.f(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (l8.v vVar : this.f16448a) {
            hashSet.addAll(vVar.q(cVar, lVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f16449b;
    }
}
