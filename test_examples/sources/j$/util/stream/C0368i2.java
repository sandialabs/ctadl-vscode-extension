package j$.util.stream;

/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0368i2 extends AbstractC0343d2 {

    /* renamed from: b  reason: collision with root package name */
    long f12477b;
    long c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0372j2 f12478d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368i2(C0372j2 c0372j2, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12478d = c0372j2;
        this.f12477b = c0372j2.f12484s;
        long j2 = c0372j2.f12485t;
        if (j2 < 0) {
            j2 = Long.MAX_VALUE;
        }
        this.c = j2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        long j2 = this.f12477b;
        if (j2 != 0) {
            this.f12477b = j2 - 1;
            return;
        }
        long j10 = this.c;
        if (j10 > 0) {
            this.c = j10 - 1;
            this.f12453a.accept(obj);
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12453a.g(AbstractC0421w0.L0(j2, this.f12478d.f12484s, this.c));
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        if (this.c != 0 && !this.f12453a.i()) {
            return false;
        }
        return true;
    }
}
