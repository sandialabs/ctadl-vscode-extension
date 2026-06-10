package n7;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d<E> extends AbstractSet<E> implements Set<E>, w7.d {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
