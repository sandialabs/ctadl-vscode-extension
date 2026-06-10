package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.b;
import l8.d;
import l8.e;
import l8.i0;
import ma.i;
import n7.s;
import n7.t;
import u7.l;
import v7.g;
import y9.e0;
import y9.f0;
import y9.h0;
import y9.j0;
import y9.m0;
import y9.n;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class TypeUtilsKt {
    public static final h0 a(r rVar) {
        g.f(rVar, "<this>");
        return new h0(rVar);
    }

    public static final boolean b(r rVar, l<? super m0, Boolean> lVar) {
        g.f(rVar, "<this>");
        g.f(lVar, "predicate");
        return kotlin.reflect.jvm.internal.impl.types.r.c(rVar, lVar);
    }

    public static final boolean c(r rVar, e0 e0Var, Set<? extends i0> set) {
        e eVar;
        List<i0> list;
        i0 i0Var;
        boolean z10;
        boolean z11;
        if (g.a(rVar.U0(), e0Var)) {
            return true;
        }
        d c = rVar.U0().c();
        if (c instanceof e) {
            eVar = (e) c;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            list = eVar.x();
        } else {
            list = null;
        }
        s R2 = c.R2(rVar.S0());
        if (!(R2 instanceof Collection) || !((Collection) R2).isEmpty()) {
            Iterator it = R2.iterator();
            do {
                t tVar = (t) it;
                if (tVar.hasNext()) {
                    n7.r rVar2 = (n7.r) tVar.next();
                    int i10 = rVar2.f16128a;
                    f0 f0Var = (f0) rVar2.f16129b;
                    if (list != null) {
                        i0Var = (i0) c.q2(i10, list);
                    } else {
                        i0Var = null;
                    }
                    if (i0Var != null && set != null && set.contains(i0Var)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !f0Var.d()) {
                        r b5 = f0Var.b();
                        g.e(b5, "argument.type");
                        z11 = c(b5, e0Var, set);
                        continue;
                    }
                    z11 = false;
                }
            } while (!z11);
            return true;
        }
        return false;
    }

    public static final boolean d(r rVar) {
        return b(rVar, TypeUtilsKt$containsTypeAliasParameters$1.f15077j);
    }

    public static final h0 e(r rVar, Variance variance, i0 i0Var) {
        g.f(rVar, "type");
        if ((i0Var != null ? i0Var.t() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new h0(rVar, variance);
    }

    public static final void f(r rVar, v vVar, LinkedHashSet linkedHashSet, Set set) {
        d c = rVar.U0().c();
        if (c instanceof i0) {
            if (!g.a(rVar.U0(), vVar.U0())) {
                linkedHashSet.add(c);
                return;
            }
            for (r rVar2 : ((i0) c).getUpperBounds()) {
                g.e(rVar2, "upperBound");
                f(rVar2, vVar, linkedHashSet, set);
            }
            return;
        }
        d c10 = rVar.U0().c();
        e eVar = c10 instanceof e ? (e) c10 : null;
        List<i0> x3 = eVar != null ? eVar.x() : null;
        int i10 = 0;
        for (f0 f0Var : rVar.S0()) {
            int i11 = i10 + 1;
            i0 i0Var = x3 != null ? (i0) c.q2(i10, x3) : null;
            if (!((i0Var == null || set == null || !set.contains(i0Var)) ? false : true) && !f0Var.d() && !c.h2(linkedHashSet, f0Var.b().U0().c()) && !g.a(f0Var.b().U0(), vVar.U0())) {
                r b5 = f0Var.b();
                g.e(b5, "argument.type");
                f(b5, vVar, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.e g(r rVar) {
        g.f(rVar, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = rVar.U0().u();
        g.e(u10, "constructor.builtIns");
        return u10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r h(i0 i0Var) {
        b bVar;
        boolean z10;
        List<r> upperBounds = i0Var.getUpperBounds();
        g.e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<r> upperBounds2 = i0Var.getUpperBounds();
        g.e(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            d c = ((r) next).U0().c();
            bVar = c instanceof b ? (b) c : null;
            if (bVar != null && bVar.h() != ClassKind.f13432j && bVar.h() != ClassKind.f13435m) {
                z10 = true;
                continue;
                if (z10) {
                    bVar = next;
                    break;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        r rVar = (r) bVar;
        if (rVar == null) {
            List<r> upperBounds3 = i0Var.getUpperBounds();
            g.e(upperBounds3, "upperBounds");
            Object n22 = c.n2(upperBounds3);
            g.e(n22, "upperBounds.first()");
            return (r) n22;
        }
        return rVar;
    }

    public static final boolean i(i0 i0Var, e0 e0Var, Set<? extends i0> set) {
        boolean z10;
        g.f(i0Var, "typeParameter");
        List<r> upperBounds = i0Var.getUpperBounds();
        g.e(upperBounds, "typeParameter.upperBounds");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (r rVar : upperBounds) {
            g.e(rVar, "upperBound");
            if (c(rVar, i0Var.r().U0(), set) && (e0Var == null || g.a(rVar.U0(), e0Var))) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(r rVar, r rVar2) {
        g.f(rVar2, "superType");
        return kotlin.reflect.jvm.internal.impl.types.checker.d.f14997a.d(rVar, rVar2);
    }

    public static final m0 k(r rVar) {
        g.f(rVar, "<this>");
        return kotlin.reflect.jvm.internal.impl.types.r.j(rVar, true);
    }

    public static final r l(r rVar, m8.e eVar) {
        return (rVar.getAnnotations().isEmpty() && eVar.isEmpty()) ? rVar : rVar.X0().a1(i.J(rVar.T0(), eVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [y9.m0] */
    public static final m0 m(r rVar) {
        v vVar;
        g.f(rVar, "<this>");
        m0 X0 = rVar.X0();
        if (X0 instanceof n) {
            n nVar = (n) X0;
            v vVar2 = nVar.f18958j;
            if (!vVar2.U0().e().isEmpty() && vVar2.U0().c() != null) {
                List<i0> e10 = vVar2.U0().e();
                g.e(e10, "constructor.parameters");
                ArrayList arrayList = new ArrayList(n7.l.Z1(e10, 10));
                for (i0 i0Var : e10) {
                    arrayList.add(new StarProjectionImpl(i0Var));
                }
                vVar2 = j0.d(vVar2, arrayList, null, 2);
            }
            v vVar3 = nVar.f18959k;
            if (!vVar3.U0().e().isEmpty() && vVar3.U0().c() != null) {
                List<i0> e11 = vVar3.U0().e();
                g.e(e11, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(n7.l.Z1(e11, 10));
                for (i0 i0Var2 : e11) {
                    arrayList2.add(new StarProjectionImpl(i0Var2));
                }
                vVar3 = j0.d(vVar3, arrayList2, null, 2);
            }
            vVar = KotlinTypeFactory.c(vVar2, vVar3);
        } else if (X0 instanceof v) {
            v vVar4 = (v) X0;
            boolean isEmpty = vVar4.U0().e().isEmpty();
            vVar = vVar4;
            if (!isEmpty) {
                if (vVar4.U0().c() == null) {
                    vVar = vVar4;
                } else {
                    List<i0> e12 = vVar4.U0().e();
                    g.e(e12, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(n7.l.Z1(e12, 10));
                    for (i0 i0Var3 : e12) {
                        arrayList3.add(new StarProjectionImpl(i0Var3));
                    }
                    vVar = j0.d(vVar4, arrayList3, null, 2);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return a1.b.f0(vVar, X0);
    }

    public static final boolean n(v vVar) {
        return b(vVar, TypeUtilsKt$requiresTypeAliasExpansion$1.f15078j);
    }
}
