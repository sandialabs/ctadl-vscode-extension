package j$.util.stream;

/* loaded from: classes2.dex */
final class Y extends AbstractC0370j0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12430s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC0335c abstractC0335c, int i10, int i11) {
        super(abstractC0335c, i10);
        this.f12430s = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        switch (this.f12430s) {
            case 0:
                return new X(this, interfaceC0363h2, 0);
            default:
                return interfaceC0363h2;
        }
    }
}
