package b2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f6346a;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static final int b(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static String c(long j2) {
        return ((int) (j2 >> 32)) + " x " + b(j2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f6346a != ((h) obj).f6346a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6346a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return c(this.f6346a);
    }
}
