package kotlin.reflect.jvm.internal.impl.load.java;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import n7.l;
import u8.j;
import u8.o;
import u8.r;
import v7.g;

/* loaded from: classes.dex */
public abstract class a<TAnnotation> {
    @Deprecated
    public static final LinkedHashMap c;

    /* renamed from: a  reason: collision with root package name */
    public final JavaTypeEnhancementState f13655a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Object, TAnnotation> f13656b;

    static {
        AnnotationQualifierApplicabilityType[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String str = annotationQualifierApplicabilityType.f13610i;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, annotationQualifierApplicabilityType);
            }
        }
        c = linkedHashMap;
    }

    public a(JavaTypeEnhancementState javaTypeEnhancementState) {
        g.f(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f13655a = javaTypeEnhancementState;
        this.f13656b = new ConcurrentHashMap<>();
    }

    public abstract ArrayList a(Object obj, boolean z10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o b(o oVar, Iterable<? extends TAnnotation> iterable) {
        EnumMap enumMap;
        EnumMap<AnnotationQualifierApplicabilityType, j> enumMap2;
        j jVar;
        ReportLevel j2;
        boolean z10;
        boolean z11;
        j jVar2;
        TAnnotation d5;
        TAnnotation tannotation;
        Pair pair;
        boolean z12;
        boolean z13;
        boolean z14;
        c9.e c10;
        boolean z15;
        j jVar3;
        g.f(iterable, "annotations");
        JavaTypeEnhancementState javaTypeEnhancementState = this.f13655a;
        if (javaTypeEnhancementState.c) {
            return oVar;
        }
        ArrayList arrayList = new ArrayList();
        for (TAnnotation tannotation2 : iterable) {
            ReportLevel reportLevel = ReportLevel.f13626k;
            ReportLevel reportLevel2 = ReportLevel.f13625j;
            if (!javaTypeEnhancementState.c && (jVar = (j) u8.a.f17839g.get(e(tannotation2))) != null) {
                h9.c e10 = e(tannotation2);
                if (e10 != null && u8.a.f17838f.containsKey(e10)) {
                    j2 = javaTypeEnhancementState.f13620b.U(e10);
                } else {
                    j2 = j(tannotation2);
                    if (j2 == null) {
                        j2 = javaTypeEnhancementState.f13619a.f13681a;
                    }
                }
                if (j2 != reportLevel2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    j2 = null;
                }
                if (j2 != null) {
                    if (j2 == reportLevel) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c9.e a10 = c9.e.a(jVar.f17850a, null, z11, 1);
                    Collection<AnnotationQualifierApplicabilityType> collection = jVar.f17851b;
                    g.f(collection, "qualifierApplicabilityTypes");
                    jVar2 = new j(a10, collection, jVar.c);
                    if (jVar2 == null) {
                        jVar3 = jVar2;
                    } else {
                        if (!javaTypeEnhancementState.f13619a.f13683d && (d5 = d(tannotation2, u8.a.c)) != null) {
                            Iterator<TAnnotation> it = g(tannotation2).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    tannotation = it.next();
                                    if (k(tannotation) != null) {
                                        z13 = true;
                                        continue;
                                    } else {
                                        z13 = false;
                                        continue;
                                    }
                                    if (z13) {
                                        break;
                                    }
                                } else {
                                    tannotation = null;
                                    break;
                                }
                            }
                            if (tannotation != null) {
                                ArrayList<String> a11 = a(d5, true);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (String str : a11) {
                                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) c.get(str);
                                    if (annotationQualifierApplicabilityType != null) {
                                        linkedHashSet.add(annotationQualifierApplicabilityType);
                                    }
                                }
                                if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.f13608m)) {
                                    Set x22 = kotlin.collections.b.x2(AnnotationQualifierApplicabilityType.values());
                                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.n;
                                    g.f(x22, "<this>");
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(m0.b.O0(x22.size()));
                                    boolean z16 = false;
                                    for (Object obj : x22) {
                                        if (!z16 && g.a(obj, annotationQualifierApplicabilityType2)) {
                                            z16 = true;
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (z12) {
                                            linkedHashSet2.add(obj);
                                        }
                                    }
                                    linkedHashSet = l.c2(linkedHashSet2, linkedHashSet);
                                }
                                pair = new Pair(tannotation, linkedHashSet);
                                if (pair == null) {
                                    Set set = (Set) pair.f12963j;
                                    ReportLevel j10 = j(tannotation2);
                                    A a12 = pair.f12962i;
                                    if (j10 == null && (j10 = j(a12)) == null) {
                                        j10 = javaTypeEnhancementState.f13619a.f13681a;
                                    }
                                    j10.getClass();
                                    if (j10 == reportLevel2) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14 && (c10 = c(a12, AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1.f13604j)) != null) {
                                        if (j10 == reportLevel) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        jVar3 = new j(c9.e.a(c10, null, z15, 1), set);
                                    }
                                }
                                jVar3 = null;
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                        jVar3 = null;
                    }
                    if (jVar3 == null) {
                        arrayList.add(jVar3);
                    }
                }
            }
            jVar2 = null;
            if (jVar2 == null) {
            }
            if (jVar3 == null) {
            }
        }
        if (arrayList.isEmpty()) {
            return oVar;
        }
        if (oVar != null && (enumMap2 = oVar.f17861a) != null) {
            enumMap = new EnumMap((EnumMap) enumMap2);
        } else {
            enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        }
        Iterator it2 = arrayList.iterator();
        boolean z17 = false;
        while (it2.hasNext()) {
            j jVar4 = (j) it2.next();
            for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 : jVar4.f17851b) {
                enumMap.put((EnumMap) annotationQualifierApplicabilityType3, (AnnotationQualifierApplicabilityType) jVar4);
                z17 = true;
            }
        }
        if (!z17) {
            return oVar;
        }
        return new o(enumMap);
    }

    public final c9.e c(TAnnotation tannotation, u7.l<? super TAnnotation, Boolean> lVar) {
        boolean z10;
        c9.e i10;
        c9.e i11 = i(tannotation, lVar.U(tannotation).booleanValue());
        if (i11 != null) {
            return i11;
        }
        TAnnotation k3 = k(tannotation);
        if (k3 == null) {
            return null;
        }
        ReportLevel j2 = j(tannotation);
        if (j2 == null) {
            j2 = this.f13655a.f13619a.f13681a;
        }
        j2.getClass();
        boolean z11 = false;
        if (j2 == ReportLevel.f13625j) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (i10 = i(k3, lVar.U(k3).booleanValue())) == null) {
            return null;
        }
        if (j2 == ReportLevel.f13626k) {
            z11 = true;
        }
        return c9.e.a(i10, null, z11, 1);
    }

    public final TAnnotation d(TAnnotation tannotation, h9.c cVar) {
        for (TAnnotation tannotation2 : g(tannotation)) {
            if (g.a(e(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract h9.c e(TAnnotation tannotation);

    public abstract l8.b f(Object obj);

    public abstract Iterable<TAnnotation> g(TAnnotation tannotation);

    public final boolean h(TAnnotation tannotation, h9.c cVar) {
        Iterable<TAnnotation> g10 = g(tannotation);
        if ((g10 instanceof Collection) && ((Collection) g10).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation2 : g10) {
            if (g.a(e(tannotation2), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r10.equals("MAYBE") == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c9.e i(TAnnotation tannotation, boolean z10) {
        boolean z11;
        boolean z12;
        h9.c e10 = e(tannotation);
        if (e10 == null) {
            return null;
        }
        ReportLevel U = this.f13655a.f13620b.U(e10);
        U.getClass();
        boolean z13 = true;
        if (U == ReportLevel.f13625j) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        boolean contains = r.f17881d.contains(e10);
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NULLABLE;
        if (!contains) {
            boolean contains2 = r.f17884g.contains(e10);
            NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.NOT_NULL;
            if (!contains2) {
                if (!g.a(e10, r.f17879a)) {
                    boolean a10 = g.a(e10, r.f17880b);
                    NullabilityQualifier nullabilityQualifier3 = NullabilityQualifier.FORCE_FLEXIBILITY;
                    if (!a10) {
                        if (g.a(e10, r.f17882e)) {
                            String str = (String) kotlin.collections.c.o2(a(tannotation, false));
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        if (!str.equals("NEVER")) {
                                            return null;
                                        }
                                        break;
                                    case 433141802:
                                        if (!str.equals("UNKNOWN")) {
                                            return null;
                                        }
                                        break;
                                    case 1933739535:
                                        if (str.equals("ALWAYS")) {
                                            break;
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                            }
                        } else if (!g.a(e10, r.f17885h)) {
                            if (!g.a(e10, r.f17886i) && !g.a(e10, r.f17888k)) {
                                if (!g.a(e10, r.f17887j)) {
                                    return null;
                                }
                            }
                        }
                    }
                    nullabilityQualifier = nullabilityQualifier3;
                }
            }
            nullabilityQualifier = nullabilityQualifier2;
        }
        if (U == ReportLevel.f13626k) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !z10) {
            z13 = false;
        }
        return new c9.e(nullabilityQualifier, z13);
    }

    public final ReportLevel j(TAnnotation tannotation) {
        ArrayList a10;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f13655a;
        ReportLevel reportLevel = javaTypeEnhancementState.f13619a.c.get(e(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation d5 = d(tannotation, u8.a.f17836d);
        if (d5 != null && (a10 = a(d5, false)) != null && (str = (String) kotlin.collections.c.o2(a10)) != null) {
            ReportLevel reportLevel2 = javaTypeEnhancementState.f13619a.f13682b;
            if (reportLevel2 == null) {
                int hashCode = str.hashCode();
                if (hashCode != -2137067054) {
                    if (hashCode != -1838656823) {
                        if (hashCode == 2656902 && str.equals("WARN")) {
                            return ReportLevel.f13626k;
                        }
                    } else if (str.equals("STRICT")) {
                        return ReportLevel.f13627l;
                    }
                } else if (str.equals("IGNORE")) {
                    return ReportLevel.f13625j;
                }
            } else {
                return reportLevel2;
            }
        }
        return null;
    }

    public final TAnnotation k(TAnnotation tannotation) {
        TAnnotation tannotation2;
        g.f(tannotation, "annotation");
        if (this.f13655a.f13619a.f13683d) {
            return null;
        }
        if (!kotlin.collections.c.h2(u8.a.f17840h, e(tannotation)) && !h(tannotation, u8.a.f17835b)) {
            if (!h(tannotation, u8.a.f17834a)) {
                return null;
            }
            ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f13656b;
            l8.b f10 = f(tannotation);
            TAnnotation tannotation3 = concurrentHashMap.get(f10);
            if (tannotation3 == null) {
                Iterator<TAnnotation> it = g(tannotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation2 = k(it.next());
                        if (tannotation2 != null) {
                            break;
                        }
                    } else {
                        tannotation2 = null;
                        break;
                    }
                }
                if (tannotation2 == null) {
                    return null;
                }
                TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(f10, tannotation2);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return tannotation2;
            }
            return tannotation3;
        }
        return tannotation;
    }
}
