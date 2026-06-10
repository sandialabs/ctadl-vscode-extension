package e0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f10541a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f10541a != ((f) obj).f10541a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10541a;
    }

    public final String toString() {
        return this.f10541a == 0 ? "FabPosition.Center" : "FabPosition.End";
    }
}
