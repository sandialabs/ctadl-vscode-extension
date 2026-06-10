package qa;

import c8.k;
import c8.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializersCacheKt;
import n7.l;
import ua.g1;
import ua.o1;
import v7.g;

/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public static final b a(xa.b bVar, k kVar, boolean z10) {
        g1<? extends Object> g1Var;
        b<? extends Object> bVar2;
        b bVar3;
        c8.b<Object> L0 = m0.b.L0(kVar);
        boolean b5 = kVar.b();
        List<m> a10 = kVar.a();
        ArrayList arrayList = new ArrayList(l.Z1(a10, 10));
        for (m mVar : a10) {
            k kVar2 = mVar.f6562b;
            if (kVar2 != null) {
                arrayList.add(kVar2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kVar).toString());
            }
        }
        if (arrayList.isEmpty()) {
            o1<? extends Object> o1Var = SerializersCacheKt.f15588a;
            g.f(L0, "clazz");
            if (!b5) {
                bVar2 = SerializersCacheKt.f15588a.a(L0);
                if (bVar2 == null) {
                    bVar2 = null;
                }
            } else {
                bVar2 = SerializersCacheKt.f15589b.a(L0);
            }
        } else {
            o1<? extends Object> o1Var2 = SerializersCacheKt.f15588a;
            g.f(L0, "clazz");
            if (!b5) {
                g1Var = SerializersCacheKt.c;
            } else {
                g1Var = SerializersCacheKt.f15590d;
            }
            Object a11 = g1Var.a(L0, arrayList);
            if (z10) {
                if (a11 instanceof Result.Failure) {
                    a11 = null;
                }
            } else if (Result.a(a11) != null) {
                return null;
            }
            bVar2 = (b) a11;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (arrayList.isEmpty()) {
            bVar3 = bVar.w0(L0, EmptyList.f12981i);
        } else {
            ArrayList r1 = a1.c.r1(bVar, arrayList, z10);
            if (r1 == null) {
                return null;
            }
            b g12 = a1.c.g1(L0, arrayList, r1);
            if (g12 == null) {
                bVar3 = bVar.w0(L0, r1);
            } else {
                bVar3 = g12;
            }
        }
        if (bVar3 == null) {
            return null;
        }
        if (b5) {
            bVar3 = ra.a.a(bVar3);
        }
        return bVar3;
    }
}
