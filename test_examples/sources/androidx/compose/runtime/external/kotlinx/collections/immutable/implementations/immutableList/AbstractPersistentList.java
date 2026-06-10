package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import i0.a;
import i0.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import v7.g;

/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends n7.a<E> implements c<E> {
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public c<E> addAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        PersistentVectorBuilder builder = builder();
        builder.addAll(collection);
        return builder.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        g.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // n7.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // n7.a, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final c<E> remove(E e10) {
        int indexOf = indexOf(e10);
        return indexOf != -1 ? p(indexOf) : this;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, i0.c
    public final c<E> removeAll(Collection<? extends E> collection) {
        g.f(collection, "elements");
        return l(new AbstractPersistentList$removeAll$1(collection));
    }

    @Override // n7.a, java.util.List
    public final List subList(int i10, int i11) {
        return new a.C0127a(this, i10, i11);
    }
}
