package w0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f18237a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f18238b;
    public static final long c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f18239d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f18240e = 0;

    static {
        long j2 = 3;
        long j10 = j2 << 32;
        f18237a = (0 & 4294967295L) | j10;
        f18238b = (1 & 4294967295L) | j10;
        c = j10 | (2 & 4294967295L);
        f18239d = (j2 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static String b(long j2) {
        return a(j2, f18237a) ? "Rgb" : a(j2, f18238b) ? "Xyz" : a(j2, c) ? "Lab" : a(j2, f18239d) ? "Cmyk" : "Unknown";
    }
}
