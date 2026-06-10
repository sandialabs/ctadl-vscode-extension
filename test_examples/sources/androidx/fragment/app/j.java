package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5190i;

    public j(ArrayList arrayList) {
        this.f5190i = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.b(this.f5190i, 4);
    }
}
