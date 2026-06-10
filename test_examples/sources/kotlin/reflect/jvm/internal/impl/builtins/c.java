package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import m8.e;
import m9.k;
import ma.i;
import n7.l;
import y9.f0;
import y9.h0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class c {
    public static final int a(r rVar) {
        v7.g.f(rVar, "<this>");
        m8.c j2 = rVar.getAnnotations().j(g.a.f13374q);
        if (j2 == null) {
            return 0;
        }
        m9.g gVar = (m9.g) kotlin.collections.d.L1(g.f13347d, j2.a());
        v7.g.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((k) gVar).f16022a).intValue();
    }

    public static final v b(e eVar, m8.e eVar2, r rVar, List list, ArrayList arrayList, r rVar2, boolean z10) {
        int i10;
        h0 h0Var;
        l8.b k3;
        v7.g.f(list, "contextReceiverTypes");
        int size = list.size() + arrayList.size();
        int i11 = 0;
        if (rVar != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i10 + 1);
        ArrayList arrayList3 = new ArrayList(l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(TypeUtilsKt.a((r) it.next()));
        }
        arrayList2.addAll(arrayList3);
        if (rVar != null) {
            h0Var = TypeUtilsKt.a(rVar);
        } else {
            h0Var = null;
        }
        m0.b.u(arrayList2, h0Var);
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            m8.e eVar3 = e.a.f16014a;
            if (hasNext) {
                Object next = it2.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    arrayList2.add(TypeUtilsKt.a((r) next));
                    i12 = i13;
                } else {
                    a1.c.F1();
                    throw null;
                }
            } else {
                arrayList2.add(TypeUtilsKt.a(rVar2));
                int size2 = list.size() + arrayList.size();
                if (rVar != null) {
                    i11 = 1;
                }
                int i14 = size2 + i11;
                if (z10) {
                    k3 = eVar.w(i14);
                } else {
                    h9.e eVar4 = g.f13345a;
                    k3 = eVar.k("Function" + i14);
                }
                v7.g.e(k3, "if (isSuspendFunction) b…tFunction(parameterCount)");
                if (rVar != null) {
                    h9.c cVar = g.a.f13373p;
                    if (!eVar2.i(cVar)) {
                        ArrayList y22 = kotlin.collections.c.y2(eVar2, new BuiltInAnnotationDescriptor(eVar, cVar, kotlin.collections.d.K1()));
                        if (y22.isEmpty()) {
                            eVar2 = eVar3;
                        } else {
                            eVar2 = new m8.f(y22);
                        }
                    }
                }
                if (!list.isEmpty()) {
                    int size3 = list.size();
                    h9.c cVar2 = g.a.f13374q;
                    if (eVar2.i(cVar2)) {
                        eVar3 = eVar2;
                    } else {
                        ArrayList y23 = kotlin.collections.c.y2(eVar2, new BuiltInAnnotationDescriptor(eVar, cVar2, m0.b.P0(new Pair(g.f13347d, new k(size3)))));
                        if (!y23.isEmpty()) {
                            eVar3 = new m8.f(y23);
                        }
                    }
                    eVar2 = eVar3;
                }
                return KotlinTypeFactory.e(i.Q(eVar2), k3, arrayList2);
            }
        }
    }

    public static final h9.e c(r rVar) {
        String str;
        m8.c j2 = rVar.getAnnotations().j(g.a.f13375r);
        if (j2 == null) {
            return null;
        }
        Object D2 = kotlin.collections.c.D2(j2.a().values());
        m9.r rVar2 = D2 instanceof m9.r ? (m9.r) D2 : null;
        if (rVar2 != null && (str = (String) rVar2.f16022a) != null) {
            if (!h9.e.l(str)) {
                str = null;
            }
            if (str != null) {
                return h9.e.k(str);
            }
        }
        return null;
    }

    public static final List<r> d(r rVar) {
        v7.g.f(rVar, "<this>");
        h(rVar);
        int a10 = a(rVar);
        if (a10 == 0) {
            return EmptyList.f12981i;
        }
        List<f0> subList = rVar.S0().subList(0, a10);
        ArrayList arrayList = new ArrayList(l.Z1(subList, 10));
        for (f0 f0Var : subList) {
            r b5 = f0Var.b();
            v7.g.e(b5, "it.type");
            arrayList.add(b5);
        }
        return arrayList;
    }

    public static final FunctionClassKind e(l8.d dVar) {
        if (!(dVar instanceof l8.b) || !e.L(dVar)) {
            return null;
        }
        h9.d h10 = DescriptorUtilsKt.h(dVar);
        if (h10.e() && !h10.d()) {
            FunctionClassKind.a aVar = FunctionClassKind.f13334k;
            String b5 = h10.g().b();
            v7.g.e(b5, "shortName().asString()");
            h9.c e10 = h10.h().e();
            v7.g.e(e10, "toSafe().parent()");
            aVar.getClass();
            FunctionClassKind.a.C0148a a10 = FunctionClassKind.a.a(b5, e10);
            if (a10 == null) {
                return null;
            }
            return a10.f13341a;
        }
        return null;
    }

    public static final r f(r rVar) {
        boolean z10;
        v7.g.f(rVar, "<this>");
        h(rVar);
        if (rVar.getAnnotations().j(g.a.f13373p) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return rVar.S0().get(a(rVar)).b();
    }

    public static final List<f0> g(r rVar) {
        boolean z10;
        v7.g.f(rVar, "<this>");
        h(rVar);
        List<f0> S0 = rVar.S0();
        int a10 = a(rVar);
        int i10 = 0;
        if (h(rVar)) {
            if (rVar.getAnnotations().j(g.a.f13373p) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = 1;
            }
        }
        return S0.subList(i10 + a10, S0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(r rVar) {
        boolean z10;
        v7.g.f(rVar, "<this>");
        l8.d c = rVar.U0().c();
        if (c == null) {
            return false;
        }
        FunctionClassKind e10 = e(c);
        if (e10 != FunctionClassKind.f13335l && e10 != FunctionClassKind.f13336m) {
            z10 = false;
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    public static final boolean i(r rVar) {
        v7.g.f(rVar, "<this>");
        l8.d c = rVar.U0().c();
        return (c != null ? e(c) : null) == FunctionClassKind.f13336m;
    }
}
