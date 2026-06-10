package j0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f<T> extends a<T> {

    /* renamed from: k  reason: collision with root package name */
    public final PersistentVectorBuilder<T> f12632k;

    /* renamed from: l  reason: collision with root package name */
    public int f12633l;

    /* renamed from: m  reason: collision with root package name */
    public h<? extends T> f12634m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PersistentVectorBuilder<T> persistentVectorBuilder, int i10) {
        super(i10, persistentVectorBuilder.c());
        v7.g.f(persistentVectorBuilder, "builder");
        this.f12632k = persistentVectorBuilder;
        this.f12633l = persistentVectorBuilder.t();
        this.n = -1;
        b();
    }

    public final void a() {
        if (this.f12633l != this.f12632k.t()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j0.a, java.util.ListIterator
    public final void add(T t10) {
        a();
        int i10 = this.f12621i;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
        persistentVectorBuilder.add(i10, t10);
        this.f12621i++;
        this.f12622j = persistentVectorBuilder.c();
        this.f12633l = persistentVectorBuilder.t();
        this.n = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
        Object[] objArr = persistentVectorBuilder.n;
        if (objArr == null) {
            this.f12634m = null;
            return;
        }
        int c = (persistentVectorBuilder.c() - 1) & (-32);
        int i10 = this.f12621i;
        if (i10 > c) {
            i10 = c;
        }
        int i11 = (persistentVectorBuilder.f2881l / 5) + 1;
        h<? extends T> hVar = this.f12634m;
        if (hVar == null) {
            this.f12634m = new h<>(objArr, i10, c, i11);
            return;
        }
        v7.g.c(hVar);
        hVar.f12621i = i10;
        hVar.f12622j = c;
        hVar.f12636k = i11;
        if (hVar.f12637l.length < i11) {
            hVar.f12637l = new Object[i11];
        }
        ?? r62 = 0;
        hVar.f12637l[0] = objArr;
        if (i10 == c) {
            r62 = 1;
        }
        hVar.f12638m = r62;
        hVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        a();
        if (hasNext()) {
            int i10 = this.f12621i;
            this.n = i10;
            h<? extends T> hVar = this.f12634m;
            PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
            if (hVar == null) {
                Object[] objArr = persistentVectorBuilder.f2883o;
                this.f12621i = i10 + 1;
                return (T) objArr[i10];
            } else if (hVar.hasNext()) {
                this.f12621i++;
                return hVar.next();
            } else {
                Object[] objArr2 = persistentVectorBuilder.f2883o;
                int i11 = this.f12621i;
                this.f12621i = i11 + 1;
                return (T) objArr2[i11 - hVar.f12622j];
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (hasPrevious()) {
            int i10 = this.f12621i;
            int i11 = i10 - 1;
            this.n = i11;
            h<? extends T> hVar = this.f12634m;
            PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
            if (hVar == null) {
                Object[] objArr = persistentVectorBuilder.f2883o;
                this.f12621i = i11;
                return (T) objArr[i11];
            }
            int i12 = hVar.f12622j;
            if (i10 > i12) {
                Object[] objArr2 = persistentVectorBuilder.f2883o;
                this.f12621i = i11;
                return (T) objArr2[i11 - i12];
            }
            this.f12621i = i11;
            return hVar.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // j0.a, java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        int i10 = this.n;
        if (i10 != -1) {
            PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
            persistentVectorBuilder.d(i10);
            int i11 = this.n;
            if (i11 < this.f12621i) {
                this.f12621i = i11;
            }
            this.f12622j = persistentVectorBuilder.c();
            this.f12633l = persistentVectorBuilder.t();
            this.n = -1;
            b();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // j0.a, java.util.ListIterator
    public final void set(T t10) {
        a();
        int i10 = this.n;
        if (i10 != -1) {
            PersistentVectorBuilder<T> persistentVectorBuilder = this.f12632k;
            persistentVectorBuilder.set(i10, t10);
            this.f12633l = persistentVectorBuilder.t();
            b();
            return;
        }
        throw new IllegalStateException();
    }
}
