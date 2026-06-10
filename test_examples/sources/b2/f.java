package b2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final long f6342a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f6343b = v8.b.e(Float.NaN, Float.NaN);
    public static final /* synthetic */ int c = 0;

    static {
        float f10 = 0;
        f6342a = v8.b.e(f10, f10);
    }

    public static final float a(long j2) {
        if (j2 != f6343b) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j2) {
        if (j2 != f6343b) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
}
