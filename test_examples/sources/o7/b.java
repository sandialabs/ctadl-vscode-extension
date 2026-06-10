package o7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import v7.g;

/* loaded from: classes.dex */
public final class b<V> extends n7.b<V> {

    /* renamed from: i  reason: collision with root package name */
    public final MapBuilder<?, V> f16377i;

    public b(MapBuilder<?, V> mapBuilder) {
        g.f(mapBuilder, "backing");
        this.f16377i = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        g.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // n7.b
    public final int c() {
        return this.f16377i.f13006p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16377i.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16377i.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f16377i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f16377i;
        mapBuilder.getClass();
        return new MapBuilder.f(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        MapBuilder<?, V> mapBuilder = this.f16377i;
        mapBuilder.b();
        int i11 = mapBuilder.n;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (mapBuilder.f13002k[i11] >= 0) {
                V[] vArr = mapBuilder.f13001j;
                g.c(vArr);
                if (g.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        mapBuilder.n(i10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        this.f16377i.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        this.f16377i.b();
        return super.retainAll(collection);
    }
}
