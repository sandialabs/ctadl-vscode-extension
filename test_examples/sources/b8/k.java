package b8;

import java.util.NoSuchElementException;
import n7.v;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: i  reason: collision with root package name */
    public final long f6508i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6509j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6510k;

    /* renamed from: l  reason: collision with root package name */
    public long f6511l;

    public k(long j2, long j10, long j11) {
        this.f6508i = j11;
        this.f6509j = j10;
        boolean z10 = true;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        int i11 = (j2 > j10 ? 1 : (j2 == j10 ? 0 : -1));
        if (i10 > 0) {
            if (i11 <= 0) {
            }
            z10 = false;
        } else {
            if (i11 >= 0) {
            }
            z10 = false;
        }
        this.f6510k = z10;
        if (!z10) {
            j2 = j10;
        }
        this.f6511l = j2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f6510k;
    }

    @Override // n7.v
    public final long nextLong() {
        long j2 = this.f6511l;
        if (j2 != this.f6509j) {
            this.f6511l = this.f6508i + j2;
        } else if (!this.f6510k) {
            throw new NoSuchElementException();
        } else {
            this.f6510k = false;
        }
        return j2;
    }
}
