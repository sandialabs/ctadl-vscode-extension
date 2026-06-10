package com.google.android.material.floatingactionbutton;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.g;
import b6.k;
import b6.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.noto.R;
import e5.i;
import h5.c;
import h5.e;
import h5.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p.h;
import u5.j;
import u5.n;
import u5.p;

/* loaded from: classes.dex */
public class FloatingActionButton extends p implements s5.a, o, CoordinatorLayout.b {

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f7125j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f7126k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f7127l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f7128m;
    public ColorStateList n;

    /* renamed from: o  reason: collision with root package name */
    public int f7129o;

    /* renamed from: p  reason: collision with root package name */
    public int f7130p;

    /* renamed from: q  reason: collision with root package name */
    public int f7131q;

    /* renamed from: r  reason: collision with root package name */
    public int f7132r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7133s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f7134t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f7135u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.appcompat.widget.p f7136v;

    /* renamed from: w  reason: collision with root package name */
    public final s5.b f7137w;

    /* renamed from: x  reason: collision with root package name */
    public t5.d f7138x;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f7139a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7140b;

        public BaseBehavior() {
            this.f7140b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.Z);
            this.f7140b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f7134t;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f4599h == 0) {
                fVar.f4599h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f4593a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> e10 = coordinatorLayout.e(floatingActionButton);
            int size = e10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = e10.get(i13);
                if (view2 instanceof AppBarLayout) {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f4593a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && u(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            Rect rect = floatingActionButton.f7134t;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    j0.k(floatingActionButton, i12);
                }
                if (i11 != 0) {
                    j0.j(floatingActionButton, i11);
                    return true;
                }
                return true;
            }
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f7140b || fVar.f4597f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f7139a == null) {
                this.f7139a = new Rect();
            }
            Rect rect = this.f7139a;
            ThreadLocal<Matrix> threadLocal = u5.c.f17803a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            u5.c.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.n(null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (s(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.h(null, false);
                    return true;
                }
                floatingActionButton.n(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements a6.b {
        public b() {
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f7142a;

        public c(BottomAppBar.b bVar) {
            this.f7142a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            f topEdgeTreatment;
            f topEdgeTreatment2;
            f topEdgeTreatment3;
            f topEdgeTreatment4;
            BottomAppBar.b bVar = (BottomAppBar.b) this.f7142a;
            bVar.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f6850j0 == 1) {
                FloatingActionButton floatingActionButton = FloatingActionButton.this;
                float translationX = floatingActionButton.getTranslationX();
                topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
                float f10 = topEdgeTreatment.f11451m;
                g gVar = bottomAppBar.f6845e0;
                if (f10 != translationX) {
                    topEdgeTreatment4 = bottomAppBar.getTopEdgeTreatment();
                    topEdgeTreatment4.f11451m = translationX;
                    gVar.invalidateSelf();
                }
                float f11 = 0.0f;
                float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                topEdgeTreatment2 = bottomAppBar.getTopEdgeTreatment();
                if (topEdgeTreatment2.f11450l != max) {
                    topEdgeTreatment3 = bottomAppBar.getTopEdgeTreatment();
                    if (max >= 0.0f) {
                        topEdgeTreatment3.f11450l = max;
                        gVar.invalidateSelf();
                    } else {
                        topEdgeTreatment3.getClass();
                        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                    }
                }
                if (floatingActionButton.getVisibility() == 0) {
                    f11 = floatingActionButton.getScaleY();
                }
                gVar.o(f11);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            float f10;
            BottomAppBar.b bVar = (BottomAppBar.b) this.f7142a;
            bVar.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            g gVar = bottomAppBar.f6845e0;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            if (floatingActionButton.getVisibility() == 0 && bottomAppBar.f6850j0 == 1) {
                f10 = floatingActionButton.getScaleY();
            } else {
                f10 = 0.0f;
            }
            gVar.o(f10);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f7142a.equals(this.f7142a);
        }

        public final int hashCode() {
            return this.f7142a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, 2132083548), attributeSet, R.attr.floatingActionButtonStyle);
        this.f7134t = new Rect();
        this.f7135u = new Rect();
        Context context2 = getContext();
        TypedArray d5 = j.d(context2, attributeSet, a1.b.Y, R.attr.floatingActionButtonStyle, 2132083548, new int[0]);
        this.f7125j = x5.c.a(context2, d5, 1);
        this.f7126k = n.f(d5.getInt(2, -1), null);
        this.n = x5.c.a(context2, d5, 12);
        this.f7129o = d5.getInt(7, -1);
        this.f7130p = d5.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d5.getDimensionPixelSize(3, 0);
        float dimension = d5.getDimension(4, 0.0f);
        float dimension2 = d5.getDimension(9, 0.0f);
        float dimension3 = d5.getDimension(11, 0.0f);
        this.f7133s = d5.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d5.getDimensionPixelSize(10, 0));
        e5.g a10 = e5.g.a(context2, d5, 15);
        e5.g a11 = e5.g.a(context2, d5, 8);
        b6.i iVar = k.f6432m;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a1.b.f36k0, R.attr.floatingActionButtonStyle, 2132083548);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        k kVar = new k(k.a(context2, resourceId, resourceId2, iVar));
        boolean z10 = d5.getBoolean(5, false);
        setEnabled(d5.getBoolean(0, true));
        d5.recycle();
        androidx.appcompat.widget.p pVar = new androidx.appcompat.widget.p(this);
        this.f7136v = pVar;
        pVar.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.f7137w = new s5.b(this);
        getImpl().n(kVar);
        getImpl().g(this.f7125j, this.f7126k, this.n, dimensionPixelSize);
        getImpl().f7160k = dimensionPixelSize2;
        d impl = getImpl();
        if (impl.f7157h != dimension) {
            impl.f7157h = dimension;
            impl.k(dimension, impl.f7158i, impl.f7159j);
        }
        d impl2 = getImpl();
        if (impl2.f7158i != dimension2) {
            impl2.f7158i = dimension2;
            impl2.k(impl2.f7157h, dimension2, impl2.f7159j);
        }
        d impl3 = getImpl();
        if (impl3.f7159j != dimension3) {
            impl3.f7159j = dimension3;
            impl3.k(impl3.f7157h, impl3.f7158i, dimension3);
        }
        getImpl().f7162m = a10;
        getImpl().n = a11;
        getImpl().f7155f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d getImpl() {
        if (this.f7138x == null) {
            this.f7138x = new t5.d(this, new b());
        }
        return this.f7138x;
    }

    @Override // s5.a
    public final boolean a() {
        return this.f7137w.f17278b;
    }

    public final void d(BottomAppBar.a aVar) {
        d impl = getImpl();
        if (impl.f7168t == null) {
            impl.f7168t = new ArrayList<>();
        }
        impl.f7168t.add(aVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(e eVar) {
        d impl = getImpl();
        if (impl.f7167s == null) {
            impl.f7167s = new ArrayList<>();
        }
        impl.f7167s.add(eVar);
    }

    public final void f(BottomAppBar.b bVar) {
        d impl = getImpl();
        c cVar = new c(bVar);
        if (impl.f7169u == null) {
            impl.f7169u = new ArrayList<>();
        }
        impl.f7169u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f7130p;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return resources.getDimensionPixelSize(i10 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f7125j;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f7126k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f7158i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f7159j;
    }

    public Drawable getContentBackground() {
        return getImpl().f7154e;
    }

    public int getCustomSize() {
        return this.f7130p;
    }

    public int getExpandedComponentIdHint() {
        return this.f7137w.c;
    }

    public e5.g getHideMotionSpec() {
        return getImpl().n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.n;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.n;
    }

    public k getShapeAppearanceModel() {
        k kVar = getImpl().f7151a;
        kVar.getClass();
        return kVar;
    }

    public e5.g getShowMotionSpec() {
        return getImpl().f7162m;
    }

    public int getSize() {
        return this.f7129o;
    }

    public int getSizeDimension() {
        return g(this.f7129o);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7127l;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f7128m;
    }

    public boolean getUseCompatPadding() {
        return this.f7133s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r6.f7166r == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(h5.c cVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar;
        boolean z11;
        int i10;
        AnimatorSet c10;
        d impl = getImpl();
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = new com.google.android.material.floatingactionbutton.a(this, cVar);
        }
        boolean z12 = false;
        if (impl.f7170v.getVisibility() != 0) {
            if (impl.f7166r != 2) {
                z11 = true;
            }
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f7161l;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            FloatingActionButton floatingActionButton = impl.f7170v;
            if (j0.g.c(floatingActionButton) && !floatingActionButton.isInEditMode()) {
                z12 = true;
            }
            if (z12) {
                e5.g gVar = impl.n;
                if (gVar != null) {
                    c10 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    c10 = impl.c(0.0f, 0.4f, 0.4f, d.F, d.G);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f7168t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            if (aVar != null) {
                aVar.f7144a.a(aVar.f7145b);
            }
        }
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.f7170v.getVisibility();
        int i10 = impl.f7166r;
        if (visibility == 0) {
            if (i10 == 1) {
                return true;
            }
        } else if (i10 != 2) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        d impl = getImpl();
        int visibility = impl.f7170v.getVisibility();
        int i10 = impl.f7166r;
        if (visibility != 0) {
            if (i10 == 2) {
                return true;
            }
        } else if (i10 != 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f7134t;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f7127l;
        if (colorStateList == null) {
            r2.a.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f7128m;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.k.c(colorForState, mode));
    }

    public final void m() {
        n(null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r6.f7166r == 2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(c.a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z11;
        boolean z12;
        AnimatorSet c10;
        float f10;
        float f11;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z13 = true;
        if (impl.f7170v.getVisibility() == 0) {
            if (impl.f7166r != 1) {
                z11 = true;
            }
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f7161l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f7162m == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            FloatingActionButton floatingActionButton = impl.f7170v;
            if (!j0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z13 = false;
            }
            Matrix matrix = impl.A;
            if (z13) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f12 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z12) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f10);
                    if (z12) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f11);
                    if (z12) {
                        f12 = 0.4f;
                    }
                    impl.f7164p = f12;
                    impl.a(f12, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                e5.g gVar = impl.f7162m;
                if (gVar != null) {
                    c10 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c10 = impl.c(1.0f, 1.0f, 1.0f, d.D, d.E);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f7167s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f7164p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f7144a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        g gVar = impl.f7152b;
        FloatingActionButton floatingActionButton = impl.f7170v;
        if (gVar != null) {
            ma.i.M(floatingActionButton, gVar);
        }
        if (!(impl instanceof t5.d)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new t5.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f7170v.getViewTreeObserver();
        t5.c cVar = impl.B;
        if (cVar != null) {
            viewTreeObserver.removeOnPreDrawListener(cVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f7131q = (sizeDimension - this.f7132r) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f7134t;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f6.a aVar = (f6.a) parcelable;
        super.onRestoreInstanceState(aVar.f11358i);
        Bundle orDefault = aVar.f10942k.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        s5.b bVar = this.f7137w;
        bVar.getClass();
        bVar.f17278b = orDefault.getBoolean("expanded", false);
        bVar.c = orDefault.getInt("expandedComponentIdHint", 0);
        if (bVar.f17278b) {
            View view = bVar.f17277a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        f6.a aVar = new f6.a(onSaveInstanceState);
        h<String, Bundle> hVar = aVar.f10942k;
        s5.b bVar = this.f7137w;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f17278b);
        bundle.putInt("expandedComponentIdHint", bVar.c);
        hVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            boolean c10 = j0.g.c(this);
            Rect rect = this.f7135u;
            if (c10) {
                rect.set(0, 0, getWidth(), getHeight());
                k(rect);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f7125j != colorStateList) {
            this.f7125j = colorStateList;
            d impl = getImpl();
            g gVar = impl.f7152b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            t5.a aVar = impl.f7153d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f17586m = colorStateList.getColorForState(aVar.getState(), aVar.f17586m);
                }
                aVar.f17588p = colorStateList;
                aVar.n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f7126k != mode) {
            this.f7126k = mode;
            g gVar = getImpl().f7152b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f7157h != f10) {
            impl.f7157h = f10;
            impl.k(f10, impl.f7158i, impl.f7159j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f7158i != f10) {
            impl.f7158i = f10;
            impl.k(impl.f7157h, f10, impl.f7159j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f7159j != f10) {
            impl.f7159j = f10;
            impl.k(impl.f7157h, impl.f7158i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f7130p) {
            this.f7130p = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = getImpl().f7152b;
        if (gVar != null) {
            gVar.m(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f7155f) {
            getImpl().f7155f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f7137w.c = i10;
    }

    public void setHideMotionSpec(e5.g gVar) {
        getImpl().n = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(e5.g.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f7164p;
            impl.f7164p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f7170v.setImageMatrix(matrix);
            if (this.f7127l != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f7136v.c(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.f7132r = i10;
        d impl = getImpl();
        if (impl.f7165q != i10) {
            impl.f7165q = i10;
            float f10 = impl.f7164p;
            impl.f7164p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f7170v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            getImpl().m(this.n);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.f> arrayList = getImpl().f7169u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.f> arrayList = getImpl().f7169u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f7156g = z10;
        impl.q();
    }

    @Override // b6.o
    public void setShapeAppearanceModel(k kVar) {
        getImpl().n(kVar);
    }

    public void setShowMotionSpec(e5.g gVar) {
        getImpl().f7162m = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(e5.g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f7130p = 0;
        if (i10 != this.f7129o) {
            this.f7129o = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7127l != colorStateList) {
            this.f7127l = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f7128m != mode) {
            this.f7128m = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f7133s != z10) {
            this.f7133s = z10;
            getImpl().i();
        }
    }

    @Override // u5.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
