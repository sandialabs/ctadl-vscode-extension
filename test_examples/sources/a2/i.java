package a2;

/* loaded from: classes.dex */
public final class i {
    public static final i c = new i(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f104a;

    /* renamed from: b  reason: collision with root package name */
    public final float f105b;

    public i() {
        this(1.0f, 0.0f);
    }

    public i(float f10, float f11) {
        this.f104a = f10;
        this.f105b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f104a == iVar.f104a) {
                return (this.f105b > iVar.f105b ? 1 : (this.f105b == iVar.f105b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f105b) + (Float.floatToIntBits(this.f104a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f104a);
        sb.append(", skewX=");
        return a4.b.n(sb, this.f105b, ')');
    }
}
