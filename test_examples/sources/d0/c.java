package d0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f10349a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10350b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10351d;

    public c(float f10, float f11, float f12, float f13) {
        this.f10349a = f10;
        this.f10350b = f11;
        this.c = f12;
        this.f10351d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f10349a == cVar.f10349a) {
                if (this.f10350b == cVar.f10350b) {
                    if (this.c == cVar.c) {
                        return (this.f10351d > cVar.f10351d ? 1 : (this.f10351d == cVar.f10351d ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10351d) + androidx.activity.e.e(this.c, androidx.activity.e.e(this.f10350b, Float.floatToIntBits(this.f10349a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f10349a);
        sb.append(", focusedAlpha=");
        sb.append(this.f10350b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return a4.b.n(sb, this.f10351d, ')');
    }
}
