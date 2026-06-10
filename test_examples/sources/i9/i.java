package i9;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class i extends AbstractList<String> implements RandomAccess, d {

    /* renamed from: i  reason: collision with root package name */
    public final d f11859i;

    /* loaded from: classes.dex */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final ListIterator<String> f11860i;

        public a(i iVar, int i10) {
            this.f11860i = iVar.f11859i.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            String str2 = str;
            throw new UnsupportedOperationException();
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
            return this.f11860i.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f11860i.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f11860i.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f11860i.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f11860i.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f11860i.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            String str2 = str;
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class b implements java.util.Iterator<String>, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final java.util.Iterator<String> f11861i;

        public b(i iVar) {
            this.f11861i = iVar.f11859i.iterator();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f11861i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f11861i.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i(d dVar) {
        this.f11859i = dVar;
    }

    @Override // i9.d
    public final i a() {
        return this;
    }

    @Override // i9.d
    public final List<?> b() {
        return this.f11859i.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f11859i.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // i9.d
    public final i9.a m(int i10) {
        return this.f11859i.m(i10);
    }

    @Override // i9.d
    public final void o(e eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11859i.size();
    }
}
