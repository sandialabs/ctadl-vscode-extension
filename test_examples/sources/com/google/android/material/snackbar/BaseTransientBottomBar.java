package com.google.android.material.snackbar;

import a3.j0;
import a3.v0;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.noto.R;
import e6.h;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import r2.a;
import u5.j;
import u5.n;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public final int f7295a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7296b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f7297d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f7298e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f7299f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f7300g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f7301h;

    /* renamed from: i  reason: collision with root package name */
    public final f f7302i;

    /* renamed from: j  reason: collision with root package name */
    public final h f7303j;

    /* renamed from: k  reason: collision with root package name */
    public int f7304k;

    /* renamed from: l  reason: collision with root package name */
    public d f7305l;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f7307o;

    /* renamed from: p  reason: collision with root package name */
    public int f7308p;

    /* renamed from: q  reason: collision with root package name */
    public int f7309q;

    /* renamed from: r  reason: collision with root package name */
    public int f7310r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7311s;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f7312t;

    /* renamed from: v  reason: collision with root package name */
    public static final s3.b f7290v = e5.a.f10648b;

    /* renamed from: w  reason: collision with root package name */
    public static final LinearInterpolator f7291w = e5.a.f10647a;

    /* renamed from: x  reason: collision with root package name */
    public static final s3.c f7292x = e5.a.f10649d;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f7294z = {R.attr.snackbarStyle};
    public static final String A = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: y  reason: collision with root package name */
    public static final Handler f7293y = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: m  reason: collision with root package name */
    public final b f7306m = new b();

    /* renamed from: u  reason: collision with root package name */
    public final c f7313u = new c();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j  reason: collision with root package name */
        public final e f7314j = new e(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            e eVar = this.f7314j;
            eVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g.b().e(eVar.f7319a);
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g b5 = g.b();
                c cVar = eVar.f7319a;
                synchronized (b5.f7342a) {
                    if (b5.c(cVar)) {
                        g.c cVar2 = b5.c;
                        if (!cVar2.c) {
                            cVar2.c = true;
                            b5.f7343b.removeCallbacksAndMessages(cVar2);
                        }
                    }
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f7314j.getClass();
            return view instanceof f;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            boolean z10;
            int i10 = message.what;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i12 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.f7312t;
                if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                    z10 = false;
                    if (z10) {
                        f fVar = baseTransientBottomBar.f7302i;
                        if (fVar.getVisibility() == 0) {
                            if (fVar.getAnimationMode() == 1) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                ofFloat.setInterpolator(baseTransientBottomBar.f7297d);
                                ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                                ofFloat.setDuration(baseTransientBottomBar.f7296b);
                                ofFloat.addListener(new e6.a(baseTransientBottomBar, i12));
                                ofFloat.start();
                            } else {
                                ValueAnimator valueAnimator = new ValueAnimator();
                                int[] iArr = new int[2];
                                iArr[0] = 0;
                                int height = fVar.getHeight();
                                ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                }
                                iArr[1] = height;
                                valueAnimator.setIntValues(iArr);
                                valueAnimator.setInterpolator(baseTransientBottomBar.f7298e);
                                valueAnimator.setDuration(baseTransientBottomBar.c);
                                valueAnimator.addListener(new e6.c(baseTransientBottomBar, i12));
                                valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                                valueAnimator.start();
                            }
                            return true;
                        }
                    }
                    baseTransientBottomBar.d();
                    return true;
                }
                z10 = true;
                if (z10) {
                }
                baseTransientBottomBar.d();
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            f fVar2 = baseTransientBottomBar2.f7302i;
            if (fVar2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = fVar2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.f) {
                    CoordinatorLayout.f fVar3 = (CoordinatorLayout.f) layoutParams2;
                    Behavior behavior = new Behavior();
                    e eVar = behavior.f7314j;
                    eVar.getClass();
                    eVar.f7319a = baseTransientBottomBar2.f7313u;
                    behavior.f6831b = new com.google.android.material.snackbar.e(baseTransientBottomBar2);
                    fVar3.b(behavior);
                    if (baseTransientBottomBar2.c() == null) {
                        fVar3.f4598g = 80;
                    }
                }
                fVar2.f7330s = true;
                ViewGroup viewGroup = baseTransientBottomBar2.f7300g;
                viewGroup.addView(fVar2);
                fVar2.f7330s = false;
                if (baseTransientBottomBar2.c() != null) {
                    int[] iArr2 = new int[2];
                    baseTransientBottomBar2.c().getLocationOnScreen(iArr2);
                    int i13 = iArr2[1];
                    int[] iArr3 = new int[2];
                    viewGroup.getLocationOnScreen(iArr3);
                    i11 = (viewGroup.getHeight() + iArr3[1]) - i13;
                }
                if (i11 != baseTransientBottomBar2.f7310r) {
                    baseTransientBottomBar2.f7310r = i11;
                    baseTransientBottomBar2.g();
                }
                fVar2.setVisibility(4);
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(fVar2)) {
                baseTransientBottomBar2.f();
            } else {
                baseTransientBottomBar2.f7311s = true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f7302i != null && (context = baseTransientBottomBar.f7301h) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i10 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                f fVar = baseTransientBottomBar.f7302i;
                fVar.getLocationOnScreen(iArr);
                int height = (i10 - (fVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f7302i.getTranslationY());
                if (height >= baseTransientBottomBar.f7309q) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f7302i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (baseTransientBottomBar.f7309q - height) + marginLayoutParams.bottomMargin;
                baseTransientBottomBar.f7302i.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void a() {
            Handler handler = BaseTransientBottomBar.f7293y;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void b(int i10) {
            Handler handler = BaseTransientBottomBar.f7293y;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<BaseTransientBottomBar> f7317i;

        /* renamed from: j  reason: collision with root package name */
        public final WeakReference<View> f7318j;

        public d(Snackbar snackbar, View view) {
            this.f7317i = new WeakReference<>(snackbar);
            this.f7318j = new WeakReference<>(view);
        }

        public final void a() {
            WeakReference<View> weakReference = this.f7318j;
            if (weakReference.get() != null) {
                weakReference.get().removeOnAttachStateChangeListener(this);
                View view = weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.f7317i.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z10;
            WeakReference<BaseTransientBottomBar> weakReference = this.f7317i;
            if (weakReference.get() == null) {
                a();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                s3.b bVar = BaseTransientBottomBar.f7290v;
                weakReference.get().getClass();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            boolean z10;
            if (this.f7317i.get() == null) {
                a();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            boolean z10;
            if (this.f7317i.get() == null) {
                a();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public c f7319a;

        public e(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f6835g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f6836h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f6833e = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends FrameLayout {

        /* renamed from: t  reason: collision with root package name */
        public static final a f7320t = new a();

        /* renamed from: i  reason: collision with root package name */
        public BaseTransientBottomBar<?> f7321i;

        /* renamed from: j  reason: collision with root package name */
        public final k f7322j;

        /* renamed from: k  reason: collision with root package name */
        public int f7323k;

        /* renamed from: l  reason: collision with root package name */
        public final float f7324l;

        /* renamed from: m  reason: collision with root package name */
        public final float f7325m;
        public final int n;

        /* renamed from: o  reason: collision with root package name */
        public final int f7326o;

        /* renamed from: p  reason: collision with root package name */
        public ColorStateList f7327p;

        /* renamed from: q  reason: collision with root package name */
        public PorterDuff.Mode f7328q;

        /* renamed from: r  reason: collision with root package name */
        public Rect f7329r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f7330s;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(i6.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Drawable g10;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a1.b.f55u0);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f7323k = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f7322j = new k(k.b(context2, attributeSet, 0, 0));
            }
            this.f7324l = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(x5.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(n.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f7325m = obtainStyledAttributes.getFloat(1, 1.0f);
            this.n = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f7326o = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f7320t);
            setFocusable(true);
            if (getBackground() == null) {
                int p02 = a1.b.p0(getBackgroundOverlayColorAlpha(), a1.b.T(this, R.attr.colorSurface), a1.b.T(this, R.attr.colorOnSurface));
                k kVar = this.f7322j;
                if (kVar != null) {
                    s3.b bVar = BaseTransientBottomBar.f7290v;
                    b6.g gVar = new b6.g(kVar);
                    gVar.n(ColorStateList.valueOf(p02));
                    gradientDrawable = gVar;
                } else {
                    Resources resources = getResources();
                    s3.b bVar2 = BaseTransientBottomBar.f7290v;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(p02);
                    gradientDrawable = gradientDrawable2;
                }
                if (this.f7327p != null) {
                    g10 = r2.a.g(gradientDrawable);
                    a.b.h(g10, this.f7327p);
                } else {
                    g10 = r2.a.g(gradientDrawable);
                }
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.d.q(this, g10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7321i = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f7325m;
        }

        public int getAnimationMode() {
            return this.f7323k;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f7324l;
        }

        public int getMaxInlineActionWidth() {
            return this.f7326o;
        }

        public int getMaxWidth() {
            return this.n;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Insets mandatorySystemGestureInsets;
            int i10;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7321i;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f7302i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                        i10 = mandatorySystemGestureInsets.bottom;
                        baseTransientBottomBar.f7309q = i10;
                        baseTransientBottomBar.g();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.h.c(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDetachedFromWindow() {
            boolean z10;
            boolean z11;
            boolean z12;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7321i;
            if (baseTransientBottomBar != null) {
                g b5 = g.b();
                c cVar = baseTransientBottomBar.f7313u;
                synchronized (b5.f7342a) {
                    try {
                        z10 = true;
                        if (!b5.c(cVar)) {
                            g.c cVar2 = b5.f7344d;
                            if (cVar2 != null) {
                                if (cVar != null && cVar2.f7346a.get() == cVar) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z11 = true;
                                    if (z11) {
                                        z10 = false;
                                    }
                                }
                            }
                            z11 = false;
                            if (z11) {
                            }
                        }
                    } finally {
                    }
                }
                if (z10) {
                    BaseTransientBottomBar.f7293y.post(new e6.f(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f7321i;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f7311s) {
                baseTransientBottomBar.f();
                baseTransientBottomBar.f7311s = false;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.n;
            if (i12 <= 0 || getMeasuredWidth() <= i12) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }

        public void setAnimationMode(int i10) {
            this.f7323k = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f7327p != null) {
                drawable = r2.a.g(drawable.mutate());
                a.b.h(drawable, this.f7327p);
                a.b.i(drawable, this.f7328q);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f7327p = colorStateList;
            if (getBackground() != null) {
                Drawable g10 = r2.a.g(getBackground().mutate());
                a.b.h(g10, colorStateList);
                a.b.i(g10, this.f7328q);
                if (g10 != getBackground()) {
                    super.setBackgroundDrawable(g10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f7328q = mode;
            if (getBackground() != null) {
                Drawable g10 = r2.a.g(getBackground().mutate());
                a.b.i(g10, mode);
                if (g10 != getBackground()) {
                    super.setBackgroundDrawable(g10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f7330s && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f7329r = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f7321i;
                if (baseTransientBottomBar != null) {
                    s3.b bVar = BaseTransientBottomBar.f7290v;
                    baseTransientBottomBar.g();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f7320t);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z10;
        int i10;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f7300g = viewGroup;
                this.f7303j = snackbarContentLayout2;
                this.f7301h = context;
                j.c(context, j.f17821a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7294z);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = R.layout.mtrl_layout_snackbar;
                } else {
                    i10 = R.layout.design_layout_snackbar;
                }
                f fVar = (f) from.inflate(i10, viewGroup, false);
                this.f7302i = fVar;
                fVar.setBaseTransientBottomBar(this);
                float actionTextColorAlpha = fVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f7332j.setTextColor(a1.b.p0(actionTextColorAlpha, a1.b.T(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f7332j.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(fVar.getMaxInlineActionWidth());
                fVar.addView(snackbarContentLayout);
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.g.f(fVar, 1);
                j0.d.s(fVar, 1);
                fVar.setFitsSystemWindows(true);
                j0.i.u(fVar, new e6.d(this));
                j0.p(fVar, new e6.e(this));
                this.f7312t = (AccessibilityManager) context.getSystemService("accessibility");
                this.c = v5.a.c(context, R.attr.motionDurationLong2, 250);
                this.f7295a = v5.a.c(context, R.attr.motionDurationLong2, 150);
                this.f7296b = v5.a.c(context, R.attr.motionDurationMedium1, 75);
                this.f7297d = v5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f7291w);
                this.f7299f = v5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f7292x);
                this.f7298e = v5.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f7290v);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public void a() {
        b(3);
    }

    public final void b(int i10) {
        g.c cVar;
        boolean z10;
        g b5 = g.b();
        c cVar2 = this.f7313u;
        synchronized (b5.f7342a) {
            try {
                if (b5.c(cVar2)) {
                    cVar = b5.c;
                } else {
                    g.c cVar3 = b5.f7344d;
                    boolean z11 = false;
                    if (cVar3 != null) {
                        if (cVar2 != null && cVar3.f7346a.get() == cVar2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        cVar = b5.f7344d;
                    }
                }
                b5.a(cVar, i10);
            } finally {
            }
        }
    }

    public final View c() {
        d dVar = this.f7305l;
        if (dVar == null) {
            return null;
        }
        return dVar.f7318j.get();
    }

    public final void d() {
        g b5 = g.b();
        c cVar = this.f7313u;
        synchronized (b5.f7342a) {
            try {
                if (b5.c(cVar)) {
                    b5.c = null;
                    g.c cVar2 = b5.f7344d;
                    if (cVar2 != null && cVar2 != null) {
                        b5.c = cVar2;
                        b5.f7344d = null;
                        g.b bVar = cVar2.f7346a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            b5.c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f7302i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7302i);
        }
    }

    public final void e() {
        g b5 = g.b();
        c cVar = this.f7313u;
        synchronized (b5.f7342a) {
            try {
                if (b5.c(cVar)) {
                    b5.f(b5.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f7312t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        f fVar = this.f7302i;
        if (z10) {
            fVar.post(new com.google.android.material.snackbar.f(this));
            return;
        }
        if (fVar.getParent() != null) {
            fVar.setVisibility(0);
        }
        e();
    }

    public final void g() {
        int i10;
        boolean z10;
        f fVar = this.f7302i;
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && fVar.f7329r != null) {
            if (fVar.getParent() == null) {
                return;
            }
            if (c() != null) {
                i10 = this.f7310r;
            } else {
                i10 = this.n;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = fVar.f7329r;
            marginLayoutParams.bottomMargin = rect.bottom + i10;
            marginLayoutParams.leftMargin = rect.left + this.f7307o;
            marginLayoutParams.rightMargin = rect.right + this.f7308p;
            marginLayoutParams.topMargin = rect.top;
            fVar.requestLayout();
            if (Build.VERSION.SDK_INT >= 29) {
                boolean z11 = false;
                if (this.f7309q > 0) {
                    ViewGroup.LayoutParams layoutParams2 = fVar.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).f4593a instanceof SwipeDismissBehavior)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    b bVar = this.f7306m;
                    fVar.removeCallbacks(bVar);
                    fVar.post(bVar);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(A, "Unable to update margins because layout params are not MarginLayoutParams");
    }
}
