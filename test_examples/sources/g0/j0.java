package g0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11058a;

    public j0(String str) {
        this.f11058a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && v7.g.a(this.f11058a, ((j0) obj).f11058a);
    }

    public final int hashCode() {
        return this.f11058a.hashCode();
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("OpaqueKey(key="), this.f11058a, ')');
    }
}
