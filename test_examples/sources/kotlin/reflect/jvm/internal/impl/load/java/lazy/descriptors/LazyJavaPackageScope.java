package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.g;
import b9.t;
import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import u7.l;
import x9.f;

/* loaded from: classes.dex */
public final class LazyJavaPackageScope extends d {
    public final t n;

    /* renamed from: o  reason: collision with root package name */
    public final LazyJavaPackageFragment f13772o;

    /* renamed from: p  reason: collision with root package name */
    public final f<Set<String>> f13773p;

    /* renamed from: q  reason: collision with root package name */
    public final x9.d<a, l8.b> f13774q;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f13775a;

        /* renamed from: b  reason: collision with root package name */
        public final g f13776b;

        public a(e eVar, g gVar) {
            v7.g.f(eVar, "name");
            this.f13775a = eVar;
            this.f13776b = gVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (v7.g.a(this.f13775a, ((a) obj).f13775a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f13775a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final l8.b f13777a;

            public a(l8.b bVar) {
                this.f13777a = bVar;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0153b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0153b f13778a = new C0153b();
        }

        /* loaded from: classes.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f13779a = new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(x8.c cVar, t tVar, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(cVar);
        v7.g.f(tVar, "jPackage");
        v7.g.f(lazyJavaPackageFragment, "ownerDescriptor");
        this.n = tVar;
        this.f13772o = lazyJavaPackageFragment;
        x8.a aVar = cVar.f18762a;
        this.f13773p = aVar.f18739a.g(new LazyJavaPackageScope$knownClassNamesInPackage$1(cVar, this));
        this.f13774q = aVar.f18739a.h(new LazyJavaPackageScope$classes$1(cVar, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return EmptyList.f12981i;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return v(eVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<l8.f> f(r9.c cVar, l<? super e, Boolean> lVar) {
        boolean z10;
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        if (!cVar.a(r9.c.f17181l | r9.c.f17174e)) {
            return EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f13786d.k0()) {
            l8.f fVar = (l8.f) obj;
            if (fVar instanceof l8.b) {
                e name = ((l8.b) fVar).getName();
                v7.g.e(name, "it.name");
                if (lVar.U(name).booleanValue()) {
                    z10 = true;
                    if (!z10) {
                        arrayList.add(obj);
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set<e> h(r9.c cVar, l<? super e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        if (!cVar.a(r9.c.f17174e)) {
            return EmptySet.f12983i;
        }
        Set<String> k02 = this.f13773p.k0();
        if (k02 != null) {
            HashSet hashSet = new HashSet();
            for (String str : k02) {
                hashSet.add(e.k(str));
            }
            return hashSet;
        }
        if (lVar == null) {
            lVar = FunctionsKt.f15113a;
        }
        EmptyList o10 = this.n.o(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o10.getClass();
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set<e> i(r9.c cVar, l<? super e, Boolean> lVar) {
        v7.g.f(cVar, "kindFilter");
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a k() {
        return a.C0154a.f13822a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, e eVar) {
        v7.g.f(eVar, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(r9.c cVar) {
        v7.g.f(cVar, "kindFilter");
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final l8.f q() {
        return this.f13772o;
    }

    public final l8.b v(e eVar, g gVar) {
        boolean z10;
        e eVar2 = h9.g.f11575a;
        v7.g.f(eVar, "name");
        String b5 = eVar.b();
        v7.g.e(b5, "name.asString()");
        boolean z11 = true;
        if (b5.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || eVar.f11573j) {
            z11 = false;
        }
        if (!z11) {
            return null;
        }
        Set<String> k02 = this.f13773p.k0();
        if (gVar == null && k02 != null && !k02.contains(eVar.b())) {
            return null;
        }
        return this.f13774q.U(new a(eVar, gVar));
    }
}
