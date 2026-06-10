package j$.util.stream;

/* renamed from: j$.util.stream.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0331b0 extends AbstractC0341d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0331b0(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final boolean J1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0335c, j$.util.stream.InterfaceC0365i, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
