package ua;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlinx.serialization.internal.ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1;

/* loaded from: classes.dex */
public final class r<T> implements g1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.p<c8.b<Object>, List<? extends c8.k>, qa.b<T>> f18006a;

    /* renamed from: b  reason: collision with root package name */
    public final s<f1<T>> f18007b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(u7.p<? super c8.b<Object>, ? super List<? extends c8.k>, ? extends qa.b<T>> pVar) {
        v7.g.f(pVar, "compute");
        this.f18006a = pVar;
        this.f18007b = new s<>();
    }

    @Override // ua.g1
    public final Object a(c8.b bVar, ArrayList arrayList) {
        qa.b<T> Q;
        Object obj = this.f18007b.get(a1.c.y0(bVar));
        v7.g.e(obj, "get(key)");
        a1 a1Var = (a1) obj;
        T t10 = a1Var.f17946a.get();
        if (t10 == null) {
            t10 = (T) a1Var.a(new ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1());
        }
        f1 f1Var = (f1) t10;
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new o0((c8.k) it.next()));
        }
        ConcurrentHashMap<List<o0>, Result<qa.b<T>>> concurrentHashMap = f1Var.f17970a;
        Result<qa.b<T>> result = concurrentHashMap.get(arrayList2);
        if (result == null) {
            try {
                Q = this.f18006a.R(bVar, arrayList);
            } catch (Throwable th) {
                Q = m0.b.Q(th);
            }
            result = new Result<>(Q);
            Result<qa.b<T>> putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            if (putIfAbsent != null) {
                result = putIfAbsent;
            }
        }
        return result.f12964i;
    }
}
