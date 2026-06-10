package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import c9.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import m8.e;
import u7.l;
import v7.g;
import x8.b;
import y9.e0;
import y9.f0;
import y9.g0;
import y9.m0;
import y9.n;
import y9.r;
import y9.u;
import y9.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final x8.b f13900a = b.a.f18761a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r f13901a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13902b;

        public a(m0 m0Var, int i10) {
            this.f13901a = m0Var;
            this.f13902b = i10;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0156b {

        /* renamed from: a  reason: collision with root package name */
        public final v f13903a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13904b;
        public final boolean c;

        public C0156b(v vVar, int i10, boolean z10) {
            this.f13903a = vVar;
            this.f13904b = i10;
            this.c = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0156b a(v vVar, l<? super Integer, c9.c> lVar, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        l8.d c;
        boolean z14;
        l8.b G;
        boolean z15;
        int i11;
        Boolean bool;
        e0 U0;
        int i12;
        Iterator it;
        Iterator<T> it2;
        ArrayList arrayList;
        boolean z16;
        boolean z17;
        int size;
        e eVar;
        boolean V0;
        boolean z18;
        boolean z19;
        Iterator it3;
        a aVar;
        r rVar;
        g0 g0Var;
        l<? super Integer, c9.c> lVar2 = lVar;
        TypeComponentPosition typeComponentPosition2 = TypeComponentPosition.INFLEXIBLE;
        if (typeComponentPosition != typeComponentPosition2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && z10) {
            z13 = false;
            m0 m0Var = null;
            if (z12 && vVar.S0().isEmpty()) {
                return new C0156b(null, 1, false);
            }
            c = vVar.U0().c();
            if (c != null) {
                return new C0156b(null, 1, false);
            }
            AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$1 = (AbstractSignatureParts$computeIndexedQualifiers$1) lVar2;
            c9.c cVar = (c9.c) abstractSignatureParts$computeIndexedQualifiers$1.U(Integer.valueOf(i10));
            c9.b bVar = i.f6580a;
            if (typeComponentPosition != typeComponentPosition2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14 && (c instanceof l8.b)) {
                if (cVar.f6568b == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                    l8.b bVar2 = (l8.b) c;
                    String str = k8.c.f12921a;
                    h9.d g10 = k9.d.g(bVar2);
                    HashMap<h9.d, h9.c> hashMap = k8.c.f12929j;
                    if (hashMap.containsKey(g10)) {
                        h9.c cVar2 = hashMap.get(k9.d.g(bVar2));
                        if (cVar2 != null) {
                            G = DescriptorUtilsKt.e(bVar2).j(cVar2);
                            if (typeComponentPosition != typeComponentPosition2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                NullabilityQualifier nullabilityQualifier = cVar.f6567a;
                                if (nullabilityQualifier == null) {
                                    i11 = -1;
                                } else {
                                    i11 = i.a.f6582a[nullabilityQualifier.ordinal()];
                                }
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        bool = Boolean.FALSE;
                                    }
                                } else {
                                    bool = Boolean.TRUE;
                                }
                                if (G != null || (U0 = G.o()) == null) {
                                    U0 = vVar.U0();
                                }
                                g.e(U0, "enhancedClassifier?.typeConstructor ?: constructor");
                                i12 = i10 + 1;
                                List<f0> S0 = vVar.S0();
                                List<i0> e10 = U0.e();
                                g.e(e10, "typeConstructor.parameters");
                                it = S0.iterator();
                                it2 = e10.iterator();
                                arrayList = new ArrayList(Math.min(n7.l.Z1(S0, 10), n7.l.Z1(e10, 10)));
                                while (it.hasNext() && it2.hasNext()) {
                                    Object next = it.next();
                                    i0 i0Var = (i0) it2.next();
                                    f0 f0Var = (f0) next;
                                    if (z13) {
                                        it3 = it;
                                        aVar = new a(m0Var, 0);
                                    } else {
                                        it3 = it;
                                        if (!f0Var.d()) {
                                            aVar = b(f0Var.b().X0(), lVar2, i12, z11);
                                        } else if (((c9.c) abstractSignatureParts$computeIndexedQualifiers$1.U(Integer.valueOf(i12))).f6567a == NullabilityQualifier.FORCE_FLEXIBILITY) {
                                            m0 X0 = f0Var.b().X0();
                                            aVar = new a(KotlinTypeFactory.c(a1.b.q0(X0).Y0(false), a1.b.K0(X0).Y0(true)), 1);
                                        } else {
                                            aVar = new a(null, 1);
                                        }
                                    }
                                    i12 += aVar.f13902b;
                                    rVar = aVar.f13901a;
                                    if (rVar == null) {
                                        if (G != null && !f0Var.d()) {
                                            rVar = f0Var.b();
                                            g.e(rVar, "arg.type");
                                        } else {
                                            if (G != null) {
                                                g0Var = kotlin.reflect.jvm.internal.impl.types.r.m(i0Var);
                                            } else {
                                                g0Var = null;
                                            }
                                            arrayList.add(g0Var);
                                            lVar2 = lVar;
                                            it = it3;
                                            m0Var = null;
                                        }
                                    }
                                    Variance a10 = f0Var.a();
                                    g.e(a10, "arg.projectionKind");
                                    g0Var = TypeUtilsKt.e(rVar, a10, i0Var);
                                    arrayList.add(g0Var);
                                    lVar2 = lVar;
                                    it = it3;
                                    m0Var = null;
                                }
                                int i13 = i12 - i10;
                                if (G == null && bool == null) {
                                    if (arrayList.isEmpty()) {
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            if (((f0) it4.next()) == null) {
                                                z18 = true;
                                                continue;
                                            } else {
                                                z18 = false;
                                                continue;
                                            }
                                            if (!z18) {
                                                z19 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z19 = true;
                                    if (z19) {
                                        return new C0156b(null, i13, false);
                                    }
                                }
                                e[] eVarArr = new e[3];
                                eVarArr[0] = vVar.getAnnotations();
                                c9.b bVar3 = i.f6581b;
                                if (G == null) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    bVar3 = null;
                                }
                                eVarArr[1] = bVar3;
                                c9.b bVar4 = i.f6580a;
                                if (bool == null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    bVar4 = null;
                                }
                                eVarArr[2] = bVar4;
                                ArrayList k22 = kotlin.collections.b.k2(eVarArr);
                                size = k22.size();
                                if (size == 0) {
                                    boolean z20 = true;
                                    if (size != 1) {
                                        eVar = new CompositeAnnotations(kotlin.collections.c.L2(k22));
                                    } else {
                                        eVar = (e) kotlin.collections.c.C2(k22);
                                    }
                                    kotlin.reflect.jvm.internal.impl.types.l Q = ma.i.Q(eVar);
                                    List<f0> S02 = vVar.S0();
                                    Iterator it5 = arrayList.iterator();
                                    Iterator<T> it6 = S02.iterator();
                                    ArrayList arrayList2 = new ArrayList(Math.min(n7.l.Z1(arrayList, 10), n7.l.Z1(S02, 10)));
                                    while (it5.hasNext() && it6.hasNext()) {
                                        Object next2 = it5.next();
                                        f0 f0Var2 = (f0) it6.next();
                                        f0 f0Var3 = (f0) next2;
                                        if (f0Var3 != null) {
                                            f0Var2 = f0Var3;
                                        }
                                        arrayList2.add(f0Var2);
                                    }
                                    if (bool != null) {
                                        V0 = bool.booleanValue();
                                    } else {
                                        V0 = vVar.V0();
                                    }
                                    v f10 = KotlinTypeFactory.f(Q, U0, arrayList2, V0, null);
                                    if (cVar.c) {
                                        this.f13900a.a();
                                        f10 = new c9.d(f10);
                                    }
                                    if (bool == null || !cVar.f6569d) {
                                        z20 = false;
                                    }
                                    return new C0156b(f10, i13, z20);
                                }
                                throw new IllegalStateException("At least one Annotations object expected".toString());
                            }
                            bool = null;
                            if (G != null) {
                            }
                            U0 = vVar.U0();
                            g.e(U0, "enhancedClassifier?.typeConstructor ?: constructor");
                            i12 = i10 + 1;
                            List<f0> S03 = vVar.S0();
                            List<i0> e102 = U0.e();
                            g.e(e102, "typeConstructor.parameters");
                            it = S03.iterator();
                            it2 = e102.iterator();
                            arrayList = new ArrayList(Math.min(n7.l.Z1(S03, 10), n7.l.Z1(e102, 10)));
                            while (it.hasNext()) {
                                Object next3 = it.next();
                                i0 i0Var2 = (i0) it2.next();
                                f0 f0Var4 = (f0) next3;
                                if (z13) {
                                }
                                i12 += aVar.f13902b;
                                rVar = aVar.f13901a;
                                if (rVar == null) {
                                }
                                Variance a102 = f0Var4.a();
                                g.e(a102, "arg.projectionKind");
                                g0Var = TypeUtilsKt.e(rVar, a102, i0Var2);
                                arrayList.add(g0Var);
                                lVar2 = lVar;
                                it = it3;
                                m0Var = null;
                            }
                            int i132 = i12 - i10;
                            if (G == null) {
                                if (arrayList.isEmpty()) {
                                }
                                z19 = true;
                                if (z19) {
                                }
                            }
                            e[] eVarArr2 = new e[3];
                            eVarArr2[0] = vVar.getAnnotations();
                            c9.b bVar32 = i.f6581b;
                            if (G == null) {
                            }
                            if (z16) {
                            }
                            eVarArr2[1] = bVar32;
                            c9.b bVar42 = i.f6580a;
                            if (bool == null) {
                            }
                            if (z17) {
                            }
                            eVarArr2[2] = bVar42;
                            ArrayList k222 = kotlin.collections.b.k2(eVarArr2);
                            size = k222.size();
                            if (size == 0) {
                            }
                        } else {
                            throw new IllegalArgumentException("Given class " + bVar2 + " is not a mutable collection");
                        }
                    }
                }
                if (cVar.f6568b == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                    l8.b bVar5 = (l8.b) c;
                    String str2 = k8.c.f12921a;
                    if (k8.c.f12930k.containsKey(k9.d.g(bVar5))) {
                        G = a1.b.G(bVar5);
                        if (typeComponentPosition != typeComponentPosition2) {
                        }
                        if (z15) {
                        }
                        bool = null;
                        if (G != null) {
                        }
                        U0 = vVar.U0();
                        g.e(U0, "enhancedClassifier?.typeConstructor ?: constructor");
                        i12 = i10 + 1;
                        List<f0> S032 = vVar.S0();
                        List<i0> e1022 = U0.e();
                        g.e(e1022, "typeConstructor.parameters");
                        it = S032.iterator();
                        it2 = e1022.iterator();
                        arrayList = new ArrayList(Math.min(n7.l.Z1(S032, 10), n7.l.Z1(e1022, 10)));
                        while (it.hasNext()) {
                        }
                        int i1322 = i12 - i10;
                        if (G == null) {
                        }
                        e[] eVarArr22 = new e[3];
                        eVarArr22[0] = vVar.getAnnotations();
                        c9.b bVar322 = i.f6581b;
                        if (G == null) {
                        }
                        if (z16) {
                        }
                        eVarArr22[1] = bVar322;
                        c9.b bVar422 = i.f6580a;
                        if (bool == null) {
                        }
                        if (z17) {
                        }
                        eVarArr22[2] = bVar422;
                        ArrayList k2222 = kotlin.collections.b.k2(eVarArr22);
                        size = k2222.size();
                        if (size == 0) {
                        }
                    }
                }
            }
            G = null;
            if (typeComponentPosition != typeComponentPosition2) {
            }
            if (z15) {
            }
            bool = null;
            if (G != null) {
            }
            U0 = vVar.U0();
            g.e(U0, "enhancedClassifier?.typeConstructor ?: constructor");
            i12 = i10 + 1;
            List<f0> S0322 = vVar.S0();
            List<i0> e10222 = U0.e();
            g.e(e10222, "typeConstructor.parameters");
            it = S0322.iterator();
            it2 = e10222.iterator();
            arrayList = new ArrayList(Math.min(n7.l.Z1(S0322, 10), n7.l.Z1(e10222, 10)));
            while (it.hasNext()) {
            }
            int i13222 = i12 - i10;
            if (G == null) {
            }
            e[] eVarArr222 = new e[3];
            eVarArr222[0] = vVar.getAnnotations();
            c9.b bVar3222 = i.f6581b;
            if (G == null) {
            }
            if (z16) {
            }
            eVarArr222[1] = bVar3222;
            c9.b bVar4222 = i.f6580a;
            if (bool == null) {
            }
            if (z17) {
            }
            eVarArr222[2] = bVar4222;
            ArrayList k22222 = kotlin.collections.b.k2(eVarArr222);
            size = k22222.size();
            if (size == 0) {
            }
        }
        z13 = true;
        m0 m0Var2 = null;
        if (z12) {
        }
        c = vVar.U0().c();
        if (c != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r15 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r15 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.c(r15, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a b(m0 m0Var, l<? super Integer, c9.c> lVar, int i10, boolean z10) {
        m0 m0Var2 = null;
        if (m0.b.D0(m0Var)) {
            return new a(null, 1);
        }
        if (m0Var instanceof n) {
            boolean z11 = m0Var instanceof u;
            n nVar = (n) m0Var;
            C0156b a10 = a(nVar.f18958j, lVar, i10, TypeComponentPosition.FLEXIBLE_LOWER, z11, z10);
            C0156b a11 = a(nVar.f18959k, lVar, i10, TypeComponentPosition.FLEXIBLE_UPPER, z11, z10);
            v vVar = a11.f13903a;
            v vVar2 = a10.f13903a;
            if (vVar2 != null || vVar != null) {
                if (!a10.c && !a11.c) {
                    v vVar3 = nVar.f18959k;
                    v vVar4 = nVar.f18958j;
                    v vVar5 = vVar2;
                    if (z11) {
                        v vVar6 = vVar2;
                        if (vVar2 == null) {
                            vVar6 = vVar4;
                        }
                        if (vVar == null) {
                            vVar = vVar3;
                        }
                        m0Var2 = new RawTypeImpl(vVar6, vVar);
                    } else {
                        if (vVar2 == null) {
                            vVar5 = vVar4;
                        }
                        if (vVar == null) {
                            vVar = vVar3;
                        }
                        m0Var2 = KotlinTypeFactory.c(vVar5, vVar);
                    }
                }
                g.c(vVar2);
                r rVar = vVar2;
                m0Var2 = a1.b.M0(m0Var, rVar);
            }
            return new a(m0Var2, a10.f13904b);
        } else if (m0Var instanceof v) {
            C0156b a12 = a((v) m0Var, lVar, i10, TypeComponentPosition.INFLEXIBLE, false, z10);
            boolean z12 = a12.c;
            m0 m0Var3 = a12.f13903a;
            if (z12) {
                m0Var3 = a1.b.M0(m0Var, m0Var3);
            }
            return new a(m0Var3, a12.f13904b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
