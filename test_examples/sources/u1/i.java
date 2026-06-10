package u1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f17748a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "Normal";
        }
        return i10 == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f17748a != ((i) obj).f17748a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17748a;
    }

    public final String toString() {
        return a(this.f17748a);
    }
}
