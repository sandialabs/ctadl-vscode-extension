package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.n;
import h9.e;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import l8.f;
import l8.m;
import l8.z;
import q8.i;
import u7.l;
import u8.t;
import v7.g;
import v8.f;
import y9.r;

/* loaded from: classes.dex */
public final class LazyJavaScope$declaredField$1 extends Lambda implements l<e, z> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.f13804j = lazyJavaScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z U(e eVar) {
        boolean z10;
        boolean z11;
        e eVar2 = eVar;
        g.f(eVar2, "name");
        LazyJavaScope lazyJavaScope = this.f13804j;
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.c;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f13789g.U(eVar2);
        }
        n e10 = lazyJavaScope.f13787e.k0().e(eVar2);
        if (e10 == null || e10.x()) {
            return null;
        }
        boolean z12 = true;
        boolean z13 = !e10.w();
        x8.c cVar = lazyJavaScope.f13785b;
        LazyJavaAnnotations e12 = m0.b.e1(cVar, e10);
        f q10 = lazyJavaScope.q();
        m a10 = t.a(e10.g());
        e name = e10.getName();
        x8.a aVar = cVar.f18762a;
        i.a a11 = aVar.f18747j.a(e10);
        if (e10.w() && e10.S()) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8.e Z0 = w8.e.Z0(q10, e12, a10, z13, name, a11, z10);
        Z0.W0(null, null, null, null);
        r e11 = cVar.f18765e.e(e10.b(), m0.b.r1(TypeUsage.COMMON, false, false, null, 7));
        if (kotlin.reflect.jvm.internal.impl.builtins.e.H(e11) || kotlin.reflect.jvm.internal.impl.builtins.e.J(e11)) {
            if (e10.w() && e10.S()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                e10.M();
            }
        }
        EmptyList emptyList = EmptyList.f12981i;
        Z0.Y0(e11, emptyList, lazyJavaScope.p(), null, emptyList);
        r b5 = Z0.b();
        if (b5 != null) {
            int i10 = k9.d.f12940a;
            if (!Z0.n && !m0.b.D0(b5)) {
                if (!kotlin.reflect.jvm.internal.impl.types.r.b(b5)) {
                    kotlin.reflect.jvm.internal.impl.builtins.e e13 = DescriptorUtilsKt.e(Z0);
                    if (!kotlin.reflect.jvm.internal.impl.builtins.e.H(b5)) {
                        kotlin.reflect.jvm.internal.impl.types.checker.g gVar = kotlin.reflect.jvm.internal.impl.types.checker.d.f14997a;
                        if (!gVar.c(e13.v(), b5)) {
                            if (!gVar.c(e13.k("Number").r(), b5)) {
                                if (!gVar.c(e13.f(), b5)) {
                                    if (i8.g.a(b5)) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (z12) {
                    Z0.M0(null, new LazyJavaScope$resolveProperty$1(lazyJavaScope, e10, Z0));
                }
                ((f.a) aVar.f18744g).getClass();
                return Z0;
            }
            z12 = false;
            if (z12) {
            }
            ((f.a) aVar.f18744g).getClass();
            return Z0;
        }
        k9.d.a(64);
        throw null;
    }
}
