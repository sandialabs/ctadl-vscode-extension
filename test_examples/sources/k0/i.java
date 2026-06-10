package k0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i<K, V> extends n7.d<K> {

    /* renamed from: i  reason: collision with root package name */
    public final e<K, V> f12850i;

    public i(e<K, V> eVar) {
        v7.g.f(eVar, "builder");
        this.f12850i = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k3) {
        throw new UnsupportedOperationException();
    }

    @Override // n7.d
    public final int c() {
        return this.f12850i.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12850i.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12850i.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new j(this.f12850i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e<K, V> eVar = this.f12850i;
        if (eVar.containsKey(obj)) {
            eVar.remove(obj);
            return true;
        }
        return false;
    }
}
