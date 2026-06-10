package h5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f11446a;

    public e(BottomAppBar bottomAppBar) {
        this.f11446a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float fabTranslationX;
        BottomAppBar bottomAppBar = this.f11446a;
        bottomAppBar.f6866z0.onAnimationStart(animator);
        FloatingActionButton y10 = bottomAppBar.y();
        if (y10 != null) {
            fabTranslationX = bottomAppBar.getFabTranslationX();
            y10.setTranslationX(fabTranslationX);
        }
    }
}
