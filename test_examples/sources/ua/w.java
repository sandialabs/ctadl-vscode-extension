package ua;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* loaded from: classes.dex */
public final class w<T> implements g1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.p<c8.b<Object>, List<? extends c8.k>, qa.b<T>> f18023a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, f1<T>> f18024b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(u7.p<? super c8.b<Object>, ? super List<? extends c8.k>, ? extends qa.b<T>> pVar) {
        v7.g.f(pVar, "compute");
        this.f18023a = pVar;
        this.f18024b = new ConcurrentHashMap<>();
    }

    @Override // ua.g1
    public final Object a(c8.b bVar, ArrayList arrayList) {
        qa.b<T> Q;
        f1<T> putIfAbsent;
        ConcurrentHashMap<Class<?>, f1<T>> concurrentHashMap = this.f18024b;
        Class<?> y02 = a1.c.y0(bVar);
        f1<T> f1Var = concurrentHashMap.get(y02);
        if (f1Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(y02, (f1Var = new f1<>()))) != null) {
            f1Var = putIfAbsent;
        }
        f1<T> f1Var2 = f1Var;
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new o0((c8.k) it.next()));
        }
        ConcurrentHashMap<List<o0>, Result<qa.b<T>>> concurrentHashMap2 = f1Var2.f17970a;
        Result<qa.b<T>> result = concurrentHashMap2.get(arrayList2);
        if (result == null) {
            try {
                Q = this.f18023a.R(bVar, arrayList);
            } catch (Throwable th) {
                Q = m0.b.Q(th);
            }
            result = new Result<>(Q);
            Result<qa.b<T>> putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            if (putIfAbsent2 != null) {
                result = putIfAbsent2;
            }
        }
        return result.f12964i;
    }
}
