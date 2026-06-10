package v7;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f18168i;

    public h(Class<?> cls, String str) {
        g.f(cls, "jClass");
        this.f18168i = cls;
    }

    @Override // v7.b
    public final Class<?> e() {
        return this.f18168i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (g.a(this.f18168i, ((h) obj).f18168i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18168i.hashCode();
    }

    public final String toString() {
        return this.f18168i.toString() + " (Kotlin reflection is not available)";
    }
}
