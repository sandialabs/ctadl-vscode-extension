package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.k;
import b9.q;
import b9.v;
import b9.x;
import d9.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import l8.i0;
import l8.m;
import m8.e;
import n7.l;
import r8.u;
import u8.t;
import v7.g;
import v8.f;
import y9.r;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements u7.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.b>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13751j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x8.c f13752k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(x8.c cVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f13751j = lazyJavaClassMemberScope;
        this.f13752k = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.b, w8.b, o8.j] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // u7.a
    public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> k0() {
        x8.c cVar;
        l8.b bVar;
        TypeUsage typeUsage;
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        x8.c cVar2;
        x8.c cVar3;
        Collection collection;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c cVar4;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c cVar5;
        String str;
        x8.c cVar6;
        String str2;
        ?? emptyList;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar;
        int i10;
        Pair pair;
        Object obj;
        boolean z10;
        r rVar;
        LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.f13751j;
        List k3 = lazyJavaClassMemberScope2.f13741o.k();
        ArrayList arrayList = new ArrayList(k3.size());
        Iterator it = k3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = lazyJavaClassMemberScope2.f13785b;
            bVar = lazyJavaClassMemberScope2.n;
            if (!hasNext) {
                break;
            }
            k kVar = (k) it.next();
            LazyJavaAnnotations e12 = m0.b.e1(cVar, kVar);
            x8.a aVar2 = cVar.f18762a;
            w8.b f12 = w8.b.f1(bVar, e12, false, aVar2.f18747j.a(kVar));
            x8.c cVar7 = new x8.c(aVar2, new LazyJavaTypeParameterResolver(cVar, f12, kVar, bVar.x().size()), cVar.c);
            LazyJavaScope.b u10 = LazyJavaScope.u(cVar7, f12, kVar.m());
            List<i0> x3 = bVar.x();
            g.e(x3, "classDescriptor.declaredTypeParameters");
            ArrayList<x> typeParameters = kVar.getTypeParameters();
            ArrayList arrayList2 = new ArrayList(l.Z1(typeParameters, 10));
            for (x xVar : typeParameters) {
                i0 a10 = cVar7.f18763b.a(xVar);
                g.c(a10);
                arrayList2.add(a10);
            }
            ArrayList z22 = kotlin.collections.c.z2(arrayList2, x3);
            f12.e1(u10.f13801a, t.a(kVar.g()), z22);
            f12.Y0(false);
            f12.Z0(u10.f13802b);
            f12.a1(bVar.r());
            ((f.a) cVar7.f18762a.f18744g).getClass();
            arrayList.add(f12);
        }
        b9.g gVar = lazyJavaClassMemberScope2.f13741o;
        boolean G = gVar.G();
        TypeUsage typeUsage2 = TypeUsage.COMMON;
        e.a.C0187a c0187a = e.a.f16014a;
        x8.c cVar8 = this.f13752k;
        if (G) {
            w8.b f13 = w8.b.f1(bVar, c0187a, true, cVar.f18762a.f18747j.a(gVar));
            ArrayList<v> r3 = gVar.r();
            ArrayList arrayList3 = new ArrayList(r3.size());
            z8.a r1 = m0.b.r1(typeUsage2, false, false, null, 6);
            int i11 = 0;
            for (v vVar : r3) {
                int i12 = i11 + 1;
                r e10 = cVar.f18765e.e(vVar.b(), r1);
                boolean h10 = vVar.h();
                z8.a aVar3 = r1;
                x8.a aVar4 = cVar.f18762a;
                if (h10) {
                    rVar = aVar4.f18751o.u().g(e10);
                } else {
                    rVar = null;
                }
                arrayList3.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(f13, null, i11, c0187a, vVar.getName(), e10, false, false, false, rVar, aVar4.f18747j.a(vVar)));
                cVar8 = cVar8;
                i11 = i12;
                r1 = aVar3;
                lazyJavaClassMemberScope2 = lazyJavaClassMemberScope2;
                typeUsage2 = typeUsage2;
            }
            typeUsage = typeUsage2;
            lazyJavaClassMemberScope = lazyJavaClassMemberScope2;
            cVar2 = cVar8;
            f13.Z0(false);
            m g10 = bVar.g();
            g.e(g10, "classDescriptor.visibility");
            if (g.a(g10, u8.k.f17853b)) {
                g10 = u8.k.c;
                g.e(g10, "PROTECTED_AND_PACKAGE");
            }
            f13.d1(arrayList3, g10);
            f13.Y0(false);
            f13.a1(bVar.r());
            String a11 = j.a(f13, 2);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (g.a(j.a((kotlin.reflect.jvm.internal.impl.descriptors.b) it2.next(), 2), a11)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                arrayList.add(f13);
                ((f.a) cVar2.f18762a.f18744g).getClass();
            }
        } else {
            typeUsage = typeUsage2;
            lazyJavaClassMemberScope = lazyJavaClassMemberScope2;
            cVar2 = cVar8;
        }
        cVar2.f18762a.f18760x.d(cVar2, bVar, arrayList);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c cVar9 = cVar2.f18762a.f18754r;
        if (arrayList.isEmpty()) {
            boolean z11 = gVar.z();
            if (!gVar.B()) {
                gVar.K();
            }
            if (!z11) {
                cVar5 = cVar9;
                cVar6 = cVar2;
                obj = null;
            } else {
                ?? f14 = w8.b.f1(bVar, c0187a, true, cVar.f18762a.f18747j.a(gVar));
                if (z11) {
                    List N = gVar.N();
                    emptyList = new ArrayList(N.size());
                    z8.a r12 = m0.b.r1(typeUsage, true, false, null, 6);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : N) {
                        if (g.a(((q) obj2).getName(), u8.q.f17865b)) {
                            arrayList4.add(obj2);
                        } else {
                            arrayList5.add(obj2);
                        }
                    }
                    arrayList4.size();
                    q qVar = (q) kotlin.collections.c.p2(arrayList4);
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar5 = cVar.f18765e;
                    if (qVar != null) {
                        u l2 = qVar.l();
                        if (l2 instanceof b9.f) {
                            b9.f fVar = (b9.f) l2;
                            pair = new Pair(aVar5.c(fVar, r12, true), aVar5.e(fVar.I(), r12));
                        } else {
                            pair = new Pair(aVar5.e(l2, r12), null);
                        }
                        cVar5 = cVar9;
                        aVar = aVar5;
                        str = "classDescriptor.visibility";
                        cVar6 = cVar2;
                        str2 = "PROTECTED_AND_PACKAGE";
                        lazyJavaClassMemberScope.x(emptyList, f14, 0, qVar, (r) pair.f12962i, (r) pair.f12963j);
                    } else {
                        cVar5 = cVar9;
                        aVar = aVar5;
                        str = "classDescriptor.visibility";
                        cVar6 = cVar2;
                        str2 = "PROTECTED_AND_PACKAGE";
                    }
                    if (qVar != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    Iterator it3 = arrayList5.iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        int i14 = i13 + 1;
                        q qVar2 = (q) it3.next();
                        int i15 = i13 + i10;
                        lazyJavaClassMemberScope.x(emptyList, f14, i15, qVar2, aVar.e(qVar2.l(), r12), null);
                        i13 = i14;
                    }
                } else {
                    cVar5 = cVar9;
                    str = "classDescriptor.visibility";
                    cVar6 = cVar2;
                    str2 = "PROTECTED_AND_PACKAGE";
                    emptyList = Collections.emptyList();
                }
                f14.Z0(false);
                m g11 = bVar.g();
                g.e(g11, str);
                if (g.a(g11, u8.k.f17853b)) {
                    g11 = u8.k.c;
                    g.e(g11, str2);
                }
                f14.d1(emptyList, g11);
                f14.Y0(true);
                f14.a1(bVar.r());
                ((f.a) cVar.f18762a.f18744g).getClass();
                obj = f14;
            }
            cVar3 = cVar6;
            cVar4 = cVar5;
            collection = a1.c.P0(obj);
        } else {
            cVar3 = cVar2;
            cVar4 = cVar9;
            collection = arrayList;
        }
        return kotlin.collections.c.L2(cVar4.c(cVar3, collection));
    }
}
