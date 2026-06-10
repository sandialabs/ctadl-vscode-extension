package n7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class s<T> implements Iterable<r<? extends T>>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final u7.a<Iterator<T>> f16130i;

    /* JADX WARN: Multi-variable type inference failed */
    public s(u7.a<? extends Iterator<? extends T>> aVar) {
        this.f16130i = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<r<T>> iterator() {
        return new t(this.f16130i.k0());
    }
}
