package t0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17542a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f17542a != ((a) obj).f17542a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17542a;
    }

    public final String toString() {
        int i10 = this.f17542a;
        if (i10 == 1) {
            return "Next";
        }
        if (i10 == 2) {
            return "Previous";
        }
        if (i10 == 3) {
            return "Left";
        }
        if (i10 == 4) {
            return "Right";
        }
        if (i10 == 5) {
            return "Up";
        }
        if (i10 == 6) {
            return "Down";
        }
        if (i10 == 7) {
            return "Enter";
        }
        return i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }
}
