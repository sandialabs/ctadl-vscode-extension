package com.google.android.material.bottomappbar;

import a3.c1;
import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.g;
import b6.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.R;
import e5.i;
import h5.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p.h;
import r2.a;
import u5.j;
import u5.m;
import u5.n;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int B0 = 0;
    public final b A0;

    /* renamed from: d0  reason: collision with root package name */
    public Integer f6844d0;

    /* renamed from: e0  reason: collision with root package name */
    public final g f6845e0;

    /* renamed from: f0  reason: collision with root package name */
    public Animator f6846f0;

    /* renamed from: g0  reason: collision with root package name */
    public Animator f6847g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6848h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6849i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f6850j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f6851k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f6852l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f6853m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f6854n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6855o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f6856p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f6857q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f6858r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6859s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6860t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f6861u0;

    /* renamed from: v0  reason: collision with root package name */
    public Behavior f6862v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f6863w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6864x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6865y0;

    /* renamed from: z0  reason: collision with root package name */
    public final a f6866z0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f6867j;

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<BottomAppBar> f6868k;

        /* renamed from: l  reason: collision with root package name */
        public int f6869l;

        /* renamed from: m  reason: collision with root package name */
        public final a f6870m;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f6868k.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        int measuredWidth = floatingActionButton.getMeasuredWidth();
                        int measuredHeight = floatingActionButton.getMeasuredHeight();
                        Rect rect = behavior.f6867j;
                        rect.set(0, 0, measuredWidth, measuredHeight);
                        floatingActionButton.k(rect);
                        int height2 = rect.height();
                        bottomAppBar.I(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f6436e.a(new RectF(rect)));
                        height = height2;
                    }
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (behavior.f6869l == 0) {
                        int measuredHeight2 = (view.getMeasuredHeight() - height) / 2;
                        int i18 = bottomAppBar.f6850j0;
                        if (i18 == 1) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight2);
                        } else if (i18 == 0) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        boolean e10 = n.e(view);
                        int i19 = bottomAppBar.f6851k0;
                        if (e10) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += i19;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += i19;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f6870m = new a();
            this.f6867j = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6870m = new a();
            this.f6867j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f6868k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.B0;
            View z10 = bottomAppBar.z();
            if (z10 != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (!j0.g.c(z10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
                    fVar.f4595d = 17;
                    int i12 = bottomAppBar.f6850j0;
                    if (i12 == 1) {
                        fVar.f4595d = 49;
                    }
                    if (i12 == 0) {
                        fVar.f4595d |= 80;
                    }
                    this.f6869l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) z10.getLayoutParams())).bottomMargin;
                    if (z10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z10;
                        if (bottomAppBar.f6850j0 == 0 && bottomAppBar.f6854n0) {
                            j0.i.s(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d(bottomAppBar.f6866z0);
                        floatingActionButton.e(new h5.e(bottomAppBar));
                        floatingActionButton.f(bottomAppBar.A0);
                    }
                    z10.addOnLayoutChangeListener(this.f6870m);
                    bottomAppBar.H();
                }
            }
            coordinatorLayout.r(bottomAppBar, i10);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (!bottomAppBar.f6860t0) {
                bottomAppBar.D(bottomAppBar.f6848h0, bottomAppBar.f6861u0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements i<FloatingActionButton> {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i10 = BottomAppBar.B0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.getClass();
            bottomAppBar.f6860t0 = false;
            bottomAppBar.f6847g0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i10 = BottomAppBar.B0;
            BottomAppBar.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f6875i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int f6876j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f6877k;

        public d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f6875i = actionMenuView;
            this.f6876j = i10;
            this.f6877k = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f6876j;
            boolean z10 = this.f6877k;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f6875i;
            actionMenuView.setTranslationX(bottomAppBar.A(actionMenuView, i10, z10));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends h3.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f6879k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6880l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new e[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6879k = parcel.readInt();
            this.f6880l = parcel.readInt() != 0;
        }

        public e(Toolbar.i iVar) {
            super(iVar);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f6879k);
            parcel.writeInt(this.f6880l ? 1 : 0);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.bottomAppBarStyle, 2132083727), attributeSet, R.attr.bottomAppBarStyle);
        g gVar = new g();
        this.f6845e0 = gVar;
        this.f6859s0 = 0;
        this.f6860t0 = false;
        this.f6861u0 = true;
        this.f6866z0 = new a();
        this.A0 = new b();
        Context context2 = getContext();
        TypedArray d5 = j.d(context2, attributeSet, a1.b.Q, R.attr.bottomAppBarStyle, 2132083727, new int[0]);
        ColorStateList a10 = x5.c.a(context2, d5, 1);
        if (d5.hasValue(12)) {
            setNavigationIconTint(d5.getColor(12, -1));
        }
        int dimensionPixelSize = d5.getDimensionPixelSize(2, 0);
        this.f6848h0 = d5.getInt(3, 0);
        this.f6849i0 = d5.getInt(6, 0);
        this.f6850j0 = d5.getInt(5, 1);
        this.f6854n0 = d5.getBoolean(16, true);
        this.f6853m0 = d5.getInt(11, 0);
        this.f6855o0 = d5.getBoolean(10, false);
        this.f6856p0 = d5.getBoolean(13, false);
        this.f6857q0 = d5.getBoolean(14, false);
        this.f6858r0 = d5.getBoolean(15, false);
        this.f6852l0 = d5.getDimensionPixelOffset(4, -1);
        boolean z10 = d5.getBoolean(0, true);
        d5.recycle();
        this.f6851k0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        f fVar = new f(d5.getDimensionPixelOffset(7, 0), d5.getDimensionPixelOffset(8, 0), d5.getDimensionPixelOffset(9, 0));
        k.a aVar = new k.a();
        aVar.f6451i = fVar;
        gVar.setShapeAppearanceModel(new k(aVar));
        if (z10) {
            gVar.r(2);
        } else {
            gVar.r(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        gVar.p(Paint.Style.FILL);
        gVar.k(context2);
        setElevation(dimensionPixelSize);
        a.b.h(gVar, a10);
        j0.d.q(this, gVar);
        h5.a aVar2 = new h5.a(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a1.b.f20b0, R.attr.bottomAppBarStyle, 2132083727);
        boolean z11 = obtainStyledAttributes.getBoolean(3, false);
        boolean z12 = obtainStyledAttributes.getBoolean(4, false);
        boolean z13 = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        n.a(this, new m(z11, z12, z13, aVar2));
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f6863w0;
    }

    private int getFabAlignmentAnimationDuration() {
        return v5.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return B(this.f6848h0);
    }

    private float getFabTranslationY() {
        if (this.f6850j0 == 1) {
            return -getTopEdgeTreatment().f11450l;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f6865y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f6864x0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f getTopEdgeTreatment() {
        return (f) this.f6845e0.f6391i.f6409a.f6440i;
    }

    public final int A(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11 = 0;
        if (this.f6853m0 == 1 || (i10 == 1 && z10)) {
            boolean e10 = n.e(this);
            int measuredWidth = e10 ? getMeasuredWidth() : 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f10201a & 8388615) == 8388611) {
                    measuredWidth = e10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            int right = e10 ? actionMenuView.getRight() : actionMenuView.getLeft();
            int i13 = e10 ? this.f6864x0 : -this.f6865y0;
            if (getNavigationIcon() == null) {
                i11 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
                if (!e10) {
                    i11 = -i11;
                }
            }
            return measuredWidth - ((right + i13) + i11);
        }
        return 0;
    }

    public final float B(int i10) {
        boolean e10 = n.e(this);
        if (i10 == 1) {
            View z10 = z();
            int i11 = e10 ? this.f6865y0 : this.f6864x0;
            return ((getMeasuredWidth() / 2) - ((this.f6852l0 == -1 || z10 == null) ? this.f6851k0 + i11 : ((z10.getMeasuredWidth() / 2) + this.f6852l0) + i11)) * (e10 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean C() {
        FloatingActionButton y10 = y();
        return y10 != null && y10.j();
    }

    public final void D(int i10, boolean z10) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (!j0.g.c(this)) {
            this.f6860t0 = false;
            F(this.f6859s0);
            return;
        }
        Animator animator = this.f6847g0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!C()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
            if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                ofFloat2.addListener(new h5.d(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f6847g0 = animatorSet2;
        animatorSet2.addListener(new c());
        this.f6847g0.start();
    }

    public final void E() {
        getBehavior().u(this);
    }

    public final void F(int i10) {
        if (i10 != 0) {
            this.f6859s0 = 0;
            getMenu().clear();
            k(i10);
        }
    }

    public final void G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f6847g0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!C()) {
                J(actionMenuView, 0, false, false);
            } else {
                J(actionMenuView, this.f6848h0, this.f6861u0, false);
            }
        }
    }

    public final void H() {
        float f10;
        getTopEdgeTreatment().f11451m = getFabTranslationX();
        g gVar = this.f6845e0;
        if (this.f6861u0 && C() && this.f6850j0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        gVar.o(f10);
        View z10 = z();
        if (z10 != null) {
            z10.setTranslationY(getFabTranslationY());
            z10.setTranslationX(getFabTranslationX());
        }
    }

    public final void I(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().f11449k) {
            getTopEdgeTreatment().f11449k = f10;
            this.f6845e0.invalidateSelf();
        }
    }

    public final void J(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        d dVar = new d(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(dVar);
        } else {
            dVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f6845e0.f6391i.f6413f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f6862v0 == null) {
            this.f6862v0 = new Behavior();
        }
        return this.f6862v0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f11450l;
    }

    public int getFabAlignmentMode() {
        return this.f6848h0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f6852l0;
    }

    public int getFabAnchorMode() {
        return this.f6850j0;
    }

    public int getFabAnimationMode() {
        return this.f6849i0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f11448j;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f11447i;
    }

    public boolean getHideOnScroll() {
        return this.f6855o0;
    }

    public int getMenuAlignmentMode() {
        return this.f6853m0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ma.i.M(this, this.f6845e0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f6847g0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f6846f0;
            if (animator2 != null) {
                animator2.cancel();
            }
            H();
            View z11 = z();
            if (z11 != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.g.c(z11)) {
                    z11.post(new c1(z11, 1));
                }
            }
        }
        G();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f11358i);
        this.f6848h0 = eVar.f6879k;
        this.f6861u0 = eVar.f6880l;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e((Toolbar.i) super.onSaveInstanceState());
        eVar.f6879k = this.f6848h0;
        eVar.f6880l = this.f6861u0;
        return eVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(this.f6845e0, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f11450l = f10;
                this.f6845e0.invalidateSelf();
                H();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        g gVar = this.f6845e0;
        gVar.m(f10);
        int i10 = gVar.f6391i.f6423q - gVar.i();
        Behavior behavior = getBehavior();
        behavior.f6827h = i10;
        if (behavior.f6826g == 1) {
            setTranslationY(behavior.f6825f + i10);
        }
    }

    public void setFabAlignmentMode(int i10) {
        this.f6859s0 = 0;
        this.f6860t0 = true;
        D(i10, this.f6861u0);
        if (this.f6848h0 != i10) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(this)) {
                Animator animator = this.f6846f0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f6849i0 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y(), "translationX", B(i10));
                    ofFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton y10 = y();
                    if (y10 != null && !y10.i()) {
                        y10.h(new h5.c(this, i10), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(v5.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, e5.a.f10647a));
                this.f6846f0 = animatorSet;
                animatorSet.addListener(new h5.b(this));
                this.f6846f0.start();
            }
        }
        this.f6848h0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f6852l0 != i10) {
            this.f6852l0 = i10;
            H();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f6850j0 = i10;
        H();
        View z10 = z();
        if (z10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
            fVar.f4595d = 17;
            int i11 = this.f6850j0;
            if (i11 == 1) {
                fVar.f4595d = 49;
            }
            if (i11 == 0) {
                fVar.f4595d |= 80;
            }
            z10.requestLayout();
            this.f6845e0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f6849i0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().n) {
            getTopEdgeTreatment().n = f10;
            this.f6845e0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f11448j = f10;
            this.f6845e0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f11447i = f10;
            this.f6845e0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f6855o0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f6853m0 != i10) {
            this.f6853m0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                J(actionMenuView, this.f6848h0, C(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6844d0 != null) {
            drawable = r2.a.g(drawable.mutate());
            a.b.g(drawable, this.f6844d0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f6844d0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton y() {
        View z10 = z();
        if (z10 instanceof FloatingActionButton) {
            return (FloatingActionButton) z10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View z() {
        List<View> arrayList;
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        ArrayList arrayList2 = (ArrayList) ((h) ((CoordinatorLayout) getParent()).f4575j.f10382b).getOrDefault(this, null);
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        if (arrayList == null) {
            arrayList = Collections.emptyList();
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (r0.hasNext()) {
            }
        }
        return null;
    }
}
