package v7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import u7.m;
import u7.n;
import u7.o;
import u7.p;
import u7.q;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.v;
import u7.w;

/* loaded from: classes.dex */
public final class c implements c8.b<Object>, b {

    /* renamed from: j  reason: collision with root package name */
    public static final Map<Class<? extends m7.c<?>>, Integer> f18164j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<String, String> f18165k;

    /* renamed from: l  reason: collision with root package name */
    public static final LinkedHashMap f18166l;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f18167i;

    static {
        int i10 = 0;
        List O0 = a1.c.O0(u7.a.class, u7.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, u7.b.class, u7.c.class, u7.d.class, u7.e.class, u7.f.class, u7.g.class, u7.h.class, u7.i.class, u7.j.class, u7.k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(n7.l.Z1(O0, 10));
        for (Object obj : O0) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new Pair((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                a1.c.F1();
                throw null;
            }
        }
        f18164j = kotlin.collections.d.N1(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.e(str, "kotlinName");
            sb.append(kotlin.text.b.t1(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends m7.c<?>>, Integer> entry : f18164j.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f18165k = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, kotlin.text.b.t1(str2, '.', str2));
        }
        f18166l = linkedHashMap;
    }

    public c(Class<?> cls) {
        g.f(cls, "jClass");
        this.f18167i = cls;
    }

    @Override // c8.b
    public final String b() {
        String str;
        Class<?> cls = this.f18167i;
        g.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap<String, String> hashMap = f18165k;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = hashMap.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }
        return null;
    }

    @Override // c8.b
    public final boolean c(Object obj) {
        Class<?> cls = this.f18167i;
        g.f(cls, "jClass");
        Map<Class<? extends m7.c<?>>, Integer> map = f18164j;
        g.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(cls);
        if (num != null) {
            return l.e(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = a1.c.z0(i.a(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // c8.b
    public final String d() {
        String str;
        Method enclosingMethod;
        Constructor<?> enclosingConstructor;
        String str2;
        Class<?> cls = this.f18167i;
        g.f(cls, "jClass");
        String str3 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            if (cls.getEnclosingMethod() != null) {
                str2 = enclosingMethod.getName() + '$';
            } else {
                if (cls.getEnclosingConstructor() != null) {
                    str2 = enclosingConstructor.getName() + '$';
                } else {
                    return kotlin.text.b.s1(simpleName);
                }
            }
            return kotlin.text.b.r1(simpleName, str2, simpleName);
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f18166l;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str3 = str.concat("Array");
            }
            if (str3 == null) {
                return "Array";
            }
            return str3;
        }
        String str4 = (String) linkedHashMap.get(cls.getName());
        if (str4 == null) {
            return cls.getSimpleName();
        }
        return str4;
    }

    @Override // v7.b
    public final Class<?> e() {
        return this.f18167i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && g.a(a1.c.z0(this), a1.c.z0((c8.b) obj));
    }

    @Override // c8.b
    public final int hashCode() {
        return a1.c.z0(this).hashCode();
    }

    public final String toString() {
        return this.f18167i.toString() + " (Kotlin reflection is not available)";
    }
}
