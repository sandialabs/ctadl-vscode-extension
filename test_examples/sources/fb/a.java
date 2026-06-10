package fb;

import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l<T, n> f11025a;

    public a() {
        this(null);
    }

    public a(Object obj) {
        this.f11025a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && g.a(this.f11025a, ((a) obj).f11025a);
    }

    public final int hashCode() {
        l<T, n> lVar = this.f11025a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Callbacks(onClose=" + this.f11025a + ')';
    }
}
