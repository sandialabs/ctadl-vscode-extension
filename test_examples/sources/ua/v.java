package ua;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class v<T> implements o1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.l<c8.b<?>, qa.b<T>> f18019a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, l<T>> f18020b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(u7.l<? super c8.b<?>, ? extends qa.b<T>> lVar) {
        v7.g.f(lVar, "compute");
        this.f18019a = lVar;
        this.f18020b = new ConcurrentHashMap<>();
    }

    @Override // ua.o1
    public final qa.b<T> a(c8.b<Object> bVar) {
        l<T> putIfAbsent;
        ConcurrentHashMap<Class<?>, l<T>> concurrentHashMap = this.f18020b;
        Class<?> y02 = a1.c.y0(bVar);
        l<T> lVar = concurrentHashMap.get(y02);
        if (lVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(y02, (lVar = new l<>(this.f18019a.U(bVar))))) != null) {
            lVar = putIfAbsent;
        }
        return lVar.f17987a;
    }
}
