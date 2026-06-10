package com.google.android.material.appbar;

import a3.b1;
import a3.j0;
import a3.s;
import a3.v0;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.g;
import com.google.android.material.appbar.AppBarLayout;
import com.noto.R;
import f5.f;
import f5.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p.h;
import u5.j;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int F = 0;
    public final TimeInterpolator A;
    public int[] B;
    public Drawable C;
    public final float D;
    public Behavior E;

    /* renamed from: i  reason: collision with root package name */
    public int f6776i;

    /* renamed from: j  reason: collision with root package name */
    public int f6777j;

    /* renamed from: k  reason: collision with root package name */
    public int f6778k;

    /* renamed from: l  reason: collision with root package name */
    public int f6779l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6780m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public b1 f6781o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6782p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6783q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6784r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6785s;

    /* renamed from: t  reason: collision with root package name */
    public int f6786t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<View> f6787u;

    /* renamed from: v  reason: collision with root package name */
    public final ColorStateList f6788v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f6789w;

    /* renamed from: x  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f6790x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f6791y;

    /* renamed from: z  reason: collision with root package name */
    public final long f6792z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends f<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f6793j;

        /* renamed from: k  reason: collision with root package name */
        public int f6794k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f6795l;

        /* renamed from: m  reason: collision with root package name */
        public b f6796m;
        public WeakReference<View> n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f6797o;

        /* loaded from: classes.dex */
        public class a extends a3.a {
            public a() {
            }

            @Override // a3.a
            public final void d(View view, g gVar) {
                this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
                gVar.o(BaseBehavior.this.f6797o);
                gVar.i(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public static class b extends h3.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: k  reason: collision with root package name */
            public boolean f6799k;

            /* renamed from: l  reason: collision with root package name */
            public boolean f6800l;

            /* renamed from: m  reason: collision with root package name */
            public int f6801m;
            public float n;

            /* renamed from: o  reason: collision with root package name */
            public boolean f6802o;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
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
                boolean z10 = true;
                this.f6799k = parcel.readByte() != 0;
                this.f6800l = parcel.readByte() != 0;
                this.f6801m = parcel.readInt();
                this.n = parcel.readFloat();
                if (parcel.readByte() == 0) {
                    z10 = false;
                }
                this.f6802o = z10;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // h3.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f11358i, i10);
                parcel.writeByte(this.f6799k ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f6800l ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f6801m);
                parcel.writeFloat(this.n);
                parcel.writeByte(this.f6802o ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                        return;
                    }
                    return;
                }
                if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int i10;
            int childCount = coordinatorLayout.getChildCount();
            while (i10 < childCount) {
                View childAt = coordinatorLayout.getChildAt(i10);
                i10 = ((childAt instanceof s) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) ? 0 : i10 + 1;
                return childAt;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
            if ((-r9) >= ((r5.getBottom() - r3) - r8.getTopInset())) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            List list;
            View view;
            boolean z11;
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                list = null;
                if (i12 < childCount) {
                    view = appBarLayout.getChildAt(i12);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    }
                    i12++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i13 = ((c) view.getLayoutParams()).f6805a;
                if ((i13 & 1) != 0) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    int d5 = j0.d.d(view);
                    if (i11 > 0 && (i13 & 12) != 0) {
                        if ((-i10) >= (view.getBottom() - d5) - appBarLayout.getTopInset()) {
                            z11 = true;
                        }
                    } else if ((i13 & 2) != 0) {
                    }
                    if (appBarLayout.f6785s) {
                        z11 = appBarLayout.e(D(coordinatorLayout));
                    }
                    boolean d10 = appBarLayout.d(z11, !appBarLayout.f6782p);
                    if (!z10) {
                        if (d10) {
                            ArrayList arrayList = (ArrayList) ((h) coordinatorLayout.f4575j.f10382b).getOrDefault(appBarLayout, null);
                            if (arrayList != null) {
                                list = new ArrayList(arrayList);
                            }
                            if (list == null) {
                                list = Collections.emptyList();
                            }
                            int size = list.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size) {
                                    break;
                                }
                                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) list.get(i14)).getLayoutParams()).f4593a;
                                if (cVar instanceof ScrollingViewBehavior) {
                                    if (((ScrollingViewBehavior) cVar).f10935f != 0) {
                                        z12 = true;
                                    }
                                } else {
                                    i14++;
                                }
                            }
                            if (!z12) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
            z11 = false;
            if (appBarLayout.f6785s) {
            }
            boolean d102 = appBarLayout.d(z11, !appBarLayout.f6782p);
            if (!z10) {
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int height;
            int abs = Math.abs(x() - i10);
            float abs2 = Math.abs(0.0f);
            float f10 = abs;
            if (abs2 > 0.0f) {
                height = Math.round((f10 / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((f10 / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int x3 = x();
            if (x3 == i10) {
                ValueAnimator valueAnimator = this.f6795l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6795l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f6795l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6795l = valueAnimator3;
                valueAnimator3.setInterpolator(e5.a.f10650e);
                this.f6795l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f6795l.setDuration(Math.min(height, 600));
            this.f6795l.setIntValues(x3, i10);
            this.f6795l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i13 = -appBarLayout.getTotalScrollRange();
                    i11 = i13;
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                if (i11 != i12) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i10, i11, i12);
                }
            }
            if (appBarLayout.f6785s) {
                appBarLayout.d(appBarLayout.e(view), !appBarLayout.f6782p);
            }
        }

        public final b F(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = h3.a.f11357j;
                    }
                    b bVar = new b(parcelable);
                    if (s10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f6800l = z10;
                    if (!z10 && (-s10) >= t10.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f6799k = z11;
                    bVar.f6801m = i10;
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (bottom == t10.getTopInset() + j0.d.d(childAt)) {
                        z12 = true;
                    }
                    bVar.f6802o = z12;
                    bVar.n = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int x3 = x() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 < childCount) {
                    View childAt = t10.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    c cVar = (c) childAt.getLayoutParams();
                    if ((cVar.f6805a & 32) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    int i11 = -x3;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i12 = cVar2.f6805a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        if (j0.d.b(t10) && j0.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        i14 += j0.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                            int d5 = j0.d.d(childAt2) + i14;
                            if (x3 < d5) {
                                i13 = d5;
                            } else {
                                i14 = d5;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i13 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (x3 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t10, v8.b.n(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            j0.m(coordinatorLayout, g.a.f6362h.a());
            boolean z13 = false;
            j0.i(coordinatorLayout, 0);
            j0.m(coordinatorLayout, g.a.f6363i.a());
            j0.i(coordinatorLayout, 0);
            if (t10.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    view = coordinatorLayout.getChildAt(i10);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f4593a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t10.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 < childCount2) {
                    if (((c) t10.getChildAt(i11).getLayoutParams()).f6805a != 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return;
            }
            if (j0.c(coordinatorLayout) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                j0.p(coordinatorLayout, new a());
            }
            if (x() != (-t10.getTotalScrollRange())) {
                j0.n(coordinatorLayout, g.a.f6362h, new com.google.android.material.appbar.c(t10, false));
                z13 = true;
            }
            if (x() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i12 = -t10.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        j0.n(coordinatorLayout, g.a.f6363i, new com.google.android.material.appbar.b(this, coordinatorLayout, t10, view2, i12));
                    }
                } else {
                    j0.n(coordinatorLayout, g.a.f6363i, new com.google.android.material.appbar.c(t10, true));
                }
                this.f6797o = z10;
            }
            z10 = z13;
            this.f6797o = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v13, types: [f5.d] */
        @Override // f5.h, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int i11;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f6796m;
            if (bVar != null && (pendingAction & 8) == 0) {
                if (bVar.f6799k) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    A(coordinatorLayout, appBarLayout, i11);
                } else if (!bVar.f6800l) {
                    View childAt = appBarLayout.getChildAt(bVar.f6801m);
                    int i12 = -childAt.getBottom();
                    if (this.f6796m.f6802o) {
                        round = appBarLayout.getTopInset() + j0.d.d(childAt) + i12;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f6796m.n) + i12;
                    }
                    A(coordinatorLayout, appBarLayout, round);
                } else {
                    A(coordinatorLayout, appBarLayout, 0);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, i11);
                    }
                    A(coordinatorLayout, appBarLayout, i11);
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                    A(coordinatorLayout, appBarLayout, 0);
                }
            }
            appBarLayout.n = 0;
            this.f6796m = null;
            int n = v8.b.n(s(), -appBarLayout.getTotalScrollRange(), 0);
            i iVar = this.f10936a;
            if (iVar != null) {
                if (iVar.f10940d != n) {
                    iVar.f10940d = n;
                    iVar.a();
                }
            } else {
                this.f10937b = n;
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f6776i = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.k(appBarLayout);
            }
            H(coordinatorLayout, appBarLayout);
            final View D = D(coordinatorLayout);
            if (D != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: f5.d
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = D;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    D.setOnKeyListener(new View.OnKeyListener() { // from class: f5.e
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, D, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.f6796m;
                this.f6796m = (b) parcelable;
                return;
            }
            this.f6796m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b F = F(absSavedState, (AppBarLayout) view);
            if (F != null) {
                return F;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10;
            boolean z11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i12 = i10 & 2;
            boolean z12 = false;
            if (i12 != 0) {
                if (!appBarLayout.f6785s) {
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = true;
            }
            if (z12 && (valueAnimator = this.f6795l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.f6794k = i11;
            return z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f6794k == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f6785s) {
                    appBarLayout.d(appBarLayout.e(view2), !appBarLayout.f6782p);
                }
            }
            this.n = new WeakReference<>(view2);
        }

        @Override // f5.f
        public final boolean u(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // f5.f
        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // f5.f
        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // f5.f
        public final int x() {
            return s() + this.f6793j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f5.f
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f6785s) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)), !appBarLayout.f6782p);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
        @Override // f5.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            boolean z10;
            int i14;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int x3 = x();
            int i15 = 0;
            if (i11 != 0 && x3 >= i11 && x3 <= i12) {
                int n = v8.b.n(i10, i11, i12);
                if (x3 != n) {
                    if (appBarLayout.f6780m) {
                        int abs = Math.abs(n);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i17 = cVar.f6805a;
                                    if ((i17 & 1) != 0) {
                                        i14 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                        if ((i17 & 2) != 0) {
                                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                                            i14 -= j0.d.d(childAt);
                                        }
                                    } else {
                                        i14 = 0;
                                    }
                                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                                    if (j0.d.b(childAt)) {
                                        i14 -= appBarLayout.getTopInset();
                                    }
                                    if (i14 > 0) {
                                        float f10 = i14;
                                        i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(n);
                                    }
                                }
                            } else {
                                i16++;
                            }
                        }
                    }
                    i13 = n;
                    i iVar = this.f10936a;
                    int i18 = 1;
                    if (iVar != null) {
                        if (iVar.f10940d != i13) {
                            iVar.f10940d = i13;
                            iVar.a();
                            z10 = true;
                            int i19 = x3 - n;
                            this.f6793j = n - i13;
                            if (z10) {
                                for (int i20 = 0; i20 < appBarLayout.getChildCount(); i20++) {
                                    c cVar2 = (c) appBarLayout.getChildAt(i20).getLayoutParams();
                                    b bVar = cVar2.f6806b;
                                    if (bVar != null && (cVar2.f6805a & 1) != 0) {
                                        View childAt2 = appBarLayout.getChildAt(i20);
                                        Rect rect = bVar.f6803a;
                                        childAt2.getDrawingRect(rect);
                                        appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                        rect.offset(0, -appBarLayout.getTopInset());
                                        float abs2 = rect.top - Math.abs(s());
                                        float f11 = 0.0f;
                                        if (abs2 <= 0.0f) {
                                            float abs3 = Math.abs(abs2 / rect.height());
                                            if (abs3 >= 0.0f) {
                                                if (abs3 > 1.0f) {
                                                    f11 = 1.0f;
                                                } else {
                                                    f11 = abs3;
                                                }
                                            }
                                            float f12 = 1.0f - f11;
                                            float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (f12 * f12)));
                                            childAt2.setTranslationY(height);
                                            Rect rect2 = bVar.f6804b;
                                            childAt2.getDrawingRect(rect2);
                                            rect2.offset(0, (int) (-height));
                                            WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                                            j0.f.c(childAt2, rect2);
                                        } else {
                                            WeakHashMap<View, v0> weakHashMap4 = j0.f188a;
                                            j0.f.c(childAt2, null);
                                            childAt2.setTranslationY(0.0f);
                                        }
                                    }
                                }
                            }
                            if (!z10 && appBarLayout.f6780m) {
                                coordinatorLayout.c(appBarLayout);
                            }
                            appBarLayout.f6776i = s();
                            if (!appBarLayout.willNotDraw()) {
                                WeakHashMap<View, v0> weakHashMap5 = j0.f188a;
                                j0.d.k(appBarLayout);
                            }
                            if (n < x3) {
                                i18 = -1;
                            }
                            I(coordinatorLayout, appBarLayout, n, i18, false);
                            i15 = i19;
                        }
                    } else {
                        this.f10937b = i13;
                    }
                    z10 = false;
                    int i192 = x3 - n;
                    this.f6793j = n - i13;
                    if (z10) {
                    }
                    if (!z10) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.f6776i = s();
                    if (!appBarLayout.willNotDraw()) {
                    }
                    if (n < x3) {
                    }
                    I(coordinatorLayout, appBarLayout, n, i18, false);
                    i15 = i192;
                }
            } else {
                this.f6793j = 0;
            }
            H(coordinatorLayout, appBarLayout);
            return i15;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends f5.g {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f47q0);
            this.f10935f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int n;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f4593a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f6793j + this.f10934e;
                if (this.f10935f == 0) {
                    n = 0;
                } else {
                    float v3 = v(view2);
                    int i10 = this.f10935f;
                    n = v8.b.n((int) (v3 * i10), 0, i10);
                }
                j0.k(view, bottom - n);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f6785s) {
                    appBarLayout.d(appBarLayout.e(view), !appBarLayout.f6782p);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                j0.m(coordinatorLayout, g.a.f6362h.a());
                j0.i(coordinatorLayout, 0);
                j0.m(coordinatorLayout, g.a.f6363i.a());
                j0.i(coordinatorLayout, 0);
                j0.p(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            List<View> e10 = coordinatorLayout.e(view);
            int size = e10.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    View view2 = e10.get(i10);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i10++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.c(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // f5.g
        public final AppBarLayout u(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // f5.g
        public final float v(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f4593a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).x();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i10 / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // f5.g
        public final int w(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f6803a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f6804b = new Rect();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f6805a;

        /* renamed from: b  reason: collision with root package name */
        public b f6806b;
        public final Interpolator c;

        public c() {
            super(-1, -2);
            this.f6805a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6805a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.N);
            this.f6805a = obtainStyledAttributes.getInt(1, 0);
            this.f6806b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6805a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6805a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6805a = 1;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(i6.a.a(context, attributeSet, R.attr.appBarLayoutStyle, 2132083544), attributeSet, R.attr.appBarLayoutStyle);
        int i10;
        this.f6777j = -1;
        this.f6778k = -1;
        this.f6779l = -1;
        this.n = 0;
        this.f6791y = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d5 = j.d(context3, attributeSet, f5.j.f10941a, R.attr.appBarLayoutStyle, 2132083544, new int[0]);
        try {
            if (d5.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d5.getResourceId(0, 0)));
            }
            d5.recycle();
            TypedArray d10 = j.d(context2, attributeSet, a1.b.M, R.attr.appBarLayoutStyle, 2132083544, new int[0]);
            Drawable drawable = d10.getDrawable(0);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.q(this, drawable);
            ColorStateList a10 = x5.c.a(context2, d10, 6);
            this.f6788v = a10;
            if (getBackground() instanceof ColorDrawable) {
                final b6.g gVar = new b6.g();
                gVar.n(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                if (a10 != null) {
                    if (this.f6784r) {
                        i10 = 255;
                    } else {
                        i10 = 0;
                    }
                    gVar.setAlpha(i10);
                    gVar.n(a10);
                    this.f6790x = new ValueAnimator.AnimatorUpdateListener() { // from class: f5.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i12 = AppBarLayout.F;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            appBarLayout.getClass();
                            int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            b6.g gVar2 = gVar;
                            gVar2.setAlpha(floatValue);
                            Iterator it = appBarLayout.f6791y.iterator();
                            while (it.hasNext()) {
                                AppBarLayout.d dVar = (AppBarLayout.d) it.next();
                                ColorStateList colorStateList = gVar2.f6391i.c;
                                if (colorStateList != null) {
                                    colorStateList.withAlpha(floatValue).getDefaultColor();
                                    dVar.a();
                                }
                            }
                        }
                    };
                } else {
                    gVar.k(context2);
                    this.f6790x = new ValueAnimator.AnimatorUpdateListener() { // from class: f5.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i12 = AppBarLayout.F;
                            AppBarLayout appBarLayout = AppBarLayout.this;
                            appBarLayout.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            gVar.m(floatValue);
                            Drawable drawable2 = appBarLayout.C;
                            if (drawable2 instanceof b6.g) {
                                ((b6.g) drawable2).m(floatValue);
                            }
                            Iterator it = appBarLayout.f6791y.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.d) it.next()).a();
                            }
                        }
                    };
                }
                j0.d.q(this, gVar);
            }
            this.f6792z = v5.a.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.A = v5.a.d(context2, R.attr.motionEasingStandardInterpolator, e5.a.f10647a);
            if (d10.hasValue(4)) {
                c(d10.getBoolean(4, false), false, false);
            }
            if (d10.hasValue(3)) {
                f5.j.a(this, d10.getDimensionPixelSize(3, 0));
            }
            if (i11 >= 26) {
                if (d10.hasValue(2)) {
                    setKeyboardNavigationCluster(d10.getBoolean(2, false));
                }
                if (d10.hasValue(1)) {
                    setTouchscreenBlocksFocus(d10.getBoolean(1, false));
                }
            }
            this.D = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f6785s = d10.getBoolean(5, false);
            this.f6786t = d10.getResourceId(7, -1);
            setStatusBarForeground(d10.getDrawable(8));
            d10.recycle();
            j0.i.u(this, new f5.c(this));
        } catch (Throwable th) {
            d5.recycle();
            throw th;
        }
    }

    public static c a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        BaseBehavior.b bVar;
        Behavior behavior = this.E;
        if (behavior != null && this.f6777j != -1 && this.n == 0) {
            bVar = behavior.F(h3.a.f11357j, this);
            this.f6777j = -1;
            this.f6778k = -1;
            this.f6779l = -1;
            if (bVar == null) {
                Behavior behavior2 = this.E;
                if (behavior2.f6796m == null) {
                    behavior2.f6796m = bVar;
                    return;
                }
                return;
            }
            return;
        }
        bVar = null;
        this.f6777j = -1;
        this.f6778k = -1;
        this.f6779l = -1;
        if (bVar == null) {
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        this.n = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z10, boolean z11) {
        float f10;
        if (!z11 || this.f6784r == z10) {
            return false;
        }
        this.f6784r = z10;
        refreshDrawableState();
        if (this.f6785s && (getBackground() instanceof b6.g)) {
            float f11 = 0.0f;
            if (this.f6788v != null) {
                f10 = z10 ? 0.0f : 255.0f;
                if (z10) {
                    f11 = 255.0f;
                }
            } else {
                float f12 = this.D;
                f10 = z10 ? 0.0f : f12;
                if (z10) {
                    f11 = f12;
                }
            }
            g(f10, f11);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.C != null && getTopInset() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f6776i);
            this.C.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f6787u == null && (i10 = this.f6786t) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f6786t);
            }
            if (view2 != null) {
                this.f6787u = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f6787u;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.b(childAt)) {
            return false;
        }
        return true;
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.f6789w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f6789w = ofFloat;
        ofFloat.setDuration(this.f6792z);
        this.f6789w.setInterpolator(this.A);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f6790x;
        if (animatorUpdateListener != null) {
            this.f6789w.addUpdateListener(animatorUpdateListener);
        }
        this.f6789w.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.E = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int i10;
        int d5;
        int i11 = this.f6778k;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = cVar.f6805a;
                if ((i13 & 5) == 5) {
                    int i14 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        d5 = j0.d.d(childAt);
                    } else if ((i13 & 2) != 0) {
                        WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                        d5 = measuredHeight - j0.d.d(childAt);
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0) {
                            WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                            if (j0.d.b(childAt)) {
                                i10 = Math.min(i10, measuredHeight - getTopInset());
                            }
                        }
                        i12 += i10;
                    }
                    i10 = d5 + i14;
                    if (childCount == 0) {
                    }
                    i12 += i10;
                } else if (i12 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f6778k = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f6779l;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = cVar.f6805a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    i12 -= j0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6779l = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6786t;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        int d5 = j0.d.d(this);
        if (d5 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d5 = j0.d.d(getChildAt(childCount - 1));
            } else {
                d5 = 0;
            }
            if (d5 == 0) {
                return getHeight() / 3;
            }
        }
        return (d5 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.n;
    }

    public Drawable getStatusBarForeground() {
        return this.C;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        b1 b1Var = this.f6781o;
        if (b1Var != null) {
            return b1Var.f();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f6777j;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = cVar.f6805a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    if (j0.d.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                    i12 -= j0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6777j = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ma.i.L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.B == null) {
            this.B = new int[4];
        }
        int[] iArr = this.B;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f6783q;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969584;
        iArr[1] = (z10 && this.f6784r) ? R.attr.state_lifted : -2130969585;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969580;
        iArr[3] = (z10 && this.f6784r) ? R.attr.state_collapsed : -2130969579;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f6787u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6787u = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        boolean z13 = true;
        if (j0.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                j0.k(getChildAt(childCount), topInset);
            }
        }
        b();
        this.f6780m = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((c) getChildAt(i14).getLayoutParams()).c != null) {
                this.f6780m = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f6782p) {
            if (!this.f6785s) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((c) getChildAt(i15).getLayoutParams()).f6805a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.f6783q != z13) {
                this.f6783q = z13;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = v8.b.n(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof b6.g) {
            ((b6.g) background).m(f10);
        }
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        c(z10, j0.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f6785s = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f6786t = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f6787u;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6787u = null;
            return;
        }
        this.f6787u = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f6786t = i10;
        WeakReference<View> weakReference = this.f6787u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6787u = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f6782p = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.C = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                Drawable drawable4 = this.C;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                r2.a.c(drawable4, j0.e.d(this));
                Drawable drawable5 = this.C;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.C.setCallback(this);
            }
            if (this.C != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
            j0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(e.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        f5.j.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.C) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
