package j$.util;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0266f implements java.util.Map, Serializable, Map {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f12183a;

    /* renamed from: b  reason: collision with root package name */
    final Object f12184b;
    private transient Set c;

    /* renamed from: d  reason: collision with root package name */
    private transient Set f12185d;

    /* renamed from: e  reason: collision with root package name */
    private transient java.util.Collection f12186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0266f(java.util.Map map) {
        map.getClass();
        this.f12183a = map;
        this.f12184b = this;
    }

    private static Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f12075f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f12075f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new Error("Unable to instantiate a synchronized list.", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new Error("Unable to instantiate a synchronized list.", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        synchronized (this.f12184b) {
            this.f12183a.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r5 = null;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        Object $default$compute;
        Object apply;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                $default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                loop0: while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    while (true) {
                        apply = biFunction.apply(obj, obj2);
                        if (apply != null) {
                            if (obj2 == null) {
                                obj2 = concurrentMap.putIfAbsent(obj, apply);
                                if (obj2 == null) {
                                    break loop0;
                                }
                            } else if (concurrentMap.replace(obj, obj2, apply)) {
                                break;
                            }
                        } else if ((obj2 != null || concurrentMap.containsKey(obj)) && !concurrentMap.remove(obj, obj2)) {
                        }
                    }
                }
                $default$compute = apply;
            } else {
                $default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return $default$compute;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object $default$computeIfAbsent;
        Object apply;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                function.getClass();
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object $default$computeIfPresent;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        $default$computeIfPresent = obj2;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj2);
                    if (apply != null) {
                        if (concurrentMap.replace(obj, obj2, apply)) {
                            $default$computeIfPresent = apply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj2)) {
                        $default$computeIfPresent = null;
                        break;
                    }
                }
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f12184b) {
            containsKey = this.f12183a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f12184b) {
            containsValue = this.f12183a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f12184b) {
            if (this.f12185d == null) {
                this.f12185d = a(this.f12183a.entrySet(), this.f12184b);
            }
            set = this.f12185d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f12184b) {
            equals = this.f12183a.equals(obj);
        }
        return equals;
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.time.a.a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f12184b) {
            obj2 = this.f12183a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f12184b) {
            orDefault = Map.EL.getOrDefault(this.f12183a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f12184b) {
            hashCode = this.f12183a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f12184b) {
            isEmpty = this.f12183a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f12184b) {
            if (this.c == null) {
                this.c = a(this.f12183a.keySet(), this.f12184b);
            }
            set = this.c;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object $default$merge;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                $default$merge = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                obj2.getClass();
                loop0: while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    while (true) {
                        if (obj3 != null) {
                            break;
                        }
                        obj3 = concurrentMap.putIfAbsent(obj, obj2);
                        if (obj3 == null) {
                            break loop0;
                        }
                    }
                }
                $default$merge = obj2;
            } else {
                $default$merge = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return $default$merge;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f12184b) {
            put = this.f12183a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f12184b) {
            this.f12183a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object a10;
        synchronized (this.f12184b) {
            a10 = Map.EL.a(this.f12183a, obj, obj2);
        }
        return a10;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f12184b) {
            remove = this.f12183a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z10;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                z10 = ((Map) map).remove(obj, obj2);
            } else {
                Object obj3 = map.get(obj);
                if (AbstractC0261c.o(obj3, obj2) && (obj3 != null || map.containsKey(obj))) {
                    map.remove(obj);
                    z10 = true;
                }
                z10 = false;
            }
        }
        return z10;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : map.get(obj);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f12184b) {
            java.util.Map map = this.f12183a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                j$.util.concurrent.u uVar = new j$.util.concurrent.u(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(uVar);
                } else {
                    j$.time.a.a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f12184b) {
            size = this.f12183a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f12184b) {
            obj = this.f12183a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        Constructor constructor;
        Constructor constructor2;
        java.util.Collection collection2;
        synchronized (this.f12184b) {
            if (this.f12186e == null) {
                java.util.Collection values = this.f12183a.values();
                Object obj = this.f12184b;
                constructor = DesugarCollections.f12074e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f12074e;
                        collection2 = (java.util.Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f12186e = collection2;
            }
            collection = this.f12186e;
        }
        return collection;
    }
}
