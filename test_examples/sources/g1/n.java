package g1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f11161a;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static String b(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f11161a != ((n) obj).f11161a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f11161a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return b(this.f11161a);
    }
}
