package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5161i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5162j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f5163k;

    public h(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, p.b bVar) {
        this.f5161i = operation;
        this.f5162j = operation2;
        this.f5163k = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.a(this.f5161i.c, this.f5162j.c, this.f5163k);
    }
}
