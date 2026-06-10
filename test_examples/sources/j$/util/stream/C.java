package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class C extends D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C(AbstractC0335c abstractC0335c, int i10) {
        super(abstractC0335c, i10);
    }

    @Override // j$.util.stream.AbstractC0335c
    final boolean J1() {
        return false;
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
