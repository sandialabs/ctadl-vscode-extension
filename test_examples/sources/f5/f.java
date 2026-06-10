package f5;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class f<V extends View> extends h<V> {
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f10924d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10925e;

    /* renamed from: f  reason: collision with root package name */
    public int f10926f;

    /* renamed from: g  reason: collision with root package name */
    public int f10927g;

    /* renamed from: h  reason: collision with root package name */
    public int f10928h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f10929i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final CoordinatorLayout f10930i;

        /* renamed from: j  reason: collision with root package name */
        public final V f10931j;

        public a(CoordinatorLayout coordinatorLayout, V v3) {
            this.f10930i = coordinatorLayout;
            this.f10931j = v3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar;
            OverScroller overScroller;
            V v3 = this.f10931j;
            if (v3 != null && (overScroller = (fVar = f.this).f10924d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f10930i;
                if (computeScrollOffset) {
                    fVar.A(coordinatorLayout, v3, fVar.f10924d.getCurrY());
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.m(v3, this);
                    return;
                }
                fVar.y(v3, coordinatorLayout);
            }
        }
    }

    public f() {
        this.f10926f = -1;
        this.f10928h = -1;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10926f = -1;
        this.f10928h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f10928h < 0) {
            this.f10928h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f10925e) {
            int i10 = this.f10926f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f10927g) > this.f10928h) {
                this.f10927g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f10926f = -1;
            int x3 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (u(v3) && coordinatorLayout.p(v3, x3, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10925e = z10;
            if (z10) {
                this.f10927g = y11;
                this.f10926f = motionEvent.getPointerId(0);
                if (this.f10929i == null) {
                    this.f10929i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f10924d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f10924d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f10929i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f10926f = motionEvent.getPointerId(i10);
                        this.f10927g = (int) (motionEvent.getY(i10) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f10926f);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(findPointerIndex);
                int i11 = this.f10927g - y10;
                this.f10927g = y10;
                z(coordinatorLayout, v3, x() - i11, v(v3), 0);
            }
            z10 = false;
            velocityTracker2 = this.f10929i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.f10925e && !z10) {
                return false;
            }
        }
        VelocityTracker velocityTracker3 = this.f10929i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f10929i.computeCurrentVelocity(1000);
            float yVelocity = this.f10929i.getYVelocity(this.f10926f);
            int i12 = -w(v3);
            a aVar = this.c;
            if (aVar != null) {
                v3.removeCallbacks(aVar);
                this.c = null;
            }
            if (this.f10924d == null) {
                this.f10924d = new OverScroller(v3.getContext());
            }
            this.f10924d.fling(0, s(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f10924d.computeScrollOffset()) {
                a aVar2 = new a(coordinatorLayout, v3);
                this.c = aVar2;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.m(v3, aVar2);
            } else {
                y(v3, coordinatorLayout);
            }
            z10 = true;
            this.f10925e = false;
            this.f10926f = -1;
            velocityTracker = this.f10929i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10929i = null;
            }
            velocityTracker2 = this.f10929i;
            if (velocityTracker2 != null) {
            }
            return !this.f10925e ? true : true;
        }
        z10 = false;
        this.f10925e = false;
        this.f10926f = -1;
        velocityTracker = this.f10929i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f10929i;
        if (velocityTracker2 != null) {
        }
        if (!this.f10925e) {
        }
    }

    public boolean u(V v3) {
        return false;
    }

    public int v(V v3) {
        return -v3.getHeight();
    }

    public int w(V v3) {
        return v3.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v3, int i10, int i11, int i12) {
        int n;
        int s10 = s();
        if (i11 != 0 && s10 >= i11 && s10 <= i12 && s10 != (n = v8.b.n(i10, i11, i12))) {
            i iVar = this.f10936a;
            if (iVar != null) {
                if (iVar.f10940d != n) {
                    iVar.f10940d = n;
                    iVar.a();
                }
            } else {
                this.f10937b = n;
            }
            return s10 - n;
        }
        return 0;
    }
}
