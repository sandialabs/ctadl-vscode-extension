package j0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e<T> extends a<T> {

    /* renamed from: k  reason: collision with root package name */
    public final T[] f12630k;

    /* renamed from: l  reason: collision with root package name */
    public final h<T> f12631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        v7.g.f(objArr, "root");
        this.f12630k = tArr;
        int i13 = (i11 - 1) & (-32);
        this.f12631l = new h<>(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            h<T> hVar = this.f12631l;
            if (hVar.hasNext()) {
                this.f12621i++;
                return hVar.next();
            }
            int i10 = this.f12621i;
            this.f12621i = i10 + 1;
            return this.f12630k[i10 - hVar.f12622j];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            int i10 = this.f12621i;
            h<T> hVar = this.f12631l;
            int i11 = hVar.f12622j;
            if (i10 > i11) {
                int i12 = i10 - 1;
                this.f12621i = i12;
                return this.f12630k[i12 - i11];
            }
            this.f12621i = i10 - 1;
            return hVar.previous();
        }
        throw new NoSuchElementException();
    }
}
