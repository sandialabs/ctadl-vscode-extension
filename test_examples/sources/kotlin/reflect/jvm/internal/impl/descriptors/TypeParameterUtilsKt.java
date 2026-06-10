package kotlin.reflect.jvm.internal.impl.descriptors;

import ga.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.i0;
import n7.l;
import y9.e0;
import y9.f0;
import y9.v;

/* loaded from: classes.dex */
public final class TypeParameterUtilsKt {
    public static final m4.c a(v vVar, l8.e eVar, int i10) {
        if (eVar != null && !aa.h.f(eVar)) {
            int size = eVar.x().size() + i10;
            if (eVar.m0()) {
                List<f0> subList = vVar.S0().subList(i10, size);
                l8.f c = eVar.c();
                return new m4.c(eVar, subList, a(vVar, c instanceof l8.e ? (l8.e) c : null, size));
            }
            if (size != vVar.S0().size()) {
                k9.d.o(eVar);
            }
            return new m4.c(eVar, vVar.S0().subList(i10, vVar.S0().size()), (m4.c) null);
        }
        return null;
    }

    public static final List<i0> b(l8.e eVar) {
        List<i0> list;
        l8.f fVar;
        e0 o10;
        v7.g.f(eVar, "<this>");
        List<i0> x3 = eVar.x();
        v7.g.e(x3, "declaredTypeParameters");
        if (!eVar.m0() && !(eVar.c() instanceof a)) {
            return x3;
        }
        ga.h<l8.f> k3 = DescriptorUtilsKt.k(eVar);
        TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 = TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.f13463j;
        v7.g.f(k3, "<this>");
        v7.g.f(typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1, "predicate");
        List a12 = a1.c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.V0(kotlin.sequences.a.R0(new o(k3, typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.f13464j), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.f13465j)));
        Iterator<l8.f> it = DescriptorUtilsKt.k(eVar).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                fVar = it.next();
                if (fVar instanceof l8.b) {
                    break;
                }
            } else {
                fVar = null;
                break;
            }
        }
        l8.b bVar = (l8.b) fVar;
        if (bVar != null && (o10 = bVar.o()) != null) {
            list = o10.e();
        }
        if (list == null) {
            list = EmptyList.f12981i;
        }
        if (a12.isEmpty() && list.isEmpty()) {
            List<i0> x10 = eVar.x();
            v7.g.e(x10, "declaredTypeParameters");
            return x10;
        }
        ArrayList z22 = kotlin.collections.c.z2(list, a12);
        ArrayList arrayList = new ArrayList(l.Z1(z22, 10));
        Iterator it2 = z22.iterator();
        while (it2.hasNext()) {
            i0 i0Var = (i0) it2.next();
            v7.g.e(i0Var, "it");
            arrayList.add(new l8.a(i0Var, eVar, x3.size()));
        }
        return kotlin.collections.c.z2(arrayList, x3);
    }
}
