package e0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f10546a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10547b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10548d;

    public i(long j2, long j10, long j11, long j12) {
        this.f10546a = j2;
        this.f10547b = j10;
        this.c = j11;
        this.f10548d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            return v0.r.c(this.f10546a, iVar.f10546a) && v0.r.c(this.f10547b, iVar.f10547b) && v0.r.c(this.c, iVar.c) && v0.r.c(this.f10548d, iVar.f10548d);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = v0.r.f18134h;
        return m7.j.a(this.f10548d) + androidx.activity.e.f(this.c, androidx.activity.e.f(this.f10547b, m7.j.a(this.f10546a) * 31, 31), 31);
    }
}
