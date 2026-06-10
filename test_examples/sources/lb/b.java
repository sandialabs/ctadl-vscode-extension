package lb;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static final kb.b c = new kb.b();

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<kb.a> f15887a;

    /* renamed from: b  reason: collision with root package name */
    public final org.koin.core.scope.a f15888b;

    public b(org.koin.core.a aVar) {
        g.f(aVar, "_koin");
        HashSet<kb.a> hashSet = new HashSet<>();
        this.f15887a = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        org.koin.core.scope.a aVar2 = new org.koin.core.scope.a(c, aVar);
        this.f15888b = aVar2;
        hashSet.add(aVar2.f16535a);
        concurrentHashMap.put(aVar2.f16536b, aVar2);
    }
}
