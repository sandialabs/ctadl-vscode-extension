package j$.util;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class S implements InterfaceC0442z, InterfaceC0278f0, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f12087a = false;

    /* renamed from: b  reason: collision with root package name */
    long f12088b;
    final /* synthetic */ K c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(K k3) {
        this.c = k3;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        this.f12087a = true;
        this.f12088b = j2;
    }

    @Override // j$.util.A
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        while (hasNext()) {
            interfaceC0278f0.accept(nextLong());
        }
    }

    @Override // j$.util.InterfaceC0442z, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC0278f0) {
            forEachRemaining((InterfaceC0278f0) consumer);
            return;
        }
        consumer.getClass();
        if (f0.f12187a) {
            f0.a(S.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C0439w(consumer));
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f12087a) {
            this.c.f(this);
        }
        return this.f12087a;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.InterfaceC0442z, java.util.Iterator, j$.util.Iterator
    public final Long next() {
        if (f0.f12187a) {
            f0.a(S.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.InterfaceC0442z
    public final long nextLong() {
        if (!this.f12087a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12087a = false;
        return this.f12088b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
