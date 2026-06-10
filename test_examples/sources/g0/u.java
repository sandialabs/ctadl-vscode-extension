package g0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements Iterator<Object>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public final x0 f11081i;

    /* renamed from: j  reason: collision with root package name */
    public final int f11082j;

    /* renamed from: k  reason: collision with root package name */
    public int f11083k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11084l;

    public u(int i10, int i11, x0 x0Var) {
        v7.g.f(x0Var, "table");
        this.f11081i = x0Var;
        this.f11082j = i11;
        this.f11083k = i10;
        this.f11084l = x0Var.f11108o;
        if (!x0Var.n) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f11083k < this.f11082j;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        x0 x0Var = this.f11081i;
        int i10 = x0Var.f11108o;
        int i11 = this.f11084l;
        if (i10 == i11) {
            int i12 = this.f11083k;
            this.f11083k = a1.c.A(x0Var.f11103i, i12) + i12;
            return new y0(i12, i11, x0Var);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
