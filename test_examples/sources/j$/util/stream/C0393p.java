package j$.util.stream;

/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0393p extends AbstractC0343d2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f12512b;
    Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0393p(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        if (obj != null) {
            Object obj2 = this.c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else if (this.f12512b) {
            return;
        } else {
            this.f12512b = true;
            obj = null;
        }
        this.c = obj;
        interfaceC0363h2.accept(obj);
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        this.f12512b = false;
        this.c = null;
        this.f12453a.end();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        this.f12512b = false;
        this.c = null;
        this.f12453a.g(-1L);
    }
}
