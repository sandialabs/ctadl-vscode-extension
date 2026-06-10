package n7;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractCollection;

/* loaded from: classes.dex */
public abstract class e<E> extends AbstractCollection<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        v7.g.f(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            E next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
