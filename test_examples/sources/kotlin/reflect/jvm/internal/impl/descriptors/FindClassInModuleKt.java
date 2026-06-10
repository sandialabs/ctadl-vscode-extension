package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import k9.n;
import k9.o;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import l8.s;
import l8.x;

/* loaded from: classes.dex */
public final class FindClassInModuleKt {
    public static final l8.b a(s sVar, h9.b bVar) {
        v7.g.f(sVar, "<this>");
        v7.g.f(bVar, "classId");
        l8.d b5 = b(sVar, bVar);
        if (b5 instanceof l8.b) {
            return (l8.b) b5;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l8.d b(s sVar, h9.b bVar) {
        s sVar2;
        l8.d e10;
        v7.g.f(sVar, "<this>");
        v7.g.f(bVar, "classId");
        n nVar = (n) sVar.k0(o.f12950a);
        if (nVar != null) {
            sVar2 = nVar.a();
        } else {
            sVar2 = null;
        }
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_DESERIALIZATION;
        if (sVar2 == null) {
            h9.c h10 = bVar.h();
            v7.g.e(h10, "classId.packageFqName");
            x t02 = sVar.t0(h10);
            List<h9.e> f10 = bVar.i().f11564a.f();
            MemberScope w10 = t02.w();
            Object n22 = kotlin.collections.c.n2(f10);
            v7.g.e(n22, "segments.first()");
            e10 = w10.e((h9.e) n22, noLookupLocation);
            if (e10 == null) {
                return null;
            }
            for (h9.e eVar : f10.subList(1, f10.size())) {
                if (!(e10 instanceof l8.b)) {
                    return null;
                }
                MemberScope w02 = ((l8.b) e10).w0();
                v7.g.e(eVar, "name");
                l8.d e11 = w02.e(eVar, noLookupLocation);
                if (e11 instanceof l8.b) {
                    e10 = (l8.b) e11;
                } else {
                    e10 = null;
                }
                if (e10 == null) {
                    return null;
                }
            }
        } else {
            h9.c h11 = bVar.h();
            v7.g.e(h11, "classId.packageFqName");
            x t03 = sVar2.t0(h11);
            List<h9.e> f11 = bVar.i().f11564a.f();
            MemberScope w11 = t03.w();
            Object n23 = kotlin.collections.c.n2(f11);
            v7.g.e(n23, "segments.first()");
            l8.d e12 = w11.e((h9.e) n23, noLookupLocation);
            if (e12 != null) {
                for (h9.e eVar2 : f11.subList(1, f11.size())) {
                    if (e12 instanceof l8.b) {
                        MemberScope w03 = ((l8.b) e12).w0();
                        v7.g.e(eVar2, "name");
                        l8.d e13 = w03.e(eVar2, noLookupLocation);
                        if (e13 instanceof l8.b) {
                            e12 = (l8.b) e13;
                        } else {
                            e12 = null;
                        }
                        if (e12 != null) {
                        }
                    }
                }
                if (e12 != null) {
                    h9.c h12 = bVar.h();
                    v7.g.e(h12, "classId.packageFqName");
                    x t04 = sVar.t0(h12);
                    List<h9.e> f12 = bVar.i().f11564a.f();
                    MemberScope w12 = t04.w();
                    Object n24 = kotlin.collections.c.n2(f12);
                    v7.g.e(n24, "segments.first()");
                    e10 = w12.e((h9.e) n24, noLookupLocation);
                    if (e10 == null) {
                        return null;
                    }
                    for (h9.e eVar3 : f12.subList(1, f12.size())) {
                        if (!(e10 instanceof l8.b)) {
                            return null;
                        }
                        MemberScope w04 = ((l8.b) e10).w0();
                        v7.g.e(eVar3, "name");
                        l8.d e14 = w04.e(eVar3, noLookupLocation);
                        if (e14 instanceof l8.b) {
                            e10 = (l8.b) e14;
                        } else {
                            e10 = null;
                        }
                        if (e10 == null) {
                            return null;
                        }
                    }
                } else {
                    return e12;
                }
            }
            e12 = null;
            if (e12 != null) {
            }
        }
        return e10;
    }

    public static final l8.b c(s sVar, h9.b bVar, NotFoundClasses notFoundClasses) {
        v7.g.f(sVar, "<this>");
        v7.g.f(bVar, "classId");
        v7.g.f(notFoundClasses, "notFoundClasses");
        l8.b a10 = a(sVar, bVar);
        if (a10 != null) {
            return a10;
        }
        return notFoundClasses.a(bVar, a1.c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.W0(SequencesKt__SequencesKt.O0(bVar, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.f13437r), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.f13438j))));
    }
}
