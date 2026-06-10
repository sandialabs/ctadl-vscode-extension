package j$.util.stream;

/* renamed from: j$.util.stream.m2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0384m2 extends AbstractC0338c2 {

    /* renamed from: b  reason: collision with root package name */
    long f12499b;
    long c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0388n2 f12500d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384m2(C0388n2 c0388n2, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12500d = c0388n2;
        this.f12499b = c0388n2.f12503s;
        long j2 = c0388n2.f12504t;
        if (j2 < 0) {
            j2 = Long.MAX_VALUE;
        }
        this.c = j2;
    }

    @Override // j$.util.stream.InterfaceC0358g2, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        long j10 = this.f12499b;
        if (j10 != 0) {
            this.f12499b = j10 - 1;
            return;
        }
        long j11 = this.c;
        if (j11 > 0) {
            this.c = j11 - 1;
            this.f12449a.accept(j2);
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12449a.g(AbstractC0421w0.L0(j2, this.f12500d.f12503s, this.c));
    }

    @Override // j$.util.stream.AbstractC0338c2, j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        if (this.c != 0 && !this.f12449a.i()) {
            return false;
        }
        return true;
    }
}
