package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import d9.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import u7.l;
import u8.h;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaPackageScope$classes$1 extends Lambda implements l<LazyJavaPackageScope.a, l8.b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageScope f13780j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ x8.c f13781k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(x8.c cVar, LazyJavaPackageScope lazyJavaPackageScope) {
        super(1);
        this.f13780j = lazyJavaPackageScope;
        this.f13781k = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l8.b U(LazyJavaPackageScope.a aVar) {
        f.a.b a10;
        h hVar;
        h9.b bVar;
        LazyJavaPackageScope.b bVar2;
        l8.b a11;
        h9.c cVar;
        LazyJavaPackageScope.a aVar2 = aVar;
        g.f(aVar2, "request");
        LazyJavaPackageScope lazyJavaPackageScope = this.f13780j;
        h9.b bVar3 = new h9.b(lazyJavaPackageScope.f13772o.f16379m, aVar2.f13775a);
        x8.c cVar2 = this.f13781k;
        b9.g gVar = aVar2.f13776b;
        if (gVar != null) {
            a10 = cVar2.f18762a.c.b(gVar);
        } else {
            a10 = cVar2.f18762a.c.a(bVar3);
        }
        if (a10 != null) {
            hVar = a10.f10460a;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            bVar = hVar.d();
        } else {
            bVar = null;
        }
        if (bVar == null || (!bVar.k() && !bVar.c)) {
            if (hVar != null) {
                if (hVar.a().f13953a == KotlinClassHeader.Kind.f13961l) {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.g gVar2 = lazyJavaPackageScope.f13785b.f18762a.f18741d;
                    gVar2.getClass();
                    u9.b f10 = gVar2.f(hVar);
                    if (f10 == null) {
                        a11 = null;
                    } else {
                        a11 = gVar2.c().f17918t.a(hVar.d(), f10);
                    }
                    if (a11 != null) {
                        bVar2 = new LazyJavaPackageScope.b.a(a11);
                    }
                } else {
                    bVar2 = LazyJavaPackageScope.b.c.f13779a;
                }
                if (!(bVar2 instanceof LazyJavaPackageScope.b.a)) {
                    return ((LazyJavaPackageScope.b.a) bVar2).f13777a;
                }
                if (bVar2 instanceof LazyJavaPackageScope.b.c) {
                    return null;
                }
                if (bVar2 instanceof LazyJavaPackageScope.b.C0153b) {
                    if (gVar == null) {
                        u8.h hVar2 = cVar2.f18762a.f18740b;
                        if (a10 != null) {
                            if (!(a10 instanceof f.a.C0106a)) {
                                a10 = null;
                            }
                            f.a.C0106a c0106a = (f.a.C0106a) a10;
                        }
                        gVar = hVar2.b(new h.a(bVar3, null, 4));
                    }
                    if (gVar != null) {
                        gVar.D();
                    }
                    if (gVar != null) {
                        cVar = gVar.e();
                    } else {
                        cVar = null;
                    }
                    if (cVar == null || cVar.d()) {
                        return null;
                    }
                    h9.c e10 = cVar.e();
                    LazyJavaPackageFragment lazyJavaPackageFragment = lazyJavaPackageScope.f13772o;
                    if (!g.a(e10, lazyJavaPackageFragment.f16379m)) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(cVar2, lazyJavaPackageFragment, gVar, null);
                    cVar2.f18762a.f18755s.a(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = LazyJavaPackageScope.b.C0153b.f13778a;
            if (!(bVar2 instanceof LazyJavaPackageScope.b.a)) {
            }
        }
        return null;
    }
}
