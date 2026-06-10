package g0;

/* loaded from: classes.dex */
public final class v0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f11087a;

    public /* synthetic */ v0(d dVar) {
        this.f11087a = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        if (!v7.g.a(this.f11087a, ((v0) obj).f11087a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11087a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f11087a + ')';
    }
}
