package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T0 extends S0 implements InterfaceC0425x0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(long j2) {
        super(j2);
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12378b;
        double[] dArr = this.f12377a;
        if (i10 >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f12378b = i10 + 1;
        dArr[i10] = d5;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0425x0, j$.util.stream.A0
    public final B0 build() {
        int i10 = this.f12378b;
        double[] dArr = this.f12377a;
        if (i10 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f12378b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0425x0, j$.util.stream.A0
    public final /* bridge */ /* synthetic */ F0 build() {
        build();
        return this;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = this.f12378b;
        double[] dArr = this.f12377a;
        if (i10 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f12378b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        double[] dArr = this.f12377a;
        if (j2 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(dArr.length)));
        }
        this.f12378b = 0;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.InterfaceC0348e2
    public final /* synthetic */ void q(Double d5) {
        AbstractC0421w0.q0(this, d5);
    }

    @Override // j$.util.stream.S0
    public final String toString() {
        double[] dArr = this.f12377a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f12378b), Arrays.toString(dArr));
    }
}
