package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Q0 extends H0 implements E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(E0 e02, E0 e03) {
        super(e02, e03);
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.E0
    public final void c(int i10, Object obj) {
        F0 f02 = this.f12320a;
        ((E0) f02).c(i10, obj);
        ((E0) this.f12321b).c(i10 + ((int) ((E0) f02).count()), obj);
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        ((E0) this.f12320a).d(obj);
        ((E0) this.f12321b).d(obj);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0421w0.y0(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f12320a, this.f12321b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
