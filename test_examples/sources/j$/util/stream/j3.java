package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;

/* loaded from: classes2.dex */
public final /* synthetic */ class j3 implements InterfaceC0358g2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278f0 f12487b;

    public /* synthetic */ j3(InterfaceC0278f0 interfaceC0278f0, int i10) {
        this.f12486a = i10;
        this.f12487b = interfaceC0278f0;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        switch (this.f12486a) {
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
        switch (this.f12486a) {
            case 0:
                AbstractC0421w0.w0();
                throw null;
            default:
                AbstractC0421w0.w0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0358g2, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        int i10 = this.f12486a;
        InterfaceC0278f0 interfaceC0278f0 = this.f12487b;
        switch (i10) {
            case 0:
                ((O2) interfaceC0278f0).accept(j2);
                return;
            default:
                interfaceC0278f0.accept(j2);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f12486a) {
            case 0:
                m((Long) obj);
                return;
            default:
                m((Long) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12486a) {
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

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        switch (this.f12486a) {
            case 0:
                interfaceC0278f0.getClass();
                return new C0272c0(this, interfaceC0278f0);
            default:
                interfaceC0278f0.getClass();
                return new C0272c0(this, interfaceC0278f0);
        }
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        switch (this.f12486a) {
            case 0:
                AbstractC0421w0.u0(this, l2);
                return;
            default:
                AbstractC0421w0.u0(this, l2);
                return;
        }
    }
}
