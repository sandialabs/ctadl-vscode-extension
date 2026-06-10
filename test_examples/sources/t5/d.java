package t5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b6.g;
import b6.k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends com.google.android.material.floatingactionbutton.d {
    public StateListAnimator N;

    /* loaded from: classes.dex */
    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // b6.g, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f7170v.getElevation();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // com.google.android.material.floatingactionbutton.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.f7133s) {
            super.f(rect);
            return;
        }
        boolean z11 = this.f7155f;
        int i10 = 0;
        FloatingActionButton floatingActionButton = this.f7170v;
        if (z11 && floatingActionButton.getSizeDimension() < this.f7160k) {
            z10 = false;
            if (!z10) {
                i10 = (this.f7160k - floatingActionButton.getSizeDimension()) / 2;
            }
            rect.set(i10, i10, i10, i10);
        }
        z10 = true;
        if (!z10) {
        }
        rect.set(i10, i10, i10, i10);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        g s10 = s();
        this.f7152b = s10;
        s10.setTintList(colorStateList);
        if (mode != null) {
            this.f7152b.setTintMode(mode);
        }
        g gVar = this.f7152b;
        FloatingActionButton floatingActionButton = this.f7170v;
        gVar.k(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            k kVar = this.f7151a;
            kVar.getClass();
            t5.a aVar = new t5.a(kVar);
            int b5 = n2.a.b(context, R.color.design_fab_stroke_top_outer_color);
            int b10 = n2.a.b(context, R.color.design_fab_stroke_top_inner_color);
            int b11 = n2.a.b(context, R.color.design_fab_stroke_end_inner_color);
            int b12 = n2.a.b(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f17582i = b5;
            aVar.f17583j = b10;
            aVar.f17584k = b11;
            aVar.f17585l = b12;
            float f10 = i10;
            if (aVar.f17581h != f10) {
                aVar.f17581h = f10;
                aVar.f17576b.setStrokeWidth(f10 * 1.3333f);
                aVar.n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f17586m = colorStateList.getColorForState(aVar.getState(), aVar.f17586m);
            }
            aVar.f17588p = colorStateList;
            aVar.n = true;
            aVar.invalidateSelf();
            this.f7153d = aVar;
            t5.a aVar2 = this.f7153d;
            aVar2.getClass();
            g gVar2 = this.f7152b;
            gVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, gVar2});
        } else {
            this.f7153d = null;
            drawable = this.f7152b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(y5.b.b(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.f7154e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(int[] iArr) {
        float f10;
        if (Build.VERSION.SDK_INT == 21) {
            FloatingActionButton floatingActionButton = this.f7170v;
            if (floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(this.f7157h);
                if (floatingActionButton.isPressed()) {
                    f10 = this.f7159j;
                } else if (floatingActionButton.isFocused() || floatingActionButton.isHovered()) {
                    f10 = this.f7158i;
                }
                floatingActionButton.setTranslationZ(f10);
                return;
            }
            floatingActionButton.setElevation(0.0f);
            floatingActionButton.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f7170v;
        if (i10 == 21) {
            floatingActionButton.refreshDrawableState();
        } else if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(y5.b.b(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    @Override // com.google.android.material.floatingactionbutton.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z10;
        if (FloatingActionButton.this.f7133s) {
            return true;
        }
        if (this.f7155f && this.f7170v.getSizeDimension() < this.f7160k) {
            z10 = false;
            if (z10) {
                return true;
            }
            return false;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f7170v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
        return animatorSet;
    }

    public final g s() {
        k kVar = this.f7151a;
        kVar.getClass();
        return new a(kVar);
    }
}
