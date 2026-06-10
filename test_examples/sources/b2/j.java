package b2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f6349a;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.f6349a != ((j) obj).f6349a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6349a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        long j2 = this.f6349a;
        return a(j2, 0L) ? "Unspecified" : a(j2, 4294967296L) ? "Sp" : a(j2, 8589934592L) ? "Em" : "Invalid";
    }
}
