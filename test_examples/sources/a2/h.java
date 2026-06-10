package a2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f103a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f103a != ((h) obj).f103a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f103a;
    }

    public final String toString() {
        int i10 = this.f103a;
        if (i10 == 1) {
            return "Ltr";
        }
        if (i10 == 2) {
            return "Rtl";
        }
        if (i10 == 3) {
            return "Content";
        }
        if (i10 == 4) {
            return "ContentOrLtr";
        }
        return i10 == 5 ? "ContentOrRtl" : "Invalid";
    }
}
