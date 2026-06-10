package u0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f17716a = a1.c.m(0.0f, 0.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f17717b = 0;

    public static final boolean a(long j2, long j10) {
        return j2 == j10;
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static String d(long j2) {
        StringBuilder sb;
        float c;
        if (b(j2) == c(j2)) {
            sb = new StringBuilder("CornerRadius.circular(");
            c = b(j2);
        } else {
            sb = new StringBuilder("CornerRadius.elliptical(");
            sb.append(a1.c.O1(b(j2)));
            sb.append(", ");
            c = c(j2);
        }
        sb.append(a1.c.O1(c));
        sb.append(')');
        return sb.toString();
    }
}
