package j$.util;

import j$.util.function.Consumer;

/* renamed from: j$.util.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0324s implements j$.util.function.K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f12284a;

    @Override // j$.util.function.K
    public final void accept(int i10) {
        this.f12284a.accept(Integer.valueOf(i10));
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
