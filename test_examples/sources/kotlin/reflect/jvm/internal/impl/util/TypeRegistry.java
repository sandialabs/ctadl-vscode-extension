package kotlin.reflect.jvm.internal.impl.util;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import u7.l;

/* loaded from: classes.dex */
public abstract class TypeRegistry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<c8.b<? extends K>, Integer> f15093a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f15094b = new AtomicInteger(0);

    public abstract <T extends K> int a(ConcurrentHashMap<c8.b<? extends K>, Integer> concurrentHashMap, c8.b<T> bVar, l<? super c8.b<? extends K>, Integer> lVar);

    public final <T extends K> int b(c8.b<T> bVar) {
        v7.g.f(bVar, "kClass");
        return a(this.f15093a, bVar, new TypeRegistry$getId$1(this));
    }
}
