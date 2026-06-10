package j$.util.stream;

/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0432z extends C {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12584s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432z(AbstractC0335c abstractC0335c, int i10, int i11) {
        super(abstractC0335c, i10);
        this.f12584s = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        switch (this.f12584s) {
            case 0:
                return interfaceC0363h2;
            case 1:
                return new X(this, interfaceC0363h2, 2);
            default:
                return new C0356g0(this, interfaceC0363h2, 0);
        }
    }
}
