package j0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, w7.a, Iterator {

    /* renamed from: i  reason: collision with root package name */
    public int f12621i;

    /* renamed from: j  reason: collision with root package name */
    public int f12622j;

    public a(int i10, int i11) {
        this.f12621i = i10;
        this.f12622j = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f12621i < this.f12622j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12621i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12621i;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12621i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
