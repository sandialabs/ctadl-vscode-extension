package b8;

/* loaded from: classes.dex */
public final class l extends j implements f<Long> {
    static {
        new l(1L, 0L);
    }

    public l(long j2, long j10) {
        super(j2, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r6 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof l)) {
            return false;
        }
        long j2 = this.f6505i;
        long j10 = this.f6506j;
        if (j2 > j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            l lVar = (l) obj;
            if (lVar.f6505i > lVar.f6506j) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        l lVar2 = (l) obj;
        if (j2 != lVar2.f6505i || j10 != lVar2.f6506j) {
            return false;
        }
        return true;
    }

    public final boolean g(long j2) {
        return this.f6505i <= j2 && j2 <= this.f6506j;
    }

    public final int hashCode() {
        long j2 = this.f6505i;
        long j10 = this.f6506j;
        if (j2 > j10) {
            return -1;
        }
        return (int) ((31 * (j2 ^ (j2 >>> 32))) + ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return this.f6505i + ".." + this.f6506j;
    }
}
