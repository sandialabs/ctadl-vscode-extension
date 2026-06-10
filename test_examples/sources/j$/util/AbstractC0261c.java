package j$.util;

import j$.util.Collection;
import j$.util.List;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0293n;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0261c {
    public static void e(E e10, Consumer consumer) {
        if (consumer instanceof InterfaceC0293n) {
            e10.d((InterfaceC0293n) consumer);
        } else if (f0.f12187a) {
            f0.a(e10.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            e10.d(new C0321o(consumer));
        }
    }

    public static void g(H h10, Consumer consumer) {
        if (consumer instanceof j$.util.function.K) {
            h10.c((j$.util.function.K) consumer);
        } else if (f0.f12187a) {
            f0.a(h10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            h10.c(new C0324s(consumer));
        }
    }

    public static void h(K k3, Consumer consumer) {
        if (consumer instanceof InterfaceC0278f0) {
            k3.b((InterfaceC0278f0) consumer);
        } else if (f0.f12187a) {
            f0.a(k3.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            k3.b(new C0439w(consumer));
        }
    }

    public static long i(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean j(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static boolean l(E e10, Consumer consumer) {
        if (consumer instanceof InterfaceC0293n) {
            return e10.p((InterfaceC0293n) consumer);
        }
        if (f0.f12187a) {
            f0.a(e10.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return e10.p(new C0321o(consumer));
    }

    public static boolean m(H h10, Consumer consumer) {
        if (consumer instanceof j$.util.function.K) {
            return h10.k((j$.util.function.K) consumer);
        }
        if (f0.f12187a) {
            f0.a(h10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return h10.k(new C0324s(consumer));
    }

    public static boolean n(K k3, Consumer consumer) {
        if (consumer instanceof InterfaceC0278f0) {
            return k3.f((InterfaceC0278f0) consumer);
        }
        if (f0.f12187a) {
            f0.a(k3.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return k3.f(new C0439w(consumer));
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        consumer.getClass();
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static Comparator r() {
        return EnumC0265e.INSTANCE;
    }

    public static void s(java.util.List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else if (DesugarCollections.f12072b.isInstance(list)) {
            DesugarCollections.f(list, comparator);
        } else {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    public static Spliterator t(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            linkedHashSet.getClass();
            return new b0(17, linkedHashSet);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new B(sortedSet, sortedSet);
        } else if (!(collection instanceof Set)) {
            return collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Collection.CC.$default$spliterator(collection);
        } else {
            Set set = (Set) collection;
            set.getClass();
            return new b0(1, set);
        }
    }

    public static C0260b u(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof InterfaceC0264d) {
            EnumC0265e enumC0265e = (EnumC0265e) ((InterfaceC0264d) comparator);
            enumC0265e.getClass();
            return new C0260b(enumC0265e, comparator2, 0);
        }
        return new C0260b(comparator, comparator2, 0);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
