package v;

import a3.j0;
import a3.v0;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.c f18082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f18083b;

    public w(androidx.compose.foundation.layout.c cVar, View view) {
        this.f18082a = cVar;
        this.f18083b = view;
    }

    @Override // g0.p
    public final void a() {
        androidx.compose.foundation.layout.c cVar = this.f18082a;
        cVar.getClass();
        View view = this.f18083b;
        v7.g.f(view, "view");
        int i10 = cVar.f2025q - 1;
        cVar.f2025q = i10;
        if (i10 == 0) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.i.u(view, null);
            j0.s(view, null);
            view.removeOnAttachStateChangeListener(cVar.f2026r);
        }
    }
}
