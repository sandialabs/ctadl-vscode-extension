package p1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f16705a;

    public r(String str) {
        v7.g.f(str, "url");
        this.f16705a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return v7.g.a(this.f16705a, ((r) obj).f16705a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16705a.hashCode();
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("UrlAnnotation(url="), this.f16705a, ')');
    }
}
