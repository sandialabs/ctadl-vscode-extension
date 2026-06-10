package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.f;
import l8.p;
import l8.q;
import l8.s;
import l8.v;
import m8.e;
import o8.m;
import o8.n;
import o8.x;
import o8.y;
import u7.l;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public final class c extends n implements s {

    /* renamed from: k  reason: collision with root package name */
    public final h f13564k;

    /* renamed from: l  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.builtins.e f13565l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<j0.c, Object> f13566m;
    public final d n;

    /* renamed from: o  reason: collision with root package name */
    public x f13567o;

    /* renamed from: p  reason: collision with root package name */
    public v f13568p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f13569q;

    /* renamed from: r  reason: collision with root package name */
    public final x9.c<h9.c, l8.x> f13570r;

    /* renamed from: s  reason: collision with root package name */
    public final m7.e f13571s;

    public c() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h9.e eVar, h hVar, kotlin.reflect.jvm.internal.impl.builtins.e eVar2, int i10) {
        super(e.a.f16014a, eVar);
        Map<j0.c, Object> K1 = (i10 & 16) != 0 ? kotlin.collections.d.K1() : null;
        g.f(K1, "capabilities");
        this.f13564k = hVar;
        this.f13565l = eVar2;
        if (!eVar.f11573j) {
            throw new IllegalArgumentException("Module name must be special: " + eVar);
        }
        this.f13566m = K1;
        d.f13572a.getClass();
        d dVar = (d) k0(d.a.f13574b);
        this.n = dVar == null ? d.b.f13575b : dVar;
        this.f13569q = true;
        this.f13570r = hVar.e(new ModuleDescriptorImpl$packages$1(this));
        this.f13571s = kotlin.a.b(new ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(this));
    }

    public final void M0(c... cVarArr) {
        List w22 = kotlin.collections.b.w2(cVarArr);
        g.f(w22, "descriptors");
        EmptySet emptySet = EmptySet.f12983i;
        g.f(emptySet, "friends");
        this.f13567o = new y(w22, emptySet, EmptyList.f12981i, emptySet);
    }

    @Override // l8.f
    public final f c() {
        return null;
    }

    @Override // l8.s
    public final List<s> g0() {
        x xVar = this.f13567o;
        if (xVar != null) {
            return xVar.c();
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f11572i;
        g.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // l8.s
    public final boolean h0(s sVar) {
        g.f(sVar, "targetModule");
        if (g.a(this, sVar)) {
            return true;
        }
        x xVar = this.f13567o;
        g.c(xVar);
        return kotlin.collections.c.h2(xVar.a(), sVar) || g0().contains(sVar) || sVar.g0().contains(this);
    }

    @Override // l8.s
    public final <T> T k0(j0.c cVar) {
        g.f(cVar, "capability");
        T t10 = (T) this.f13566m.get(cVar);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.g(this, d5);
    }

    @Override // l8.s
    public final Collection<h9.c> q(h9.c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "fqName");
        g.f(lVar, "nameFilter");
        z0();
        z0();
        return ((m) this.f13571s.getValue()).q(cVar, lVar);
    }

    @Override // l8.s
    public final l8.x t0(h9.c cVar) {
        g.f(cVar, "fqName");
        z0();
        return (l8.x) ((LockBasedStorageManager.k) this.f13570r).U(cVar);
    }

    @Override // l8.s
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        return this.f13565l;
    }

    public final void z0() {
        m7.n nVar;
        if (!this.f13569q) {
            q qVar = (q) k0(p.f15859a);
            if (qVar != null) {
                qVar.a();
                nVar = m7.n.f16010a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                throw new InvalidModuleException("Accessing invalid module descriptor " + this);
            }
        }
    }
}
