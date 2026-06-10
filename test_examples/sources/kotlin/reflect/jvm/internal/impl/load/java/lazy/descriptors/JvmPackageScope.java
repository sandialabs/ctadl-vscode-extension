package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.t;
import c8.j;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.f;
import n7.n;
import u7.l;
import v7.g;
import v7.i;
import x9.e;

/* loaded from: classes.dex */
public final class JvmPackageScope implements MemberScope {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13709f = {i.c(new PropertyReference1Impl(i.a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b  reason: collision with root package name */
    public final x8.c f13710b;
    public final LazyJavaPackageFragment c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyJavaPackageScope f13711d;

    /* renamed from: e  reason: collision with root package name */
    public final e f13712e;

    public JvmPackageScope(x8.c cVar, t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        g.f(tVar, "jPackage");
        g.f(lazyJavaPackageFragment, "packageFragment");
        this.f13710b = cVar;
        this.c = lazyJavaPackageFragment;
        this.f13711d = new LazyJavaPackageScope(cVar, tVar, lazyJavaPackageFragment);
        this.f13712e = cVar.f18762a.f18739a.a(new JvmPackageScope$kotlinScopes$2(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        i(eVar, noLookupLocation);
        MemberScope[] h10 = h();
        Collection a10 = this.f13711d.a(eVar, noLookupLocation);
        for (MemberScope memberScope : h10) {
            a10 = ea.a.a(a10, memberScope.a(eVar, noLookupLocation));
        }
        if (a10 == null) {
            return EmptySet.f12983i;
        }
        return a10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        i(eVar, noLookupLocation);
        MemberScope[] h10 = h();
        this.f13711d.getClass();
        Collection collection = EmptyList.f12981i;
        for (MemberScope memberScope : h10) {
            collection = ea.a.a(collection, memberScope.b(eVar, noLookupLocation));
        }
        if (collection == null) {
            return EmptySet.f12983i;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        MemberScope[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : h10) {
            n.f2(memberScope.c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13711d.c());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        MemberScope[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : h10) {
            n.f2(memberScope.d(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13711d.d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        i(eVar, noLookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.f13711d;
        lazyJavaPackageScope.getClass();
        l8.d dVar = null;
        l8.b v3 = lazyJavaPackageScope.v(eVar, null);
        if (v3 != null) {
            return v3;
        }
        for (MemberScope memberScope : h()) {
            l8.d e10 = memberScope.e(eVar, noLookupLocation);
            if (e10 != null) {
                if ((e10 instanceof l8.e) && ((l8.e) e10).l0()) {
                    if (dVar == null) {
                        dVar = e10;
                    }
                } else {
                    return e10;
                }
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<f> f(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        MemberScope[] h10 = h();
        Collection<f> f10 = this.f13711d.f(cVar, lVar);
        for (MemberScope memberScope : h10) {
            f10 = ea.a.a(f10, memberScope.f(cVar, lVar));
        }
        if (f10 == null) {
            return EmptySet.f12983i;
        }
        return f10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        boolean z10;
        Iterable jVar;
        MemberScope[] h10 = h();
        g.f(h10, "<this>");
        if (h10.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jVar = EmptyList.f12981i;
        } else {
            jVar = new n7.j(h10);
        }
        HashSet a10 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.a(jVar);
        if (a10 != null) {
            a10.addAll(this.f13711d.g());
            return a10;
        }
        return null;
    }

    public final MemberScope[] h() {
        return (MemberScope[]) m0.b.u0(this.f13712e, f13709f[0]);
    }

    public final void i(h9.e eVar, t8.a aVar) {
        g.f(eVar, "name");
        s8.a.b(this.f13710b.f18762a.n, (NoLookupLocation) aVar, this.c, eVar);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
