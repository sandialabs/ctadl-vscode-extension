package m8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import u7.l;
import y9.k0;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: i  reason: collision with root package name */
    public final e f16016i;

    /* renamed from: j  reason: collision with root package name */
    public final l<h9.c, Boolean> f16017j;

    public g(e eVar, k0 k0Var) {
        this.f16016i = eVar;
        this.f16017j = k0Var;
    }

    @Override // m8.e
    public final boolean i(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        if (this.f16017j.U(cVar).booleanValue()) {
            return this.f16016i.i(cVar);
        }
        return false;
    }

    @Override // m8.e
    public final boolean isEmpty() {
        boolean z10;
        e<c> eVar = this.f16016i;
        if ((eVar instanceof Collection) && ((Collection) eVar).isEmpty()) {
            return false;
        }
        for (c cVar : eVar) {
            h9.c e10 = cVar.e();
            if (e10 != null && this.f16017j.U(e10).booleanValue()) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f16016i) {
            h9.c e10 = cVar.e();
            if (e10 != null && this.f16017j.U(e10).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // m8.e
    public final c j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        if (this.f16017j.U(cVar).booleanValue()) {
            return this.f16016i.j(cVar);
        }
        return null;
    }
}
