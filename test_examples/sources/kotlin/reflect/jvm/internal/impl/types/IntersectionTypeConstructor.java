package kotlin.reflect.jvm.internal.impl.types;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import l8.i0;
import y9.e0;
import y9.v;

/* loaded from: classes.dex */
public final class IntersectionTypeConstructor implements e0, ba.e {

    /* renamed from: a  reason: collision with root package name */
    public final y9.r f14941a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<y9.r> f14942b;
    public final int c;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f14943a;

        public a(u7.l lVar) {
            this.f14943a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            y9.r rVar = (y9.r) t10;
            v7.g.e(rVar, "it");
            u7.l lVar = this.f14943a;
            String obj = lVar.U(rVar).toString();
            y9.r rVar2 = (y9.r) t11;
            v7.g.e(rVar2, "it");
            return a1.c.g0(obj, lVar.U(rVar2).toString());
        }
    }

    public IntersectionTypeConstructor(AbstractCollection abstractCollection) {
        v7.g.f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet<y9.r> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.f14942b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public IntersectionTypeConstructor(LinkedHashSet linkedHashSet, y9.r rVar) {
        this(linkedHashSet);
        this.f14941a = rVar;
    }

    @Override // y9.e0
    public final boolean a() {
        return false;
    }

    @Override // y9.e0
    public final l8.d c() {
        return null;
    }

    @Override // y9.e0
    public final List<i0> e() {
        return EmptyList.f12981i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return v7.g.a(this.f14942b, ((IntersectionTypeConstructor) obj).f14942b);
        }
        return false;
    }

    @Override // y9.e0
    public final Collection<y9.r> f() {
        return this.f14942b;
    }

    public final v g() {
        l.f15045j.getClass();
        return KotlinTypeFactory.h(l.f15046k, this, EmptyList.f12981i, false, TypeIntersectionScope.a.a("member scope for intersection type", this.f14942b), new IntersectionTypeConstructor$createType$1(this));
    }

    public final String h(u7.l<? super y9.r, ? extends Object> lVar) {
        v7.g.f(lVar, "getProperTypeRelatedToStringify");
        return kotlin.collections.c.t2(kotlin.collections.c.G2(this.f14942b, new a(lVar)), " & ", "{", "}", new IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(lVar), 24);
    }

    public final int hashCode() {
        return this.c;
    }

    public final IntersectionTypeConstructor i(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        LinkedHashSet<y9.r> linkedHashSet = this.f14942b;
        ArrayList arrayList = new ArrayList(n7.l.Z1(linkedHashSet, 10));
        boolean z10 = false;
        for (y9.r rVar : linkedHashSet) {
            arrayList.add(rVar.W0(eVar));
            z10 = true;
        }
        y9.r rVar2 = null;
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        if (z10) {
            y9.r rVar3 = this.f14941a;
            if (rVar3 != null) {
                rVar2 = rVar3.W0(eVar);
            }
            intersectionTypeConstructor = new IntersectionTypeConstructor(new IntersectionTypeConstructor(arrayList).f14942b, rVar2);
        }
        if (intersectionTypeConstructor == null) {
            return this;
        }
        return intersectionTypeConstructor;
    }

    public final String toString() {
        return h(IntersectionTypeConstructor$makeDebugNameForIntersectionType$1.f14945j);
    }

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = this.f14942b.iterator().next().U0().u();
        v7.g.e(u10, "intersectedTypes.iterato…xt().constructor.builtIns");
        return u10;
    }
}
