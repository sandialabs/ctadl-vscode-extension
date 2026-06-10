package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e1 extends AbstractList<String> implements y, RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public final y f4860i;

    /* loaded from: classes.dex */
    public class a implements ListIterator<String>, Iterator {

        /* renamed from: i  reason: collision with root package name */
        public final ListIterator<String> f4861i;

        public a(e1 e1Var, int i10) {
            this.f4861i = e1Var.f4860i.listIterator(i10);
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
            return this.f4861i.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f4861i.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f4861i.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f4861i.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f4861i.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f4861i.previousIndex();
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
        public final java.util.Iterator<String> f4862i;

        public b(e1 e1Var) {
            this.f4862i = e1Var.f4860i.iterator();
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
            return this.f4862i.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.f4862i.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public e1(y yVar) {
        this.f4860i = yVar;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final y a() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final List<?> b() {
        return this.f4860i.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f4860i.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final void n(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final Object q(int i10) {
        return this.f4860i.q(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4860i.size();
    }
}
