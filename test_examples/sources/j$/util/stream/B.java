package j$.util.stream;

/* loaded from: classes2.dex */
abstract class B extends D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final boolean J1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }
}
