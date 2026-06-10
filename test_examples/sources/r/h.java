package r;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public float f16991a;

    /* renamed from: b  reason: collision with root package name */
    public float f16992b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f16993d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16994e = 4;

    public h(float f10, float f11, float f12, float f13) {
        this.f16991a = f10;
        this.f16992b = f11;
        this.c = f12;
        this.f16993d = f13;
    }

    @Override // r.i
    public final float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return 0.0f;
                    }
                    return this.f16993d;
                }
                return this.c;
            }
            return this.f16992b;
        }
        return this.f16991a;
    }

    @Override // r.i
    public final int b() {
        return this.f16994e;
    }

    @Override // r.i
    public final i c() {
        return new h(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // r.i
    public final void d() {
        this.f16991a = 0.0f;
        this.f16992b = 0.0f;
        this.c = 0.0f;
        this.f16993d = 0.0f;
    }

    @Override // r.i
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f16991a = f10;
        } else if (i10 == 1) {
            this.f16992b = f10;
        } else if (i10 == 2) {
            this.c = f10;
        } else if (i10 != 3) {
        } else {
            this.f16993d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f16991a == this.f16991a) {
                if (hVar.f16992b == this.f16992b) {
                    if (hVar.c == this.c) {
                        return (hVar.f16993d > this.f16993d ? 1 : (hVar.f16993d == this.f16993d ? 0 : -1)) == 0;
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
        return Float.floatToIntBits(this.f16993d) + androidx.activity.e.e(this.c, androidx.activity.e.e(this.f16992b, Float.floatToIntBits(this.f16991a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f16991a + ", v2 = " + this.f16992b + ", v3 = " + this.c + ", v4 = " + this.f16993d;
    }
}
