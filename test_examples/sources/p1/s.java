package p1;

/* loaded from: classes.dex */
public final class s extends q {

    /* renamed from: a  reason: collision with root package name */
    public final String f16706a;

    public s(String str) {
        v7.g.f(str, "verbatim");
        this.f16706a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return v7.g.a(this.f16706a, ((s) obj).f16706a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16706a.hashCode();
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f16706a, ')');
    }
}
