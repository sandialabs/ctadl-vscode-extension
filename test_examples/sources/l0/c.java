package l0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import v7.g;

/* loaded from: classes.dex */
public final class c<E> implements Iterator<E>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public Object f15724i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<E, a> f15725j;

    /* renamed from: k  reason: collision with root package name */
    public int f15726k;

    public c(Object obj, k0.c cVar) {
        g.f(cVar, "map");
        this.f15724i = obj;
        this.f15725j = cVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f15726k < this.f15725j.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            E e10 = (E) this.f15724i;
            this.f15726k++;
            a aVar = this.f15725j.get(e10);
            if (aVar != null) {
                this.f15724i = aVar.f15719b;
                return e10;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
