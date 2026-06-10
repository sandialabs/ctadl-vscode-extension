package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import c8.j;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import l8.d;
import l8.z;
import r9.f;
import u7.l;
import v7.g;
import v7.i;
import x9.e;
import x9.h;

/* loaded from: classes.dex */
public final class StaticScopeForKotlinEnum extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f14742e = {i.c(new PropertyReference1Impl(i.a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), i.c(new PropertyReference1Impl(i.a(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final l8.b f14743b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final e f14744d;

    public StaticScopeForKotlinEnum(h hVar, l8.b bVar) {
        g.f(hVar, "storageManager");
        g.f(bVar, "containingClass");
        this.f14743b = bVar;
        bVar.h();
        this.c = hVar.a(new StaticScopeForKotlinEnum$functions$2(this));
        this.f14744d = hVar.a(new StaticScopeForKotlinEnum$properties$2(this));
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        j<Object> jVar = f14742e[0];
        fa.c cVar = new fa.c();
        for (Object obj : (List) m0.b.u0(this.c, jVar)) {
            if (g.a(((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName(), eVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        j<Object> jVar = f14742e[1];
        fa.c cVar = new fa.c();
        for (Object obj : (List) m0.b.u0(this.f14744d, jVar)) {
            if (g.a(((z) obj).getName(), eVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return null;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection f(r9.c cVar, l lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        j<Object>[] jVarArr = f14742e;
        j<Object> jVar = jVarArr[0];
        return kotlin.collections.c.z2((List) m0.b.u0(this.f14744d, jVarArr[1]), (List) m0.b.u0(this.c, jVar));
    }
}
