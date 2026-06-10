package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0327a1 extends I0 implements A0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0327a1(long j2, IntFunction intFunction) {
        super(j2, intFunction);
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
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12328b;
        Object[] objArr = this.f12327a;
        if (i10 >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f12328b = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.stream.A0
    public final F0 build() {
        int i10 = this.f12328b;
        Object[] objArr = this.f12327a;
        if (i10 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f12328b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = this.f12328b;
        Object[] objArr = this.f12327a;
        if (i10 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f12328b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        Object[] objArr = this.f12327a;
        if (j2 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(objArr.length)));
        }
        this.f12328b = 0;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.I0
    public final String toString() {
        Object[] objArr = this.f12327a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f12328b), Arrays.toString(objArr));
    }
}
