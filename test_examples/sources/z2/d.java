package z2;

/* loaded from: classes.dex */
public final class d<T> extends h1.c {
    public final Object c;

    public d(int i10) {
        super(i10, 1);
        this.c = new Object();
    }

    @Override // h1.c
    public final T a() {
        T t10;
        synchronized (this.c) {
            t10 = (T) super.a();
        }
        return t10;
    }

    @Override // h1.c
    public final boolean b(T t10) {
        boolean b5;
        synchronized (this.c) {
            b5 = super.b(t10);
        }
        return b5;
    }
}
