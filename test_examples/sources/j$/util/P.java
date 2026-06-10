package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class P implements java.util.Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f12083a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f12084b;
    final /* synthetic */ Spliterator c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(Spliterator spliterator) {
        this.c = spliterator;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f12083a = true;
        this.f12084b = obj;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f12083a) {
            this.c.a(this);
        }
        return this.f12083a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12083a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12083a = false;
        return this.f12084b;
    }
}
