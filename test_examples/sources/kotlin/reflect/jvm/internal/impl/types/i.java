package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j;
import kotlin.reflect.jvm.internal.impl.types.k;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.h0;
import l8.i0;
import y9.c0;
import y9.e0;
import y9.f0;
import y9.j0;
import y9.m0;
import y9.v;
import y9.y;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final k f15039a = k.a.f15044a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15040b = false;

    public static l b(y9.r rVar, l lVar) {
        y9.c a10;
        boolean D0 = m0.b.D0(rVar);
        l T0 = rVar.T0();
        if (D0) {
            return T0;
        }
        lVar.getClass();
        v7.g.f(T0, "other");
        if (!lVar.isEmpty() || !T0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Collection<Integer> values = l.f15045j.f15093a.values();
            v7.g.e(values, "idPerType.values");
            for (Integer num : values) {
                int intValue = num.intValue();
                c0 c0Var = (c0) lVar.f10480i.get(intValue);
                c0 c0Var2 = (c0) T0.f10480i.get(intValue);
                if (c0Var == null) {
                    if (c0Var2 != null) {
                        a10 = c0Var2.a(c0Var);
                    } else {
                        a10 = null;
                    }
                } else {
                    a10 = c0Var.a(c0Var2);
                }
                m0.b.u(arrayList, a10);
            }
            return l.a.c(arrayList);
        }
        return lVar;
    }

    public final void a(m8.e eVar, m8.e eVar2) {
        HashSet hashSet = new HashSet();
        Iterator<m8.c> it = eVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().e());
        }
        for (m8.c cVar : eVar2) {
            if (hashSet.contains(cVar.e())) {
                this.f15039a.b(cVar);
            }
        }
    }

    public final v c(j jVar, l lVar, boolean z10, int i10, boolean z11) {
        Variance variance = Variance.INVARIANT;
        h0 h0Var = jVar.f15042b;
        f0 d5 = d(new y9.h0(h0Var.F(), variance), jVar, null, i10);
        y9.r b5 = d5.b();
        v7.g.e(b5, "expandedProjection.type");
        v a10 = j0.a(b5);
        if (m0.b.D0(a10)) {
            return a10;
        }
        d5.a();
        a(a10.getAnnotations(), d.a(lVar));
        if (!m0.b.D0(a10)) {
            a10 = j0.d(a10, null, b(a10, lVar), 1);
        }
        v l2 = r.l(a10, z10);
        v7.g.e(l2, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z11) {
            e0 o10 = h0Var.o();
            v7.g.e(o10, "descriptor.typeConstructor");
            return y.c(l2, KotlinTypeFactory.g(jVar.c, MemberScope.a.f14741b, lVar, o10, z10));
        }
        return l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f0 d(f0 f0Var, j jVar, i0 i0Var, int i10) {
        Variance variance;
        m0 m0Var;
        h0 h0Var = jVar.f15042b;
        if (i10 <= 100) {
            if (!f0Var.d()) {
                y9.r b5 = f0Var.b();
                v7.g.e(b5, "underlyingProjection.type");
                e0 U0 = b5.U0();
                v7.g.f(U0, "constructor");
                l8.d c = U0.c();
                f0 f0Var2 = c instanceof i0 ? jVar.f15043d.get(c) : null;
                Variance variance2 = Variance.INVARIANT;
                k kVar = this.f15039a;
                if (f0Var2 == null) {
                    m0 X0 = f0Var.b().X0();
                    if (!f.a(X0)) {
                        v a10 = j0.a(X0);
                        if (!m0.b.D0(a10) && TypeUtilsKt.n(a10)) {
                            e0 U02 = a10.U0();
                            l8.d c10 = U02.c();
                            U02.e().size();
                            a10.S0().size();
                            if (!(c10 instanceof i0)) {
                                int i11 = 0;
                                if (c10 instanceof h0) {
                                    h0 h0Var2 = (h0) c10;
                                    if (jVar.a(h0Var2)) {
                                        kVar.c(h0Var2);
                                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                                        String str = h0Var2.getName().f11572i;
                                        v7.g.e(str, "typeDescriptor.name.toString()");
                                        return new y9.h0(aa.h.c(errorTypeKind, str), variance2);
                                    }
                                    List<f0> S0 = a10.S0();
                                    ArrayList arrayList = new ArrayList(n7.l.Z1(S0, 10));
                                    for (Object obj : S0) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            a1.c.F1();
                                            throw null;
                                        }
                                        arrayList.add(d((f0) obj, jVar, U02.e().get(i11), i10 + 1));
                                        i11 = i12;
                                    }
                                    v c11 = c(j.a.a(jVar, h0Var2, arrayList), a10.T0(), a10.V0(), i10 + 1, false);
                                    v e10 = e(a10, jVar, i10);
                                    if (!f.a(c11)) {
                                        c11 = y.c(c11, e10);
                                    }
                                    return new y9.h0(c11, f0Var.a());
                                }
                                v e11 = e(a10, jVar, i10);
                                TypeSubstitutor e12 = TypeSubstitutor.e(e11);
                                for (Object obj2 : e11.S0()) {
                                    int i13 = i11 + 1;
                                    if (i11 < 0) {
                                        a1.c.F1();
                                        throw null;
                                    }
                                    f0 f0Var3 = (f0) obj2;
                                    if (!f0Var3.d()) {
                                        y9.r b10 = f0Var3.b();
                                        v7.g.e(b10, "substitutedArgument.type");
                                        if (!TypeUtilsKt.d(b10)) {
                                            f0 f0Var4 = a10.S0().get(i11);
                                            i0 i0Var2 = a10.U0().e().get(i11);
                                            if (this.f15040b) {
                                                y9.r b11 = f0Var4.b();
                                                v7.g.e(b11, "unsubstitutedArgument.type");
                                                y9.r b12 = f0Var3.b();
                                                v7.g.e(b12, "substitutedArgument.type");
                                                v7.g.e(i0Var2, "typeParameter");
                                                kVar.d(e12, b11, b12, i0Var2);
                                            }
                                        }
                                    }
                                    i11 = i13;
                                }
                                return new y9.h0(e11, f0Var.a());
                            }
                        }
                    }
                    return f0Var;
                } else if (!f0Var2.d()) {
                    m0 X02 = f0Var2.b().X0();
                    Variance a11 = f0Var2.a();
                    v7.g.e(a11, "argument.projectionKind");
                    Variance a12 = f0Var.a();
                    v7.g.e(a12, "underlyingProjection.projectionKind");
                    if (a12 != a11 && a12 != variance2) {
                        if (a11 == variance2) {
                            a11 = a12;
                        } else {
                            kVar.a(h0Var, X02);
                        }
                    }
                    if (i0Var == null || (variance = i0Var.t()) == null) {
                        variance = variance2;
                    }
                    if (variance != a11 && variance != variance2) {
                        if (a11 == variance2) {
                            a(b5.getAnnotations(), X02.getAnnotations());
                            if (!(X02 instanceof y9.l)) {
                                y9.l lVar = (y9.l) X02;
                                l b13 = b(lVar, b5.T0());
                                v7.g.f(b13, "newAttributes");
                                m0Var = new y9.l(TypeUtilsKt.g(lVar.f18959k), b13);
                            } else {
                                v l2 = r.l(j0.a(X02), b5.V0());
                                v7.g.e(l2, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
                                m0Var = m0.b.D0(l2) ? l2 : j0.d(l2, null, b(l2, b5.T0()), 1);
                            }
                            return new y9.h0(m0Var, variance2);
                        }
                        kVar.a(h0Var, X02);
                    }
                    variance2 = a11;
                    a(b5.getAnnotations(), X02.getAnnotations());
                    if (!(X02 instanceof y9.l)) {
                    }
                    return new y9.h0(m0Var, variance2);
                }
            }
            v7.g.c(i0Var);
            return r.m(i0Var);
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + h0Var.getName());
    }

    public final v e(v vVar, j jVar, int i10) {
        e0 U0 = vVar.U0();
        List<f0> S0 = vVar.S0();
        ArrayList arrayList = new ArrayList(n7.l.Z1(S0, 10));
        int i11 = 0;
        for (Object obj : S0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a1.c.F1();
                throw null;
            }
            f0 f0Var = (f0) obj;
            f0 d5 = d(f0Var, jVar, U0.e().get(i11), i10 + 1);
            if (!d5.d()) {
                d5 = new y9.h0(r.k(d5.b(), f0Var.b().V0()), d5.a());
            }
            arrayList.add(d5);
            i11 = i12;
        }
        return j0.d(vVar, arrayList, null, 2);
    }
}
