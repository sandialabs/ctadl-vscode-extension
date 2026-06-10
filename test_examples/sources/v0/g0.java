package v0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final g0 f18112d = new g0(a1.c.k(4278190080L), u0.c.f17721b, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final long f18113a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18114b;
    public final float c;

    public g0(long j2, long j10, float f10) {
        this.f18113a = j2;
        this.f18114b = j10;
        this.c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (r.c(this.f18113a, g0Var.f18113a) && u0.c.a(this.f18114b, g0Var.f18114b)) {
                return (this.c > g0Var.c ? 1 : (this.c == g0Var.c ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f18134h;
        int d5 = u0.c.d(this.f18114b);
        return Float.floatToIntBits(this.c) + ((d5 + (m7.j.a(this.f18113a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) r.i(this.f18113a));
        sb.append(", offset=");
        sb.append((Object) u0.c.h(this.f18114b));
        sb.append(", blurRadius=");
        return a4.b.n(sb, this.c, ')');
    }
}
