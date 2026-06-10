package v0;

/* loaded from: classes.dex */
public final class i0 extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f18118a;

    public i0(long j2) {
        this.f18118a = j2;
    }

    @Override // v0.m
    public final void a(float f10, long j2, f fVar) {
        boolean z10;
        fVar.d(1.0f);
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f18118a;
        if (!z10) {
            j10 = r.b(j10, r.d(j10) * f10);
        }
        fVar.f(j10);
        if (fVar.c != null) {
            fVar.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return r.c(this.f18118a, ((i0) obj).f18118a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f18134h;
        return m7.j.a(this.f18118a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f18118a)) + ')';
    }
}
