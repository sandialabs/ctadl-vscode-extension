package ua;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u<E, C extends Collection<? extends E>, B> extends t<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qa.b<E> bVar) {
        super(bVar);
        v7.g.f(bVar, "element");
    }

    @Override // ua.a
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        v7.g.f(collection, "<this>");
        return collection.iterator();
    }

    @Override // ua.a
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        v7.g.f(collection, "<this>");
        return collection.size();
    }
}
