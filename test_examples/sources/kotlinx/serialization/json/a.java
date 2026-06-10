package kotlinx.serialization.json;

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
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ma.i;
import qa.d;
import v7.g;

@d(with = va.b.class)
/* loaded from: classes.dex */
public final class a extends b implements List<b>, w7.a, j$.util.List {
    public static final C0176a Companion = new C0176a();

    /* renamed from: i  reason: collision with root package name */
    public final List<b> f15676i;

    /* renamed from: kotlinx.serialization.json.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0176a {
        public final qa.b<a> serializer() {
            return va.b.f18193a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends b> list) {
        g.f(list, "content");
        this.f15676i = list;
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
    public final boolean addAll(int i10, Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        g.f(bVar, "element");
        return this.f15676i.contains(bVar);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        return this.f15676i.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean equals(Object obj) {
        return g.a(this.f15676i, obj);
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
        return this.f15676i.get(i10);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final int hashCode() {
        return this.f15676i.hashCode();
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        g.f(bVar, "element");
        return this.f15676i.indexOf(bVar);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final boolean isEmpty() {
        return this.f15676i.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection
    public final Iterator<b> iterator() {
        return this.f15676i.iterator();
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        g.f(bVar, "element");
        return this.f15676i.lastIndexOf(bVar);
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<b> listIterator() {
        return this.f15676i.listIterator();
    }

    @Override // java.util.List, j$.util.List
    public final ListIterator<b> listIterator(int i10) {
        return this.f15676i.listIterator(i10);
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
    public final void replaceAll(UnaryOperator<b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator<b> unaryOperator) {
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
        return this.f15676i.size();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super b> comparator) {
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
    public final List<b> subList(int i10, int i11) {
        return this.f15676i.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection
    public final Object[] toArray() {
        return i.O(this);
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
        g.f(tArr, "array");
        return (T[]) i.P(this, tArr);
    }

    public final String toString() {
        return kotlin.collections.c.t2(this.f15676i, ",", "[", "]", null, 56);
    }
}
