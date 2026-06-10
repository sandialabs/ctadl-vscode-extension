package v0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f18084a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        if (this.f18084a != ((a0) obj).f18084a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18084a;
    }

    public final String toString() {
        int i10 = this.f18084a;
        if (i10 == 0) {
            return "NonZero";
        }
        return i10 == 1 ? "EvenOdd" : "Unknown";
    }
}
