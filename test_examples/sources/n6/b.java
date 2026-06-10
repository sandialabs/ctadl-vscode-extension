package n6;

import androidx.activity.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f16106a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final float f16107b = 8;
    public final float c = 16;

    /* renamed from: d  reason: collision with root package name */
    public final float f16108d = 24;

    /* renamed from: e  reason: collision with root package name */
    public final float f16109e = 32;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return b2.d.a(this.f16106a, bVar.f16106a) && b2.d.a(this.f16107b, bVar.f16107b) && b2.d.a(this.c, bVar.c) && b2.d.a(this.f16108d, bVar.f16108d) && b2.d.a(this.f16109e, bVar.f16109e);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16109e) + e.e(this.f16108d, e.e(this.c, e.e(this.f16107b, Float.floatToIntBits(this.f16106a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String b5 = b2.d.b(this.f16106a);
        String b10 = b2.d.b(this.f16107b);
        String b11 = b2.d.b(this.c);
        String b12 = b2.d.b(this.f16108d);
        String b13 = b2.d.b(this.f16109e);
        StringBuilder sb = new StringBuilder("Dimensions(extraSmall=");
        sb.append(b5);
        sb.append(", small=");
        sb.append(b10);
        sb.append(", medium=");
        sb.append(b11);
        sb.append(", large=");
        sb.append(b12);
        sb.append(", extraLarge=");
        return e.k(sb, b13, ")");
    }
}
