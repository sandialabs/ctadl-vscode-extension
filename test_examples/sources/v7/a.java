package v7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a<T> implements Iterator<T>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final T[] f18162i;

    /* renamed from: j  reason: collision with root package name */
    public int f18163j;

    public a(T[] tArr) {
        g.f(tArr, "array");
        this.f18162i = tArr;
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
        return this.f18163j < this.f18162i.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f18162i;
            int i10 = this.f18163j;
            this.f18163j = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f18163j--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
