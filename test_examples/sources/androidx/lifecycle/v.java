package androidx.lifecycle;

/* loaded from: classes.dex */
public class v<T> extends LiveData<T> {
    public v() {
    }

    public v(T t10) {
        super(t10);
    }

    @Override // androidx.lifecycle.LiveData
    public void i(T t10) {
        LiveData.a("setValue");
        this.f5333g++;
        this.f5331e = t10;
        c(null);
    }

    public final void j(T t10) {
        boolean z10;
        synchronized (this.f5328a) {
            z10 = this.f5332f == LiveData.f5327k;
            this.f5332f = t10;
        }
        if (z10) {
            k.c.L0().M0(this.f5336j);
        }
    }
}
