package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.g;
import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import l8.f;
import l8.z;
import n7.l;
import n7.n;
import o8.g0;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f13824p = 0;
    public final g n;

    /* renamed from: o  reason: collision with root package name */
    public final w8.c f13825o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x8.c cVar, g gVar, w8.c cVar2) {
        super(cVar);
        v7.g.f(gVar, "jClass");
        v7.g.f(cVar2, "ownerDescriptor");
        this.n = gVar;
        this.f13825o = cVar2;
    }

    public static z v(z zVar) {
        boolean z10;
        CallableMemberDescriptor.Kind h10 = zVar.h();
        h10.getClass();
        if (h10 != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return zVar;
        }
        Collection<? extends z> f10 = zVar.f();
        v7.g.e(f10, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(l.Z1(f10, 10));
        for (z zVar2 : f10) {
            v7.g.e(zVar2, "it");
            arrayList.add(v(zVar2));
        }
        return (z) kotlin.collections.c.C2(kotlin.collections.c.L2(kotlin.collections.c.P2(arrayList)));
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set<e> h(r9.c cVar, u7.l<? super e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set<e> i(r9.c cVar, u7.l<? super e, Boolean> lVar) {
        Set<e> set;
        v7.g.f(cVar, "kindFilter");
        Set<e> P2 = kotlin.collections.c.P2(this.f13787e.k0().a());
        w8.c cVar2 = this.f13825o;
        c D0 = a1.c.D0(cVar2);
        if (D0 != null) {
            set = D0.c();
        } else {
            set = null;
        }
        if (set == null) {
            set = EmptySet.f12983i;
        }
        P2.addAll(set);
        if (this.n.p()) {
            P2.addAll(a1.c.O0(kotlin.reflect.jvm.internal.impl.builtins.g.c, kotlin.reflect.jvm.internal.impl.builtins.g.f13345a));
        }
        x8.c cVar3 = this.f13785b;
        P2.addAll(cVar3.f18762a.f18760x.e(cVar3, cVar2));
        return P2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, e eVar) {
        v7.g.f(eVar, "name");
        x8.c cVar = this.f13785b;
        cVar.f18762a.f18760x.a(cVar, this.f13825o, eVar, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final a k() {
        return new ClassDeclaredMemberIndex(this.n, LazyJavaStaticClassScope$computeMemberIndex$1.f13818j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, e eVar) {
        Collection Q2;
        g0 g10;
        v7.g.f(eVar, "name");
        w8.c cVar = this.f13825o;
        c D0 = a1.c.D0(cVar);
        if (D0 == null) {
            Q2 = EmptySet.f12983i;
        } else {
            Q2 = kotlin.collections.c.Q2(D0.a(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        Collection collection = Q2;
        w8.c cVar2 = this.f13825o;
        x8.a aVar = this.f13785b.f18762a;
        linkedHashSet.addAll(v8.b.E(eVar, collection, linkedHashSet, cVar2, aVar.f18743f, aVar.f18757u.a()));
        if (this.n.p()) {
            if (v7.g.a(eVar, kotlin.reflect.jvm.internal.impl.builtins.g.c)) {
                g10 = k9.c.f(cVar);
            } else if (v7.g.a(eVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13345a)) {
                g10 = k9.c.g(cVar);
            } else {
                return;
            }
            linkedHashSet.add(g10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, e eVar) {
        v7.g.f(eVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 lazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 = new LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(eVar);
        w8.c cVar = this.f13825o;
        fa.b.b(a1.c.N0(cVar), b.f13823b, new y8.a(cVar, linkedHashSet, lazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1));
        boolean z10 = !arrayList.isEmpty();
        x8.c cVar2 = this.f13785b;
        if (z10) {
            w8.c cVar3 = this.f13825o;
            x8.a aVar = cVar2.f18762a;
            arrayList.addAll(v8.b.E(eVar, linkedHashSet, arrayList, cVar3, aVar.f18743f, aVar.f18757u.a()));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                z v3 = v((z) obj);
                Object obj2 = linkedHashMap.get(v3);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v3, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection collection = (Collection) entry.getValue();
                w8.c cVar4 = this.f13825o;
                x8.a aVar2 = cVar2.f18762a;
                n.f2(v8.b.E(eVar, collection, arrayList, cVar4, aVar2.f18743f, aVar2.f18757u.a()), arrayList2);
            }
            arrayList.addAll(arrayList2);
        }
        if (this.n.p() && v7.g.a(eVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13346b)) {
            m0.b.u(arrayList, k9.c.e(cVar));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(r9.c cVar) {
        v7.g.f(cVar, "kindFilter");
        Set P2 = kotlin.collections.c.P2(this.f13787e.k0().f());
        LazyJavaStaticClassScope$computePropertyNames$1$1 lazyJavaStaticClassScope$computePropertyNames$1$1 = LazyJavaStaticClassScope$computePropertyNames$1$1.f13820j;
        w8.c cVar2 = this.f13825o;
        fa.b.b(a1.c.N0(cVar2), b.f13823b, new y8.a(cVar2, P2, lazyJavaStaticClassScope$computePropertyNames$1$1));
        if (this.n.p()) {
            P2.add(kotlin.reflect.jvm.internal.impl.builtins.g.f13346b);
        }
        return P2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final f q() {
        return this.f13825o;
    }
}
