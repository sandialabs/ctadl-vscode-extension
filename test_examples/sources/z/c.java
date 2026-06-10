package z;

import v7.g;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f18972a;

    public c(float f10) {
        this.f18972a = f10;
    }

    @Override // z.b
    public final float a(long j2, b2.b bVar) {
        g.f(bVar, "density");
        return bVar.H(this.f18972a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && b2.d.a(this.f18972a, ((c) obj).f18972a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18972a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f18972a + ".dp)";
    }
}
