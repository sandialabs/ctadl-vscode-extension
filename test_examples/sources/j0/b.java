package j0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b<T> extends a<T> {

    /* renamed from: k  reason: collision with root package name */
    public final T[] f12623k;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        this.f12623k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            int i10 = this.f12621i;
            this.f12621i = i10 + 1;
            return this.f12623k[i10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            int i10 = this.f12621i - 1;
            this.f12621i = i10;
            return this.f12623k[i10];
        }
        throw new NoSuchElementException();
    }
}
