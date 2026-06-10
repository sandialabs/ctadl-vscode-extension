package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.t;
import c8.j;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.d0;
import m8.e;
import o8.a0;
import v7.g;
import v7.i;
import x9.e;
import x9.h;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragment extends a0 {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13762u = {i.c(new PropertyReference1Impl(i.a(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), i.c(new PropertyReference1Impl(i.a(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: o  reason: collision with root package name */
    public final t f13763o;

    /* renamed from: p  reason: collision with root package name */
    public final x8.c f13764p;

    /* renamed from: q  reason: collision with root package name */
    public final e f13765q;

    /* renamed from: r  reason: collision with root package name */
    public final JvmPackageScope f13766r;

    /* renamed from: s  reason: collision with root package name */
    public final e<List<h9.c>> f13767s;

    /* renamed from: t  reason: collision with root package name */
    public final m8.e f13768t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(x8.c cVar, t tVar) {
        super(cVar.f18762a.f18751o, tVar.e());
        m8.e e12;
        g.f(cVar, "outerContext");
        g.f(tVar, "jPackage");
        this.f13763o = tVar;
        x8.c a10 = ContextKt.a(cVar, this, null, 6);
        this.f13764p = a10;
        x8.a aVar = a10.f18762a;
        this.f13765q = aVar.f18739a.a(new LazyJavaPackageFragment$binaryClasses$2(this));
        this.f13766r = new JvmPackageScope(a10, tVar, this);
        LazyJavaPackageFragment$subPackages$1 lazyJavaPackageFragment$subPackages$1 = new LazyJavaPackageFragment$subPackages$1(this);
        EmptyList emptyList = EmptyList.f12981i;
        h hVar = aVar.f18739a;
        this.f13767s = hVar.f(emptyList, lazyJavaPackageFragment$subPackages$1);
        if (aVar.f18758v.c) {
            e12 = e.a.f16014a;
        } else {
            e12 = m0.b.e1(a10, tVar);
        }
        this.f13768t = e12;
        hVar.a(new LazyJavaPackageFragment$partToFacade$2(this));
    }

    @Override // m8.b, m8.a
    public final m8.e getAnnotations() {
        return this.f13768t;
    }

    @Override // o8.a0, o8.o, l8.i
    public final d0 j() {
        return new d9.h(this);
    }

    @Override // o8.a0, o8.n
    public final String toString() {
        return "Lazy Java package fragment: " + this.f16379m + " of module " + this.f13764p.f18762a.f18751o;
    }

    @Override // l8.u
    public final MemberScope w() {
        return this.f13766r;
    }
}
