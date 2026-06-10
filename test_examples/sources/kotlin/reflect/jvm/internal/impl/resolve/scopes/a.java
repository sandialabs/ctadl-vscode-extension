package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import h9.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.d;
import l8.f;
import n7.i;
import n7.j;
import n7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a implements MemberScope {

    /* renamed from: b  reason: collision with root package name */
    public final String f14756b;
    public final MemberScope[] c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0166a {
        public static MemberScope a(String str, List list) {
            g.f(str, "debugName");
            g.f(list, "scopes");
            fa.c cVar = new fa.c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MemberScope memberScope = (MemberScope) it.next();
                if (memberScope != MemberScope.a.f14741b) {
                    if (memberScope instanceof a) {
                        MemberScope[] memberScopeArr = ((a) memberScope).c;
                        g.f(memberScopeArr, "elements");
                        cVar.addAll(i.Z1(memberScopeArr));
                    } else {
                        cVar.add(memberScope);
                    }
                }
            }
            int i10 = cVar.f11011i;
            if (i10 != 0) {
                if (i10 != 1) {
                    return new a(str, (MemberScope[]) cVar.toArray(new MemberScope[0]));
                }
                return (MemberScope) cVar.get(0);
            }
            return MemberScope.a.f14741b;
        }
    }

    public a(String str, MemberScope[] memberScopeArr) {
        this.f14756b = str;
        this.c = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (MemberScope memberScope : memberScopeArr) {
                    collection = ea.a.a(collection, memberScope.a(eVar, noLookupLocation));
                }
                if (collection == null) {
                    return EmptySet.f12983i;
                }
                return collection;
            }
            return memberScopeArr[0].a(eVar, noLookupLocation);
        }
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (MemberScope memberScope : memberScopeArr) {
                    collection = ea.a.a(collection, memberScope.b(eVar, noLookupLocation));
                }
                if (collection == null) {
                    return EmptySet.f12983i;
                }
                return collection;
            }
            return memberScopeArr[0].b(eVar, noLookupLocation);
        }
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<e> c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.c) {
            n.f2(memberScope.c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<e> d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.c) {
            n.f2(memberScope.d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final d e(e eVar, NoLookupLocation noLookupLocation) {
        g.f(eVar, "name");
        d dVar = null;
        for (MemberScope memberScope : this.c) {
            d e10 = memberScope.e(eVar, noLookupLocation);
            if (e10 != null) {
                if (!(e10 instanceof l8.e) || !((l8.e) e10).l0()) {
                    return e10;
                }
                if (dVar == null) {
                    dVar = e10;
                }
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection<f> f(r9.c cVar, l<? super e, Boolean> lVar) {
        g.f(cVar, "kindFilter");
        g.f(lVar, "nameFilter");
        MemberScope[] memberScopeArr = this.c;
        int length = memberScopeArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<f> collection = null;
                for (MemberScope memberScope : memberScopeArr) {
                    collection = ea.a.a(collection, memberScope.f(cVar, lVar));
                }
                if (collection == null) {
                    return EmptySet.f12983i;
                }
                return collection;
            }
            return memberScopeArr[0].f(cVar, lVar);
        }
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<e> g() {
        boolean z10;
        Iterable jVar;
        MemberScope[] memberScopeArr = this.c;
        g.f(memberScopeArr, "<this>");
        if (memberScopeArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jVar = EmptyList.f12981i;
        } else {
            jVar = new j(memberScopeArr);
        }
        return b.a(jVar);
    }

    public final String toString() {
        return this.f14756b;
    }
}
