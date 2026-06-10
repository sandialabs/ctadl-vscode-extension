package k0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o<K, V> extends n7.e<K> implements i0.b<K> {

    /* renamed from: i  reason: collision with root package name */
    public final c<K, V> f12853i;

    public o(c<K, V> cVar) {
        v7.g.f(cVar, "map");
        this.f12853i = cVar;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        c<K, V> cVar = this.f12853i;
        cVar.getClass();
        return cVar.f12835j;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f12853i.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new p(this.f12853i.f12834i);
    }
}
