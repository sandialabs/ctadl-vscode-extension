package d;

import a3.j0;
import a3.v0;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k f10313i;

    /* loaded from: classes.dex */
    public class a extends a1.c {
        public a() {
        }

        @Override // a3.w0
        public final void a() {
            n nVar = n.this;
            nVar.f10313i.D.setAlpha(1.0f);
            k kVar = nVar.f10313i;
            kVar.G.d(null);
            kVar.G = null;
        }

        @Override // a1.c, a3.w0
        public final void g() {
            n.this.f10313i.D.setVisibility(0);
        }
    }

    public n(k kVar) {
        this.f10313i = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        k kVar = this.f10313i;
        kVar.E.showAtLocation(kVar.D, 55, 0, 0);
        v0 v0Var = kVar.G;
        if (v0Var != null) {
            v0Var.b();
        }
        if (kVar.I && (viewGroup = kVar.J) != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(viewGroup)) {
                z10 = true;
                if (!z10) {
                    kVar.D.setAlpha(0.0f);
                    v0 a10 = j0.a(kVar.D);
                    a10.a(1.0f);
                    kVar.G = a10;
                    a10.d(new a());
                    return;
                }
                kVar.D.setAlpha(1.0f);
                kVar.D.setVisibility(0);
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }
}
