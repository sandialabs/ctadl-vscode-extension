package r9;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public abstract class a implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return i().a(eVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return i().b(eVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        return i().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        return i().d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return i().e(eVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public Collection<l8.f> f(c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        return i().f(cVar, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        return i().g();
    }

    public final MemberScope h() {
        if (i() instanceof a) {
            MemberScope i10 = i();
            g.d(i10, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((a) i10).h();
        }
        return i();
    }

    public abstract MemberScope i();
}
