package p1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16701b = m0.b.m(0, 0);
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f16702a;

    public /* synthetic */ o(long j2) {
        this.f16702a = j2;
    }

    public static final int a(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static String b(long j2) {
        return "TextRange(" + ((int) (j2 >> 32)) + ", " + a(j2) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.f16702a != ((o) obj).f16702a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f16702a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return b(this.f16702a);
    }
}
