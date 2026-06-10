package aa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import u7.l;

/* loaded from: classes.dex */
public class e implements MemberScope {

    /* renamed from: b  reason: collision with root package name */
    public final String f396b;

    public e(ErrorScopeKind errorScopeKind, String... strArr) {
        v7.g.f(strArr, "formatParams");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(errorScopeKind.f15014i, Arrays.copyOf(copyOf, copyOf.length));
        v7.g.e(format, "format(this, *args)");
        this.f396b = format;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> c() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> d() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{eVar}, 1));
        v7.g.e(format, "format(this, *args)");
        return new a(h9.e.m(format));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public Collection<l8.f> f(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<h9.e> g() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: h */
    public Set a(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return a1.c.v1(new b(h.c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: i */
    public Set b(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return h.f409f;
    }

    public String toString() {
        return androidx.activity.e.j(new StringBuilder("ErrorScope{"), this.f396b, '}');
    }
}
