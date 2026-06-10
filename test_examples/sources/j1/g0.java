package j1;

import j$.lang.Iterable$CC;
import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static final class a implements Collection<Object>, w7.a, j$.util.Collection {

        /* renamed from: i  reason: collision with root package name */
        public final Set<Object> f12652i = new LinkedHashSet();

        public a(int i10) {
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
        public final boolean add(Object obj) {
            return this.f12652i.add(obj);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
        public final void clear() {
            this.f12652i.clear();
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean contains(Object obj) {
            return this.f12652i.contains(obj);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            v7.g.f(collection, "elements");
            return this.f12652i.containsAll(collection);
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
        public final boolean isEmpty() {
            return this.f12652i.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.List, j$.util.List
        public final Iterator<Object> iterator() {
            return this.f12652i.iterator();
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
            return this.f12652i.remove(obj);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            v7.g.f(collection, "slotIds");
            return this.f12652i.remove(collection);
        }

        @Override // j$.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final /* synthetic */ boolean removeIf(java.util.function.Predicate<? super Object> predicate) {
            removeIf(Predicate.VivifiedWrapper.convert(predicate));
            throw null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            v7.g.f(collection, "slotIds");
            return this.f12652i.retainAll(collection);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
        public final int size() {
            return this.f12652i.size();
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

        @Override // java.util.Collection, j$.util.Collection, java.util.List, j$.util.List
        public final <T> T[] toArray(T[] tArr) {
            v7.g.f(tArr, "array");
            return (T[]) ma.i.P(this, tArr);
        }
    }

    void a();

    void c(a aVar);
}
