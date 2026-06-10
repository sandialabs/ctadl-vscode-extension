package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import n7.d;
import v7.g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Ln7/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SetBuilder<E> extends d<E> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final MapBuilder<E, ?> f13016i = new MapBuilder<>();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f13016i.a(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        this.f13016i.b();
        return super.addAll(collection);
    }

    @Override // n7.d
    public final int c() {
        return this.f13016i.f13006p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13016i.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13016i.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13016i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f13016i;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f13016i;
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
        this.f13016i.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        this.f13016i.b();
        return super.retainAll(collection);
    }
}
