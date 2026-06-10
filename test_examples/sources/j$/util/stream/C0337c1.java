package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0337c1 extends C0332b1 implements InterfaceC0429y0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0337c1(long j2) {
        super(j2);
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        int i11 = this.f12436b;
        int[] iArr = this.f12435a;
        if (i11 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
        }
        this.f12436b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        h((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0429y0, j$.util.stream.A0
    public final C0 build() {
        int i10 = this.f12436b;
        int[] iArr = this.f12435a;
        if (i10 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f12436b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0429y0, j$.util.stream.A0
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
        int i10 = this.f12436b;
        int[] iArr = this.f12435a;
        if (i10 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f12436b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int[] iArr = this.f12435a;
        if (j2 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(iArr.length)));
        }
        this.f12436b = 0;
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    @Override // j$.util.stream.C0332b1
    public final String toString() {
        int[] iArr = this.f12435a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f12436b), Arrays.toString(iArr));
    }
}
