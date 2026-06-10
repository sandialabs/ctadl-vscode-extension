package kotlin.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import n7.i;
import n7.l;
import n7.m;
import n7.n;
import n7.o;
import n7.p;
import n7.s;
import v7.g;

/* loaded from: classes.dex */
public class c extends o {
    public static final ArrayList A2(Collection collection, Object obj) {
        g.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final Object B2(Collection collection) {
        g.f(collection, "<this>");
        if (collection instanceof List) {
            return C2((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T C2(List<? extends T> list) {
        g.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object D2(Collection collection) {
        g.f(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static final <T> T E2(List<? extends T> list) {
        g.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final List F2(AbstractList abstractList) {
        if (abstractList.size() <= 1) {
            return L2(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        g.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.Z1(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> G2(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        g.f(iterable, "<this>");
        g.f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return L2(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            g.f(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return i.Z1(array);
        }
        List<T> O2 = O2(iterable);
        m.d2(O2, comparator);
        return O2;
    }

    public static final int H2(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Number) it.next()).intValue();
        }
        return i10;
    }

    public static final <T> List<T> I2(Iterable<? extends T> iterable, int i10) {
        boolean z10;
        g.f(iterable, "<this>");
        int i11 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return EmptyList.f12981i;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return L2(iterable);
                }
                if (i10 == 1) {
                    return a1.c.N0(m2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return a1.c.a1(arrayList);
        }
        throw new IllegalArgumentException(a4.b.i("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final void J2(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        g.f(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final int[] K2(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> L2(Iterable<? extends T> iterable) {
        Object next;
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return N2(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return a1.c.N0(next);
            }
            return EmptyList.f12981i;
        }
        return a1.c.a1(O2(iterable));
    }

    public static final long[] M2(Collection<Long> collection) {
        g.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Long l2 : collection) {
            jArr[i10] = l2.longValue();
            i10++;
        }
        return jArr;
    }

    public static final ArrayList N2(Collection collection) {
        g.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> O2(Iterable<? extends T> iterable) {
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return N2((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        J2(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> P2(Iterable<? extends T> iterable) {
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        J2(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> Q2(Iterable<? extends T> iterable) {
        Object next;
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(m0.b.O0(collection.size()));
                    J2(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return a1.c.v1(next);
            }
            return EmptySet.f12983i;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        J2(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 == 1) {
                return a1.c.v1(linkedHashSet2.iterator().next());
            }
            return linkedHashSet2;
        }
        return EmptySet.f12983i;
    }

    public static final s R2(Iterable iterable) {
        g.f(iterable, "<this>");
        return new s(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    public static final ArrayList S2(List list, Iterable iterable) {
        g.f(list, "<this>");
        g.f(iterable, "other");
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(l.Z1(list, 10), l.Z1(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final p g2(Iterable iterable) {
        g.f(iterable, "<this>");
        return new p(iterable);
    }

    public static final <T> boolean h2(Iterable<? extends T> iterable, T t10) {
        int i10;
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        if (iterable instanceof List) {
            i10 = ((List) iterable).indexOf(t10);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (i11 >= 0) {
                        if (g.a(t10, next)) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    } else {
                        a1.c.F1();
                        throw null;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public static final List i2(List list) {
        g.f(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return EmptyList.f12981i;
        }
        if (size == 1) {
            return a1.c.N0(u2(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i10 = 1; i10 < size2; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final List j2(List list) {
        g.f(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return I2(list, size);
    }

    public static final ArrayList k2(Iterable iterable, u7.l lVar) {
        g.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) lVar.U(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList l2(List list) {
        g.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T m2(Iterable<? extends T> iterable) {
        g.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) n2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T n2(List<? extends T> list) {
        g.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T o2(Iterable<? extends T> iterable) {
        g.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T p2(List<? extends T> list) {
        g.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object q2(int i10, List list) {
        g.f(list, "<this>");
        if (i10 < 0 || i10 > a1.c.B0(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final void r2(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, u7.l lVar) {
        g.f(iterable, "<this>");
        g.f(appendable, "buffer");
        g.f(charSequence, "separator");
        g.f(charSequence2, "prefix");
        g.f(charSequence3, "postfix");
        g.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a1.b.k(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void s2(Iterable iterable, Appendable appendable, String str, String str2, String str3, u7.l lVar, int i10) {
        if ((i10 & 2) != 0) {
            str = ", ";
        }
        r2(iterable, appendable, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? -1 : 0, (i10 & 32) != 0 ? "..." : null, (i10 & 64) != 0 ? null : lVar);
    }

    public static String t2(Iterable iterable, String str, String str2, String str3, u7.l lVar, int i10) {
        String str4;
        String str5;
        int i11;
        CharSequence charSequence;
        u7.l lVar2;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i10 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        g.f(iterable, "<this>");
        g.f(str6, "separator");
        g.f(str4, "prefix");
        g.f(str5, "postfix");
        g.f(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        r2(iterable, sb, str6, str4, str5, i11, charSequence, lVar2);
        String sb2 = sb.toString();
        g.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final Object u2(Collection collection) {
        g.f(collection, "<this>");
        if (collection instanceof List) {
            return v2((List) collection);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        while (true) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
        }
    }

    public static final <T> T v2(List<? extends T> list) {
        g.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(a1.c.B0(list));
    }

    public static final <T> T w2(List<? extends T> list) {
        g.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final ArrayList x2(Iterable iterable, Iterable iterable2) {
        g.f(iterable, "<this>");
        g.f(iterable2, "elements");
        if (iterable instanceof Collection) {
            return z2(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        n.f2(iterable, arrayList);
        n.f2(iterable2, arrayList);
        return arrayList;
    }

    public static final ArrayList y2(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return A2((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        n.f2(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList z2(Iterable iterable, Collection collection) {
        g.f(collection, "<this>");
        g.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            n.f2(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
