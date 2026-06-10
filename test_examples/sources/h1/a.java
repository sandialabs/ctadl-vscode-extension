package h1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f11341a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11342b;

    public a(long j2, long j10) {
        this.f11341a = j2;
        this.f11342b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return u0.c.a(this.f11341a, aVar.f11341a) && this.f11342b == aVar.f11342b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f11342b;
        return (u0.c.d(this.f11341a) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PointAtTime(point=" + ((Object) u0.c.h(this.f11341a)) + ", time=" + this.f11342b + ')';
    }
}
