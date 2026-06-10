package b2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final j[] f6347b = {new j(0), new j(4294967296L), new j(8589934592L)};
    public static final long c = a1.b.u0(Float.NaN, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f6348a;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static final long b(long j2) {
        return f6347b[(int) ((j2 & 1095216660480L) >>> 32)].f6349a;
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int d(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static String e(long j2) {
        StringBuilder sb;
        String str;
        long b5 = b(j2);
        if (j.a(b5, 0L)) {
            return "Unspecified";
        }
        if (j.a(b5, 4294967296L)) {
            sb = new StringBuilder();
            sb.append(c(j2));
            str = ".sp";
        } else if (!j.a(b5, 8589934592L)) {
            return "Invalid";
        } else {
            sb = new StringBuilder();
            sb.append(c(j2));
            str = ".em";
        }
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f6348a != ((i) obj).f6348a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return d(this.f6348a);
    }

    public final String toString() {
        return e(this.f6348a);
    }
}
