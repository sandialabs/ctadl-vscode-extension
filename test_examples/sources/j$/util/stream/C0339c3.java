package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0339c3 extends AbstractC0344d3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f12450b = new Object[128];

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12454a;
        this.f12454a = i10 + 1;
        this.f12450b[i10] = obj;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }
}
