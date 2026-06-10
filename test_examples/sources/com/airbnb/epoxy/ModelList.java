package com.airbnb.epoxy;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ModelList extends ArrayList<r<?>> {

    /* renamed from: i  reason: collision with root package name */
    public boolean f6591i;

    /* renamed from: j  reason: collision with root package name */
    public c f6592j;

    /* loaded from: classes.dex */
    public class a implements Iterator<r<?>>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f6593i;

        /* renamed from: j  reason: collision with root package name */
        public int f6594j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f6595k;

        public a() {
            this.f6595k = ((ArrayList) ModelList.this).modCount;
        }

        final void a() {
            if (((ArrayList) ModelList.this).modCount != this.f6595k) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super r<?>> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f6593i != ModelList.this.size();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            a();
            int i10 = this.f6593i;
            this.f6593i = i10 + 1;
            this.f6594j = i10;
            return ModelList.this.get(i10);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            ModelList modelList = ModelList.this;
            if (this.f6594j < 0) {
                throw new IllegalStateException();
            }
            a();
            try {
                modelList.remove(this.f6594j);
                this.f6593i = this.f6594j;
                this.f6594j = -1;
                this.f6595k = ((ArrayList) modelList).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a implements ListIterator<r<?>> {
        public b(int i10) {
            super();
            this.f6593i = i10;
        }

        @Override // java.util.ListIterator
        public final void add(r<?> rVar) {
            r<?> rVar2 = rVar;
            ModelList modelList = ModelList.this;
            a();
            try {
                int i10 = this.f6593i;
                modelList.add(i10, rVar2);
                this.f6593i = i10 + 1;
                this.f6594j = -1;
                this.f6595k = ((ArrayList) modelList).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f6593i != 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f6593i;
        }

        @Override // java.util.ListIterator
        public final r<?> previous() {
            a();
            int i10 = this.f6593i - 1;
            if (i10 >= 0) {
                this.f6593i = i10;
                this.f6594j = i10;
                return ModelList.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f6593i - 1;
        }

        @Override // java.util.ListIterator
        public final void set(r<?> rVar) {
            r<?> rVar2 = rVar;
            if (this.f6594j >= 0) {
                a();
                try {
                    ModelList.this.set(this.f6594j, rVar2);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends AbstractList<r<?>> {

        /* renamed from: i  reason: collision with root package name */
        public final ModelList f6598i;

        /* renamed from: j  reason: collision with root package name */
        public final int f6599j;

        /* renamed from: k  reason: collision with root package name */
        public int f6600k;

        /* loaded from: classes.dex */
        public static final class a implements ListIterator<r<?>>, j$.util.Iterator {

            /* renamed from: i  reason: collision with root package name */
            public final d f6601i;

            /* renamed from: j  reason: collision with root package name */
            public final ListIterator<r<?>> f6602j;

            /* renamed from: k  reason: collision with root package name */
            public final int f6603k;

            /* renamed from: l  reason: collision with root package name */
            public int f6604l;

            public a(ListIterator<r<?>> listIterator, d dVar, int i10, int i11) {
                this.f6602j = listIterator;
                this.f6601i = dVar;
                this.f6603k = i10;
                this.f6604l = i10 + i11;
            }

            @Override // java.util.ListIterator
            public final void add(r<?> rVar) {
                this.f6602j.add(rVar);
                this.f6601i.c(true);
                this.f6604l++;
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
                return this.f6602j.nextIndex() < this.f6604l;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f6602j.previousIndex() >= this.f6603k;
            }

            @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
            public final Object next() {
                ListIterator<r<?>> listIterator = this.f6602j;
                if (listIterator.nextIndex() < this.f6604l) {
                    return listIterator.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f6602j.nextIndex() - this.f6603k;
            }

            @Override // java.util.ListIterator
            public final r<?> previous() {
                ListIterator<r<?>> listIterator = this.f6602j;
                if (listIterator.previousIndex() >= this.f6603k) {
                    return listIterator.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                int previousIndex = this.f6602j.previousIndex();
                int i10 = this.f6603k;
                if (previousIndex >= i10) {
                    return previousIndex - i10;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
            public final void remove() {
                this.f6602j.remove();
                this.f6601i.c(false);
                this.f6604l--;
            }

            @Override // java.util.ListIterator
            public final void set(r<?> rVar) {
                this.f6602j.set(rVar);
            }
        }

        public d(ModelList modelList, int i10, int i11) {
            this.f6598i = modelList;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            this.f6599j = i10;
            this.f6600k = i11 - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, Object obj) {
            r<?> rVar = (r) obj;
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 >= 0 && i10 <= this.f6600k) {
                    modelList.add(i10 + this.f6599j, rVar);
                    this.f6600k++;
                    ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i10, Collection<? extends r<?>> collection) {
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 < 0 || i10 > this.f6600k) {
                    throw new IndexOutOfBoundsException();
                }
                boolean addAll = modelList.addAll(i10 + this.f6599j, collection);
                if (addAll) {
                    this.f6600k = collection.size() + this.f6600k;
                    ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends r<?>> collection) {
            int i10 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i10 == ((ArrayList) modelList).modCount) {
                boolean addAll = modelList.addAll(this.f6599j + this.f6600k, collection);
                if (addAll) {
                    this.f6600k = collection.size() + this.f6600k;
                    ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }

        public final void c(boolean z10) {
            this.f6600k = z10 ? this.f6600k + 1 : this.f6600k - 1;
            ((AbstractList) this).modCount = ((ArrayList) this.f6598i).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 < 0 || i10 >= this.f6600k) {
                    throw new IndexOutOfBoundsException();
                }
                return modelList.get(i10 + this.f6599j);
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Iterator<r<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<r<?>> listIterator(int i10) {
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 < 0 || i10 > this.f6600k) {
                    throw new IndexOutOfBoundsException();
                }
                int i12 = this.f6599j;
                return new a(modelList.listIterator(i10 + i12), this, i12, this.f6600k);
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i10) {
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 < 0 || i10 >= this.f6600k) {
                    throw new IndexOutOfBoundsException();
                }
                r<?> remove = modelList.remove(i10 + this.f6599j);
                this.f6600k--;
                ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
                return remove;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i10, int i11) {
            if (i10 != i11) {
                int i12 = ((AbstractList) this).modCount;
                ModelList modelList = this.f6598i;
                if (i12 != ((ArrayList) modelList).modCount) {
                    throw new ConcurrentModificationException();
                }
                int i13 = this.f6599j;
                modelList.removeRange(i10 + i13, i13 + i11);
                this.f6600k -= i11 - i10;
                ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            r<?> rVar = (r) obj;
            int i11 = ((AbstractList) this).modCount;
            ModelList modelList = this.f6598i;
            if (i11 == ((ArrayList) modelList).modCount) {
                if (i10 >= 0 && i10 < this.f6600k) {
                    return modelList.set(i10 + this.f6599j, rVar);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.f6598i).modCount) {
                return this.f6600k;
            }
            throw new ConcurrentModificationException();
        }
    }

    public ModelList() {
    }

    public ModelList(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: J */
    public final void add(int i10, r<?> rVar) {
        L();
        super.add(i10, rVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: K */
    public final boolean add(r<?> rVar) {
        size();
        L();
        return super.add(rVar);
    }

    public final void L() {
        if (!this.f6591i && this.f6592j != null) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    public final void M() {
        if (!this.f6591i && this.f6592j != null) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: N */
    public final r<?> remove(int i10) {
        M();
        return (r) super.remove(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: O */
    public final r<?> set(int i10, r<?> rVar) {
        r<?> rVar2 = (r) super.set(i10, rVar);
        if (rVar2.f6681a != rVar.f6681a) {
            M();
            L();
        }
        return rVar2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends r<?>> collection) {
        collection.size();
        L();
        return super.addAll(i10, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends r<?>> collection) {
        size();
        collection.size();
        L();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (isEmpty()) {
            return;
        }
        size();
        M();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<r<?>> iterator() {
        return new a();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final ListIterator<r<?>> listIterator() {
        return new b(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final ListIterator<r<?>> listIterator(int i10) {
        return new b(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        M();
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        java.util.Iterator<r<?>> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        M();
        super.removeRange(i10, i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        java.util.Iterator<r<?>> it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final List<r<?>> subList(int i10, int i11) {
        if (i10 < 0 || i11 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 <= i11) {
            return new d(this, i10, i11);
        }
        throw new IllegalArgumentException();
    }
}
