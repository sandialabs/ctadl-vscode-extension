package p0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final class y<T> implements List<T>, w7.b {

    /* renamed from: i  reason: collision with root package name */
    public final SnapshotStateList<T> f16631i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16632j;

    /* renamed from: k  reason: collision with root package name */
    public int f16633k;

    /* renamed from: l  reason: collision with root package name */
    public int f16634l;

    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, w7.a, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f16635i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ y<T> f16636j;

        public a(Ref$IntRef ref$IntRef, y<T> yVar) {
            this.f16635i = ref$IntRef;
            this.f16636j = yVar;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            Object obj2 = n.f16611a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
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
            if (this.f16635i.f13058i < this.f16636j.f16634l - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16635i.f13058i >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            Ref$IntRef ref$IntRef = this.f16635i;
            int i10 = ref$IntRef.f13058i + 1;
            y<T> yVar = this.f16636j;
            n.a(i10, yVar.f16634l);
            ref$IntRef.f13058i = i10;
            return yVar.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16635i.f13058i + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Ref$IntRef ref$IntRef = this.f16635i;
            int i10 = ref$IntRef.f13058i;
            y<T> yVar = this.f16636j;
            n.a(i10, yVar.f16634l);
            ref$IntRef.f13058i = i10 - 1;
            return yVar.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16635i.f13058i;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            Object obj = n.f16611a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Object obj2 = n.f16611a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public y(SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        v7.g.f(snapshotStateList, "parentList");
        this.f16631i = snapshotStateList;
        this.f16632j = i10;
        this.f16633k = snapshotStateList.c();
        this.f16634l = i11 - i10;
    }

    @Override // java.util.List
    public final void add(int i10, T t10) {
        c();
        int i11 = this.f16632j + i10;
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        snapshotStateList.add(i11, t10);
        this.f16634l++;
        this.f16633k = snapshotStateList.c();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        v7.g.f(collection, "elements");
        c();
        int i11 = i10 + this.f16632j;
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        boolean addAll = snapshotStateList.addAll(i11, collection);
        if (addAll) {
            this.f16634l = collection.size() + this.f16634l;
            this.f16633k = snapshotStateList.c();
        }
        return addAll;
    }

    public final void c() {
        if (this.f16631i.c() != this.f16633k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        i0.c<? extends T> cVar;
        f i11;
        boolean z10;
        if (this.f16634l > 0) {
            c();
            SnapshotStateList<T> snapshotStateList = this.f16631i;
            int i12 = this.f16632j;
            int i13 = this.f16634l + i12;
            snapshotStateList.getClass();
            do {
                Object obj = n.f16611a;
                synchronized (obj) {
                    SnapshotStateList.a aVar = snapshotStateList.f2954i;
                    v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    SnapshotStateList.a aVar2 = (SnapshotStateList.a) SnapshotKt.h(aVar);
                    i10 = aVar2.f2955d;
                    cVar = aVar2.c;
                    m7.n nVar = m7.n.f16010a;
                }
                v7.g.c(cVar);
                PersistentVectorBuilder builder = cVar.builder();
                builder.subList(i12, i13).clear();
                i0.c<? extends T> g10 = builder.g();
                if (v7.g.a(g10, cVar)) {
                    break;
                }
                synchronized (obj) {
                    SnapshotStateList.a aVar3 = snapshotStateList.f2954i;
                    v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    synchronized (SnapshotKt.c) {
                        i11 = SnapshotKt.i();
                        SnapshotStateList.a aVar4 = (SnapshotStateList.a) SnapshotKt.s(aVar3, snapshotStateList, i11);
                        if (aVar4.f2955d == i10) {
                            aVar4.c(g10);
                            z10 = true;
                            aVar4.f2955d++;
                        } else {
                            z10 = false;
                        }
                    }
                    SnapshotKt.l(i11, snapshotStateList);
                }
            } while (!z10);
            this.f16634l = 0;
            this.f16633k = this.f16631i.c();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        v7.g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i10) {
        c();
        n.a(i10, this.f16634l);
        return this.f16631i.get(this.f16632j + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i10 = this.f16634l;
        int i11 = this.f16632j;
        java.util.Iterator<Integer> it = a1.c.V1(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int nextInt = ((n7.u) it).nextInt();
            if (v7.g.a(obj, this.f16631i.get(nextInt))) {
                return nextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16634l == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i10 = this.f16634l;
        int i11 = this.f16632j;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (v7.g.a(obj, this.f16631i.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        c();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f13058i = i10 - 1;
        return new a(ref$IntRef, this);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        c();
        int i11 = this.f16632j + i10;
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        T remove = snapshotStateList.remove(i11);
        this.f16634l--;
        this.f16633k = snapshotStateList.c();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        v7.g.f(collection, "elements");
        while (true) {
            for (Object obj : collection) {
                z10 = remove(obj) || z10;
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        i0.c<? extends T> cVar;
        f i11;
        boolean z10;
        v7.g.f(collection, "elements");
        c();
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        int i12 = this.f16632j;
        int i13 = this.f16634l + i12;
        snapshotStateList.getClass();
        int size = snapshotStateList.size();
        do {
            Object obj = n.f16611a;
            synchronized (obj) {
                SnapshotStateList.a aVar = snapshotStateList.f2954i;
                v7.g.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                SnapshotStateList.a aVar2 = (SnapshotStateList.a) SnapshotKt.h(aVar);
                i10 = aVar2.f2955d;
                cVar = aVar2.c;
                m7.n nVar = m7.n.f16010a;
            }
            v7.g.c(cVar);
            PersistentVectorBuilder builder = cVar.builder();
            builder.subList(i12, i13).retainAll(collection);
            i0.c<? extends T> g10 = builder.g();
            if (v7.g.a(g10, cVar)) {
                break;
            }
            synchronized (obj) {
                SnapshotStateList.a aVar3 = snapshotStateList.f2954i;
                v7.g.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    i11 = SnapshotKt.i();
                    SnapshotStateList.a aVar4 = (SnapshotStateList.a) SnapshotKt.s(aVar3, snapshotStateList, i11);
                    if (aVar4.f2955d == i10) {
                        aVar4.c(g10);
                        aVar4.f2955d++;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                SnapshotKt.l(i11, snapshotStateList);
            }
        } while (!z10);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f16633k = this.f16631i.c();
            this.f16634l -= size2;
        }
        if (size2 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final T set(int i10, T t10) {
        n.a(i10, this.f16634l);
        c();
        int i11 = i10 + this.f16632j;
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        T t11 = snapshotStateList.set(i11, t10);
        this.f16633k = snapshotStateList.c();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16634l;
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i11 > this.f16634l) {
            z11 = false;
        }
        if (z11) {
            c();
            int i12 = this.f16632j;
            return new y(this.f16631i, i10 + i12, i11 + i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t10) {
        c();
        int i10 = this.f16632j + this.f16634l;
        SnapshotStateList<T> snapshotStateList = this.f16631i;
        snapshotStateList.add(i10, t10);
        this.f16634l++;
        this.f16633k = snapshotStateList.c();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        v7.g.f(collection, "elements");
        return addAll(this.f16634l, collection);
    }
}
