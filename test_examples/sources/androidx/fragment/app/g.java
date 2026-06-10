package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import v2.d;

/* loaded from: classes.dex */
public final class g implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5156a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5157b;
    public final /* synthetic */ l.a c;

    public g(View view, ViewGroup viewGroup, l.a aVar) {
        this.f5156a = view;
        this.f5157b = viewGroup;
        this.c = aVar;
    }

    @Override // v2.d.b
    public final void onCancel() {
        View view = this.f5156a;
        view.clearAnimation();
        this.f5157b.endViewTransition(view);
        this.c.a();
    }
}
