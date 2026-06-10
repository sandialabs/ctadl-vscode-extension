package j0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g<E> extends a<E> {

    /* renamed from: k  reason: collision with root package name */
    public final E f12635k;

    /* JADX WARN: Multi-variable type inference failed */
    public g(int i10, Object obj) {
        super(i10, 1);
        this.f12635k = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.f12621i++;
            return this.f12635k;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.f12621i--;
            return this.f12635k;
        }
        throw new NoSuchElementException();
    }
}
