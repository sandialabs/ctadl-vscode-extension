package ja;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12803a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.l<Throwable, m7.n> f12804b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Object obj, u7.l<? super Throwable, m7.n> lVar) {
        this.f12803a = obj;
        this.f12804b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return v7.g.a(this.f12803a, tVar.f12803a) && v7.g.a(this.f12804b, tVar.f12804b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12803a;
        return this.f12804b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f12803a + ", onCancellation=" + this.f12804b + ')';
    }
}
