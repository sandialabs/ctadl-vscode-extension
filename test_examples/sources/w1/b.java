package w1;

import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f18256a;

    public b(d dVar) {
        g.f(dVar, "platformLocale");
        this.f18256a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return g.a(this.f18256a.a(), ((b) obj).f18256a.a());
    }

    public final int hashCode() {
        return this.f18256a.a().hashCode();
    }

    public final String toString() {
        return this.f18256a.a();
    }
}
