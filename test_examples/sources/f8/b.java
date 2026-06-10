package f8;

import androidx.datastore.preferences.protobuf.k;
import j$.util.concurrent.ConcurrentHashMap;
import u7.l;

/* loaded from: classes.dex */
public final class b<V> extends k {

    /* renamed from: i  reason: collision with root package name */
    public final l<Class<?>, V> f10964i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, V> f10965j;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super Class<?>, ? extends V> lVar) {
        v7.g.f(lVar, "compute");
        this.f10964i = lVar;
        this.f10965j = new ConcurrentHashMap<>();
    }

    public final V L0(Class<?> cls) {
        v7.g.f(cls, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f10965j;
        V v3 = concurrentHashMap.get(cls);
        if (v3 == null) {
            V U = this.f10964i.U(cls);
            V putIfAbsent = concurrentHashMap.putIfAbsent(cls, U);
            return putIfAbsent == null ? U : putIfAbsent;
        }
        return v3;
    }
}
