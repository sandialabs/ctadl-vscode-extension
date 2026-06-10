package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class Q implements InterfaceC0438v, j$.util.function.K, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f12085a = false;

    /* renamed from: b  reason: collision with root package name */
    int f12086b;
    final /* synthetic */ H c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(H h10) {
        this.c = h10;
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        this.f12085a = true;
        this.f12086b = i10;
    }

    @Override // j$.util.A
    /* renamed from: c */
    public final void forEachRemaining(j$.util.function.K k3) {
        k3.getClass();
        while (hasNext()) {
            k3.accept(nextInt());
        }
    }

    @Override // j$.util.InterfaceC0438v, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.K) {
            forEachRemaining((j$.util.function.K) consumer);
            return;
        }
        consumer.getClass();
        if (f0.f12187a) {
            f0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C0324s(consumer));
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f12085a) {
            this.c.k(this);
        }
        return this.f12085a;
    }

    @Override // j$.util.InterfaceC0438v, java.util.Iterator, j$.util.Iterator
    public final Integer next() {
        if (f0.f12187a) {
            f0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.InterfaceC0438v
    public final int nextInt() {
        if (!this.f12085a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12085a = false;
        return this.f12086b;
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
