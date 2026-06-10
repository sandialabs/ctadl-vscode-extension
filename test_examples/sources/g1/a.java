package g1;

/* loaded from: classes.dex */
public final class a implements l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (v7.g.a(a.class, obj != null ? obj.getClass() : null)) {
            v7.g.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
            a aVar = (a) obj;
            return v7.g.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        androidx.activity.e.m();
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
