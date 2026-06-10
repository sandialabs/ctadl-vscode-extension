package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.l;
import n7.l;
import n7.n;
import u7.p;
import y9.b0;
import y9.c0;
import y9.e0;
import y9.g;
import y9.m0;
import y9.r;
import y9.v;
import y9.y;

/* loaded from: classes.dex */
public final class TypeIntersector {

    /* renamed from: a  reason: collision with root package name */
    public static final TypeIntersector f14989a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class ResultNullability {

        /* renamed from: i  reason: collision with root package name */
        public static final START f14990i;

        /* renamed from: j  reason: collision with root package name */
        public static final ACCEPT_NULL f14991j;

        /* renamed from: k  reason: collision with root package name */
        public static final UNKNOWN f14992k;

        /* renamed from: l  reason: collision with root package name */
        public static final NOT_NULL f14993l;

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ ResultNullability[] f14994m;

        /* loaded from: classes.dex */
        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(m0 m0Var) {
                v7.g.f(m0Var, "nextType");
                return ResultNullability.b(m0Var);
            }
        }

        /* loaded from: classes.dex */
        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(m0 m0Var) {
                v7.g.f(m0Var, "nextType");
                return this;
            }
        }

        /* loaded from: classes.dex */
        public static final class START extends ResultNullability {
            public START() {
                super("START", 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(m0 m0Var) {
                v7.g.f(m0Var, "nextType");
                return ResultNullability.b(m0Var);
            }
        }

        /* loaded from: classes.dex */
        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability a(m0 m0Var) {
                v7.g.f(m0Var, "nextType");
                ResultNullability b5 = ResultNullability.b(m0Var);
                return b5 == ResultNullability.f14991j ? this : b5;
            }
        }

        static {
            START start = new START();
            f14990i = start;
            ACCEPT_NULL accept_null = new ACCEPT_NULL();
            f14991j = accept_null;
            UNKNOWN unknown = new UNKNOWN();
            f14992k = unknown;
            NOT_NULL not_null = new NOT_NULL();
            f14993l = not_null;
            f14994m = new ResultNullability[]{start, accept_null, unknown, not_null};
        }

        public ResultNullability() {
            throw null;
        }

        public ResultNullability(String str, int i10) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            if (kotlin.reflect.jvm.internal.impl.types.a.a(kotlin.reflect.jvm.internal.impl.types.checker.a.a(false, true, kotlin.reflect.jvm.internal.impl.types.checker.h.f15004a, null, null, 24), a1.b.q0(r9), kotlin.reflect.jvm.internal.impl.types.m.b.C0169b.f15055a) == false) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ResultNullability b(m0 m0Var) {
            v7.g.f(m0Var, "<this>");
            if (m0Var.V0()) {
                return f14991j;
            }
            boolean z10 = m0Var instanceof y9.g;
            NOT_NULL not_null = f14993l;
            if (!z10 || !(((y9.g) m0Var).f18947j instanceof b0)) {
                boolean z11 = m0Var instanceof b0;
                UNKNOWN unknown = f14992k;
                if (!z11) {
                }
                return unknown;
            }
            return not_null;
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) f14994m.clone();
        }

        public abstract ResultNullability a(m0 m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(AbstractCollection abstractCollection, p pVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        v7.g.e(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            v vVar = (v) it.next();
            boolean z11 = false;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    v vVar2 = (v) it2.next();
                    if (vVar2 != vVar) {
                        v7.g.e(vVar2, "lower");
                        v7.g.e(vVar, "upper");
                        if (((Boolean) pVar.R(vVar2, vVar)).booleanValue()) {
                            z10 = true;
                            continue;
                            if (z10) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    continue;
                    if (z10) {
                    }
                }
            }
            if (z11) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.reflect.jvm.internal.impl.types.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.reflect.jvm.internal.impl.types.l, java.lang.Object, da.d, da.a] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16, types: [y9.v] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y9.r, java.lang.Object, y9.v] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final v b(ArrayList arrayList) {
        v vVar;
        v vVar2;
        y9.c c;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar3 = (v) it.next();
            if (vVar3.U0() instanceof IntersectionTypeConstructor) {
                Collection<r> f10 = vVar3.U0().f();
                v7.g.e(f10, "type.constructor.supertypes");
                ArrayList arrayList3 = new ArrayList(l.Z1(f10, 10));
                for (r rVar : f10) {
                    v7.g.e(rVar, "it");
                    v K0 = a1.b.K0(rVar);
                    if (vVar3.V0()) {
                        K0 = K0.Y0(true);
                    }
                    arrayList3.add(K0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(vVar3);
            }
        }
        ResultNullability resultNullability = ResultNullability.f14990i;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            resultNullability = resultNullability.a((m0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            v vVar4 = (v) it3.next();
            if (resultNullability == ResultNullability.f14993l) {
                if (vVar4 instanceof z9.b) {
                    z9.b bVar = (z9.b) vVar4;
                    v7.g.f(bVar, "<this>");
                    vVar4 = new z9.b(bVar.f19184j, bVar.f19185k, bVar.f19186l, bVar.f19187m, bVar.n, true);
                }
                v7.g.f(vVar4, "<this>");
                v a10 = g.a.a(vVar4, false);
                if (a10 == null && (a10 = y.b(vVar4)) == null) {
                    vVar4 = vVar4.Y0(false);
                }
                vVar4 = a10;
            }
            linkedHashSet.add(vVar4);
        }
        ArrayList arrayList4 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((v) it4.next()).T0());
        }
        Iterator it5 = arrayList4.iterator();
        if (it5.hasNext()) {
            ?? next = it5.next();
            while (true) {
                vVar = null;
                if (!it5.hasNext()) {
                    break;
                }
                kotlin.reflect.jvm.internal.impl.types.l lVar = (kotlin.reflect.jvm.internal.impl.types.l) it5.next();
                next = (kotlin.reflect.jvm.internal.impl.types.l) next;
                next.getClass();
                v7.g.f(lVar, "other");
                if (!next.isEmpty() || !lVar.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection<Number> values = kotlin.reflect.jvm.internal.impl.types.l.f15045j.f15093a.values();
                    v7.g.e(values, "idPerType.values");
                    for (Number number : values) {
                        int intValue = number.intValue();
                        c0 c0Var = (c0) next.f10480i.get(intValue);
                        c0 c0Var2 = (c0) lVar.f10480i.get(intValue);
                        if (c0Var == null) {
                            if (c0Var2 != null) {
                                c = c0Var2.c(c0Var);
                            } else {
                                c = null;
                            }
                        } else {
                            c = c0Var.c(c0Var2);
                        }
                        m0.b.u(arrayList5, c);
                    }
                    next = l.a.c(arrayList5);
                }
            }
            kotlin.reflect.jvm.internal.impl.types.l lVar2 = (kotlin.reflect.jvm.internal.impl.types.l) next;
            if (linkedHashSet.size() == 1) {
                vVar2 = kotlin.collections.c.B2(linkedHashSet);
            } else {
                ArrayList a11 = a(linkedHashSet, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
                a11.isEmpty();
                if (!a11.isEmpty()) {
                    Iterator it6 = a11.iterator();
                    if (it6.hasNext()) {
                        ?? next2 = it6.next();
                        while (it6.hasNext()) {
                            v vVar5 = (v) it6.next();
                            next2 = (v) next2;
                            if (next2 != 0 && vVar5 != null) {
                                e0 U0 = next2.U0();
                                e0 U02 = vVar5.U0();
                                boolean z10 = U0 instanceof IntegerLiteralTypeConstructor;
                                if (z10 && (U02 instanceof IntegerLiteralTypeConstructor)) {
                                    IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) U0;
                                    Set<r> set = integerLiteralTypeConstructor.c;
                                    Set<r> set2 = ((IntegerLiteralTypeConstructor) U02).c;
                                    v7.g.f(set, "<this>");
                                    v7.g.f(set2, "other");
                                    Set P2 = kotlin.collections.c.P2(set);
                                    n.f2(set2, P2);
                                    IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f14705a, integerLiteralTypeConstructor.f14706b, P2);
                                    kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
                                    next2 = KotlinTypeFactory.d(kotlin.reflect.jvm.internal.impl.types.l.f15046k, integerLiteralTypeConstructor2);
                                } else if (z10) {
                                    if (((IntegerLiteralTypeConstructor) U0).c.contains(vVar5)) {
                                        next2 = vVar5;
                                    }
                                } else if ((U02 instanceof IntegerLiteralTypeConstructor) && ((IntegerLiteralTypeConstructor) U02).c.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        vVar = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (vVar == null) {
                    f.f14999b.getClass();
                    ArrayList a12 = a(a11, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(f.a.f15001b));
                    a12.isEmpty();
                    if (a12.size() < 2) {
                        vVar2 = kotlin.collections.c.B2(a12);
                    } else {
                        vVar = new IntersectionTypeConstructor(linkedHashSet).g();
                    }
                }
                return vVar.a1(lVar2);
            }
            vVar = vVar2;
            return vVar.a1(lVar2);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
