package b2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final long f6350b = a1.b.h(0.0f, 0.0f);
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f6351a;

    public static long a(long j2, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = b(j2);
        }
        if ((i10 & 2) != 0) {
            f11 = c(j2);
        }
        return a1.b.h(f10, f11);
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final long d(long j2, long j10) {
        return a1.b.h(b(j2) - b(j10), c(j2) - c(j10));
    }

    public static final long e(long j2, long j10) {
        return a1.b.h(b(j10) + b(j2), c(j10) + c(j2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.f6351a != ((k) obj).f6351a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6351a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j2 = this.f6351a;
        sb.append(b(j2));
        sb.append(", ");
        sb.append(c(j2));
        sb.append(") px/sec");
        return sb.toString();
    }
}
