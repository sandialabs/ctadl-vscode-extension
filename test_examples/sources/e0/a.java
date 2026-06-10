package e0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f10507a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10508b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10509d;

    public a(long j2, long j10, long j11, long j12) {
        this.f10507a = j2;
        this.f10508b = j10;
        this.c = j11;
        this.f10509d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            return v0.r.c(this.f10507a, aVar.f10507a) && v0.r.c(this.f10508b, aVar.f10508b) && v0.r.c(this.c, aVar.c) && v0.r.c(this.f10509d, aVar.f10509d);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = v0.r.f18134h;
        return m7.j.a(this.f10509d) + androidx.activity.e.f(this.c, androidx.activity.e.f(this.f10508b, m7.j.a(this.f10507a) * 31, 31), 31);
    }
}
