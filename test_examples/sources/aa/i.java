package aa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import u7.l;

/* loaded from: classes.dex */
public final class i extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ErrorScopeKind errorScopeKind, String... strArr) {
        super(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        v7.g.f(strArr, "formatParams");
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        h(eVar, noLookupLocation);
        throw null;
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        i(eVar, noLookupLocation);
        throw null;
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        throw new IllegalStateException();
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        throw new IllegalStateException();
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        throw new IllegalStateException(this.f396b + ", required name: " + eVar);
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<l8.f> f(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        throw new IllegalStateException(this.f396b);
    }

    @Override // aa.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        throw new IllegalStateException();
    }

    @Override // aa.e
    public final Set h(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        throw new IllegalStateException(this.f396b + ", required name: " + eVar);
    }

    @Override // aa.e
    public final Set i(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        throw new IllegalStateException(this.f396b + ", required name: " + eVar);
    }

    @Override // aa.e
    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("ThrowingScope{"), this.f396b, '}');
    }
}
