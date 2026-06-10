package k0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t<K, V, T> implements Iterator<T>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public Object[] f12861i;

    /* renamed from: j  reason: collision with root package name */
    public int f12862j;

    /* renamed from: k  reason: collision with root package name */
    public int f12863k;

    public t() {
        s sVar = s.f12855e;
        this.f12861i = s.f12855e.f12858d;
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
        return this.f12863k < this.f12862j;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
