package u1;

import j$.lang.Iterable$CC;
import j$.util.AbstractC0261c;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends e implements List<d>, w7.a, j$.util.List {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<d> f17744k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f17745l;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends d> list) {
        this.f17744k = list;
        if (!list.isEmpty()) {
            this.f17745l = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final boolean addAll(int i10, Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        v7.g.f(dVar, "element");
        return this.f17744k.contains(dVar);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        v7.g.f(collection, "elements");
        return this.f17744k.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && v7.g.a(this.f17745l, ((g) obj).f17745l);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.List, j$.util.List
    public final Object get(int i10) {
        return this.f17744k.get(i10);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int hashCode() {
        return this.f17745l.hashCode();
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d)) {
            return -1;
        }
        d dVar = (d) obj;
        v7.g.f(dVar, "element");
        return this.f17744k.indexOf(dVar);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean isEmpty() {
        return this.f17744k.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final Iterator<d> iterator() {
        return this.f17744k.iterator();
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d)) {
            return -1;
        }
        d dVar = (d) obj;
        v7.g.f(dVar, "element");
        return this.f17744k.lastIndexOf(dVar);
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<d> listIterator() {
        return this.f17744k.listIterator();
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<d> listIterator(int i10) {
        return this.f17744k.listIterator(i10);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), true);
        return Stream.Wrapper.convert(v12);
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // j$.util.List
    public final void replaceAll(UnaryOperator<d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator<d> unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        throw null;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int size() {
        return this.f17744k.size();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return getClass();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(getClass());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return v12;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        Stream v12;
        v12 = AbstractC0421w0.v1(AbstractC0261c.t(this), false);
        return Stream.Wrapper.convert(v12);
    }

    @Override // java.util.List, j$.util.List
    public final List<d> subList(int i10, int i11) {
        return this.f17744k.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final Object[] toArray() {
        return ma.i.O(this);
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        v7.g.f(tArr, "array");
        return (T[]) ma.i.P(this, tArr);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=" + this.f17745l + ')';
    }
}
