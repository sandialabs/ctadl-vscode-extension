package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n0 f5185i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f5186j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Rect f5187k;

    public i(n0 n0Var, View view, Rect rect) {
        this.f5185i = n0Var;
        this.f5186j = view;
        this.f5187k = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5185i.getClass();
        n0.g(this.f5186j, this.f5187k);
    }
}
