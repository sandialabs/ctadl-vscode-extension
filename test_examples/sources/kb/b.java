package kb;

import v7.g;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12956a = "_";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (g.a(this.f12956a, ((b) obj).f12956a)) {
            return true;
        }
        return false;
    }

    @Override // kb.a
    public final String getValue() {
        return this.f12956a;
    }

    public final int hashCode() {
        return this.f12956a.hashCode();
    }

    public final String toString() {
        return this.f12956a;
    }
}
