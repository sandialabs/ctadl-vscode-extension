package h5;

import a3.b1;
import android.animation.Animator;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import u5.n;

/* loaded from: classes.dex */
public final class a implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f11437a;

    public a(BottomAppBar bottomAppBar) {
        this.f11437a = bottomAppBar;
    }

    @Override // u5.n.b
    public final b1 a(View view, b1 b1Var, n.c cVar) {
        boolean z10;
        BottomAppBar bottomAppBar = this.f11437a;
        if (bottomAppBar.f6856p0) {
            bottomAppBar.f6863w0 = b1Var.c();
        }
        boolean z11 = true;
        boolean z12 = false;
        if (bottomAppBar.f6857q0) {
            if (bottomAppBar.f6865y0 != b1Var.d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bottomAppBar.f6865y0 = b1Var.d();
        } else {
            z10 = false;
        }
        if (bottomAppBar.f6858r0) {
            if (bottomAppBar.f6864x0 == b1Var.e()) {
                z11 = false;
            }
            bottomAppBar.f6864x0 = b1Var.e();
            z12 = z11;
        }
        if (z10 || z12) {
            Animator animator = bottomAppBar.f6847g0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = bottomAppBar.f6846f0;
            if (animator2 != null) {
                animator2.cancel();
            }
            bottomAppBar.H();
            bottomAppBar.G();
        }
        return b1Var;
    }
}
