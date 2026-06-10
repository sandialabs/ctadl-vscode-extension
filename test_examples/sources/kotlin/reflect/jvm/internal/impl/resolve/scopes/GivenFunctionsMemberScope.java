package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import c8.j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import l8.z;
import r9.f;
import u7.l;
import v7.g;
import v7.i;
import x9.e;
import x9.h;

/* loaded from: classes.dex */
public abstract class GivenFunctionsMemberScope extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f14732d = {i.c(new PropertyReference1Impl(i.a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final l8.b f14733b;
    public final e c;

    public GivenFunctionsMemberScope(h hVar, l8.b bVar) {
        g.f(hVar, "storageManager");
        g.f(bVar, "containingClass");
        this.f14733b = bVar;
        this.c = hVar.a(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        j<Object> jVar = f14732d[0];
        fa.c cVar = new fa.c();
        for (Object obj : (List) m0.b.u0(this.c, jVar)) {
            if ((obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) && g.a(((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName(), eVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        j<Object> jVar = f14732d[0];
        fa.c cVar = new fa.c();
        for (Object obj : (List) m0.b.u0(this.c, jVar)) {
            if ((obj instanceof z) && g.a(((z) obj).getName(), eVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<l8.f> f(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        if (!cVar.a(r9.c.n.f17189b)) {
            return EmptyList.f12981i;
        }
        return (List) m0.b.u0(this.c, f14732d[0]);
    }

    public abstract List<kotlin.reflect.jvm.internal.impl.descriptors.e> h();
}
