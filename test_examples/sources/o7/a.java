package o7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import n7.d;
import v7.g;

/* loaded from: classes.dex */
public final class a<E> extends d<E> {

    /* renamed from: i  reason: collision with root package name */
    public final MapBuilder<E, ?> f16376i;

    public a(MapBuilder<E, ?> mapBuilder) {
        g.f(mapBuilder, "backing");
        this.f16376i = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // n7.d
    public final int c() {
        return this.f16376i.f13006p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16376i.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16376i.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16376i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f16376i;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f16376i;
        mapBuilder.b();
        int g10 = mapBuilder.g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            mapBuilder.n(g10);
        }
        if (g10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        this.f16376i.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        this.f16376i.b();
        return super.retainAll(collection);
    }
}
