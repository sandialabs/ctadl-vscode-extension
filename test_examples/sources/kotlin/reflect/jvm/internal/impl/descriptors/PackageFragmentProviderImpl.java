package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l8.u;
import l8.w;
import u7.l;

/* loaded from: classes.dex */
public final class PackageFragmentProviderImpl implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<u> f13454a;

    public PackageFragmentProviderImpl(ArrayList arrayList) {
        this.f13454a = arrayList;
    }

    @Override // l8.v
    public final List<u> a(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f13454a) {
            if (v7.g.a(((u) obj).e(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // l8.w
    public final void b(h9.c cVar, ArrayList arrayList) {
        v7.g.f(cVar, "fqName");
        for (Object obj : this.f13454a) {
            if (v7.g.a(((u) obj).e(), cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // l8.w
    public final boolean c(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        Collection<u> collection = this.f13454a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (u uVar : collection) {
            if (v7.g.a(uVar.e(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // l8.v
    public final Collection<h9.c> q(h9.c cVar, l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "fqName");
        v7.g.f(lVar, "nameFilter");
        return a1.c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.R0(kotlin.sequences.a.W0(kotlin.collections.c.g2(this.f13454a), PackageFragmentProviderImpl$getSubPackagesOf$1.f13455j), new PackageFragmentProviderImpl$getSubPackagesOf$2(cVar))));
    }
}
