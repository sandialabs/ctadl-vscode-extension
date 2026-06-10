package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.q;
import b9.w;
import b9.x;
import c8.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import l8.c0;
import l8.i0;
import l8.m;
import l8.z;
import m8.e;
import n7.l;
import n7.s;
import n7.t;
import o8.f0;
import q8.i;
import r9.f;
import v7.i;
import v8.g;
import x9.e;
import y9.m0;
import y9.r;

/* loaded from: classes.dex */
public abstract class LazyJavaScope extends f {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13784m = {i.c(new PropertyReference1Impl(i.a(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), i.c(new PropertyReference1Impl(i.a(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), i.c(new PropertyReference1Impl(i.a(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    public final x8.c f13785b;
    public final LazyJavaScope c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Collection<l8.f>> f13786d;

    /* renamed from: e  reason: collision with root package name */
    public final e<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a> f13787e;

    /* renamed from: f  reason: collision with root package name */
    public final x9.c<h9.e, Collection<g>> f13788f;

    /* renamed from: g  reason: collision with root package name */
    public final x9.d<h9.e, z> f13789g;

    /* renamed from: h  reason: collision with root package name */
    public final x9.c<h9.e, Collection<g>> f13790h;

    /* renamed from: i  reason: collision with root package name */
    public final e f13791i;

    /* renamed from: j  reason: collision with root package name */
    public final e f13792j;

    /* renamed from: k  reason: collision with root package name */
    public final e f13793k;

    /* renamed from: l  reason: collision with root package name */
    public final x9.c<h9.e, List<z>> f13794l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r f13795a;

        /* renamed from: b  reason: collision with root package name */
        public final r f13796b;
        public final List<h> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<i0> f13797d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13798e;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f13799f;

        public a(List list, ArrayList arrayList, List list2, r rVar) {
            v7.g.f(list, "valueParameters");
            v7.g.f(list2, "errors");
            this.f13795a = rVar;
            this.f13796b = null;
            this.c = list;
            this.f13797d = arrayList;
            this.f13798e = false;
            this.f13799f = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(this.f13795a, aVar.f13795a) && v7.g.a(this.f13796b, aVar.f13796b) && v7.g.a(this.c, aVar.c) && v7.g.a(this.f13797d, aVar.f13797d) && this.f13798e == aVar.f13798e && v7.g.a(this.f13799f, aVar.f13799f);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.f13795a.hashCode() * 31;
            r rVar = this.f13796b;
            int hashCode2 = rVar == null ? 0 : rVar.hashCode();
            int hashCode3 = (this.f13797d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
            boolean z10 = this.f13798e;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return this.f13799f.hashCode() + ((hashCode3 + i10) * 31);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.f13795a + ", receiverType=" + this.f13796b + ", valueParameters=" + this.c + ", typeParameters=" + this.f13797d + ", hasStableParameterNames=" + this.f13798e + ", errors=" + this.f13799f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<h> f13801a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13802b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends h> list, boolean z10) {
            v7.g.f(list, "descriptors");
            this.f13801a = list;
            this.f13802b = z10;
        }
    }

    public LazyJavaScope(x8.c cVar, LazyJavaScope lazyJavaScope) {
        v7.g.f(cVar, "c");
        this.f13785b = cVar;
        this.c = lazyJavaScope;
        x8.a aVar = cVar.f18762a;
        this.f13786d = aVar.f18739a.f(EmptyList.f12981i, new LazyJavaScope$allDescriptors$1(this));
        LazyJavaScope$declaredMemberIndex$1 lazyJavaScope$declaredMemberIndex$1 = new LazyJavaScope$declaredMemberIndex$1(this);
        x9.h hVar = aVar.f18739a;
        this.f13787e = hVar.a(lazyJavaScope$declaredMemberIndex$1);
        this.f13788f = hVar.e(new LazyJavaScope$declaredFunctions$1(this));
        this.f13789g = hVar.h(new LazyJavaScope$declaredField$1(this));
        this.f13790h = hVar.e(new LazyJavaScope$functions$1(this));
        this.f13791i = hVar.a(new LazyJavaScope$functionNamesLazy$2(this));
        this.f13792j = hVar.a(new LazyJavaScope$propertyNamesLazy$2(this));
        this.f13793k = hVar.a(new LazyJavaScope$classNamesLazy$2(this));
        this.f13794l = hVar.e(new LazyJavaScope$properties$1(this));
    }

    public static r l(q qVar, x8.c cVar) {
        v7.g.f(qVar, "method");
        z8.a r1 = m0.b.r1(TypeUsage.COMMON, qVar.t().z(), false, null, 6);
        return cVar.f18765e.e(qVar.l(), r1);
    }

    public static b u(x8.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.impl.b bVar, List list) {
        Pair pair;
        h9.e name;
        String g10;
        v7.g.f(list, "jValueParameters");
        s R2 = kotlin.collections.c.R2(list);
        ArrayList arrayList = new ArrayList(l.Z1(R2, 10));
        Iterator it = R2.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            t tVar = (t) it;
            if (tVar.hasNext()) {
                n7.r rVar = (n7.r) tVar.next();
                int i10 = rVar.f16128a;
                b9.z zVar = (b9.z) rVar.f16129b;
                LazyJavaAnnotations e12 = m0.b.e1(cVar, zVar);
                b9.f fVar = null;
                z8.a r1 = m0.b.r1(TypeUsage.COMMON, z10, z10, null, 7);
                boolean h10 = zVar.h();
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar = cVar.f18765e;
                x8.a aVar2 = cVar.f18762a;
                if (h10) {
                    w b5 = zVar.b();
                    if (b5 instanceof b9.f) {
                        fVar = (b9.f) b5;
                    }
                    if (fVar != null) {
                        m0 c = aVar.c(fVar, r1, true);
                        pair = new Pair(c, aVar2.f18751o.u().g(c));
                    } else {
                        throw new AssertionError("Vararg parameter should be an array: " + zVar);
                    }
                } else {
                    pair = new Pair(aVar.e(zVar.b(), r1), null);
                }
                r rVar2 = (r) pair.f12962i;
                r rVar3 = (r) pair.f12963j;
                if (v7.g.a(bVar.getName().b(), "equals") && list.size() == 1 && v7.g.a(aVar2.f18751o.u().p(), rVar2)) {
                    g10 = "other";
                } else {
                    name = zVar.getName();
                    if (name == null) {
                        z11 = true;
                    }
                    if (name == null) {
                        g10 = androidx.activity.e.g("p", i10);
                    } else {
                        arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(bVar, null, i10, e12, name, rVar2, false, false, false, rVar3, aVar2.f18747j.a(zVar)));
                        z10 = false;
                    }
                }
                name = h9.e.k(g10);
                arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(bVar, null, i10, e12, name, rVar2, false, false, false, rVar3, aVar2.f18747j.a(zVar)));
                z10 = false;
            } else {
                return new b(kotlin.collections.c.L2(arrayList), z11);
            }
        }
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        if (!c().contains(eVar)) {
            return EmptyList.f12981i;
        }
        return (Collection) ((LockBasedStorageManager.k) this.f13790h).U(eVar);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        if (!d().contains(eVar)) {
            return EmptyList.f12981i;
        }
        return (Collection) ((LockBasedStorageManager.k) this.f13794l).U(eVar);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        return (Set) m0.b.u0(this.f13791i, f13784m[0]);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        return (Set) m0.b.u0(this.f13792j, f13784m[1]);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public Collection<l8.f> f(r9.c cVar, u7.l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        return this.f13786d.k0();
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        return (Set) m0.b.u0(this.f13793k, f13784m[2]);
    }

    public abstract Set<h9.e> h(r9.c cVar, u7.l<? super h9.e, Boolean> lVar);

    public abstract Set<h9.e> i(r9.c cVar, u7.l<? super h9.e, Boolean> lVar);

    public void j(ArrayList arrayList, h9.e eVar) {
        v7.g.f(eVar, "name");
    }

    public abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a k();

    public abstract void m(LinkedHashSet linkedHashSet, h9.e eVar);

    public abstract void n(ArrayList arrayList, h9.e eVar);

    public abstract Set o(r9.c cVar);

    public abstract c0 p();

    public abstract l8.f q();

    public boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    public abstract a s(q qVar, ArrayList arrayList, r rVar, List list);

    public final JavaMethodDescriptor t(q qVar) {
        boolean z10;
        f0 f0Var;
        Modality modality;
        Map K1;
        v7.g.f(qVar, "method");
        x8.c cVar = this.f13785b;
        LazyJavaAnnotations e12 = m0.b.e1(cVar, qVar);
        l8.f q10 = q();
        h9.e name = qVar.getName();
        i.a a10 = cVar.f18762a.f18747j.a(qVar);
        if (this.f13787e.k0().b(qVar.getName()) != null && qVar.m().isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        JavaMethodDescriptor g12 = JavaMethodDescriptor.g1(q10, e12, name, a10, z10);
        v7.g.f(cVar, "<this>");
        x8.c cVar2 = new x8.c(cVar.f18762a, new LazyJavaTypeParameterResolver(cVar, g12, qVar, 0), cVar.c);
        ArrayList<x> typeParameters = qVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(l.Z1(typeParameters, 10));
        for (x xVar : typeParameters) {
            i0 a11 = cVar2.f18763b.a(xVar);
            v7.g.c(a11);
            arrayList.add(a11);
        }
        b u10 = u(cVar2, g12, qVar.m());
        r l2 = l(qVar, cVar2);
        List<h> list = u10.f13801a;
        a s10 = s(qVar, arrayList, l2, list);
        r rVar = s10.f13796b;
        if (rVar != null) {
            f0Var = k9.c.h(g12, rVar, e.a.f16014a);
        } else {
            f0Var = null;
        }
        f0 f0Var2 = f0Var;
        c0 p10 = p();
        EmptyList emptyList = EmptyList.f12981i;
        List<i0> list2 = s10.f13797d;
        List<h> list3 = s10.c;
        r rVar2 = s10.f13795a;
        boolean C = qVar.C();
        boolean z11 = !qVar.w();
        if (C) {
            modality = Modality.ABSTRACT;
        } else if (z11) {
            modality = Modality.OPEN;
        } else {
            modality = Modality.FINAL;
        }
        Modality modality2 = modality;
        m a12 = u8.t.a(qVar.g());
        if (s10.f13796b != null) {
            K1 = m0.b.P0(new Pair(JavaMethodDescriptor.O, kotlin.collections.c.n2(list)));
        } else {
            K1 = kotlin.collections.d.K1();
        }
        g12.f1(f0Var2, p10, emptyList, list2, list3, rVar2, modality2, a12, K1);
        g12.h1(s10.f13798e, u10.f13802b);
        if (!(!s10.f13799f.isEmpty())) {
            return g12;
        }
        ((g.a) cVar2.f18762a.f18742e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
