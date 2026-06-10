package ga;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<h<T>> f11280a;

    public a(h<? extends T> hVar) {
        this.f11280a = new AtomicReference<>(hVar);
    }

    @Override // ga.h
    public final Iterator<T> iterator() {
        h<T> andSet = this.f11280a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
