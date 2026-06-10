package p;

import java.util.Map;

/* loaded from: classes.dex */
public final class a extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f16540d;

    public a(b bVar) {
        this.f16540d = bVar;
    }

    @Override // p.g
    public final void a() {
        this.f16540d.clear();
    }

    @Override // p.g
    public final Object b(int i10, int i11) {
        return this.f16540d.f16579j[(i10 << 1) + i11];
    }

    @Override // p.g
    public final Map<Object, Object> c() {
        return this.f16540d;
    }

    @Override // p.g
    public final int d() {
        return this.f16540d.f16580k;
    }

    @Override // p.g
    public final int e(Object obj) {
        return this.f16540d.e(obj);
    }

    @Override // p.g
    public final int f(Object obj) {
        return this.f16540d.g(obj);
    }

    @Override // p.g
    public final void g(Object obj, Object obj2) {
        this.f16540d.put(obj, obj2);
    }

    @Override // p.g
    public final void h(int i10) {
        this.f16540d.j(i10);
    }

    @Override // p.g
    public final Object i(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f16540d.f16579j;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }
}
