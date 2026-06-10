package r9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.h0;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: b  reason: collision with root package name */
    public final MemberScope f17194b;

    public e(MemberScope memberScope) {
        g.f(memberScope, "workerScope");
        this.f17194b = memberScope;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        return this.f17194b.c();
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        return this.f17194b.d();
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        l8.d e10 = this.f17194b.e(eVar, noLookupLocation);
        if (e10 != null) {
            l8.b bVar = e10 instanceof l8.b ? (l8.b) e10 : null;
            if (bVar != null) {
                return bVar;
            }
            if (e10 instanceof h0) {
                return (h0) e10;
            }
            return null;
        }
        return null;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection f(c cVar, l lVar) {
        c cVar2;
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        int i10 = c.f17181l & cVar.f17189b;
        if (i10 == 0) {
            cVar2 = null;
        } else {
            cVar2 = new c(i10, cVar.f17188a);
        }
        if (cVar2 == null) {
            return EmptyList.f12981i;
        }
        Collection<l8.f> f10 = this.f17194b.f(cVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f10) {
            if (obj instanceof l8.e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        return this.f17194b.g();
    }

    public final String toString() {
        return "Classes from " + this.f17194b;
    }
}
