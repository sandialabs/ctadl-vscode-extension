package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0379l1 extends C0375k1 implements InterfaceC0433z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0379l1(long j2) {
        super(j2);
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        int i10 = this.f12490b;
        long[] jArr = this.f12489a;
        if (i10 >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f12490b = i10 + 1;
        jArr[i10] = j2;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0433z0, j$.util.stream.A0
    public final D0 build() {
        int i10 = this.f12490b;
        long[] jArr = this.f12489a;
        if (i10 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f12490b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0433z0, j$.util.stream.A0
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
        int i10 = this.f12490b;
        long[] jArr = this.f12489a;
        if (i10 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f12490b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        long[] jArr = this.f12489a;
        if (j2 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(jArr.length)));
        }
        this.f12490b = 0;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }

    @Override // j$.util.stream.C0375k1
    public final String toString() {
        long[] jArr = this.f12489a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f12490b), Arrays.toString(jArr));
    }
}
