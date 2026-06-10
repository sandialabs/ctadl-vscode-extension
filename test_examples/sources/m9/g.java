package m9;

/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f16022a;

    public g(T t10) {
        this.f16022a = t10;
    }

    public abstract y9.r a(l8.s sVar);

    public T b() {
        return this.f16022a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            T b5 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!v7.g.a(b5, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        T b5 = b();
        if (b5 != null) {
            return b5.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
