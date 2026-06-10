package o1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f16186a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f16186a != ((e) obj).f16186a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16186a;
    }

    public final String toString() {
        int i10 = this.f16186a;
        if (i10 == 0) {
            return "Polite";
        }
        return i10 == 1 ? "Assertive" : "Unknown";
    }
}
