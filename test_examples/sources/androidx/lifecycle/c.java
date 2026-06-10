package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class c {
    public static final c c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5367a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5368b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f5369a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, Lifecycle.Event> f5370b;

        public a(HashMap hashMap) {
            this.f5370b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f5369a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f5369a.put(event, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, q qVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i10 = bVar.f5371a;
                        Method method = bVar.f5372b;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    method.invoke(obj, qVar, event);
                                }
                            } else {
                                method.invoke(obj, qVar);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5371a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5372b;

        public b(int i10, Method method) {
            this.f5371a = i10;
            this.f5372b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5371a == bVar.f5371a && this.f5372b.getName().equals(bVar.f5372b.getName());
            }
            return false;
        }

        public final int hashCode() {
            return this.f5372b.getName().hashCode() + (this.f5371a * 31);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        r3.put(r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(HashMap hashMap, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f5372b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f5370b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : b(cls2).f5370b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            x xVar = (x) method.getAnnotation(x.class);
            if (xVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (q.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                Lifecycle.Event value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == Lifecycle.Event.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f5367a.put(cls, aVar);
        this.f5368b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f5367a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
