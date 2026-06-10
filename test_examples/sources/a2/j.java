package a2;

/* loaded from: classes.dex */
public final class j {
    public static final j c = new j(a1.b.b0(0), a1.b.b0(0));

    /* renamed from: a  reason: collision with root package name */
    public final long f106a;

    /* renamed from: b  reason: collision with root package name */
    public final long f107b;

    public j(long j2, long j10) {
        this.f106a = j2;
        this.f107b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return b2.i.a(this.f106a, jVar.f106a) && b2.i.a(this.f107b, jVar.f107b);
        }
        return false;
    }

    public final int hashCode() {
        return b2.i.d(this.f107b) + (b2.i.d(this.f106a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) b2.i.e(this.f106a)) + ", restLine=" + ((Object) b2.i.e(this.f107b)) + ')';
    }
}
