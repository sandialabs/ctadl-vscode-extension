package u1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f17749a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "All";
        }
        if (i10 == 2) {
            return "Weight";
        }
        return i10 == 3 ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.f17749a != ((j) obj).f17749a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17749a;
    }

    public final String toString() {
        return a(this.f17749a);
    }
}
