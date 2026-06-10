package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class m0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public final float f1029i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1030j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1031k;

    /* renamed from: l  reason: collision with root package name */
    public final View f1032l;

    /* renamed from: m  reason: collision with root package name */
    public a f1033m;
    public b n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1034o;

    /* renamed from: p  reason: collision with root package name */
    public int f1035p;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f1036q = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = m0.this.f1032l.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m0 m0Var = m0.this;
            m0Var.a();
            View view = m0Var.f1032l;
            if (view.isEnabled() && !view.isLongClickable() && m0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                m0Var.f1034o = true;
            }
        }
    }

    public m0(View view) {
        this.f1032l = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1029i = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1030j = tapTimeout;
        this.f1031k = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.n;
        View view = this.f1032l;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1033m;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract j.f b();

    public abstract boolean c();

    public boolean d() {
        j.f b5 = b();
        if (b5 == null || !b5.c()) {
            return true;
        }
        b5.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        k0 g10;
        boolean z14;
        boolean z15 = this.f1034o;
        View view2 = this.f1032l;
        if (z15) {
            j.f b5 = b();
            if (b5 != null && b5.c() && (g10 = b5.g()) != null && g10.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1036q;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                g10.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = g10.b(obtainNoHistory, this.f1035p);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (b10 && z14) {
                    z13 = true;
                    if (!z13 && d()) {
                        z12 = false;
                    }
                    z12 = true;
                }
            }
            z13 = false;
            if (!z13) {
                z12 = false;
            }
            z12 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 != 2) {
                            if (actionMasked2 != 3) {
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1035p);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f10 = this.f1029i;
                                float f11 = -f10;
                                if (x3 >= f11 && y10 >= f11 && x3 < (view2.getRight() - view2.getLeft()) + f10 && y10 < (view2.getBottom() - view2.getTop()) + f10) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    z11 = true;
                                    if (!z11 && c()) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        view2.onTouchEvent(obtain);
                                        obtain.recycle();
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f1035p = motionEvent.getPointerId(0);
                    if (this.f1033m == null) {
                        this.f1033m = new a();
                    }
                    view2.postDelayed(this.f1033m, this.f1030j);
                    if (this.n == null) {
                        this.n = new b();
                    }
                    view2.postDelayed(this.n, this.f1031k);
                }
            }
            z11 = false;
            if (!z11) {
            }
            z12 = false;
            if (z12) {
            }
        }
        this.f1034o = z12;
        if (!z12 && !z15) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1034o = false;
        this.f1035p = -1;
        a aVar = this.f1033m;
        if (aVar != null) {
            this.f1032l.removeCallbacks(aVar);
        }
    }
}
