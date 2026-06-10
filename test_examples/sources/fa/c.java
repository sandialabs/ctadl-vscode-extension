package fa;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.lang.Iterable$CC;
import j$.util.AbstractC0261c;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.AbstractC0421w0;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c<E> extends AbstractList<E> implements RandomAccess, List {

    /* renamed from: i  reason: collision with root package name */
    public int f11011i;

    /* renamed from: j  reason: collision with root package name */
    public Object f11012j;

    /* loaded from: classes.dex */
    public static class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public static final a f11013i = new a();

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
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractC0119c<E> implements j$.util.Iterator {

        /* renamed from: j  reason: collision with root package name */
        public final int f11014j;

        public b() {
            this.f11014j = ((AbstractList) c.this).modCount;
        }

        @Override // fa.c.AbstractC0119c
        public final void a() {
            c cVar = c.this;
            int i10 = ((AbstractList) cVar).modCount;
            int i11 = this.f11014j;
            if (i10 == i11) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) cVar).modCount + "; expected: " + i11);
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
        public final void remove() {
            a();
            c.this.clear();
        }
    }

    /* renamed from: fa.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0119c<T> implements java.util.Iterator<T> {

        /* renamed from: i  reason: collision with root package name */
        public boolean f11016i;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f11016i;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f11016i) {
                this.f11016i = true;
                a();
                return (T) c.this.f11012j;
            }
            throw new NoSuchElementException();
        }
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f11011i)) {
            StringBuilder o10 = a4.b.o("Index: ", i10, ", Size: ");
            o10.append(this.f11011i);
            throw new IndexOutOfBoundsException(o10.toString());
        }
        if (i11 == 0) {
            this.f11012j = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.f11012j = new Object[]{e10, this.f11012j};
        } else {
            Object[] objArr = new Object[i11 + 1];
            if (i11 == 1) {
                objArr[0] = this.f11012j;
            } else {
                Object[] objArr2 = (Object[]) this.f11012j;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f11011i - i10);
            }
            objArr[i10] = e10;
            this.f11012j = objArr;
        }
        this.f11011i++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    public final boolean add(E e10) {
        int i10 = this.f11011i;
        if (i10 == 0) {
            this.f11012j = e10;
        } else if (i10 == 1) {
            this.f11012j = new Object[]{this.f11012j, e10};
        } else {
            Object[] objArr = (Object[]) this.f11012j;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f11012j = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f11011i] = e10;
        }
        this.f11011i++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    public final void clear() {
        this.f11012j = null;
        this.f11011i = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f11011i)) {
            if (i11 == 1) {
                return (E) this.f11012j;
            }
            return (E) ((Object[]) this.f11012j)[i10];
        }
        StringBuilder o10 = a4.b.o("Index: ", i10, ", Size: ");
        o10.append(this.f11011i);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public final java.util.Iterator<E> iterator() {
        int i10 = this.f11011i;
        if (i10 == 0) {
            return a.f11013i;
        }
        if (i10 == 1) {
            return new b();
        }
        java.util.Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        c(3);
        throw null;
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

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E remove(int i10) {
        int i11;
        E e10;
        if (i10 >= 0 && i10 < (i11 = this.f11011i)) {
            if (i11 == 1) {
                e10 = (E) this.f11012j;
                this.f11012j = null;
            } else {
                Object[] objArr = (Object[]) this.f11012j;
                Object obj = objArr[i10];
                if (i11 == 2) {
                    this.f11012j = objArr[1 - i10];
                } else {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                    }
                    objArr[this.f11011i - 1] = null;
                }
                e10 = (E) obj;
            }
            this.f11011i--;
            ((AbstractList) this).modCount++;
            return e10;
        }
        StringBuilder o10 = a4.b.o("Index: ", i10, ", Size: ");
        o10.append(this.f11011i);
        throw new IndexOutOfBoundsException(o10.toString());
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
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E set(int i10, E e10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f11011i)) {
            if (i11 == 1) {
                E e11 = (E) this.f11012j;
                this.f11012j = e10;
                return e11;
            }
            Object[] objArr = (Object[]) this.f11012j;
            E e12 = (E) objArr[i10];
            objArr[i10] = e10;
            return e12;
        }
        StringBuilder o10 = a4.b.o("Index: ", i10, ", Size: ");
        o10.append(this.f11011i);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    public final int size() {
        return this.f11011i;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i10 = this.f11011i;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f11012j, 0, i10, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return getClass();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            c(4);
            throw null;
        }
        int length = tArr.length;
        int i10 = this.f11011i;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f11012j;
                return tArr2;
            }
            tArr[0] = this.f11012j;
        } else if (length < i10) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f11012j, i10, tArr.getClass());
            if (tArr3 != null) {
                return tArr3;
            }
            c(6);
            throw null;
        } else if (i10 != 0) {
            System.arraycopy(this.f11012j, 0, tArr, 0, i10);
        }
        int i11 = this.f11011i;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }
}
