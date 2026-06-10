package com.google.android.material.bottomsheet;

import a3.a;
import a3.j0;
import a3.v0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.g;
import b6.g;
import b6.k;
import com.noto.R;
import i3.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u5.n;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public i3.c M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public final ArrayList<c> W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f6881a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6882a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6883b;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f6884b0;
    public final float c;
    public final SparseIntArray c0;

    /* renamed from: d  reason: collision with root package name */
    public int f6885d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f6886d0;

    /* renamed from: e  reason: collision with root package name */
    public int f6887e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6888f;

    /* renamed from: g  reason: collision with root package name */
    public int f6889g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6890h;

    /* renamed from: i  reason: collision with root package name */
    public g f6891i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f6892j;

    /* renamed from: k  reason: collision with root package name */
    public int f6893k;

    /* renamed from: l  reason: collision with root package name */
    public int f6894l;

    /* renamed from: m  reason: collision with root package name */
    public int f6895m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6896o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6897p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6898q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6899r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6900s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6901t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6902u;

    /* renamed from: v  reason: collision with root package name */
    public int f6903v;

    /* renamed from: w  reason: collision with root package name */
    public int f6904w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6905x;

    /* renamed from: y  reason: collision with root package name */
    public final k f6906y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6907z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ View f6908i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int f6909j;

        public a(View view, int i10) {
            this.f6908i = view;
            this.f6909j = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.H(this.f6908i, this.f6909j, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.AbstractC0131c {
        public b() {
        }

        @Override // i3.c.AbstractC0131c
        public final int a(View view, int i10) {
            return view.getLeft();
        }

        @Override // i3.c.AbstractC0131c
        public final int b(View view, int i10) {
            return v8.b.n(i10, BottomSheetBehavior.this.y(), d());
        }

        @Override // i3.c.AbstractC0131c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.I) {
                return bottomSheetBehavior.T;
            }
            return bottomSheetBehavior.G;
        }

        @Override // i3.c.AbstractC0131c
        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.F(1);
                }
            }
        }

        @Override // i3.c.AbstractC0131c
        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior.this.u(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            if (r6 < java.lang.Math.abs(r6 - r1.G)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r1.G)) goto L13;
         */
        @Override // i3.c.AbstractC0131c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f10, float f11) {
            int i10;
            boolean z10;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f11 < 0.0f) {
                if (!bottomSheetBehavior.f6883b) {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    if (top > bottomSheetBehavior.E) {
                        i10 = 6;
                    }
                }
                i10 = 3;
            } else if (bottomSheetBehavior.I && bottomSheetBehavior.G(view, f11)) {
                if (Math.abs(f10) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f6885d) {
                    if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.T) / 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (!bottomSheetBehavior.f6883b) {
                            if (Math.abs(view.getTop() - bottomSheetBehavior.y()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            }
                            i10 = 6;
                        }
                        i10 = 3;
                    }
                }
                i10 = 5;
            } else {
                if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                    if (!bottomSheetBehavior.f6883b) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - bottomSheetBehavior.E) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            i10 = 6;
                        }
                    }
                    i10 = 4;
                }
                int top3 = view.getTop();
                if (bottomSheetBehavior.f6883b) {
                    if (Math.abs(top3 - bottomSheetBehavior.D) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        i10 = 3;
                    }
                    i10 = 4;
                } else {
                    int i11 = bottomSheetBehavior.E;
                    if (top3 < i11) {
                    }
                    i10 = 6;
                }
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.H(view, i10, true);
        }

        @Override // i3.c.AbstractC0131c
        public final boolean i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.L;
            if (i11 == 1 || bottomSheetBehavior.f6882a0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.Y == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(View view, int i10);
    }

    /* loaded from: classes.dex */
    public static class d extends h3.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public final int f6912k;

        /* renamed from: l  reason: collision with root package name */
        public final int f6913l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f6914m;
        public final boolean n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f6915o;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6912k = parcel.readInt();
            this.f6913l = parcel.readInt();
            this.f6914m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            this.f6915o = parcel.readInt() == 1;
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f6912k = bottomSheetBehavior.L;
            this.f6913l = bottomSheetBehavior.f6887e;
            this.f6914m = bottomSheetBehavior.f6883b;
            this.n = bottomSheetBehavior.I;
            this.f6915o = bottomSheetBehavior.J;
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f6912k);
            parcel.writeInt(this.f6913l);
            parcel.writeInt(this.f6914m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.f6915o ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f6916a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6917b;
        public final a c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f6917b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                i3.c cVar = bottomSheetBehavior.M;
                if (cVar != null && cVar.g()) {
                    eVar.a(eVar.f6916a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.F(eVar.f6916a);
                }
            }
        }

        public e() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f6916a = i10;
                if (!this.f6917b) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.m(bottomSheetBehavior.U.get(), this.c);
                    this.f6917b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f6881a = 0;
        this.f6883b = true;
        this.f6893k = -1;
        this.f6894l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.c0 = new SparseIntArray();
        this.f6886d0 = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i10;
        this.f6881a = 0;
        this.f6883b = true;
        this.f6893k = -1;
        this.f6894l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.c0 = new SparseIntArray();
        this.f6886d0 = new b();
        this.f6890h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.R);
        int i11 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f6892j = x5.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f6906y = new k(k.b(context, attributeSet, R.attr.bottomSheetStyle, 2132083546));
        }
        k kVar = this.f6906y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f6891i = gVar;
            gVar.k(context);
            ColorStateList colorStateList = this.f6892j;
            if (colorStateList != null) {
                this.f6891i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6891i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new i5.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f6893k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f6894l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            D(i10);
        } else {
            D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        C(obtainStyledAttributes.getBoolean(8, false));
        this.n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f6883b != z10) {
            this.f6883b = z10;
            if (this.U != null) {
                s();
            }
            if (!this.f6883b || this.L != 6) {
                i11 = this.L;
            }
            F(i11);
            J(this.L, true);
            I();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f6881a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                dimensionPixelOffset = peekValue2.data;
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            }
            B(dimensionPixelOffset);
            this.f6885d = obtainStyledAttributes.getInt(11, 500);
            this.f6896o = obtainStyledAttributes.getBoolean(17, false);
            this.f6897p = obtainStyledAttributes.getBoolean(18, false);
            this.f6898q = obtainStyledAttributes.getBoolean(19, false);
            this.f6899r = obtainStyledAttributes.getBoolean(20, true);
            this.f6900s = obtainStyledAttributes.getBoolean(14, false);
            this.f6901t = obtainStyledAttributes.getBoolean(15, false);
            this.f6902u = obtainStyledAttributes.getBoolean(16, false);
            this.f6905x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View v3 = v(viewGroup.getChildAt(i10));
                if (v3 != null) {
                    return v3;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior w(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f4593a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(View view, g.a aVar, int i10) {
        j0.n(view, aVar, new i5.c(this, i10));
    }

    public final void B(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.C = i10;
        J(this.L, true);
    }

    public final void C(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.L == 5) {
                E(4);
            }
            I();
        }
    }

    public final void D(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            if (!this.f6888f) {
                this.f6888f = true;
                z10 = true;
            }
        } else if (this.f6888f || this.f6887e != i10) {
            this.f6888f = false;
            this.f6887e = Math.max(0, i10);
            z10 = true;
        }
        if (z10) {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i10) {
        String str;
        int i11;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (!this.I && i10 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            if (i10 == 6 && this.f6883b && z(i10) <= this.D) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference<V> weakReference = this.U;
            if (weakReference != null && weakReference.get() != null) {
                V v3 = this.U.get();
                a aVar = new a(v3, i11);
                ViewParent parent = v3.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (j0.g.b(v3)) {
                        if (!z10) {
                            v3.post(aVar);
                            return;
                        } else {
                            aVar.run();
                            return;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            F(i10);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(androidx.activity.e.k(sb, str, " should not be set externally."));
    }

    public final void F(int i10) {
        V v3;
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            K(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            K(false);
        }
        J(i10, true);
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i11 >= arrayList.size()) {
                I();
                return;
            } else {
                arrayList.get(i11).c(v3, i10);
                i11++;
            }
        }
    }

    public final boolean G(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(View view, int i10, boolean z10) {
        int z11 = z(i10);
        i3.c cVar = this.M;
        boolean z12 = false;
        if (cVar != null) {
            if (z10) {
                if (cVar.q(view.getLeft(), z11)) {
                    z12 = true;
                }
            } else {
                int left = view.getLeft();
                cVar.f11721r = view;
                cVar.c = -1;
                boolean i11 = cVar.i(left, z11, 0, 0);
                if (!i11 && cVar.f11706a == 0 && cVar.f11721r != null) {
                    cVar.f11721r = null;
                }
            }
        }
        if (z12) {
            F(2);
            J(i10, true);
            this.A.a(i10);
            return;
        }
        F(i10);
    }

    public final void I() {
        V v3;
        g.a aVar;
        int i10;
        boolean z10;
        a3.a aVar2;
        WeakReference<V> weakReference = this.U;
        if (weakReference != null && (v3 = weakReference.get()) != null) {
            j0.m(v3, 524288);
            j0.i(v3, 0);
            j0.m(v3, 262144);
            j0.i(v3, 0);
            j0.m(v3, 1048576);
            j0.i(v3, 0);
            SparseIntArray sparseIntArray = this.c0;
            int i11 = sparseIntArray.get(0, -1);
            if (i11 != -1) {
                j0.m(v3, i11);
                j0.i(v3, 0);
                sparseIntArray.delete(0);
            }
            int i12 = 6;
            if (!this.f6883b && this.L != 6) {
                String string = v3.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                i5.c cVar = new i5.c(this, 6);
                ArrayList e10 = j0.e(v3);
                int i13 = 0;
                while (true) {
                    if (i13 < e10.size()) {
                        if (TextUtils.equals(string, ((g.a) e10.get(i13)).b())) {
                            i10 = ((g.a) e10.get(i13)).a();
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            int[] iArr = j0.f191e;
                            if (i15 >= iArr.length || i14 != -1) {
                                break;
                            }
                            int i16 = iArr[i15];
                            boolean z11 = true;
                            for (int i17 = 0; i17 < e10.size(); i17++) {
                                if (((g.a) e10.get(i17)).a() != i16) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 &= z10;
                            }
                            if (z11) {
                                i14 = i16;
                            }
                            i15++;
                        }
                        i10 = i14;
                    }
                }
                if (i10 != -1) {
                    g.a aVar3 = new g.a(null, i10, string, cVar, null);
                    View.AccessibilityDelegate c10 = j0.c(v3);
                    if (c10 == null) {
                        aVar2 = null;
                    } else if (c10 instanceof a.C0000a) {
                        aVar2 = ((a.C0000a) c10).f110a;
                    } else {
                        aVar2 = new a3.a(c10);
                    }
                    if (aVar2 == null) {
                        aVar2 = new a3.a();
                    }
                    j0.p(v3, aVar2);
                    j0.m(v3, aVar3.a());
                    j0.e(v3).add(aVar3);
                    j0.i(v3, 0);
                }
                sparseIntArray.put(0, i10);
            }
            if (this.I && this.L != 5) {
                A(v3, g.a.f6366l, 5);
            }
            int i18 = this.L;
            if (i18 != 3) {
                if (i18 != 4) {
                    if (i18 == 6) {
                        A(v3, g.a.f6365k, 4);
                        A(v3, g.a.f6364j, 3);
                        return;
                    }
                    return;
                }
                if (this.f6883b) {
                    i12 = 3;
                }
                aVar = g.a.f6364j;
            } else {
                if (this.f6883b) {
                    i12 = 4;
                }
                aVar = g.a.f6365k;
            }
            A(v3, aVar, i12);
        }
    }

    public final void J(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.L == 3 && (this.f6905x || y() == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f6907z != z11 && this.f6891i != null) {
            this.f6907z = z11;
            float f10 = 0.0f;
            if (z10 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z11) {
                    f10 = 1.0f;
                }
                this.B.setFloatValues(1.0f - f10, f10);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            b6.g gVar = this.f6891i;
            if (!this.f6907z) {
                f10 = 1.0f;
            }
            gVar.o(f10);
        }
    }

    public final void K(boolean z10) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f6884b0 == null) {
                this.f6884b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.U.get() && z10) {
                this.f6884b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f6884b0 = null;
        }
    }

    public final void L() {
        V v3;
        if (this.U != null) {
            s();
            if (this.L != 4 || (v3 = this.U.get()) == null) {
                return;
            }
            v3.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        View view;
        i3.c cVar;
        if (v3.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f6882a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x3 = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference<View> weakReference = this.V;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.p(view, x3, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f6882a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.p(v3, x3, this.Z)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
            }
            if (!this.N && (cVar = this.M) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.V;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.f11707b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[LOOP:0: B:73:0x0121->B:75:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135 A[SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        int i11;
        ArrayList<c> arrayList;
        boolean z10;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.b(coordinatorLayout) && !j0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.U == null) {
            this.f6889g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.n && !this.f6888f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f6896o || this.f6897p || this.f6898q || this.f6900s || this.f6901t || this.f6902u || z10) {
                n.a(v3, new i5.b(this, z10));
            }
            this.U = new WeakReference<>(v3);
            b6.g gVar = this.f6891i;
            if (gVar != null) {
                j0.d.q(v3, gVar);
                b6.g gVar2 = this.f6891i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = j0.i.i(v3);
                }
                gVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f6892j;
                if (colorStateList != null) {
                    j0.r(v3, colorStateList);
                }
            }
            I();
            if (j0.d.c(v3) == 0) {
                j0.d.s(v3, 1);
            }
        }
        if (this.M == null) {
            this.M = new i3.c(coordinatorLayout.getContext(), coordinatorLayout, this.f6886d0);
        }
        int top = v3.getTop();
        coordinatorLayout.r(v3, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.R = height;
        int i13 = this.T;
        int i14 = i13 - height;
        int i15 = this.f6904w;
        if (i14 < i15) {
            if (this.f6899r) {
                this.R = i13;
            } else {
                this.R = i13 - i15;
            }
        }
        this.D = Math.max(0, i13 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i16 = this.L;
        if (i16 == 3) {
            i11 = y();
        } else if (i16 == 6) {
            i11 = this.E;
        } else if (this.I && i16 == 5) {
            i11 = this.T;
        } else if (i16 == 4) {
            i11 = this.G;
        } else {
            if (i16 == 1 || i16 == 2) {
                j0.k(v3, top - v3.getTop());
            }
            J(this.L, false);
            this.V = new WeakReference<>(v(v3));
            while (true) {
                arrayList = this.W;
                if (i12 < arrayList.size()) {
                    return true;
                }
                arrayList.get(i12).a(v3);
                i12++;
            }
        }
        j0.k(v3, i11);
        J(this.L, false);
        this.V = new WeakReference<>(v(v3));
        while (true) {
            arrayList = this.W;
            if (i12 < arrayList.size()) {
            }
            arrayList.get(i12).a(v3);
            i12++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f6893k, marginLayoutParams.width), x(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f6894l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        WeakReference<View> weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.L != 3) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        int i13;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v3.getTop();
        int i14 = top - i11;
        if (i11 > 0) {
            if (i14 < y()) {
                int y10 = top - y();
                iArr[1] = y10;
                j0.k(v3, -y10);
                i13 = 3;
                F(i13);
            } else if (!this.K) {
                return;
            } else {
                iArr[1] = i11;
                j0.k(v3, -i11);
                F(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.G;
            if (i14 > i15 && !this.I) {
                int i16 = top - i15;
                iArr[1] = i16;
                j0.k(v3, -i16);
                i13 = 4;
                F(i13);
            }
            if (!this.K) {
                return;
            }
            iArr[1] = i11;
            j0.k(v3, -i11);
            F(1);
        }
        u(v3.getTop());
        this.O = i11;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f6881a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f6887e = dVar.f6913l;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f6883b = dVar.f6914m;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = dVar.n;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = dVar.f6915o;
            }
        }
        int i11 = dVar.f6912k;
        if (i11 != 1 && i11 != 2) {
            this.L = i11;
            return;
        }
        this.L = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L24;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(CoordinatorLayout coordinatorLayout, V v3, View view, int i10) {
        float yVelocity;
        int i11 = 3;
        if (v3.getTop() == y()) {
            F(3);
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (weakReference != null && view == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.f6883b && v3.getTop() > this.E) {
                    i11 = 6;
                }
            } else {
                if (this.I) {
                    VelocityTracker velocityTracker = this.X;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.c);
                        yVelocity = this.X.getYVelocity(this.Y);
                    }
                    if (G(v3, yVelocity)) {
                        i11 = 5;
                    }
                }
                if (this.O == 0) {
                    int top = v3.getTop();
                    if (this.f6883b) {
                        if (Math.abs(top - this.D) < Math.abs(top - this.G)) {
                        }
                        i11 = 4;
                    } else {
                        int i12 = this.E;
                        if (top < i12) {
                            if (top < Math.abs(top - this.G)) {
                            }
                        } else {
                            if (Math.abs(top - i12) < Math.abs(top - this.G)) {
                            }
                            i11 = 4;
                        }
                        i11 = 6;
                    }
                } else {
                    if (!this.f6883b) {
                        int top2 = v3.getTop();
                    }
                    i11 = 4;
                }
            }
            H(v3, i11, false);
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        i3.c cVar = this.M;
        if (cVar != null && (this.K || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.Z - motionEvent.getY());
            i3.c cVar2 = this.M;
            if (abs > cVar2.f11707b) {
                cVar2.b(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t10 = t();
        if (this.f6883b) {
            this.G = Math.max(this.T - t10, this.D);
        } else {
            this.G = this.T - t10;
        }
    }

    public final int t() {
        int i10;
        return this.f6888f ? Math.min(Math.max(this.f6889g, this.T - ((this.S * 9) / 16)), this.R) + this.f6903v : (this.n || this.f6896o || (i10 = this.f6895m) <= 0) ? this.f6887e + this.f6903v : Math.max(this.f6887e, i10 + this.f6890h);
    }

    public final void u(int i10) {
        V v3 = this.U.get();
        if (v3 != null) {
            ArrayList<c> arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != y()) {
                    y();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).b(v3);
                }
            }
        }
    }

    public final int x(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final int y() {
        if (this.f6883b) {
            return this.D;
        }
        return Math.max(this.C, this.f6899r ? 0 : this.f6904w);
    }

    public final int z(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(androidx.activity.e.g("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.G;
        }
        return y();
    }
}
