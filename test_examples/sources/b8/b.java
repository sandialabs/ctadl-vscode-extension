package b8;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends n7.k {

    /* renamed from: i  reason: collision with root package name */
    public final int f6491i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6492j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6493k;

    /* renamed from: l  reason: collision with root package name */
    public int f6494l;

    public b(char c, char c10, int i10) {
        this.f6491i = i10;
        this.f6492j = c10;
        boolean z10 = true;
        if (i10 > 0) {
            if (v7.g.h(c, c10) <= 0) {
            }
            z10 = false;
        } else {
            if (v7.g.h(c, c10) >= 0) {
            }
            z10 = false;
        }
        this.f6493k = z10;
        if (!z10) {
            c = c10;
        }
        this.f6494l = c;
    }

    @Override // n7.k
    public final char a() {
        int i10 = this.f6494l;
        if (i10 != this.f6492j) {
            this.f6494l = this.f6491i + i10;
        } else if (!this.f6493k) {
            throw new NoSuchElementException();
        } else {
            this.f6493k = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f6493k;
    }
}
