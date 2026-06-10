package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.d;
import l8.f;
import l8.f0;
import m7.e;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class SubstitutingScope implements MemberScope {

    /* renamed from: b  reason: collision with root package name */
    public final MemberScope f14747b;
    public final TypeSubstitutor c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap f14748d;

    /* renamed from: e  reason: collision with root package name */
    public final e f14749e;

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        g.f(memberScope, "workerScope");
        g.f(typeSubstitutor, "givenSubstitutor");
        this.f14747b = memberScope;
        kotlin.a.b(new SubstitutingScope$substitutor$2(typeSubstitutor));
        q g10 = typeSubstitutor.g();
        g.e(g10, "givenSubstitutor.substitution");
        this.c = TypeSubstitutor.d(CapturedTypeConstructorKt.b(g10));
        this.f14749e = kotlin.a.b(new SubstitutingScope$_allDescriptors$2(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return h(this.f14747b.a(eVar, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        return h(this.f14747b.b(eVar, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        return this.f14747b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        return this.f14747b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        d e10 = this.f14747b.e(eVar, noLookupLocation);
        if (e10 != null) {
            return (d) i(e10);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<f> f(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        return (Collection) this.f14749e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        return this.f14747b.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends f> Collection<D> h(Collection<? extends D> collection) {
        if (this.c.h()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i10 = 3;
        if (size >= 3) {
            i10 = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((f) it.next()));
        }
        return linkedHashSet;
    }

    public final <D extends f> D i(D d5) {
        TypeSubstitutor typeSubstitutor = this.c;
        if (typeSubstitutor.h()) {
            return d5;
        }
        if (this.f14748d == null) {
            this.f14748d = new HashMap();
        }
        HashMap hashMap = this.f14748d;
        g.c(hashMap);
        Object obj = hashMap.get(d5);
        if (obj == null) {
            if (!(d5 instanceof f0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d5).toString());
            }
            obj = ((f0) d5).d(typeSubstitutor);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d5 + " substitution fails");
            }
            hashMap.put(d5, obj);
        }
        return (D) obj;
    }
}
