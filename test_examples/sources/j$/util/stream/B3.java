package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class B3 implements InterfaceC0363h2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f12293b;

    public /* synthetic */ B3(Consumer consumer, int i10) {
        this.f12292a = i10;
        this.f12293b = consumer;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        switch (this.f12292a) {
            case 0:
                AbstractC0421w0.p0();
                throw null;
            default:
                AbstractC0421w0.p0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f12292a) {
            case 0:
                AbstractC0421w0.w0();
                throw null;
            default:
                AbstractC0421w0.w0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        switch (this.f12292a) {
            case 0:
                AbstractC0421w0.x0();
                throw null;
            default:
                AbstractC0421w0.x0();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12292a;
        Consumer consumer = this.f12293b;
        switch (i10) {
            case 0:
                ((R2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12292a) {
            case 0:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
            default:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void g(long j2) {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }
}
