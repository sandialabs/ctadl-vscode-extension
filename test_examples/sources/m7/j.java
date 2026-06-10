package m7;

/* loaded from: classes.dex */
public final class j implements Comparable<j> {

    /* renamed from: i  reason: collision with root package name */
    public final long f16002i;

    public /* synthetic */ j(long j2) {
        this.f16002i = j2;
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        int i10 = ((this.f16002i ^ Long.MIN_VALUE) > (jVar.f16002i ^ Long.MIN_VALUE) ? 1 : ((this.f16002i ^ Long.MIN_VALUE) == (jVar.f16002i ^ Long.MIN_VALUE) ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.f16002i != ((j) obj).f16002i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a(this.f16002i);
    }

    public final String toString() {
        long j2 = this.f16002i;
        if (j2 >= 0) {
            a1.b.v(10);
            String l2 = Long.toString(j2, 10);
            v7.g.e(l2, "toString(this, checkRadix(radix))");
            return l2;
        }
        long j10 = 10;
        long j11 = ((j2 >>> 1) / j10) << 1;
        long j12 = j2 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        a1.b.v(10);
        String l4 = Long.toString(j11, 10);
        v7.g.e(l4, "toString(this, checkRadix(radix))");
        a1.b.v(10);
        String l7 = Long.toString(j12, 10);
        v7.g.e(l7, "toString(this, checkRadix(radix))");
        return l4.concat(l7);
    }
}
