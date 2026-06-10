package n7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public abstract class a<E> extends AbstractCollection<E> implements List<E> {

    /* renamed from: n7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0193a {
        public static void a(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 <= i11) {
                    return;
                }
                throw new IllegalArgumentException(a4.b.j("fromIndex: ", i10, " > toIndex: ", i11));
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Iterator<E>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f16112i;

        public b() {
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
            if (this.f16112i < a.this.c()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (hasNext()) {
                int i10 = this.f16112i;
                this.f16112i = i10 + 1;
                return a.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    public class c extends a<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            int c = a.this.c();
            if (i10 >= 0 && i10 <= c) {
                this.f16112i = i10;
                return;
            }
            throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", c));
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16112i > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16112i;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                int i10 = this.f16112i - 1;
                this.f16112i = i10;
                return a.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16112i - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    public static final class d<E> extends a<E> implements RandomAccess {

        /* renamed from: i  reason: collision with root package name */
        public final a<E> f16115i;

        /* renamed from: j  reason: collision with root package name */
        public final int f16116j;

        /* renamed from: k  reason: collision with root package name */
        public final int f16117k;

        /* JADX WARN: Multi-variable type inference failed */
        public d(a<? extends E> aVar, int i10, int i11) {
            v7.g.f(aVar, "list");
            this.f16115i = aVar;
            this.f16116j = i10;
            C0193a.a(i10, i11, aVar.c());
            this.f16117k = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        public final int c() {
            return this.f16117k;
        }

        @Override // n7.a, java.util.List
        public final E get(int i10) {
            int i11 = this.f16117k;
            if (i10 >= 0 && i10 < i11) {
                return this.f16115i.get(this.f16116j + i10);
            }
            throw new IndexOutOfBoundsException(a4.b.j("index: ", i10, ", size: ", i11));
        }
    }

    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        v7.g.f(collection, "other");
        if (size() == collection.size()) {
            java.util.Iterator<E> it = collection.iterator();
            for (E e10 : this) {
                if (!v7.g.a(e10, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int i10 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i10;
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (v7.g.a(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (v7.g.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
