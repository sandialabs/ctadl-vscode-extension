package u0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f17736b = a1.c.v(0.0f, 0.0f);
    public static final long c = a1.c.v(Float.NaN, Float.NaN);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f17737d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f17738a;

    public /* synthetic */ f(long j2) {
        this.f17738a = j2;
    }

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static final float b(long j2) {
        if (j2 != c) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j2) {
        return Math.min(Math.abs(d(j2)), Math.abs(b(j2)));
    }

    public static final float d(long j2) {
        if (j2 != c) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static String e(long j2) {
        if (j2 != c) {
            return "Size(" + a1.c.O1(d(j2)) + ", " + a1.c.O1(b(j2)) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f17738a != ((f) obj).f17738a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f17738a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return e(this.f17738a);
    }
}
