package g1;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final int f11138a = 1008;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (v7.g.a(b.class, obj != null ? obj.getClass() : null)) {
            v7.g.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
            return this.f11138a == ((b) obj).f11138a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11138a;
    }

    public final String toString() {
        return androidx.activity.e.h(new StringBuilder("AndroidPointerIcon(type="), this.f11138a, ')');
    }
}
