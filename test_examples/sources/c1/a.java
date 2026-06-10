package c1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6514a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f6514a != ((a) obj).f6514a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6514a;
    }

    public final String toString() {
        int i10 = this.f6514a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
