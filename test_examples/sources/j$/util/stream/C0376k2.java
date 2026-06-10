package j$.util.stream;

/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0376k2 extends AbstractC0333b2 {

    /* renamed from: b  reason: collision with root package name */
    long f12491b;
    long c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0380l2 f12492d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0376k2(C0380l2 c0380l2, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12492d = c0380l2;
        this.f12491b = c0380l2.f12495s;
        long j2 = c0380l2.f12496t;
        if (j2 < 0) {
            j2 = Long.MAX_VALUE;
        }
        this.c = j2;
    }

    @Override // j$.util.stream.InterfaceC0353f2, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        long j2 = this.f12491b;
        if (j2 != 0) {
            this.f12491b = j2 - 1;
            return;
        }
        long j10 = this.c;
        if (j10 > 0) {
            this.c = j10 - 1;
            this.f12437a.accept(i10);
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12437a.g(AbstractC0421w0.L0(j2, this.f12492d.f12495s, this.c));
    }

    @Override // j$.util.stream.AbstractC0333b2, j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        if (this.c != 0 && !this.f12437a.i()) {
            return false;
        }
        return true;
    }
}
