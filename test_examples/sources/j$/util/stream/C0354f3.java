package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.stream.f3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0354f3 implements InterfaceC0348e2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12470a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0293n f12471b;

    public /* synthetic */ C0354f3(InterfaceC0293n interfaceC0293n, int i10) {
        this.f12470a = i10;
        this.f12471b = interfaceC0293n;
    }

    @Override // j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12470a;
        InterfaceC0293n interfaceC0293n = this.f12471b;
        switch (i10) {
            case 0:
                ((K2) interfaceC0293n).accept(d5);
                return;
            default:
                interfaceC0293n.accept(d5);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f12470a) {
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
        switch (this.f12470a) {
            case 0:
                AbstractC0421w0.x0();
                throw null;
            default:
                AbstractC0421w0.x0();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f12470a) {
            case 0:
                q((Double) obj);
                return;
            default:
                q((Double) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12470a) {
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

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        switch (this.f12470a) {
            case 0:
                interfaceC0293n.getClass();
                return new C0287k(this, interfaceC0293n);
            default:
                interfaceC0293n.getClass();
                return new C0287k(this, interfaceC0293n);
        }
    }

    @Override // j$.util.stream.InterfaceC0348e2
    public final /* synthetic */ void q(Double d5) {
        switch (this.f12470a) {
            case 0:
                AbstractC0421w0.q0(this, d5);
                return;
            default:
                AbstractC0421w0.q0(this, d5);
                return;
        }
    }
}
