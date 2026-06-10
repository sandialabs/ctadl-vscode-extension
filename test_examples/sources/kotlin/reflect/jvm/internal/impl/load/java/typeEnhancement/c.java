package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ba.f;
import ba.k;
import c9.e;
import c9.g;
import c9.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.c0;
import l8.i0;
import l8.z;
import m8.e;
import n7.l;
import o8.d0;
import u8.j;
import u8.m;
import u8.o;
import v7.i;
import y9.e0;
import y9.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f13905a;

    public c(b bVar) {
        this.f13905a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0286, code lost:
        if (r3.compareTo(r5) <= 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0423, code lost:
        if (r2 != false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0339 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(g gVar, r rVar, List<? extends r> list, h hVar, boolean z10) {
        boolean z11;
        int size;
        int i10;
        c9.c[] cVarArr;
        boolean z12;
        Iterable iterable;
        MutabilityQualifier mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2;
        i0 i0Var;
        boolean z13;
        boolean z14;
        Iterable iterable2;
        m8.a aVar;
        kotlin.reflect.jvm.internal.impl.types.checker.h hVar2;
        int i11;
        x8.c cVar;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        o oVar;
        j jVar;
        e eVar;
        e eVar2;
        NullabilityQualifier nullabilityQualifier;
        boolean z15;
        e eVar3;
        c9.c cVar2;
        NullabilityQualifier nullabilityQualifier2;
        boolean z16;
        boolean z17;
        boolean z18;
        u8.b bVar;
        Iterator it;
        MutabilityQualifier mutabilityQualifier3;
        e0 J;
        Iterator it2;
        int i12;
        boolean z19;
        boolean z20;
        Iterator it3;
        boolean z21;
        NullabilityQualifier nullabilityQualifier3;
        NullabilityQualifier nullabilityQualifier4;
        Iterator it4;
        NullabilityQualifier nullabilityQualifier5;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        NullabilityQualifier nullabilityQualifier6;
        boolean z26;
        kotlin.reflect.jvm.internal.impl.types.checker.h hVar3;
        c9.c cVar3;
        f fVar;
        NullabilityQualifier nullabilityQualifier7;
        MutabilityQualifier mutabilityQualifier4;
        boolean z27;
        boolean z28;
        TypeVariance typeVariance;
        boolean z29;
        v7.g.f(rVar, "<this>");
        v7.g.f(list, "overrides");
        ArrayList d5 = gVar.d(rVar);
        ArrayList arrayList = new ArrayList(l.Z1(list, 10));
        for (f fVar2 : list) {
            arrayList.add(gVar.d(fVar2));
        }
        x8.c cVar4 = gVar.c;
        boolean z30 = gVar.f6576b;
        if (z30) {
            if (!list.isEmpty()) {
                for (f fVar3 : list) {
                    v7.g.f(fVar3, "other");
                    if (!cVar4.f18762a.f18757u.c(rVar, (r) fVar3)) {
                        z29 = true;
                        break;
                    }
                }
            }
            z29 = false;
            if (z29) {
                z11 = true;
                if (!z11) {
                    size = 1;
                } else {
                    size = d5.size();
                }
                c9.c[] cVarArr2 = new c9.c[size];
                i10 = 0;
                while (i10 < size) {
                    a.C0155a c0155a = (a.C0155a) d5.get(i10);
                    f fVar4 = c0155a.f13898a;
                    NullabilityQualifier nullabilityQualifier8 = NullabilityQualifier.NULLABLE;
                    NullabilityQualifier nullabilityQualifier9 = NullabilityQualifier.NOT_NULL;
                    kotlin.reflect.jvm.internal.impl.types.checker.h hVar4 = kotlin.reflect.jvm.internal.impl.types.checker.h.f15004a;
                    MutabilityQualifier mutabilityQualifier5 = MutabilityQualifier.MUTABLE;
                    MutabilityQualifier mutabilityQualifier6 = MutabilityQualifier.READ_ONLY;
                    NullabilityQualifier nullabilityQualifier10 = NullabilityQualifier.FORCE_FLEXIBILITY;
                    int i13 = size;
                    m8.a aVar2 = gVar.f6575a;
                    ArrayList arrayList2 = d5;
                    k kVar = c0155a.c;
                    if (fVar4 == null) {
                        if (kVar != null) {
                            if (kVar instanceof i0) {
                                Variance t10 = ((i0) kVar).t();
                                cVarArr = cVarArr2;
                                v7.g.e(t10, "this.variance");
                                typeVariance = a1.c.l0(t10);
                            } else {
                                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + i.a(kVar.getClass())).toString());
                            }
                        } else {
                            cVarArr = cVarArr2;
                            typeVariance = null;
                        }
                        if (typeVariance == TypeVariance.f15060j) {
                            cVar2 = c9.c.f6566e;
                            aVar = aVar2;
                            mutabilityQualifier = mutabilityQualifier6;
                            mutabilityQualifier2 = mutabilityQualifier5;
                            cVar = cVar4;
                            z13 = z30;
                            i11 = i10;
                            hVar2 = hVar4;
                            ArrayList arrayList3 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i14 = i11;
                                a.C0155a c0155a2 = (a.C0155a) kotlin.collections.c.q2(i14, (List) it2.next());
                                if (c0155a2 != null && (fVar = c0155a2.f13898a) != null) {
                                    NullabilityQualifier c = a.c(fVar);
                                    if (c == null) {
                                        r W = a1.b.W((r) fVar);
                                        if (W != null) {
                                            nullabilityQualifier7 = a.c(W);
                                        } else {
                                            nullabilityQualifier7 = null;
                                        }
                                    } else {
                                        nullabilityQualifier7 = c;
                                    }
                                    String str = k8.c.f12921a;
                                    hVar3 = hVar2;
                                    if (k8.c.f12930k.containsKey(gVar.e(hVar3.I(fVar)))) {
                                        mutabilityQualifier4 = mutabilityQualifier;
                                    } else if (k8.c.f12929j.containsKey(gVar.e(hVar3.l0(fVar)))) {
                                        mutabilityQualifier4 = mutabilityQualifier2;
                                    } else {
                                        mutabilityQualifier4 = null;
                                    }
                                    if (!hVar3.V(fVar) && !(((r) fVar).X0() instanceof c9.d)) {
                                        z27 = false;
                                        if (nullabilityQualifier7 == c) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        cVar3 = new c9.c(nullabilityQualifier7, mutabilityQualifier4, z27, z28);
                                    }
                                    z27 = true;
                                    if (nullabilityQualifier7 == c) {
                                    }
                                    cVar3 = new c9.c(nullabilityQualifier7, mutabilityQualifier4, z27, z28);
                                } else {
                                    hVar3 = hVar2;
                                    cVar3 = null;
                                }
                                if (cVar3 != null) {
                                    arrayList3.add(cVar3);
                                }
                                i11 = i14;
                                hVar2 = hVar3;
                            }
                            i12 = i11;
                            if (i12 != 0 && z13) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (i12 == 0) {
                                m8.a aVar3 = aVar;
                                if ((aVar3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && ((kotlin.reflect.jvm.internal.impl.descriptors.h) aVar3).N() != null) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (z26) {
                                    z20 = true;
                                    ArrayList arrayList4 = new ArrayList();
                                    it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        c9.c cVar5 = (c9.c) it3.next();
                                        if (cVar5.f6569d) {
                                            nullabilityQualifier6 = null;
                                        } else {
                                            nullabilityQualifier6 = cVar5.f6567a;
                                        }
                                        if (nullabilityQualifier6 != null) {
                                            arrayList4.add(nullabilityQualifier6);
                                        }
                                    }
                                    Set Q2 = kotlin.collections.c.Q2(arrayList4);
                                    z21 = cVar2.f6569d;
                                    NullabilityQualifier nullabilityQualifier11 = cVar2.f6567a;
                                    if (!z21) {
                                        nullabilityQualifier3 = null;
                                    } else {
                                        nullabilityQualifier3 = nullabilityQualifier11;
                                    }
                                    if (nullabilityQualifier3 != nullabilityQualifier10) {
                                        nullabilityQualifier4 = nullabilityQualifier10;
                                    } else {
                                        nullabilityQualifier4 = (NullabilityQualifier) m0.b.i1(Q2, nullabilityQualifier9, nullabilityQualifier8, nullabilityQualifier3, z19);
                                    }
                                    if (nullabilityQualifier4 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it5 = arrayList3.iterator();
                                        while (it5.hasNext()) {
                                            NullabilityQualifier nullabilityQualifier12 = ((c9.c) it5.next()).f6567a;
                                            if (nullabilityQualifier12 != null) {
                                                arrayList5.add(nullabilityQualifier12);
                                            }
                                        }
                                        Set Q22 = kotlin.collections.c.Q2(arrayList5);
                                        if (nullabilityQualifier11 != nullabilityQualifier10) {
                                            nullabilityQualifier10 = (NullabilityQualifier) m0.b.i1(Q22, nullabilityQualifier9, nullabilityQualifier8, nullabilityQualifier11, z19);
                                        }
                                    } else {
                                        nullabilityQualifier10 = nullabilityQualifier4;
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        MutabilityQualifier mutabilityQualifier7 = ((c9.c) it4.next()).f6568b;
                                        if (mutabilityQualifier7 != null) {
                                            arrayList6.add(mutabilityQualifier7);
                                        }
                                    }
                                    MutabilityQualifier mutabilityQualifier8 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList6), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                                    if (nullabilityQualifier10 != null) {
                                        if (!z10 && (!z20 || nullabilityQualifier10 != nullabilityQualifier8)) {
                                            z25 = false;
                                            if (!z25) {
                                                nullabilityQualifier5 = nullabilityQualifier10;
                                                if (nullabilityQualifier5 == nullabilityQualifier9) {
                                                    if (!cVar2.c) {
                                                        if (!arrayList3.isEmpty()) {
                                                            Iterator it6 = arrayList3.iterator();
                                                            while (it6.hasNext()) {
                                                                if (((c9.c) it6.next()).c) {
                                                                    z24 = true;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z24 = false;
                                                    }
                                                    z22 = true;
                                                    if (nullabilityQualifier5 == null && nullabilityQualifier4 != nullabilityQualifier10) {
                                                        z23 = true;
                                                    } else {
                                                        z23 = false;
                                                    }
                                                    cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier8, z22, z23);
                                                    i10 = i12 + 1;
                                                    size = i13;
                                                    d5 = arrayList2;
                                                    cVarArr2 = cVarArr;
                                                    z30 = z13;
                                                    cVar4 = cVar;
                                                }
                                                z22 = false;
                                                if (nullabilityQualifier5 == null) {
                                                }
                                                z23 = false;
                                                cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier8, z22, z23);
                                                i10 = i12 + 1;
                                                size = i13;
                                                d5 = arrayList2;
                                                cVarArr2 = cVarArr;
                                                z30 = z13;
                                                cVar4 = cVar;
                                            }
                                        }
                                        z25 = true;
                                        if (!z25) {
                                        }
                                    }
                                    nullabilityQualifier5 = null;
                                    if (nullabilityQualifier5 == nullabilityQualifier9) {
                                    }
                                    z22 = false;
                                    if (nullabilityQualifier5 == null) {
                                    }
                                    z23 = false;
                                    cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier8, z22, z23);
                                    i10 = i12 + 1;
                                    size = i13;
                                    d5 = arrayList2;
                                    cVarArr2 = cVarArr;
                                    z30 = z13;
                                    cVar4 = cVar;
                                }
                            }
                            z20 = false;
                            ArrayList arrayList42 = new ArrayList();
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                            }
                            Set Q23 = kotlin.collections.c.Q2(arrayList42);
                            z21 = cVar2.f6569d;
                            NullabilityQualifier nullabilityQualifier112 = cVar2.f6567a;
                            if (!z21) {
                            }
                            if (nullabilityQualifier3 != nullabilityQualifier10) {
                            }
                            if (nullabilityQualifier4 != null) {
                            }
                            ArrayList arrayList62 = new ArrayList();
                            it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                            }
                            MutabilityQualifier mutabilityQualifier82 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList62), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                            if (nullabilityQualifier10 != null) {
                            }
                            nullabilityQualifier5 = null;
                            if (nullabilityQualifier5 == nullabilityQualifier9) {
                            }
                            z22 = false;
                            if (nullabilityQualifier5 == null) {
                            }
                            z23 = false;
                            cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier82, z22, z23);
                            i10 = i12 + 1;
                            size = i13;
                            d5 = arrayList2;
                            cVarArr2 = cVarArr;
                            z30 = z13;
                            cVar4 = cVar;
                        }
                    } else {
                        cVarArr = cVarArr2;
                    }
                    if (kVar == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f fVar5 = c0155a.f13898a;
                    if (fVar5 != null) {
                        iterable = ((r) fVar5).getAnnotations();
                    } else {
                        iterable = EmptyList.f12981i;
                    }
                    mutabilityQualifier = mutabilityQualifier6;
                    Iterable iterable3 = iterable;
                    if (fVar5 != null && (J = hVar4.J(fVar5)) != null) {
                        i0Var = b.a.x(J);
                        mutabilityQualifier2 = mutabilityQualifier5;
                    } else {
                        mutabilityQualifier2 = mutabilityQualifier5;
                        i0Var = null;
                    }
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.n;
                    z13 = z30;
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = gVar.f6577d;
                    if (annotationQualifierApplicabilityType3 == annotationQualifierApplicabilityType2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z12) {
                        if (!z14) {
                            cVar4.f18762a.f18756t.c();
                        }
                        if (aVar2 == null || (iterable2 = aVar2.getAnnotations()) == null) {
                            iterable2 = EmptyList.f12981i;
                        }
                        iterable3 = kotlin.collections.c.x2(iterable2, iterable3);
                    }
                    u8.b bVar2 = cVar4.f18762a.f18753q;
                    bVar2.getClass();
                    aVar = aVar2;
                    v7.g.f(iterable3, "annotations");
                    Iterator it7 = iterable3.iterator();
                    hVar2 = hVar4;
                    MutabilityQualifier mutabilityQualifier9 = null;
                    while (true) {
                        if (it7.hasNext()) {
                            i11 = i10;
                            h9.c e10 = bVar2.e(it7.next());
                            Iterator it8 = it7;
                            if (u8.r.f17889l.contains(e10)) {
                                mutabilityQualifier3 = mutabilityQualifier;
                            } else if (u8.r.f17890m.contains(e10)) {
                                mutabilityQualifier3 = mutabilityQualifier2;
                            } else {
                                continue;
                                i10 = i11;
                                it7 = it8;
                            }
                            if (mutabilityQualifier9 != null && mutabilityQualifier9 != mutabilityQualifier3) {
                                mutabilityQualifier9 = null;
                                break;
                            }
                            mutabilityQualifier9 = mutabilityQualifier3;
                            i10 = i11;
                            it7 = it8;
                        } else {
                            i11 = i10;
                            break;
                        }
                    }
                    u8.b bVar3 = cVar4.f18762a.f18753q;
                    AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 abstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 = new AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1(gVar);
                    bVar3.getClass();
                    Iterator it9 = iterable3.iterator();
                    e eVar4 = null;
                    while (it9.hasNext()) {
                        cVar = cVar4;
                        e c10 = bVar3.c(it9.next(), abstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1);
                        if (eVar4 == null) {
                            bVar = bVar3;
                            it = it9;
                        } else {
                            if (c10 != null && !v7.g.a(c10, eVar4)) {
                                bVar = bVar3;
                                boolean z31 = eVar4.f6572b;
                                it = it9;
                                boolean z32 = c10.f6572b;
                                if (!z32 || z31) {
                                    if (z32 || !z31) {
                                        eVar4 = null;
                                        break;
                                    }
                                } else {
                                    cVar4 = cVar;
                                    bVar3 = bVar;
                                    it9 = it;
                                }
                            }
                            bVar = bVar3;
                            it = it9;
                            cVar4 = cVar;
                            bVar3 = bVar;
                            it9 = it;
                        }
                        eVar4 = c10;
                        cVar4 = cVar;
                        bVar3 = bVar;
                        it9 = it;
                    }
                    cVar = cVar4;
                    if (eVar4 != null) {
                        NullabilityQualifier nullabilityQualifier13 = eVar4.f6571a;
                        if (nullabilityQualifier13 == nullabilityQualifier9 && i0Var != null) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        cVar2 = new c9.c(nullabilityQualifier13, mutabilityQualifier9, z18, eVar4.f6572b);
                        ArrayList arrayList32 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        i12 = i11;
                        if (i12 != 0) {
                        }
                        z19 = false;
                        if (i12 == 0) {
                        }
                        z20 = false;
                        ArrayList arrayList422 = new ArrayList();
                        it3 = arrayList32.iterator();
                        while (it3.hasNext()) {
                        }
                        Set Q232 = kotlin.collections.c.Q2(arrayList422);
                        z21 = cVar2.f6569d;
                        NullabilityQualifier nullabilityQualifier1122 = cVar2.f6567a;
                        if (!z21) {
                        }
                        if (nullabilityQualifier3 != nullabilityQualifier10) {
                        }
                        if (nullabilityQualifier4 != null) {
                        }
                        ArrayList arrayList622 = new ArrayList();
                        it4 = arrayList32.iterator();
                        while (it4.hasNext()) {
                        }
                        MutabilityQualifier mutabilityQualifier822 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList622), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                        if (nullabilityQualifier10 != null) {
                        }
                        nullabilityQualifier5 = null;
                        if (nullabilityQualifier5 == nullabilityQualifier9) {
                        }
                        z22 = false;
                        if (nullabilityQualifier5 == null) {
                        }
                        z23 = false;
                        cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier822, z22, z23);
                        i10 = i12 + 1;
                        size = i13;
                        d5 = arrayList2;
                        cVarArr2 = cVarArr;
                        z30 = z13;
                        cVar4 = cVar;
                    } else {
                        if (!z12 && !z14) {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f13608m;
                            oVar = c0155a.f13899b;
                            if (oVar == null) {
                                jVar = oVar.f17861a.get(annotationQualifierApplicabilityType);
                            } else {
                                jVar = null;
                            }
                            if (i0Var == null) {
                                eVar = gVar.b(i0Var);
                            } else {
                                eVar = null;
                            }
                            if (eVar == null) {
                                eVar2 = e.a(eVar, nullabilityQualifier9, false, 2);
                            } else if (jVar != null) {
                                eVar2 = jVar.f17850a;
                            } else {
                                eVar2 = null;
                            }
                            if (eVar == null) {
                                nullabilityQualifier = eVar.f6571a;
                            } else {
                                nullabilityQualifier = null;
                            }
                            if (nullabilityQualifier != nullabilityQualifier9) {
                                if (i0Var != null) {
                                    if (jVar != null && jVar.c) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                    }
                                }
                                z15 = false;
                                if (kVar == null && (eVar3 = gVar.b(kVar)) != null) {
                                    if (eVar3.f6571a == nullabilityQualifier8) {
                                        eVar3 = e.a(eVar3, nullabilityQualifier10, false, 2);
                                    }
                                } else {
                                    eVar3 = null;
                                }
                                if (eVar3 != null) {
                                    if (eVar2 != null) {
                                        boolean z33 = eVar2.f6572b;
                                        boolean z34 = eVar3.f6572b;
                                        if (!z34 || z33) {
                                            if (z34 || !z33) {
                                                NullabilityQualifier nullabilityQualifier14 = eVar3.f6571a;
                                                NullabilityQualifier nullabilityQualifier15 = eVar2.f6571a;
                                                if (nullabilityQualifier14.compareTo(nullabilityQualifier15) >= 0) {
                                                }
                                            }
                                        }
                                    }
                                    eVar2 = eVar3;
                                }
                                if (eVar2 != null) {
                                    nullabilityQualifier2 = eVar2.f6571a;
                                } else {
                                    nullabilityQualifier2 = null;
                                }
                                if (eVar2 == null && eVar2.f6572b) {
                                    z16 = true;
                                    cVar2 = new c9.c(nullabilityQualifier2, mutabilityQualifier9, z15, z16);
                                    ArrayList arrayList322 = new ArrayList();
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    i12 = i11;
                                    if (i12 != 0) {
                                    }
                                    z19 = false;
                                    if (i12 == 0) {
                                    }
                                    z20 = false;
                                    ArrayList arrayList4222 = new ArrayList();
                                    it3 = arrayList322.iterator();
                                    while (it3.hasNext()) {
                                    }
                                    Set Q2322 = kotlin.collections.c.Q2(arrayList4222);
                                    z21 = cVar2.f6569d;
                                    NullabilityQualifier nullabilityQualifier11222 = cVar2.f6567a;
                                    if (!z21) {
                                    }
                                    if (nullabilityQualifier3 != nullabilityQualifier10) {
                                    }
                                    if (nullabilityQualifier4 != null) {
                                    }
                                    ArrayList arrayList6222 = new ArrayList();
                                    it4 = arrayList322.iterator();
                                    while (it4.hasNext()) {
                                    }
                                    MutabilityQualifier mutabilityQualifier8222 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList6222), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                                    if (nullabilityQualifier10 != null) {
                                    }
                                    nullabilityQualifier5 = null;
                                    if (nullabilityQualifier5 == nullabilityQualifier9) {
                                    }
                                    z22 = false;
                                    if (nullabilityQualifier5 == null) {
                                    }
                                    z23 = false;
                                    cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier8222, z22, z23);
                                    i10 = i12 + 1;
                                    size = i13;
                                    d5 = arrayList2;
                                    cVarArr2 = cVarArr;
                                    z30 = z13;
                                    cVar4 = cVar;
                                }
                                z16 = false;
                                cVar2 = new c9.c(nullabilityQualifier2, mutabilityQualifier9, z15, z16);
                                ArrayList arrayList3222 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                }
                                i12 = i11;
                                if (i12 != 0) {
                                }
                                z19 = false;
                                if (i12 == 0) {
                                }
                                z20 = false;
                                ArrayList arrayList42222 = new ArrayList();
                                it3 = arrayList3222.iterator();
                                while (it3.hasNext()) {
                                }
                                Set Q23222 = kotlin.collections.c.Q2(arrayList42222);
                                z21 = cVar2.f6569d;
                                NullabilityQualifier nullabilityQualifier112222 = cVar2.f6567a;
                                if (!z21) {
                                }
                                if (nullabilityQualifier3 != nullabilityQualifier10) {
                                }
                                if (nullabilityQualifier4 != null) {
                                }
                                ArrayList arrayList62222 = new ArrayList();
                                it4 = arrayList3222.iterator();
                                while (it4.hasNext()) {
                                }
                                MutabilityQualifier mutabilityQualifier82222 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList62222), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                                if (nullabilityQualifier10 != null) {
                                }
                                nullabilityQualifier5 = null;
                                if (nullabilityQualifier5 == nullabilityQualifier9) {
                                }
                                z22 = false;
                                if (nullabilityQualifier5 == null) {
                                }
                                z23 = false;
                                cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier82222, z22, z23);
                                i10 = i12 + 1;
                                size = i13;
                                d5 = arrayList2;
                                cVarArr2 = cVarArr;
                                z30 = z13;
                                cVar4 = cVar;
                            }
                            z15 = true;
                            if (kVar == null) {
                            }
                            eVar3 = null;
                            if (eVar3 != null) {
                            }
                            if (eVar2 != null) {
                            }
                            if (eVar2 == null) {
                                z16 = true;
                                cVar2 = new c9.c(nullabilityQualifier2, mutabilityQualifier9, z15, z16);
                                ArrayList arrayList32222 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                }
                                i12 = i11;
                                if (i12 != 0) {
                                }
                                z19 = false;
                                if (i12 == 0) {
                                }
                                z20 = false;
                                ArrayList arrayList422222 = new ArrayList();
                                it3 = arrayList32222.iterator();
                                while (it3.hasNext()) {
                                }
                                Set Q232222 = kotlin.collections.c.Q2(arrayList422222);
                                z21 = cVar2.f6569d;
                                NullabilityQualifier nullabilityQualifier1122222 = cVar2.f6567a;
                                if (!z21) {
                                }
                                if (nullabilityQualifier3 != nullabilityQualifier10) {
                                }
                                if (nullabilityQualifier4 != null) {
                                }
                                ArrayList arrayList622222 = new ArrayList();
                                it4 = arrayList32222.iterator();
                                while (it4.hasNext()) {
                                }
                                MutabilityQualifier mutabilityQualifier822222 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList622222), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                                if (nullabilityQualifier10 != null) {
                                }
                                nullabilityQualifier5 = null;
                                if (nullabilityQualifier5 == nullabilityQualifier9) {
                                }
                                z22 = false;
                                if (nullabilityQualifier5 == null) {
                                }
                                z23 = false;
                                cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier822222, z22, z23);
                                i10 = i12 + 1;
                                size = i13;
                                d5 = arrayList2;
                                cVarArr2 = cVarArr;
                                z30 = z13;
                                cVar4 = cVar;
                            }
                            z16 = false;
                            cVar2 = new c9.c(nullabilityQualifier2, mutabilityQualifier9, z15, z16);
                            ArrayList arrayList322222 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                            }
                            i12 = i11;
                            if (i12 != 0) {
                            }
                            z19 = false;
                            if (i12 == 0) {
                            }
                            z20 = false;
                            ArrayList arrayList4222222 = new ArrayList();
                            it3 = arrayList322222.iterator();
                            while (it3.hasNext()) {
                            }
                            Set Q2322222 = kotlin.collections.c.Q2(arrayList4222222);
                            z21 = cVar2.f6569d;
                            NullabilityQualifier nullabilityQualifier11222222 = cVar2.f6567a;
                            if (!z21) {
                            }
                            if (nullabilityQualifier3 != nullabilityQualifier10) {
                            }
                            if (nullabilityQualifier4 != null) {
                            }
                            ArrayList arrayList6222222 = new ArrayList();
                            it4 = arrayList322222.iterator();
                            while (it4.hasNext()) {
                            }
                            MutabilityQualifier mutabilityQualifier8222222 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList6222222), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                            if (nullabilityQualifier10 != null) {
                            }
                            nullabilityQualifier5 = null;
                            if (nullabilityQualifier5 == nullabilityQualifier9) {
                            }
                            z22 = false;
                            if (nullabilityQualifier5 == null) {
                            }
                            z23 = false;
                            cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier8222222, z22, z23);
                            i10 = i12 + 1;
                            size = i13;
                            d5 = arrayList2;
                            cVarArr2 = cVarArr;
                            z30 = z13;
                            cVar4 = cVar;
                        }
                        annotationQualifierApplicabilityType = annotationQualifierApplicabilityType3;
                        oVar = c0155a.f13899b;
                        if (oVar == null) {
                        }
                        if (i0Var == null) {
                        }
                        if (eVar == null) {
                        }
                        if (eVar == null) {
                        }
                        if (nullabilityQualifier != nullabilityQualifier9) {
                        }
                        z15 = true;
                        if (kVar == null) {
                        }
                        eVar3 = null;
                        if (eVar3 != null) {
                        }
                        if (eVar2 != null) {
                        }
                        if (eVar2 == null) {
                        }
                        z16 = false;
                        cVar2 = new c9.c(nullabilityQualifier2, mutabilityQualifier9, z15, z16);
                        ArrayList arrayList3222222 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        i12 = i11;
                        if (i12 != 0) {
                        }
                        z19 = false;
                        if (i12 == 0) {
                        }
                        z20 = false;
                        ArrayList arrayList42222222 = new ArrayList();
                        it3 = arrayList3222222.iterator();
                        while (it3.hasNext()) {
                        }
                        Set Q23222222 = kotlin.collections.c.Q2(arrayList42222222);
                        z21 = cVar2.f6569d;
                        NullabilityQualifier nullabilityQualifier112222222 = cVar2.f6567a;
                        if (!z21) {
                        }
                        if (nullabilityQualifier3 != nullabilityQualifier10) {
                        }
                        if (nullabilityQualifier4 != null) {
                        }
                        ArrayList arrayList62222222 = new ArrayList();
                        it4 = arrayList3222222.iterator();
                        while (it4.hasNext()) {
                        }
                        MutabilityQualifier mutabilityQualifier82222222 = (MutabilityQualifier) m0.b.i1(kotlin.collections.c.Q2(arrayList62222222), mutabilityQualifier2, mutabilityQualifier, cVar2.f6568b, z19);
                        if (nullabilityQualifier10 != null) {
                        }
                        nullabilityQualifier5 = null;
                        if (nullabilityQualifier5 == nullabilityQualifier9) {
                        }
                        z22 = false;
                        if (nullabilityQualifier5 == null) {
                        }
                        z23 = false;
                        cVarArr[i12] = new c9.c(nullabilityQualifier5, mutabilityQualifier82222222, z22, z23);
                        i10 = i12 + 1;
                        size = i13;
                        d5 = arrayList2;
                        cVarArr2 = cVarArr;
                        z30 = z13;
                        cVar4 = cVar;
                    }
                }
                AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$1 = new AbstractSignatureParts$computeIndexedQualifiers$1(hVar, cVarArr2);
                b bVar4 = this.f13905a;
                bVar4.getClass();
                return bVar4.b(rVar.X0(), abstractSignatureParts$computeIndexedQualifiers$1, 0, gVar.f6578e).f13901a;
            }
        }
        z11 = false;
        if (!z11) {
        }
        c9.c[] cVarArr22 = new c9.c[size];
        i10 = 0;
        while (i10 < size) {
        }
        AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$12 = new AbstractSignatureParts$computeIndexedQualifiers$1(hVar, cVarArr22);
        b bVar42 = this.f13905a;
        bVar42.getClass();
        return bVar42.b(rVar.X0(), abstractSignatureParts$computeIndexedQualifiers$12, 0, gVar.f6578e).f13901a;
    }

    public final r b(CallableMemberDescriptor callableMemberDescriptor, m8.a aVar, boolean z10, x8.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, h hVar, boolean z11, u7.l<? super CallableMemberDescriptor, ? extends r> lVar) {
        g gVar = new g(aVar, z10, cVar, annotationQualifierApplicabilityType);
        r U = lVar.U(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> f10 = callableMemberDescriptor.f();
        v7.g.e(f10, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(l.Z1(f10, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : f10) {
            v7.g.e(callableMemberDescriptor2, "it");
            arrayList.add(lVar.U(callableMemberDescriptor2));
        }
        return a(gVar, U, arrayList, hVar, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(x8.c cVar, Collection collection) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        List<b9.a> list;
        boolean z10;
        m8.e fVar;
        CallableMemberDescriptor callableMemberDescriptor;
        c0 R;
        w8.a aVar;
        CallableMemberDescriptor callableMemberDescriptor2;
        x8.c cVar2;
        r rVar;
        JavaMethodDescriptor javaMethodDescriptor;
        c9.f fVar2;
        JavaTypeEnhancementState javaTypeEnhancementState;
        boolean z11;
        boolean z12;
        boolean z13;
        c9.f fVar3;
        CallableMemberDescriptor callableMemberDescriptor3;
        z zVar;
        boolean z14;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        h hVar;
        r b5;
        r k3;
        SignatureEnhancement$containsFunctionN$1 signatureEnhancement$containsFunctionN$1;
        boolean z15;
        Pair pair;
        r rVar2;
        Iterator it;
        boolean z16;
        boolean z17;
        boolean z18;
        r b10;
        h hVar2;
        x8.c cVar3;
        List<h> list2;
        CallableMemberDescriptor callableMemberDescriptor4;
        m8.a aVar2;
        x8.c cVar4;
        boolean z19;
        v7.g.f(cVar, "c");
        v7.g.f(collection, "platformSignatures");
        int i10 = 10;
        ArrayList arrayList = new ArrayList(l.Z1(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor5 = (CallableMemberDescriptor) it2.next();
            if (callableMemberDescriptor5 instanceof w8.a) {
                w8.a aVar3 = (w8.a) callableMemberDescriptor5;
                boolean z20 = true;
                if (aVar3.h() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || aVar3.a().f().size() != 1) {
                    l8.d t02 = m0.b.t0(callableMemberDescriptor5);
                    if (t02 != null) {
                        if (t02 instanceof LazyJavaClassDescriptor) {
                            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) t02;
                        } else {
                            lazyJavaClassDescriptor = null;
                        }
                        if (lazyJavaClassDescriptor != null) {
                            list = (List) lazyJavaClassDescriptor.f13729t.getValue();
                        } else {
                            list = null;
                        }
                        if (list != null && !list.isEmpty()) {
                            z10 = false;
                            if (!z10) {
                                ArrayList arrayList2 = new ArrayList(l.Z1(list, i10));
                                for (b9.a aVar4 : list) {
                                    arrayList2.add(new LazyJavaAnnotationDescriptor(cVar, aVar4, true));
                                }
                                ArrayList x22 = kotlin.collections.c.x2(callableMemberDescriptor5.getAnnotations(), arrayList2);
                                if (x22.isEmpty()) {
                                    fVar = e.a.f16014a;
                                } else {
                                    fVar = new m8.f(x22);
                                }
                                x8.c b11 = ContextKt.b(cVar, fVar);
                                if (callableMemberDescriptor5 instanceof w8.e) {
                                    d0 d0Var = ((w8.e) callableMemberDescriptor5).F;
                                    if (d0Var != null && !d0Var.f16387m) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        v7.g.c(d0Var);
                                        callableMemberDescriptor = d0Var;
                                        w8.a aVar5 = (w8.a) callableMemberDescriptor5;
                                        R = aVar5.R();
                                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.f13606k;
                                        if (R != null) {
                                            if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                                                callableMemberDescriptor4 = null;
                                            } else {
                                                callableMemberDescriptor4 = callableMemberDescriptor;
                                            }
                                            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) callableMemberDescriptor4;
                                            if (eVar != null) {
                                                aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.h) eVar.L(JavaMethodDescriptor.O);
                                            } else {
                                                aVar2 = null;
                                            }
                                            u7.l<? super CallableMemberDescriptor, ? extends r> lVar = SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.f13890j;
                                            if (aVar2 != null) {
                                                cVar4 = ContextKt.b(b11, aVar2.getAnnotations());
                                            } else {
                                                cVar4 = b11;
                                            }
                                            aVar = aVar5;
                                            callableMemberDescriptor2 = callableMemberDescriptor;
                                            cVar2 = b11;
                                            rVar = b(callableMemberDescriptor5, aVar2, false, cVar4, annotationQualifierApplicabilityType2, null, false, lVar);
                                        } else {
                                            aVar = aVar5;
                                            callableMemberDescriptor2 = callableMemberDescriptor;
                                            cVar2 = b11;
                                            rVar = null;
                                        }
                                        if (callableMemberDescriptor5 instanceof JavaMethodDescriptor) {
                                            javaMethodDescriptor = (JavaMethodDescriptor) callableMemberDescriptor5;
                                        } else {
                                            javaMethodDescriptor = null;
                                        }
                                        if (javaMethodDescriptor != null) {
                                            l8.f c = javaMethodDescriptor.c();
                                            v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                            String y12 = a1.c.y1((l8.b) c, d9.j.a(javaMethodDescriptor, 3));
                                            if (y12 != null) {
                                                fVar2 = (c9.f) PredefinedEnhancementInfoKt.f13855d.get(y12);
                                                if (fVar2 != null) {
                                                    fVar2.f6574b.size();
                                                    aVar.m().size();
                                                }
                                                javaTypeEnhancementState = cVar.f18762a.f18758v;
                                                v7.g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                                                if (javaTypeEnhancementState.f13620b.U(m.f17855a) != ReportLevel.f13627l) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    cVar2.f18762a.f18756t.b();
                                                } else {
                                                    if ((callableMemberDescriptor5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && v7.g.a(callableMemberDescriptor5.L(JavaMethodDescriptor.P), Boolean.TRUE)) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (z12) {
                                                        z13 = true;
                                                        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = callableMemberDescriptor2.m();
                                                        v7.g.e(m10, "annotationOwnerForMember.valueParameters");
                                                        ArrayList arrayList3 = new ArrayList(l.Z1(m10, i10));
                                                        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar3 : m10) {
                                                            if (fVar2 != null && (list2 = fVar2.f6574b) != null) {
                                                                hVar2 = (h) kotlin.collections.c.q2(hVar3.getIndex(), list2);
                                                            } else {
                                                                hVar2 = null;
                                                            }
                                                            u7.l<? super CallableMemberDescriptor, ? extends r> signatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 = new SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(hVar3);
                                                            if (hVar3 != null) {
                                                                cVar3 = ContextKt.b(cVar2, hVar3.getAnnotations());
                                                            } else {
                                                                cVar3 = cVar2;
                                                            }
                                                            ArrayList arrayList4 = arrayList3;
                                                            arrayList4.add(b(callableMemberDescriptor5, hVar3, false, cVar3, annotationQualifierApplicabilityType2, hVar2, z13, signatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1));
                                                            arrayList3 = arrayList4;
                                                            fVar2 = fVar2;
                                                        }
                                                        ArrayList arrayList5 = arrayList3;
                                                        fVar3 = fVar2;
                                                        if (!(callableMemberDescriptor5 instanceof z)) {
                                                            callableMemberDescriptor3 = null;
                                                        } else {
                                                            callableMemberDescriptor3 = callableMemberDescriptor5;
                                                        }
                                                        zVar = (z) callableMemberDescriptor3;
                                                        if (zVar == null && m0.b.G0(zVar)) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f13607l;
                                                        } else {
                                                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f13605j;
                                                        }
                                                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType;
                                                        if (fVar3 != null) {
                                                            hVar = fVar3.f6573a;
                                                        } else {
                                                            hVar = null;
                                                        }
                                                        b5 = b(callableMemberDescriptor5, callableMemberDescriptor2, true, cVar2, annotationQualifierApplicabilityType3, hVar, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f13891j);
                                                        k3 = aVar.k();
                                                        v7.g.c(k3);
                                                        signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.f13889j;
                                                        if (!kotlin.reflect.jvm.internal.impl.types.r.c(k3, signatureEnhancement$containsFunctionN$1)) {
                                                            c0 R2 = aVar.R();
                                                            if (R2 != null && (b10 = R2.b()) != null) {
                                                                z17 = kotlin.reflect.jvm.internal.impl.types.r.c(b10, signatureEnhancement$containsFunctionN$1);
                                                            } else {
                                                                z17 = false;
                                                            }
                                                            if (!z17) {
                                                                List<kotlin.reflect.jvm.internal.impl.descriptors.h> m11 = aVar.m();
                                                                v7.g.e(m11, "valueParameters");
                                                                if (!m11.isEmpty()) {
                                                                    for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar4 : m11) {
                                                                        r b12 = hVar4.b();
                                                                        v7.g.e(b12, "it.type");
                                                                        if (kotlin.reflect.jvm.internal.impl.types.r.c(b12, SignatureEnhancement$containsFunctionN$1.f13889j)) {
                                                                            z18 = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                z18 = false;
                                                                if (!z18) {
                                                                    z15 = false;
                                                                    if (!z15) {
                                                                        pair = new Pair(n9.b.f16139a, new u8.d(callableMemberDescriptor5));
                                                                    } else {
                                                                        pair = null;
                                                                    }
                                                                    if (rVar == null && b5 == null) {
                                                                        if (arrayList5.isEmpty()) {
                                                                            Iterator it3 = arrayList5.iterator();
                                                                            while (it3.hasNext()) {
                                                                                if (((r) it3.next()) != null) {
                                                                                    z16 = true;
                                                                                    continue;
                                                                                } else {
                                                                                    z16 = false;
                                                                                    continue;
                                                                                }
                                                                                if (z16) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        z20 = false;
                                                                        if (!z20) {
                                                                            if (pair == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                    if (rVar == null) {
                                                                        c0 R3 = aVar.R();
                                                                        if (R3 != null) {
                                                                            rVar = R3.b();
                                                                        } else {
                                                                            rVar2 = null;
                                                                            ArrayList arrayList6 = new ArrayList(l.Z1(arrayList5, 10));
                                                                            it = arrayList5.iterator();
                                                                            int i11 = 0;
                                                                            while (it.hasNext()) {
                                                                                Object next = it.next();
                                                                                int i12 = i11 + 1;
                                                                                if (i11 >= 0) {
                                                                                    r rVar3 = (r) next;
                                                                                    if (rVar3 == null) {
                                                                                        rVar3 = aVar.m().get(i11).b();
                                                                                        v7.g.e(rVar3, "valueParameters[index].type");
                                                                                    }
                                                                                    arrayList6.add(rVar3);
                                                                                    i11 = i12;
                                                                                } else {
                                                                                    a1.c.F1();
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            if (b5 == null) {
                                                                                b5 = aVar.k();
                                                                                v7.g.c(b5);
                                                                            }
                                                                            callableMemberDescriptor5 = aVar.S(rVar2, arrayList6, b5, pair);
                                                                            v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                                            arrayList.add(callableMemberDescriptor5);
                                                                            i10 = 10;
                                                                        }
                                                                    }
                                                                    rVar2 = rVar;
                                                                    ArrayList arrayList62 = new ArrayList(l.Z1(arrayList5, 10));
                                                                    it = arrayList5.iterator();
                                                                    int i112 = 0;
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    if (b5 == null) {
                                                                    }
                                                                    callableMemberDescriptor5 = aVar.S(rVar2, arrayList62, b5, pair);
                                                                    v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                                    arrayList.add(callableMemberDescriptor5);
                                                                    i10 = 10;
                                                                }
                                                            }
                                                        }
                                                        z15 = true;
                                                        if (!z15) {
                                                        }
                                                        if (rVar == null) {
                                                            if (arrayList5.isEmpty()) {
                                                            }
                                                            z20 = false;
                                                            if (!z20) {
                                                            }
                                                        }
                                                        if (rVar == null) {
                                                        }
                                                        rVar2 = rVar;
                                                        ArrayList arrayList622 = new ArrayList(l.Z1(arrayList5, 10));
                                                        it = arrayList5.iterator();
                                                        int i1122 = 0;
                                                        while (it.hasNext()) {
                                                        }
                                                        if (b5 == null) {
                                                        }
                                                        callableMemberDescriptor5 = aVar.S(rVar2, arrayList622, b5, pair);
                                                        v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                        arrayList.add(callableMemberDescriptor5);
                                                        i10 = 10;
                                                    }
                                                }
                                                z13 = false;
                                                List<kotlin.reflect.jvm.internal.impl.descriptors.h> m102 = callableMemberDescriptor2.m();
                                                v7.g.e(m102, "annotationOwnerForMember.valueParameters");
                                                ArrayList arrayList32 = new ArrayList(l.Z1(m102, i10));
                                                while (r22.hasNext()) {
                                                }
                                                ArrayList arrayList52 = arrayList32;
                                                fVar3 = fVar2;
                                                if (!(callableMemberDescriptor5 instanceof z)) {
                                                }
                                                zVar = (z) callableMemberDescriptor3;
                                                if (zVar == null) {
                                                }
                                                z14 = false;
                                                if (z14) {
                                                }
                                                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType32 = annotationQualifierApplicabilityType;
                                                if (fVar3 != null) {
                                                }
                                                b5 = b(callableMemberDescriptor5, callableMemberDescriptor2, true, cVar2, annotationQualifierApplicabilityType32, hVar, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f13891j);
                                                k3 = aVar.k();
                                                v7.g.c(k3);
                                                signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.f13889j;
                                                if (!kotlin.reflect.jvm.internal.impl.types.r.c(k3, signatureEnhancement$containsFunctionN$1)) {
                                                }
                                                z15 = true;
                                                if (!z15) {
                                                }
                                                if (rVar == null) {
                                                }
                                                if (rVar == null) {
                                                }
                                                rVar2 = rVar;
                                                ArrayList arrayList6222 = new ArrayList(l.Z1(arrayList52, 10));
                                                it = arrayList52.iterator();
                                                int i11222 = 0;
                                                while (it.hasNext()) {
                                                }
                                                if (b5 == null) {
                                                }
                                                callableMemberDescriptor5 = aVar.S(rVar2, arrayList6222, b5, pair);
                                                v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                                arrayList.add(callableMemberDescriptor5);
                                                i10 = 10;
                                            }
                                        }
                                        fVar2 = null;
                                        if (fVar2 != null) {
                                        }
                                        javaTypeEnhancementState = cVar.f18762a.f18758v;
                                        v7.g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                                        if (javaTypeEnhancementState.f13620b.U(m.f17855a) != ReportLevel.f13627l) {
                                        }
                                        if (z11) {
                                        }
                                        z13 = false;
                                        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m1022 = callableMemberDescriptor2.m();
                                        v7.g.e(m1022, "annotationOwnerForMember.valueParameters");
                                        ArrayList arrayList322 = new ArrayList(l.Z1(m1022, i10));
                                        while (r22.hasNext()) {
                                        }
                                        ArrayList arrayList522 = arrayList322;
                                        fVar3 = fVar2;
                                        if (!(callableMemberDescriptor5 instanceof z)) {
                                        }
                                        zVar = (z) callableMemberDescriptor3;
                                        if (zVar == null) {
                                        }
                                        z14 = false;
                                        if (z14) {
                                        }
                                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType322 = annotationQualifierApplicabilityType;
                                        if (fVar3 != null) {
                                        }
                                        b5 = b(callableMemberDescriptor5, callableMemberDescriptor2, true, cVar2, annotationQualifierApplicabilityType322, hVar, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f13891j);
                                        k3 = aVar.k();
                                        v7.g.c(k3);
                                        signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.f13889j;
                                        if (!kotlin.reflect.jvm.internal.impl.types.r.c(k3, signatureEnhancement$containsFunctionN$1)) {
                                        }
                                        z15 = true;
                                        if (!z15) {
                                        }
                                        if (rVar == null) {
                                        }
                                        if (rVar == null) {
                                        }
                                        rVar2 = rVar;
                                        ArrayList arrayList62222 = new ArrayList(l.Z1(arrayList522, 10));
                                        it = arrayList522.iterator();
                                        int i112222 = 0;
                                        while (it.hasNext()) {
                                        }
                                        if (b5 == null) {
                                        }
                                        callableMemberDescriptor5 = aVar.S(rVar2, arrayList62222, b5, pair);
                                        v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                        arrayList.add(callableMemberDescriptor5);
                                        i10 = 10;
                                    }
                                }
                                callableMemberDescriptor = callableMemberDescriptor5;
                                w8.a aVar52 = (w8.a) callableMemberDescriptor5;
                                R = aVar52.R();
                                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType22 = AnnotationQualifierApplicabilityType.f13606k;
                                if (R != null) {
                                }
                                if (callableMemberDescriptor5 instanceof JavaMethodDescriptor) {
                                }
                                if (javaMethodDescriptor != null) {
                                }
                                fVar2 = null;
                                if (fVar2 != null) {
                                }
                                javaTypeEnhancementState = cVar.f18762a.f18758v;
                                v7.g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                                if (javaTypeEnhancementState.f13620b.U(m.f17855a) != ReportLevel.f13627l) {
                                }
                                if (z11) {
                                }
                                z13 = false;
                                List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10222 = callableMemberDescriptor2.m();
                                v7.g.e(m10222, "annotationOwnerForMember.valueParameters");
                                ArrayList arrayList3222 = new ArrayList(l.Z1(m10222, i10));
                                while (r22.hasNext()) {
                                }
                                ArrayList arrayList5222 = arrayList3222;
                                fVar3 = fVar2;
                                if (!(callableMemberDescriptor5 instanceof z)) {
                                }
                                zVar = (z) callableMemberDescriptor3;
                                if (zVar == null) {
                                }
                                z14 = false;
                                if (z14) {
                                }
                                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3222 = annotationQualifierApplicabilityType;
                                if (fVar3 != null) {
                                }
                                b5 = b(callableMemberDescriptor5, callableMemberDescriptor2, true, cVar2, annotationQualifierApplicabilityType3222, hVar, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f13891j);
                                k3 = aVar.k();
                                v7.g.c(k3);
                                signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.f13889j;
                                if (!kotlin.reflect.jvm.internal.impl.types.r.c(k3, signatureEnhancement$containsFunctionN$1)) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (rVar == null) {
                                }
                                if (rVar == null) {
                                }
                                rVar2 = rVar;
                                ArrayList arrayList622222 = new ArrayList(l.Z1(arrayList5222, 10));
                                it = arrayList5222.iterator();
                                int i1122222 = 0;
                                while (it.hasNext()) {
                                }
                                if (b5 == null) {
                                }
                                callableMemberDescriptor5 = aVar.S(rVar2, arrayList622222, b5, pair);
                                v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                arrayList.add(callableMemberDescriptor5);
                                i10 = 10;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    fVar = callableMemberDescriptor5.getAnnotations();
                    x8.c b112 = ContextKt.b(cVar, fVar);
                    if (callableMemberDescriptor5 instanceof w8.e) {
                    }
                    callableMemberDescriptor = callableMemberDescriptor5;
                    w8.a aVar522 = (w8.a) callableMemberDescriptor5;
                    R = aVar522.R();
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType222 = AnnotationQualifierApplicabilityType.f13606k;
                    if (R != null) {
                    }
                    if (callableMemberDescriptor5 instanceof JavaMethodDescriptor) {
                    }
                    if (javaMethodDescriptor != null) {
                    }
                    fVar2 = null;
                    if (fVar2 != null) {
                    }
                    javaTypeEnhancementState = cVar.f18762a.f18758v;
                    v7.g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                    if (javaTypeEnhancementState.f13620b.U(m.f17855a) != ReportLevel.f13627l) {
                    }
                    if (z11) {
                    }
                    z13 = false;
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m102222 = callableMemberDescriptor2.m();
                    v7.g.e(m102222, "annotationOwnerForMember.valueParameters");
                    ArrayList arrayList32222 = new ArrayList(l.Z1(m102222, i10));
                    while (r22.hasNext()) {
                    }
                    ArrayList arrayList52222 = arrayList32222;
                    fVar3 = fVar2;
                    if (!(callableMemberDescriptor5 instanceof z)) {
                    }
                    zVar = (z) callableMemberDescriptor3;
                    if (zVar == null) {
                    }
                    z14 = false;
                    if (z14) {
                    }
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType32222 = annotationQualifierApplicabilityType;
                    if (fVar3 != null) {
                    }
                    b5 = b(callableMemberDescriptor5, callableMemberDescriptor2, true, cVar2, annotationQualifierApplicabilityType32222, hVar, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.f13891j);
                    k3 = aVar.k();
                    v7.g.c(k3);
                    signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.f13889j;
                    if (!kotlin.reflect.jvm.internal.impl.types.r.c(k3, signatureEnhancement$containsFunctionN$1)) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (rVar == null) {
                    }
                    if (rVar == null) {
                    }
                    rVar2 = rVar;
                    ArrayList arrayList6222222 = new ArrayList(l.Z1(arrayList52222, 10));
                    it = arrayList52222.iterator();
                    int i11222222 = 0;
                    while (it.hasNext()) {
                    }
                    if (b5 == null) {
                    }
                    callableMemberDescriptor5 = aVar.S(rVar2, arrayList6222222, b5, pair);
                    v7.g.d(callableMemberDescriptor5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    arrayList.add(callableMemberDescriptor5);
                    i10 = 10;
                }
            }
            arrayList.add(callableMemberDescriptor5);
            i10 = 10;
        }
        return arrayList;
    }

    public final ArrayList d(o8.i iVar, List list, x8.c cVar) {
        r a10;
        v7.g.f(iVar, "typeParameter");
        v7.g.f(list, "bounds");
        v7.g.f(cVar, "context");
        ArrayList arrayList = new ArrayList(l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (!TypeUtilsKt.b(rVar, SignatureEnhancement$enhanceTypeParameterBounds$1$1.f13893j) && (a10 = a(new g(iVar, false, cVar, AnnotationQualifierApplicabilityType.n), rVar, EmptyList.f12981i, null, false)) != null) {
                rVar = a10;
            }
            arrayList.add(rVar);
        }
        return arrayList;
    }
}
