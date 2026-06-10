package u0;

import v7.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final float f17729a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17730b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f17731d;

    /* renamed from: e  reason: collision with root package name */
    public final long f17732e;

    /* renamed from: f  reason: collision with root package name */
    public final long f17733f;

    /* renamed from: g  reason: collision with root package name */
    public final long f17734g;

    /* renamed from: h  reason: collision with root package name */
    public final long f17735h;

    static {
        int i10 = a.f17717b;
        a1.c.u(0.0f, 0.0f, 0.0f, 0.0f, a.f17716a);
    }

    public e(float f10, float f11, float f12, float f13, long j2, long j10, long j11, long j12) {
        this.f17729a = f10;
        this.f17730b = f11;
        this.c = f12;
        this.f17731d = f13;
        this.f17732e = j2;
        this.f17733f = j10;
        this.f17734g = j11;
        this.f17735h = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return g.a(Float.valueOf(this.f17729a), Float.valueOf(eVar.f17729a)) && g.a(Float.valueOf(this.f17730b), Float.valueOf(eVar.f17730b)) && g.a(Float.valueOf(this.c), Float.valueOf(eVar.c)) && g.a(Float.valueOf(this.f17731d), Float.valueOf(eVar.f17731d)) && a.a(this.f17732e, eVar.f17732e) && a.a(this.f17733f, eVar.f17733f) && a.a(this.f17734g, eVar.f17734g) && a.a(this.f17735h, eVar.f17735h);
        }
        return false;
    }

    public final int hashCode() {
        int e10 = androidx.activity.e.e(this.f17731d, androidx.activity.e.e(this.c, androidx.activity.e.e(this.f17730b, Float.floatToIntBits(this.f17729a) * 31, 31), 31), 31);
        long j2 = this.f17732e;
        long j10 = this.f17733f;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f17734g;
        int i11 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f17735h;
        return ((int) (j12 ^ (j12 >>> 32))) + ((i11 + ((i10 + ((((int) (j2 ^ (j2 >>> 32))) + e10) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p10;
        boolean z10;
        float c;
        String str = a1.c.O1(this.f17729a) + ", " + a1.c.O1(this.f17730b) + ", " + a1.c.O1(this.c) + ", " + a1.c.O1(this.f17731d);
        long j2 = this.f17732e;
        long j10 = this.f17733f;
        boolean a10 = a.a(j2, j10);
        long j11 = this.f17734g;
        long j12 = this.f17735h;
        if (a10 && a.a(j10, j11) && a.a(j11, j12)) {
            if (a.b(j2) == a.c(j2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p10 = a4.b.p("RoundRect(rect=", str, ", radius=");
                c = a.b(j2);
            } else {
                p10 = a4.b.p("RoundRect(rect=", str, ", x=");
                p10.append(a1.c.O1(a.b(j2)));
                p10.append(", y=");
                c = a.c(j2);
            }
            p10.append(a1.c.O1(c));
        } else {
            p10 = a4.b.p("RoundRect(rect=", str, ", topLeft=");
            p10.append((Object) a.d(j2));
            p10.append(", topRight=");
            p10.append((Object) a.d(j10));
            p10.append(", bottomRight=");
            p10.append((Object) a.d(j11));
            p10.append(", bottomLeft=");
            p10.append((Object) a.d(j12));
        }
        p10.append(')');
        return p10.toString();
    }
}
