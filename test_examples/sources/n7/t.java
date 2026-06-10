package n7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t<T> implements Iterator<r<? extends T>>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final Iterator<T> f16131i;

    /* renamed from: j  reason: collision with root package name */
    public int f16132j;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Iterator<? extends T> it) {
        v7.g.f(it, "iterator");
        this.f16131i = it;
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
        return this.f16131i.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i10 = this.f16132j;
        this.f16132j = i10 + 1;
        if (i10 >= 0) {
            return new r(i10, this.f16131i.next());
        }
        a1.c.F1();
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
