package k0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k<K, V> extends n7.b<V> {

    /* renamed from: i  reason: collision with root package name */
    public final e<K, V> f12851i;

    public k(e<K, V> eVar) {
        v7.g.f(eVar, "builder");
        this.f12851i = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // n7.b
    public final int c() {
        return this.f12851i.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12851i.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12851i.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new l(this.f12851i);
    }
}
