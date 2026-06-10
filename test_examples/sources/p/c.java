package p;

import java.util.Map;

/* loaded from: classes.dex */
public final class c extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f16542d;

    public c(d dVar) {
        this.f16542d = dVar;
    }

    @Override // p.g
    public final void a() {
        this.f16542d.clear();
    }

    @Override // p.g
    public final Object b(int i10, int i11) {
        return this.f16542d.f16549j[i10];
    }

    @Override // p.g
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p.g
    public final int d() {
        return this.f16542d.f16550k;
    }

    @Override // p.g
    public final int e(Object obj) {
        return this.f16542d.indexOf(obj);
    }

    @Override // p.g
    public final int f(Object obj) {
        return this.f16542d.indexOf(obj);
    }

    @Override // p.g
    public final void g(Object obj, Object obj2) {
        this.f16542d.add(obj);
    }

    @Override // p.g
    public final void h(int i10) {
        this.f16542d.s(i10);
    }

    @Override // p.g
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
