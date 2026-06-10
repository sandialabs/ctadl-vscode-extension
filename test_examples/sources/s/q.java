package s;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f17224a;

    /* renamed from: b  reason: collision with root package name */
    public final v.o f17225b;

    public q() {
        long k3 = a1.c.k(4284900966L);
        float f10 = 0;
        v.p pVar = new v.p(f10, f10, f10, f10);
        this.f17224a = k3;
        this.f17225b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (v7.g.a(q.class, obj != null ? obj.getClass() : null)) {
            if (obj != null) {
                q qVar = (q) obj;
                return v0.r.c(this.f17224a, qVar.f17224a) && v7.g.a(this.f17225b, qVar.f17225b);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        }
        return false;
    }

    public final int hashCode() {
        int i10 = v0.r.f18134h;
        return this.f17225b.hashCode() + (m7.j.a(this.f17224a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) v0.r.i(this.f17224a)) + ", drawPadding=" + this.f17225b + ')';
    }
}
