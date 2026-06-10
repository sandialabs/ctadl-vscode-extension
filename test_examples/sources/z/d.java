package z;

import v7.g;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f18973a;

    public d(float f10) {
        this.f18973a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // z.b
    public final float a(long j2, b2.b bVar) {
        g.f(bVar, "density");
        return (this.f18973a / 100.0f) * u0.f.c(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g.a(Float.valueOf(this.f18973a), Float.valueOf(((d) obj).f18973a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18973a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f18973a + "%)";
    }
}
