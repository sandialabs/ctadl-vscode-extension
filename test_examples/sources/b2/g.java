package b2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final long f6344b = ma.i.g(0, 0);
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f6345a;

    public static final int a(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static String b(long j2) {
        return "(" + ((int) (j2 >> 32)) + ", " + a(j2) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f6345a != ((g) obj).f6345a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6345a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return b(this.f6345a);
    }
}
