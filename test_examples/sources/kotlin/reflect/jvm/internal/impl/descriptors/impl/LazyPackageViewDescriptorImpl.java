package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import c8.j;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.f;
import l8.u;
import l8.x;
import m8.e;
import o8.n;
import v7.g;
import v7.i;
import x9.h;

/* loaded from: classes.dex */
public final class LazyPackageViewDescriptorImpl extends n implements x {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13514p = {i.c(new PropertyReference1Impl(i.a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), i.c(new PropertyReference1Impl(i.a(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* renamed from: k  reason: collision with root package name */
    public final c f13515k;

    /* renamed from: l  reason: collision with root package name */
    public final h9.c f13516l;

    /* renamed from: m  reason: collision with root package name */
    public final x9.e f13517m;
    public final x9.e n;

    /* renamed from: o  reason: collision with root package name */
    public final LazyScopeAdapter f13518o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(c cVar, h9.c cVar2, h hVar) {
        super(e.a.f16014a, cVar2.g());
        g.f(cVar, "module");
        g.f(cVar2, "fqName");
        g.f(hVar, "storageManager");
        this.f13515k = cVar;
        this.f13516l = cVar2;
        this.f13517m = hVar.a(new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.n = hVar.a(new LazyPackageViewDescriptorImpl$empty$2(this));
        this.f13518o = new LazyScopeAdapter(hVar, new LazyPackageViewDescriptorImpl$memberScope$1(this));
    }

    @Override // l8.f
    public final f c() {
        h9.c cVar = this.f13516l;
        if (cVar.d()) {
            return null;
        }
        h9.c e10 = cVar.e();
        g.e(e10, "fqName.parent()");
        return this.f13515k.t0(e10);
    }

    @Override // l8.x
    public final List<u> d0() {
        return (List) m0.b.u0(this.f13517m, f13514p[0]);
    }

    @Override // l8.x
    public final h9.c e() {
        return this.f13516l;
    }

    public final boolean equals(Object obj) {
        x xVar = obj instanceof x ? (x) obj : null;
        if (xVar == null) {
            return false;
        }
        if (g.a(this.f13516l, xVar.e())) {
            return g.a(this.f13515k, xVar.o0());
        }
        return false;
    }

    public final int hashCode() {
        return this.f13516l.hashCode() + (this.f13515k.hashCode() * 31);
    }

    @Override // l8.x
    public final boolean isEmpty() {
        return ((Boolean) m0.b.u0(this.n, f13514p[1])).booleanValue();
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.m(this, d5);
    }

    @Override // l8.x
    public final c o0() {
        return this.f13515k;
    }

    @Override // l8.x
    public final MemberScope w() {
        return this.f13518o;
    }
}
