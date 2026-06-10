package ca;

import v7.g;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f6583a;

    /* renamed from: b  reason: collision with root package name */
    public final T f6584b;

    public a(T t10, T t11) {
        this.f6583a = t10;
        this.f6584b = t11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return g.a(this.f6583a, aVar.f6583a) && g.a(this.f6584b, aVar.f6584b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        T t10 = this.f6583a;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f6584b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f6583a + ", upper=" + this.f6584b + ')';
    }
}
