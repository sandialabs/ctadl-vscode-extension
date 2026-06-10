package y0;

import b2.g;
import b2.h;
import v0.s;
import v0.w;
import x0.e;
import x0.f;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f  reason: collision with root package name */
    public final w f18775f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18776g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18777h;

    /* renamed from: i  reason: collision with root package name */
    public final int f18778i;

    /* renamed from: j  reason: collision with root package name */
    public final long f18779j;

    /* renamed from: k  reason: collision with root package name */
    public float f18780k;

    /* renamed from: l  reason: collision with root package name */
    public s f18781l;

    public a(w wVar) {
        int i10;
        long j2 = g.f6344b;
        long f10 = v8.b.f(wVar.b(), wVar.a());
        this.f18775f = wVar;
        this.f18776g = j2;
        this.f18777h = f10;
        boolean z10 = true;
        this.f18778i = 1;
        if (((int) (j2 >> 32)) < 0 || g.a(j2) < 0 || (i10 = (int) (f10 >> 32)) < 0 || h.b(f10) < 0 || i10 > wVar.b() || h.b(f10) > wVar.a()) {
            z10 = false;
        }
        if (z10) {
            this.f18779j = f10;
            this.f18780k = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // y0.b
    public final boolean a(float f10) {
        this.f18780k = f10;
        return true;
    }

    @Override // y0.b
    public final boolean b(s sVar) {
        this.f18781l = sVar;
        return true;
    }

    @Override // y0.b
    public final long c() {
        return v8.b.M(this.f18779j);
    }

    @Override // y0.b
    public final void d(f fVar) {
        v7.g.f(fVar, "<this>");
        e.b(fVar, this.f18775f, this.f18776g, this.f18777h, v8.b.f(m0.b.g1(u0.f.d(fVar.a())), m0.b.g1(u0.f.b(fVar.a()))), this.f18780k, this.f18781l, this.f18778i, 328);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!v7.g.a(this.f18775f, aVar.f18775f)) {
            return false;
        }
        int i10 = g.c;
        if (this.f18776g == aVar.f18776g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !h.a(this.f18777h, aVar.f18777h)) {
            return false;
        }
        if (this.f18778i == aVar.f18778i) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = g.c;
        long j2 = this.f18776g;
        int i11 = (int) (j2 ^ (j2 >>> 32));
        long j10 = this.f18777h;
        return ((((int) (j10 ^ (j10 >>> 32))) + ((i11 + (this.f18775f.hashCode() * 31)) * 31)) * 31) + this.f18778i;
    }

    public final String toString() {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f18775f);
        sb.append(", srcOffset=");
        sb.append((Object) g.b(this.f18776g));
        sb.append(", srcSize=");
        sb.append((Object) h.c(this.f18777h));
        sb.append(", filterQuality=");
        boolean z13 = false;
        int i10 = this.f18778i;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "None";
        } else {
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str = "Low";
            } else {
                if (i10 == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    str = "Medium";
                } else {
                    if (i10 == 3) {
                        z13 = true;
                    }
                    if (z13) {
                        str = "High";
                    } else {
                        str = "Unknown";
                    }
                }
            }
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
