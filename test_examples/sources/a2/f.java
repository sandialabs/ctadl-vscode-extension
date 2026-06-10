package a2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f99a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f99a != ((f) obj).f99a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f99a;
    }

    public final String toString() {
        int i10 = this.f99a;
        if (i10 == 1) {
            return "Left";
        }
        if (i10 == 2) {
            return "Right";
        }
        if (i10 == 3) {
            return "Center";
        }
        if (i10 == 4) {
            return "Justify";
        }
        if (i10 == 5) {
            return "Start";
        }
        return i10 == 6 ? "End" : "Invalid";
    }
}
