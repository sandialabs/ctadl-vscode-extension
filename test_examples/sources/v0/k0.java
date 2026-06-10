package v0;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f18121a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "Miter";
        }
        if (i10 == 1) {
            return "Round";
        }
        return i10 == 2 ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        if (this.f18121a != ((k0) obj).f18121a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18121a;
    }

    public final String toString() {
        return a(this.f18121a);
    }
}
