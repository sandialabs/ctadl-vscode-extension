package p0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class q<T> implements ListIterator<T>, w7.a, Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final SnapshotStateList<T> f16618i;

    /* renamed from: j  reason: collision with root package name */
    public int f16619j;

    /* renamed from: k  reason: collision with root package name */
    public int f16620k;

    public q(SnapshotStateList<T> snapshotStateList, int i10) {
        v7.g.f(snapshotStateList, "list");
        this.f16618i = snapshotStateList;
        this.f16619j = i10 - 1;
        this.f16620k = snapshotStateList.c();
    }

    public final void a() {
        if (this.f16618i.c() != this.f16620k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t10) {
        a();
        SnapshotStateList<T> snapshotStateList = this.f16618i;
        snapshotStateList.add(this.f16619j + 1, t10);
        this.f16619j++;
        this.f16620k = snapshotStateList.c();
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
        return this.f16619j < this.f16618i.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16619j >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        a();
        int i10 = this.f16619j + 1;
        SnapshotStateList<T> snapshotStateList = this.f16618i;
        n.a(i10, snapshotStateList.size());
        T t10 = snapshotStateList.get(i10);
        this.f16619j = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16619j + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i10 = this.f16619j;
        SnapshotStateList<T> snapshotStateList = this.f16618i;
        n.a(i10, snapshotStateList.size());
        this.f16619j--;
        return snapshotStateList.get(this.f16619j);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16619j;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f16619j;
        SnapshotStateList<T> snapshotStateList = this.f16618i;
        snapshotStateList.remove(i10);
        this.f16619j--;
        this.f16620k = snapshotStateList.c();
    }

    @Override // java.util.ListIterator
    public final void set(T t10) {
        a();
        int i10 = this.f16619j;
        SnapshotStateList<T> snapshotStateList = this.f16618i;
        snapshotStateList.set(i10, t10);
        this.f16620k = snapshotStateList.c();
    }
}
