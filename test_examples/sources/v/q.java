package v;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public float f18075a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18076b;
    public f c;

    public q() {
        this(0);
    }

    public q(int i10) {
        this.f18075a = 0.0f;
        this.f18076b = true;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return v7.g.a(Float.valueOf(this.f18075a), Float.valueOf(qVar.f18075a)) && this.f18076b == qVar.f18076b && v7.g.a(this.c, qVar.c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f18075a) * 31;
        boolean z10 = this.f18076b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (floatToIntBits + i10) * 31;
        f fVar = this.c;
        return i11 + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f18075a + ", fill=" + this.f18076b + ", crossAxisAlignment=" + this.c + ')';
    }
}
