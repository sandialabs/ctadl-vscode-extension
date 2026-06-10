package e0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f10572a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10573b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10574d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10575e;

    public q(long j2, long j10, long j11, long j12, long j13) {
        this.f10572a = j2;
        this.f10573b = j10;
        this.c = j11;
        this.f10574d = j12;
        this.f10575e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof q)) {
            q qVar = (q) obj;
            return v0.r.c(this.f10572a, qVar.f10572a) && v0.r.c(this.f10573b, qVar.f10573b) && v0.r.c(this.c, qVar.c) && v0.r.c(this.f10574d, qVar.f10574d) && v0.r.c(this.f10575e, qVar.f10575e);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = v0.r.f18134h;
        return m7.j.a(this.f10575e) + androidx.activity.e.f(this.f10574d, androidx.activity.e.f(this.c, androidx.activity.e.f(this.f10573b, m7.j.a(this.f10572a) * 31, 31), 31), 31);
    }
}
