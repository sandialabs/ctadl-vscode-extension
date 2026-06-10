package j$.util;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class T implements r, InterfaceC0293n, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f12090a = false;

    /* renamed from: b  reason: collision with root package name */
    double f12091b;
    final /* synthetic */ E c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(E e10) {
        this.c = e10;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.f12090a = true;
        this.f12091b = d5;
    }

    @Override // j$.util.A
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        while (hasNext()) {
            interfaceC0293n.accept(nextDouble());
        }
    }

    @Override // j$.util.r, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC0293n) {
            forEachRemaining((InterfaceC0293n) consumer);
            return;
        }
        consumer.getClass();
        if (f0.f12187a) {
            f0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C0321o(consumer));
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f12090a) {
            this.c.p(this);
        }
        return this.f12090a;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.r, java.util.Iterator, j$.util.Iterator
    public final Double next() {
        if (f0.f12187a) {
            f0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.r
    public final double nextDouble() {
        if (!this.f12090a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12090a = false;
        return this.f12091b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
