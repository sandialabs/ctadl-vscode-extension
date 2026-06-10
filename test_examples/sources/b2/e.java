package b2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final long f6340b;
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f6341a;

    static {
        float f10 = 0;
        v8.b.d(f10, f10);
        f6340b = v8.b.d(Float.NaN, Float.NaN);
    }

    public static final float a(long j2) {
        if (j2 != f6340b) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j2) {
        if (j2 != f6340b) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f6341a != ((e) obj).f6341a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6341a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        long j2 = f6340b;
        long j10 = this.f6341a;
        if (j10 != j2) {
            return "(" + ((Object) d.b(a(j10))) + ", " + ((Object) d.b(b(j10))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
