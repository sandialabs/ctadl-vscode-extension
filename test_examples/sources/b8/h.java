package b8;

import java.util.NoSuchElementException;
import n7.u;

/* loaded from: classes.dex */
public final class h extends u {

    /* renamed from: i  reason: collision with root package name */
    public final int f6500i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6501j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6502k;

    /* renamed from: l  reason: collision with root package name */
    public int f6503l;

    public h(int i10, int i11, int i12) {
        this.f6500i = i12;
        this.f6501j = i11;
        boolean z10 = true;
        if (i12 > 0) {
            if (i10 <= i11) {
            }
            z10 = false;
        } else {
            if (i10 >= i11) {
            }
            z10 = false;
        }
        this.f6502k = z10;
        if (!z10) {
            i10 = i11;
        }
        this.f6503l = i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f6502k;
    }

    @Override // n7.u
    public final int nextInt() {
        int i10 = this.f6503l;
        if (i10 != this.f6501j) {
            this.f6503l = this.f6500i + i10;
        } else if (!this.f6502k) {
            throw new NoSuchElementException();
        } else {
            this.f6502k = false;
        }
        return i10;
    }
}
