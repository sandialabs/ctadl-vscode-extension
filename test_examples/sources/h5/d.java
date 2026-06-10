package h5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11442a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f11443b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f11444d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f11445e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f11445e = bottomAppBar;
        this.f11443b = actionMenuView;
        this.c = i10;
        this.f11444d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f11442a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f11442a) {
            BottomAppBar bottomAppBar = this.f11445e;
            int i10 = bottomAppBar.f6859s0;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bottomAppBar.F(i10);
            bottomAppBar.J(this.f11443b, this.c, this.f11444d, z10);
        }
    }
}
