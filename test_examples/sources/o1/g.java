package o1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f16190a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f16190a != ((g) obj).f16190a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16190a;
    }

    public final String toString() {
        int i10 = this.f16190a;
        if (i10 == 0) {
            return "Button";
        }
        if (i10 == 1) {
            return "Checkbox";
        }
        if (i10 == 2) {
            return "Switch";
        }
        if (i10 == 3) {
            return "RadioButton";
        }
        if (i10 == 4) {
            return "Tab";
        }
        return i10 == 5 ? "Image" : "Unknown";
    }
}
