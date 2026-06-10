package f7;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.noto.app.util.ViewUtilsKt;

/* loaded from: classes.dex */
public final class c {
    public static final j7.e a() {
        j7.e eVar = new j7.e(new AccelerateInterpolator());
        eVar.c = 250L;
        eVar.f5688f = 250L;
        eVar.f5687e = 250L;
        eVar.f5686d = 250L;
        return eVar;
    }

    public static final void b(final TextView textView, final int i10, int i11) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i11);
        ofArgb.setDuration(250L);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f7.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Drawable mutate;
                View view = textView;
                v7.g.f(view, "$this_animateBackgroundColor");
                v7.g.f(valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                v7.g.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue).intValue();
                Drawable background = view.getBackground();
                if (background != null && (mutate = background.mutate()) != null) {
                    ViewUtilsKt.s(mutate, q.h(i10));
                    mutate.setTint(intValue);
                }
            }
        });
        ofArgb.start();
    }

    public static final void c(final TextView textView, int i10, int i11) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i10, i11);
        ofArgb.setDuration(250L);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f7.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView textView2 = textView;
                v7.g.f(textView2, "$this_animateTextColor");
                v7.g.f(valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                v7.g.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                textView2.setTextColor(((Integer) animatedValue).intValue());
            }
        });
        ofArgb.start();
    }

    public static final void d(l6.j jVar) {
        jVar.f11394k = 250L;
        jVar.f11395l = new AccelerateInterpolator();
    }

    public static final void e(Fragment fragment) {
        v7.g.f(fragment, "<this>");
        l6.h hVar = new l6.h();
        d(hVar);
        fragment.b().f5064k = hVar;
        l6.h hVar2 = new l6.h();
        d(hVar2);
        fragment.b().f5062i = hVar2;
        l6.h hVar3 = new l6.h();
        d(hVar3);
        fragment.b().f5065l = hVar3;
        l6.h hVar4 = new l6.h();
        d(hVar4);
        fragment.b().f5063j = hVar4;
    }

    public static final void f(Fragment fragment) {
        v7.g.f(fragment, "<this>");
        l6.g gVar = new l6.g(false);
        d(gVar);
        fragment.b().f5064k = gVar;
        l6.g gVar2 = new l6.g(true);
        d(gVar2);
        fragment.b().f5065l = gVar2;
        l6.i iVar = new l6.i(true);
        d(iVar);
        fragment.b().f5062i = iVar;
        l6.i iVar2 = new l6.i(false);
        d(iVar2);
        fragment.b().f5063j = iVar2;
    }
}
