package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import a1.b;
import ca.a;
import ca.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.d;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import n7.l;
import v7.g;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.j0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class CapturedTypeApproximationKt {
    public static final a<r> a(r rVar) {
        Object c;
        Variance b5;
        c cVar;
        g.f(rVar, "type");
        if (b.k0(rVar)) {
            a<r> a10 = a(b.q0(rVar));
            a<r> a11 = a(b.K0(rVar));
            return new a<>(b.f0(KotlinTypeFactory.c(b.q0(a10.f6583a), b.K0(a11.f6583a)), rVar), b.f0(KotlinTypeFactory.c(b.q0(a10.f6584b), b.K0(a11.f6584b)), rVar));
        }
        e0 U0 = rVar.U0();
        boolean z10 = true;
        if (rVar.U0() instanceof l9.b) {
            g.d(U0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            f0 b10 = ((l9.b) U0).b();
            r b11 = b10.b();
            g.e(b11, "typeProjection.type");
            r k3 = kotlin.reflect.jvm.internal.impl.types.r.k(b11, rVar.V0());
            int ordinal = b10.a().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    v o10 = TypeUtilsKt.g(rVar).o();
                    g.e(o10, "type.builtIns.nothingType");
                    return new a<>(kotlin.reflect.jvm.internal.impl.types.r.k(o10, rVar.V0()), k3);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + b10);
            }
            v p10 = TypeUtilsKt.g(rVar).p();
            g.e(p10, "type.builtIns.nullableAnyType");
            return new a<>(k3, p10);
        }
        if (!rVar.S0().isEmpty() && rVar.S0().size() == U0.e().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<f0> S0 = rVar.S0();
            List<i0> e10 = U0.e();
            g.e(e10, "typeConstructor.parameters");
            Iterator it = kotlin.collections.c.S2(S0, e10).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                f0 f0Var = (f0) pair.f12962i;
                i0 i0Var = (i0) pair.f12963j;
                g.e(i0Var, "typeParameter");
                Variance t10 = i0Var.t();
                if (t10 != null) {
                    if (f0Var != null) {
                        TypeSubstitutor typeSubstitutor = TypeSubstitutor.f14961b;
                        if (f0Var.d()) {
                            b5 = Variance.OUT_VARIANCE;
                        } else {
                            b5 = TypeSubstitutor.b(t10, f0Var.a());
                        }
                        int ordinal2 = b5.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    v o11 = DescriptorUtilsKt.e(i0Var).o();
                                    g.e(o11, "typeParameter.builtIns.nothingType");
                                    r b12 = f0Var.b();
                                    g.e(b12, "type");
                                    cVar = new c(i0Var, o11, b12);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                r b13 = f0Var.b();
                                g.e(b13, "type");
                                v p11 = DescriptorUtilsKt.e(i0Var).p();
                                g.e(p11, "typeParameter.builtIns.nullableAnyType");
                                cVar = new c(i0Var, b13, p11);
                            }
                        } else {
                            r b14 = f0Var.b();
                            g.e(b14, "type");
                            r b15 = f0Var.b();
                            g.e(b15, "type");
                            cVar = new c(i0Var, b14, b15);
                        }
                        if (f0Var.d()) {
                            arrayList.add(cVar);
                            arrayList2.add(cVar);
                        } else {
                            a<r> a12 = a(cVar.f6586b);
                            a<r> a13 = a(cVar.c);
                            i0 i0Var2 = cVar.f6585a;
                            c cVar2 = new c(i0Var2, a12.f6584b, a13.f6583a);
                            c cVar3 = new c(i0Var2, a12.f6583a, a13.f6584b);
                            arrayList.add(cVar2);
                            arrayList2.add(cVar3);
                        }
                    } else {
                        TypeSubstitutor.a(36);
                        throw null;
                    }
                } else {
                    TypeSubstitutor.a(35);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    cVar4.getClass();
                    if (!d.f14997a.d(cVar4.f6586b, cVar4.c)) {
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                c = TypeUtilsKt.g(rVar).o();
                g.e(c, "type.builtIns.nothingType");
            } else {
                c = c(arrayList, rVar);
            }
            return new a<>(c, c(arrayList2, rVar));
        }
        return new a<>(rVar, rVar);
    }

    public static final f0 b(f0 f0Var, boolean z10) {
        if (f0Var == null) {
            return null;
        }
        if (f0Var.d()) {
            return f0Var;
        }
        r b5 = f0Var.b();
        g.e(b5, "typeProjection.type");
        if (!kotlin.reflect.jvm.internal.impl.types.r.c(b5, CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1.f15079j)) {
            return f0Var;
        }
        Variance a10 = f0Var.a();
        g.e(a10, "typeProjection.projectionKind");
        if (a10 == Variance.OUT_VARIANCE) {
            return new h0(a(b5).f6584b, a10);
        }
        if (z10) {
            return new h0(a(b5).f6583a, a10);
        }
        TypeSubstitutor d5 = TypeSubstitutor.d(new ca.b());
        if (!d5.h()) {
            try {
                return d5.l(f0Var, null, 0);
            } catch (TypeSubstitutor.SubstitutionException unused) {
                return null;
            }
        }
        return f0Var;
    }

    public static final r c(ArrayList arrayList, r rVar) {
        h0 h0Var;
        boolean z10;
        rVar.S0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.getClass();
            d.f14997a.d(cVar.f6586b, cVar.c);
            r rVar2 = cVar.f6586b;
            r rVar3 = cVar.c;
            if (!g.a(rVar2, rVar3)) {
                i0 i0Var = cVar.f6585a;
                Variance t10 = i0Var.t();
                Variance variance = Variance.IN_VARIANCE;
                if (t10 != variance) {
                    boolean F = e.F(rVar2);
                    Variance variance2 = Variance.OUT_VARIANCE;
                    Variance variance3 = Variance.INVARIANT;
                    if (F && i0Var.t() != variance) {
                        if (variance2 == i0Var.t()) {
                            variance2 = variance3;
                        }
                        h0Var = new h0(rVar3, variance2);
                    } else if (rVar3 != null) {
                        if (e.y(rVar3) && rVar3.V0()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (variance == i0Var.t()) {
                                variance = variance3;
                            }
                            h0Var = new h0(rVar2, variance);
                        } else {
                            if (variance2 == i0Var.t()) {
                                variance2 = variance3;
                            }
                            h0Var = new h0(rVar3, variance2);
                        }
                    } else {
                        e.a(140);
                        throw null;
                    }
                    arrayList2.add(h0Var);
                }
            }
            h0Var = new h0(rVar2);
            arrayList2.add(h0Var);
        }
        return j0.c(rVar, arrayList2, null, 6);
    }
}
