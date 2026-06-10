package d;

import a3.j0;
import a3.v0;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o extends a1.c {
    public final /* synthetic */ k V;

    public o(k kVar) {
        this.V = kVar;
    }

    @Override // a3.w0
    public final void a() {
        k kVar = this.V;
        kVar.D.setAlpha(1.0f);
        kVar.G.d(null);
        kVar.G = null;
    }

    @Override // a1.c, a3.w0
    public final void g() {
        k kVar = this.V;
        kVar.D.setVisibility(0);
        if (kVar.D.getParent() instanceof View) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.h.c((View) kVar.D.getParent());
        }
    }
}
