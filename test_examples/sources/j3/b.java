package j3;

/* loaded from: classes.dex */
public final class b<T> extends i<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f12668a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12669b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, Object obj) {
        this.f12668a = obj;
        this.f12669b = i10;
    }

    public final void a() {
        T t10 = this.f12668a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f12669b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
