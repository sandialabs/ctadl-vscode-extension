package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class f1 implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final j.a f934i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h1 f935j;

    public f1(h1 h1Var) {
        this.f935j = h1Var;
        this.f934i = new j.a(h1Var.f947a.getContext(), h1Var.f954i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h1 h1Var = this.f935j;
        Window.Callback callback = h1Var.f957l;
        if (callback == null || !h1Var.f958m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f934i);
    }
}
