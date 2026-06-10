package j$.util.stream;

import j$.util.function.Consumer;

/* renamed from: j$.util.stream.h3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0364h3 implements InterfaceC0353f2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12475a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j$.util.function.K f12476b;

    public /* synthetic */ C0364h3(j$.util.function.K k3, int i10) {
        this.f12475a = i10;
        this.f12476b = k3;
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        switch (this.f12475a) {
            case 0:
                AbstractC0421w0.p0();
                throw null;
            default:
                AbstractC0421w0.p0();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0353f2, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        int i11 = this.f12475a;
        j$.util.function.K k3 = this.f12476b;
        switch (i11) {
            case 0:
                ((M2) k3).accept(i10);
                return;
            default:
                k3.accept(i10);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        switch (this.f12475a) {
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
        switch (this.f12475a) {
            case 0:
                h((Integer) obj);
                return;
            default:
                h((Integer) obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12475a) {
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

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        switch (this.f12475a) {
            case 0:
                AbstractC0421w0.s0(this, num);
                return;
            default:
                AbstractC0421w0.s0(this, num);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        switch (this.f12475a) {
            case 0:
                k3.getClass();
                return new j$.util.function.H(this, k3);
            default:
                k3.getClass();
                return new j$.util.function.H(this, k3);
        }
    }
}
