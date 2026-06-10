package n7;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c<E> extends AbstractList<E> implements List<E>, w7.b {
    public abstract int c();

    public abstract E d(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return d(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
