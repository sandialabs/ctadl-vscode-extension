package com.google.android.material.transformation;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.R;
import e5.g;
import e5.h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n5.d;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f7510d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f7511e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f7512f;

    /* renamed from: g  reason: collision with root package name */
    public float f7513g;

    /* renamed from: h  reason: collision with root package name */
    public float f7514h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7515a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7516b;
        public final /* synthetic */ View c;

        public a(boolean z10, View view, View view2) {
            this.f7515a = z10;
            this.f7516b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f7515a) {
                return;
            }
            this.f7516b.setVisibility(4);
            View view = this.c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f7515a) {
                this.f7516b.setVisibility(0);
                View view = this.c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f7517a;

        /* renamed from: b  reason: collision with root package name */
        public a1.b f7518b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.f7510d = new RectF();
        this.f7511e = new RectF();
        this.f7512f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f7510d = new RectF();
        this.f7511e = new RectF();
        this.f7512f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        h d5;
        g gVar;
        String str;
        int i10;
        if (f10 != 0.0f && f11 != 0.0f) {
            if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
                d5 = bVar.f7517a.d("translationXCurveDownwards");
                gVar = bVar.f7517a;
                str = "translationYCurveDownwards";
            } else {
                d5 = bVar.f7517a.d("translationXCurveUpwards");
                gVar = bVar.f7517a;
                str = "translationYCurveUpwards";
            }
            return new Pair(d5, gVar.d(str));
        }
        d5 = bVar.f7517a.d("translationXLinear");
        gVar = bVar.f7517a;
        str = "translationYLinear";
        return new Pair(d5, gVar.d(str));
    }

    public static float x(b bVar, h hVar, float f10) {
        long j2 = hVar.f10659a;
        h d5 = bVar.f7517a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d5.f10659a + d5.f10660b) + 17) - j2)) / ((float) hVar.f10660b));
        LinearInterpolator linearInterpolator = e5.a.f10647a;
        return a4.b.f(0.0f, f10, interpolation, f10);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f4599h == 0) {
            fVar.f4599h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fc A[LOOP:0: B:122:0x03fa->B:123:0x03fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037c  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        float f10;
        ArrayList arrayList2;
        boolean z12;
        ArrayList arrayList3;
        b bVar;
        AnimatorSet animatorSet;
        ArrayList arrayList4;
        boolean z13;
        ObjectAnimator ofInt;
        b bVar2;
        boolean z14;
        ObjectAnimator ofFloat4;
        int size;
        int i10;
        ObjectAnimator ofInt2;
        b z15 = z(view2.getContext(), z10);
        if (z10) {
            this.f7513g = view.getTranslationX();
            this.f7514h = view.getTranslationY();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        float i11 = j0.i.i(view2) - j0.i.i(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-i11);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -i11);
        }
        z15.f7517a.d("elevation").a(ofFloat);
        arrayList5.add(ofFloat);
        RectF rectF = this.f7510d;
        float v3 = v(view, view2, z15.f7518b);
        float w10 = w(view, view2, z15.f7518b);
        Pair u10 = u(v3, w10, z10, z15);
        h hVar = (h) u10.first;
        h hVar2 = (h) u10.second;
        RectF rectF2 = this.f7511e;
        Rect rect = this.c;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-v3);
                view2.setTranslationY(-w10);
            }
            arrayList = arrayList6;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float x3 = x(z15, hVar, -v3);
            float x10 = x(z15, hVar2, -w10);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            y(view2, rectF2);
            rectF2.offset(x3, x10);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList6;
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -v3);
            ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -w10);
        }
        hVar.a(ofFloat2);
        hVar2.a(ofFloat3);
        arrayList5.add(ofFloat2);
        arrayList5.add(ofFloat3);
        float width = rectF.width();
        float height = rectF.height();
        float v10 = v(view, view2, z15.f7518b);
        float w11 = w(view, view2, z15.f7518b);
        Pair u11 = u(v10, w11, z10, z15);
        h hVar3 = (h) u11.first;
        h hVar4 = (h) u11.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = z10 ? v10 : this.f7513g;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z10 ? w11 : this.f7514h;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, property2, fArr2);
        hVar3.a(ofFloat7);
        hVar4.a(ofFloat8);
        arrayList5.add(ofFloat7);
        arrayList5.add(ofFloat8);
        boolean z16 = view2 instanceof d;
        if (z16 && (view instanceof ImageView)) {
            d dVar = (d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, e5.d.f10653a, 0);
                    f10 = width;
                } else {
                    f10 = width;
                    ofInt2 = ObjectAnimator.ofInt(drawable, e5.d.f10653a, 255);
                }
                ofInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                z15.f7517a.d("iconFade").a(ofInt2);
                arrayList5.add(ofInt2);
                com.google.android.material.transformation.b bVar3 = new com.google.android.material.transformation.b(dVar, drawable);
                arrayList2 = arrayList;
                arrayList2.add(bVar3);
                if (z16) {
                    bVar = z15;
                    z12 = z16;
                    arrayList4 = arrayList2;
                } else {
                    d dVar2 = (d) view2;
                    a1.b bVar4 = z15.f7518b;
                    y(view, rectF);
                    rectF.offset(this.f7513g, this.f7514h);
                    y(view2, rectF2);
                    rectF2.offset(-v(view, view2, bVar4), 0.0f);
                    float centerX = rectF.centerX() - rectF2.left;
                    a1.b bVar5 = z15.f7518b;
                    y(view, rectF);
                    rectF.offset(this.f7513g, this.f7514h);
                    y(view2, rectF2);
                    rectF2.offset(0.0f, -w(view, view2, bVar5));
                    float centerY = rectF.centerY() - rectF2.top;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    if (j0.g.c(floatingActionButton)) {
                        rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                        floatingActionButton.k(rect);
                    }
                    float width2 = rect.width() / 2.0f;
                    h d5 = z15.f7517a.d("expansion");
                    if (z10) {
                        if (!z11) {
                            dVar2.setRevealInfo(new d.C0192d(centerX, centerY, width2));
                        }
                        if (z11) {
                            width2 = dVar2.getRevealInfo().c;
                        }
                        double d10 = 0.0f - centerX;
                        double d11 = 0.0f - centerY;
                        z12 = z16;
                        arrayList3 = arrayList2;
                        float hypot = (float) Math.hypot(d10, d11);
                        double d12 = f10 - centerX;
                        float hypot2 = (float) Math.hypot(d12, d11);
                        double d13 = height - centerY;
                        float hypot3 = (float) Math.hypot(d12, d13);
                        float hypot4 = (float) Math.hypot(d10, d13);
                        if (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) {
                            hypot = (hypot2 <= hypot3 || hypot2 <= hypot4) ? hypot3 > hypot4 ? hypot3 : hypot4 : hypot2;
                        }
                        animatorSet = n5.b.a(dVar2, centerX, centerY, hypot);
                        animatorSet.addListener(new c(dVar2));
                        long j2 = d5.f10659a;
                        int i12 = (int) centerX;
                        int i13 = (int) centerY;
                        if (j2 > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i12, i13, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(j2);
                            arrayList5.add(createCircularReveal);
                        }
                        bVar = z15;
                    } else {
                        z12 = z16;
                        arrayList3 = arrayList2;
                        float f11 = dVar2.getRevealInfo().c;
                        AnimatorSet a10 = n5.b.a(dVar2, centerX, centerY, width2);
                        long j10 = d5.f10659a;
                        int i14 = (int) centerX;
                        int i15 = (int) centerY;
                        if (j10 > 0) {
                            Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, f11, f11);
                            createCircularReveal2.setStartDelay(0L);
                            createCircularReveal2.setDuration(j10);
                            arrayList5.add(createCircularReveal2);
                        }
                        b bVar6 = z15;
                        p.h<String, h> hVar5 = bVar6.f7517a.f10657a;
                        int i16 = hVar5.f16580k;
                        long j11 = 0;
                        int i17 = 0;
                        while (i17 < i16) {
                            h k3 = hVar5.k(i17);
                            j11 = Math.max(j11, k3.f10659a + k3.f10660b);
                            i17++;
                            hVar5 = hVar5;
                            i16 = i16;
                            a10 = a10;
                            bVar6 = bVar6;
                        }
                        bVar = bVar6;
                        AnimatorSet animatorSet2 = a10;
                        long j12 = d5.f10659a + d5.f10660b;
                        if (j12 < j11) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i14, i15, width2, width2);
                            createCircularReveal3.setStartDelay(j12);
                            createCircularReveal3.setDuration(j11 - j12);
                            arrayList5.add(createCircularReveal3);
                        }
                        animatorSet = animatorSet2;
                    }
                    d5.a(animatorSet);
                    arrayList5.add(animatorSet);
                    arrayList4 = arrayList3;
                    arrayList4.add(new n5.a(dVar2));
                }
                if (z12) {
                    z13 = z10;
                    bVar2 = bVar;
                } else {
                    d dVar3 = (d) view2;
                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                    ColorStateList g10 = j0.i.g(view);
                    int colorForState = g10 != null ? g10.getColorForState(view.getDrawableState(), g10.getDefaultColor()) : 0;
                    int i18 = 16777215 & colorForState;
                    z13 = z10;
                    if (z13) {
                        if (!z11) {
                            dVar3.setCircularRevealScrimColor(colorForState);
                        }
                        ofInt = ObjectAnimator.ofInt(dVar3, d.c.f16102a, i18);
                    } else {
                        ofInt = ObjectAnimator.ofInt(dVar3, d.c.f16102a, colorForState);
                    }
                    ofInt.setEvaluator(e5.b.f10651a);
                    bVar2 = bVar;
                    bVar2.f7517a.d("color").a(ofInt);
                    arrayList5.add(ofInt);
                }
                z14 = view2 instanceof ViewGroup;
                if (!z14) {
                    View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById == null) {
                        if (!(view2 instanceof k6.c) && !(view2 instanceof k6.b)) {
                            if (z14) {
                                viewGroup = (ViewGroup) view2;
                            }
                            if (viewGroup != null) {
                                if (z13) {
                                    if (!z11) {
                                        e5.c.f10652a.set(viewGroup, Float.valueOf(0.0f));
                                    }
                                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, e5.c.f10652a, 1.0f);
                                } else {
                                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, e5.c.f10652a, 0.0f);
                                }
                                bVar2.f7517a.d("contentFade").a(ofFloat4);
                                arrayList5.add(ofFloat4);
                                AnimatorSet animatorSet3 = new AnimatorSet();
                                a1.c.i1(animatorSet3, arrayList5);
                                animatorSet3.addListener(new a(z13, view2, view));
                                size = arrayList4.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    animatorSet3.addListener((Animator.AnimatorListener) arrayList4.get(i10));
                                }
                                return animatorSet3;
                            }
                        }
                        findViewById = ((ViewGroup) view2).getChildAt(0);
                    }
                    if (findViewById instanceof ViewGroup) {
                        viewGroup = (ViewGroup) findViewById;
                    }
                    if (viewGroup != null) {
                    }
                }
                AnimatorSet animatorSet32 = new AnimatorSet();
                a1.c.i1(animatorSet32, arrayList5);
                animatorSet32.addListener(new a(z13, view2, view));
                size = arrayList4.size();
                while (i10 < size) {
                }
                return animatorSet32;
            }
        }
        f10 = width;
        arrayList2 = arrayList;
        if (z16) {
        }
        if (z12) {
        }
        z14 = view2 instanceof ViewGroup;
        if (!z14) {
        }
        AnimatorSet animatorSet322 = new AnimatorSet();
        a1.c.i1(animatorSet322, arrayList5);
        animatorSet322.addListener(new a(z13, view2, view));
        size = arrayList4.size();
        while (i10 < size) {
        }
        return animatorSet322;
    }

    public final float v(View view, View view2, a1.b bVar) {
        RectF rectF = this.f7510d;
        RectF rectF2 = this.f7511e;
        y(view, rectF);
        rectF.offset(this.f7513g, this.f7514h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, a1.b bVar) {
        RectF rectF = this.f7510d;
        RectF rectF2 = this.f7511e;
        y(view, rectF);
        rectF.offset(this.f7513g, this.f7514h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f7512f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);
}
