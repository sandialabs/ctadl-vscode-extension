package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ j$.util.function.G f12329h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f12330i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(W2 w22, j$.util.function.G g10, int i10) {
        super(w22);
        this.f12329h = g10;
        this.f12330i = i10;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        return new J1(this.f12330i, this.f12329h);
    }
}
