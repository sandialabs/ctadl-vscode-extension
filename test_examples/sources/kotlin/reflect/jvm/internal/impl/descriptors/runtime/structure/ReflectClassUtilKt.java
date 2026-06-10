package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import c8.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.sequences.SequencesKt__SequencesKt;
import m7.c;
import n7.l;
import u7.e;
import u7.f;
import u7.g;
import u7.h;
import u7.j;
import u7.k;
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
import v7.i;

/* loaded from: classes.dex */
public final class ReflectClassUtilKt {

    /* renamed from: a  reason: collision with root package name */
    public static final List<b<? extends Object>> f13582a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f13583b;
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Class<? extends c<?>>, Integer> f13584d;

    static {
        int i10 = 0;
        List<b<? extends Object>> O0 = a1.c.O0(i.a(Boolean.TYPE), i.a(Byte.TYPE), i.a(Character.TYPE), i.a(Double.TYPE), i.a(Float.TYPE), i.a(Integer.TYPE), i.a(Long.TYPE), i.a(Short.TYPE));
        f13582a = O0;
        ArrayList arrayList = new ArrayList(l.Z1(O0, 10));
        Iterator<T> it = O0.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            arrayList.add(new Pair(a1.c.z0(bVar), a1.c.A0(bVar)));
        }
        f13583b = d.N1(arrayList);
        List<b<? extends Object>> list = f13582a;
        ArrayList arrayList2 = new ArrayList(l.Z1(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            arrayList2.add(new Pair(a1.c.A0(bVar2), a1.c.z0(bVar2)));
        }
        c = d.N1(arrayList2);
        List O02 = a1.c.O0(u7.a.class, u7.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, u7.b.class, u7.c.class, u7.d.class, e.class, f.class, g.class, h.class, u7.i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(l.Z1(O02, 10));
        for (Object obj : O02) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList3.add(new Pair((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                a1.c.F1();
                throw null;
            }
        }
        f13584d = d.N1(arrayList3);
    }

    public static final h9.b a(Class<?> cls) {
        h9.b a10;
        v7.g.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        } else {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                if (!(cls.getSimpleName().length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    return (declaringClass == null || (a10 = a(declaringClass)) == null) ? h9.b.l(new h9.c(cls.getName())) : a10.d(h9.e.k(cls.getSimpleName()));
                }
            }
            h9.c cVar = new h9.c(cls.getName());
            return new h9.b(cVar.e(), h9.c.j(cVar.f()), true);
        }
    }

    public static final String b(Class<?> cls) {
        v7.g.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return ha.i.V0(cls.getName(), '.', '/');
            }
            return "L" + ha.i.V0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List<Type> c(Type type) {
        v7.g.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.f12981i;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            v7.g.e(actualTypeArguments, "actualTypeArguments");
            return kotlin.collections.b.w2(actualTypeArguments);
        }
        return a1.c.a1(kotlin.sequences.a.Z0(kotlin.sequences.a.V0(SequencesKt__SequencesKt.O0(type, ReflectClassUtilKt$parameterizedTypeArguments$1.f13585j), ReflectClassUtilKt$parameterizedTypeArguments$2.f13586j)));
    }

    public static final ClassLoader d(Class<?> cls) {
        v7.g.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            v7.g.e(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    public static final boolean e(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
