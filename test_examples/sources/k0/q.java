package k0;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public final class q<K, V> extends AbstractCollection<V> {

    /* renamed from: i  reason: collision with root package name */
    public final c<K, V> f12854i;

    public q(c<K, V> cVar) {
        v7.g.f(cVar, "map");
        this.f12854i = cVar;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int c() {
        c<K, V> cVar = this.f12854i;
        cVar.getClass();
        return cVar.f12835j;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f12854i.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new r(this.f12854i.f12834i);
    }
}
