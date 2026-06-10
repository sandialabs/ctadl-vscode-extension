package g1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f11192a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this.f11192a != ((w) obj).f11192a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11192a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f11192a + ')';
    }
}
