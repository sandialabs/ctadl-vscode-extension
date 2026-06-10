package f5;

import a3.b1;
import a3.j0;
import a3.v0;
import a3.x;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f10918i;

    public c(AppBarLayout appBarLayout) {
        this.f10918i = appBarLayout;
    }

    @Override // a3.x
    public final b1 a(View view, b1 b1Var) {
        b1 b1Var2;
        boolean z10;
        AppBarLayout appBarLayout = this.f10918i;
        appBarLayout.getClass();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.b(appBarLayout)) {
            b1Var2 = b1Var;
        } else {
            b1Var2 = null;
        }
        if (!z2.b.a(appBarLayout.f6781o, b1Var2)) {
            appBarLayout.f6781o = b1Var2;
            if (appBarLayout.C != null && appBarLayout.getTopInset() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appBarLayout.setWillNotDraw(!z10);
            appBarLayout.requestLayout();
        }
        return b1Var;
    }
}
