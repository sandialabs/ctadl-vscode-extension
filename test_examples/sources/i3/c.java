package i3;

import a3.j0;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v  reason: collision with root package name */
    public static final a f11705v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f11706a;

    /* renamed from: b  reason: collision with root package name */
    public int f11707b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f11708d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f11709e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f11710f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f11711g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f11712h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f11713i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f11714j;

    /* renamed from: k  reason: collision with root package name */
    public int f11715k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f11716l;

    /* renamed from: m  reason: collision with root package name */
    public final float f11717m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final int f11718o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f11719p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0131c f11720q;

    /* renamed from: r  reason: collision with root package name */
    public View f11721r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11722s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f11723t;
    public int c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final b f11724u = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: i3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0131c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i10) {
        }

        public abstract void f(int i10);

        public abstract void g(View view, int i10, int i11);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0131c abstractC0131c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0131c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f11723t = viewGroup;
        this.f11720q = abstractC0131c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11718o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f11707b = viewConfiguration.getScaledTouchSlop();
        this.f11717m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11719p = new OverScroller(context, f11705v);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.f11708d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11709e, 0.0f);
            Arrays.fill(this.f11710f, 0.0f);
            Arrays.fill(this.f11711g, 0.0f);
            Arrays.fill(this.f11712h, 0);
            Arrays.fill(this.f11713i, 0);
            Arrays.fill(this.f11714j, 0);
            this.f11715k = 0;
        }
        VelocityTracker velocityTracker = this.f11716l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11716l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f11723t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f11721r = view;
        this.c = i10;
        this.f11720q.e(view, i10);
        p(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f11712h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f11714j[i10] & i11) == i11 || (this.f11713i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f11707b;
        if (abs > i12 || abs2 > i12) {
            if (abs < abs2 * 0.5f) {
                this.f11720q.getClass();
            }
            return (this.f11713i[i10] & i11) == 0 && abs > ((float) this.f11707b);
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        AbstractC0131c abstractC0131c = this.f11720q;
        boolean z10 = abstractC0131c.c(view) > 0;
        boolean z11 = abstractC0131c.d() > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f11707b) : z11 && Math.abs(f11) > ((float) this.f11707b);
        }
        float f12 = f11 * f11;
        int i10 = this.f11707b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final void e(int i10) {
        float[] fArr = this.f11708d;
        if (fArr != null) {
            int i11 = this.f11715k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f11709e[i10] = 0.0f;
                this.f11710f[i10] = 0.0f;
                this.f11711g[i10] = 0.0f;
                this.f11712h[i10] = 0;
                this.f11713i[i10] = 0;
                this.f11714j[i10] = 0;
                this.f11715k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int width;
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f11723t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f11706a == 2) {
            OverScroller overScroller = this.f11719p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f11721r.getLeft();
            int top = currY - this.f11721r.getTop();
            if (left != 0) {
                j0.j(this.f11721r, left);
            }
            if (top != 0) {
                j0.k(this.f11721r, top);
            }
            if (left != 0 || top != 0) {
                this.f11720q.g(this.f11721r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f11723t.post(this.f11724u);
            }
        }
        return this.f11706a == 2;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f11723t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f11720q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f11721r.getLeft();
        int top = this.f11721r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f11719p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f11721r;
        int i16 = (int) this.n;
        int i17 = (int) this.f11717m;
        int abs = Math.abs(i12);
        if (abs < i16) {
            i12 = 0;
        } else if (abs > i17) {
            if (i12 > 0) {
                i12 = i17;
            } else {
                i12 = -i17;
            }
        }
        int abs2 = Math.abs(i13);
        if (abs2 < i16) {
            i13 = 0;
        } else if (abs2 > i17) {
            if (i13 > 0) {
                i13 = i17;
            } else {
                i13 = -i17;
            }
        }
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int abs5 = Math.abs(i12);
        int abs6 = Math.abs(i13);
        int i18 = abs5 + abs6;
        int i19 = abs3 + abs4;
        if (i12 != 0) {
            f10 = abs5;
            f11 = i18;
        } else {
            f10 = abs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = abs6;
            f13 = i18;
        } else {
            f12 = abs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        AbstractC0131c abstractC0131c = this.f11720q;
        overScroller.startScroll(left, top, i14, i15, (int) ((f(i15, i13, abstractC0131c.d()) * f15) + (f(i14, i12, abstractC0131c.c(view)) * f14)));
        p(2);
        return true;
    }

    public final boolean j(int i10) {
        boolean z10;
        if ((this.f11715k & (1 << i10)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
        s(r9.f11721r, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f11716l == null) {
            this.f11716l = VelocityTracker.obtain();
        }
        this.f11716l.addMovement(motionEvent);
        int i11 = 0;
        AbstractC0131c abstractC0131c = this.f11720q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f11706a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.c) {
                                                View h10 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f11721r;
                                                if (h10 == view && s(view, pointerId2)) {
                                                    i10 = this.c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        n(x3, y10, pointerId3);
                        if (this.f11706a == 0) {
                            s(h((int) x3, (int) y10), pointerId3);
                            if ((this.f11712h[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i12 = (int) x3;
                            int i13 = (int) y10;
                            View view2 = this.f11721r;
                            if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                                i11 = 1;
                            }
                            return;
                        }
                    } else if (this.f11706a == 1) {
                        this.f11722s = true;
                        abstractC0131c.h(this.f11721r, 0.0f, 0.0f);
                        this.f11722s = false;
                        if (this.f11706a == 1) {
                            p(0);
                        }
                    }
                } else {
                    if (this.f11706a == 1) {
                        if (j(this.c)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.c);
                            float x10 = motionEvent.getX(findPointerIndex);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f11710f;
                            int i14 = this.c;
                            int i15 = (int) (x10 - fArr[i14]);
                            int i16 = (int) (y11 - this.f11711g[i14]);
                            int left = this.f11721r.getLeft() + i15;
                            int top = this.f11721r.getTop() + i16;
                            int left2 = this.f11721r.getLeft();
                            int top2 = this.f11721r.getTop();
                            if (i15 != 0) {
                                left = abstractC0131c.a(this.f11721r, left);
                                j0.j(this.f11721r, left - left2);
                            }
                            if (i16 != 0) {
                                top = abstractC0131c.b(this.f11721r, top);
                                j0.k(this.f11721r, top - top2);
                            }
                            if (i15 != 0 || i16 != 0) {
                                abstractC0131c.g(this.f11721r, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i11 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i11);
                            if (j(pointerId4)) {
                                float x11 = motionEvent.getX(i11);
                                float y12 = motionEvent.getY(i11);
                                float f10 = x11 - this.f11708d[pointerId4];
                                float f11 = y12 - this.f11709e[pointerId4];
                                m(f10, f11, pointerId4);
                                if (this.f11706a != 1) {
                                    View h11 = h((int) x11, (int) y12);
                                    if (d(h11, f10, f11) && s(h11, pointerId4)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    o(motionEvent);
                    return;
                }
            } else if (this.f11706a == 1) {
                l();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x12, (int) y13);
        n(x12, y13, pointerId5);
        s(h12, pointerId5);
        if ((this.f11712h[pointerId5] & 0) == 0) {
            return;
        }
        abstractC0131c.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f11716l;
        float f10 = this.f11717m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f11716l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f11 = 0.0f;
        float f12 = this.n;
        if (abs < f12) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > 0.0f) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.f11716l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f12) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f11 = f10;
            } else {
                f11 = yVelocity;
            }
        }
        this.f11722s = true;
        this.f11720q.h(this.f11721r, xVelocity, f11);
        this.f11722s = false;
        if (this.f11706a == 1) {
            p(0);
        }
    }

    public final void m(float f10, float f11, int i10) {
        boolean c = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f11713i;
            iArr[i10] = iArr[i10] | c;
            this.f11720q.getClass();
        }
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.f11708d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f11709e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11710f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f11711g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11712h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11713i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11714j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11708d = fArr2;
            this.f11709e = fArr3;
            this.f11710f = fArr4;
            this.f11711g = fArr5;
            this.f11712h = iArr;
            this.f11713i = iArr2;
            this.f11714j = iArr3;
        }
        float[] fArr9 = this.f11708d;
        this.f11710f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f11709e;
        this.f11711g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f11712h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f11723t;
        int left = viewGroup.getLeft();
        int i15 = this.f11718o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f11715k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x3 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f11710f[pointerId] = x3;
                this.f11711g[pointerId] = y10;
            }
        }
    }

    public final void p(int i10) {
        this.f11723t.removeCallbacks(this.f11724u);
        if (this.f11706a != i10) {
            this.f11706a = i10;
            this.f11720q.f(i10);
            if (this.f11706a == 0) {
                this.f11721r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f11722s) {
            return i(i10, i11, (int) this.f11716l.getXVelocity(this.c), (int) this.f11716l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r13 != r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
        if ((r18.f11712h[r1] & 0) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        View h10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f11716l == null) {
            this.f11716l = VelocityTracker.obtain();
        }
        this.f11716l.addMovement(motionEvent);
        AbstractC0131c abstractC0131c = this.f11720q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x3 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            n(x3, y10, pointerId);
                            int i10 = this.f11706a;
                            if (i10 == 0) {
                                if ((this.f11712h[pointerId] & 0) != 0) {
                                    abstractC0131c.getClass();
                                }
                            } else if (i10 == 2 && (h10 = h((int) x3, (int) y10)) == this.f11721r) {
                                s(h10, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f11708d != null && this.f11709e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (j(pointerId2)) {
                            float x10 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f10 = x10 - this.f11708d[pointerId2];
                            float f11 = y11 - this.f11709e[pointerId2];
                            View h11 = h((int) x10, (int) y11);
                            boolean z10 = h11 != null && d(h11, f10, f11);
                            if (z10) {
                                int left = h11.getLeft();
                                int a10 = abstractC0131c.a(h11, ((int) f10) + left);
                                int top = h11.getTop();
                                int b5 = abstractC0131c.b(h11, ((int) f11) + top);
                                int c = abstractC0131c.c(h11);
                                int d5 = abstractC0131c.d();
                                if (c != 0) {
                                    if (c > 0) {
                                    }
                                }
                                if (d5 == 0) {
                                    break;
                                } else if (d5 > 0 && b5 == top) {
                                    break;
                                }
                            }
                            m(f10, f11, pointerId2);
                            if (this.f11706a != 1) {
                                if (z10 && s(h11, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x11 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(x11, y12, pointerId3);
            View h12 = h((int) x11, (int) y12);
            if (h12 == this.f11721r && this.f11706a == 2) {
                s(h12, pointerId3);
            }
        }
        return this.f11706a == 1;
    }

    public final boolean s(View view, int i10) {
        if (view == this.f11721r && this.c == i10) {
            return true;
        }
        if (view == null || !this.f11720q.i(view, i10)) {
            return false;
        }
        this.c = i10;
        b(view, i10);
        return true;
    }
}
