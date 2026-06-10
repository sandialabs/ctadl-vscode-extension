package g0;

/* loaded from: classes.dex */
public final class i1<T> implements g1<T> {

    /* renamed from: i  reason: collision with root package name */
    public final T f11056i;

    public i1(T t10) {
        this.f11056i = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        if (v7.g.a(this.f11056i, ((i1) obj).f11056i)) {
            return true;
        }
        return false;
    }

    @Override // g0.g1
    public final T getValue() {
        return this.f11056i;
    }

    public final int hashCode() {
        T t10 = this.f11056i;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f11056i + ')';
    }
}
