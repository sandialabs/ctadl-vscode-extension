package j0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h<E> extends a<E> {

    /* renamed from: k  reason: collision with root package name */
    public int f12636k;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f12637l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12638m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public h(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        v7.g.f(objArr, "root");
        this.f12636k = i12;
        Object[] objArr2 = new Object[i12];
        this.f12637l = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f12638m = r52;
        objArr2[0] = objArr;
        b(i10 - r52, 1);
    }

    public final E a() {
        Object obj = this.f12637l[this.f12636k - 1];
        v7.g.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[this.f12621i & 31];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f12636k - i11) * 5;
        while (i11 < this.f12636k) {
            Object[] objArr = this.f12637l;
            Object[] objArr2 = objArr[i11 - 1];
            v7.g.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = objArr2[(i10 >> i12) & 31];
            i12 -= 5;
            i11++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final E next() {
        int i10;
        if (hasNext()) {
            E a10 = a();
            int i11 = this.f12621i + 1;
            this.f12621i = i11;
            if (i11 == this.f12622j) {
                this.f12638m = true;
                return a10;
            }
            int i12 = 0;
            while (true) {
                i10 = this.f12621i;
                if (((i10 >> i12) & 31) != 0) {
                    break;
                }
                i12 += 5;
            }
            if (i12 > 0) {
                b(i10, ((this.f12636k - 1) - (i12 / 5)) + 1);
            }
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        int i10;
        if (hasPrevious()) {
            this.f12621i--;
            int i11 = 0;
            if (this.f12638m) {
                this.f12638m = false;
            } else {
                while (true) {
                    i10 = this.f12621i;
                    if (((i10 >> i11) & 31) != 31) {
                        break;
                    }
                    i11 += 5;
                }
                if (i11 > 0) {
                    b(i10, ((this.f12636k - 1) - (i11 / 5)) + 1);
                }
            }
            return a();
        }
        throw new NoSuchElementException();
    }
}
