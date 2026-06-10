package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0336c0 extends AbstractC0341d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0336c0(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final boolean J1() {
        return false;
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
