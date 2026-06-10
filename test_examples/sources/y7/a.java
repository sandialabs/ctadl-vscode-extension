package y7;

import c8.j;
import v7.g;

/* loaded from: classes.dex */
public abstract class a<V> {

    /* renamed from: a  reason: collision with root package name */
    public V f18935a;

    public a(V v3) {
        this.f18935a = v3;
    }

    public void a(j jVar) {
        g.f(jVar, "property");
    }

    public final V b(Object obj, j<?> jVar) {
        g.f(jVar, "property");
        return this.f18935a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, j jVar) {
        g.f(jVar, "property");
        a(jVar);
        this.f18935a = obj;
    }
}
