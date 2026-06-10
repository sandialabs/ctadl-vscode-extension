package androidx.appcompat.widget;

import a3.b1;
import a3.j0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.noto.R;
import d.k;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h0, a3.u, a3.v {
    public static final int[] J = {R.attr.actionBarSize, 16842841};
    public a3.b1 A;
    public a3.b1 B;
    public d C;
    public OverScroller D;
    public ViewPropertyAnimator E;
    public final a F;
    public final b G;
    public final c H;
    public final a3.w I;

    /* renamed from: i  reason: collision with root package name */
    public int f714i;

    /* renamed from: j  reason: collision with root package name */
    public int f715j;

    /* renamed from: k  reason: collision with root package name */
    public ContentFrameLayout f716k;

    /* renamed from: l  reason: collision with root package name */
    public ActionBarContainer f717l;

    /* renamed from: m  reason: collision with root package name */
    public i0 f718m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f719o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f720p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f721q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f722r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f723s;

    /* renamed from: t  reason: collision with root package name */
    public int f724t;

    /* renamed from: u  reason: collision with root package name */
    public int f725u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f726v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f727w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f728x;

    /* renamed from: y  reason: collision with root package name */
    public a3.b1 f729y;

    /* renamed from: z  reason: collision with root package name */
    public a3.b1 f730z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f723s = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f723s = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.E = actionBarOverlayLayout.f717l.animate().translationY(0.0f).setListener(actionBarOverlayLayout.F);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.E = actionBarOverlayLayout.f717l.animate().translationY(-actionBarOverlayLayout.f717l.getHeight()).setListener(actionBarOverlayLayout.F);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f715j = 0;
        this.f726v = new Rect();
        this.f727w = new Rect();
        this.f728x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        a3.b1 b1Var = a3.b1.f139b;
        this.f729y = b1Var;
        this.f730z = b1Var;
        this.A = b1Var;
        this.B = b1Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        r(context);
        this.I = new a3.w();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.h0
    public final boolean a() {
        s();
        return this.f718m.a();
    }

    @Override // androidx.appcompat.widget.h0
    public final void b() {
        s();
        this.f718m.b();
    }

    @Override // androidx.appcompat.widget.h0
    public final boolean c() {
        s();
        return this.f718m.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.h0
    public final boolean d() {
        s();
        return this.f718m.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.n == null || this.f719o) {
            return;
        }
        if (this.f717l.getVisibility() == 0) {
            i10 = (int) (this.f717l.getTranslationY() + this.f717l.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.n.setBounds(0, i10, getWidth(), this.n.getIntrinsicHeight() + i10);
        this.n.draw(canvas);
    }

    @Override // androidx.appcompat.widget.h0
    public final boolean e() {
        s();
        return this.f718m.e();
    }

    @Override // a3.u
    public final void f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.h0
    public final void g(androidx.appcompat.view.menu.f fVar, k.b bVar) {
        s();
        this.f718m.g(fVar, bVar);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f717l;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        a3.w wVar = this.I;
        return wVar.f219b | wVar.f218a;
    }

    public CharSequence getTitle() {
        s();
        return this.f718m.getTitle();
    }

    @Override // androidx.appcompat.widget.h0
    public final boolean h() {
        s();
        return this.f718m.h();
    }

    @Override // a3.u
    public final void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a3.u
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.h0
    public final void k(int i10) {
        s();
        if (i10 == 2) {
            this.f718m.s();
        } else if (i10 == 5) {
            this.f718m.t();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.h0
    public final void l() {
        s();
        this.f718m.i();
    }

    @Override // a3.v
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // a3.u
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // a3.u
    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        a3.b1 i10 = a3.b1.i(this, windowInsets);
        boolean p10 = p(this.f717l, new Rect(i10.d(), i10.f(), i10.e(), i10.c()), false);
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        Rect rect = this.f726v;
        j0.i.b(this, i10, rect);
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        b1.k kVar = i10.f140a;
        a3.b1 m10 = kVar.m(i11, i12, i13, i14);
        this.f729y = m10;
        boolean z10 = true;
        if (!this.f730z.equals(m10)) {
            this.f730z = this.f729y;
            p10 = true;
        }
        Rect rect2 = this.f727w;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f140a.c().f140a.b().h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        j0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        b1.e bVar;
        a3.b1 b5;
        s();
        measureChildWithMargins(this.f717l, i10, 0, i11, 0);
        e eVar = (e) this.f717l.getLayoutParams();
        int max = Math.max(0, this.f717l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f717l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f717l.getMeasuredState());
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if ((j0.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f714i;
            if (this.f721q && this.f717l.getTabContainer() != null) {
                measuredHeight += this.f714i;
            }
        } else {
            measuredHeight = this.f717l.getVisibility() != 8 ? this.f717l.getMeasuredHeight() : 0;
        }
        Rect rect = this.f726v;
        Rect rect2 = this.f728x;
        rect2.set(rect);
        a3.b1 b1Var = this.f729y;
        this.A = b1Var;
        if (!this.f720p && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            b5 = b1Var.f140a.m(0, measuredHeight, 0, 0);
        } else {
            q2.b b10 = q2.b.b(b1Var.d(), this.A.f() + measuredHeight, this.A.e(), this.A.c() + 0);
            a3.b1 b1Var2 = this.A;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                bVar = new b1.d(b1Var2);
            } else if (i12 >= 29) {
                bVar = new b1.c(b1Var2);
            } else {
                bVar = new b1.b(b1Var2);
            }
            bVar.g(b10);
            b5 = bVar.b();
        }
        this.A = b5;
        p(this.f716k, rect2, true);
        if (!this.B.equals(this.A)) {
            a3.b1 b1Var3 = this.A;
            this.B = b1Var3;
            ContentFrameLayout contentFrameLayout = this.f716k;
            WindowInsets h10 = b1Var3.h();
            if (h10 != null) {
                WindowInsets a10 = j0.h.a(contentFrameLayout, h10);
                if (!a10.equals(h10)) {
                    a3.b1.i(contentFrameLayout, a10);
                }
            }
        }
        measureChildWithMargins(this.f716k, i10, 0, i11, 0);
        e eVar2 = (e) this.f716k.getLayoutParams();
        int max3 = Math.max(max, this.f716k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f716k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f716k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (this.f722r && z10) {
            this.D.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.D.getFinalY() > this.f717l.getHeight()) {
                z11 = true;
            }
            if (z11) {
                q();
                this.H.run();
            } else {
                q();
                this.G.run();
            }
            this.f723s = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f724t + i11;
        this.f724t = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        d.b0 b0Var;
        i.g gVar;
        this.I.f218a = i10;
        this.f724t = getActionBarHideOffset();
        q();
        d dVar = this.C;
        if (dVar != null && (gVar = (b0Var = (d.b0) dVar).f10227t) != null) {
            gVar.a();
            b0Var.f10227t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f717l.getVisibility() == 0) {
            return this.f722r;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f722r && !this.f723s) {
            if (this.f724t <= this.f717l.getHeight()) {
                q();
                postDelayed(this.G, 600L);
                return;
            }
            q();
            postDelayed(this.H, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f725u ^ i10;
        this.f725u = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.C;
        if (dVar != null) {
            ((d.b0) dVar).f10223p = !z11;
            if (!z10 && z11) {
                d.b0 b0Var = (d.b0) dVar;
                if (!b0Var.f10224q) {
                    b0Var.f10224q = true;
                    b0Var.g(true);
                }
            }
            d.b0 b0Var2 = (d.b0) dVar;
            if (b0Var2.f10224q) {
                b0Var2.f10224q = false;
                b0Var2.g(true);
            }
        }
        if ((i11 & 256) != 0 && this.C != null) {
            WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
            j0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f715j = i10;
        d dVar = this.C;
        if (dVar != null) {
            ((d.b0) dVar).f10222o = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f714i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f719o = context.getApplicationInfo().targetSdkVersion < 19;
        this.D = new OverScroller(context);
    }

    public final void s() {
        i0 wrapper;
        if (this.f716k == null) {
            this.f716k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f717l = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof i0) {
                wrapper = (i0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f718m = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f717l.setTranslationY(-Math.max(0, Math.min(i10, this.f717l.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            ((d.b0) this.C).f10222o = this.f715j;
            int i10 = this.f725u;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                j0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f721q = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f722r) {
            this.f722r = z10;
            if (z10) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        s();
        this.f718m.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f718m.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.f718m.q(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f720p = z10;
        this.f719o = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f718m.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f718m.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
