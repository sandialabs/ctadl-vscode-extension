package k0;

import java.util.Map;

/* loaded from: classes.dex */
public final class w<K, V> extends t<K, V, Map.Entry<K, V>> {

    /* renamed from: l  reason: collision with root package name */
    public final h<K, V> f12865l;

    public w(h<K, V> hVar) {
        v7.g.f(hVar, "parentIterator");
        this.f12865l = hVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i10 = this.f12863k + 2;
        this.f12863k = i10;
        Object[] objArr = this.f12861i;
        return new b(this.f12865l, objArr[i10 - 2], objArr[i10 - 1]);
    }
}
