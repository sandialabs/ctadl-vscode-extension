package g0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a1 implements Iterator<Object>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public int f11030i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f11031j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ z0 f11032k;

    public a1(int i10, int i11, z0 z0Var) {
        this.f11031j = i11;
        this.f11032k = z0Var;
        this.f11030i = i10;
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
        return this.f11030i < this.f11031j;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            z0 z0Var = this.f11032k;
            Object[] objArr = z0Var.c;
            int i10 = this.f11030i;
            this.f11030i = i10 + 1;
            return objArr[z0Var.h(i10)];
        }
        return null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
