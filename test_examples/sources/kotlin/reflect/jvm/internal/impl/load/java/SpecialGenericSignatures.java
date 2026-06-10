package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n7.l;
import v7.g;

/* loaded from: classes.dex */
public class SpecialGenericSignatures {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13633a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f13634b;
    public static final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<a.C0151a, TypeSafeBarrierDescription> f13635d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashMap f13636e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<h9.e> f13637f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f13638g;

    /* renamed from: h  reason: collision with root package name */
    public static final a.C0151a f13639h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map<a.C0151a, h9.e> f13640i;

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashMap f13641j;

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayList f13642k;

    /* renamed from: l  reason: collision with root package name */
    public static final LinkedHashMap f13643l;

    /* loaded from: classes.dex */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER,
        OBJECT_PARAMETER_NON_GENERIC,
        OBJECT_PARAMETER_GENERIC
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class TypeSafeBarrierDescription {

        /* renamed from: j  reason: collision with root package name */
        public static final TypeSafeBarrierDescription f13648j;

        /* renamed from: k  reason: collision with root package name */
        public static final TypeSafeBarrierDescription f13649k;

        /* renamed from: l  reason: collision with root package name */
        public static final TypeSafeBarrierDescription f13650l;

        /* renamed from: m  reason: collision with root package name */
        public static final TypeSafeBarrierDescription f13651m;
        public static final /* synthetic */ TypeSafeBarrierDescription[] n;

        /* renamed from: i  reason: collision with root package name */
        public final Object f13652i;

        /* loaded from: classes.dex */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            public MAP_GET_OR_DEFAULT() {
                super(3, null, "MAP_GET_OR_DEFAULT");
            }
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription(0, null, "NULL");
            f13648j = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription(1, -1, "INDEX");
            f13649k = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription(2, Boolean.FALSE, "FALSE");
            f13650l = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT();
            f13651m = map_get_or_default;
            n = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        public TypeSafeBarrierDescription(int i10, Object obj, String str) {
            this.f13652i = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) n.clone();
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0151a {

            /* renamed from: a  reason: collision with root package name */
            public final h9.e f13653a;

            /* renamed from: b  reason: collision with root package name */
            public final String f13654b;

            public C0151a(h9.e eVar, String str) {
                g.f(str, "signature");
                this.f13653a = eVar;
                this.f13654b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0151a) {
                    C0151a c0151a = (C0151a) obj;
                    return g.a(this.f13653a, c0151a.f13653a) && g.a(this.f13654b, c0151a.f13654b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f13654b.hashCode() + (this.f13653a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.f13653a);
                sb.append(", signature=");
                return androidx.activity.e.j(sb, this.f13654b, ')');
            }
        }

        public static final C0151a a(a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            h9.e k3 = h9.e.k(str2);
            String str5 = str2 + '(' + str3 + ')' + str4;
            g.f(str, "internalName");
            g.f(str5, "jvmDescriptor");
            return new C0151a(k3, str + '.' + str5);
        }
    }

    static {
        Set<String> w12 = a1.c.w1("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(l.Z1(w12, 10));
        for (String str : w12) {
            a aVar = f13633a;
            String i10 = JvmPrimitiveType.BOOLEAN.i();
            g.e(i10, "BOOLEAN.desc");
            arrayList.add(a.a(aVar, "java/util/Collection", str, "Ljava/util/Collection;", i10));
        }
        f13634b = arrayList;
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0151a) it.next()).f13654b);
        }
        c = arrayList2;
        ArrayList arrayList3 = f13634b;
        ArrayList arrayList4 = new ArrayList(l.Z1(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0151a) it2.next()).f13653a.b());
        }
        a aVar2 = f13633a;
        String concat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String i11 = jvmPrimitiveType.i();
        g.e(i11, "BOOLEAN.desc");
        a.C0151a a10 = a.a(aVar2, concat, "contains", "Ljava/lang/Object;", i11);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.f13650l;
        String concat2 = "java/util/".concat("Collection");
        String i12 = jvmPrimitiveType.i();
        g.e(i12, "BOOLEAN.desc");
        String concat3 = "java/util/".concat("Map");
        String i13 = jvmPrimitiveType.i();
        g.e(i13, "BOOLEAN.desc");
        String concat4 = "java/util/".concat("Map");
        String i14 = jvmPrimitiveType.i();
        g.e(i14, "BOOLEAN.desc");
        String concat5 = "java/util/".concat("Map");
        String i15 = jvmPrimitiveType.i();
        g.e(i15, "BOOLEAN.desc");
        a.C0151a a11 = a.a(aVar2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f13648j;
        String concat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String i16 = jvmPrimitiveType2.i();
        g.e(i16, "INT.desc");
        a.C0151a a12 = a.a(aVar2, concat6, "indexOf", "Ljava/lang/Object;", i16);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f13649k;
        String concat7 = "java/util/".concat("List");
        String i17 = jvmPrimitiveType2.i();
        g.e(i17, "INT.desc");
        Map<a.C0151a, TypeSafeBarrierDescription> M1 = kotlin.collections.d.M1(new Pair(a10, typeSafeBarrierDescription), new Pair(a.a(aVar2, concat2, "remove", "Ljava/lang/Object;", i12), typeSafeBarrierDescription), new Pair(a.a(aVar2, concat3, "containsKey", "Ljava/lang/Object;", i13), typeSafeBarrierDescription), new Pair(a.a(aVar2, concat4, "containsValue", "Ljava/lang/Object;", i14), typeSafeBarrierDescription), new Pair(a.a(aVar2, concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", i15), typeSafeBarrierDescription), new Pair(a.a(aVar2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f13651m), new Pair(a11, typeSafeBarrierDescription2), new Pair(a.a(aVar2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), new Pair(a12, typeSafeBarrierDescription3), new Pair(a.a(aVar2, concat7, "lastIndexOf", "Ljava/lang/Object;", i17), typeSafeBarrierDescription3));
        f13635d = M1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(M1.size()));
        Iterator<T> it3 = M1.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0151a) entry.getKey()).f13654b, entry.getValue());
        }
        f13636e = linkedHashMap;
        LinkedHashSet<a.C0151a> c22 = l.c2(f13635d.keySet(), f13634b);
        ArrayList arrayList5 = new ArrayList(l.Z1(c22, 10));
        for (a.C0151a c0151a : c22) {
            arrayList5.add(c0151a.f13653a);
        }
        f13637f = kotlin.collections.c.Q2(arrayList5);
        ArrayList arrayList6 = new ArrayList(l.Z1(c22, 10));
        for (a.C0151a c0151a2 : c22) {
            arrayList6.add(c0151a2.f13654b);
        }
        f13638g = kotlin.collections.c.Q2(arrayList6);
        a aVar3 = f13633a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String i18 = jvmPrimitiveType3.i();
        g.e(i18, "INT.desc");
        a.C0151a a13 = a.a(aVar3, "java/util/List", "removeAt", i18, "Ljava/lang/Object;");
        f13639h = a13;
        String concat8 = "java/lang/".concat("Number");
        String i19 = JvmPrimitiveType.BYTE.i();
        g.e(i19, "BYTE.desc");
        String concat9 = "java/lang/".concat("Number");
        String i20 = JvmPrimitiveType.SHORT.i();
        g.e(i20, "SHORT.desc");
        String concat10 = "java/lang/".concat("Number");
        String i21 = jvmPrimitiveType3.i();
        g.e(i21, "INT.desc");
        String concat11 = "java/lang/".concat("Number");
        String i22 = JvmPrimitiveType.LONG.i();
        g.e(i22, "LONG.desc");
        String concat12 = "java/lang/".concat("Number");
        String i23 = JvmPrimitiveType.FLOAT.i();
        g.e(i23, "FLOAT.desc");
        String concat13 = "java/lang/".concat("Number");
        String i24 = JvmPrimitiveType.DOUBLE.i();
        g.e(i24, "DOUBLE.desc");
        String concat14 = "java/lang/".concat("CharSequence");
        String i25 = jvmPrimitiveType3.i();
        g.e(i25, "INT.desc");
        String i26 = JvmPrimitiveType.CHAR.i();
        g.e(i26, "CHAR.desc");
        Map<a.C0151a, h9.e> M12 = kotlin.collections.d.M1(new Pair(a.a(aVar3, concat8, "toByte", "", i19), h9.e.k("byteValue")), new Pair(a.a(aVar3, concat9, "toShort", "", i20), h9.e.k("shortValue")), new Pair(a.a(aVar3, concat10, "toInt", "", i21), h9.e.k("intValue")), new Pair(a.a(aVar3, concat11, "toLong", "", i22), h9.e.k("longValue")), new Pair(a.a(aVar3, concat12, "toFloat", "", i23), h9.e.k("floatValue")), new Pair(a.a(aVar3, concat13, "toDouble", "", i24), h9.e.k("doubleValue")), new Pair(a13, h9.e.k("remove")), new Pair(a.a(aVar3, concat14, "get", i25, i26), h9.e.k("charAt")));
        f13640i = M12;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.b.O0(M12.size()));
        Iterator<T> it4 = M12.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            linkedHashMap2.put(((a.C0151a) entry2.getKey()).f13654b, entry2.getValue());
        }
        f13641j = linkedHashMap2;
        Set<a.C0151a> keySet = f13640i.keySet();
        ArrayList arrayList7 = new ArrayList(l.Z1(keySet, 10));
        for (a.C0151a c0151a3 : keySet) {
            arrayList7.add(c0151a3.f13653a);
        }
        f13642k = arrayList7;
        Set<Map.Entry<a.C0151a, h9.e>> entrySet = f13640i.entrySet();
        ArrayList arrayList8 = new ArrayList(l.Z1(entrySet, 10));
        Iterator<T> it5 = entrySet.iterator();
        while (it5.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it5.next();
            arrayList8.add(new Pair(((a.C0151a) entry3.getKey()).f13653a, entry3.getValue()));
        }
        int O0 = m0.b.O0(l.Z1(arrayList8, 10));
        if (O0 < 16) {
            O0 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(O0);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Pair pair = (Pair) it6.next();
            linkedHashMap3.put((h9.e) pair.f12963j, (h9.e) pair.f12962i);
        }
        f13643l = linkedHashMap3;
    }
}
