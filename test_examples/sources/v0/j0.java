package v0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f18119a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "Butt";
        }
        if (i10 == 1) {
            return "Round";
        }
        return i10 == 2 ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        if (this.f18119a != ((j0) obj).f18119a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18119a;
    }

    public final String toString() {
        return a(this.f18119a);
    }
}
