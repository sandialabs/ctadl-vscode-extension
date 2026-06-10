package j$.util.stream;

/* renamed from: j$.util.stream.o2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0392o2 extends AbstractC0328a2 {

    /* renamed from: b  reason: collision with root package name */
    long f12510b;
    long c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0396p2 f12511d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392o2(C0396p2 c0396p2, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12511d = c0396p2;
        this.f12510b = c0396p2.f12515s;
        long j2 = c0396p2.f12516t;
        if (j2 < 0) {
            j2 = Long.MAX_VALUE;
        }
        this.c = j2;
    }

    @Override // j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        long j2 = this.f12510b;
        if (j2 != 0) {
            this.f12510b = j2 - 1;
            return;
        }
        long j10 = this.c;
        if (j10 > 0) {
            this.c = j10 - 1;
            this.f12433a.accept(d5);
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12433a.g(AbstractC0421w0.L0(j2, this.f12511d.f12515s, this.c));
    }

    @Override // j$.util.stream.AbstractC0328a2, j$.util.stream.InterfaceC0363h2
    public final boolean i() {
        if (this.c != 0 && !this.f12433a.i()) {
            return false;
        }
        return true;
    }
}
