package u0;

import v7.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f17725e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f17726a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17727b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f17728d;

    public d(float f10, float f11, float f12, float f13) {
        this.f17726a = f10;
        this.f17727b = f11;
        this.c = f12;
        this.f17728d = f13;
    }

    public final long a() {
        float f10 = this.c;
        float f11 = this.f17726a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f17728d;
        float f14 = this.f17727b;
        return a1.c.s(f12, ((f13 - f14) / 2.0f) + f14);
    }

    public final boolean b(d dVar) {
        g.f(dVar, "other");
        return this.c > dVar.f17726a && dVar.c > this.f17726a && this.f17728d > dVar.f17727b && dVar.f17728d > this.f17727b;
    }

    public final d c(float f10, float f11) {
        return new d(this.f17726a + f10, this.f17727b + f11, this.c + f10, this.f17728d + f11);
    }

    public final d d(long j2) {
        return new d(c.b(j2) + this.f17726a, c.c(j2) + this.f17727b, c.b(j2) + this.c, c.c(j2) + this.f17728d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return g.a(Float.valueOf(this.f17726a), Float.valueOf(dVar.f17726a)) && g.a(Float.valueOf(this.f17727b), Float.valueOf(dVar.f17727b)) && g.a(Float.valueOf(this.c), Float.valueOf(dVar.c)) && g.a(Float.valueOf(this.f17728d), Float.valueOf(dVar.f17728d));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17728d) + androidx.activity.e.e(this.c, androidx.activity.e.e(this.f17727b, Float.floatToIntBits(this.f17726a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + a1.c.O1(this.f17726a) + ", " + a1.c.O1(this.f17727b) + ", " + a1.c.O1(this.c) + ", " + a1.c.O1(this.f17728d) + ')';
    }
}
