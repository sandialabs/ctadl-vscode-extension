package y9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import y9.g;

/* loaded from: classes.dex */
public final class y {
    public static final m0 a(m0 m0Var, boolean z10) {
        v7.g.f(m0Var, "<this>");
        g a10 = g.a.a(m0Var, z10);
        if (a10 != null) {
            return a10;
        }
        v b5 = b(m0Var);
        return b5 != null ? b5 : m0Var.Y0(false);
    }

    public static final v b(r rVar) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        IntersectionTypeConstructor intersectionTypeConstructor2;
        e0 U0 = rVar.U0();
        if (U0 instanceof IntersectionTypeConstructor) {
            intersectionTypeConstructor = (IntersectionTypeConstructor) U0;
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null) {
            return null;
        }
        LinkedHashSet<r> linkedHashSet = intersectionTypeConstructor.f14942b;
        ArrayList arrayList = new ArrayList(n7.l.Z1(linkedHashSet, 10));
        boolean z10 = false;
        for (r rVar2 : linkedHashSet) {
            if (kotlin.reflect.jvm.internal.impl.types.r.g(rVar2)) {
                rVar2 = a(rVar2.X0(), false);
                z10 = true;
            }
            arrayList.add(rVar2);
        }
        if (!z10) {
            intersectionTypeConstructor2 = null;
        } else {
            r rVar3 = intersectionTypeConstructor.f14941a;
            if (rVar3 != null) {
                if (kotlin.reflect.jvm.internal.impl.types.r.g(rVar3)) {
                    rVar3 = a(rVar3.X0(), false);
                }
            } else {
                rVar3 = null;
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            intersectionTypeConstructor2 = new IntersectionTypeConstructor(linkedHashSet2, rVar3);
        }
        if (intersectionTypeConstructor2 == null) {
            return null;
        }
        return intersectionTypeConstructor2.g();
    }

    public static final v c(v vVar, v vVar2) {
        v7.g.f(vVar, "<this>");
        v7.g.f(vVar2, "abbreviatedType");
        return m0.b.D0(vVar) ? vVar : new a(vVar, vVar2);
    }
}
