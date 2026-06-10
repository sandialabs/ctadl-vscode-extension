package j$.util.stream;

import j$.util.C0315i;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0284i0;

/* renamed from: j$.util.stream.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0351f0 implements InterfaceC0270b0, InterfaceC0284i0, j$.util.function.E0, BiConsumer, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12469a;

    public /* synthetic */ C0351f0(int i10) {
        this.f12469a = i10;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // j$.util.function.E0
    public final void accept(Object obj, long j2) {
        ((C0315i) obj).accept(j2);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C0315i) obj).a((C0315i) obj2);
    }

    @Override // j$.util.function.InterfaceC0284i0
    public final Object apply(long j2) {
        return Long.valueOf(j2);
    }

    @Override // j$.util.function.InterfaceC0270b0
    public final long applyAsLong(long j2, long j10) {
        switch (this.f12469a) {
            case 0:
                return Math.max(j2, j10);
            default:
                return j2 + j10;
        }
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new j$.util.concurrent.u(1, this, biConsumer);
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }
}
