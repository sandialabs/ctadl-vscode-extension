package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P extends T implements InterfaceC0353f2 {

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.K f12363b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(j$.util.function.K k3, boolean z10) {
        super(z10);
        this.f12363b = k3;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        this.f12363b.accept(i10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        h((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
