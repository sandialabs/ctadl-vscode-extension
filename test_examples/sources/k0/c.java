package k0;

import k0.s;
import kotlin.collections.AbstractMap;

/* loaded from: classes.dex */
public final class c<K, V> extends AbstractMap<K, V> implements i0.d<K, V> {

    /* renamed from: k  reason: collision with root package name */
    public static final c f12833k = new c(s.f12855e, 0);

    /* renamed from: i  reason: collision with root package name */
    public final s<K, V> f12834i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12835j;

    public c(s<K, V> sVar, int i10) {
        v7.g.f(sVar, "node");
        this.f12834i = sVar;
        this.f12835j = i10;
    }

    public final c a(Object obj, l0.a aVar) {
        int i10;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        s.a u10 = this.f12834i.u(i10, 0, obj, aVar);
        if (u10 == null) {
            return this;
        }
        return new c(u10.f12859a, this.f12835j + u10.f12860b);
    }

    @Override // i0.d
    public final e builder() {
        return new e(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f12834i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f12834i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
