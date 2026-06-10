package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.noto.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x6.i0;

/* loaded from: classes.dex */
public final class n extends RecyclerView.k implements RecyclerView.n {
    public Rect A;
    public long B;

    /* renamed from: d  reason: collision with root package name */
    public float f5934d;

    /* renamed from: e  reason: collision with root package name */
    public float f5935e;

    /* renamed from: f  reason: collision with root package name */
    public float f5936f;

    /* renamed from: g  reason: collision with root package name */
    public float f5937g;

    /* renamed from: h  reason: collision with root package name */
    public float f5938h;

    /* renamed from: i  reason: collision with root package name */
    public float f5939i;

    /* renamed from: j  reason: collision with root package name */
    public float f5940j;

    /* renamed from: k  reason: collision with root package name */
    public float f5941k;

    /* renamed from: m  reason: collision with root package name */
    public final d f5943m;

    /* renamed from: o  reason: collision with root package name */
    public int f5944o;

    /* renamed from: q  reason: collision with root package name */
    public int f5946q;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f5947r;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f5949t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5950u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5951v;

    /* renamed from: x  reason: collision with root package name */
    public a3.j f5953x;

    /* renamed from: y  reason: collision with root package name */
    public e f5954y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5932a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f5933b = new float[2];
    public RecyclerView.b0 c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f5942l = -1;
    public int n = 0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f5945p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final a f5948s = new a();

    /* renamed from: w  reason: collision with root package name */
    public View f5952w = null;

