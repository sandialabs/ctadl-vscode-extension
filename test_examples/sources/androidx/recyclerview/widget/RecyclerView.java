package androidx.recyclerview.widget;

import a3.a;
import a3.j0;
import a3.q0;
import a3.v0;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.m;
import b3.g;
import com.noto.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import v2.l;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements a3.s {
    public static final int[] J0 = {16843830};
    public static final float K0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean L0;
    public static final boolean M0;
    public static final boolean N0;
    public static final Class<?>[] O0;
    public static final c P0;
    public static final y Q0;
    public p A;
    public final int[] A0;
    public boolean B;
    public final int[] B0;
    public boolean C;
    public final int[] C0;
    public boolean D;
    public final ArrayList D0;
    public int E;
    public final b E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public int I;
    public final d I0;
    public boolean J;
    public final AccessibilityManager K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public h Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public EdgeEffect T;
    public EdgeEffect U;
    public i V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f5611a0;

    /* renamed from: b0  reason: collision with root package name */
    public VelocityTracker f5612b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f5613d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f5614e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f5615f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f5616g0;

    /* renamed from: h0  reason: collision with root package name */
    public o f5617h0;

    /* renamed from: i  reason: collision with root package name */
    public final float f5618i;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5619i0;

    /* renamed from: j  reason: collision with root package name */
    public final u f5620j;

    /* renamed from: j0  reason: collision with root package name */
    public final int f5621j0;

    /* renamed from: k  reason: collision with root package name */
    public final s f5622k;

    /* renamed from: k0  reason: collision with root package name */
    public final float f5623k0;

    /* renamed from: l  reason: collision with root package name */
    public v f5624l;

    /* renamed from: l0  reason: collision with root package name */
    public final float f5625l0;

    /* renamed from: m  reason: collision with root package name */
    public androidx.recyclerview.widget.a f5626m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5627m0;
    public androidx.recyclerview.widget.d n;

    /* renamed from: n0  reason: collision with root package name */
    public final a0 f5628n0;

    /* renamed from: o  reason: collision with root package name */
    public final g0 f5629o;

    /* renamed from: o0  reason: collision with root package name */
    public androidx.recyclerview.widget.m f5630o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5631p;

    /* renamed from: p0  reason: collision with root package name */
    public final m.b f5632p0;

    /* renamed from: q  reason: collision with root package name */
    public final a f5633q;

    /* renamed from: q0  reason: collision with root package name */
    public final x f5634q0;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f5635r;

    /* renamed from: r0  reason: collision with root package name */
    public q f5636r0;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5637s;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f5638s0;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f5639t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5640t0;

    /* renamed from: u  reason: collision with root package name */
    public Adapter f5641u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5642u0;

    /* renamed from: v  reason: collision with root package name */
    public l f5643v;

    /* renamed from: v0  reason: collision with root package name */
    public final j f5644v0;

    /* renamed from: w  reason: collision with root package name */
    public t f5645w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5646w0;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f5647x;

    /* renamed from: x0  reason: collision with root package name */
    public androidx.recyclerview.widget.b0 f5648x0;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<k> f5649y;

    /* renamed from: y0  reason: collision with root package name */
    public final int[] f5650y0;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<p> f5651z;

    /* renamed from: z0  reason: collision with root package name */
    public a3.t f5652z0;

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends b0> {

        /* renamed from: a  reason: collision with root package name */
        public final e f5653a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f5654b = false;
        public final StateRestorationPolicy c = StateRestorationPolicy.ALLOW;

        /* loaded from: classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT_WHEN_EMPTY,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT
        }

        public final VH c(ViewGroup viewGroup, int i10) {
            try {
                int i11 = v2.l.f18154a;
                l.a.a("RV CreateView");
                VH j2 = j(viewGroup, i10);
                if (j2.f5666a.getParent() == null) {
                    j2.f5670f = i10;
                    l.a.b();
                    return j2;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i12 = v2.l.f18154a;
                l.a.b();
                throw th;
            }
        }

        public abstract int d();

        public long e(int i10) {
            return -1L;
        }

        public int f(int i10) {
            return 0;
        }

        public void g(RecyclerView recyclerView) {
        }

        public abstract void h(VH vh, int i10);

        public void i(VH vh, int i10, List<Object> list) {
            h(vh, i10);
        }

        public abstract VH j(ViewGroup viewGroup, int i10);

        public void k(RecyclerView recyclerView) {
        }

        public boolean l(VH vh) {
            return false;
        }

        public void m(VH vh) {
        }

        public void n(VH vh) {
        }

        public void o(VH vh) {
        }

        public final void p(f fVar) {
            this.f5653a.registerObserver(fVar);
        }

        public final void q() {
            if (!this.f5653a.a()) {
                this.f5654b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final void r(f fVar) {
            this.f5653a.unregisterObserver(fVar);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.D && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.B) {
                    recyclerView.requestLayout();
                } else if (recyclerView.G) {
                    recyclerView.F = true;
                } else {
                    recyclerView.n();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public int f5658i;

        /* renamed from: j  reason: collision with root package name */
        public int f5659j;

        /* renamed from: k  reason: collision with root package name */
        public OverScroller f5660k;

        /* renamed from: l  reason: collision with root package name */
        public Interpolator f5661l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5662m;
        public boolean n;

        public a0() {
            c cVar = RecyclerView.P0;
            this.f5661l = cVar;
            this.f5662m = false;
            this.n = false;
            this.f5660k = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f5659j = 0;
            this.f5658i = 0;
            Interpolator interpolator = this.f5661l;
            c cVar = RecyclerView.P0;
            if (interpolator != cVar) {
                this.f5661l = cVar;
                this.f5660k = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.f5660k.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f5662m) {
                this.n = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.m(recyclerView, this);
        }

        public final void c(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z10;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.P0;
            }
            if (this.f5661l != interpolator) {
                this.f5661l = interpolator;
                this.f5660k = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f5659j = 0;
            this.f5658i = 0;
            recyclerView.setScrollState(2);
            this.f5660k.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f5660k.computeScrollOffset();
            }
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x01b7  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z10;
            boolean z11;
            boolean z12;
            w wVar;
            boolean z13;
            androidx.recyclerview.widget.m mVar;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5643v == null) {
                recyclerView.removeCallbacks(this);
                this.f5660k.abortAnimation();
                return;
            }
            this.n = false;
            this.f5662m = true;
            recyclerView.n();
            OverScroller overScroller = this.f5660k;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currY - this.f5659j;
                this.f5658i = currX;
                this.f5659j = currY;
                int m10 = RecyclerView.m(currX - this.f5658i, recyclerView.R, recyclerView.T, recyclerView.getWidth());
                int m11 = RecyclerView.m(i15, recyclerView.S, recyclerView.U, recyclerView.getHeight());
                int[] iArr = recyclerView.C0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean t10 = recyclerView.t(m10, m11, 1, iArr, null);
                int[] iArr2 = recyclerView.C0;
                if (t10) {
                    m10 -= iArr2[0];
                    m11 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.l(m10, m11);
                }
                if (recyclerView.f5641u != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.e0(m10, m11, iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    int i18 = m10 - i16;
                    int i19 = m11 - i17;
                    w wVar2 = recyclerView.f5643v.f5695e;
                    if (wVar2 != null && !wVar2.f5731d && wVar2.f5732e) {
                        int b5 = recyclerView.f5634q0.b();
                        if (b5 == 0) {
                            wVar2.f();
                        } else {
                            if (wVar2.f5729a >= b5) {
                                wVar2.f5729a = b5 - 1;
                            }
                            wVar2.b(i16, i17);
                        }
                    }
                    i13 = i16;
                    i10 = i18;
                    i11 = i19;
                    i12 = i17;
                } else {
                    i10 = m10;
                    i11 = m11;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.f5649y.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.C0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i20 = i12;
                recyclerView.u(i13, i12, i10, i11, null, 1, iArr3);
                int i21 = i10 - iArr2[0];
                int i22 = i11 - iArr2[1];
                if (i13 != 0 || i20 != 0) {
                    recyclerView.v(i13, i20);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i21 == 0) || (!z11 && i22 == 0))) {
                    z12 = false;
                    wVar = recyclerView.f5643v.f5695e;
                    if (wVar == null && wVar.f5731d) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 && z12) {
                        if (recyclerView.getOverScrollMode() != 2) {
                            int currVelocity = (int) overScroller.getCurrVelocity();
                            if (i21 < 0) {
                                i14 = -currVelocity;
                            } else if (i21 > 0) {
                                i14 = currVelocity;
                            } else {
                                i14 = 0;
                            }
                            if (i22 < 0) {
                                currVelocity = -currVelocity;
                            } else if (i22 <= 0) {
                                currVelocity = 0;
                            }
                            if (i14 < 0) {
                                recyclerView.x();
                                if (recyclerView.R.isFinished()) {
                                    recyclerView.R.onAbsorb(-i14);
                                }
                            } else if (i14 > 0) {
                                recyclerView.y();
                                if (recyclerView.T.isFinished()) {
                                    recyclerView.T.onAbsorb(i14);
                                }
                            }
                            if (currVelocity < 0) {
                                recyclerView.z();
                                if (recyclerView.S.isFinished()) {
                                    recyclerView.S.onAbsorb(-currVelocity);
                                }
                            } else if (currVelocity > 0) {
                                recyclerView.w();
                                if (recyclerView.U.isFinished()) {
                                    recyclerView.U.onAbsorb(currVelocity);
                                }
                            }
                            if (i14 != 0 || currVelocity != 0) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                j0.d.k(recyclerView);
                            }
                        }
                        if (RecyclerView.N0) {
                            m.b bVar = recyclerView.f5632p0;
                            int[] iArr4 = bVar.c;
                            if (iArr4 != null) {
                                Arrays.fill(iArr4, -1);
                            }
                            bVar.f5927d = 0;
                        }
                    } else {
                        b();
                        mVar = recyclerView.f5630o0;
                        if (mVar != null) {
                            mVar.a(recyclerView, i13, i20);
                        }
                    }
                }
                z12 = true;
                wVar = recyclerView.f5643v.f5695e;
                if (wVar == null) {
                }
                z13 = false;
                if (z13) {
                }
                b();
                mVar = recyclerView.f5630o0;
                if (mVar != null) {
                }
            }
            w wVar3 = recyclerView.f5643v.f5695e;
            if (wVar3 != null && wVar3.f5731d) {
                wVar3.b(0, 0);
            }
            this.f5662m = false;
            if (this.n) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.m0(1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            i iVar = recyclerView.V;
            if (iVar != null) {
                iVar.m();
            }
            recyclerView.f5646w0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f5665t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f5666a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f5667b;

        /* renamed from: j  reason: collision with root package name */
        public int f5674j;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f5681r;

        /* renamed from: s  reason: collision with root package name */
        public Adapter<? extends b0> f5682s;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f5668d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f5669e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f5670f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f5671g = -1;

        /* renamed from: h  reason: collision with root package name */
        public b0 f5672h = null;

        /* renamed from: i  reason: collision with root package name */
        public b0 f5673i = null;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f5675k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f5676l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f5677m = 0;
        public s n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5678o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f5679p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f5680q = -1;

        public b0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f5666a = view;
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f5674j) == 0) {
                if (this.f5675k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f5675k = arrayList;
                    this.f5676l = Collections.unmodifiableList(arrayList);
                }
                this.f5675k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f5674j = i10 | this.f5674j;
        }

        public final int c() {
            RecyclerView recyclerView = this.f5681r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.I(this);
        }

        public final int d() {
            RecyclerView recyclerView;
            Adapter<? extends b0> adapter;
            int I;
            if (this.f5682s == null || (recyclerView = this.f5681r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.f5681r.I(this)) == -1 || this.f5682s != adapter) {
                return -1;
            }
            return I;
        }

        public final int e() {
            int i10 = this.f5671g;
            return i10 == -1 ? this.c : i10;
        }

        public final List<Object> f() {
            ArrayList arrayList;
            if ((this.f5674j & 1024) == 0 && (arrayList = this.f5675k) != null && arrayList.size() != 0) {
                return this.f5676l;
            }
            return f5665t;
        }

        public final boolean g() {
            View view = this.f5666a;
            return (view.getParent() == null || view.getParent() == this.f5681r) ? false : true;
        }

        public final boolean h() {
            return (this.f5674j & 1) != 0;
        }

        public final boolean i() {
            return (this.f5674j & 4) != 0;
        }

        public final boolean j() {
            if ((this.f5674j & 16) == 0) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (!j0.d.i(this.f5666a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean k() {
            return (this.f5674j & 8) != 0;
        }

        public final boolean l() {
            return this.n != null;
        }

        public final boolean m() {
            return (this.f5674j & 256) != 0;
        }

        public final void n(int i10, boolean z10) {
            if (this.f5668d == -1) {
                this.f5668d = this.c;
            }
            if (this.f5671g == -1) {
                this.f5671g = this.c;
            }
            if (z10) {
                this.f5671g += i10;
            }
            this.c += i10;
            View view = this.f5666a;
            if (view.getLayoutParams() != null) {
                ((m) view.getLayoutParams()).f5713k = true;
            }
        }

        public final void o() {
            this.f5674j = 0;
            this.c = -1;
            this.f5668d = -1;
            this.f5669e = -1L;
            this.f5671g = -1;
            this.f5677m = 0;
            this.f5672h = null;
            this.f5673i = null;
            ArrayList arrayList = this.f5675k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f5674j &= -1025;
            this.f5679p = 0;
            this.f5680q = -1;
            RecyclerView.j(this);
        }

        public final void p(boolean z10) {
            int i10;
            int i11 = this.f5677m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f5677m = i12;
            if (i12 < 0) {
                this.f5677m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f5674j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f5674j & (-17);
            }
            this.f5674j = i10;
        }

        public final boolean q() {
            return (this.f5674j & 128) != 0;
        }

        public final boolean r() {
            return (this.f5674j & 32) != 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            r1.append(" undefined adapter position");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String simpleName;
            boolean z10;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.f5669e + ", oldPos=" + this.f5668d + ", pLpos:" + this.f5671g);
            if (l()) {
                sb.append(" scrap ");
                if (this.f5678o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (i()) {
                sb.append(" invalid");
            }
            if (!h()) {
                sb.append(" unbound");
            }
            boolean z11 = true;
            if ((this.f5674j & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb.append(" update");
            }
            if (k()) {
                sb.append(" removed");
            }
            if (q()) {
                sb.append(" ignored");
            }
            if (m()) {
                sb.append(" tmpDetached");
            }
            if (!j()) {
                sb.append(" not recyclable(" + this.f5677m + ")");
            }
            if ((this.f5674j & 512) == 0 && !i()) {
                z11 = false;
            }
            if (this.f5666a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Observable<f> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public final void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public static class h {
        public EdgeEffect a(int i10, RecyclerView recyclerView) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f5684a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f5685b = new ArrayList<>();
        public long c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f5686d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f5687e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f5688f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f5689a;

            /* renamed from: b  reason: collision with root package name */
            public int f5690b;

            public final void a(b0 b0Var) {
                View view = b0Var.f5666a;
                this.f5689a = view.getLeft();
                this.f5690b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(b0 b0Var) {
            int i10 = b0Var.f5674j & 14;
            if (!b0Var.i() && (i10 & 4) == 0) {
                b0Var.c();
            }
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var);

        public boolean g(b0 b0Var, List<Object> list) {
            return f(b0Var);
        }

        public final void h(b0 b0Var) {
            boolean z10;
            b bVar = this.f5684a;
            if (bVar != null) {
                j jVar = (j) bVar;
                boolean z11 = true;
                b0Var.p(true);
                if (b0Var.f5672h != null && b0Var.f5673i == null) {
                    b0Var.f5672h = null;
                }
                b0Var.f5673i = null;
                if ((b0Var.f5674j & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.k0();
                    androidx.recyclerview.widget.d dVar = recyclerView.n;
                    androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) dVar.f5810a;
                    RecyclerView recyclerView2 = zVar.f6000a;
                    View view = b0Var.f5666a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        dVar.m(view);
                    } else {
                        d.a aVar = dVar.f5811b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            dVar.m(view);
                            zVar.b(indexOfChild);
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        b0 L = RecyclerView.L(view);
                        s sVar = recyclerView.f5622k;
                        sVar.n(L);
                        sVar.j(L);
                    }
                    recyclerView.l0(!z11);
                    if (!z11 && b0Var.m()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public final void i() {
            ArrayList<a> arrayList = this.f5685b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
            arrayList.clear();
        }

        public abstract void j(b0 b0Var);

        public abstract void k();

        public abstract boolean l();

        public abstract void m();
    }

    /* loaded from: classes.dex */
    public class j implements i.b {
        public j() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void f(Rect rect, View view, RecyclerView recyclerView) {
            ((m) view.getLayoutParams()).c();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public androidx.recyclerview.widget.d f5692a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f5693b;
        public final f0 c;

        /* renamed from: d  reason: collision with root package name */
        public final f0 f5694d;

        /* renamed from: e  reason: collision with root package name */
        public w f5695e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5696f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5697g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5698h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f5699i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f5700j;

        /* renamed from: k  reason: collision with root package name */
        public int f5701k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5702l;

        /* renamed from: m  reason: collision with root package name */
        public int f5703m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f5704o;

        /* renamed from: p  reason: collision with root package name */
        public int f5705p;

        /* loaded from: classes.dex */
        public class a implements f0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int a() {
                l lVar = l.this;
                return lVar.f5704o - lVar.I();
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int b(View view) {
                l.this.getClass();
                return (view.getLeft() - l.F(view)) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final View c(int i10) {
                return l.this.z(i10);
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int d() {
                return l.this.H();
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int e(View view) {
                l.this.getClass();
                return l.M(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements f0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int a() {
                l lVar = l.this;
                return lVar.f5705p - lVar.G();
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int b(View view) {
                l.this.getClass();
                return (view.getTop() - l.O(view)) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final View c(int i10) {
                return l.this.z(i10);
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int d() {
                return l.this.J();
            }

            @Override // androidx.recyclerview.widget.f0.b
            public final int e(View view) {
                l.this.getClass();
                return l.y(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f5708a;

            /* renamed from: b  reason: collision with root package name */
            public int f5709b;
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f5710d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.c = new f0(aVar);
            this.f5694d = new f0(bVar);
            this.f5696f = false;
            this.f5697g = false;
            this.f5698h = false;
            this.f5699i = true;
            this.f5700j = true;
        }

        public static int B(boolean z10, int i10, int i11, int i12, int i13) {
            int max = Math.max(0, i10 - i12);
            if (!z10) {
                if (i13 < 0) {
                    if (i13 != -1) {
                        if (i13 == -2) {
                            if (i11 != Integer.MIN_VALUE && i11 != 1073741824) {
                                i13 = max;
                                i11 = 0;
                            }
                            i13 = max;
                            i11 = Integer.MIN_VALUE;
                        }
                        i11 = 0;
                        i13 = 0;
                    }
                    i13 = max;
                }
                i11 = 1073741824;
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else {
                if (i13 == -1) {
                    if (i11 != Integer.MIN_VALUE) {
                        if (i11 != 0) {
                            if (i11 != 1073741824) {
                            }
                        }
                    }
                    i13 = max;
                }
                i11 = 0;
                i13 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public static void D(View view, Rect rect) {
            int[] iArr = RecyclerView.J0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f5712j;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public static int F(View view) {
            return ((m) view.getLayoutParams()).f5712j.left;
        }

        public static int K(View view) {
            return ((m) view.getLayoutParams()).c();
        }

        public static d L(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v8.b.f18180g, i10, i11);
            dVar.f5708a = obtainStyledAttributes.getInt(0, 1);
            dVar.f5709b = obtainStyledAttributes.getInt(10, 1);
            dVar.c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f5710d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int M(View view) {
            return ((m) view.getLayoutParams()).f5712j.right;
        }

        public static int O(View view) {
            return ((m) view.getLayoutParams()).f5712j.top;
        }

        public static boolean R(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i10;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static void S(View view, int i10, int i11, int i12, int i13) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f5712j;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public static int k(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static int y(View view) {
            return ((m) view.getLayoutParams()).f5712j.bottom;
        }

        public final int A() {
            androidx.recyclerview.widget.d dVar = this.f5692a;
            if (dVar != null) {
                return dVar.e();
            }
            return 0;
        }

        public void A0(Rect rect, int i10, int i11) {
            int I = I() + H() + rect.width();
            int G = G() + J() + rect.height();
            RecyclerView recyclerView = this.f5693b;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            this.f5693b.setMeasuredDimension(k(i10, I, j0.d.e(recyclerView)), k(i11, G, j0.d.d(this.f5693b)));
        }

        public final void B0(int i10, int i11) {
            int A = A();
            if (A == 0) {
                this.f5693b.o(i10, i11);
                return;
            }
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < A; i16++) {
                View z10 = z(i16);
                Rect rect = this.f5693b.f5635r;
                D(z10, rect);
                int i17 = rect.left;
                if (i17 < i12) {
                    i12 = i17;
                }
                int i18 = rect.right;
                if (i18 > i14) {
                    i14 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f5693b.f5635r.set(i12, i13, i14, i15);
            A0(this.f5693b.f5635r, i10, i11);
        }

        public int C(s sVar, x xVar) {
            return -1;
        }

        public final void C0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f5693b = null;
                this.f5692a = null;
                height = 0;
                this.f5704o = 0;
            } else {
                this.f5693b = recyclerView;
                this.f5692a = recyclerView.n;
                this.f5704o = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f5705p = height;
            this.f5703m = 1073741824;
            this.n = 1073741824;
        }

        public final boolean D0(View view, int i10, int i11, m mVar) {
            if (!view.isLayoutRequested() && this.f5699i && R(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && R(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) {
                return false;
            }
            return true;
        }

        public final int E() {
            RecyclerView recyclerView = this.f5693b;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            return j0.e.d(recyclerView);
        }

        public boolean E0() {
            return false;
        }

        public final boolean F0(View view, int i10, int i11, m mVar) {
            if (this.f5699i && R(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && R(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) {
                return false;
            }
            return true;
        }

        public final int G() {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void G0(RecyclerView recyclerView, x xVar, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int H() {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public final void H0(androidx.recyclerview.widget.r rVar) {
            w wVar = this.f5695e;
            if (wVar != null && rVar != wVar && wVar.f5732e) {
                wVar.f();
            }
            this.f5695e = rVar;
            RecyclerView recyclerView = this.f5693b;
            a0 a0Var = recyclerView.f5628n0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f5660k.abortAnimation();
            if (rVar.f5735h) {
                Log.w("RecyclerView", "An instance of " + rVar.getClass().getSimpleName() + " was started more than once. Each instance of" + rVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            rVar.f5730b = recyclerView;
            rVar.c = this;
            int i10 = rVar.f5729a;
            if (i10 != -1) {
                recyclerView.f5634q0.f5742a = i10;
                rVar.f5732e = true;
                rVar.f5731d = true;
                rVar.f5733f = recyclerView.f5643v.u(i10);
                rVar.f5730b.f5628n0.b();
                rVar.f5735h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int I() {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean I0() {
            return false;
        }

        public final int J() {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int N(s sVar, x xVar) {
            return -1;
        }

        public final void P(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f5712j;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f5693b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f5693b.f5639t;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean Q() {
            return this.f5698h;
        }

        public final void T(View view) {
            m mVar = (m) view.getLayoutParams();
            Rect M = this.f5693b.M(view);
            int B = B(h(), this.f5704o, this.f5703m, I() + H() + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin + M.left + M.right + 0, ((ViewGroup.MarginLayoutParams) mVar).width);
            int B2 = B(i(), this.f5705p, this.n, G() + J() + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin + M.top + M.bottom + 0, ((ViewGroup.MarginLayoutParams) mVar).height);
            if (D0(view, B, B2, mVar)) {
                view.measure(B, B2);
            }
        }

        public void U(int i10) {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                int e10 = recyclerView.n.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.n.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void V(int i10) {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                int e10 = recyclerView.n.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.n.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void W(Adapter adapter) {
        }

        public void X(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void Y(RecyclerView recyclerView) {
        }

        public View Z(View view, int i10, s sVar, x xVar) {
            return null;
        }

        public void a0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5693b;
            s sVar = recyclerView.f5622k;
            x xVar = recyclerView.f5634q0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f5693b.canScrollVertically(-1) && !this.f5693b.canScrollHorizontally(-1) && !this.f5693b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                Adapter adapter = this.f5693b.f5641u;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.d());
                }
            }
        }

        public void b0(s sVar, x xVar, b3.g gVar) {
            if (this.f5693b.canScrollVertically(-1) || this.f5693b.canScrollHorizontally(-1)) {
                gVar.a(8192);
                gVar.o(true);
            }
            if (this.f5693b.canScrollVertically(1) || this.f5693b.canScrollHorizontally(1)) {
                gVar.a(4096);
                gVar.o(true);
            }
            gVar.j(g.b.a(N(sVar, xVar), C(sVar, xVar), 0));
        }

        @SuppressLint({"UnknownNullness"})
        public final void c(View view) {
            d(view, -1, false);
        }

        public final void c0(View view, b3.g gVar) {
            b0 L = RecyclerView.L(view);
            if (L == null || L.k() || this.f5692a.k(L.f5666a)) {
                return;
            }
            RecyclerView recyclerView = this.f5693b;
            d0(recyclerView.f5622k, recyclerView.f5634q0, view, gVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(View view, int i10, boolean z10) {
            m mVar;
            b0 L = RecyclerView.L(view);
            if (!z10 && !L.k()) {
                this.f5693b.f5629o.b(L);
                mVar = (m) view.getLayoutParams();
                if (!L.r() && !L.l()) {
                    int i11 = -1;
                    if (view.getParent() != this.f5693b) {
                        int j2 = this.f5692a.j(view);
                        if (i10 == -1) {
                            i10 = this.f5692a.e();
                        }
                        if (j2 != -1) {
                            if (j2 != i10) {
                                l lVar = this.f5693b.f5643v;
                                View z11 = lVar.z(j2);
                                if (z11 != null) {
                                    lVar.z(j2);
                                    lVar.f5692a.c(j2);
                                    lVar.f(z11, i10);
                                } else {
                                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + lVar.f5693b.toString());
                                }
                            }
                        } else {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5693b.indexOfChild(view) + this.f5693b.A());
                        }
                    } else {
                        this.f5692a.a(view, i10, false);
                        mVar.f5713k = true;
                        w wVar = this.f5695e;
                        if (wVar != null && wVar.f5732e) {
                            wVar.f5730b.getClass();
                            b0 L2 = RecyclerView.L(view);
                            if (L2 != null) {
                                i11 = L2.e();
                            }
                            if (i11 == wVar.f5729a) {
                                wVar.f5733f = view;
                            }
                        }
                    }
                    if (!mVar.f5714l) {
                        L.f5666a.invalidate();
                        mVar.f5714l = false;
                        return;
                    }
                    return;
                }
                if (!L.l()) {
                    L.n.n(L);
                } else {
                    L.f5674j &= -33;
                }
                this.f5692a.b(view, i10, view.getLayoutParams(), false);
                if (!mVar.f5714l) {
                }
            }
            p.h<b0, g0.a> hVar = this.f5693b.f5629o.f5857a;
            g0.a orDefault = hVar.getOrDefault(L, null);
            if (orDefault == null) {
                orDefault = g0.a.a();
                hVar.put(L, orDefault);
            }
            orDefault.f5860a |= 1;
            mVar = (m) view.getLayoutParams();
            if (!L.r()) {
                int i112 = -1;
                if (view.getParent() != this.f5693b) {
                }
                if (!mVar.f5714l) {
                }
            }
            if (!L.l()) {
            }
            this.f5692a.b(view, i10, view.getLayoutParams(), false);
            if (!mVar.f5714l) {
            }
        }

        public void d0(s sVar, x xVar, View view, b3.g gVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void e(String str) {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void e0(int i10, int i11) {
        }

        public final void f(View view, int i10) {
            m mVar = (m) view.getLayoutParams();
            b0 L = RecyclerView.L(view);
            if (L.k()) {
                p.h<b0, g0.a> hVar = this.f5693b.f5629o.f5857a;
                g0.a orDefault = hVar.getOrDefault(L, null);
                if (orDefault == null) {
                    orDefault = g0.a.a();
                    hVar.put(L, orDefault);
                }
                orDefault.f5860a |= 1;
            } else {
                this.f5693b.f5629o.b(L);
            }
            this.f5692a.b(view, i10, mVar, L.k());
        }

        public void f0() {
        }

        public final void g(View view, Rect rect) {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.M(view));
            }
        }

        public void g0(int i10, int i11) {
        }

        public boolean h() {
            return false;
        }

        public void h0(int i10, int i11) {
        }

        public boolean i() {
            return false;
        }

        public void i0(int i10) {
        }

        public boolean j(m mVar) {
            return mVar != null;
        }

        public void j0(RecyclerView recyclerView, int i10, int i11) {
            i0(i10);
        }

        @SuppressLint({"UnknownNullness"})
        public void k0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void l(int i10, int i11, x xVar, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void l0(x xVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void m(int i10, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void m0(Parcelable parcelable) {
        }

        public int n(x xVar) {
            return 0;
        }

        public Parcelable n0() {
            return null;
        }

        public int o(x xVar) {
            return 0;
        }

        public void o0(int i10) {
        }

        public int p(x xVar) {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean p0(s sVar, x xVar, int i10, Bundle bundle) {
            int i11;
            int H;
            if (this.f5693b == null) {
                return false;
            }
            int i12 = this.f5705p;
            int i13 = this.f5704o;
            Rect rect = new Rect();
            if (this.f5693b.getMatrix().isIdentity() && this.f5693b.getGlobalVisibleRect(rect)) {
                i12 = rect.height();
                i13 = rect.width();
            }
            if (i10 != 4096) {
                if (i10 != 8192) {
                    i11 = 0;
                } else {
                    if (this.f5693b.canScrollVertically(-1)) {
                        i11 = -((i12 - J()) - G());
                    } else {
                        i11 = 0;
                    }
                    if (this.f5693b.canScrollHorizontally(-1)) {
                        H = -((i13 - H()) - I());
                        if (i11 != 0 && H == 0) {
                            return false;
                        }
                        this.f5693b.i0(H, i11, true);
                        return true;
                    }
                }
                H = 0;
                if (i11 != 0) {
                }
                this.f5693b.i0(H, i11, true);
                return true;
            }
            if (this.f5693b.canScrollVertically(1)) {
                i11 = (i12 - J()) - G();
            } else {
                i11 = 0;
            }
            if (this.f5693b.canScrollHorizontally(1)) {
                H = (i13 - H()) - I();
                if (i11 != 0) {
                }
                this.f5693b.i0(H, i11, true);
                return true;
            }
            H = 0;
            if (i11 != 0) {
            }
            this.f5693b.i0(H, i11, true);
            return true;
        }

        public int q(x xVar) {
            return 0;
        }

        public final void q0() {
            int A = A();
            while (true) {
                A--;
                if (A < 0) {
                    return;
                }
                this.f5692a.l(A);
            }
        }

        public int r(x xVar) {
            return 0;
        }

        public final void r0(s sVar) {
            int A = A();
            while (true) {
                A--;
                if (A >= 0) {
                    if (!RecyclerView.L(z(A)).q()) {
                        View z10 = z(A);
                        if (z(A) != null) {
                            this.f5692a.l(A);
                        }
                        sVar.i(z10);
                    }
                } else {
                    return;
                }
            }
        }

        public int s(x xVar) {
            return 0;
        }

        public final void s0(s sVar) {
            ArrayList<b0> arrayList;
            int size = sVar.f5720a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = sVar.f5720a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).f5666a;
                b0 L = RecyclerView.L(view);
                if (!L.q()) {
                    L.p(false);
                    if (L.m()) {
                        this.f5693b.removeDetachedView(view, false);
                    }
                    i iVar = this.f5693b.V;
                    if (iVar != null) {
                        iVar.j(L);
                    }
                    L.p(true);
                    b0 L2 = RecyclerView.L(view);
                    L2.n = null;
                    L2.f5678o = false;
                    L2.f5674j &= -33;
                    sVar.j(L2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<b0> arrayList2 = sVar.f5721b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f5693b.invalidate();
            }
        }

        public final void t(s sVar) {
            int A = A();
            while (true) {
                A--;
                if (A >= 0) {
                    View z10 = z(A);
                    b0 L = RecyclerView.L(z10);
                    if (!L.q()) {
                        if (L.i() && !L.k() && !this.f5693b.f5641u.f5654b) {
                            if (z(A) != null) {
                                this.f5692a.l(A);
                            }
                            sVar.j(L);
                        } else {
                            z(A);
                            this.f5692a.c(A);
                            sVar.k(z10);
                            this.f5693b.f5629o.b(L);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
            if (r10 == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            boolean z12;
            int H = H();
            int J = J();
            int I = this.f5704o - I();
            int G = this.f5705p - G();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - H;
            int min = Math.min(0, i10);
            int i11 = top - J;
            int min2 = Math.min(0, i11);
            int i12 = width - I;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - G);
            if (E() == 1) {
                if (max == 0) {
                    max = Math.max(min, i12);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            if (z11) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int H2 = H();
                    int J2 = J();
                    int I2 = this.f5704o - I();
                    int G2 = this.f5705p - G();
                    Rect rect2 = this.f5693b.f5635r;
                    D(focusedChild, rect2);
                    z12 = (rect2.left - max < I2 && rect2.right - max > H2 && rect2.top - min2 < G2 && rect2.bottom - min2 > J2) ? true : true;
                }
                z12 = false;
            }
            if (max == 0) {
                if (min2 != 0) {
                }
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(max, min2);
            } else {
                recyclerView.i0(max, min2, false);
            }
            return true;
        }

        public View u(int i10) {
            int A = A();
            for (int i11 = 0; i11 < A; i11++) {
                View z10 = z(i11);
                b0 L = RecyclerView.L(z10);
                if (L != null && L.e() == i10 && !L.q() && (this.f5693b.f5634q0.f5747g || !L.k())) {
                    return z10;
                }
            }
            return null;
        }

        public final void u0() {
            RecyclerView recyclerView = this.f5693b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        @SuppressLint({"UnknownNullness"})
        public abstract m v();

        @SuppressLint({"UnknownNullness"})
        public int v0(int i10, s sVar, x xVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public m w(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public void w0(int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public m x(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        public int x0(int i10, s sVar, x xVar) {
            return 0;
        }

        public final void y0(RecyclerView recyclerView) {
            z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final View z(int i10) {
            androidx.recyclerview.widget.d dVar = this.f5692a;
            if (dVar != null) {
                return dVar.d(i10);
            }
            return null;
        }

        public final void z0(int i10, int i11) {
            this.f5704o = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f5703m = mode;
            if (mode == 0 && !RecyclerView.L0) {
                this.f5704o = 0;
            }
            this.f5705p = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.n = mode2;
            if (mode2 != 0 || RecyclerView.L0) {
                return;
            }
            this.f5705p = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: i  reason: collision with root package name */
        public b0 f5711i;

        /* renamed from: j  reason: collision with root package name */
        public final Rect f5712j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5713k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5714l;

        public m(int i10, int i11) {
            super(i10, i11);
            this.f5712j = new Rect();
            this.f5713k = true;
            this.f5714l = false;
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5712j = new Rect();
            this.f5713k = true;
            this.f5714l = false;
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5712j = new Rect();
            this.f5713k = true;
            this.f5714l = false;
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5712j = new Rect();
            this.f5713k = true;
            this.f5714l = false;
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
            this.f5712j = new Rect();
            this.f5713k = true;
            this.f5714l = false;
        }

        public final int c() {
            return this.f5711i.e();
        }

        public final boolean d() {
            if ((this.f5711i.f5674j & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            return this.f5711i.k();
        }
    }

    /* loaded from: classes.dex */
    public interface n {
        void a(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class o {
    }

    /* loaded from: classes.dex */
    public interface p {
        void b(MotionEvent motionEvent);

        boolean c(MotionEvent motionEvent);

        void e(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public void a(int i10, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f5715a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f5716b = 0;
        public final Set<Adapter<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b0> f5717a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f5718b = 5;
            public long c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f5719d = 0;
        }

        public void a() {
            int i10 = 0;
            while (true) {
                SparseArray<a> sparseArray = this.f5715a;
                if (i10 >= sparseArray.size()) {
                    return;
                }
                a valueAt = sparseArray.valueAt(i10);
                Iterator<b0> it = valueAt.f5717a.iterator();
                while (it.hasNext()) {
                    a1.b.o(it.next().f5666a);
                }
                valueAt.f5717a.clear();
                i10++;
            }
        }

        public b0 b(int i10) {
            a aVar = this.f5715a.get(i10);
            if (aVar != null) {
                ArrayList<b0> arrayList = aVar.f5717a;
                if (arrayList.isEmpty()) {
                    return null;
                }
                int size = arrayList.size();
                do {
                    size--;
                    if (size < 0) {
                        return null;
                    }
                } while (arrayList.get(size).g());
                return arrayList.remove(size);
            }
            return null;
        }

        public final a c(int i10) {
            SparseArray<a> sparseArray = this.f5715a;
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void d(b0 b0Var) {
            int i10 = b0Var.f5670f;
            ArrayList<b0> arrayList = c(i10).f5717a;
            if (this.f5715a.get(i10).f5718b <= arrayList.size()) {
                a1.b.o(b0Var.f5666a);
                return;
            }
            b0Var.o();
            arrayList.add(b0Var);
        }
    }

    /* loaded from: classes.dex */
    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b0> f5720a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b0> f5721b;
        public final ArrayList<b0> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<b0> f5722d;

        /* renamed from: e  reason: collision with root package name */
        public int f5723e;

        /* renamed from: f  reason: collision with root package name */
        public int f5724f;

        /* renamed from: g  reason: collision with root package name */
        public r f5725g;

        public s() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f5720a = arrayList;
            this.f5721b = null;
            this.c = new ArrayList<>();
            this.f5722d = Collections.unmodifiableList(arrayList);
            this.f5723e = 2;
            this.f5724f = 2;
        }

        public final void a(b0 b0Var, boolean z10) {
            a3.a aVar;
            RecyclerView.j(b0Var);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.b0 b0Var2 = recyclerView.f5648x0;
            if (b0Var2 != null) {
                b0.a aVar2 = b0Var2.f5803e;
                boolean z11 = aVar2 instanceof b0.a;
                View view = b0Var.f5666a;
                if (z11) {
                    aVar = (a3.a) aVar2.f5805e.remove(view);
                } else {
                    aVar = null;
                }
                j0.p(view, aVar);
            }
            if (z10) {
                t tVar = recyclerView.f5645w;
                if (tVar != null) {
                    tVar.a();
                }
                ArrayList arrayList = recyclerView.f5647x;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((t) arrayList.get(i10)).a();
                }
                Adapter adapter = recyclerView.f5641u;
                if (adapter != null) {
                    adapter.o(b0Var);
                }
                if (recyclerView.f5634q0 != null) {
                    recyclerView.f5629o.c(b0Var);
                }
            }
            b0Var.f5682s = null;
            b0Var.f5681r = null;
            c().d(b0Var);
        }

        public final int b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f5634q0.b()) {
                if (!recyclerView.f5634q0.f5747g) {
                    return i10;
                }
                return recyclerView.f5626m.f(i10, 0);
            }
            StringBuilder o10 = a4.b.o("invalid position ", i10, ". State item count is ");
            o10.append(recyclerView.f5634q0.b());
            o10.append(recyclerView.A());
            throw new IndexOutOfBoundsException(o10.toString());
        }

        public final r c() {
            if (this.f5725g == null) {
                this.f5725g = new r();
                e();
            }
            return this.f5725g;
        }

        public final View d(int i10) {
            return m(i10, Long.MAX_VALUE).f5666a;
        }

        public final void e() {
            if (this.f5725g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5641u != null && recyclerView.isAttachedToWindow()) {
                    r rVar = this.f5725g;
                    rVar.c.add(recyclerView.f5641u);
                }
            }
        }

        public final void f(Adapter<?> adapter, boolean z10) {
            r rVar = this.f5725g;
            if (rVar != null) {
                Set<Adapter<?>> set = rVar.c;
                set.remove(adapter);
                if (set.size() == 0 && !z10) {
                    int i10 = 0;
                    while (true) {
                        SparseArray<r.a> sparseArray = rVar.f5715a;
                        if (i10 < sparseArray.size()) {
                            ArrayList<b0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f5717a;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                a1.b.o(arrayList.get(i11).f5666a);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void g() {
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.N0) {
                m.b bVar = RecyclerView.this.f5632p0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f5927d = 0;
            }
        }

        public final void h(int i10) {
            ArrayList<b0> arrayList = this.c;
            a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        public final void i(View view) {
            b0 L = RecyclerView.L(view);
            boolean m10 = L.m();
            RecyclerView recyclerView = RecyclerView.this;
            if (m10) {
                recyclerView.removeDetachedView(view, false);
            }
            if (L.l()) {
                L.n.n(L);
            } else if (L.r()) {
                L.f5674j &= -33;
            }
            j(L);
            if (recyclerView.V != null && !L.j()) {
                recyclerView.V.j(L);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(b0 b0Var) {
            boolean z10;
            Adapter adapter;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean l2 = b0Var.l();
            boolean z17 = false;
            RecyclerView recyclerView = RecyclerView.this;
            View view = b0Var.f5666a;
            if (!l2 && view.getParent() == null) {
                if (!b0Var.m()) {
                    if (!b0Var.q()) {
                        if ((b0Var.f5674j & 16) == 0) {
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                            if (j0.d.i(view)) {
                                z10 = true;
                                adapter = recyclerView.f5641u;
                                if (adapter == null && z10 && adapter.l(b0Var)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11 && !b0Var.j()) {
                                    z13 = false;
                                    recyclerView.f5629o.c(b0Var);
                                    if (!z13 && !z17 && z10) {
                                        a1.b.o(view);
                                        b0Var.f5682s = null;
                                        b0Var.f5681r = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f5724f > 0) {
                                    if ((b0Var.f5674j & 526) != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        ArrayList<b0> arrayList = this.c;
                                        int size = arrayList.size();
                                        if (size >= this.f5724f && size > 0) {
                                            h(0);
                                            size--;
                                        }
                                        if (RecyclerView.N0 && size > 0) {
                                            int i10 = b0Var.c;
                                            m.b bVar = recyclerView.f5632p0;
                                            if (bVar.c != null) {
                                                int i11 = bVar.f5927d * 2;
                                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                                    if (bVar.c[i12] == i10) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            z15 = false;
                                            if (!z15) {
                                                do {
                                                    size--;
                                                    if (size < 0) {
                                                        break;
                                                    }
                                                    int i13 = arrayList.get(size).c;
                                                    if (bVar.c != null) {
                                                        int i14 = bVar.f5927d * 2;
                                                        for (int i15 = 0; i15 < i14; i15 += 2) {
                                                            if (bVar.c[i15] == i13) {
                                                                z16 = true;
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    z16 = false;
                                                    continue;
                                                } while (z16);
                                                size++;
                                            }
                                        }
                                        arrayList.add(size, b0Var);
                                        z12 = true;
                                        if (!z12) {
                                            a(b0Var, true);
                                            z17 = true;
                                        }
                                        z13 = z12;
                                        recyclerView.f5629o.c(b0Var);
                                        if (!z13) {
                                            return;
                                        }
                                        return;
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                                z13 = z12;
                                recyclerView.f5629o.c(b0Var);
                                if (!z13) {
                                }
                            }
                        }
                        z10 = false;
                        adapter = recyclerView.f5641u;
                        if (adapter == null) {
                        }
                        z11 = false;
                        if (!z11) {
                            z13 = false;
                            recyclerView.f5629o.c(b0Var);
                            if (!z13) {
                            }
                        }
                        if (this.f5724f > 0) {
                        }
                        z12 = false;
                        if (!z12) {
                        }
                        z13 = z12;
                        recyclerView.f5629o.c(b0Var);
                        if (!z13) {
                        }
                    } else {
                        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.A());
                    }
                } else {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + recyclerView.A());
                }
            }
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(b0Var.l());
            sb.append(" isAttached:");
            if (view.getParent() != null) {
                z17 = true;
            }
            sb.append(z17);
            sb.append(recyclerView.A());
            throw new IllegalArgumentException(sb.toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void k(View view) {
            boolean z10;
            ArrayList<b0> arrayList;
            boolean z11;
            boolean z12;
            b0 L = RecyclerView.L(view);
            int i10 = L.f5674j;
            if ((i10 & 12) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10) {
                if ((i10 & 2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i iVar = recyclerView.V;
                    if (iVar != null && !iVar.g(L, L.f())) {
                        z12 = false;
                        if (z12) {
                            if (this.f5721b == null) {
                                this.f5721b = new ArrayList<>();
                            }
                            L.n = this;
                            L.f5678o = true;
                            arrayList = this.f5721b;
                            arrayList.add(L);
                        }
                    }
                    z12 = true;
                    if (z12) {
                    }
                }
            }
            if (L.i() && !L.k() && !recyclerView.f5641u.f5654b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.A());
            }
            L.n = this;
            L.f5678o = false;
            arrayList = this.f5720a;
            arrayList.add(L);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean l(b0 b0Var, int i10, int i11, long j2) {
            boolean z10;
            boolean z11;
            a3.a aVar = null;
            b0Var.f5682s = null;
            RecyclerView recyclerView = RecyclerView.this;
            b0Var.f5681r = recyclerView;
            int i12 = b0Var.f5670f;
            long nanoTime = recyclerView.getNanoTime();
            boolean z12 = false;
            if (j2 != Long.MAX_VALUE) {
                long j10 = this.f5725g.c(i12).f5719d;
                if (j10 != 0 && j10 + nanoTime >= j2) {
                    z11 = false;
                    if (!z11) {
                        return false;
                    }
                }
                z11 = true;
                if (!z11) {
                }
            }
            Adapter<? extends b0> adapter = recyclerView.f5641u;
            adapter.getClass();
            if (b0Var.f5682s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b0Var.c = i10;
                if (adapter.f5654b) {
                    b0Var.f5669e = adapter.e(i10);
                }
                b0Var.f5674j = (b0Var.f5674j & (-520)) | 1;
                int i13 = v2.l.f18154a;
                l.a.a("RV OnBindView");
            }
            b0Var.f5682s = adapter;
            adapter.i(b0Var, i10, b0Var.f());
            View view = b0Var.f5666a;
            if (z10) {
                ArrayList arrayList = b0Var.f5675k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                b0Var.f5674j &= -1025;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof m) {
                    ((m) layoutParams).f5713k = true;
                }
                int i14 = v2.l.f18154a;
                l.a.b();
            }
            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
            r.a c = this.f5725g.c(b0Var.f5670f);
            long j11 = c.f5719d;
            if (j11 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
            }
            c.f5719d = nanoTime2;
            AccessibilityManager accessibilityManager = recyclerView.K;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z12 = true;
            }
            if (z12) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.d.c(view) == 0) {
                    j0.d.s(view, 1);
                }
                androidx.recyclerview.widget.b0 b0Var2 = recyclerView.f5648x0;
                if (b0Var2 != null) {
                    b0.a aVar2 = b0Var2.f5803e;
                    if (aVar2 instanceof b0.a) {
                        aVar2.getClass();
                        View.AccessibilityDelegate c10 = j0.c(view);
                        if (c10 != null) {
                            if (c10 instanceof a.C0000a) {
                                aVar = ((a.C0000a) c10).f110a;
                            } else {
                                aVar = new a3.a(c10);
                            }
                        }
                        if (aVar != null && aVar != aVar2) {
                            aVar2.f5805e.put(view, aVar);
                        }
                    }
                    j0.p(view, aVar2);
                }
            }
            if (recyclerView.f5634q0.f5747g) {
                b0Var.f5671g = i11;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:178:0x02f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0371  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0373  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0376  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x03d7  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x03dc  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x03f4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final b0 m(int i10, long j2) {
            boolean z10;
            b0 b0Var;
            b0 b0Var2;
            boolean z11;
            boolean l2;
            boolean z12;
            ViewGroup.LayoutParams layoutParams;
            m mVar;
            ViewGroup.LayoutParams generateLayoutParams;
            boolean z13;
            int i11;
            boolean z14;
            RecyclerView G;
            boolean z15;
            View view;
            b0 b0Var3;
            boolean z16;
            int size;
            int f10;
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f5634q0.b()) {
                x xVar = recyclerView.f5634q0;
                if (xVar.f5747g) {
                    ArrayList<b0> arrayList = this.f5721b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                b0Var = this.f5721b.get(i12);
                                if (!b0Var.r() && b0Var.e() == i10) {
                                    b0Var.b(32);
                                    break;
                                }
                                i12++;
                            } else if (recyclerView.f5641u.f5654b && (f10 = recyclerView.f5626m.f(i10, 0)) > 0 && f10 < recyclerView.f5641u.d()) {
                                long e10 = recyclerView.f5641u.e(f10);
                                for (int i13 = 0; i13 < size; i13++) {
                                    b0 b0Var4 = this.f5721b.get(i13);
                                    if (!b0Var4.r() && b0Var4.f5669e == e10) {
                                        b0Var4.b(32);
                                        b0Var = b0Var4;
                                        break;
                                    }
                                }
                            }
                        }
                        if (b0Var == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    b0Var = null;
                    if (b0Var == null) {
                    }
                } else {
                    z10 = false;
                    b0Var = null;
                }
                ArrayList<b0> arrayList2 = this.c;
                ArrayList<b0> arrayList3 = this.f5720a;
                if (b0Var == null) {
                    int size2 = arrayList3.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        b0 b0Var5 = arrayList3.get(i14);
                        if (!b0Var5.r() && b0Var5.e() == i10 && !b0Var5.i() && (xVar.f5747g || !b0Var5.k())) {
                            b0Var5.b(32);
                            b0Var = b0Var5;
                            break;
                        }
                    }
                    androidx.recyclerview.widget.d dVar = recyclerView.n;
                    ArrayList arrayList4 = dVar.c;
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size3) {
                            view = (View) arrayList4.get(i15);
                            ((androidx.recyclerview.widget.z) dVar.f5810a).getClass();
                            b0 L = RecyclerView.L(view);
                            if (L.e() == i10 && !L.i() && !L.k()) {
                                break;
                            }
                            i15++;
                        } else {
                            view = null;
                            break;
                        }
                    }
                    if (view != null) {
                        b0Var3 = RecyclerView.L(view);
                        androidx.recyclerview.widget.d dVar2 = recyclerView.n;
                        int indexOfChild = ((androidx.recyclerview.widget.z) dVar2.f5810a).f6000a.indexOfChild(view);
                        if (indexOfChild >= 0) {
                            d.a aVar = dVar2.f5811b;
                            if (aVar.d(indexOfChild)) {
                                aVar.a(indexOfChild);
                                dVar2.m(view);
                                int j10 = recyclerView.n.j(view);
                                if (j10 != -1) {
                                    recyclerView.n.c(j10);
                                    k(view);
                                    b0Var3.b(8224);
                                } else {
                                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + b0Var3 + recyclerView.A());
                                }
                            } else {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                        } else {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                    } else {
                        int size4 = arrayList2.size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            b0 b0Var6 = arrayList2.get(i16);
                            if (!b0Var6.i() && b0Var6.e() == i10 && !b0Var6.g()) {
                                arrayList2.remove(i16);
                                b0Var = b0Var6;
                                break;
                            }
                        }
                        b0Var3 = null;
                    }
                    b0Var = b0Var3;
                    if (b0Var != null) {
                        if (b0Var.k()) {
                            z16 = xVar.f5747g;
                        } else {
                            int i17 = b0Var.c;
                            if (i17 >= 0 && i17 < recyclerView.f5641u.d()) {
                                if (xVar.f5747g || recyclerView.f5641u.f(b0Var.c) == b0Var.f5670f) {
                                    Adapter adapter = recyclerView.f5641u;
                                    if (adapter.f5654b) {
                                        if (b0Var.f5669e == adapter.e(b0Var.c)) {
                                        }
                                    }
                                    z16 = true;
                                }
                                z16 = false;
                            } else {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b0Var + recyclerView.A());
                            }
                        }
                        if (!z16) {
                            b0Var.b(4);
                            if (b0Var.l()) {
                                recyclerView.removeDetachedView(b0Var.f5666a, false);
                                b0Var.n.n(b0Var);
                            } else if (b0Var.r()) {
                                b0Var.f5674j &= -33;
                            }
                            j(b0Var);
                            b0Var = null;
                        } else {
                            z10 = true;
                        }
                    }
                }
                if (b0Var == null) {
                    int f11 = recyclerView.f5626m.f(i10, 0);
                    if (f11 >= 0 && f11 < recyclerView.f5641u.d()) {
                        int f12 = recyclerView.f5641u.f(f11);
                        Adapter adapter2 = recyclerView.f5641u;
                        if (adapter2.f5654b) {
                            long e11 = adapter2.e(f11);
                            int size5 = arrayList3.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    b0 b0Var7 = arrayList3.get(size5);
                                    if (b0Var7.f5669e == e11 && !b0Var7.r()) {
                                        if (f12 == b0Var7.f5670f) {
                                            b0Var7.b(32);
                                            if (b0Var7.k() && !xVar.f5747g) {
                                                b0Var7.f5674j = (b0Var7.f5674j & (-15)) | 2;
                                            }
                                            b0Var = b0Var7;
                                        } else {
                                            arrayList3.remove(size5);
                                            View view2 = b0Var7.f5666a;
                                            recyclerView.removeDetachedView(view2, false);
                                            b0 L2 = RecyclerView.L(view2);
                                            L2.n = null;
                                            L2.f5678o = false;
                                            L2.f5674j &= -33;
                                            j(L2);
                                        }
                                    }
                                    size5--;
                                } else {
                                    int size6 = arrayList2.size();
                                    while (true) {
                                        size6--;
                                        if (size6 < 0) {
                                            break;
                                        }
                                        b0 b0Var8 = arrayList2.get(size6);
                                        if (b0Var8.f5669e == e11 && !b0Var8.g()) {
                                            if (f12 == b0Var8.f5670f) {
                                                arrayList2.remove(size6);
                                                b0Var = b0Var8;
                                            } else {
                                                h(size6);
                                            }
                                        }
                                    }
                                    b0Var = null;
                                }
                            }
                            if (b0Var != null) {
                                b0Var.c = f11;
                                z10 = true;
                            }
                        }
                        if (b0Var == null) {
                            b0 b5 = c().b(f12);
                            if (b5 != null) {
                                b5.o();
                                int[] iArr = RecyclerView.J0;
                            }
                            b0Var = b5;
                        }
                        if (b0Var == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j2 != Long.MAX_VALUE) {
                                long j11 = this.f5725g.c(f12).c;
                                if (j11 != 0 && j11 + nanoTime >= j2) {
                                    z15 = false;
                                    if (!z15) {
                                        return null;
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                            }
                            b0 c = recyclerView.f5641u.c(recyclerView, f12);
                            if (RecyclerView.N0 && (G = RecyclerView.G(c.f5666a)) != null) {
                                c.f5667b = new WeakReference<>(G);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            r.a c10 = this.f5725g.c(f12);
                            long j12 = c10.c;
                            if (j12 != 0) {
                                nanoTime2 = (nanoTime2 / 4) + ((j12 / 4) * 3);
                            }
                            c10.c = nanoTime2;
                            z11 = z10;
                            b0Var2 = c;
                            if (z11 && !xVar.f5747g) {
                                i11 = b0Var2.f5674j;
                                if ((i11 & 8192) == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    b0Var2.f5674j = (i11 & (-8193)) | 0;
                                    if (xVar.f5750j) {
                                        i.e(b0Var2);
                                        i iVar = recyclerView.V;
                                        b0Var2.f();
                                        iVar.getClass();
                                        i.c cVar = new i.c();
                                        cVar.a(b0Var2);
                                        recyclerView.X(b0Var2, cVar);
                                    }
                                }
                            }
                            if (!xVar.f5747g && b0Var2.h()) {
                                b0Var2.f5671g = i10;
                            } else {
                                if (b0Var2.h()) {
                                    if ((b0Var2.f5674j & 2) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        if (b0Var2.i()) {
                                        }
                                    }
                                }
                                l2 = l(b0Var2, recyclerView.f5626m.f(i10, 0), i10, j2);
                                layoutParams = b0Var2.f5666a.getLayoutParams();
                                if (layoutParams == null) {
                                    generateLayoutParams = recyclerView.generateDefaultLayoutParams();
                                } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                                    generateLayoutParams = recyclerView.generateLayoutParams(layoutParams);
                                } else {
                                    mVar = (m) layoutParams;
                                    mVar.f5711i = b0Var2;
                                    if (!z11 && l2) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    mVar.f5714l = z13;
                                    return b0Var2;
                                }
                                mVar = (m) generateLayoutParams;
                                b0Var2.f5666a.setLayoutParams(mVar);
                                mVar.f5711i = b0Var2;
                                if (!z11) {
                                }
                                z13 = false;
                                mVar.f5714l = z13;
                                return b0Var2;
                            }
                            l2 = false;
                            layoutParams = b0Var2.f5666a.getLayoutParams();
                            if (layoutParams == null) {
                            }
                            mVar = (m) generateLayoutParams;
                            b0Var2.f5666a.setLayoutParams(mVar);
                            mVar.f5711i = b0Var2;
                            if (!z11) {
                            }
                            z13 = false;
                            mVar.f5714l = z13;
                            return b0Var2;
                        }
                    } else {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + f11 + ").state:" + xVar.b() + recyclerView.A());
                    }
                }
                b0Var2 = b0Var;
                z11 = z10;
                if (z11) {
                    i11 = b0Var2.f5674j;
                    if ((i11 & 8192) == 0) {
                    }
                    if (z14) {
                    }
                }
                if (!xVar.f5747g) {
                }
                if (b0Var2.h()) {
                }
                l2 = l(b0Var2, recyclerView.f5626m.f(i10, 0), i10, j2);
                layoutParams = b0Var2.f5666a.getLayoutParams();
                if (layoutParams == null) {
                }
                mVar = (m) generateLayoutParams;
                b0Var2.f5666a.setLayoutParams(mVar);
                mVar.f5711i = b0Var2;
                if (!z11) {
                }
                z13 = false;
                mVar.f5714l = z13;
                return b0Var2;
            }
            throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + recyclerView.f5634q0.b() + recyclerView.A());
        }

        public final void n(b0 b0Var) {
            ArrayList<b0> arrayList;
            if (b0Var.f5678o) {
                arrayList = this.f5721b;
            } else {
                arrayList = this.f5720a;
            }
            arrayList.remove(b0Var);
            b0Var.n = null;
            b0Var.f5678o = false;
            b0Var.f5674j &= -33;
        }

        public final void o() {
            l lVar = RecyclerView.this.f5643v;
            this.f5724f = this.f5723e + (lVar != null ? lVar.f5701k : 0);
            ArrayList<b0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5724f; size--) {
                h(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface t {
        void a();
    }

    /* loaded from: classes.dex */
    public class u extends f {
        public u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            recyclerView.f5634q0.f5746f = true;
            recyclerView.W(true);
            if (recyclerView.f5626m.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f5626m;
            boolean z10 = true;
            boolean z11 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f5793b;
                arrayList.add(aVar.h(obj, 4, i10, i11));
                aVar.f5796f |= 4;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f5626m;
            boolean z10 = true;
            boolean z11 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f5793b;
                arrayList.add(aVar.h(null, 1, i10, i11));
                aVar.f5796f |= 1;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(int i10, int i11) {
            boolean z10;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f5626m;
            aVar.getClass();
            if (i10 != i11) {
                ArrayList<a.b> arrayList = aVar.f5793b;
                arrayList.add(aVar.h(null, 8, i10, i11));
                aVar.f5796f |= 8;
                z10 = true;
                if (arrayList.size() == 1) {
                    if (!z10) {
                        g();
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f5626m;
            boolean z10 = true;
            boolean z11 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f5793b;
                arrayList.add(aVar.h(null, 2, i10, i11));
                aVar.f5796f |= 2;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        public final void g() {
            boolean z10 = RecyclerView.M0;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.C && recyclerView.B) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.m(recyclerView, recyclerView.f5633q);
                return;
            }
            recyclerView.J = true;
            recyclerView.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class v extends h3.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public Parcelable f5728k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new v[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = l.class.getClassLoader();
            }
            this.f5728k = parcel.readParcelable(classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeParcelable(this.f5728k, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class w {

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f5730b;
        public l c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5731d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5732e;

        /* renamed from: f  reason: collision with root package name */
        public View f5733f;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5735h;

        /* renamed from: a  reason: collision with root package name */
        public int f5729a = -1;

        /* renamed from: g  reason: collision with root package name */
        public final a f5734g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d  reason: collision with root package name */
            public int f5738d = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f5740f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f5741g = 0;

            /* renamed from: a  reason: collision with root package name */
            public int f5736a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5737b = 0;
            public int c = Integer.MIN_VALUE;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f5739e = null;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f5738d;
                if (i10 >= 0) {
                    this.f5738d = -1;
                    recyclerView.O(i10);
                    this.f5740f = false;
                } else if (this.f5740f) {
                    Interpolator interpolator = this.f5739e;
                    if (interpolator != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.c;
                    if (i11 >= 1) {
                        recyclerView.f5628n0.c(this.f5736a, this.f5737b, i11, interpolator);
                        int i12 = this.f5741g + 1;
                        this.f5741g = i12;
                        if (i12 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f5740f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f5741g = 0;
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public final PointF a(int i10) {
            l lVar = this.c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f5730b;
            int i12 = -1;
            if (this.f5729a == -1 || recyclerView == null) {
                f();
            }
            if (this.f5731d && this.f5733f == null && this.c != null && (a10 = a(this.f5729a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.e0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            boolean z10 = false;
            this.f5731d = false;
            View view = this.f5733f;
            a aVar = this.f5734g;
            if (view != null) {
                this.f5730b.getClass();
                b0 L = RecyclerView.L(view);
                if (L != null) {
                    i12 = L.e();
                }
                if (i12 == this.f5729a) {
                    View view2 = this.f5733f;
                    x xVar = recyclerView.f5634q0;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5733f = null;
                }
            }
            if (this.f5732e) {
                x xVar2 = recyclerView.f5634q0;
                c(i10, i11, aVar);
                if (aVar.f5738d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.f5732e) {
                    this.f5731d = true;
                    recyclerView.f5628n0.b();
                }
            }
        }

        public abstract void c(int i10, int i11, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (!this.f5732e) {
                return;
            }
            this.f5732e = false;
            d();
            this.f5730b.f5634q0.f5742a = -1;
            this.f5733f = null;
            this.f5729a = -1;
            this.f5731d = false;
            l lVar = this.c;
            if (lVar.f5695e == this) {
                lVar.f5695e = null;
            }
            this.c = null;
            this.f5730b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class x {

        /* renamed from: a  reason: collision with root package name */
        public int f5742a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f5743b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f5744d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f5745e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5746f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5747g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5748h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5749i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5750j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5751k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f5752l;

        /* renamed from: m  reason: collision with root package name */
        public long f5753m;
        public int n;

        public final void a(int i10) {
            if ((this.f5744d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f5744d));
        }

        public final int b() {
            return this.f5747g ? this.f5743b - this.c : this.f5745e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f5742a + ", mData=null, mItemCount=" + this.f5745e + ", mIsMeasuring=" + this.f5749i + ", mPreviousLayoutItemCount=" + this.f5743b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f5746f + ", mInPreLayout=" + this.f5747g + ", mRunSimpleAnimations=" + this.f5750j + ", mRunPredictiveAnimations=" + this.f5751k + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class y extends h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final EdgeEffect a(int i10, RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {
    }

    static {
        L0 = Build.VERSION.SDK_INT >= 23;
        M0 = true;
        N0 = true;
        Class<?> cls = Integer.TYPE;
        O0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        P0 = new c();
        Q0 = new y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:40)(11:79|(1:81)|42|43|44|(1:46)(1:63)|47|48|49|50|51)|43|44|(0)(0)|47|48|49|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029f, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a5, code lost:
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b5, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02d5, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0268 A[Catch: ClassCastException -> 0x02d6, IllegalAccessException -> 0x02f5, InstantiationException -> 0x0314, InvocationTargetException -> 0x0331, ClassNotFoundException -> 0x034e, TryCatch #4 {ClassCastException -> 0x02d6, ClassNotFoundException -> 0x034e, IllegalAccessException -> 0x02f5, InstantiationException -> 0x0314, InvocationTargetException -> 0x0331, blocks: (B:55:0x0262, B:57:0x0268, B:59:0x0275, B:60:0x0280, B:66:0x02a6, B:64:0x029f, B:68:0x02b5, B:69:0x02d5, B:58:0x0271), top: B:91:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0271 A[Catch: ClassCastException -> 0x02d6, IllegalAccessException -> 0x02f5, InstantiationException -> 0x0314, InvocationTargetException -> 0x0331, ClassNotFoundException -> 0x034e, TryCatch #4 {ClassCastException -> 0x02d6, ClassNotFoundException -> 0x034e, IllegalAccessException -> 0x02f5, InstantiationException -> 0x0314, InvocationTargetException -> 0x0331, blocks: (B:55:0x0262, B:57:0x0268, B:59:0x0275, B:60:0x0280, B:66:0x02a6, B:64:0x029f, B:68:0x02b5, B:69:0x02d5, B:58:0x0271), top: B:91:0x0262 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.b bVar;
        float a10;
        float a11;
        boolean z10;
        int i11;
        char c10;
        StringBuilder sb;
        String str;
        ClassLoader classLoader;
        this.f5620j = new u();
        this.f5622k = new s();
        this.f5629o = new g0();
        this.f5633q = new a();
        this.f5635r = new Rect();
        this.f5637s = new Rect();
        this.f5639t = new RectF();
        this.f5647x = new ArrayList();
        this.f5649y = new ArrayList<>();
        this.f5651z = new ArrayList<>();
        this.E = 0;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = Q0;
        this.V = new androidx.recyclerview.widget.e();
        this.W = 0;
        this.f5611a0 = -1;
        this.f5623k0 = Float.MIN_VALUE;
        this.f5625l0 = Float.MIN_VALUE;
        this.f5627m0 = true;
        this.f5628n0 = new a0();
        if (N0) {
            bVar = new m.b();
        } else {
            bVar = null;
        }
        this.f5632p0 = bVar;
        this.f5634q0 = new x();
        this.f5640t0 = false;
        this.f5642u0 = false;
        j jVar = new j();
        this.f5644v0 = jVar;
        this.f5646w0 = false;
        this.f5650y0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new ArrayList();
        this.E0 = new b();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5616g0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = q0.f209a;
            a10 = q0.a.a(viewConfiguration);
        } else {
            a10 = q0.a(viewConfiguration, context);
        }
        this.f5623k0 = a10;
        if (i12 >= 26) {
            a11 = q0.a.b(viewConfiguration);
        } else {
            a11 = q0.a(viewConfiguration, context);
        }
        this.f5625l0 = a11;
        this.f5619i0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5621j0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5618i = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        this.V.f5684a = jVar;
        this.f5626m = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.a0(this));
        this.n = new androidx.recyclerview.widget.d(new androidx.recyclerview.widget.z(this));
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (i12 >= 26) {
            i11 = j0.l.b(this);
        } else {
            i11 = 0;
        }
        if (i11 == 0 && i12 >= 26) {
            j0.l.l(this, 8);
        }
        if (j0.d.c(this) == 0) {
            j0.d.s(this, 1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.b0(this));
        int[] iArr = v8.b.f18180g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        j0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5631p = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c10 = 2;
                new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + A());
            }
        } else {
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                try {
                    if (trim.charAt(0) == '.') {
                        sb = new StringBuilder();
                        sb.append(context.getPackageName());
                    } else {
                        if (!trim.contains(".")) {
                            sb = new StringBuilder();
                            sb.append(RecyclerView.class.getPackage().getName());
                            sb.append('.');
                        }
                        str = trim;
                        if (!isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(l.class);
                        Constructor constructor = asSubclass.getConstructor(O0);
                        Object[] objArr = new Object[4];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                        Object[] objArr2 = objArr;
                        constructor.setAccessible(true);
                        setLayoutManager((l) constructor.newInstance(objArr2));
                    }
                    if (!isInEditMode()) {
                    }
                    Class<? extends U> asSubclass2 = Class.forName(str, false, classLoader).asSubclass(l.class);
                    Constructor constructor2 = asSubclass2.getConstructor(O0);
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = context;
                    objArr3[1] = attributeSet;
                    objArr3[c10] = Integer.valueOf(i10);
                    objArr3[3] = 0;
                    Object[] objArr22 = objArr3;
                    constructor2.setAccessible(true);
                    setLayoutManager((l) constructor2.newInstance(objArr22));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
                sb.append(trim);
                trim = sb.toString();
                str = trim;
            }
        }
        int[] iArr2 = J0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        j0.o(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView G = G(viewGroup.getChildAt(i10));
                if (G != null) {
                    return G;
                }
            }
            return null;
        }
        return null;
    }

    public static b0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f5711i;
    }

    private int Z(int i10, float f10) {
        float b5;
        EdgeEffect edgeEffect;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect2 = this.S;
        float f11 = 0.0f;
        if (edgeEffect2 == null || e3.c.a(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.U;
            if (edgeEffect3 != null && e3.c.a(edgeEffect3) != 0.0f) {
                if (canScrollVertically(1)) {
                    edgeEffect = this.U;
                    edgeEffect.onRelease();
                } else {
                    b5 = e3.c.b(this.U, height, 1.0f - width);
                    if (e3.c.a(this.U) == 0.0f) {
                        this.U.onRelease();
                    }
                    f11 = b5;
                }
            }
            return Math.round(f11 * getHeight());
        } else if (canScrollVertically(-1)) {
            edgeEffect = this.S;
            edgeEffect.onRelease();
        } else {
            b5 = -e3.c.b(this.S, -height, width);
            if (e3.c.a(this.S) == 0.0f) {
                this.S.onRelease();
            }
            f11 = b5;
        }
        invalidate();
        return Math.round(f11 * getHeight());
    }

    private a3.t getScrollingChildHelper() {
        if (this.f5652z0 == null) {
            this.f5652z0 = new a3.t(this);
        }
        return this.f5652z0;
    }

    public static void j(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f5667b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == b0Var.f5666a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                b0Var.f5667b = null;
                return;
            }
        }
    }

    public static int m(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && e3.c.a(edgeEffect) != 0.0f) {
            int round = Math.round(e3.c.b(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || edgeEffect2 == null || e3.c.a(edgeEffect2) == 0.0f) {
            return i10;
        } else {
            float f10 = i11;
            int round2 = Math.round(e3.c.b(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
    }

    public final String A() {
        return " " + super.toString() + ", adapter:" + this.f5641u + ", layout:" + this.f5643v + ", context:" + getContext();
    }

    public final void B(x xVar) {
        if (getScrollState() != 2) {
            xVar.getClass();
            return;
        }
        OverScroller overScroller = this.f5628n0.f5660k;
        overScroller.getFinalX();
        overScroller.getCurrX();
        xVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View C(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    public final b0 D(View view) {
        View C = C(view);
        if (C == null) {
            return null;
        }
        return K(C);
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<p> arrayList = this.f5651z;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = arrayList.get(i10);
            if (pVar.c(motionEvent) && action != 3) {
                this.A = pVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e10 = this.n.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            b0 L = L(this.n.d(i12));
            if (!L.q()) {
                int e11 = L.e();
                if (e11 < i10) {
                    i10 = e11;
                }
                if (e11 > i11) {
                    i11 = e11;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final b0 H(int i10) {
        b0 b0Var = null;
        if (this.M) {
            return null;
        }
        int h10 = this.n.h();
        for (int i11 = 0; i11 < h10; i11++) {
            b0 L = L(this.n.g(i11));
            if (L != null && !L.k() && I(L) == i10) {
                if (!this.n.k(L.f5666a)) {
                    return L;
                }
                b0Var = L;
            }
        }
        return b0Var;
    }

    public final int I(b0 b0Var) {
        boolean z10;
        if ((b0Var.f5674j & 524) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && b0Var.h()) {
            androidx.recyclerview.widget.a aVar = this.f5626m;
            int i10 = b0Var.c;
            ArrayList<a.b> arrayList = aVar.f5793b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = arrayList.get(i11);
                int i12 = bVar.f5797a;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 8) {
                            int i13 = bVar.f5798b;
                            if (i13 == i10) {
                                i10 = bVar.f5799d;
                            } else {
                                if (i13 < i10) {
                                    i10--;
                                }
                                if (bVar.f5799d <= i10) {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        int i14 = bVar.f5798b;
                        if (i14 <= i10) {
                            int i15 = bVar.f5799d;
                            if (i14 + i15 <= i10) {
                                i10 -= i15;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (bVar.f5798b <= i10) {
                    i10 += bVar.f5799d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long J(b0 b0Var) {
        if (this.f5641u.f5654b) {
            return b0Var.f5669e;
        }
        return b0Var.c;
    }

    public final b0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return L(view);
    }

    public final Rect M(View view) {
        m mVar = (m) view.getLayoutParams();
        boolean z10 = mVar.f5713k;
        Rect rect = mVar.f5712j;
        if (!z10) {
            return rect;
        }
        if (this.f5634q0.f5747g && (mVar.d() || mVar.f5711i.i())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<k> arrayList = this.f5649y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f5635r;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).f(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f5713k = false;
        return rect;
    }

    public final boolean N() {
        return this.O > 0;
    }

    public final void O(int i10) {
        if (this.f5643v == null) {
            return;
        }
        setScrollState(2);
        this.f5643v.w0(i10);
        awakenScrollBars();
    }

    public final void P() {
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((m) this.n.g(i10).getLayoutParams()).f5713k = true;
        }
        ArrayList<b0> arrayList = this.f5622k.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11).f5666a.getLayoutParams();
            if (mVar != null) {
                mVar.f5713k = true;
            }
        }
    }

    public final void Q(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.n.h();
        for (int i13 = 0; i13 < h10; i13++) {
            b0 L = L(this.n.g(i13));
            if (L != null && !L.q()) {
                int i14 = L.c;
                if (i14 >= i12) {
                    L.n(-i11, z10);
                } else if (i14 >= i10) {
                    L.b(8);
                    L.n(-i11, z10);
                    L.c = i10 - 1;
                }
                this.f5634q0.f5746f = true;
            }
        }
        s sVar = this.f5622k;
        ArrayList<b0> arrayList = sVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = arrayList.get(size);
                if (b0Var != null) {
                    int i15 = b0Var.c;
                    if (i15 >= i12) {
                        b0Var.n(-i11, z10);
                    } else if (i15 >= i10) {
                        b0Var.b(8);
                        sVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.O++;
    }

    public final void S(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.O - 1;
        this.O = i11;
        if (i11 < 1) {
            this.O = 0;
            if (z10) {
                int i12 = this.I;
                this.I = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.K;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        b3.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.D0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.f5666a.getParent() == this && !b0Var.q() && (i10 = b0Var.f5680q) != -1) {
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        j0.d.s(b0Var.f5666a, i10);
                        b0Var.f5680q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void T(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5611a0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5611a0 = motionEvent.getPointerId(i10);
            int x3 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f5614e0 = x3;
            this.c0 = x3;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f5615f0 = y10;
            this.f5613d0 = y10;
        }
    }

    public final void U() {
        if (!this.f5646w0 && this.B) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.m(this, this.E0);
            this.f5646w0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.M) {
            androidx.recyclerview.widget.a aVar = this.f5626m;
            aVar.l(aVar.f5793b);
            aVar.l(aVar.c);
            aVar.f5796f = 0;
            if (this.N) {
                this.f5643v.f0();
            }
        }
        if (this.V != null && this.f5643v.I0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5626m.j();
        } else {
            this.f5626m.c();
        }
        if (!this.f5640t0 && !this.f5642u0) {
            z11 = false;
            if (!this.D && this.V != null && (((z14 = this.M) || z11 || this.f5643v.f5696f) && (!z14 || this.f5641u.f5654b))) {
                z12 = true;
            } else {
                z12 = false;
            }
            x xVar = this.f5634q0;
            xVar.f5750j = z12;
            if (z12 && z11 && !this.M) {
                if (this.V == null && this.f5643v.I0()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    z15 = true;
                }
            }
            xVar.f5751k = z15;
        }
        z11 = true;
        if (!this.D) {
        }
        z12 = false;
        x xVar2 = this.f5634q0;
        xVar2.f5750j = z12;
        if (z12) {
            if (this.V == null) {
            }
            z13 = false;
            if (z13) {
            }
        }
        xVar2.f5751k = z15;
    }

    public final void W(boolean z10) {
        this.N = z10 | this.N;
        this.M = true;
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 L = L(this.n.g(i10));
            if (L != null && !L.q()) {
                L.b(6);
            }
        }
        P();
        s sVar = this.f5622k;
        ArrayList<b0> arrayList = sVar.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = arrayList.get(i11);
            if (b0Var != null) {
                b0Var.b(6);
                b0Var.a(null);
            }
        }
        Adapter adapter = RecyclerView.this.f5641u;
        if (adapter == null || !adapter.f5654b) {
            sVar.g();
        }
    }

    public final void X(b0 b0Var, i.c cVar) {
        boolean z10 = false;
        int i10 = (b0Var.f5674j & (-8193)) | 0;
        b0Var.f5674j = i10;
        boolean z11 = this.f5634q0.f5748h;
        g0 g0Var = this.f5629o;
        if (z11) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !b0Var.k() && !b0Var.q()) {
                g0Var.f5858b.J(J(b0Var), b0Var);
            }
        }
        p.h<b0, g0.a> hVar = g0Var.f5857a;
        g0.a orDefault = hVar.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = g0.a.a();
            hVar.put(b0Var, orDefault);
        }
        orDefault.f5861b = cVar;
        orDefault.f5860a |= 4;
    }

    public final int Y(int i10, float f10) {
        float b5;
        EdgeEffect edgeEffect;
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect2 = this.R;
        float f11 = 0.0f;
        if (edgeEffect2 == null || e3.c.a(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.T;
            if (edgeEffect3 != null && e3.c.a(edgeEffect3) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    edgeEffect = this.T;
                    edgeEffect.onRelease();
                } else {
                    b5 = e3.c.b(this.T, width, height);
                    if (e3.c.a(this.T) == 0.0f) {
                        this.T.onRelease();
                    }
                    f11 = b5;
                }
            }
            return Math.round(f11 * getWidth());
        } else if (canScrollHorizontally(-1)) {
            edgeEffect = this.R;
            edgeEffect.onRelease();
        } else {
            b5 = -e3.c.b(this.R, -width, 1.0f - height);
            if (e3.c.a(this.R) == 0.0f) {
                this.R.onRelease();
            }
            f11 = b5;
        }
        invalidate();
        return Math.round(f11 * getWidth());
    }

    public final void a0(k kVar) {
        l lVar = this.f5643v;
        if (lVar != null) {
            lVar.e("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f5649y;
        arrayList.remove(kVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        P();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        l lVar = this.f5643v;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5635r;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f5713k) {
                int i10 = rect.left;
                Rect rect2 = mVar.f5712j;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f5643v.t0(this, view, this.f5635r, !this.D, view2 == null);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.f5612b0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        m0(0);
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.S;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.U.isFinished();
        }
        if (z10) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f5643v.j((m) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.h()) {
            return this.f5643v.n(this.f5634q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.h()) {
            return this.f5643v.o(this.f5634q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.h()) {
            return this.f5643v.p(this.f5634q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.i()) {
            return this.f5643v.q(this.f5634q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.i()) {
            return this.f5643v.r(this.f5634q0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l lVar = this.f5643v;
        if (lVar != null && lVar.i()) {
            return this.f5643v.s(this.f5634q0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        EdgeEffect edgeEffect;
        float width;
        float height;
        n();
        Adapter adapter = this.f5641u;
        int[] iArr = this.C0;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            e0(i10, i11, iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            i14 = i17;
            i13 = i18;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f5649y.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.C0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int i19 = i13;
        u(i14, i13, i15, i16, this.A0, i12, iArr2);
        int i20 = iArr[0];
        int i21 = i15 - i20;
        int i22 = iArr[1];
        int i23 = i16 - i22;
        if (i20 == 0 && i22 == 0) {
            z10 = false;
            int i24 = this.f5614e0;
            int[] iArr3 = this.A0;
            int i25 = iArr3[0];
            this.f5614e0 = i24 - i25;
            int i26 = this.f5615f0;
            int i27 = iArr3[1];
            this.f5615f0 = i26 - i27;
            int[] iArr4 = this.B0;
            iArr4[0] = iArr4[0] + i25;
            iArr4[1] = iArr4[1] + i27;
            if (getOverScrollMode() != 2) {
                if (motionEvent != null && !a1.b.l0(motionEvent, 8194)) {
                    float x3 = motionEvent.getX();
                    float f10 = i21;
                    float y10 = motionEvent.getY();
                    float f11 = i23;
                    if (f10 < 0.0f) {
                        x();
                        edgeEffect = this.R;
                        width = (-f10) / getWidth();
                        height = 1.0f - (y10 / getHeight());
                    } else if (f10 > 0.0f) {
                        y();
                        edgeEffect = this.T;
                        width = f10 / getWidth();
                        height = y10 / getHeight();
                    } else {
                        z11 = false;
                        if (f11 >= 0.0f) {
                            z();
                            e3.c.b(this.S, (-f11) / getHeight(), x3 / getWidth());
                        } else {
                            if (f11 > 0.0f) {
                                w();
                                e3.c.b(this.U, f11 / getHeight(), 1.0f - (x3 / getWidth()));
                            }
                            if (!z11 || f10 != 0.0f || f11 != 0.0f) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                j0.d.k(this);
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        j0.d.k(this);
                    }
                    e3.c.b(edgeEffect, width, height);
                    z11 = true;
                    if (f11 >= 0.0f) {
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    WeakHashMap<View, v0> weakHashMap22 = j0.f188a;
                    j0.d.k(this);
                }
                l(i10, i11);
            }
            if (i14 == 0 || i19 != 0) {
                v(i14, i19);
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            if (!z10 || i14 != 0 || i19 != 0) {
                return true;
            }
            return false;
        }
        z10 = true;
        int i242 = this.f5614e0;
        int[] iArr32 = this.A0;
        int i252 = iArr32[0];
        this.f5614e0 = i242 - i252;
        int i262 = this.f5615f0;
        int i272 = iArr32[1];
        this.f5615f0 = i262 - i272;
        int[] iArr42 = this.B0;
        iArr42[0] = iArr42[0] + i252;
        iArr42[1] = iArr42[1] + i272;
        if (getOverScrollMode() != 2) {
        }
        if (i14 == 0) {
        }
        v(i14, i19);
        if (!awakenScrollBars()) {
        }
        return !z10 ? true : true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        ArrayList<k> arrayList = this.f5649y;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.R;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f5631p) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, 0.0f);
            EdgeEffect edgeEffect2 = this.R;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5631p) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.S;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.T;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f5631p) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.T;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.U;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5631p) {
                f10 = getPaddingRight() + (-getWidth());
                f11 = getPaddingBottom() + (-getHeight());
            } else {
                f10 = -getWidth();
                f11 = -getHeight();
            }
            canvas.translate(f10, f11);
            EdgeEffect edgeEffect8 = this.U;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.V == null || arrayList.size() <= 0 || !this.V.l()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        b0 b0Var;
        k0();
        R();
        int i14 = v2.l.f18154a;
        l.a.a("RV Scroll");
        x xVar = this.f5634q0;
        B(xVar);
        s sVar = this.f5622k;
        if (i10 != 0) {
            i12 = this.f5643v.v0(i10, sVar, xVar);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f5643v.x0(i11, sVar, xVar);
        } else {
            i13 = 0;
        }
        l.a.b();
        int e10 = this.n.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d5 = this.n.d(i15);
            b0 K = K(d5);
            if (K != null && (b0Var = K.f5673i) != null) {
                int left = d5.getLeft();
                int top = d5.getTop();
                View view = b0Var.f5666a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S(true);
        l0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void f(b0 b0Var) {
        boolean z10;
        View view = b0Var.f5666a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5622k.n(K(view));
        if (b0Var.m()) {
            this.n.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.d dVar = this.n;
        if (!z10) {
            dVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((androidx.recyclerview.widget.z) dVar.f5810a).f6000a.indexOfChild(view);
        if (indexOfChild >= 0) {
            dVar.f5811b.h(indexOfChild);
            dVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0(int i10) {
        w wVar;
        if (this.G) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f5628n0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f5660k.abortAnimation();
        l lVar = this.f5643v;
        if (lVar != null && (wVar = lVar.f5695e) != null) {
            wVar.f();
        }
        l lVar2 = this.f5643v;
        if (lVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        lVar2.w0(i10);
        awakenScrollBars();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0191, code lost:
        if ((r3 * r1) >= 0) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        int i11;
        int i12;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        this.f5643v.getClass();
        boolean z14 = false;
        if (this.f5641u != null && this.f5643v != null && !N() && !this.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        x xVar = this.f5634q0;
        s sVar = this.f5622k;
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.f5643v.i()) {
                if (i10 == 2) {
                    i14 = 130;
                } else {
                    i14 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i14) == null) {
                    z11 = true;
                    if (!z11 && this.f5643v.h()) {
                        if (this.f5643v.E() != 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i10 != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!(z12 ^ z13)) {
                            i13 = 66;
                        } else {
                            i13 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i13) != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        n();
                        if (C(view) == null) {
                            return null;
                        }
                        k0();
                        this.f5643v.Z(view, i10, sVar, xVar);
                        l0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i10);
                }
            }
            z11 = false;
            if (!z11) {
                if (this.f5643v.E() != 1) {
                }
                if (i10 != 2) {
                }
                if (!(z12 ^ z13)) {
                }
                if (focusFinder.findNextFocus(this, view, i13) != null) {
                }
            }
            if (z11) {
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                n();
                if (C(view) == null) {
                    return null;
                }
                k0();
                view2 = this.f5643v.Z(view, i10, sVar, xVar);
                l0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            b0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (C(view2) != null) {
                if (view != null && C(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f5635r;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f5637s;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    if (this.f5643v.E() == 1) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                    int i15 = rect.left;
                    int i16 = rect2.left;
                    if ((i15 < i16 || rect.right <= i16) && rect.right < rect2.right) {
                        i12 = 1;
                    } else {
                        int i17 = rect.right;
                        int i18 = rect2.right;
                        if ((i17 > i18 || i15 >= i18) && i15 > i16) {
                            i12 = -1;
                        } else {
                            i12 = 0;
                        }
                    }
                    int i19 = rect.top;
                    int i20 = rect2.top;
                    if ((i19 < i20 || rect.bottom <= i20) && rect.bottom < rect2.bottom) {
                        c10 = 1;
                    } else {
                        int i21 = rect.bottom;
                        int i22 = rect2.bottom;
                        if ((i21 > i22 || i19 >= i22) && i19 > i20) {
                            c10 = 65535;
                        } else {
                            c10 = 0;
                        }
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 17) {
                                if (i10 != 33) {
                                    if (i10 != 66) {
                                        if (i10 == 130) {
                                            if (c10 > 0) {
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Invalid direction: " + i10 + A());
                                        }
                                    } else if (i12 > 0) {
                                    }
                                } else if (c10 < 0) {
                                }
                            } else if (i12 < 0) {
                            }
                        } else if (c10 <= 0) {
                            if (c10 == 0 && i12 * i11 > 0) {
                            }
                        }
                    } else if (c10 >= 0) {
                        if (c10 == 0) {
                        }
                    }
                }
                z14 = true;
            }
            if (z14) {
                return super.focusSearch(view, i10);
            }
            return view2;
        }
        z14 = false;
        if (z14) {
        }
    }

    public final void g(k kVar) {
        l lVar = this.f5643v;
        if (lVar != null) {
            lVar.e("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f5649y;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kVar);
        P();
        requestLayout();
    }

    public final void g0(Adapter<?> adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.f5641u;
        u uVar = this.f5620j;
        if (adapter2 != null) {
            adapter2.r(uVar);
            this.f5641u.k(this);
        }
        s sVar = this.f5622k;
        if (!z10 || z11) {
            i iVar = this.V;
            if (iVar != null) {
                iVar.k();
            }
            l lVar = this.f5643v;
            if (lVar != null) {
                lVar.r0(sVar);
                this.f5643v.s0(sVar);
            }
            sVar.f5720a.clear();
            sVar.g();
        }
        androidx.recyclerview.widget.a aVar = this.f5626m;
        aVar.l(aVar.f5793b);
        aVar.l(aVar.c);
        aVar.f5796f = 0;
        Adapter<?> adapter3 = this.f5641u;
        this.f5641u = adapter;
        if (adapter != null) {
            adapter.p(uVar);
            adapter.g(this);
        }
        l lVar2 = this.f5643v;
        if (lVar2 != null) {
            lVar2.W(this.f5641u);
        }
        Adapter adapter4 = this.f5641u;
        sVar.f5720a.clear();
        sVar.g();
        sVar.f(adapter3, true);
        r c10 = sVar.c();
        if (adapter3 != null) {
            c10.f5716b--;
        }
        if (!z10 && c10.f5716b == 0) {
            c10.a();
        }
        if (adapter4 != null) {
            c10.f5716b++;
        } else {
            c10.getClass();
        }
        sVar.e();
        this.f5634q0.f5746f = true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f5643v;
        if (lVar != null) {
            return lVar.v();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f5643v;
        if (lVar != null) {
            return lVar.w(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f5643v;
        if (lVar != null) {
            return lVar.x(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f5641u;
    }

    @Override // android.view.View
    public int getBaseline() {
        l lVar = this.f5643v;
        if (lVar != null) {
            lVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5631p;
    }

    public androidx.recyclerview.widget.b0 getCompatAccessibilityDelegate() {
        return this.f5648x0;
    }

    public h getEdgeEffectFactory() {
        return this.Q;
    }

    public i getItemAnimator() {
        return this.V;
    }

    public int getItemDecorationCount() {
        return this.f5649y.size();
    }

    public l getLayoutManager() {
        return this.f5643v;
    }

    public int getMaxFlingVelocity() {
        return this.f5621j0;
    }

    public int getMinFlingVelocity() {
        return this.f5619i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (N0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public o getOnFlingListener() {
        return this.f5617h0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5627m0;
    }

    public r getRecycledViewPool() {
        return this.f5622k.c();
    }

    public int getScrollState() {
        return this.W;
    }

    public final void h(q qVar) {
        if (this.f5638s0 == null) {
            this.f5638s0 = new ArrayList();
        }
        this.f5638s0.add(qVar);
    }

    public final boolean h0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float a10 = e3.c.a(edgeEffect) * i11;
        float f10 = this.f5618i * 0.015f;
        double log = Math.log((Math.abs(-i10) * 0.35f) / f10);
        double d5 = K0;
        if (((float) (Math.exp((d5 / (d5 - 1.0d)) * log) * f10)) < a10) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().f(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(String str) {
        if (N()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + A());
        } else if (this.P > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + A()));
        }
    }

    public final void i0(int i10, int i11, boolean z10) {
        l lVar = this.f5643v;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.G) {
        } else {
            int i12 = 0;
            if (!lVar.h()) {
                i10 = 0;
            }
            if (!this.f5643v.i()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().g(i12, 1);
                }
                this.f5628n0.c(i10, i11, Integer.MIN_VALUE, null);
            }
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.G;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f212d;
    }

    public final void j0(int i10) {
        if (this.G) {
            return;
        }
        l lVar = this.f5643v;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar.G0(this, this.f5634q0, i10);
        }
    }

    public final void k() {
        int h10 = this.n.h();
        for (int i10 = 0; i10 < h10; i10++) {
            b0 L = L(this.n.g(i10));
            if (!L.q()) {
                L.f5668d = -1;
                L.f5671g = -1;
            }
        }
        s sVar = this.f5622k;
        ArrayList<b0> arrayList = sVar.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = arrayList.get(i11);
            b0Var.f5668d = -1;
            b0Var.f5671g = -1;
        }
        ArrayList<b0> arrayList2 = sVar.f5720a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b0 b0Var2 = arrayList2.get(i12);
            b0Var2.f5668d = -1;
            b0Var2.f5671g = -1;
        }
        ArrayList<b0> arrayList3 = sVar.f5721b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                b0 b0Var3 = sVar.f5721b.get(i13);
                b0Var3.f5668d = -1;
                b0Var3.f5671g = -1;
            }
        }
    }

    public final void k0() {
        int i10 = this.E + 1;
        this.E = i10;
        if (i10 != 1 || this.G) {
            return;
        }
        this.F = false;
    }

    public final void l(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.R.onRelease();
            z10 = this.R.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.T.onRelease();
            z10 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.U.onRelease();
            z10 |= this.U.isFinished();
        }
        if (z10) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.k(this);
        }
    }

    public final void l0(boolean z10) {
        if (this.E < 1) {
            this.E = 1;
        }
        if (!z10 && !this.G) {
            this.F = false;
        }
        if (this.E == 1) {
            if (z10 && this.F && !this.G && this.f5643v != null && this.f5641u != null) {
                q();
            }
            if (!this.G) {
                this.F = false;
            }
        }
        this.E--;
    }

    public final void m0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void n() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.D && !this.M) {
            if (!this.f5626m.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.f5626m;
            int i10 = aVar.f5796f;
            boolean z13 = false;
            if ((4 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i10 & 11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i11 = v2.l.f18154a;
                    l.a.a("RV PartialInvalidate");
                    k0();
                    R();
                    this.f5626m.j();
                    if (!this.F) {
                        int e10 = this.n.e();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= e10) {
                                break;
                            }
                            b0 L = L(this.n.d(i12));
                            if (L != null && !L.q()) {
                                if ((L.f5674j & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z13 = true;
                                    break;
                                }
                            }
                            i12++;
                        }
                        if (z13) {
                            q();
                        } else {
                            this.f5626m.b();
                        }
                    }
                    l0(true);
                    S(true);
                    l.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i13 = v2.l.f18154a;
                l.a.a("RV FullInvalidate");
                q();
                l.a.b();
                return;
            }
            return;
        }
        int i14 = v2.l.f18154a;
        l.a.a("RV FullInvalidate");
        q();
        l.a.b();
    }

    public final void o(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        setMeasuredDimension(l.k(i10, paddingRight, j0.d.e(this)), l.k(i11, getPaddingBottom() + getPaddingTop(), j0.d.d(this)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z10;
        float f10;
        super.onAttachedToWindow();
        this.O = 0;
        this.B = true;
        if (this.D && !isLayoutRequested()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        this.f5622k.e();
        l lVar = this.f5643v;
        if (lVar != null) {
            lVar.f5697g = true;
            lVar.X(this);
        }
        this.f5646w0 = false;
        if (N0) {
            ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.f5920m;
            androidx.recyclerview.widget.m mVar = threadLocal.get();
            this.f5630o0 = mVar;
            if (mVar == null) {
                this.f5630o0 = new androidx.recyclerview.widget.m();
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                Display b5 = j0.e.b(this);
                if (!isInEditMode() && b5 != null) {
                    f10 = b5.getRefreshRate();
                    if (f10 >= 30.0f) {
                        androidx.recyclerview.widget.m mVar2 = this.f5630o0;
                        mVar2.f5923k = 1.0E9f / f10;
                        threadLocal.set(mVar2);
                    }
                }
                f10 = 60.0f;
                androidx.recyclerview.widget.m mVar22 = this.f5630o0;
                mVar22.f5923k = 1.0E9f / f10;
                threadLocal.set(mVar22);
            }
            this.f5630o0.f5921i.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s sVar;
        boolean z10;
        androidx.recyclerview.widget.m mVar;
        w wVar;
        super.onDetachedFromWindow();
        i iVar = this.V;
        if (iVar != null) {
            iVar.k();
        }
        setScrollState(0);
        a0 a0Var = this.f5628n0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f5660k.abortAnimation();
        l lVar = this.f5643v;
        if (lVar != null && (wVar = lVar.f5695e) != null) {
            wVar.f();
        }
        this.B = false;
        l lVar2 = this.f5643v;
        if (lVar2 != null) {
            lVar2.f5697g = false;
            lVar2.Y(this);
        }
        this.D0.clear();
        removeCallbacks(this.E0);
        this.f5629o.getClass();
        while (g0.a.f5859d.a() != null) {
        }
        int i10 = 0;
        while (true) {
            sVar = this.f5622k;
            ArrayList<b0> arrayList = sVar.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            a1.b.o(arrayList.get(i10).f5666a);
            i10++;
        }
        sVar.f(RecyclerView.this.f5641u, false);
        int i11 = 0;
        while (true) {
            if (i11 < getChildCount()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i12 = i11 + 1;
                View childAt = getChildAt(i11);
                if (childAt != null) {
                    ArrayList<g3.a> arrayList2 = a1.b.Y(childAt).f11221a;
                    for (int B0 = a1.c.B0(arrayList2); -1 < B0; B0--) {
                        arrayList2.get(B0).a();
                    }
                    i11 = i12;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else if (N0 && (mVar = this.f5630o0) != null) {
                mVar.f5921i.remove(this);
                this.f5630o0 = null;
                return;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<k> arrayList = this.f5649y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).g(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        l lVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f5643v != null && !this.G && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f5643v.i()) {
                    f10 = -motionEvent.getAxisValue(9);
                } else {
                    f10 = 0.0f;
                }
                if (this.f5643v.h()) {
                    axisValue = motionEvent.getAxisValue(10);
                    if (f10 == 0.0f || axisValue != 0.0f) {
                        int i15 = (int) (axisValue * this.f5623k0);
                        int i16 = (int) (f10 * this.f5625l0);
                        lVar = this.f5643v;
                        if (lVar == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.G) {
                            int[] iArr = this.C0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean h10 = lVar.h();
                            boolean i17 = this.f5643v.i();
                            if (i17) {
                                i10 = h10 | 2;
                            } else {
                                i10 = h10;
                            }
                            float y10 = motionEvent.getY();
                            float x3 = motionEvent.getX();
                            int Y = i15 - Y(i15, y10);
                            int Z = i16 - Z(i16, x3);
                            getScrollingChildHelper().g(i10, 1);
                            if (h10 != 0) {
                                i11 = Y;
                            } else {
                                i11 = 0;
                            }
                            if (i17) {
                                i12 = Z;
                            } else {
                                i12 = 0;
                            }
                            if (t(i11, i12, 1, this.C0, this.A0)) {
                                Y -= iArr[0];
                                Z -= iArr[1];
                            }
                            if (h10 != 0) {
                                i13 = Y;
                            } else {
                                i13 = 0;
                            }
                            if (i17) {
                                i14 = Z;
                            } else {
                                i14 = 0;
                            }
                            d0(i13, i14, motionEvent, 1);
                            androidx.recyclerview.widget.m mVar = this.f5630o0;
                            if (mVar != null && (Y != 0 || Z != 0)) {
                                mVar.a(this, Y, Z);
                            }
                            m0(1);
                        }
                    }
                }
                axisValue = 0.0f;
                if (f10 == 0.0f) {
                }
                int i152 = (int) (axisValue * this.f5623k0);
                int i162 = (int) (f10 * this.f5625l0);
                lVar = this.f5643v;
                if (lVar == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    axisValue = motionEvent.getAxisValue(26);
                    if (this.f5643v.i()) {
                        f10 = -axisValue;
                        axisValue = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i1522 = (int) (axisValue * this.f5623k0);
                        int i1622 = (int) (f10 * this.f5625l0);
                        lVar = this.f5643v;
                        if (lVar == null) {
                        }
                    } else if (this.f5643v.h()) {
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i15222 = (int) (axisValue * this.f5623k0);
                        int i16222 = (int) (f10 * this.f5625l0);
                        lVar = this.f5643v;
                        if (lVar == null) {
                        }
                    }
                }
                f10 = 0.0f;
                axisValue = 0.0f;
                if (f10 == 0.0f) {
                }
                int i152222 = (int) (axisValue * this.f5623k0);
                int i162222 = (int) (f10 * this.f5625l0);
                lVar = this.f5643v;
                if (lVar == null) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.G) {
            return false;
        }
        this.A = null;
        if (E(motionEvent)) {
            c0();
            setScrollState(0);
            return true;
        }
        l lVar = this.f5643v;
        if (lVar == null) {
            return false;
        }
        boolean h10 = lVar.h();
        boolean i10 = this.f5643v.i();
        if (this.f5612b0 == null) {
            this.f5612b0 = VelocityTracker.obtain();
        }
        this.f5612b0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                T(motionEvent);
                            }
                        } else {
                            this.f5611a0 = motionEvent.getPointerId(actionIndex);
                            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f5614e0 = x3;
                            this.c0 = x3;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f5615f0 = y10;
                            this.f5613d0 = y10;
                        }
                    } else {
                        c0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5611a0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5611a0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.W != 1) {
                        int i11 = x10 - this.c0;
                        int i12 = y11 - this.f5613d0;
                        if (h10 && Math.abs(i11) > this.f5616g0) {
                            this.f5614e0 = x10;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 && Math.abs(i12) > this.f5616g0) {
                            this.f5615f0 = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f5612b0.clear();
                m0(0);
            }
        } else {
            if (this.H) {
                this.H = false;
            }
            this.f5611a0 = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.f5614e0 = x11;
            this.c0 = x11;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f5615f0 = y12;
            this.f5613d0 = y12;
            EdgeEffect edgeEffect = this.R;
            if (edgeEffect != null && e3.c.a(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                e3.c.b(this.R, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z10 = true;
            } else {
                z10 = false;
            }
            EdgeEffect edgeEffect2 = this.T;
            if (edgeEffect2 != null && e3.c.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                e3.c.b(this.T, 0.0f, motionEvent.getY() / getHeight());
                z10 = true;
            }
            EdgeEffect edgeEffect3 = this.S;
            if (edgeEffect3 != null && e3.c.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                e3.c.b(this.S, 0.0f, motionEvent.getX() / getWidth());
                z10 = true;
            }
            EdgeEffect edgeEffect4 = this.U;
            if (edgeEffect4 != null && e3.c.a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                e3.c.b(this.U, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z10 = true;
            }
            if (z10 || this.W == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m0(1);
            }
            int[] iArr = this.B0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i13 = h10;
            if (i10) {
                i13 = (h10 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i13, 0);
        }
        if (this.W != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = v2.l.f18154a;
        l.a.a("RV OnLayout");
        q();
        l.a.b();
        this.D = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l lVar = this.f5643v;
        if (lVar == null) {
            o(i10, i11);
            return;
        }
        boolean Q = lVar.Q();
        boolean z10 = false;
        x xVar = this.f5634q0;
        if (Q) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f5643v.f5693b.o(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.F0 = z10;
            if (!z10 && this.f5641u != null) {
                if (xVar.f5744d == 1) {
                    r();
                }
                this.f5643v.z0(i10, i11);
                xVar.f5749i = true;
                s();
                this.f5643v.B0(i10, i11);
                if (this.f5643v.E0()) {
                    this.f5643v.z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    xVar.f5749i = true;
                    s();
                    this.f5643v.B0(i10, i11);
                }
                this.G0 = getMeasuredWidth();
                this.H0 = getMeasuredHeight();
            }
        } else if (this.C) {
            this.f5643v.f5693b.o(i10, i11);
        } else {
            if (this.J) {
                k0();
                R();
                V();
                S(true);
                if (xVar.f5751k) {
                    xVar.f5747g = true;
                } else {
                    this.f5626m.c();
                    xVar.f5747g = false;
                }
                this.J = false;
                l0(false);
            } else if (xVar.f5751k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f5641u;
            if (adapter != null) {
                xVar.f5745e = adapter.d();
            } else {
                xVar.f5745e = 0;
            }
            k0();
            this.f5643v.f5693b.o(i10, i11);
            l0(false);
            xVar.f5747g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f5624l = vVar;
        super.onRestoreInstanceState(vVar.f11358i);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f5624l;
        if (vVar2 != null) {
            vVar.f5728k = vVar2.f5728k;
        } else {
            l lVar = this.f5643v;
            if (lVar != null) {
                parcelable = lVar.n0();
            } else {
                parcelable = null;
            }
            vVar.f5728k = parcelable;
        }
        return vVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.U = null;
            this.S = null;
            this.T = null;
            this.R = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x03a0, code lost:
        if (r11 > 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x03fc, code lost:
        if (r0 < r8) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        boolean z11;
        MotionEvent motionEvent3;
        float f10;
        float f11;
        int i10;
        int i11;
        a0 a0Var;
        float f12;
        float f13;
        boolean z12;
        boolean z13;
        o oVar;
        a0 a0Var2;
        androidx.recyclerview.widget.x xVar;
        Adapter adapter;
        int i12;
        androidx.recyclerview.widget.w wVar;
        boolean z14;
        Adapter adapter2;
        int i13;
        boolean z15;
        int i14;
        int i15;
        PointF a10;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z18;
        if (!this.G && !this.H) {
            p pVar = this.A;
            if (pVar == null) {
                if (motionEvent.getAction() == 0) {
                    z10 = false;
                } else {
                    z10 = E(motionEvent);
                }
            } else {
                pVar.b(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.A = null;
                }
                z10 = true;
            }
            if (z10) {
                c0();
                setScrollState(0);
                return true;
            }
            l lVar = this.f5643v;
            if (lVar == null) {
                return false;
            }
            boolean h10 = lVar.h();
            boolean i21 = this.f5643v.i();
            if (this.f5612b0 == null) {
                this.f5612b0 = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            int[] iArr = this.B0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    T(motionEvent);
                                }
                            } else {
                                this.f5611a0 = motionEvent.getPointerId(actionIndex);
                                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                this.f5614e0 = x3;
                                this.c0 = x3;
                                int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                this.f5615f0 = y10;
                                this.f5613d0 = y10;
                            }
                        } else {
                            c0();
                            setScrollState(0);
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5611a0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5611a0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i22 = this.f5614e0 - x10;
                        int i23 = this.f5615f0 - y11;
                        if (this.W != 1) {
                            if (h10) {
                                int i24 = this.f5616g0;
                                if (i22 > 0) {
                                    i22 = Math.max(0, i22 - i24);
                                } else {
                                    i22 = Math.min(0, i22 + i24);
                                }
                                if (i22 != 0) {
                                    z18 = true;
                                    if (i21) {
                                        int i25 = this.f5616g0;
                                        if (i23 > 0) {
                                            i23 = Math.max(0, i23 - i25);
                                        } else {
                                            i23 = Math.min(0, i23 + i25);
                                        }
                                        if (i23 != 0) {
                                            z18 = true;
                                        }
                                    }
                                    if (z18) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z18 = false;
                            if (i21) {
                            }
                            if (z18) {
                            }
                        }
                        if (this.W == 1) {
                            int[] iArr2 = this.C0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int Y = i22 - Y(i22, motionEvent.getY());
                            int Z = i23 - Z(i23, motionEvent.getX());
                            if (h10) {
                                i17 = Y;
                            } else {
                                i17 = 0;
                            }
                            if (i21) {
                                i18 = Z;
                            } else {
                                i18 = 0;
                            }
                            boolean t10 = t(i17, i18, 0, this.C0, this.A0);
                            int[] iArr3 = this.A0;
                            if (t10) {
                                Y -= iArr2[0];
                                Z -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i26 = Y;
                            int i27 = Z;
                            this.f5614e0 = x10 - iArr3[0];
                            this.f5615f0 = y11 - iArr3[1];
                            if (h10) {
                                i19 = i26;
                            } else {
                                i19 = 0;
                            }
                            if (i21) {
                                i20 = i27;
                            } else {
                                i20 = 0;
                            }
                            if (d0(i19, i20, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.m mVar = this.f5630o0;
                            if (mVar != null && (i26 != 0 || i27 != 0)) {
                                mVar.a(this, i26, i27);
                            }
                        }
                    }
                    recyclerView = this;
                    motionEvent2 = obtain;
                } else {
                    this.f5612b0.addMovement(obtain);
                    VelocityTracker velocityTracker = this.f5612b0;
                    int i28 = this.f5621j0;
                    velocityTracker.computeCurrentVelocity(1000, i28);
                    if (h10) {
                        f10 = -this.f5612b0.getXVelocity(this.f5611a0);
                    } else {
                        f10 = 0.0f;
                    }
                    if (i21) {
                        f11 = -this.f5612b0.getYVelocity(this.f5611a0);
                    } else {
                        f11 = 0.0f;
                    }
                    if (f10 == 0.0f && f11 == 0.0f) {
                        recyclerView = this;
                        motionEvent2 = obtain;
                        i16 = 0;
                        recyclerView.setScrollState(i16);
                        c0();
                        z11 = true;
                        if (z11) {
                            motionEvent3 = motionEvent2;
                            recyclerView.f5612b0.addMovement(motionEvent3);
                        } else {
                            motionEvent3 = motionEvent2;
                        }
                        motionEvent3.recycle();
                        return true;
                    }
                    int i29 = (int) f10;
                    int i30 = (int) f11;
                    l lVar2 = this.f5643v;
                    if (lVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.G) {
                        int h11 = lVar2.h();
                        boolean i31 = this.f5643v.i();
                        int i32 = this.f5619i0;
                        i29 = (h11 == 0 || Math.abs(i29) < i32) ? 0 : 0;
                        i30 = (!i31 || Math.abs(i30) < i32) ? 0 : 0;
                        if (i29 != 0 || i30 != 0) {
                            if (i29 != 0) {
                                EdgeEffect edgeEffect = this.R;
                                if (edgeEffect != null && e3.c.a(edgeEffect) != 0.0f) {
                                    int i33 = -i29;
                                    if (h0(this.R, i33, getWidth())) {
                                        this.R.onAbsorb(i33);
                                        i29 = 0;
                                    }
                                    i10 = i29;
                                    i29 = 0;
                                } else {
                                    EdgeEffect edgeEffect2 = this.T;
                                    if (edgeEffect2 != null && e3.c.a(edgeEffect2) != 0.0f) {
                                        if (h0(this.T, i29, getWidth())) {
                                            this.T.onAbsorb(i29);
                                            i29 = 0;
                                        }
                                        i10 = i29;
                                        i29 = 0;
                                    }
                                }
                                if (i30 != 0) {
                                    EdgeEffect edgeEffect3 = this.S;
                                    if (edgeEffect3 != null && e3.c.a(edgeEffect3) != 0.0f) {
                                        int i34 = -i30;
                                        if (h0(this.S, i34, getHeight())) {
                                            this.S.onAbsorb(i34);
                                            i30 = 0;
                                        }
                                        i11 = 0;
                                    } else {
                                        EdgeEffect edgeEffect4 = this.U;
                                        if (edgeEffect4 != null && e3.c.a(edgeEffect4) != 0.0f) {
                                            if (h0(this.U, i30, getHeight())) {
                                                this.U.onAbsorb(i30);
                                                i30 = 0;
                                            }
                                            i11 = 0;
                                        }
                                    }
                                    a0Var = this.f5628n0;
                                    if (i10 == 0 || i30 != 0) {
                                        int i35 = -i28;
                                        i10 = Math.max(i35, Math.min(i10, i28));
                                        i30 = Math.max(i35, Math.min(i30, i28));
                                        a0Var.a(i10, i30);
                                    }
                                    if (i29 != 0 && i11 == 0) {
                                        if (i10 != 0 || i30 != 0) {
                                            z12 = true;
                                            motionEvent2 = obtain;
                                            if (!z12) {
                                            }
                                        }
                                    } else {
                                        f12 = i29;
                                        f13 = i11;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (h11 == 0 && !i31) {
                                                z13 = false;
                                                dispatchNestedFling(f12, f13, z13);
                                                oVar = this.f5617h0;
                                                if (oVar == null) {
                                                    e0 e0Var = (e0) oVar;
                                                    l layoutManager = e0Var.f5841a.getLayoutManager();
                                                    if (layoutManager != null) {
                                                        if (e0Var.f5841a.getAdapter() != null) {
                                                            int minFlingVelocity = e0Var.f5841a.getMinFlingVelocity();
                                                            if (Math.abs(i11) <= minFlingVelocity) {
                                                                if (Math.abs(i29) > minFlingVelocity) {
                                                                }
                                                            }
                                                            boolean z19 = layoutManager instanceof w.b;
                                                            if (z19) {
                                                                androidx.recyclerview.widget.y yVar = (androidx.recyclerview.widget.y) e0Var;
                                                                if (!z19) {
                                                                    xVar = null;
                                                                } else {
                                                                    xVar = new androidx.recyclerview.widget.x(yVar, yVar.f5841a.getContext());
                                                                }
                                                                if (xVar != null) {
                                                                    RecyclerView recyclerView2 = layoutManager.f5693b;
                                                                    if (recyclerView2 != null) {
                                                                        adapter = recyclerView2.getAdapter();
                                                                    } else {
                                                                        adapter = null;
                                                                    }
                                                                    if (adapter != null) {
                                                                        i12 = adapter.d();
                                                                    } else {
                                                                        i12 = 0;
                                                                    }
                                                                    if (i12 != 0) {
                                                                        if (layoutManager.i()) {
                                                                            wVar = yVar.h(layoutManager);
                                                                        } else if (layoutManager.h()) {
                                                                            wVar = yVar.g(layoutManager);
                                                                        } else {
                                                                            wVar = null;
                                                                        }
                                                                        if (wVar != null) {
                                                                            int A = layoutManager.A();
                                                                            motionEvent2 = obtain;
                                                                            int i36 = Integer.MAX_VALUE;
                                                                            int i37 = 0;
                                                                            int i38 = Integer.MIN_VALUE;
                                                                            View view = null;
                                                                            View view2 = null;
                                                                            while (i37 < A) {
                                                                                int i39 = A;
                                                                                View z20 = layoutManager.z(i37);
                                                                                a0 a0Var3 = a0Var;
                                                                                if (z20 != null) {
                                                                                    int e10 = androidx.recyclerview.widget.y.e(z20, wVar);
                                                                                    if (e10 <= 0 && e10 > i38) {
                                                                                        view2 = z20;
                                                                                        i38 = e10;
                                                                                    }
                                                                                    if (e10 >= 0 && e10 < i36) {
                                                                                        view = z20;
                                                                                        i36 = e10;
                                                                                    }
                                                                                }
                                                                                i37++;
                                                                                A = i39;
                                                                                a0Var = a0Var3;
                                                                            }
                                                                            a0Var2 = a0Var;
                                                                            if (layoutManager.h()) {
                                                                                if (i29 > 0) {
                                                                                    z14 = true;
                                                                                }
                                                                                z14 = false;
                                                                            }
                                                                            if (z14 && view != null) {
                                                                                i15 = l.K(view);
                                                                            } else if (!z14 && view2 != null) {
                                                                                i15 = l.K(view2);
                                                                            } else {
                                                                                if (z14) {
                                                                                    view = view2;
                                                                                }
                                                                                if (view != null) {
                                                                                    int K = l.K(view);
                                                                                    RecyclerView recyclerView3 = layoutManager.f5693b;
                                                                                    if (recyclerView3 != null) {
                                                                                        adapter2 = recyclerView3.getAdapter();
                                                                                    } else {
                                                                                        adapter2 = null;
                                                                                    }
                                                                                    if (adapter2 != null) {
                                                                                        i13 = adapter2.d();
                                                                                    } else {
                                                                                        i13 = 0;
                                                                                    }
                                                                                    if (z19 && (a10 = ((w.b) layoutManager).a(i13 - 1)) != null && (a10.x < 0.0f || a10.y < 0.0f)) {
                                                                                        z15 = true;
                                                                                    } else {
                                                                                        z15 = false;
                                                                                    }
                                                                                    if (z15 == z14) {
                                                                                        i14 = -1;
                                                                                    } else {
                                                                                        i14 = 1;
                                                                                    }
                                                                                    i15 = i14 + K;
                                                                                    if (i15 >= 0) {
                                                                                    }
                                                                                }
                                                                                i15 = -1;
                                                                            }
                                                                            if (i15 != -1) {
                                                                                xVar.f5729a = i15;
                                                                                layoutManager.H0(xVar);
                                                                                z16 = true;
                                                                                if (z16) {
                                                                                    z17 = true;
                                                                                    if (z17) {
                                                                                        z12 = true;
                                                                                        if (!z12) {
                                                                                            i16 = 0;
                                                                                            recyclerView = this;
                                                                                            recyclerView.setScrollState(i16);
                                                                                            c0();
                                                                                            z11 = true;
                                                                                            if (z11) {
                                                                                            }
                                                                                            motionEvent3.recycle();
                                                                                            return true;
                                                                                        }
                                                                                        recyclerView = this;
                                                                                        c0();
                                                                                        z11 = true;
                                                                                        if (z11) {
                                                                                        }
                                                                                        motionEvent3.recycle();
                                                                                        return true;
                                                                                    }
                                                                                }
                                                                                z17 = false;
                                                                                if (z17) {
                                                                                }
                                                                            }
                                                                            z16 = false;
                                                                            if (z16) {
                                                                            }
                                                                            z17 = false;
                                                                            if (z17) {
                                                                            }
                                                                        }
                                                                    }
                                                                    a0Var2 = a0Var;
                                                                    motionEvent2 = obtain;
                                                                    i15 = -1;
                                                                    if (i15 != -1) {
                                                                    }
                                                                    z16 = false;
                                                                    if (z16) {
                                                                    }
                                                                    z17 = false;
                                                                    if (z17) {
                                                                    }
                                                                }
                                                            }
                                                            a0Var2 = a0Var;
                                                            motionEvent2 = obtain;
                                                            z16 = false;
                                                            if (z16) {
                                                            }
                                                            z17 = false;
                                                            if (z17) {
                                                            }
                                                        }
                                                    }
                                                    a0Var2 = a0Var;
                                                    motionEvent2 = obtain;
                                                    z17 = false;
                                                    if (z17) {
                                                    }
                                                } else {
                                                    a0Var2 = a0Var;
                                                    motionEvent2 = obtain;
                                                }
                                                if (z13) {
                                                    if (i31) {
                                                        h11 = (h11 == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().g(h11, 1);
                                                    int i40 = -i28;
                                                    a0Var2.a(Math.max(i40, Math.min(i29, i28)), Math.max(i40, Math.min(i11, i28)));
                                                    z12 = true;
                                                    if (!z12) {
                                                    }
                                                }
                                            }
                                            z13 = true;
                                            dispatchNestedFling(f12, f13, z13);
                                            oVar = this.f5617h0;
                                            if (oVar == null) {
                                            }
                                            if (z13) {
                                            }
                                        } else {
                                            motionEvent2 = obtain;
                                        }
                                        z12 = false;
                                        if (!z12) {
                                        }
                                    }
                                }
                                i11 = i30;
                                i30 = 0;
                                a0Var = this.f5628n0;
                                if (i10 == 0) {
                                }
                                int i352 = -i28;
                                i10 = Math.max(i352, Math.min(i10, i28));
                                i30 = Math.max(i352, Math.min(i30, i28));
                                a0Var.a(i10, i30);
                                if (i29 != 0) {
                                }
                                f12 = i29;
                                f13 = i11;
                                if (!dispatchNestedPreFling(f12, f13)) {
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            }
                            i10 = 0;
                            if (i30 != 0) {
                            }
                            i11 = i30;
                            i30 = 0;
                            a0Var = this.f5628n0;
                            if (i10 == 0) {
                            }
                            int i3522 = -i28;
                            i10 = Math.max(i3522, Math.min(i10, i28));
                            i30 = Math.max(i3522, Math.min(i30, i28));
                            a0Var.a(i10, i30);
                            if (i29 != 0) {
                            }
                            f12 = i29;
                            f13 = i11;
                            if (!dispatchNestedPreFling(f12, f13)) {
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        }
                    }
                    z12 = false;
                    motionEvent2 = obtain;
                    if (!z12) {
                    }
                }
            } else {
                recyclerView = this;
                motionEvent2 = obtain;
                recyclerView.f5611a0 = motionEvent.getPointerId(0);
                int x11 = (int) (motionEvent.getX() + 0.5f);
                recyclerView.f5614e0 = x11;
                recyclerView.c0 = x11;
                int y12 = (int) (motionEvent.getY() + 0.5f);
                recyclerView.f5615f0 = y12;
                recyclerView.f5613d0 = y12;
                int i41 = h10;
                if (i21) {
                    i41 = (h10 ? 1 : 0) | 2;
                }
                getScrollingChildHelper().g(i41, 0);
            }
            z11 = false;
            if (z11) {
            }
            motionEvent3.recycle();
            return true;
        }
        return false;
    }

    public final void p(View view) {
        b0 L = L(view);
        Adapter adapter = this.f5641u;
        if (adapter != null && L != null) {
            adapter.n(L);
        }
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((n) this.L.get(size)).d(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x039c A[EDGE_INSN: B:259:0x039c->B:197:0x039c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.recyclerview.widget.RecyclerView$b0] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList<b0> arrayList;
        l lVar;
        int[] iArr;
        int i10;
        boolean z13;
        long j2;
        b0 b0Var;
        b0 H;
        View view;
        View findViewById;
        boolean z14;
        int h10;
        int i11;
        i.c cVar;
        i.c cVar2;
        boolean z15;
        boolean z16;
        if (this.f5641u == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f5643v == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            x xVar = this.f5634q0;
            xVar.f5749i = false;
            int i12 = 1;
            if (this.F0 && (this.G0 != getWidth() || this.H0 != getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.G0 = 0;
            this.H0 = 0;
            this.F0 = false;
            if (xVar.f5744d == 1) {
                r();
            } else {
                androidx.recyclerview.widget.a aVar = this.f5626m;
                if (!aVar.c.isEmpty() && !aVar.f5793b.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && !z10 && this.f5643v.f5704o == getWidth() && this.f5643v.f5705p == getHeight()) {
                    this.f5643v.y0(this);
                    int i13 = 4;
                    xVar.a(4);
                    k0();
                    R();
                    xVar.f5744d = 1;
                    z12 = xVar.f5750j;
                    View view2 = null;
                    Long l2 = null;
                    s sVar = this.f5622k;
                    g0 g0Var = this.f5629o;
                    if (z12) {
                        int e10 = this.n.e() - 1;
                        while (e10 >= 0) {
                            b0 L = L(this.n.d(e10));
                            if (!L.q()) {
                                long J = J(L);
                                this.V.getClass();
                                i.c cVar3 = new i.c();
                                cVar3.a(L);
                                b0 b0Var2 = (b0) g0Var.f5858b.h(J, l2);
                                p.h<b0, g0.a> hVar = g0Var.f5857a;
                                if (b0Var2 != null && !b0Var2.q()) {
                                    g0.a orDefault = hVar.getOrDefault(b0Var2, l2);
                                    if (orDefault != null && (orDefault.f5860a & i12) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    g0.a orDefault2 = hVar.getOrDefault(L, l2);
                                    if (orDefault2 != null && (i12 & orDefault2.f5860a) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z15 || b0Var2 != L) {
                                        i.c a10 = g0Var.a(b0Var2, i13);
                                        g0.a orDefault3 = hVar.getOrDefault(L, null);
                                        if (orDefault3 == null) {
                                            orDefault3 = g0.a.a();
                                            hVar.put(L, orDefault3);
                                        }
                                        orDefault3.c = cVar3;
                                        orDefault3.f5860a |= 8;
                                        i.c a11 = g0Var.a(L, 8);
                                        if (a10 == null) {
                                            int e11 = this.n.e();
                                            for (int i14 = 0; i14 < e11; i14++) {
                                                b0 L2 = L(this.n.d(i14));
                                                if (L2 != L && J(L2) == J) {
                                                    Adapter adapter = this.f5641u;
                                                    if (adapter != null && adapter.f5654b) {
                                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + L2 + " \n View Holder 2:" + L + A());
                                                    }
                                                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + L2 + " \n View Holder 2:" + L + A());
                                                }
                                            }
                                            Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0Var2 + " cannot be found but it is necessary for " + L + A());
                                        } else {
                                            b0Var2.p(false);
                                            if (z15) {
                                                f(b0Var2);
                                            }
                                            if (b0Var2 != L) {
                                                if (z16) {
                                                    f(L);
                                                }
                                                b0Var2.f5672h = L;
                                                f(b0Var2);
                                                sVar.n(b0Var2);
                                                L.p(false);
                                                L.f5673i = b0Var2;
                                            }
                                            if (this.V.b(b0Var2, L, a10, a11)) {
                                                U();
                                            }
                                        }
                                    }
                                }
                                g0.a orDefault4 = hVar.getOrDefault(L, null);
                                if (orDefault4 == null) {
                                    orDefault4 = g0.a.a();
                                    hVar.put(L, orDefault4);
                                }
                                orDefault4.c = cVar3;
                                orDefault4.f5860a |= 8;
                            }
                            e10--;
                            i13 = 4;
                            i12 = 1;
                            l2 = null;
                        }
                        p.h<b0, g0.a> hVar2 = g0Var.f5857a;
                        int i15 = hVar2.f16580k;
                        while (true) {
                            i15--;
                            if (i15 < 0) {
                                break;
                            }
                            b0 i16 = hVar2.i(i15);
                            g0.a j10 = hVar2.j(i15);
                            int i17 = j10.f5860a;
                            int i18 = i17 & 3;
                            d dVar = this.I0;
                            if (i18 != 3) {
                                if ((i17 & 1) != 0) {
                                    cVar = j10.f5861b;
                                    if (cVar != null) {
                                        cVar2 = j10.c;
                                    }
                                } else {
                                    if ((i17 & 14) != 14) {
                                        if ((i17 & 12) == 12) {
                                            i.c cVar4 = j10.f5861b;
                                            i.c cVar5 = j10.c;
                                            dVar.getClass();
                                            i16.p(false);
                                            RecyclerView recyclerView = RecyclerView.this;
                                            if (recyclerView.M) {
                                                if (recyclerView.V.b(i16, i16, cVar4, cVar5)) {
                                                    recyclerView.U();
                                                }
                                            } else {
                                                if (!recyclerView.V.d(i16, cVar4, cVar5)) {
                                                }
                                                recyclerView.U();
                                            }
                                        } else if ((i17 & 4) != 0) {
                                            cVar = j10.f5861b;
                                            cVar2 = null;
                                        } else if ((i17 & 8) == 0) {
                                        }
                                        j10.f5860a = 0;
                                        j10.f5861b = null;
                                        j10.c = null;
                                        g0.a.f5859d.b(j10);
                                    }
                                    i.c cVar6 = j10.f5861b;
                                    i.c cVar7 = j10.c;
                                    RecyclerView recyclerView2 = RecyclerView.this;
                                    recyclerView2.getClass();
                                    i16.p(false);
                                    if (recyclerView2.V.a(i16, cVar6, cVar7)) {
                                        recyclerView2.U();
                                    }
                                    j10.f5860a = 0;
                                    j10.f5861b = null;
                                    j10.c = null;
                                    g0.a.f5859d.b(j10);
                                }
                                RecyclerView recyclerView3 = RecyclerView.this;
                                recyclerView3.f5622k.n(i16);
                                recyclerView3.f(i16);
                                i16.p(false);
                                if (recyclerView3.V.c(i16, cVar, cVar2)) {
                                    recyclerView3.U();
                                }
                                j10.f5860a = 0;
                                j10.f5861b = null;
                                j10.c = null;
                                g0.a.f5859d.b(j10);
                            }
                            RecyclerView recyclerView4 = RecyclerView.this;
                            l lVar2 = recyclerView4.f5643v;
                            View view3 = i16.f5666a;
                            androidx.recyclerview.widget.d dVar2 = lVar2.f5692a;
                            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) dVar2.f5810a;
                            int indexOfChild = zVar.f6000a.indexOfChild(view3);
                            if (indexOfChild >= 0) {
                                if (dVar2.f5811b.f(indexOfChild)) {
                                    dVar2.m(view3);
                                }
                                zVar.b(indexOfChild);
                            }
                            recyclerView4.f5622k.i(view3);
                            j10.f5860a = 0;
                            j10.f5861b = null;
                            j10.c = null;
                            g0.a.f5859d.b(j10);
                        }
                        view2 = null;
                    }
                    this.f5643v.s0(sVar);
                    xVar.f5743b = xVar.f5745e;
                    this.M = false;
                    this.N = false;
                    xVar.f5750j = false;
                    xVar.f5751k = false;
                    this.f5643v.f5696f = false;
                    arrayList = sVar.f5721b;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    lVar = this.f5643v;
                    if (lVar.f5702l) {
                        lVar.f5701k = 0;
                        lVar.f5702l = false;
                        sVar.o();
                    }
                    this.f5643v.l0(xVar);
                    S(true);
                    l0(false);
                    g0Var.f5857a.clear();
                    g0Var.f5858b.d();
                    iArr = this.f5650y0;
                    i10 = iArr[0];
                    int i19 = iArr[1];
                    F(iArr);
                    if (iArr[0] == i10 && iArr[1] == i19) {
                        z13 = false;
                        if (z13) {
                            v(0, 0);
                        }
                        if (this.f5627m0 && this.f5641u != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                            if (!isFocused()) {
                                if (!this.n.k(getFocusedChild())) {
                                }
                            }
                            j2 = xVar.f5753m;
                            if (j2 != -1 && (z14 = this.f5641u.f5654b) && z14) {
                                h10 = this.n.h();
                                i11 = 0;
                                b0Var = view2;
                                while (true) {
                                    if (i11 >= h10) {
                                        break;
                                    }
                                    b0 L3 = L(this.n.g(i11));
                                    if (L3 != null && !L3.k() && L3.f5669e == j2) {
                                        if (this.n.k(L3.f5666a)) {
                                            b0Var = L3;
                                        } else {
                                            b0Var = L3;
                                            break;
                                        }
                                    }
                                    i11++;
                                    b0Var = b0Var;
                                }
                                if (b0Var != null) {
                                    androidx.recyclerview.widget.d dVar3 = this.n;
                                    view = b0Var.f5666a;
                                    if (!dVar3.k(view)) {
                                        if (!view.hasFocusable()) {
                                        }
                                        view2 = view;
                                        if (view2 != null) {
                                            int i20 = xVar.n;
                                            if (i20 != -1 && (findViewById = view2.findViewById(i20)) != null && findViewById.isFocusable()) {
                                                view2 = findViewById;
                                            }
                                            view2.requestFocus();
                                        }
                                    }
                                }
                                if (this.n.e() > 0) {
                                    int i21 = xVar.f5752l;
                                    if (i21 == -1) {
                                        i21 = 0;
                                    }
                                    int b5 = xVar.b();
                                    for (int i22 = i21; i22 < b5; i22++) {
                                        b0 H2 = H(i22);
                                        if (H2 == null) {
                                            break;
                                        }
                                        View view4 = H2.f5666a;
                                        if (view4.hasFocusable()) {
                                            view2 = view4;
                                            break;
                                        }
                                    }
                                    int min = Math.min(b5, i21);
                                    do {
                                        min--;
                                        if (min < 0 || (H = H(min)) == null) {
                                            break;
                                        }
                                        view = H.f5666a;
                                    } while (!view.hasFocusable());
                                    view2 = view;
                                }
                                if (view2 != null) {
                                }
                            }
                            b0Var = view2;
                            if (b0Var != null) {
                            }
                            if (this.n.e() > 0) {
                            }
                            if (view2 != null) {
                            }
                        }
                        xVar.f5753m = -1L;
                        xVar.f5752l = -1;
                        xVar.n = -1;
                    }
                    z13 = true;
                    if (z13) {
                    }
                    if (this.f5627m0) {
                        if (!isFocused()) {
                        }
                        j2 = xVar.f5753m;
                        if (j2 != -1) {
                            h10 = this.n.h();
                            i11 = 0;
                            b0Var = view2;
                            while (true) {
                                if (i11 >= h10) {
                                }
                                i11++;
                                b0Var = b0Var;
                            }
                            if (b0Var != null) {
                            }
                            if (this.n.e() > 0) {
                            }
                            if (view2 != null) {
                            }
                        }
                        b0Var = view2;
                        if (b0Var != null) {
                        }
                        if (this.n.e() > 0) {
                        }
                        if (view2 != null) {
                        }
                    }
                    xVar.f5753m = -1L;
                    xVar.f5752l = -1;
                    xVar.n = -1;
                }
            }
            this.f5643v.y0(this);
            s();
            int i132 = 4;
            xVar.a(4);
            k0();
            R();
            xVar.f5744d = 1;
            z12 = xVar.f5750j;
            View view22 = null;
            Long l22 = null;
            s sVar2 = this.f5622k;
            g0 g0Var2 = this.f5629o;
            if (z12) {
            }
            this.f5643v.s0(sVar2);
            xVar.f5743b = xVar.f5745e;
            this.M = false;
            this.N = false;
            xVar.f5750j = false;
            xVar.f5751k = false;
            this.f5643v.f5696f = false;
            arrayList = sVar2.f5721b;
            if (arrayList != null) {
            }
            lVar = this.f5643v;
            if (lVar.f5702l) {
            }
            this.f5643v.l0(xVar);
            S(true);
            l0(false);
            g0Var2.f5857a.clear();
            g0Var2.f5858b.d();
            iArr = this.f5650y0;
            i10 = iArr[0];
            int i192 = iArr[1];
            F(iArr);
            if (iArr[0] == i10) {
                z13 = false;
                if (z13) {
                }
                if (this.f5627m0) {
                }
                xVar.f5753m = -1L;
                xVar.f5752l = -1;
                xVar.n = -1;
            }
            z13 = true;
            if (z13) {
            }
            if (this.f5627m0) {
            }
            xVar.f5753m = -1L;
            xVar.f5752l = -1;
            xVar.n = -1;
        }
    }

    public final void r() {
        View view;
        b0 D;
        int c10;
        int id;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        x xVar = this.f5634q0;
        xVar.a(1);
        B(xVar);
        xVar.f5749i = false;
        k0();
        g0 g0Var = this.f5629o;
        g0Var.f5857a.clear();
        g0Var.f5858b.d();
        R();
        V();
        if (this.f5627m0 && hasFocus() && this.f5641u != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null) {
            D = null;
        } else {
            D = D(view);
        }
        long j2 = -1;
        if (D == null) {
            xVar.f5753m = -1L;
            xVar.f5752l = -1;
            xVar.n = -1;
        } else {
            if (this.f5641u.f5654b) {
                j2 = D.f5669e;
            }
            xVar.f5753m = j2;
            if (this.M) {
                c10 = -1;
            } else if (D.k()) {
                c10 = D.f5668d;
            } else {
                c10 = D.c();
            }
            xVar.f5752l = c10;
            View view2 = D.f5666a;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            xVar.n = id;
        }
        if (xVar.f5750j && this.f5642u0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.f5748h = z10;
        this.f5642u0 = false;
        this.f5640t0 = false;
        xVar.f5747g = xVar.f5751k;
        xVar.f5745e = this.f5641u.d();
        F(this.f5650y0);
        boolean z14 = xVar.f5750j;
        p.h<b0, g0.a> hVar = g0Var.f5857a;
        if (z14) {
            int e10 = this.n.e();
            for (int i10 = 0; i10 < e10; i10++) {
                b0 L = L(this.n.d(i10));
                if (!L.q() && (!L.i() || this.f5641u.f5654b)) {
                    i iVar = this.V;
                    i.e(L);
                    L.f();
                    iVar.getClass();
                    i.c cVar = new i.c();
                    cVar.a(L);
                    g0.a orDefault = hVar.getOrDefault(L, null);
                    if (orDefault == null) {
                        orDefault = g0.a.a();
                        hVar.put(L, orDefault);
                    }
                    orDefault.f5861b = cVar;
                    orDefault.f5860a |= 4;
                    if (xVar.f5748h) {
                        if ((L.f5674j & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && !L.k() && !L.q() && !L.i()) {
                            g0Var.f5858b.J(J(L), L);
                        }
                    }
                }
            }
        }
        if (xVar.f5751k) {
            int h10 = this.n.h();
            for (int i11 = 0; i11 < h10; i11++) {
                b0 L2 = L(this.n.g(i11));
                if (!L2.q() && L2.f5668d == -1) {
                    L2.f5668d = L2.c;
                }
            }
            boolean z15 = xVar.f5746f;
            xVar.f5746f = false;
            this.f5643v.k0(this.f5622k, xVar);
            xVar.f5746f = z15;
            for (int i12 = 0; i12 < this.n.e(); i12++) {
                b0 L3 = L(this.n.d(i12));
                if (!L3.q()) {
                    g0.a orDefault2 = hVar.getOrDefault(L3, null);
                    if (orDefault2 != null && (orDefault2.f5860a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        i.e(L3);
                        if ((L3.f5674j & 8192) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i iVar2 = this.V;
                        L3.f();
                        iVar2.getClass();
                        i.c cVar2 = new i.c();
                        cVar2.a(L3);
                        if (z12) {
                            X(L3, cVar2);
                        } else {
                            g0.a orDefault3 = hVar.getOrDefault(L3, null);
                            if (orDefault3 == null) {
                                orDefault3 = g0.a.a();
                                hVar.put(L3, orDefault3);
                            }
                            orDefault3.f5860a |= 2;
                            orDefault3.f5861b = cVar2;
                        }
                    }
                }
            }
        }
        k();
        S(true);
        l0(false);
        xVar.f5744d = 2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        b0 L = L(view);
        if (L != null) {
            if (L.m()) {
                L.f5674j &= -257;
            } else if (!L.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + L + A());
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
        b0(r4, r5);
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        w wVar = this.f5643v.f5695e;
        boolean z11 = true;
        if (wVar != null && wVar.f5732e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !N()) {
            z11 = false;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f5643v.t0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<p> arrayList = this.f5651z;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.E != 0 || this.G) {
            this.F = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2.d() > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        boolean z10;
        boolean z11;
        k0();
        R();
        x xVar = this.f5634q0;
        xVar.a(6);
        this.f5626m.c();
        xVar.f5745e = this.f5641u.d();
        xVar.c = 0;
        if (this.f5624l != null) {
            Adapter adapter = this.f5641u;
            int ordinal = adapter.c.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    z11 = true;
                }
                z11 = false;
            }
            if (z11) {
                Parcelable parcelable = this.f5624l.f5728k;
                if (parcelable != null) {
                    this.f5643v.m0(parcelable);
                }
                this.f5624l = null;
            }
        }
        xVar.f5747g = false;
        this.f5643v.k0(this.f5622k, xVar);
        xVar.f5746f = false;
        if (xVar.f5750j && this.V != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.f5750j = z10;
        xVar.f5744d = 4;
        S(true);
        l0(false);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        l lVar = this.f5643v;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.G) {
        } else {
            boolean h10 = lVar.h();
            boolean i12 = this.f5643v.i();
            if (h10 || i12) {
                if (!h10) {
                    i10 = 0;
                }
                if (!i12) {
                    i11 = 0;
                }
                d0(i10, i11, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (N()) {
            if (accessibilityEvent != null) {
                i10 = b3.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.I |= i11;
            i11 = 1;
        }
        if (i11 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.b0 b0Var) {
        this.f5648x0 = b0Var;
        j0.p(this, b0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        g0(adapter, false, true);
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(gVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f5631p) {
            this.U = null;
            this.S = null;
            this.T = null;
            this.R = null;
        }
        this.f5631p = z10;
        super.setClipToPadding(z10);
        if (this.D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.Q = hVar;
        this.U = null;
        this.S = null;
        this.T = null;
        this.R = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.C = z10;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.V;
        if (iVar2 != null) {
            iVar2.k();
            this.V.f5684a = null;
        }
        this.V = iVar;
        if (iVar != null) {
            iVar.f5684a = this.f5644v0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        s sVar = this.f5622k;
        sVar.f5723e = i10;
        sVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(l lVar) {
        d.b bVar;
        RecyclerView recyclerView;
        w wVar;
        if (lVar == this.f5643v) {
            return;
        }
        int i10 = 0;
        setScrollState(0);
        a0 a0Var = this.f5628n0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f5660k.abortAnimation();
        l lVar2 = this.f5643v;
        if (lVar2 != null && (wVar = lVar2.f5695e) != null) {
            wVar.f();
        }
        l lVar3 = this.f5643v;
        s sVar = this.f5622k;
        if (lVar3 != null) {
            i iVar = this.V;
            if (iVar != null) {
                iVar.k();
            }
            this.f5643v.r0(sVar);
            this.f5643v.s0(sVar);
            sVar.f5720a.clear();
            sVar.g();
            if (this.B) {
                l lVar4 = this.f5643v;
                lVar4.f5697g = false;
                lVar4.Y(this);
            }
            this.f5643v.C0(null);
            this.f5643v = null;
        } else {
            sVar.f5720a.clear();
            sVar.g();
        }
        androidx.recyclerview.widget.d dVar = this.n;
        dVar.f5811b.g();
        ArrayList arrayList = dVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = dVar.f5810a;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) bVar;
            zVar.getClass();
            b0 L = L((View) arrayList.get(size));
            if (L != null) {
                int i11 = L.f5679p;
                RecyclerView recyclerView2 = zVar.f6000a;
                if (recyclerView2.N()) {
                    L.f5680q = i11;
                    recyclerView2.D0.add(L);
                } else {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.s(L.f5666a, i11);
                }
                L.f5679p = 0;
            }
            arrayList.remove(size);
        }
        androidx.recyclerview.widget.z zVar2 = (androidx.recyclerview.widget.z) bVar;
        int a10 = zVar2.a();
        while (true) {
            recyclerView = zVar2.f6000a;
            if (i10 >= a10) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.p(childAt);
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.f5643v = lVar;
        if (lVar != null) {
            if (lVar.f5693b == null) {
                lVar.C0(this);
                if (this.B) {
                    l lVar5 = this.f5643v;
                    lVar5.f5697g = true;
                    lVar5.X(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + lVar + " is already attached to a RecyclerView:" + lVar.f5693b.A());
            }
        }
        sVar.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        a3.t scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f212d) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.i.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.f212d = z10;
    }

    public void setOnFlingListener(o oVar) {
        this.f5617h0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f5636r0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f5627m0 = z10;
    }

    public void setRecycledViewPool(r rVar) {
        r rVar2;
        s sVar = this.f5622k;
        RecyclerView recyclerView = RecyclerView.this;
        sVar.f(recyclerView.f5641u, false);
        if (sVar.f5725g != null) {
            rVar2.f5716b--;
        }
        sVar.f5725g = rVar;
        if (rVar != null && recyclerView.getAdapter() != null) {
            sVar.f5725g.f5716b++;
        }
        sVar.e();
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.f5645w = tVar;
    }

    void setScrollState(int i10) {
        w wVar;
        if (i10 == this.W) {
            return;
        }
        this.W = i10;
        if (i10 != 2) {
            a0 a0Var = this.f5628n0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f5660k.abortAnimation();
            l lVar = this.f5643v;
            if (lVar != null && (wVar = lVar.f5695e) != null) {
                wVar.f();
            }
        }
        l lVar2 = this.f5643v;
        if (lVar2 != null) {
            lVar2.o0(i10);
        }
        q qVar = this.f5636r0;
        if (qVar != null) {
            qVar.a(i10, this);
        }
        ArrayList arrayList = this.f5638s0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((q) this.f5638s0.get(size)).a(i10, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f5616g0 = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f5616g0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(z zVar) {
        this.f5622k.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        w wVar;
        if (z10 != this.G) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.G = false;
                if (this.F && this.f5643v != null && this.f5641u != null) {
                    requestLayout();
                }
                this.F = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.G = true;
            this.H = true;
            setScrollState(0);
            a0 a0Var = this.f5628n0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f5660k.abortAnimation();
            l lVar = this.f5643v;
            if (lVar != null && (wVar = lVar.f5695e) != null) {
                wVar.f();
            }
        }
    }

    public final boolean t(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void u(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void v(int i10, int i11) {
        this.P++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        q qVar = this.f5636r0;
        if (qVar != null) {
            qVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f5638s0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((q) this.f5638s0.get(size)).b(this, i10, i11);
            }
        }
        this.P--;
    }

    public final void w() {
        int measuredWidth;
        int measuredHeight;
        if (this.U != null) {
            return;
        }
        EdgeEffect a10 = this.Q.a(3, this);
        this.U = a10;
        if (this.f5631p) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a10.setSize(measuredWidth, measuredHeight);
    }

    public final void x() {
        int measuredHeight;
        int measuredWidth;
        if (this.R != null) {
            return;
        }
        EdgeEffect a10 = this.Q.a(0, this);
        this.R = a10;
        if (this.f5631p) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a10.setSize(measuredHeight, measuredWidth);
    }

    public final void y() {
        int measuredHeight;
        int measuredWidth;
        if (this.T != null) {
            return;
        }
        EdgeEffect a10 = this.Q.a(2, this);
        this.T = a10;
        if (this.f5631p) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a10.setSize(measuredHeight, measuredWidth);
    }

    public final void z() {
        int measuredWidth;
        int measuredHeight;
        if (this.S != null) {
            return;
        }
        EdgeEffect a10 = this.Q.a(1, this);
        this.S = a10;
        if (this.f5631p) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a10.setSize(measuredWidth, measuredHeight);
    }
}
