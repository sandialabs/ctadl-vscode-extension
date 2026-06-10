package u0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final long f17721b = a1.c.s(0.0f, 0.0f);
    public static final long c = a1.c.s(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d  reason: collision with root package name */
    public static final long f17722d = a1.c.s(Float.NaN, Float.NaN);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f17723e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f17724a;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static final float b(long j2) {
        if (j2 != f17722d) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float c(long j2) {
        if (j2 != f17722d) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int d(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static final long e(long j2, long j10) {
        return a1.c.s(b(j2) - b(j10), c(j2) - c(j10));
    }

    public static final long f(long j2, long j10) {
        return a1.c.s(b(j10) + b(j2), c(j10) + c(j2));
    }

    public static final long g(float f10, long j2) {
        return a1.c.s(b(j2) * f10, c(j2) * f10);
    }

    public static String h(long j2) {
        boolean z10;
        if (j2 != f17722d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "Offset(" + a1.c.O1(b(j2)) + ", " + a1.c.O1(c(j2)) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f17724a != ((c) obj).f17724a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return d(this.f17724a);
    }

    public final String toString() {
        return h(this.f17724a);
    }
}
