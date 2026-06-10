package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.w;
import m0.b;
import r8.r;
import u7.l;
import v7.g;
import x8.c;

/* loaded from: classes.dex */
public final class LazyJavaPackageFragmentProvider implements w {

    /* renamed from: a  reason: collision with root package name */
    public final c f13693a;

    /* renamed from: b  reason: collision with root package name */
    public final x9.a<h9.c, LazyJavaPackageFragment> f13694b;

    public LazyJavaPackageFragmentProvider(x8.a aVar) {
        c cVar = new c(aVar, a.C0152a.f13702a, new InitializedLazyImpl());
        this.f13693a = cVar;
        this.f13694b = cVar.f18762a.f18739a.d();
    }

    @Override // l8.v
    public final List<LazyJavaPackageFragment> a(h9.c cVar) {
        g.f(cVar, "fqName");
        return a1.c.P0(d(cVar));
    }

    @Override // l8.w
    public final void b(h9.c cVar, ArrayList arrayList) {
        g.f(cVar, "fqName");
        b.u(arrayList, d(cVar));
    }

    @Override // l8.w
    public final boolean c(h9.c cVar) {
        g.f(cVar, "fqName");
        if (this.f13693a.f18762a.f18740b.a(cVar) == null) {
            return true;
        }
        return false;
    }

    public final LazyJavaPackageFragment d(h9.c cVar) {
        r a10 = this.f13693a.f18762a.f18740b.a(cVar);
        if (a10 == null) {
            return null;
        }
        return (LazyJavaPackageFragment) ((LockBasedStorageManager.b) this.f13694b).d(cVar, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, a10));
    }

    @Override // l8.v
    public final Collection q(h9.c cVar, l lVar) {
        List<h9.c> list;
        g.f(cVar, "fqName");
        g.f(lVar, "nameFilter");
        LazyJavaPackageFragment d5 = d(cVar);
        if (d5 != null) {
            list = d5.f13767s.k0();
        } else {
            list = null;
        }
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f13693a.f18762a.f18751o;
    }
}
