package j$.util;

import j$.util.Collection;
import j$.util.List;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f12071a;

    /* renamed from: b  reason: collision with root package name */
    static final Class f12072b;
    private static final Field c;

    /* renamed from: d  reason: collision with root package name */
    private static final Field f12073d;

    /* renamed from: e  reason: collision with root package name */
    private static final Constructor f12074e;

    /* renamed from: f  reason: collision with root package name */
    private static final Constructor f12075f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f12071a = cls;
        f12072b = Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f12073d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f12075f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(java.util.Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f12074e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    public static void c(Iterable iterable, Consumer consumer) {
        Field field = c;
        if (field == null) {
            try {
                AbstractC0261c.q((java.util.Collection) f12073d.get(iterable), consumer);
                return;
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(iterable)) {
                AbstractC0261c.q((java.util.Collection) f12073d.get(iterable), consumer);
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection forEach.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = c;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f12073d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                java.util.Collection collection3 = (java.util.Collection) f12073d.get(collection);
                removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(java.util.List list, UnaryOperator unaryOperator) {
        Field field = c;
        if (field == null) {
            try {
                java.util.List list2 = (java.util.List) f12073d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                    return;
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                    return;
                }
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(list)) {
                java.util.List list3 = (java.util.List) f12073d.get(list);
                if (list3 instanceof List) {
                    ((List) list3).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list3, unaryOperator);
                }
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized list replaceAll.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(java.util.List list, Comparator comparator) {
        Field field = c;
        if (field == null) {
            try {
                AbstractC0261c.s((java.util.List) f12073d.get(list), comparator);
                return;
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(list)) {
                AbstractC0261c.s((java.util.List) f12073d.get(list), comparator);
            }
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized list sort.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0266f(map);
    }
}
