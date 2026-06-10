package p0;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class k<K, V, E> implements Set<E>, w7.d {

    /* renamed from: i  reason: collision with root package name */
    public final o<K, V> f16610i;

    public k(o<K, V> oVar) {
        v7.g.f(oVar, "map");
        this.f16610i = oVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16610i.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16610i.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16610i.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }
}
