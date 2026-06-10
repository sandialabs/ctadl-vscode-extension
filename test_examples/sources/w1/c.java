package w1;

import j$.lang.Iterable$CC;
import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ma.i;
import v7.g;

/* loaded from: classes.dex */
public final class c implements Collection<b>, w7.a, j$.util.Collection {

    /* renamed from: i  reason: collision with root package name */
    public final List<b> f18257i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18258j;

    public c(ArrayList arrayList) {
        this.f18257i = arrayList;
        this.f18258j = arrayList.size();
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        g.f(bVar, "element");
        return this.f18257i.contains(bVar);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        return this.f18257i.containsAll(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return g.a(this.f18257i, ((c) obj).f18257i);
        }
        return false;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final int hashCode() {
        return this.f18257i.hashCode();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean isEmpty() {
        return this.f18257i.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
    public final Iterator<b> iterator() {
        return this.f18257i.iterator();
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

    @Override // java.util.Collection, j$.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate<? super b> predicate) {
        removeIf(Predicate.VivifiedWrapper.convert(predicate));
        throw null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
    public final int size() {
        return this.f18258j;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return getClass();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
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

    @Override // java.util.Collection, j$.util.Collection
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

    @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
    public final <T> T[] toArray(T[] tArr) {
        g.f(tArr, "array");
        return (T[]) i.P(this, tArr);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f18257i + ')';
    }
}
