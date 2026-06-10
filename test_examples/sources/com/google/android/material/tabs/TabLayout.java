package com.google.android.material.tabs;

import a3.d0;
import a3.j0;
import a3.m;
import a3.v0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i1;
import b3.g;
import com.noto.R;
import e3.h;
import g5.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k4.b;
import r2.a;
import u5.j;
import u5.n;

@b.InterfaceC0139b
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: f0  reason: collision with root package name */
    public static final z2.d f7351f0 = new z2.d(16);
    public final float A;
    public final int B;
    public int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public com.google.android.material.tabs.a Q;
    public final TimeInterpolator R;
    public c S;
    public final ArrayList<c> T;
    public i U;
    public ValueAnimator V;
    public k4.b W;

    /* renamed from: a0  reason: collision with root package name */
    public g f7352a0;

    /* renamed from: b0  reason: collision with root package name */
    public b f7353b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f7354d0;

    /* renamed from: e0  reason: collision with root package name */
    public final h1.c f7355e0;

    /* renamed from: i  reason: collision with root package name */
    public int f7356i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<f> f7357j;

    /* renamed from: k  reason: collision with root package name */
    public f f7358k;

    /* renamed from: l  reason: collision with root package name */
    public final e f7359l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7360m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7361o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7362p;

    /* renamed from: q  reason: collision with root package name */
    public final int f7363q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7364r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7365s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f7366t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f7367u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f7368v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f7369w;

    /* renamed from: x  reason: collision with root package name */
    public int f7370x;

    /* renamed from: y  reason: collision with root package name */
    public final PorterDuff.Mode f7371y;

    /* renamed from: z  reason: collision with root package name */
    public final float f7372z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.e {
        public b() {
        }

        @Override // k4.b.e
        public final void a(k4.b bVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.W == bVar) {
                tabLayout.g();
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends f> {
        void a();

        void b();

        void c(T t10);
    }

    /* loaded from: classes.dex */
    public interface d extends c<f> {
    }

    /* loaded from: classes.dex */
    public class e extends LinearLayout {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ int f7375l = 0;

        /* renamed from: i  reason: collision with root package name */
        public ValueAnimator f7376i;

        /* renamed from: j  reason: collision with root package name */
        public int f7377j;

        public e(Context context) {
            super(context);
            this.f7377j = -1;
            setWillNotDraw(false);
        }

        public final void a(int i10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7354d0 != 0) {
                return;
            }
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.a aVar = tabLayout.Q;
            Drawable drawable = tabLayout.f7369w;
            aVar.getClass();
            RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
            tabLayout.f7356i = i10;
        }

        public final void b(int i10) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f7369w.getBounds();
            tabLayout.f7369w.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.Q.b(tabLayout, view, view2, f10, tabLayout.f7369w);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f7369w;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f7369w.getBounds().bottom);
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        }

        public final void d(int i10, int i11, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7356i == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f7356i = i10;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f7376i = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.R);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.start();
                return;
            }
            this.f7376i.removeAllUpdateListeners();
            this.f7376i.addUpdateListener(bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.f7369w.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.f7369w.getIntrinsicHeight();
            }
            int i10 = tabLayout.J;
            if (i10 != 0) {
                if (i10 != 1) {
                    height = 0;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            height2 = 0;
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
                if (tabLayout.f7369w.getBounds().width() > 0) {
                    Rect bounds = tabLayout.f7369w.getBounds();
                    tabLayout.f7369w.setBounds(bounds.left, height, bounds.right, height2);
                    tabLayout.f7369w.draw(canvas);
                }
                super.draw(canvas);
            }
            height = getHeight() - height2;
            height2 = getHeight();
            if (tabLayout.f7369w.getBounds().width() > 0) {
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f7376i;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f7356i == -1) {
                tabLayout.f7356i = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f7356i);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.H == 1 || tabLayout.K == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) n.b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    tabLayout.H = 0;
                    tabLayout.k(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f7377j == i10) {
                return;
            }
            requestLayout();
            this.f7377j = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f7379a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f7380b;
        public CharSequence c;

        /* renamed from: e  reason: collision with root package name */
        public View f7382e;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f7384g;

        /* renamed from: h  reason: collision with root package name */
        public h f7385h;

        /* renamed from: d  reason: collision with root package name */
        public int f7381d = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f7383f = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f7386i = -1;
    }

    /* loaded from: classes.dex */
    public static class g implements b.f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f7387a;

        /* renamed from: b  reason: collision with root package name */
        public int f7388b;

        public g(TabLayout tabLayout) {
            this.f7387a = new WeakReference<>(tabLayout);
        }

        @Override // k4.b.f
        public final void a(int i10) {
            this.f7388b = i10;
            TabLayout tabLayout = this.f7387a.get();
            if (tabLayout != null) {
                tabLayout.f7354d0 = this.f7388b;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h extends LinearLayout {

        /* renamed from: t  reason: collision with root package name */
        public static final /* synthetic */ int f7389t = 0;

        /* renamed from: i  reason: collision with root package name */
        public f f7390i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f7391j;

        /* renamed from: k  reason: collision with root package name */
        public ImageView f7392k;

        /* renamed from: l  reason: collision with root package name */
        public View f7393l;

        /* renamed from: m  reason: collision with root package name */
        public g5.a f7394m;
        public View n;

        /* renamed from: o  reason: collision with root package name */
        public TextView f7395o;

        /* renamed from: p  reason: collision with root package name */
        public ImageView f7396p;

        /* renamed from: q  reason: collision with root package name */
        public Drawable f7397q;

        /* renamed from: r  reason: collision with root package name */
        public int f7398r;

        public h(Context context) {
            super(context);
            d0 d0Var;
            this.f7398r = 2;
            f(context);
            int i10 = TabLayout.this.f7360m;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.e.k(this, i10, TabLayout.this.n, TabLayout.this.f7361o, TabLayout.this.f7362p);
            setGravity(17);
            setOrientation(!TabLayout.this.L ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                d0Var = new d0(d0.a.b(context2, 1002));
            } else {
                d0Var = new d0(null);
            }
            if (i11 >= 24) {
                j0.k.d(this, d0Var.f168a);
            }
        }

        private g5.a getBadge() {
            return this.f7394m;
        }

        private g5.a getOrCreateBadge() {
            if (this.f7394m == null) {
                this.f7394m = new g5.a(getContext());
            }
            c();
            g5.a aVar = this.f7394m;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(View view) {
            boolean z10;
            if (this.f7394m != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                g5.a aVar = this.f7394m;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, null);
                if (aVar.c() != null) {
                    aVar.c().setForeground(aVar);
                } else {
                    view.getOverlay().add(aVar);
                }
                this.f7393l = view;
            }
        }

        public final void b() {
            boolean z10;
            if (this.f7394m != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f7393l;
            if (view != null) {
                g5.a aVar = this.f7394m;
                if (aVar != null) {
                    if (aVar.c() != null) {
                        aVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f7393l = null;
            }
        }

        public final void c() {
            boolean z10;
            f fVar;
            View view;
            f fVar2;
            if (this.f7394m != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            if (this.n == null) {
                View view2 = this.f7392k;
                if (view2 != null && (fVar2 = this.f7390i) != null && fVar2.f7379a != null) {
                    if (this.f7393l != view2) {
                        b();
                        view = this.f7392k;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
                view2 = this.f7391j;
                if (view2 != null && (fVar = this.f7390i) != null && fVar.f7383f == 1) {
                    if (this.f7393l != view2) {
                        b();
                        view = this.f7391j;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
            }
            b();
        }

        public final void d(View view) {
            boolean z10;
            g5.a aVar = this.f7394m;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f7393l) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, null);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f7397q;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f7397q.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            boolean z10;
            g();
            f fVar = this.f7390i;
            boolean z11 = false;
            if (fVar != null) {
                TabLayout tabLayout = fVar.f7384g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == fVar.f7381d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.RippleDrawable] */
        public final void f(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.B;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable a10 = e.a.a(context, i10);
                this.f7397q = a10;
                if (a10 != null && a10.isStateful()) {
                    this.f7397q.setState(getDrawableState());
                }
            } else {
                this.f7397q = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (tabLayout.f7368v != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateList = tabLayout.f7368v;
                int[] iArr = y5.b.f18891b;
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{y5.b.f18892d, iArr, StateSet.NOTHING}, new int[]{y5.b.a(colorStateList, y5.b.c), y5.b.a(colorStateList, iArr), y5.b.a(colorStateList, y5.b.f18890a)});
                boolean z10 = tabLayout.P;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.q(this, gradientDrawable2);
            tabLayout.invalidate();
        }

        public final void g() {
            View view;
            TextView textView;
            int i10;
            ViewParent parent;
            f fVar = this.f7390i;
            ImageView imageView = null;
            if (fVar != null) {
                view = fVar.f7382e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.n;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.n);
                    }
                    addView(view);
                }
                this.n = view;
                TextView textView2 = this.f7391j;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView2 = this.f7392k;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f7392k.setImageDrawable(null);
                }
                TextView textView3 = (TextView) view.findViewById(16908308);
                this.f7395o = textView3;
                if (textView3 != null) {
                    this.f7398r = h.a.b(textView3);
                }
                imageView = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.n;
                if (view3 != null) {
                    removeView(view3);
                    this.n = null;
                }
                this.f7395o = null;
            }
            this.f7396p = imageView;
            if (this.n == null) {
                if (this.f7392k == null) {
                    ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f7392k = imageView3;
                    addView(imageView3, 0);
                }
                if (this.f7391j == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f7391j = textView4;
                    addView(textView4);
                    this.f7398r = h.a.b(this.f7391j);
                }
                TextView textView5 = this.f7391j;
                TabLayout tabLayout = TabLayout.this;
                e3.h.e(textView5, tabLayout.f7363q);
                if (isSelected() && (i10 = tabLayout.f7365s) != -1) {
                    textView = this.f7391j;
                } else {
                    textView = this.f7391j;
                    i10 = tabLayout.f7364r;
                }
                e3.h.e(textView, i10);
                ColorStateList colorStateList = tabLayout.f7366t;
                if (colorStateList != null) {
                    this.f7391j.setTextColor(colorStateList);
                }
                h(this.f7391j, this.f7392k, true);
                c();
                ImageView imageView4 = this.f7392k;
                if (imageView4 != null) {
                    imageView4.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView4));
                }
                TextView textView6 = this.f7391j;
                if (textView6 != null) {
                    textView6.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView6));
                }
            } else {
                TextView textView7 = this.f7395o;
                if (textView7 != null || imageView != null) {
                    h(textView7, imageView, false);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.c)) {
                setContentDescription(fVar.c);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f7391j, this.f7392k, this.n};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f7391j, this.f7392k, this.n};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public f getTab() {
            return this.f7390i;
        }

        public final void h(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            CharSequence charSequence2;
            int i11;
            Drawable drawable2;
            f fVar = this.f7390i;
            CharSequence charSequence3 = null;
            if (fVar != null && (drawable2 = fVar.f7379a) != null) {
                drawable = r2.a.g(drawable2).mutate();
            } else {
                drawable = null;
            }
            TabLayout tabLayout = TabLayout.this;
            if (drawable != null) {
                a.b.h(drawable, tabLayout.f7367u);
                PorterDuff.Mode mode = tabLayout.f7371y;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            f fVar2 = this.f7390i;
            if (fVar2 != null) {
                charSequence = fVar2.f7380b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z12 || this.f7390i.f7383f != 1) {
                    z11 = false;
                }
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i10 = (int) n.b(getContext(), 8);
                } else {
                    i10 = 0;
                }
                if (tabLayout.L) {
                    if (i10 != m.b(marginLayoutParams)) {
                        m.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    m.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f7390i;
            if (fVar3 != null) {
                charSequence3 = fVar3.c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequence = charSequence3;
                }
                i1.a(this, charSequence);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            g5.a aVar = this.f7394m;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) contentDescription);
                sb.append(", ");
                g5.a aVar2 = this.f7394m;
                if (aVar2.isVisible()) {
                    boolean e10 = aVar2.e();
                    g5.b bVar = aVar2.f11228m;
                    if (e10) {
                        if (bVar.f11237b.f11247q != 0 && (context = aVar2.f11224i.get()) != null) {
                            int d5 = aVar2.d();
                            int i10 = aVar2.f11230p;
                            b.a aVar3 = bVar.f11237b;
                            if (d5 <= i10) {
                                obj = context.getResources().getQuantityString(aVar3.f11247q, aVar2.d(), Integer.valueOf(aVar2.d()));
                            } else {
                                obj = context.getString(aVar3.f11248r, Integer.valueOf(i10));
                            }
                        }
                    } else {
                        obj = bVar.f11237b.f11246p;
                    }
                    sb.append(obj);
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                obj = null;
                sb.append(obj);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.c.a(0, 1, this.f7390i.f7381d, 1, isSelected()).f6375a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) g.a.f6359e.f6371a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.C, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f7391j != null) {
                float f10 = tabLayout.f7372z;
                int i12 = this.f7398r;
                ImageView imageView = this.f7392k;
                boolean z10 = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    TextView textView = this.f7391j;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = tabLayout.A;
                    }
                }
                float textSize = this.f7391j.getTextSize();
                int lineCount = this.f7391j.getLineCount();
                int b5 = h.a.b(this.f7391j);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 != 0 || (b5 >= 0 && i12 != b5)) {
                    if (tabLayout.K == 1 && i13 > 0 && lineCount == 1) {
                        Layout layout = this.f7391j.getLayout();
                        if (layout != null) {
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f7391j.setTextSize(0, f10);
                        this.f7391j.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f7390i != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                f fVar = this.f7390i;
                TabLayout tabLayout = fVar.f7384g;
                if (tabLayout != null) {
                    tabLayout.h(fVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f7391j;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f7392k;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.n;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.f7390i) {
                this.f7390i = fVar;
                e();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final k4.b f7400a;

        public i(k4.b bVar) {
            this.f7400a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(f fVar) {
            this.f7400a.setCurrentItem(fVar.f7381d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.tabStyle, 2132083552), attributeSet, R.attr.tabStyle);
        int i10;
        this.f7356i = -1;
        this.f7357j = new ArrayList<>();
        this.f7365s = -1;
        this.f7370x = 0;
        this.C = Integer.MAX_VALUE;
        this.N = -1;
        this.T = new ArrayList<>();
        this.f7355e0 = new h1.c(12, 1);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f7359l = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d5 = j.d(context2, attributeSet, a1.b.f59w0, R.attr.tabStyle, 2132083552, 24);
        if (getBackground() instanceof ColorDrawable) {
            b6.g gVar = new b6.g();
            gVar.n(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.k(context2);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            gVar.m(j0.i.i(this));
            j0.d.q(this, gVar);
        }
        setSelectedTabIndicator(x5.c.d(context2, d5, 5));
        setSelectedTabIndicatorColor(d5.getColor(8, 0));
        eVar.b(d5.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d5.getInt(10, 0));
        setTabIndicatorAnimationMode(d5.getInt(7, 0));
        setTabIndicatorFullWidth(d5.getBoolean(9, true));
        int dimensionPixelSize = d5.getDimensionPixelSize(16, 0);
        this.f7362p = dimensionPixelSize;
        this.f7361o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.f7360m = dimensionPixelSize;
        this.f7360m = d5.getDimensionPixelSize(19, dimensionPixelSize);
        this.n = d5.getDimensionPixelSize(20, dimensionPixelSize);
        this.f7361o = d5.getDimensionPixelSize(18, dimensionPixelSize);
        this.f7362p = d5.getDimensionPixelSize(17, dimensionPixelSize);
        if (x5.b.b(context2, R.attr.isMaterial3Theme, false)) {
            i10 = R.attr.textAppearanceTitleSmall;
        } else {
            i10 = R.attr.textAppearanceButton;
        }
        this.f7363q = i10;
        int resourceId = d5.getResourceId(24, 2132083190);
        this.f7364r = resourceId;
        int[] iArr = a1.b.H;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f7372z = dimensionPixelSize2;
            this.f7366t = x5.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d5.hasValue(22)) {
                this.f7365s = d5.getResourceId(22, resourceId);
            }
            int i11 = this.f7365s;
            if (i11 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i11, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a10 = x5.c.a(context2, obtainStyledAttributes, 3);
                    if (a10 != null) {
                        this.f7366t = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{a10.getColorForState(new int[]{16842913}, a10.getDefaultColor()), this.f7366t.getDefaultColor()});
                    }
                    obtainStyledAttributes.recycle();
                } finally {
                }
            }
            if (d5.hasValue(25)) {
                this.f7366t = x5.c.a(context2, d5, 25);
            }
            if (d5.hasValue(23)) {
                this.f7366t = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d5.getColor(23, 0), this.f7366t.getDefaultColor()});
            }
            this.f7367u = x5.c.a(context2, d5, 3);
            this.f7371y = n.f(d5.getInt(4, -1), null);
            this.f7368v = x5.c.a(context2, d5, 21);
            this.I = d5.getInt(6, 300);
            this.R = v5.a.d(context2, R.attr.motionEasingEmphasizedInterpolator, e5.a.f10648b);
            this.D = d5.getDimensionPixelSize(14, -1);
            this.E = d5.getDimensionPixelSize(13, -1);
            this.B = d5.getResourceId(0, 0);
            this.G = d5.getDimensionPixelSize(1, 0);
            this.K = d5.getInt(15, 1);
            this.H = d5.getInt(2, 0);
            this.L = d5.getBoolean(12, false);
            this.P = d5.getBoolean(26, false);
            d5.recycle();
            Resources resources = getResources();
            this.A = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.F = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.f7357j;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                f fVar = arrayList.get(i10);
                if (fVar != null && fVar.f7379a != null && !TextUtils.isEmpty(fVar.f7380b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (z10 && !this.L) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.D;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.K;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.F;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f7359l.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        e eVar = this.f7359l;
        int childCount = eVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = eVar.getChildAt(i11);
                boolean z10 = true;
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                } else {
                    childAt.setSelected(i11 == i10);
                    if (i11 != i10) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                    if (childAt instanceof h) {
                        ((h) childAt).g();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(View view) {
        h hVar;
        CharSequence charSequence;
        float f10;
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            f fVar = (f) f7351f0.a();
            if (fVar == null) {
                fVar = new f();
            }
            fVar.f7384g = this;
            h1.c cVar = this.f7355e0;
            if (cVar != null) {
                hVar = (h) cVar.a();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                hVar = new h(getContext());
            }
            hVar.setTab(fVar);
            hVar.setFocusable(true);
            hVar.setMinimumWidth(getTabMinWidth());
            if (TextUtils.isEmpty(fVar.c)) {
                charSequence = fVar.f7380b;
            } else {
                charSequence = fVar.c;
            }
            hVar.setContentDescription(charSequence);
            fVar.f7385h = hVar;
            int i10 = fVar.f7386i;
            if (i10 != -1) {
                hVar.setId(i10);
            }
            CharSequence charSequence2 = tabItem.f7348i;
            if (charSequence2 != null) {
                if (TextUtils.isEmpty(fVar.c) && !TextUtils.isEmpty(charSequence2)) {
                    fVar.f7385h.setContentDescription(charSequence2);
                }
                fVar.f7380b = charSequence2;
                h hVar2 = fVar.f7385h;
                if (hVar2 != null) {
                    hVar2.e();
                }
            }
            Drawable drawable = tabItem.f7349j;
            if (drawable != null) {
                fVar.f7379a = drawable;
                TabLayout tabLayout = fVar.f7384g;
                if (tabLayout.H == 1 || tabLayout.K == 2) {
                    tabLayout.k(true);
                }
                h hVar3 = fVar.f7385h;
                if (hVar3 != null) {
                    hVar3.e();
                }
            }
            int i11 = tabItem.f7350k;
            if (i11 != 0) {
                fVar.f7382e = LayoutInflater.from(fVar.f7385h.getContext()).inflate(i11, (ViewGroup) fVar.f7385h, false);
                h hVar4 = fVar.f7385h;
                if (hVar4 != null) {
                    hVar4.e();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                fVar.c = tabItem.getContentDescription();
                h hVar5 = fVar.f7385h;
                if (hVar5 != null) {
                    hVar5.e();
                }
            }
            ArrayList<f> arrayList = this.f7357j;
            boolean isEmpty = arrayList.isEmpty();
            int size = arrayList.size();
            if (fVar.f7384g == this) {
                fVar.f7381d = size;
                arrayList.add(size, fVar);
                int size2 = arrayList.size();
                int i12 = -1;
                for (int i13 = size + 1; i13 < size2; i13++) {
                    if (arrayList.get(i13).f7381d == this.f7356i) {
                        i12 = i13;
                    }
                    arrayList.get(i13).f7381d = i13;
                }
                this.f7356i = i12;
                h hVar6 = fVar.f7385h;
                hVar6.setSelected(false);
                hVar6.setActivated(false);
                int i14 = fVar.f7381d;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.K == 1 && this.H == 0) {
                    layoutParams.width = 0;
                    f10 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f10 = 0.0f;
                }
                layoutParams.weight = f10;
                this.f7359l.addView(hVar6, i14, layoutParams);
                if (isEmpty) {
                    TabLayout tabLayout2 = fVar.f7384g;
                    if (tabLayout2 != null) {
                        tabLayout2.h(fVar, true);
                        return;
                    }
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                return;
            }
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public final void b(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(this)) {
                e eVar = this.f7359l;
                int childCount = eVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        if (eVar.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int d5 = d(i10);
                    if (scrollX != d5) {
                        e();
                        this.V.setIntValues(scrollX, d5);
                        this.V.start();
                    }
                    ValueAnimator valueAnimator = eVar.f7376i;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f7356i != i10) {
                        eVar.f7376i.cancel();
                    }
                    eVar.d(i10, this.I, true);
                    return;
                }
            }
        }
        i(i10, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int max;
        int i10;
        int i11 = this.K;
        if (i11 != 0 && i11 != 2) {
            max = 0;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            e eVar = this.f7359l;
            j0.e.k(eVar, max, 0, 0, 0);
            i10 = this.K;
            if (i10 == 0) {
                if (i10 == 1 || i10 == 2) {
                    if (this.H == 2) {
                        Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                    }
                    eVar.setGravity(1);
                }
            } else {
                int i12 = this.H;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                        }
                    } else {
                        eVar.setGravity(1);
                    }
                } else {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                }
                eVar.setGravity(8388611);
            }
            k(true);
        }
        max = Math.max(0, this.G - this.f7360m);
        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
        e eVar2 = this.f7359l;
        j0.e.k(eVar2, max, 0, 0, 0);
        i10 = this.K;
        if (i10 == 0) {
        }
        k(true);
    }

    public final int d(int i10) {
        View view;
        int i11 = this.K;
        int i12 = 0;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        e eVar = this.f7359l;
        View childAt = eVar.getChildAt(i10);
        if (childAt == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < eVar.getChildCount()) {
            view = eVar.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * 0.0f);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    public final void e() {
        if (this.V == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.V = valueAnimator;
            valueAnimator.setInterpolator(this.R);
            this.V.setDuration(this.I);
            this.V.addUpdateListener(new a());
        }
    }

    public final f f(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f7357j.get(i10);
        }
        return null;
    }

    public final void g() {
        e eVar = this.f7359l;
        for (int childCount = eVar.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f7355e0.b(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f7357j.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f7384g = null;
            next.f7385h = null;
            next.f7379a = null;
            next.f7386i = -1;
            next.f7380b = null;
            next.c = null;
            next.f7381d = -1;
            next.f7382e = null;
            f7351f0.b(next);
        }
        this.f7358k = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f7358k;
        if (fVar != null) {
            return fVar.f7381d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f7357j.size();
    }

    public int getTabGravity() {
        return this.H;
    }

    public ColorStateList getTabIconTint() {
        return this.f7367u;
    }

    public int getTabIndicatorAnimationMode() {
        return this.O;
    }

    public int getTabIndicatorGravity() {
        return this.J;
    }

    public int getTabMaxWidth() {
        return this.C;
    }

    public int getTabMode() {
        return this.K;
    }

    public ColorStateList getTabRippleColor() {
        return this.f7368v;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f7369w;
    }

    public ColorStateList getTabTextColors() {
        return this.f7366t;
    }

    public final void h(f fVar, boolean z10) {
        int i10;
        f fVar2 = this.f7358k;
        ArrayList<c> arrayList = this.T;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
                b(fVar.f7381d);
                return;
            }
            return;
        }
        if (fVar != null) {
            i10 = fVar.f7381d;
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((fVar2 == null || fVar2.f7381d == -1) && i10 != -1) {
                i(i10, true, true);
            } else {
                b(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f7358k = fVar;
        if (fVar2 != null && fVar2.f7384g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).b();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).c(fVar);
            }
        }
    }

    public final void i(int i10, boolean z10, boolean z11) {
        int d5;
        float f10 = i10 + 0.0f;
        int round = Math.round(f10);
        if (round >= 0) {
            e eVar = this.f7359l;
            if (round < eVar.getChildCount()) {
                if (z11) {
                    TabLayout.this.f7356i = Math.round(f10);
                    ValueAnimator valueAnimator = eVar.f7376i;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        eVar.f7376i.cancel();
                    }
                    eVar.c(eVar.getChildAt(i10), eVar.getChildAt(i10 + 1), 0.0f);
                }
                ValueAnimator valueAnimator2 = this.V;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.V.cancel();
                }
                if (i10 < 0) {
                    d5 = 0;
                } else {
                    d5 = d(i10);
                }
                scrollTo(d5, 0);
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void j(k4.b bVar, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        k4.b bVar2 = this.W;
        if (bVar2 != null) {
            g gVar = this.f7352a0;
            if (gVar != null && (arrayList2 = bVar2.f12886y) != null) {
                arrayList2.remove(gVar);
            }
            b bVar3 = this.f7353b0;
            if (bVar3 != null && (arrayList = this.W.A) != null) {
                arrayList.remove(bVar3);
            }
        }
        i iVar = this.U;
        ArrayList<c> arrayList3 = this.T;
        if (iVar != null) {
            arrayList3.remove(iVar);
            this.U = null;
        }
        if (bVar != null) {
            this.W = bVar;
            if (this.f7352a0 == null) {
                this.f7352a0 = new g(this);
            }
            g gVar2 = this.f7352a0;
            gVar2.f7388b = 0;
            if (bVar.f12886y == null) {
                bVar.f12886y = new ArrayList();
            }
            bVar.f12886y.add(gVar2);
            i iVar2 = new i(bVar);
            this.U = iVar2;
            if (!arrayList3.contains(iVar2)) {
                arrayList3.add(iVar2);
            }
            bVar.getAdapter();
            if (this.f7353b0 == null) {
                this.f7353b0 = new b();
            }
            b bVar4 = this.f7353b0;
            bVar4.getClass();
            if (bVar.A == null) {
                bVar.A = new ArrayList();
            }
            bVar.A.add(bVar4);
            i(bVar.getCurrentItem(), true, true);
        } else {
            this.W = null;
            g();
        }
        this.c0 = z10;
    }

    public final void k(boolean z10) {
        float f10;
        int i10 = 0;
        while (true) {
            e eVar = this.f7359l;
            if (i10 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i10);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.K == 1 && this.H == 0) {
                    layoutParams.width = 0;
                    f10 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f10 = 0.0f;
                }
                layoutParams.weight = f10;
                if (z10) {
                    childAt.requestLayout();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ma.i.L(this);
        if (this.W == null) {
            ViewParent parent = getParent();
            if (parent instanceof k4.b) {
                j((k4.b) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c0) {
            setupWithViewPager(null);
            this.c0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            e eVar = this.f7359l;
            if (i10 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i10);
                if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).f7397q) != null) {
                    drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                    hVar.f7397q.draw(canvas);
                }
                i10++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, getTabCount(), 1).f6374a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z10 = false;
            if (!z10 && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        z10 = true;
        return !z10 ? false : false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int round = Math.round(n.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        boolean z10 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.E;
            if (i12 <= 0) {
                i12 = (int) (size - n.b(getContext(), 56));
            }
            this.C = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() != 1) {
            return;
        }
        View childAt = getChildAt(0);
        int i13 = this.K;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                }
            }
            if (z10) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            return;
        }
        if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
            z10 = true;
        }
        if (z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[RETURN] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z10 = false;
                if (!z10) {
                    return false;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof b6.g) {
            ((b6.g) background).m(f10);
        }
    }

    public void setInlineLabel(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            int i10 = 0;
            while (true) {
                e eVar = this.f7359l;
                if (i10 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i10);
                    if (childAt instanceof h) {
                        h hVar = (h) childAt;
                        hVar.setOrientation(!TabLayout.this.L ? 1 : 0);
                        TextView textView = hVar.f7395o;
                        if (textView == null && hVar.f7396p == null) {
                            hVar.h(hVar.f7391j, hVar.f7392k, true);
                        }
                        hVar.h(textView, hVar.f7396p, false);
                    }
                    i10++;
                } else {
                    c();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.S;
        ArrayList<c> arrayList = this.T;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.S = cVar;
        if (cVar != null && !arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.V.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i10) {
        setSelectedTabIndicator(i10 != 0 ? e.a.a(getContext(), i10) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = r2.a.g(drawable).mutate();
        this.f7369w = mutate;
        q5.a.d(mutate, this.f7370x);
        int i10 = this.N;
        if (i10 == -1) {
            i10 = this.f7369w.getIntrinsicHeight();
        }
        this.f7359l.b(i10);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f7370x = i10;
        q5.a.d(this.f7369w, i10);
        k(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.J != i10) {
            this.J = i10;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this.f7359l);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.N = i10;
        this.f7359l.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.H != i10) {
            this.H = i10;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f7367u != colorStateList) {
            this.f7367u = colorStateList;
            ArrayList<f> arrayList = this.f7357j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayList.get(i10).f7385h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(n2.a.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        com.google.android.material.tabs.a aVar;
        this.O = i10;
        if (i10 == 0) {
            aVar = new com.google.android.material.tabs.a();
        } else if (i10 == 1) {
            aVar = new g6.a();
        } else if (i10 != 2) {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        } else {
            aVar = new g6.b();
        }
        this.Q = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.M = z10;
        int i10 = e.f7375l;
        e eVar = this.f7359l;
        eVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.k(eVar);
    }

    public void setTabMode(int i10) {
        if (i10 != this.K) {
            this.K = i10;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f7368v != colorStateList) {
            this.f7368v = colorStateList;
            int i10 = 0;
            while (true) {
                e eVar = this.f7359l;
                if (i10 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i10);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i11 = h.f7389t;
                        ((h) childAt).f(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(n2.a.c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f7366t != colorStateList) {
            this.f7366t = colorStateList;
            ArrayList<f> arrayList = this.f7357j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayList.get(i10).f7385h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(k4.a aVar) {
        g();
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            int i10 = 0;
            while (true) {
                e eVar = this.f7359l;
                if (i10 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i10);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i11 = h.f7389t;
                        ((h) childAt).f(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(k4.b bVar) {
        j(bVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
