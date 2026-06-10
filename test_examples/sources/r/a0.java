package r;

import r.i;

/* loaded from: classes.dex */
public final class a0<T, V extends i> implements z<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final u7.l<T, V> f16960a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<V, T> f16961b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(u7.l<? super T, ? extends V> lVar, u7.l<? super V, ? extends T> lVar2) {
        v7.g.f(lVar, "convertToVector");
        v7.g.f(lVar2, "convertFromVector");
        this.f16960a = lVar;
        this.f16961b = lVar2;
    }

    @Override // r.z
    public final u7.l<T, V> a() {
        return this.f16960a;
    }

    @Override // r.z
    public final u7.l<V, T> b() {
        return this.f16961b;
    }
}
