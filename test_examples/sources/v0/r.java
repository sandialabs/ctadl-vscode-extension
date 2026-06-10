package v0;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final long f18129b = a1.c.k(4278190080L);
    public static final long c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f18130d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f18131e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f18132f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f18133g;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f18134h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f18135a;

    static {
        a1.c.k(4282664004L);
        a1.c.k(4287137928L);
        a1.c.k(4291611852L);
        c = a1.c.k(4294967295L);
        f18130d = a1.c.k(4294901760L);
        a1.c.k(4278255360L);
        f18131e = a1.c.k(4278190335L);
        a1.c.k(4294967040L);
        a1.c.k(4278255615L);
        a1.c.k(4294902015L);
        f18132f = 0 << 32;
        f18133g = a1.c.j(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f3112s);
    }

    public /* synthetic */ r(long j2) {
        this.f18135a = j2;
    }

    public static final long a(long j2, w0.c cVar) {
        v7.g.f(cVar, "colorSpace");
        if (v7.g.a(cVar, f(j2))) {
            return j2;
        }
        androidx.compose.ui.graphics.colorspace.a j10 = p.j(f(j2), cVar, 2);
        float[] v02 = a1.c.v0(j2);
        j10.a(v02);
        return a1.c.j(v02[0], v02[1], v02[2], v02[3], cVar);
    }

    public static long b(long j2, float f10) {
        return a1.c.j(h(j2), g(j2), e(j2), f10, f(j2));
    }

    public static final boolean c(long j2, long j10) {
        return j2 == j10;
    }

    public static final float d(long j2) {
        float S1;
        float f10;
        if ((63 & j2) == 0) {
            S1 = (float) a1.c.S1((j2 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            S1 = (float) a1.c.S1((j2 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return S1 / f10;
    }

    public static final float e(long j2) {
        return (63 & j2) == 0 ? ((float) a1.c.S1((j2 >>> 32) & 255)) / 255.0f : t.b((short) ((j2 >>> 16) & 65535));
    }

    public static final w0.c f(long j2) {
        float[] fArr = ColorSpaces.f3096a;
        return ColorSpaces.f3114u[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        return (63 & j2) == 0 ? ((float) a1.c.S1((j2 >>> 40) & 255)) / 255.0f : t.b((short) ((j2 >>> 32) & 65535));
    }

    public static final float h(long j2) {
        int i10 = ((63 & j2) > 0L ? 1 : ((63 & j2) == 0L ? 0 : -1));
        long j10 = j2 >>> 48;
        return i10 == 0 ? ((float) a1.c.S1(j10 & 255)) / 255.0f : t.b((short) (j10 & 65535));
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return androidx.activity.e.j(sb, f(j2).f18241a, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this.f18135a != ((r) obj).f18135a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return m7.j.a(this.f18135a);
    }

    public final String toString() {
        return i(this.f18135a);
    }
}
