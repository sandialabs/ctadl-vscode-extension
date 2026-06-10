package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f5121i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5122j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l f5123k;

    public c(l lVar, ArrayList arrayList, SpecialEffectsController.Operation operation) {
        this.f5123k = lVar;
        this.f5121i = arrayList;
        this.f5122j = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f5121i;
        SpecialEffectsController.Operation operation = this.f5122j;
        if (list.contains(operation)) {
            list.remove(operation);
            this.f5123k.getClass();
            operation.f5077a.a(operation.c.M);
        }
    }
}
