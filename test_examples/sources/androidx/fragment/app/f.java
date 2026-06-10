package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5149b;
    public final /* synthetic */ l.a c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            fVar.f5148a.endViewTransition(fVar.f5149b);
            fVar.c.a();
        }
    }

    public f(View view, ViewGroup viewGroup, l.a aVar) {
        this.f5148a = viewGroup;
        this.f5149b = view;
        this.c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f5148a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
