package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f12203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f12204b;

    public /* synthetic */ H(K k3, K k10) {
        this.f12203a = k3;
        this.f12204b = k10;
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        this.f12203a.accept(i10);
        this.f12204b.accept(i10);
    }

    @Override // j$.util.function.K
    public final K o(K k3) {
        k3.getClass();
        return new H(this, k3);
    }
}
