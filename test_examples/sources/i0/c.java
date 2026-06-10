package i0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import u7.l;

/* loaded from: classes.dex */
public interface c<E> extends a<E>, Collection, w7.a {
    @Override // i0.c
    c<E> add(int i10, E e10);

    @Override // java.util.List, i0.c
    c<E> add(E e10);

    @Override // java.util.List, i0.c
    c<E> addAll(Collection<? extends E> collection);

    PersistentVectorBuilder builder();

    c<E> l(l<? super E, Boolean> lVar);

    c<E> p(int i10);

    @Override // java.util.List, i0.c
    c<E> remove(E e10);

    @Override // java.util.List, i0.c
    c<E> removeAll(Collection<? extends E> collection);

    @Override // i0.c
    c<E> set(int i10, E e10);
}
