package b8;

import java.util.Iterator;

/* loaded from: classes.dex */
public class j implements Iterable<Long>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final long f6505i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6506j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6507k;

    public j(long j2, long j10) {
        this.f6505i = j2;
        if (j2 < j10) {
            long j11 = j10 % 1;
            if (j11 < 0) {
                j11++;
            }
            long j12 = j2 % 1;
            if (j12 < 0) {
                j12++;
            }
            long j13 = (j11 - j12) % 1;
            if (j13 < 0) {
                j13++;
            }
            j10 -= j13;
        }
        this.f6506j = j10;
        this.f6507k = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new k(this.f6505i, this.f6506j, this.f6507k);
    }
}
