package j$.util;

import j$.util.function.UnaryOperator;
import java.util.Comparator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            if (DesugarCollections.f12072b.isInstance(list)) {
                DesugarCollections.e(list, unaryOperator);
                return;
            }
            unaryOperator.getClass();
            ListIterator<E> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set((E) unaryOperator.apply(listIterator.next()));
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            list.getClass();
            return new b0(16, list);
        }
    }

    void add(int i10, E e10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    boolean add(E e10);

    boolean addAll(int i10, java.util.Collection<? extends E> collection);

    @Override // j$.util.Collection
    boolean addAll(java.util.Collection<? extends E> collection);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    void clear();

    @Override // j$.util.Collection
    boolean contains(Object obj);

    @Override // j$.util.Collection
    boolean containsAll(java.util.Collection<?> collection);

    @Override // j$.util.Collection
    boolean equals(Object obj);

    E get(int i10);

    @Override // j$.util.Collection
    int hashCode();

    int indexOf(Object obj);

    @Override // j$.util.Collection
    boolean isEmpty();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    java.util.Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i10);

    E remove(int i10);

    @Override // j$.util.Collection
    boolean remove(Object obj);

    @Override // j$.util.Collection
    boolean removeAll(java.util.Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    @Override // j$.util.Collection
    boolean retainAll(java.util.Collection<?> collection);

    E set(int i10, E e10);

    @Override // java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    int size();

    void sort(Comparator<? super E> comparator);

    @Override // java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    Spliterator<E> spliterator();

    java.util.List<E> subList(int i10, int i11);

    @Override // j$.util.Collection
    Object[] toArray();

    @Override // java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    <T> T[] toArray(T[] tArr);
}
