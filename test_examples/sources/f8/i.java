package f8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import l8.c0;
import l8.d0;
import l8.s;
import m9.n;
import n7.n;
import q8.i;
import r8.l;
import u7.p;
import v7.k;
import y9.f0;
import y9.r;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.c f10969a = new h9.c("kotlin.jvm.JvmStatic");

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10970a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.f13297o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.f13298p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.f13299q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.f13300r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.f13301s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.f13302t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.f13303u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f10970a = iArr;
        }
    }

    public static final KCallableImpl<?> a(Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl == null) {
            KFunctionImpl b5 = b(obj);
            return b5 != null ? b5 : c(obj);
        }
        return kCallableImpl;
    }

    public static final KFunctionImpl b(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl == null) {
            FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
            c8.a b5 = functionReference != null ? functionReference.b() : null;
            if (b5 instanceof KFunctionImpl) {
                return (KFunctionImpl) b5;
            }
            return null;
        }
        return kFunctionImpl;
    }

    public static final KPropertyImpl<?> c(Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl == null) {
            PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
            c8.a b5 = propertyReference != null ? propertyReference.b() : null;
            if (b5 instanceof KPropertyImpl) {
                return (KPropertyImpl) b5;
            }
            return null;
        }
        return kPropertyImpl;
    }

    public static final ArrayList d(m8.a aVar) {
        boolean z10;
        List N0;
        Annotation i10;
        r8.d dVar;
        v7.g.f(aVar, "<this>");
        m8.e annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (m8.c cVar : annotations) {
            d0 j2 = cVar.j();
            if (j2 instanceof q8.b) {
                i10 = ((q8.b) j2).f16948b;
            } else if (j2 instanceof i.a) {
                l lVar = ((i.a) j2).f16958b;
                if (lVar instanceof r8.d) {
                    dVar = (r8.d) lVar;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    i10 = dVar.f17146a;
                } else {
                    i10 = null;
                }
            } else {
                i10 = i(cVar);
            }
            if (i10 != null) {
                arrayList.add(i10);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (v7.g.a(a1.c.y0(a1.c.t0((Annotation) it.next())).getSimpleName(), "Container")) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Annotation annotation = (Annotation) it2.next();
                Class y02 = a1.c.y0(a1.c.t0(annotation));
                if (v7.g.a(y02.getSimpleName(), "Container") && y02.getAnnotation(k.class) != null) {
                    Object invoke = y02.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                    v7.g.d(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    N0 = n7.i.Z1((Annotation[]) invoke);
                } else {
                    N0 = a1.c.N0(annotation);
                }
                n.f2(N0, arrayList2);
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static final Object e(Class cls) {
        if (cls.isPrimitive()) {
            if (v7.g.a(cls, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (v7.g.a(cls, Character.TYPE)) {
                return (char) 0;
            }
            if (v7.g.a(cls, Byte.TYPE)) {
                return (byte) 0;
            }
            if (v7.g.a(cls, Short.TYPE)) {
                return (short) 0;
            }
            if (v7.g.a(cls, Integer.TYPE)) {
                return 0;
            }
            if (v7.g.a(cls, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (v7.g.a(cls, Long.TYPE)) {
                return 0L;
            }
            if (v7.g.a(cls, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (v7.g.a(cls, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + cls);
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.a f(Class cls, GeneratedMessageLite.ExtendableMessage extendableMessage, f9.c cVar, f9.g gVar, f9.a aVar, p pVar) {
        List<ProtoBuf$TypeParameter> list;
        v7.g.f(cls, "moduleAnchor");
        v7.g.f(extendableMessage, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(aVar, "metadataVersion");
        v7.g.f(pVar, "createDescriptor");
        q8.h a10 = h.a(cls);
        if (extendableMessage instanceof ProtoBuf$Function) {
            list = ((ProtoBuf$Function) extendableMessage).f14162q;
        } else if (extendableMessage instanceof ProtoBuf$Property) {
            list = ((ProtoBuf$Property) extendableMessage).f14224q;
        } else {
            throw new IllegalStateException(("Unsupported message: " + extendableMessage).toString());
        }
        List<ProtoBuf$TypeParameter> list2 = list;
        u9.e eVar = a10.f16955a;
        s sVar = eVar.f17902b;
        f9.h hVar = f9.h.f11006b;
        v7.g.e(list2, "typeParameters");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) pVar.R(new MemberDeserializer(new u9.g(eVar, cVar, sVar, gVar, hVar, aVar, null, null, list2)), extendableMessage);
    }

    public static final c0 g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        v7.g.f(aVar, "<this>");
        if (aVar.E() != null) {
            l8.f c = aVar.c();
            v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((l8.b) c).R0();
        }
        return null;
    }

    public static final Class<?> h(ClassLoader classLoader, h9.b bVar, int i10) {
        boolean z10;
        String str;
        String str2 = k8.c.f12921a;
        h9.d i11 = bVar.b().i();
        v7.g.e(i11, "kotlinClassId.asSingleFqName().toUnsafe()");
        h9.b g10 = k8.c.g(i11);
        if (g10 != null) {
            bVar = g10;
        }
        String b5 = bVar.h().b();
        String b10 = bVar.i().b();
        if (v7.g.a(b5, "kotlin")) {
            switch (b10.hashCode()) {
                case -901856463:
                    if (!b10.equals("BooleanArray")) {
                        break;
                    } else {
                        return boolean[].class;
                    }
                case -763279523:
                    if (!b10.equals("ShortArray")) {
                        break;
                    } else {
                        return short[].class;
                    }
                case -755911549:
                    if (!b10.equals("CharArray")) {
                        break;
                    } else {
                        return char[].class;
                    }
                case -74930671:
                    if (!b10.equals("ByteArray")) {
                        break;
                    } else {
                        return byte[].class;
                    }
                case 22374632:
                    if (!b10.equals("DoubleArray")) {
                        break;
                    } else {
                        return double[].class;
                    }
                case 63537721:
                    if (!b10.equals("Array")) {
                        break;
                    } else {
                        return Object[].class;
                    }
                case 601811914:
                    if (!b10.equals("IntArray")) {
                        break;
                    } else {
                        return int[].class;
                    }
                case 948852093:
                    if (!b10.equals("FloatArray")) {
                        break;
                    } else {
                        return float[].class;
                    }
                case 2104330525:
                    if (!b10.equals("LongArray")) {
                        break;
                    } else {
                        return long[].class;
                    }
            }
        }
        String str3 = b5 + '.' + ha.i.V0(b10, '.', '$');
        if (i10 > 0) {
            StringBuilder sb = new StringBuilder();
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        char charAt = "[".charAt(0);
                        char[] cArr = new char[i10];
                        for (int i12 = 0; i12 < i10; i12++) {
                            cArr[i12] = charAt;
                        }
                        str = new String(cArr);
                    } else {
                        str = "[".toString();
                    }
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append('L');
                sb.append(str3);
                sb.append(';');
                str3 = sb.toString();
            } else {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
            }
        }
        return m0.b.E1(classLoader, str3);
    }

    public static final Annotation i(m8.c cVar) {
        Class<?> cls;
        Pair pair;
        l8.b d5 = DescriptorUtilsKt.d(cVar);
        if (d5 != null) {
            cls = j(d5);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<h9.e, m9.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h9.e eVar = (h9.e) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            v7.g.e(classLoader, "annotationClass.classLoader");
            Object k3 = k((m9.g) entry.getValue(), classLoader);
            if (k3 != null) {
                pair = new Pair(eVar.b(), k3);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map N1 = kotlin.collections.d.N1(arrayList);
        Set<String> keySet = N1.keySet();
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(keySet, 10));
        for (String str : keySet) {
            arrayList2.add(cls.getDeclaredMethod(str, new Class[0]));
        }
        return (Annotation) AnnotationConstructorCallerKt.a(cls, N1, arrayList2);
    }

    public static final Class<?> j(l8.b bVar) {
        v7.g.f(bVar, "<this>");
        d0 j2 = bVar.j();
        v7.g.e(j2, "source");
        if (j2 instanceof d9.i) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar = ((d9.i) j2).f10462b;
            v7.g.d(hVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((q8.e) hVar).f16950a;
        } else if (j2 instanceof i.a) {
            l lVar = ((i.a) j2).f16958b;
            v7.g.d(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a) lVar).f13595a;
        } else {
            h9.b f10 = DescriptorUtilsKt.f(bVar);
            if (f10 == null) {
                return null;
            }
            return h(ReflectClassUtilKt.d(bVar.getClass()), f10, 0);
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v20, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v19, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(m9.g<?> gVar, ClassLoader classLoader) {
        boolean z10;
        l8.b bVar;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.e eVar;
        r rVar;
        PrimitiveType s10;
        int i10;
        l8.b bVar2;
        Class<?> h10;
        short[] sArr;
        if (gVar instanceof m9.a) {
            return i((m8.c) ((m9.a) gVar).f16022a);
        }
        int i11 = 0;
        if (gVar instanceof m9.b) {
            m9.b bVar3 = (m9.b) gVar;
            if (bVar3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.e) {
                eVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.e) bVar3;
            } else {
                eVar = null;
            }
            if (eVar != null && (rVar = eVar.c) != null) {
                Iterable<m9.g> iterable = (Iterable) bVar3.f16022a;
                ArrayList arrayList = new ArrayList(n7.l.Z1(iterable, 10));
                for (m9.g gVar2 : iterable) {
                    arrayList.add(k(gVar2, classLoader));
                }
                h9.e eVar2 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
                l8.d c = rVar.U0().c();
                if (c == null) {
                    s10 = null;
                } else {
                    s10 = kotlin.reflect.jvm.internal.impl.builtins.e.s(c);
                }
                if (s10 == null) {
                    i10 = -1;
                } else {
                    i10 = a.f10970a[s10.ordinal()];
                }
                Object obj = bVar3.f16022a;
                switch (i10) {
                    case -1:
                        if (kotlin.reflect.jvm.internal.impl.builtins.e.z(rVar)) {
                            r b5 = ((f0) kotlin.collections.c.C2(rVar.S0())).b();
                            v7.g.e(b5, "type.arguments.single().type");
                            l8.d c10 = b5.U0().c();
                            if (c10 instanceof l8.b) {
                                bVar2 = (l8.b) c10;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                if (kotlin.reflect.jvm.internal.impl.builtins.e.J(b5)) {
                                    int size = ((List) obj).size();
                                    sArr = new String[size];
                                    while (i11 < size) {
                                        Object obj2 = arrayList.get(i11);
                                        v7.g.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                        sArr[i11] = (String) obj2;
                                        i11++;
                                    }
                                    break;
                                } else if (kotlin.reflect.jvm.internal.impl.builtins.e.c(bVar2, g.a.P)) {
                                    int size2 = ((List) obj).size();
                                    sArr = new Class[size2];
                                    while (i11 < size2) {
                                        Object obj3 = arrayList.get(i11);
                                        v7.g.d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                        sArr[i11] = (Class) obj3;
                                        i11++;
                                    }
                                    break;
                                } else {
                                    h9.b f10 = DescriptorUtilsKt.f(bVar2);
                                    if (f10 != null && (h10 = h(classLoader, f10, 0)) != null) {
                                        Object newInstance = Array.newInstance(h10, ((List) obj).size());
                                        v7.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                        Object[] objArr = (Object[]) newInstance;
                                        int size3 = arrayList.size();
                                        while (i11 < size3) {
                                            objArr[i11] = arrayList.get(i11);
                                            i11++;
                                        }
                                        return objArr;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(("Not a class type: " + b5).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Not an array type: " + rVar).toString());
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        sArr = new boolean[size4];
                        while (i11 < size4) {
                            Object obj4 = arrayList.get(i11);
                            v7.g.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            sArr[i11] = ((Boolean) obj4).booleanValue();
                            i11++;
                        }
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        int size5 = ((List) obj).size();
                        sArr = new char[size5];
                        while (i11 < size5) {
                            Object obj5 = arrayList.get(i11);
                            v7.g.d(obj5, "null cannot be cast to non-null type kotlin.Char");
                            sArr[i11] = ((Character) obj5).charValue();
                            i11++;
                        }
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        int size6 = ((List) obj).size();
                        sArr = new byte[size6];
                        while (i11 < size6) {
                            Object obj6 = arrayList.get(i11);
                            v7.g.d(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            sArr[i11] = ((Byte) obj6).byteValue();
                            i11++;
                        }
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        int size7 = ((List) obj).size();
                        sArr = new short[size7];
                        while (i11 < size7) {
                            Object obj7 = arrayList.get(i11);
                            v7.g.d(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i11] = ((Short) obj7).shortValue();
                            i11++;
                        }
                        break;
                    case 5:
                        int size8 = ((List) obj).size();
                        sArr = new int[size8];
                        while (i11 < size8) {
                            Object obj8 = arrayList.get(i11);
                            v7.g.d(obj8, "null cannot be cast to non-null type kotlin.Int");
                            sArr[i11] = ((Integer) obj8).intValue();
                            i11++;
                        }
                        break;
                    case 6:
                        int size9 = ((List) obj).size();
                        sArr = new float[size9];
                        while (i11 < size9) {
                            Object obj9 = arrayList.get(i11);
                            v7.g.d(obj9, "null cannot be cast to non-null type kotlin.Float");
                            sArr[i11] = ((Float) obj9).floatValue();
                            i11++;
                        }
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        int size10 = ((List) obj).size();
                        sArr = new long[size10];
                        while (i11 < size10) {
                            Object obj10 = arrayList.get(i11);
                            v7.g.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                            sArr[i11] = ((Long) obj10).longValue();
                            i11++;
                        }
                        break;
                    case 8:
                        int size11 = ((List) obj).size();
                        sArr = new double[size11];
                        while (i11 < size11) {
                            Object obj11 = arrayList.get(i11);
                            v7.g.d(obj11, "null cannot be cast to non-null type kotlin.Double");
                            sArr[i11] = ((Double) obj11).doubleValue();
                            i11++;
                        }
                        break;
                }
                return sArr;
            }
        } else if (gVar instanceof m9.i) {
            Pair pair = (Pair) ((m9.i) gVar).f16022a;
            h9.e eVar3 = (h9.e) pair.f12963j;
            Class<?> h11 = h(classLoader, (h9.b) pair.f12962i, 0);
            if (h11 != null) {
                return Enum.valueOf(h11, eVar3.b());
            }
        } else if (gVar instanceof m9.n) {
            n.a aVar = (n.a) ((m9.n) gVar).f16022a;
            if (aVar instanceof n.a.b) {
                m9.f fVar = ((n.a.b) aVar).f16026a;
                return h(classLoader, fVar.f16020a, fVar.f16021b);
            } else if (aVar instanceof n.a.C0188a) {
                l8.d c11 = ((n.a.C0188a) aVar).f16025a.U0().c();
                if (c11 instanceof l8.b) {
                    bVar = (l8.b) c11;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    return j(bVar);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (gVar instanceof m9.j) {
                z10 = true;
            } else {
                z10 = gVar instanceof m9.p;
            }
            if (!z10) {
                return gVar.b();
            }
        }
        return null;
    }
}
