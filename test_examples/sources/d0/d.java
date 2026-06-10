package d0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10352a = 10;

    public static final float a(b2.b bVar, boolean z10, long j2) {
        v7.g.f(bVar, "$this$getRippleEndRadius");
        long s10 = a1.c.s(u0.f.d(j2), u0.f.b(j2));
        float sqrt = ((float) Math.sqrt((u0.c.c(s10) * u0.c.c(s10)) + (u0.c.b(s10) * u0.c.b(s10)))) / 2.0f;
        if (z10) {
            return sqrt + bVar.H(f10352a);
        }
        return sqrt;
    }
}
