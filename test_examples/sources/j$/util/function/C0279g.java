package j$.util.function;

import j$.util.function.Consumer;

/* renamed from: j$.util.function.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0279g implements java.util.function.Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f12241a;

    private /* synthetic */ C0279g(Consumer consumer) {
        this.f12241a = consumer;
    }

    public static /* synthetic */ java.util.function.Consumer a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).f12194a : new C0279g(consumer);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.f12241a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return a(this.f12241a.e(Consumer.VivifiedWrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.f12241a;
        if (obj instanceof C0279g) {
            obj = ((C0279g) obj).f12241a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12241a.hashCode();
    }
}
