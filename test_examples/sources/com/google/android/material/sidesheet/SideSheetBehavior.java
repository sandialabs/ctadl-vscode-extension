package com.google.android.material.sidesheet;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.g;
import b6.g;
import b6.k;
import c6.e;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.noto.R;
import i3.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p2.h;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c6.a f7267a;

    /* renamed from: b  reason: collision with root package name */
    public g f7268b;
    public final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public final k f7269d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f7270e;

    /* renamed from: f  reason: collision with root package name */
    public final float f7271f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7272g;

    /* renamed from: h  reason: collision with root package name */
    public int f7273h;

    /* renamed from: i  reason: collision with root package name */
    public i3.c f7274i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7275j;

    /* renamed from: k  reason: collision with root package name */
    public final float f7276k;

    /* renamed from: l  reason: collision with root package name */
    public int f7277l;

    /* renamed from: m  reason: collision with root package name */
    public int f7278m;
    public WeakReference<V> n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f7279o;

    /* renamed from: p  reason: collision with root package name */
    public int f7280p;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f7281q;

    /* renamed from: r  reason: collision with root package name */
    public int f7282r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet f7283s;

    /* renamed from: t  reason: collision with root package name */
    public final a f7284t;

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0131c {
        public a() {
        }

        @Override // i3.c.AbstractC0131c
        public final int a(View view, int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return v8.b.n(i10, sideSheetBehavior.f7267a.a(), sideSheetBehavior.f7278m);
        }

        @Override // i3.c.AbstractC0131c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // i3.c.AbstractC0131c
        public final int c(View view) {
            return SideSheetBehavior.this.f7278m;
        }

        @Override // i3.c.AbstractC0131c
        public final void f(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f7272g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // i3.c.AbstractC0131c
        public final void g(View view, int i10, int i11) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f7279o;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                c6.a aVar = sideSheetBehavior.f7267a;
                int left = view.getLeft();
                view.getRight();
                int i12 = aVar.f6545a.f7278m;
                if (left <= i12) {
                    marginLayoutParams.rightMargin = i12 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<c6.b> linkedHashSet = sideSheetBehavior.f7283s;
            if (!linkedHashSet.isEmpty()) {
                c6.a aVar2 = sideSheetBehavior.f7267a;
                int i13 = aVar2.f6545a.f7278m;
                aVar2.a();
                for (c6.b bVar : linkedHashSet) {
                    bVar.b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
            if (r7 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            if (java.lang.Math.abs(r10 - r1.a()) < java.lang.Math.abs(r10 - r5.f7278m)) goto L4;
         */
        @Override // i3.c.AbstractC0131c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f10, float f11) {
            boolean z10;
            int i10;
            boolean z11;
            boolean z12;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            c6.a aVar = sideSheetBehavior.f7267a;
            aVar.getClass();
            if (f10 >= 0.0f) {
                SideSheetBehavior<? extends View> sideSheetBehavior2 = aVar.f6545a;
                boolean z13 = false;
                if (Math.abs((sideSheetBehavior2.f7276k * f10) + view.getRight()) > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (Math.abs(f10) > Math.abs(f11)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && f11 > 500) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (view.getLeft() > (sideSheetBehavior2.f7278m - aVar.a()) / 2) {
                            z13 = true;
                        }
                        if (z13) {
                        }
                    }
                    i10 = 5;
                } else {
                    if (f10 != 0.0f) {
                        if (Math.abs(f10) > Math.abs(f11)) {
                            z13 = true;
                        }
                    }
                    int left = view.getLeft();
                }
                sideSheetBehavior.t(view, i10, true);
            }
            i10 = 3;
            sideSheetBehavior.t(view, i10, true);
        }

        @Override // i3.c.AbstractC0131c
        public final boolean i(View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f7273h == 1 || (weakReference = sideSheetBehavior.n) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h3.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public final int f7286k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7286k = parcel.readInt();
        }

        public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f7286k = sideSheetBehavior.f7273h;
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f7286k);
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f7287a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7288b;
        public final androidx.activity.b c = new androidx.activity.b(11, this);

        public c() {
        }

        public final void a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.n;
            if (weakReference != null && weakReference.get() != null) {
                this.f7287a = i10;
                if (!this.f7288b) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.m(sideSheetBehavior.n.get(), this.c);
                    this.f7288b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f7270e = new c();
        this.f7272g = true;
        this.f7273h = 5;
        this.f7276k = 0.1f;
        this.f7280p = -1;
        this.f7283s = new LinkedHashSet();
        this.f7284t = new a();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7270e = new c();
        this.f7272g = true;
        this.f7273h = 5;
        this.f7276k = 0.1f;
        this.f7280p = -1;
        this.f7283s = new LinkedHashSet();
        this.f7284t = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f51s0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = x5.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f7269d = new k(k.b(context, attributeSet, 0, 2132083688));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f7280p = resourceId;
            WeakReference<View> weakReference = this.f7279o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f7279o = null;
            WeakReference<V> weakReference2 = this.n;
            if (weakReference2 != null) {
                V v3 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (j0.g.c(v3)) {
                        v3.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f7269d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f7268b = gVar;
            gVar.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f7268b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f7268b.setTint(typedValue.data);
            }
        }
        this.f7271f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f7272g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f7267a == null) {
            this.f7267a = new c6.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.n = null;
        this.f7274i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.n = null;
        this.f7274i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        i3.c cVar;
        VelocityTracker velocityTracker;
        if ((v3.isShown() || j0.d(v3) != null) && this.f7272g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f7275j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f7281q) != null) {
            velocityTracker.recycle();
            this.f7281q = null;
        }
        if (this.f7281q == null) {
            this.f7281q = VelocityTracker.obtain();
        }
        this.f7281q.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f7275j) {
                this.f7275j = false;
                return false;
            }
        } else {
            this.f7282r = (int) motionEvent.getX();
        }
        if (!this.f7275j && (cVar = this.f7274i) != null && cVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        int i11;
        View findViewById;
        int i12;
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.b(coordinatorLayout) && !j0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i13 = 0;
        if (this.n == null) {
            this.n = new WeakReference<>(v3);
            g gVar = this.f7268b;
            if (gVar != null) {
                j0.d.q(v3, gVar);
                g gVar2 = this.f7268b;
                float f10 = this.f7271f;
                if (f10 == -1.0f) {
                    f10 = j0.i.i(v3);
                }
                gVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    j0.r(v3, colorStateList);
                }
            }
            if (this.f7273h == 5) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            if (v3.getVisibility() != i12) {
                v3.setVisibility(i12);
            }
            u();
            if (j0.d.c(v3) == 0) {
                j0.d.s(v3, 1);
            }
            if (j0.d(v3) == null) {
                j0.q(v3, v3.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f7274i == null) {
            this.f7274i = new i3.c(coordinatorLayout.getContext(), coordinatorLayout, this.f7284t);
        }
        this.f7267a.getClass();
        int left = v3.getLeft();
        coordinatorLayout.r(v3, i10);
        this.f7278m = coordinatorLayout.getWidth();
        this.f7277l = v3.getWidth();
        int i14 = this.f7273h;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 == 5) {
                    i13 = this.f7267a.f6545a.f7278m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f7273h);
                }
            }
        } else {
            this.f7267a.getClass();
            i13 = left - v3.getLeft();
        }
        j0.j(v3, i13);
        if (this.f7279o == null && (i11 = this.f7280p) != -1 && (findViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f7279o = new WeakReference<>(findViewById);
        }
        for (c6.b bVar : this.f7283s) {
            if (bVar instanceof e) {
                ((e) bVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((b) parcelable).f7286k;
        this.f7273h = (i10 == 1 || i10 == 2) ? 5 : 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
        r5.f7274i.b(r7, r8.getPointerId(r8.getActionIndex()));
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f7273h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        i3.c cVar = this.f7274i;
        if (cVar != null && (this.f7272g || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f7281q) != null) {
            velocityTracker.recycle();
            this.f7281q = null;
        }
        if (this.f7281q == null) {
            this.f7281q = VelocityTracker.obtain();
        }
        this.f7281q.addMovement(motionEvent);
        i3.c cVar2 = this.f7274i;
        if (cVar2 != null && (this.f7272g || this.f7273h == 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && actionMasked == 2 && !this.f7275j) {
            if (cVar2 != null && (this.f7272g || this.f7273h == 1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && Math.abs(this.f7282r - motionEvent.getX()) > this.f7274i.f11707b) {
                z13 = true;
            }
        }
        return !this.f7275j;
    }

    public final void s(int i10) {
        V v3;
        int i11;
        if (this.f7273h == i10) {
            return;
        }
        this.f7273h = i10;
        WeakReference<V> weakReference = this.n;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        if (this.f7273h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (v3.getVisibility() != i11) {
            v3.setVisibility(i11);
        }
        for (c6.b bVar : this.f7283s) {
            bVar.a();
        }
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r4 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i10, boolean z10) {
        int a10;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f7267a.f6545a;
        if (i10 != 3) {
            if (i10 == 5) {
                a10 = sideSheetBehavior.f7267a.f6545a.f7278m;
            } else {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(androidx.activity.e.g("Invalid state to get outward edge offset: ", i10));
            }
        } else {
            a10 = sideSheetBehavior.f7267a.a();
        }
        i3.c cVar = sideSheetBehavior.f7274i;
        boolean z11 = false;
        if (cVar != null) {
            if (z10) {
                if (cVar.q(a10, view.getTop())) {
                    z11 = true;
                }
            } else {
                int top = view.getTop();
                cVar.f11721r = view;
                cVar.c = -1;
                boolean i11 = cVar.i(a10, top, 0, 0);
                if (!i11 && cVar.f11706a == 0 && cVar.f11721r != null) {
                    cVar.f11721r = null;
                }
            }
        }
        if (z11) {
            s(2);
            this.f7270e.a(i10);
            return;
        }
        s(i10);
    }

    public final void u() {
        V v3;
        WeakReference<V> weakReference = this.n;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        j0.m(v3, 262144);
        j0.i(v3, 0);
        j0.m(v3, 1048576);
        j0.i(v3, 0);
        if (this.f7273h != 5) {
            j0.n(v3, g.a.f6366l, new b3.k() { // from class: c6.d
                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
                @Override // b3.k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean a(View view) {
                    String str;
                    boolean z10;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i10 = r2;
                    if (i10 != 1 && i10 != 2) {
                        Reference reference = sideSheetBehavior.n;
                        if (reference != null && reference.get() != null) {
                            View view2 = (View) sideSheetBehavior.n.get();
                            h hVar = new h(i10, 1, sideSheetBehavior);
                            ViewParent parent = view2.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                if (j0.g.b(view2)) {
                                    z10 = true;
                                    if (!z10) {
                                        view2.post(hVar);
                                    } else {
                                        hVar.run();
                                    }
                                    return true;
                                }
                            }
                            z10 = false;
                            if (!z10) {
                            }
                            return true;
                        }
                        sideSheetBehavior.s(i10);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    if (i10 == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(androidx.activity.e.k(sb, str, " should not be set externally."));
                }
            });
        }
        if (this.f7273h != 3) {
            j0.n(v3, g.a.f6364j, new b3.k() { // from class: c6.d
                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
                @Override // b3.k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean a(View view) {
                    String str;
                    boolean z10;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i10 = r2;
                    if (i10 != 1 && i10 != 2) {
                        Reference reference = sideSheetBehavior.n;
                        if (reference != null && reference.get() != null) {
                            View view2 = (View) sideSheetBehavior.n.get();
                            h hVar = new h(i10, 1, sideSheetBehavior);
                            ViewParent parent = view2.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                if (j0.g.b(view2)) {
                                    z10 = true;
                                    if (!z10) {
                                        view2.post(hVar);
                                    } else {
                                        hVar.run();
                                    }
                                    return true;
                                }
                            }
                            z10 = false;
                            if (!z10) {
                            }
                            return true;
                        }
                        sideSheetBehavior.s(i10);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    if (i10 == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(androidx.activity.e.k(sb, str, " should not be set externally."));
                }
            });
        }
    }
}
