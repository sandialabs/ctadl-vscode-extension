package n7;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f16128a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16129b;

    public r(int i10, T t10) {
        this.f16128a = i10;
        this.f16129b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f16128a == rVar.f16128a && v7.g.a(this.f16129b, rVar.f16129b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f16128a * 31;
        T t10 = this.f16129b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f16128a + ", value=" + this.f16129b + ')';
    }
}
