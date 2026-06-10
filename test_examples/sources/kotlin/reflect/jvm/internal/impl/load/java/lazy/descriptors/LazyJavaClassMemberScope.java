package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.g;
import b9.n;
import b9.q;
import b9.v;
import d9.j;
import ha.i;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.d;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import l8.a0;
import l8.c0;
import l8.z;
import m8.e;
import o8.d0;
import o8.e0;
import o8.g0;
import u7.l;
import u8.p;
import u8.t;
import v8.f;
import v8.g;
import x9.e;
import x9.h;
import y9.m0;
import y9.r;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public final l8.b n;

    /* renamed from: o  reason: collision with root package name */
    public final g f13741o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f13742p;

    /* renamed from: q  reason: collision with root package name */
    public final e<List<kotlin.reflect.jvm.internal.impl.descriptors.b>> f13743q;

    /* renamed from: r  reason: collision with root package name */
    public final e<Set<h9.e>> f13744r;

    /* renamed from: s  reason: collision with root package name */
    public final e<Set<h9.e>> f13745s;

    /* renamed from: t  reason: collision with root package name */
    public final e<Map<h9.e, n>> f13746t;

    /* renamed from: u  reason: collision with root package name */
    public final x9.d<h9.e, l8.b> f13747u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(x8.c cVar, l8.b bVar, g gVar, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(cVar, lazyJavaClassMemberScope);
        v7.g.f(cVar, "c");
        v7.g.f(bVar, "ownerDescriptor");
        v7.g.f(gVar, "jClass");
        this.n = bVar;
        this.f13741o = gVar;
        this.f13742p = z10;
        x8.a aVar = cVar.f18762a;
        this.f13743q = aVar.f18739a.a(new LazyJavaClassMemberScope$constructors$1(cVar, this));
        LazyJavaClassMemberScope$nestedClassIndex$1 lazyJavaClassMemberScope$nestedClassIndex$1 = new LazyJavaClassMemberScope$nestedClassIndex$1(this);
        h hVar = aVar.f18739a;
        this.f13744r = hVar.a(lazyJavaClassMemberScope$nestedClassIndex$1);
        this.f13745s = hVar.a(new LazyJavaClassMemberScope$generatedNestedClassNames$1(cVar, this));
        this.f13746t = hVar.a(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.f13747u = hVar.h(new LazyJavaClassMemberScope$nestedClasses$1(cVar, this));
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.g C(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, AbstractCollection abstractCollection) {
        boolean z10;
        boolean z11 = true;
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
                if (!v7.g.a(gVar, gVar2) && gVar2.C() == null && F(gVar2, eVar)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            return gVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g build = gVar.v().j().build();
        v7.g.c(build);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kotlin.reflect.jvm.internal.impl.descriptors.g D(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        h9.c cVar;
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = gVar.m();
        v7.g.e(m10, "valueParameters");
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.w2(m10);
        if (hVar != null) {
            l8.d c = hVar.b().U0().c();
            if (c != null) {
                h9.d h10 = DescriptorUtilsKt.h(c);
                if (!h10.e()) {
                    h10 = null;
                }
                if (h10 != null) {
                    cVar = h10.h();
                    if (v7.g.a(cVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13349f)) {
                        hVar = null;
                    }
                    if (hVar == null) {
                        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v3 = gVar.v();
                        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m11 = gVar.m();
                        v7.g.e(m11, "valueParameters");
                        kotlin.reflect.jvm.internal.impl.descriptors.g build = v3.d(kotlin.collections.c.j2(m11)).m(hVar.b().S0().get(0).b()).build();
                        g0 g0Var = (g0) build;
                        if (g0Var != null) {
                            g0Var.D = true;
                        }
                        return build;
                    }
                }
            }
            cVar = null;
            if (v7.g.a(cVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13349f)) {
            }
            if (hVar == null) {
            }
        }
        return null;
    }

    public static boolean F(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f14687f.n(aVar2, aVar, true).c();
        v7.g.e(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !d.a.a(aVar2, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.e] */
    public static boolean G(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2) {
        boolean z10;
        int i10 = kotlin.reflect.jvm.internal.impl.load.java.b.f13657m;
        v7.g.f(gVar, "<this>");
        if (v7.g.a(gVar.getName().b(), "removeAt") && v7.g.a(j.b(gVar), SpecialGenericSignatures.f13639h.f13654b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            gVar2 = gVar2.a();
        }
        v7.g.e(gVar2, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(gVar2, gVar);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.g H(z zVar, String str, l lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        Iterator it = ((Iterable) lVar.U(h9.e.k(str))).iterator();
        do {
            gVar = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
            if (gVar2.m().size() != 0) {
                continue;
            } else {
                kotlin.reflect.jvm.internal.impl.types.checker.g gVar3 = kotlin.reflect.jvm.internal.impl.types.checker.d.f14997a;
                r k3 = gVar2.k();
                if (k3 == null ? false : gVar3.d(k3, zVar.b())) {
                    gVar = gVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (gVar == null);
        return gVar;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.g J(z zVar, l lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        r k3;
        String b5 = zVar.getName().b();
        v7.g.e(b5, "name.asString()");
        Iterator it = ((Iterable) lVar.U(h9.e.k(p.b(b5)))).iterator();
        do {
            gVar = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
            if (gVar2.m().size() == 1 && (k3 = gVar2.k()) != null) {
                h9.e eVar = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
                if (kotlin.reflect.jvm.internal.impl.builtins.e.E(k3, g.a.f13362d)) {
                    kotlin.reflect.jvm.internal.impl.types.checker.g gVar3 = kotlin.reflect.jvm.internal.impl.types.checker.d.f14997a;
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = gVar2.m();
                    v7.g.e(m10, "descriptor.valueParameters");
                    if (gVar3.c(((kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.C2(m10)).b(), zVar.b())) {
                        gVar = gVar2;
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } while (gVar == null);
        return gVar;
    }

    public static boolean M(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        String a10 = j.a(gVar, 2);
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = eVar.a();
        v7.g.e(a11, "builtinWithErasedParameters.original");
        return v7.g.a(a10, j.a(a11, 2)) && !F(gVar, eVar);
    }

    public static final ArrayList v(LazyJavaClassMemberScope lazyJavaClassMemberScope, h9.e eVar) {
        Collection<q> c = lazyJavaClassMemberScope.f13787e.k0().c(eVar);
        ArrayList arrayList = new ArrayList(n7.l.Z1(c, 10));
        for (q qVar : c) {
            arrayList.add(lazyJavaClassMemberScope.t(qVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r6.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList w(LazyJavaClassMemberScope lazyJavaClassMemberScope, h9.e eVar) {
        boolean z10;
        LinkedHashSet K = lazyJavaClassMemberScope.K(eVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = K.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) next;
            v7.g.f(gVar, "<this>");
            boolean z11 = true;
            if (SpecialBuiltinMembers.b(gVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && BuiltinMethodsWithSpecialGenericSignature.a(gVar) == null) {
                z11 = false;
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, fa.d dVar, l lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        e0 e0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            w8.d dVar2 = null;
            if (E(zVar, lVar)) {
                kotlin.reflect.jvm.internal.impl.descriptors.g I = I(zVar, lVar);
                v7.g.c(I);
                if (zVar.M()) {
                    gVar = J(zVar, lVar);
                    v7.g.c(gVar);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    gVar.p();
                    I.p();
                }
                w8.d dVar3 = new w8.d(this.n, I, gVar, zVar);
                r k3 = I.k();
                v7.g.c(k3);
                EmptyList emptyList = EmptyList.f12981i;
                dVar3.Y0(k3, emptyList, p(), null, emptyList);
                d0 i10 = k9.c.i(dVar3, I.getAnnotations(), false, I.j());
                i10.f16393t = I;
                i10.U0(dVar3.b());
                if (gVar != null) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = gVar.m();
                    v7.g.e(m10, "setterMethod.valueParameters");
                    kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.p2(m10);
                    if (hVar != null) {
                        e0Var = k9.c.j(dVar3, gVar.getAnnotations(), hVar.getAnnotations(), false, gVar.g(), gVar.j());
                        e0Var.f16393t = gVar;
                    } else {
                        throw new AssertionError("No parameter found for " + gVar);
                    }
                } else {
                    e0Var = null;
                }
                dVar3.W0(i10, e0Var, null, null);
                dVar2 = dVar3;
            }
            if (dVar2 != null) {
                abstractCollection.add(dVar2);
                if (dVar != null) {
                    dVar.add(zVar);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<r> B() {
        boolean z10 = this.f13742p;
        l8.b bVar = this.n;
        if (z10) {
            Collection<r> f10 = bVar.o().f();
            v7.g.e(f10, "ownerDescriptor.typeConstructor.supertypes");
            return f10;
        }
        return this.f13785b.f18762a.f18757u.b().O0(bVar);
    }

    public final boolean E(z zVar, l<? super h9.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        if (m0.b.G0(zVar)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g I = I(zVar, lVar);
        kotlin.reflect.jvm.internal.impl.descriptors.g J = J(zVar, lVar);
        if (I == null) {
            return false;
        }
        if (zVar.M()) {
            return J != null && J.p() == I.p();
        }
        return true;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g I(z zVar, l<? super h9.e, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        d0 s10 = zVar.s();
        a0 a0Var = s10 != null ? (a0) SpecialBuiltinMembers.b(s10) : null;
        String a10 = a0Var != null ? kotlin.reflect.jvm.internal.impl.load.java.c.a(a0Var) : null;
        if (a10 == null || SpecialBuiltinMembers.d(this.n, a0Var)) {
            String b5 = zVar.getName().b();
            v7.g.e(b5, "name.asString()");
            return H(zVar, p.a(b5), lVar);
        }
        return H(zVar, a10, lVar);
    }

    public final LinkedHashSet K(h9.e eVar) {
        Collection<r> B = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar : B) {
            n7.n.f2(rVar.w().a(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set<z> L(h9.e eVar) {
        Collection<r> B = B();
        ArrayList arrayList = new ArrayList();
        for (r rVar : B) {
            Collection<z> b5 = rVar.w().b(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(b5, 10));
            for (z zVar : b5) {
                arrayList2.add(zVar);
            }
            n7.n.f2(arrayList2, arrayList);
        }
        return kotlin.collections.c.Q2(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (ha.i.X0(r2, "set", false) == false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        boolean z10;
        Collection<h9.e> collection;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        h9.e name = gVar.getName();
        v7.g.e(name, "function.name");
        String b5 = name.b();
        v7.g.e(b5, "name.asString()");
        h9.c cVar = p.f17862a;
        if (!i.X0(b5, "get", false) && !i.X0(b5, "is", false)) {
            z10 = false;
            if (!z10) {
                h9.e X0 = m0.b.X0(name, "get", null, 12);
                if (X0 == null) {
                    X0 = m0.b.X0(name, "is", null, 8);
                }
                collection = a1.c.P0(X0);
            } else if (i.X0(b5, "set", false)) {
                collection = kotlin.collections.b.k2(new h9.e[]{m0.b.X0(name, "set", null, 4), m0.b.X0(name, "set", "is", 4)});
            } else {
                collection = (List) u8.c.f17842b.get(name);
                if (collection == null) {
                    collection = EmptyList.f12981i;
                }
            }
            if ((collection instanceof Collection) || !collection.isEmpty()) {
                for (h9.e eVar : collection) {
                    Set<z> L = L(eVar);
                    if (!(L instanceof Collection) || !L.isEmpty()) {
                        for (z zVar : L) {
                            if (E(zVar, new LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(gVar, this))) {
                                if (!zVar.M()) {
                                    String b10 = gVar.getName().b();
                                    v7.g.e(b10, "function.name.asString()");
                                }
                                z11 = true;
                                continue;
                                if (z11) {
                                    z12 = true;
                                    continue;
                                    break;
                                }
                            }
                            z11 = false;
                            continue;
                            if (z11) {
                            }
                        }
                    }
                    z12 = false;
                    continue;
                    if (z12) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            if (!z13) {
                return false;
            }
            SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f13633a;
            h9.e name2 = gVar.getName();
            v7.g.e(name2, "name");
            h9.e eVar2 = (h9.e) SpecialGenericSignatures.f13643l.get(name2);
            if (eVar2 != null) {
                LinkedHashSet K = K(eVar2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : K) {
                    kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj;
                    v7.g.f(gVar2, "<this>");
                    if (SpecialBuiltinMembers.b(gVar2) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v3 = gVar.v();
                    v3.p(eVar2);
                    v3.r();
                    v3.n();
                    kotlin.reflect.jvm.internal.impl.descriptors.g build = v3.build();
                    v7.g.c(build);
                    kotlin.reflect.jvm.internal.impl.descriptors.g gVar3 = build;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (G((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next(), gVar3)) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                }
            }
            z14 = false;
            if (z14) {
                return false;
            }
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
            h9.e name3 = gVar.getName();
            v7.g.e(name3, "name");
            if (BuiltinMethodsWithSpecialGenericSignature.b(name3)) {
                h9.e name4 = gVar.getName();
                v7.g.e(name4, "name");
                LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.g> K2 = K(name4);
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar4 : K2) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e a10 = BuiltinMethodsWithSpecialGenericSignature.a(gVar4);
                    if (a10 != null) {
                        arrayList2.add(a10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (M(gVar, (kotlin.reflect.jvm.internal.impl.descriptors.e) it2.next())) {
                            z16 = true;
                            break;
                        }
                    }
                }
            }
            z16 = false;
            if (z16) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.g D = D(gVar);
            if (D != null) {
                h9.e name5 = gVar.getName();
                v7.g.e(name5, "name");
                LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.g> K3 = K(name5);
                if (!K3.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar5 : K3) {
                        if (gVar5.r0() && F(D, gVar5)) {
                            z17 = true;
                            continue;
                        } else {
                            z17 = false;
                            continue;
                        }
                        if (z17) {
                            z18 = true;
                            break;
                        }
                    }
                }
            }
            z18 = false;
            if (z18) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (!z10) {
        }
        if (collection instanceof Collection) {
        }
        while (r0.hasNext()) {
        }
        z13 = false;
        if (!z13) {
        }
    }

    public final void O(h9.e eVar, t8.a aVar) {
        v7.g.f(eVar, "name");
        s8.a.a(this.f13785b.f18762a.n, (NoLookupLocation) aVar, this.n, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        O(eVar, noLookupLocation);
        return super.a(eVar, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        O(eVar, noLookupLocation);
        return super.b(eVar, noLookupLocation);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        x9.d<h9.e, l8.b> dVar;
        l8.b U;
        v7.g.f(eVar, "name");
        O(eVar, noLookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.c;
        return (lazyJavaClassMemberScope == null || (dVar = lazyJavaClassMemberScope.f13747u) == null || (U = dVar.U(eVar)) == null) ? this.f13747u.U(eVar) : U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set<h9.e> h(r9.c cVar, l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        return n7.l.c2(this.f13744r.k0(), this.f13746t.k0().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(r9.c cVar, l lVar) {
        v7.g.f(cVar, "kindFilter");
        l8.b bVar = this.n;
        Collection<r> f10 = bVar.o().f();
        v7.g.e(f10, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar : f10) {
            n7.n.f2(rVar.w().c(), linkedHashSet);
        }
        x9.e<a> eVar = this.f13787e;
        linkedHashSet.addAll(eVar.k0().a());
        linkedHashSet.addAll(eVar.k0().d());
        linkedHashSet.addAll(h(cVar, lVar));
        x8.c cVar2 = this.f13785b;
        linkedHashSet.addAll(cVar2.f18762a.f18760x.g(cVar2, bVar));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, h9.e eVar) {
        boolean z10;
        v7.g.f(eVar, "name");
        boolean G = this.f13741o.G();
        l8.b bVar = this.n;
        x8.c cVar = this.f13785b;
        if (G) {
            x9.e<a> eVar2 = this.f13787e;
            if (eVar2.k0().b(eVar) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next()).m().isEmpty()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    v b5 = eVar2.k0().b(eVar);
                    v7.g.c(b5);
                    LazyJavaAnnotations e12 = m0.b.e1(cVar, b5);
                    h9.e name = b5.getName();
                    x8.a aVar = cVar.f18762a;
                    JavaMethodDescriptor g12 = JavaMethodDescriptor.g1(bVar, e12, name, aVar.f18747j.a(b5), true);
                    r e10 = cVar.f18765e.e(b5.b(), m0.b.r1(TypeUsage.COMMON, false, false, null, 6));
                    c0 p10 = p();
                    EmptyList emptyList = EmptyList.f12981i;
                    g12.f1(null, p10, emptyList, emptyList, emptyList, e10, Modality.OPEN, l8.l.f15842e, null);
                    g12.h1(false, false);
                    ((f.a) aVar.f18744g).getClass();
                    arrayList.add(g12);
                }
            }
        }
        cVar.f18762a.f18760x.b(cVar, bVar, eVar, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final a k() {
        return new ClassDeclaredMemberIndex(this.f13741o, LazyJavaClassMemberScope$computeMemberIndex$1.f13748j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, h9.e eVar) {
        boolean z10;
        v7.g.f(eVar, "name");
        LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e> K = K(eVar);
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f13633a;
        if (!SpecialGenericSignatures.f13642k.contains(eVar)) {
            int i10 = BuiltinMethodsWithSpecialGenericSignature.f13612m;
            if (!BuiltinMethodsWithSpecialGenericSignature.b(eVar)) {
                if (!K.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 : K) {
                        if (eVar2.r0()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : K) {
                        if (N((kotlin.reflect.jvm.internal.impl.descriptors.g) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    y(linkedHashSet, eVar, arrayList, false);
                    return;
                }
            }
        }
        fa.d dVar = new fa.d();
        LinkedHashSet D = v8.b.D(eVar, K, EmptyList.f12981i, this.n, u9.j.f17929a, this.f13785b.f18762a.f18757u.a());
        z(eVar, linkedHashSet, D, linkedHashSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        z(eVar, linkedHashSet, D, dVar, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : K) {
            if (N((kotlin.reflect.jvm.internal.impl.descriptors.g) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(linkedHashSet, eVar, kotlin.collections.c.z2(dVar, arrayList2), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, h9.e eVar) {
        Set set;
        q qVar;
        v7.g.f(eVar, "name");
        boolean z10 = this.f13741o.z();
        x8.c cVar = this.f13785b;
        if (z10 && (qVar = (q) kotlin.collections.c.D2(this.f13787e.k0().c(eVar))) != null) {
            w8.e Z0 = w8.e.Z0(this.n, m0.b.e1(cVar, qVar), t.a(qVar.g()), false, qVar.getName(), cVar.f18762a.f18747j.a(qVar), false);
            d0 c = k9.c.c(Z0, e.a.f16014a);
            Z0.W0(c, null, null, null);
            v7.g.f(cVar, "<this>");
            r l2 = LazyJavaScope.l(qVar, new x8.c(cVar.f18762a, new LazyJavaTypeParameterResolver(cVar, Z0, qVar, 0), cVar.c));
            EmptyList emptyList = EmptyList.f12981i;
            Z0.Y0(l2, emptyList, p(), null, emptyList);
            c.U0(l2);
            arrayList.add(Z0);
        }
        Set<z> L = L(eVar);
        if (L.isEmpty()) {
            return;
        }
        fa.d dVar = new fa.d();
        fa.d dVar2 = new fa.d();
        A(L, arrayList, dVar, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
        if (dVar.isEmpty()) {
            set = kotlin.collections.c.Q2(L);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : L) {
                if (!dVar.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            set = linkedHashSet;
        }
        A(set, dVar2, null, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
        LinkedHashSet c22 = n7.l.c2(L, dVar2);
        l8.b bVar = this.n;
        x8.a aVar = cVar.f18762a;
        arrayList.addAll(v8.b.D(eVar, c22, arrayList, bVar, aVar.f18743f, aVar.f18757u.a()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(r9.c cVar) {
        v7.g.f(cVar, "kindFilter");
        if (this.f13741o.z()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f13787e.k0().f());
        Collection<r> f10 = this.n.o().f();
        v7.g.e(f10, "ownerDescriptor.typeConstructor.supertypes");
        for (r rVar : f10) {
            n7.n.f2(rVar.w().d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final c0 p() {
        l8.b bVar = this.n;
        if (bVar != null) {
            int i10 = k9.d.f12940a;
            return bVar.R0();
        }
        k9.d.a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final l8.f q() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.f13741o.z()) {
            return false;
        }
        return N(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.a s(q qVar, ArrayList arrayList, r rVar, List list) {
        v7.g.f(qVar, "method");
        v7.g.f(list, "valueParameters");
        ((g.a) this.f13785b.f18762a.f18742e).getClass();
        if (this.n != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new LazyJavaScope.a(list, arrayList, emptyList, rVar);
            }
            g.b.a(3);
            throw null;
        }
        g.a.a(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final String toString() {
        return "Lazy Java member scope for " + this.f13741o.e();
    }

    public final void x(ArrayList arrayList, w8.b bVar, int i10, q qVar, r rVar, r rVar2) {
        m0 m0Var;
        e.a.C0187a c0187a = e.a.f16014a;
        h9.e name = qVar.getName();
        m0 i11 = kotlin.reflect.jvm.internal.impl.types.r.i(rVar);
        boolean J = qVar.J();
        if (rVar2 != null) {
            m0Var = kotlin.reflect.jvm.internal.impl.types.r.i(rVar2);
        } else {
            m0Var = null;
        }
        arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(bVar, null, i10, c0187a, name, i11, J, false, false, m0Var, this.f13785b.f18762a.f18747j.a(qVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, h9.e eVar, ArrayList arrayList, boolean z10) {
        l8.b bVar = this.n;
        x8.a aVar = this.f13785b.f18762a;
        LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.g> D = v8.b.D(eVar, arrayList, linkedHashSet, bVar, aVar.f18743f, aVar.f18757u.a());
        if (!z10) {
            linkedHashSet.addAll(D);
            return;
        }
        ArrayList z22 = kotlin.collections.c.z2(D, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(D, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar : D) {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) SpecialBuiltinMembers.c(gVar);
            if (gVar2 != null) {
                gVar = C(gVar, gVar2, z22);
            }
            arrayList2.add(gVar);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(h9.e eVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, l lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g C;
        Object obj;
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        kotlin.reflect.jvm.internal.impl.descriptors.g C2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.g) SpecialBuiltinMembers.b(gVar2);
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar4 = null;
            if (gVar3 != null) {
                String a10 = SpecialBuiltinMembers.a(gVar3);
                v7.g.c(a10);
                for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar5 : (Collection) lVar.U(h9.e.k(a10))) {
                    e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v3 = gVar5.v();
                    v3.p(eVar);
                    v3.r();
                    v3.n();
                    kotlin.reflect.jvm.internal.impl.descriptors.g build = v3.build();
                    v7.g.c(build);
                    kotlin.reflect.jvm.internal.impl.descriptors.g gVar6 = build;
                    if (G(gVar3, gVar6)) {
                        C = C(gVar6, gVar3, linkedHashSet);
                        break;
                    }
                }
            }
            C = null;
            m0.b.u(abstractSet, C);
            kotlin.reflect.jvm.internal.impl.descriptors.e a11 = BuiltinMethodsWithSpecialGenericSignature.a(gVar2);
            if (a11 != null) {
                h9.e name = a11.getName();
                v7.g.e(name, "overridden.name");
                Iterator it2 = ((Iterable) lVar.U(name)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (M((kotlin.reflect.jvm.internal.impl.descriptors.g) obj, a11)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.g gVar7 = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj;
                if (gVar7 != null) {
                    e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v10 = gVar7.v();
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = a11.m();
                    v7.g.e(m10, "overridden.valueParameters");
                    ArrayList arrayList = new ArrayList(n7.l.Z1(m10, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : m10) {
                        arrayList.add(hVar.b());
                    }
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m11 = gVar7.m();
                    v7.g.e(m11, "override.valueParameters");
                    v10.d(a1.c.o0(arrayList, m11, a11));
                    v10.r();
                    v10.n();
                    v10.f(Boolean.TRUE);
                    gVar = v10.build();
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    if (!N(gVar)) {
                        gVar = null;
                    }
                    if (gVar != null) {
                        C2 = C(gVar, a11, linkedHashSet);
                        m0.b.u(abstractSet, C2);
                        if (!gVar2.r0()) {
                            h9.e name2 = gVar2.getName();
                            v7.g.e(name2, "descriptor.name");
                            Iterator it3 = ((Iterable) lVar.U(name2)).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                kotlin.reflect.jvm.internal.impl.descriptors.g D = D((kotlin.reflect.jvm.internal.impl.descriptors.g) it3.next());
                                if (D == null || !F(D, gVar2)) {
                                    D = null;
                                    continue;
                                } else {
                                    continue;
                                }
                                if (D != null) {
                                    gVar4 = D;
                                    break;
                                }
                            }
                        }
                        m0.b.u(abstractSet, gVar4);
                    }
                }
            }
            C2 = null;
            m0.b.u(abstractSet, C2);
            if (!gVar2.r0()) {
            }
            m0.b.u(abstractSet, gVar4);
        }
    }
}
