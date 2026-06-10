package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class S extends T {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f12376b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Consumer consumer, boolean z10) {
        super(z10);
        this.f12376b = consumer;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f12376b.accept(obj);
    }
}
