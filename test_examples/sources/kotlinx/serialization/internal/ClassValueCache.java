package kotlinx.serialization.internal;

import a1.c;
import c8.b;
import u7.l;
import ua.a1;
import ua.o1;
import ua.s;
import v7.g;

/* loaded from: classes.dex */
public final class ClassValueCache<T> implements o1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l<b<?>, qa.b<T>> f15613a;

    /* renamed from: b  reason: collision with root package name */
    public final s<ua.l<T>> f15614b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueCache(l<? super b<?>, ? extends qa.b<T>> lVar) {
        g.f(lVar, "compute");
        this.f15613a = lVar;
        this.f15614b = new s<>();
    }

    @Override // ua.o1
    public final qa.b<T> a(b<Object> bVar) {
        Object obj = this.f15614b.get(c.y0(bVar));
        g.e(obj, "get(key)");
        a1 a1Var = (a1) obj;
        T t10 = a1Var.f17946a.get();
        if (t10 == null) {
            t10 = (T) a1Var.a(new ClassValueCache$get$$inlined$getOrSet$1(this, bVar));
        }
        return ((ua.l) t10).f17987a;
    }
}