    /* renamed from: z  reason: collision with root package name */
    public final b f5955z = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
            if (r9 > 0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j2;
            int i10;
            int i11;
            int i12;
            n nVar = n.this;
            if (nVar.c != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = nVar.B;
                if (j10 == Long.MIN_VALUE) {
                    j2 = 0;
                } else {
                    j2 = currentTimeMillis - j10;
                }
                RecyclerView.l layoutManager = nVar.f5947r.getLayoutManager();
                if (nVar.A == null) {
                    nVar.A = new Rect();
                }
                layoutManager.g(nVar.c.f5666a, nVar.A);
                boolean z10 = false;
                if (layoutManager.h()) {
                    int i13 = (int) (nVar.f5940j + nVar.f5938h);
                    i10 = (i13 - nVar.A.left) - nVar.f5947r.getPaddingLeft();
                    float f10 = nVar.f5938h;
                    if (f10 < 0.0f) {
                        if (i10 < 0) {
                            if (layoutManager.i()) {
                                int i14 = (int) (nVar.f5941k + nVar.f5939i);
                                int paddingTop = (i14 - nVar.A.top) - nVar.f5947r.getPaddingTop();
                                float f11 = nVar.f5939i;
                                if (f11 < 0.0f) {
                                    if (paddingTop < 0) {
                                        i11 = paddingTop;
                                        if (i10 != 0) {
                                            d dVar = nVar.f5943m;
                                            RecyclerView recyclerView = nVar.f5947r;
                                            int width = nVar.c.f5666a.getWidth();
                                            nVar.f5947r.getWidth();
                                            i10 = dVar.h(recyclerView, width, i10, j2);
                                        }
                                        int i15 = i10;
                                        if (i11 == 0) {
                                            d dVar2 = nVar.f5943m;
                                            RecyclerView recyclerView2 = nVar.f5947r;
                                            int height = nVar.c.f5666a.getHeight();
                                            nVar.f5947r.getHeight();
                                            i12 = i15;
                                            i11 = dVar2.h(recyclerView2, height, i11, j2);
                                        } else {
                                            i12 = i15;
                                        }
                                        if (i12 == 0 && i11 == 0) {
                                            nVar.B = Long.MIN_VALUE;
                                            if (!z10) {
                                                RecyclerView.b0 b0Var = nVar.c;
                                                if (b0Var != null) {
                                                    nVar.q(b0Var);
                                                }
                                                nVar.f5947r.removeCallbacks(nVar.f5948s);
                                                RecyclerView recyclerView3 = nVar.f5947r;
                                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                                j0.d.m(recyclerView3, this);
                                                return;
                                            }
                                            return;
                                        }
                                        if (nVar.B == Long.MIN_VALUE) {
                                            nVar.B = currentTimeMillis;
                                        }
                                        nVar.f5947r.scrollBy(i12, i11);
                                        z10 = true;
                                        if (!z10) {
                                        }
                                    }
                                }
                                if (f11 > 0.0f) {
                                    paddingTop = ((nVar.c.f5666a.getHeight() + i14) + nVar.A.bottom) - (nVar.f5947r.getHeight() - nVar.f5947r.getPaddingBottom());
                                }
                            }
                            i11 = 0;
                            if (i10 != 0) {
                            }
                            int i152 = i10;
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                                nVar.B = Long.MIN_VALUE;
                                if (!z10) {
                                }
                            }
                            if (nVar.B == Long.MIN_VALUE) {
                            }
                            nVar.f5947r.scrollBy(i12, i11);
                            z10 = true;
                            if (!z10) {
                            }
                        }
                    }
                    if (f10 > 0.0f && (i10 = ((nVar.c.f5666a.getWidth() + i13) + nVar.A.right) - (nVar.f5947r.getWidth() - nVar.f5947r.getPaddingRight())) > 0) {
                        if (layoutManager.i()) {
                        }
                        i11 = 0;
                        if (i10 != 0) {
                        }
                        int i1522 = i10;
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (nVar.B == Long.MIN_VALUE) {
                        }
                        nVar.f5947r.scrollBy(i12, i11);
                        z10 = true;
                        if (!z10) {
                        }
                    }
                }
                i10 = 0;
                if (layoutManager.i()) {
                }
                i11 = 0;
                if (i10 != 0) {
                }
                int i15222 = i10;
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (nVar.B == Long.MIN_VALUE) {
                }
                nVar.f5947r.scrollBy(i12, i11);
                z10 = true;
                if (!z10) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void b(MotionEvent motionEvent) {
            n nVar = n.this;
            nVar.f5953x.f186a.f187a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = nVar.f5949t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (nVar.f5942l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(nVar.f5942l);
            if (findPointerIndex >= 0) {
                nVar.k(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.b0 b0Var = nVar.c;
            if (b0Var == null) {
                return;
            }
            int i10 = 1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == nVar.f5942l) {
                                if (actionIndex != 0) {
                                    i10 = 0;
                                }
                                nVar.f5942l = motionEvent.getPointerId(i10);
                                nVar.u(nVar.f5944o, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = nVar.f5949t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    nVar.u(nVar.f5944o, findPointerIndex, motionEvent);
                    nVar.q(b0Var);
                    RecyclerView recyclerView = nVar.f5947r;
                    a aVar = nVar.f5948s;
                    recyclerView.removeCallbacks(aVar);
                    aVar.run();
                    nVar.f5947r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            nVar.s(null, 0);
            nVar.f5942l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean c(MotionEvent motionEvent) {
            int findPointerIndex;
            n nVar = n.this;
            nVar.f5953x.f186a.f187a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                nVar.f5942l = motionEvent.getPointerId(0);
                nVar.f5934d = motionEvent.getX();
                nVar.f5935e = motionEvent.getY();
                VelocityTracker velocityTracker = nVar.f5949t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                nVar.f5949t = VelocityTracker.obtain();
                if (nVar.c == null) {
                    ArrayList arrayList = nVar.f5945p;
                    if (!arrayList.isEmpty()) {
                        View n = nVar.n(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f5967e.f5666a == n) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        nVar.f5934d -= fVar.f5971i;
                        nVar.f5935e -= fVar.f5972j;
                        RecyclerView.b0 b0Var = fVar.f5967e;
                        nVar.m(b0Var, true);
                        if (nVar.f5932a.remove(b0Var.f5666a)) {
                            nVar.f5943m.d(nVar.f5947r, b0Var);
                        }
                        nVar.s(b0Var, fVar.f5968f);
                        nVar.u(nVar.f5944o, 0, motionEvent);
                    }
                }
            } else {
                if (actionMasked != 3 && actionMasked != 1) {
                    int i10 = nVar.f5942l;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        nVar.k(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                nVar.f5942l = -1;
                nVar.s(null, 0);
            }
            VelocityTracker velocityTracker2 = nVar.f5949t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (nVar.c == null) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void e(boolean z10) {
            if (z10) {
                n.this.s(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends f {
        public final /* synthetic */ int n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.b0 f5958o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.b0 b0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.b0 b0Var2) {
            super(b0Var, i11, f10, f11, f12, f13);
            this.n = i12;
            this.f5958o = b0Var2;
        }

        @Override // androidx.recyclerview.widget.n.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f5973k) {
                return;
            }
            int i10 = this.n;
            RecyclerView.b0 b0Var = this.f5958o;
            n nVar = n.this;
            if (i10 <= 0) {
                nVar.f5943m.d(nVar.f5947r, b0Var);
            } else {
                nVar.f5932a.add(b0Var.f5666a);
                this.f5970h = true;
                if (i10 > 0) {
                    nVar.f5947r.post(new o(nVar, this, i10));
                }
            }
            View view = nVar.f5952w;
            View view2 = b0Var.f5666a;
            if (view == view2) {
                nVar.r(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5960b = new a();
        public static final b c = new b();

        /* renamed from: a  reason: collision with root package name */
        public int f5961a = -1;

        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public abstract boolean b(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.b0 c(RecyclerView.b0 b0Var, ArrayList arrayList, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = b0Var.f5666a.getWidth() + i10;
            View view = b0Var.f5666a;
            int height = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size = arrayList.size();
            RecyclerView.b0 b0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.b0 b0Var3 = (RecyclerView.b0) arrayList.get(i13);
                if (left2 > 0 && (right = b0Var3.f5666a.getRight() - width) < 0 && b0Var3.f5666a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i12) {
                    b0Var2 = b0Var3;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = b0Var3.f5666a.getLeft() - i10) > 0 && b0Var3.f5666a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    b0Var2 = b0Var3;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = b0Var3.f5666a.getTop() - i11) > 0 && b0Var3.f5666a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i12) {
                    b0Var2 = b0Var3;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = b0Var3.f5666a.getBottom() - height) < 0 && b0Var3.f5666a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    b0Var2 = b0Var3;
                    i12 = abs;
                }
            }
            return b0Var2;
        }

        public void d(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            View view = b0Var.f5666a;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.i.s(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public abstract void e(RecyclerView.b0 b0Var);

        public abstract int f(RecyclerView recyclerView, RecyclerView.b0 b0Var);

        public abstract void g(RecyclerView.b0 b0Var);

        public final int h(RecyclerView recyclerView, int i10, int i11, long j2) {
            if (this.f5961a == -1) {
                this.f5961a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i12 = this.f5961a;
            float f10 = 1.0f;
            int interpolation = (int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
            if (j2 <= 2000) {
                f10 = ((float) j2) / 2000.0f;
            }
            int interpolation2 = (int) (f5960b.getInterpolation(f10) * interpolation);
            if (interpolation2 == 0) {
                if (i11 <= 0) {
                    return -1;
                }
                return 1;
            }
            return interpolation2;
        }

        public boolean i() {
            return !(this instanceof i0);
        }

        public void j(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f10, float f11, int i10, boolean z10) {
            View view = b0Var.f5666a;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                Float valueOf = Float.valueOf(j0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (childAt != view) {
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        float i12 = j0.i.i(childAt);
                        if (i12 > f12) {
                            f12 = i12;
                        }
                    }
                }
                j0.i.s(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public abstract void k(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.b0 b0Var);

        public abstract void l(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        public void m(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10, RecyclerView.b0 b0Var2, int i11, int i12, int i13) {
            RecyclerView.l layoutManager = recyclerView.getLayoutManager();
            boolean z10 = layoutManager instanceof g;
            View view = b0Var2.f5666a;
            if (z10) {
                ((g) layoutManager).b(b0Var.f5666a, view);
                return;
            }
            if (layoutManager.h()) {
                if (view.getLeft() - RecyclerView.l.F(view) <= recyclerView.getPaddingLeft()) {
                    recyclerView.f0(i11);
                }
                if (RecyclerView.l.M(view) + view.getRight() >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.f0(i11);
                }
            }
            if (layoutManager.i()) {
                if (view.getTop() - RecyclerView.l.O(view) <= recyclerView.getPaddingTop()) {
                    recyclerView.f0(i11);
                }
                if (RecyclerView.l.y(view) + view.getBottom() >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.f0(i11);
                }
            }
        }

        public abstract void n(RecyclerView.b0 b0Var, int i10);

        public abstract void o(RecyclerView.b0 b0Var, int i10);
    }

    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5962a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            n nVar;
            View n;
            RecyclerView.b0 K;
            int i10;
            if (this.f5962a && (n = (nVar = n.this).n(motionEvent)) != null && (K = nVar.f5947r.K(n)) != null) {
                RecyclerView recyclerView = nVar.f5947r;
                d dVar = nVar.f5943m;
                int f10 = dVar.f(recyclerView, K);
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                int d5 = j0.e.d(recyclerView);
                int i11 = f10 & 3158064;
                boolean z10 = true;
                if (i11 != 0) {
                    int i12 = f10 & (~i11);
                    if (d5 == 0) {
                        i10 = i11 >> 2;
                    } else {
                        int i13 = i11 >> 1;
                        i12 |= (-3158065) & i13;
                        i10 = (i13 & 3158064) >> 2;
                    }
                    f10 = i12 | i10;
                }
                if ((16711680 & f10) == 0) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i14 = nVar.f5942l;
                if (pointerId == i14) {
                    int findPointerIndex = motionEvent.findPointerIndex(i14);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    nVar.f5934d = x3;
                    nVar.f5935e = y10;
                    nVar.f5939i = 0.0f;
                    nVar.f5938h = 0.0f;
                    if (dVar.i()) {
                        nVar.s(K, 2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f5964a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5965b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5966d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.b0 f5967e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5968f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f5969g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5970h;

        /* renamed from: i  reason: collision with root package name */
        public float f5971i;

        /* renamed from: j  reason: collision with root package name */
        public float f5972j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5973k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5974l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f5975m;

        public f(RecyclerView.b0 b0Var, int i10, float f10, float f11, float f12, float f13) {
            this.f5968f = i10;
            this.f5967e = b0Var;
            this.f5964a = f10;
            this.f5965b = f11;
            this.c = f12;
            this.f5966d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5969g = ofFloat;
            ofFloat.addUpdateListener(new p(this));
            ofFloat.setTarget(b0Var.f5666a);
            ofFloat.addListener(this);
            this.f5975m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5975m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5974l) {
                this.f5967e.p(true);
            }
            this.f5974l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void b(View view, View view2);
    }

    public n(com.airbnb.epoxy.y yVar) {
        this.f5943m = yVar;
    }

    public static boolean p(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void d(View view) {
        r(view);
        RecyclerView.b0 K = this.f5947r.K(view);
        if (K == null) {
            return;
        }
        RecyclerView.b0 b0Var = this.c;
        if (b0Var != null && K == b0Var) {
            s(null, 0);
            return;
        }
        m(K, false);
        if (this.f5932a.remove(K.f5666a)) {
            this.f5943m.d(this.f5947r, K);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    @SuppressLint({"UnknownNullness"})
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    @SuppressLint({"UnknownNullness"})
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.c != null) {
            float[] fArr = this.f5933b;
            o(fArr);
            float f14 = fArr[0];
            f11 = fArr[1];
            f10 = f14;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        RecyclerView.b0 b0Var = this.c;
        ArrayList arrayList = this.f5945p;
        int i10 = this.n;
        d dVar = this.f5943m;
        dVar.getClass();
        int i11 = 0;
        for (int size = arrayList.size(); i11 < size; size = size) {
            f fVar = (f) arrayList.get(i11);
            RecyclerView.b0 b0Var2 = fVar.f5967e;
            float f15 = fVar.f5964a;
            float f16 = fVar.c;
            if (f15 == f16) {
                f12 = b0Var2.f5666a.getTranslationX();
            } else {
                f12 = a4.b.f(f16, f15, fVar.f5975m, f15);
            }
            fVar.f5971i = f12;
            float f17 = fVar.f5965b;
            float f18 = fVar.f5966d;
            if (f17 == f18) {
                f13 = b0Var2.f5666a.getTranslationY();
            } else {
                f13 = a4.b.f(f18, f17, fVar.f5975m, f17);
            }
            fVar.f5972j = f13;
            int save = canvas.save();
            dVar.j(canvas, recyclerView, fVar.f5967e, fVar.f5971i, fVar.f5972j, fVar.f5968f, false);
            canvas.restoreToCount(save);
            i11++;
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            dVar.j(canvas, recyclerView, b0Var, f10, f11, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.f5933b;
            o(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        RecyclerView.b0 b0Var = this.c;
        ArrayList arrayList = this.f5945p;
        d dVar = this.f5943m;
        dVar.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            dVar.k(canvas, recyclerView, ((f) arrayList.get(i10)).f5967e);
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            dVar.k(canvas, recyclerView, b0Var);
            canvas.restoreToCount(save2);
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            f fVar = (f) arrayList.get(size);
            boolean z11 = fVar.f5974l;
            if (z11 && !fVar.f5970h) {
                arrayList.remove(size);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5947r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f5955z;
        if (recyclerView2 != null) {
            recyclerView2.a0(this);
            RecyclerView recyclerView3 = this.f5947r;
            recyclerView3.f5651z.remove(bVar);
            if (recyclerView3.A == bVar) {
                recyclerView3.A = null;
            }
            ArrayList arrayList = this.f5947r.L;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f5945p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.f5969g.cancel();
                this.f5943m.d(this.f5947r, fVar.f5967e);
            }
            arrayList2.clear();
            this.f5952w = null;
            VelocityTracker velocityTracker = this.f5949t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5949t = null;
            }
            e eVar = this.f5954y;
            if (eVar != null) {
                eVar.f5962a = false;
                this.f5954y = null;
            }
            if (this.f5953x != null) {
                this.f5953x = null;
            }
        }
        this.f5947r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f5936f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f5937g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f5946q = ViewConfiguration.get(this.f5947r.getContext()).getScaledTouchSlop();
            this.f5947r.g(this);
            this.f5947r.f5651z.add(bVar);
            RecyclerView recyclerView4 = this.f5947r;
            if (recyclerView4.L == null) {
                recyclerView4.L = new ArrayList();
            }
            recyclerView4.L.add(this);
            this.f5954y = new e();
            this.f5953x = new a3.j(this.f5947r.getContext(), this.f5954y);
        }
    }

    public final int j(RecyclerView.b0 b0Var, int i10) {
        if ((i10 & 12) != 0) {
            int i11 = this.f5938h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f5949t;
            d dVar = this.f5943m;
            if (velocityTracker != null && this.f5942l > -1) {
                float f10 = this.f5937g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f5949t.getXVelocity(this.f5942l);
                float yVelocity = this.f5949t.getYVelocity(this.f5942l);
                int i12 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f5936f && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            dVar.g(b0Var);
            float width = 0.5f * this.f5947r.getWidth();
            if ((i10 & i11) == 0 || Math.abs(this.f5938h) <= width) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i10, int i11, MotionEvent motionEvent) {
        View n;
        RecyclerView.b0 K;
        int i12;
        if (this.c == null && i10 == 2 && this.n != 2) {
            d dVar = this.f5943m;
            dVar.getClass();
            if (this.f5947r.getScrollState() == 1) {
                return;
            }
            RecyclerView.l layoutManager = this.f5947r.getLayoutManager();
            int i13 = this.f5942l;
            if (i13 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i13);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f5934d);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5935e);
                float f10 = this.f5946q;
                if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.h()) && ((abs2 <= abs || !layoutManager.i()) && (n = n(motionEvent)) != null))) {
                    K = this.f5947r.K(n);
                    if (K != null) {
                        return;
                    }
                    RecyclerView recyclerView = this.f5947r;
                    int f11 = dVar.f(recyclerView, K);
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    int d5 = j0.e.d(recyclerView);
                    int i14 = f11 & 3158064;
                    if (i14 != 0) {
                        int i15 = f11 & (~i14);
                        if (d5 == 0) {
                            i12 = i14 >> 2;
                        } else {
                            int i16 = i14 >> 1;
                            i15 |= (-3158065) & i16;
                            i12 = (i16 & 3158064) >> 2;
                        }
                        f11 = i15 | i12;
                    }
                    int i17 = (f11 & 65280) >> 8;
                    if (i17 == 0) {
                        return;
                    }
                    float x3 = motionEvent.getX(i11);
                    float y10 = motionEvent.getY(i11);
                    float f12 = x3 - this.f5934d;
                    float f13 = y10 - this.f5935e;
                    float abs3 = Math.abs(f12);
                    float abs4 = Math.abs(f13);
                    float f14 = this.f5946q;
                    if (abs3 < f14 && abs4 < f14) {
                        return;
                    }
                    if (abs3 > abs4) {
                        if (f12 < 0.0f && (i17 & 4) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (i17 & 8) == 0) {
                            return;
                        }
                    } else if (f13 < 0.0f && (i17 & 1) == 0) {
                        return;
                    } else {
                        if (f13 > 0.0f && (i17 & 2) == 0) {
                            return;
                        }
                    }
                    this.f5939i = 0.0f;
                    this.f5938h = 0.0f;
                    this.f5942l = motionEvent.getPointerId(0);
                    s(K, 1);
                    return;
                }
            }
            K = null;
            if (K != null) {
            }
        }
    }

    public final int l(RecyclerView.b0 b0Var, int i10) {
        if ((i10 & 3) != 0) {
            int i11 = this.f5939i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f5949t;
            d dVar = this.f5943m;
            if (velocityTracker != null && this.f5942l > -1) {
                float f10 = this.f5937g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f5949t.getXVelocity(this.f5942l);
                float yVelocity = this.f5949t.getYVelocity(this.f5942l);
                int i12 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f5936f && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            dVar.g(b0Var);
            float height = 0.5f * this.f5947r.getHeight();
            if ((i10 & i11) == 0 || Math.abs(this.f5939i) <= height) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    public final void m(RecyclerView.b0 b0Var, boolean z10) {
        f fVar;
        ArrayList arrayList = this.f5945p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
            } else {
                return;
            }
        } while (fVar.f5967e != b0Var);
        fVar.f5973k |= z10;
        if (!fVar.f5974l) {
            fVar.f5969g.cancel();
        }
        arrayList.remove(size);
    }

    public final View n(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.b0 b0Var = this.c;
        if (b0Var != null) {
            View view2 = b0Var.f5666a;
            if (p(view2, x3, y10, this.f5940j + this.f5938h, this.f5941k + this.f5939i)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f5945p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
                view = fVar.f5967e.f5666a;
            } else {
                RecyclerView recyclerView = this.f5947r;
                int e10 = recyclerView.n.e();
                while (true) {
                    e10--;
                    if (e10 >= 0) {
                        View d5 = recyclerView.n.d(e10);
                        float translationX = d5.getTranslationX();
                        float translationY = d5.getTranslationY();
                        if (x3 >= d5.getLeft() + translationX && x3 <= d5.getRight() + translationX && y10 >= d5.getTop() + translationY && y10 <= d5.getBottom() + translationY) {
                            return d5;
                        }
                    } else {
                        return null;
                    }
                }
            }
        } while (!p(view, x3, y10, fVar.f5971i, fVar.f5972j));
        return view;
    }

    public final void o(float[] fArr) {
        if ((this.f5944o & 12) != 0) {
            fArr[0] = (this.f5940j + this.f5938h) - this.c.f5666a.getLeft();
        } else {
            fArr[0] = this.c.f5666a.getTranslationX();
        }
        if ((this.f5944o & 3) != 0) {
            fArr[1] = (this.f5941k + this.f5939i) - this.c.f5666a.getTop();
        } else {
            fArr[1] = this.c.f5666a.getTranslationY();
        }
    }

    public final void q(RecyclerView.b0 b0Var) {
        View view;
        int i10;
        int i11;
        int i12;
        if (this.f5947r.isLayoutRequested() || this.n != 2) {
            return;
        }
        d dVar = this.f5943m;
        dVar.e(b0Var);
        int i13 = (int) (this.f5940j + this.f5938h);
        int i14 = (int) (this.f5941k + this.f5939i);
        View view2 = b0Var.f5666a;
        if (Math.abs(i14 - b0Var.f5666a.getTop()) < view2.getHeight() * 0.5f && Math.abs(i13 - view2.getLeft()) < view2.getWidth() * 0.5f) {
            return;
        }
        ArrayList arrayList = this.f5950u;
        if (arrayList == null) {
            this.f5950u = new ArrayList();
            this.f5951v = new ArrayList();
        } else {
            arrayList.clear();
            this.f5951v.clear();
        }
        int i15 = 0;
        int round = Math.round(this.f5940j + this.f5938h) - 0;
        int round2 = Math.round(this.f5941k + this.f5939i) - 0;
        int width = view2.getWidth() + round + 0;
        int height = view2.getHeight() + round2 + 0;
        int i16 = (round + width) / 2;
        int i17 = (round2 + height) / 2;
        RecyclerView.l layoutManager = this.f5947r.getLayoutManager();
        int A = layoutManager.A();
        while (i15 < A) {
            View z10 = layoutManager.z(i15);
            if (z10 == view2) {
                i10 = round;
                view = view2;
            } else {
                view = view2;
                if (z10.getBottom() >= round2 && z10.getTop() <= height && z10.getRight() >= round && z10.getLeft() <= width) {
                    RecyclerView.b0 K = this.f5947r.K(z10);
                    i10 = round;
                    i11 = round2;
                    if (dVar.b(this.f5947r, this.c, K)) {
                        int abs = Math.abs(i16 - ((z10.getRight() + z10.getLeft()) / 2));
                        int abs2 = Math.abs(i17 - ((z10.getBottom() + z10.getTop()) / 2));
                        int i18 = (abs2 * abs2) + (abs * abs);
                        int size = this.f5950u.size();
                        i12 = width;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < size) {
                            int i21 = size;
                            if (i18 <= ((Integer) this.f5951v.get(i19)).intValue()) {
                                break;
                            }
                            i20++;
                            i19++;
                            size = i21;
                        }
                        this.f5950u.add(i20, K);
                        this.f5951v.add(i20, Integer.valueOf(i18));
                        i15++;
                        view2 = view;
                        round = i10;
                        round2 = i11;
                        width = i12;
                    }
                    i12 = width;
                    i15++;
                    view2 = view;
                    round = i10;
                    round2 = i11;
                    width = i12;
                }
                i10 = round;
            }
            i11 = round2;
            i12 = width;
            i15++;
            view2 = view;
            round = i10;
            round2 = i11;
            width = i12;
        }
        ArrayList arrayList2 = this.f5950u;
        if (arrayList2.size() == 0) {
            return;
        }
        RecyclerView.b0 c10 = dVar.c(b0Var, arrayList2, i13, i14);
        if (c10 == null) {
            this.f5950u.clear();
            this.f5951v.clear();
            return;
        }
        int c11 = c10.c();
        int c12 = b0Var.c();
        dVar.l(this.f5947r, b0Var, c10);
        this.f5943m.m(this.f5947r, b0Var, c12, c10, c11, i13, i14);
    }

    public final void r(View view) {
        if (view == this.f5952w) {
            this.f5952w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        if (r0 == 0) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(RecyclerView.b0 b0Var, int i10) {
        d dVar;
        boolean z10;
        boolean z11;
        ViewParent parent;
        int i11;
        RecyclerView.b0 b0Var2;
        int i12;
        int i13;
        int l2;
        int i14;
        int i15;
        int i16;
        int i17;
        float signum;
        float f10;
        int i18;
        long j2;
        float signum2;
        if (b0Var == this.c && i10 == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i19 = this.n;
        m(b0Var, true);
        this.n = i10;
        if (i10 == 2) {
            if (b0Var != null) {
                this.f5952w = b0Var.f5666a;
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i20 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.b0 b0Var3 = this.c;
        d dVar2 = this.f5943m;
        if (b0Var3 != null) {
            View view = b0Var3.f5666a;
            if (view.getParent() != null) {
                if (i19 == 2) {
                    i17 = 0;
                } else {
                    if (this.n != 2) {
                        int f11 = dVar2.f(this.f5947r, b0Var3);
                        RecyclerView recyclerView = this.f5947r;
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        int d5 = j0.e.d(recyclerView);
                        int i21 = f11 & 3158064;
                        if (i21 == 0) {
                            i13 = f11;
                        } else {
                            int i22 = (~i21) & f11;
                            if (d5 == 0) {
                                i12 = i21 >> 2;
                            } else {
                                int i23 = i21 >> 1;
                                i22 |= i23 & (-3158065);
                                i12 = (i23 & 3158064) >> 2;
                            }
                            i13 = i12 | i22;
                        }
                        int i24 = (i13 & 65280) >> 8;
                        if (i24 != 0) {
                            int i25 = (f11 & 65280) >> 8;
                            if (Math.abs(this.f5938h) > Math.abs(this.f5939i)) {
                                l2 = j(b0Var3, i24);
                                if (l2 > 0) {
                                    if ((i25 & l2) == 0) {
                                        int d10 = j0.e.d(this.f5947r);
                                        i14 = l2 & 789516;
                                        if (i14 != 0) {
                                            i15 = l2 & (~i14);
                                        }
                                    }
                                } else {
                                    l2 = l(b0Var3, i24);
                                    if (l2 > 0) {
                                    }
                                }
                                i17 = l2;
                            } else {
                                l2 = l(b0Var3, i24);
                                if (l2 <= 0) {
                                    l2 = j(b0Var3, i24);
                                    if (l2 > 0) {
                                        if ((i25 & l2) == 0) {
                                            int d11 = j0.e.d(this.f5947r);
                                            i14 = l2 & 789516;
                                            if (i14 != 0) {
                                                i15 = l2 & (~i14);
                                                if (d11 == 0) {
                                                    i16 = i14 << 2;
                                                    l2 = i16 | i15;
                                                }
                                                int i26 = i14 << 1;
                                                i15 |= i26 & (-789517);
                                                i16 = (i26 & 789516) << 2;
                                                l2 = i16 | i15;
                                            }
                                        }
                                    }
                                }
                                i17 = l2;
                            }
                        }
                    }
                    l2 = 0;
                    i17 = l2;
                }
                VelocityTracker velocityTracker = this.f5949t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5949t = null;
                }
                if (i17 != 1 && i17 != 2) {
                    if (i17 != 4 && i17 != 8 && i17 != 16 && i17 != 32) {
                        signum2 = 0.0f;
                    } else {
                        signum2 = Math.signum(this.f5938h) * this.f5947r.getWidth();
                    }
                    f10 = signum2;
                    signum = 0.0f;
                } else {
                    signum = Math.signum(this.f5939i) * this.f5947r.getHeight();
                    f10 = 0.0f;
                }
                if (i19 == 2) {
                    i18 = 8;
                } else if (i17 > 0) {
                    i18 = 2;
                } else {
                    i18 = 4;
                }
                float[] fArr = this.f5933b;
                o(fArr);
                int i27 = i18;
                c cVar = new c(b0Var3, i27, i19, fArr[0], fArr[1], f10, signum, i17, b0Var3);
                RecyclerView recyclerView2 = this.f5947r;
                dVar2.getClass();
                RecyclerView.i itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    if (i27 == 8) {
                        j2 = 200;
                    } else {
                        j2 = 250;
                    }
                } else if (i27 == 8) {
                    j2 = itemAnimator.f5687e;
                } else {
                    j2 = itemAnimator.f5686d;
                }
                ValueAnimator valueAnimator = cVar.f5969g;
                valueAnimator.setDuration(j2);
                this.f5945p.add(cVar);
                b0Var3.p(false);
                valueAnimator.start();
                dVar = dVar2;
                b0Var2 = null;
                z10 = true;
            } else {
                r(view);
                dVar = dVar2;
                dVar.d(this.f5947r, b0Var3);
                b0Var2 = null;
                z10 = false;
            }
            this.c = b0Var2;
        } else {
            dVar = dVar2;
            z10 = false;
        }
        if (b0Var != null) {
            RecyclerView recyclerView3 = this.f5947r;
            int f12 = dVar.f(recyclerView3, b0Var);
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            int d12 = j0.e.d(recyclerView3);
            int i28 = f12 & 3158064;
            if (i28 != 0) {
                int i29 = f12 & (~i28);
                if (d12 == 0) {
                    i11 = 2;
                } else {
                    i11 = 2;
                    int i30 = i28 >> 1;
                    i29 |= i30 & (-3158065);
                    i28 = i30 & 3158064;
                }
                f12 = i29 | (i28 >> i11);
            }
            this.f5944o = (f12 & i20) >> (this.n * 8);
            View view2 = b0Var.f5666a;
            this.f5940j = view2.getLeft();
            this.f5941k = view2.getTop();
            this.c = b0Var;
            if (i10 == 2) {
                z11 = false;
                view2.performHapticFeedback(0);
                parent = this.f5947r.getParent();
                if (parent != null) {
                    if (this.c != null) {
                        z11 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z11);
                }
                if (!z10) {
                    this.f5947r.getLayoutManager().f5696f = true;
                }
                dVar.n(this.c, this.n);
                this.f5947r.invalidate();
            }
        }
        z11 = false;
        parent = this.f5947r.getParent();
        if (parent != null) {
        }
        if (!z10) {
        }
        dVar.n(this.c, this.n);
        this.f5947r.invalidate();
    }

    public final void t(RecyclerView.b0 b0Var) {
        int i10;
        RecyclerView recyclerView = this.f5947r;
        int f10 = this.f5943m.f(recyclerView, b0Var);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int d5 = j0.e.d(recyclerView);
        int i11 = f10 & 3158064;
        boolean z10 = true;
        if (i11 != 0) {
            int i12 = f10 & (~i11);
            if (d5 == 0) {
                i10 = i11 >> 2;
            } else {
                int i13 = i11 >> 1;
                i12 |= (-3158065) & i13;
                i10 = (i13 & 3158064) >> 2;
            }
            f10 = i12 | i10;
        }
        if ((16711680 & f10) == 0) {
            z10 = false;
        }
        if (!z10) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (b0Var.f5666a.getParent() != this.f5947r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            VelocityTracker velocityTracker = this.f5949t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f5949t = VelocityTracker.obtain();
            this.f5939i = 0.0f;
            this.f5938h = 0.0f;
            s(b0Var, 2);
        }
    }

    public final void u(int i10, int i11, MotionEvent motionEvent) {
        float x3 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x3 - this.f5934d;
        this.f5938h = f10;
        this.f5939i = y10 - this.f5935e;
        if ((i10 & 4) == 0) {
            this.f5938h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f5938h = Math.min(0.0f, this.f5938h);
        }
        if ((i10 & 1) == 0) {
            this.f5939i = Math.max(0.0f, this.f5939i);
        }
        if ((i10 & 2) == 0) {
            this.f5939i = Math.min(0.0f, this.f5939i);
        }
    }
}
