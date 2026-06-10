package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import com.noto.R;
import d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public u0 B;
    public int C;
    public int D;
    public final int E;
    public CharSequence F;
    public CharSequence G;
    public ColorStateList H;
    public ColorStateList I;
    public boolean J;
    public boolean K;
    public final ArrayList<View> L;
    public final ArrayList<View> M;
    public final int[] N;
    public final a3.n O;
    public ArrayList<MenuItem> P;
    public h Q;
    public final a R;
    public h1 S;
    public androidx.appcompat.widget.c T;
    public f U;
    public boolean V;
    public OnBackInvokedCallback W;

    /* renamed from: a0  reason: collision with root package name */
    public OnBackInvokedDispatcher f793a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f794b0;
    public final b c0;

    /* renamed from: i  reason: collision with root package name */
    public ActionMenuView f795i;

    /* renamed from: j  reason: collision with root package name */
    public e0 f796j;

    /* renamed from: k  reason: collision with root package name */
    public e0 f797k;

    /* renamed from: l  reason: collision with root package name */
    public o f798l;

    /* renamed from: m  reason: collision with root package name */
    public q f799m;
    public final Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f800o;

    /* renamed from: p  reason: collision with root package name */
    public o f801p;

    /* renamed from: q  reason: collision with root package name */
    public View f802q;

    /* renamed from: r  reason: collision with root package name */
    public Context f803r;

    /* renamed from: s  reason: collision with root package name */
    public int f804s;

    /* renamed from: t  reason: collision with root package name */
    public int f805t;

    /* renamed from: u  reason: collision with root package name */
    public int f806u;

    /* renamed from: v  reason: collision with root package name */
    public final int f807v;

    /* renamed from: w  reason: collision with root package name */
    public final int f808w;

    /* renamed from: x  reason: collision with root package name */
    public int f809x;

    /* renamed from: y  reason: collision with root package name */
    public int f810y;

    /* renamed from: z  reason: collision with root package name */
    public int f811z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f795i;
            if (actionMenuView != null && (cVar = actionMenuView.B) != null) {
                cVar.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            boolean z10;
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.c cVar = toolbar.f795i.B;
            if (cVar != null && cVar.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Iterator<a3.r> it = toolbar.O.f208a.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            f fVar = Toolbar.this.U;
            if (fVar == null) {
                hVar = null;
            } else {
                hVar = fVar.f817j;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.k(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.j {

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f816i;

        /* renamed from: j  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f817j;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean d(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.f802q;
            if (view instanceof i.b) {
                ((i.b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f802q);
            toolbar.removeView(toolbar.f801p);
            toolbar.f802q = null;
            ArrayList<View> arrayList = toolbar.M;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f817j = null;
                    toolbar.requestLayout();
                    hVar.C = false;
                    hVar.n.p(false);
                    toolbar.s();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f816i;
            if (fVar2 != null && (hVar = this.f817j) != null) {
                fVar2.d(hVar);
            }
            this.f816i = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void f() {
            if (this.f817j != null) {
                androidx.appcompat.view.menu.f fVar = this.f816i;
                boolean z10 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f816i.getItem(i10) == this.f817j) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z10) {
                    return;
                }
                d(this.f817j);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean h(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f801p.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f801p);
                }
                toolbar.addView(toolbar.f801p);
            }
            View actionView = hVar.getActionView();
            toolbar.f802q = actionView;
            this.f817j = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f802q);
                }
                g gVar = new g();
                gVar.f10201a = (toolbar.f807v & 112) | 8388611;
                gVar.f819b = 2;
                toolbar.f802q.setLayoutParams(gVar);
                toolbar.addView(toolbar.f802q);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f819b != 2 && childAt != toolbar.f795i) {
                    toolbar.removeViewAt(childCount);
                    toolbar.M.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.n.p(false);
            View view = toolbar.f802q;
            if (view instanceof i.b) {
                ((i.b) view).onActionViewExpanded();
            }
            toolbar.s();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0102a {

        /* renamed from: b  reason: collision with root package name */
        public int f819b;

        public g() {
            this.f819b = 0;
            this.f10201a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f819b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f819b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f819b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(g gVar) {
            super((a.C0102a) gVar);
            this.f819b = 0;
            this.f819b = gVar.f819b;
        }

        public g(a.C0102a c0102a) {
            super(c0102a);
            this.f819b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends h3.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f820k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f821l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f820k = parcel.readInt();
            this.f821l = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // h3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11358i, i10);
            parcel.writeInt(this.f820k);
            parcel.writeInt(this.f821l ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E = 8388627;
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.N = new int[2];
        this.O = new a3.n();
        this.P = new ArrayList<>();
        this.R = new a();
        this.c0 = new b();
        Context context2 = getContext();
        int[] iArr = a1.b.I;
        d1 m10 = d1.m(context2, attributeSet, iArr, i10);
        a3.j0.o(this, context, iArr, attributeSet, m10.f903b, i10, 0);
        this.f805t = m10.i(28, 0);
        this.f806u = m10.i(19, 0);
        TypedArray typedArray = m10.f903b;
        this.E = typedArray.getInteger(0, 8388627);
        this.f807v = typedArray.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.A = c10;
        this.f811z = c10;
        this.f810y = c10;
        this.f809x = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.f809x = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.f810y = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.f811z = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.A = c14;
        }
        this.f808w = m10.d(13, -1);
        int c15 = m10.c(9, Integer.MIN_VALUE);
        int c16 = m10.c(5, Integer.MIN_VALUE);
        int d5 = m10.d(7, 0);
        int d10 = m10.d(8, 0);
        if (this.B == null) {
            this.B = new u0();
        }
        u0 u0Var = this.B;
        u0Var.f1119h = false;
        if (d5 != Integer.MIN_VALUE) {
            u0Var.f1116e = d5;
            u0Var.f1113a = d5;
        }
        if (d10 != Integer.MIN_VALUE) {
            u0Var.f1117f = d10;
            u0Var.f1114b = d10;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            u0Var.a(c15, c16);
        }
        this.C = m10.c(10, Integer.MIN_VALUE);
        this.D = m10.c(6, Integer.MIN_VALUE);
        this.n = m10.e(4);
        this.f800o = m10.k(3);
        CharSequence k3 = m10.k(21);
        if (!TextUtils.isEmpty(k3)) {
            setTitle(k3);
        }
        CharSequence k10 = m10.k(18);
        if (!TextUtils.isEmpty(k10)) {
            setSubtitle(k10);
        }
        this.f803r = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k11 = m10.k(15);
        if (!TextUtils.isEmpty(k11)) {
            setNavigationContentDescription(k11);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k12 = m10.k(12);
        if (!TextUtils.isEmpty(k12)) {
            setLogoDescription(k12);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.n();
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0102a ? new g((a.C0102a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a3.m.b(marginLayoutParams) + a3.m.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, j0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f819b == 0 && r(childAt)) {
                    int i12 = gVar.f10201a;
                    WeakHashMap<View, a3.v0> weakHashMap2 = a3.j0.f188a;
                    int d5 = j0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d5) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d5 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f819b == 0 && r(childAt2)) {
                int i14 = gVar2.f10201a;
                WeakHashMap<View, a3.v0> weakHashMap3 = a3.j0.f188a;
                int d10 = j0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d10) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d10 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = g(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f819b = 1;
        if (z10 && this.f802q != null) {
            view.setLayoutParams(gVar);
            this.M.add(view);
            return;
        }
        addView(view, gVar);
    }

    public final void c() {
        if (this.f801p == null) {
            o oVar = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f801p = oVar;
            oVar.setImageDrawable(this.n);
            this.f801p.setContentDescription(this.f800o);
            g gVar = new g();
            gVar.f10201a = (this.f807v & 112) | 8388611;
            gVar.f819b = 2;
            this.f801p.setLayoutParams(gVar);
            this.f801p.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f795i;
        if (actionMenuView.f734x == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.U == null) {
                this.U = new f();
            }
            this.f795i.setExpandedActionViewsExclusive(true);
            fVar.b(this.U, this.f803r);
            s();
        }
    }

    public final void e() {
        if (this.f795i == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f795i = actionMenuView;
            actionMenuView.setPopupTheme(this.f804s);
            this.f795i.setOnMenuItemClickListener(this.R);
            ActionMenuView actionMenuView2 = this.f795i;
            c cVar = new c();
            actionMenuView2.C = null;
            actionMenuView2.D = cVar;
            g gVar = new g();
            gVar.f10201a = (this.f807v & 112) | 8388613;
            this.f795i.setLayoutParams(gVar);
            b(this.f795i, false);
        }
    }

    public final void f() {
        if (this.f798l == null) {
            this.f798l = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f10201a = (this.f807v & 112) | 8388611;
            this.f798l.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        o oVar = this.f801p;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        o oVar = this.f801p;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u0 u0Var = this.B;
        if (u0Var != null) {
            if (u0Var.f1118g) {
                return u0Var.f1113a;
            }
            return u0Var.f1114b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.D;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u0 u0Var = this.B;
        if (u0Var != null) {
            return u0Var.f1113a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        u0 u0Var = this.B;
        if (u0Var != null) {
            return u0Var.f1114b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        u0 u0Var = this.B;
        if (u0Var != null) {
            if (u0Var.f1118g) {
                return u0Var.f1114b;
            }
            return u0Var.f1113a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f795i;
        if (actionMenuView != null && (fVar = actionMenuView.f734x) != null && fVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.D, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.C, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        q qVar = this.f799m;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        q qVar = this.f799m;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f795i.getMenu();
    }

    public View getNavButtonView() {
        return this.f798l;
    }

    public CharSequence getNavigationContentDescription() {
        o oVar = this.f798l;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        o oVar = this.f798l;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.T;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f795i.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f803r;
    }

    public int getPopupTheme() {
        return this.f804s;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public final TextView getSubtitleTextView() {
        return this.f797k;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    public int getTitleMarginBottom() {
        return this.A;
    }

    public int getTitleMarginEnd() {
        return this.f810y;
    }

    public int getTitleMarginStart() {
        return this.f809x;
    }

    public int getTitleMarginTop() {
        return this.f811z;
    }

    public final TextView getTitleTextView() {
        return this.f796j;
    }

    public i0 getWrapper() {
        if (this.S == null) {
            this.S = new h1(this);
        }
        return this.S;
    }

    public final int h(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = gVar.f10201a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.E & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.P.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator<a3.r> it2 = this.O.f208a.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.P = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.M.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.c0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.K = false;
        }
        if (!this.K) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
        r3 = r19.f796j;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[LOOP:0: B:107:0x0286->B:108:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4 A[LOOP:1: B:110:0x02a2->B:111:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean r3;
        boolean r10;
        int i17;
        int i18;
        int i19;
        e0 e0Var;
        boolean z12;
        int i20;
        int i21;
        int i22;
        int paddingTop;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int i29;
        int i30;
        int size2;
        int i31;
        int size3;
        int i32;
        int i33;
        int i34;
        int size4;
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.e.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.N;
        iArr[1] = 0;
        iArr[0] = 0;
        int d5 = j0.d.d(this);
        if (d5 >= 0) {
            i14 = Math.min(d5, i13 - i11);
        } else {
            i14 = 0;
        }
        if (r(this.f798l)) {
            o oVar = this.f798l;
            if (z11) {
                i16 = o(oVar, i35, i14, iArr);
                i15 = paddingLeft;
                if (r(this.f801p)) {
                    o oVar2 = this.f801p;
                    if (z11) {
                        i16 = o(oVar2, i16, i14, iArr);
                    } else {
                        i15 = n(oVar2, i15, i14, iArr);
                    }
                }
                if (r(this.f795i)) {
                    ActionMenuView actionMenuView = this.f795i;
                    if (z11) {
                        i15 = n(actionMenuView, i15, i14, iArr);
                    } else {
                        i16 = o(actionMenuView, i16, i14, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i15);
                iArr[1] = Math.max(0, currentContentInsetRight - (i35 - i16));
                int max = Math.max(i15, currentContentInsetLeft);
                int min = Math.min(i16, i35 - currentContentInsetRight);
                if (r(this.f802q)) {
                    View view = this.f802q;
                    if (z11) {
                        min = o(view, min, i14, iArr);
                    } else {
                        max = n(view, max, i14, iArr);
                    }
                }
                if (r(this.f799m)) {
                    q qVar = this.f799m;
                    if (z11) {
                        min = o(qVar, min, i14, iArr);
                    } else {
                        max = n(qVar, max, i14, iArr);
                    }
                }
                r3 = r(this.f796j);
                r10 = r(this.f797k);
                if (!r3) {
                    g gVar = (g) this.f796j.getLayoutParams();
                    i17 = paddingRight;
                    i18 = this.f796j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin + 0;
                } else {
                    i17 = paddingRight;
                    i18 = 0;
                }
                if (!r10) {
                    g gVar2 = (g) this.f797k.getLayoutParams();
                    i19 = width;
                    i18 += this.f797k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                } else {
                    i19 = width;
                }
                if (!r3 && !r10) {
                    i21 = paddingLeft;
                    i22 = i14;
                    ArrayList<View> arrayList = this.L;
                    a(3, arrayList);
                    size = arrayList.size();
                    i29 = max;
                    for (i30 = 0; i30 < size; i30++) {
                        i29 = n(arrayList.get(i30), i29, i22, iArr);
                    }
                    int i36 = i22;
                    a(5, arrayList);
                    size2 = arrayList.size();
                    for (i31 = 0; i31 < size2; i31++) {
                        min = o(arrayList.get(i31), min, i36, iArr);
                    }
                    a(1, arrayList);
                    int i37 = iArr[0];
                    int i38 = iArr[1];
                    size3 = arrayList.size();
                    int i39 = i37;
                    i32 = 0;
                    int i40 = 0;
                    while (i32 < size3) {
                        View view2 = arrayList.get(i32);
                        g gVar3 = (g) view2.getLayoutParams();
                        int i41 = ((ViewGroup.MarginLayoutParams) gVar3).leftMargin - i39;
                        int i42 = ((ViewGroup.MarginLayoutParams) gVar3).rightMargin - i38;
                        int max2 = Math.max(0, i41);
                        int max3 = Math.max(0, i42);
                        int max4 = Math.max(0, -i41);
                        int max5 = Math.max(0, -i42);
                        i40 += view2.getMeasuredWidth() + max2 + max3;
                        i32++;
                        i38 = max5;
                        i39 = max4;
                    }
                    i34 = ((((i19 - i21) - i17) / 2) + i21) - (i40 / 2);
                    int i43 = i40 + i34;
                    if (i34 >= i29) {
                        if (i43 > min) {
                            i29 = i34 - (i43 - min);
                        } else {
                            i29 = i34;
                        }
                    }
                    size4 = arrayList.size();
                    for (i33 = 0; i33 < size4; i33++) {
                        i29 = n(arrayList.get(i33), i29, i36, iArr);
                    }
                    arrayList.clear();
                }
                e0 e0Var2 = this.f797k;
                if (!r10) {
                    e0Var = this.f797k;
                } else {
                    e0Var = this.f796j;
                }
                g gVar4 = (g) e0Var2.getLayoutParams();
                g gVar5 = (g) e0Var.getLayoutParams();
                if ((!r3 && this.f796j.getMeasuredWidth() > 0) || (r10 && this.f797k.getMeasuredWidth() > 0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i20 = this.E & 112;
                i21 = paddingLeft;
                if (i20 == 48) {
                    if (i20 != 80) {
                        int i44 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                        i22 = i14;
                        int i45 = ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f811z;
                        if (i44 < i45) {
                            i44 = i45;
                        } else {
                            int i46 = (((height - paddingBottom) - i18) - i44) - paddingTop2;
                            int i47 = ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
                            int i48 = this.A;
                            if (i46 < i47 + i48) {
                                i44 = Math.max(0, i44 - ((((ViewGroup.MarginLayoutParams) gVar5).bottomMargin + i48) - i46));
                            }
                        }
                        paddingTop = paddingTop2 + i44;
                    } else {
                        i22 = i14;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin) - this.A) - i18;
                    }
                } else {
                    i22 = i14;
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f811z;
                }
                if (!z11) {
                    if (z12) {
                        i26 = this.f809x;
                    } else {
                        i26 = 0;
                    }
                    int i49 = i26 - iArr[1];
                    min -= Math.max(0, i49);
                    iArr[1] = Math.max(0, -i49);
                    if (r3) {
                        int measuredWidth = min - this.f796j.getMeasuredWidth();
                        int measuredHeight = this.f796j.getMeasuredHeight() + paddingTop;
                        this.f796j.layout(measuredWidth, paddingTop, min, measuredHeight);
                        i27 = measuredWidth - this.f810y;
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((g) this.f796j.getLayoutParams())).bottomMargin;
                    } else {
                        i27 = min;
                    }
                    if (r10) {
                        int i50 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f797k.getLayoutParams())).topMargin;
                        this.f797k.layout(min - this.f797k.getMeasuredWidth(), i50, min, this.f797k.getMeasuredHeight() + i50);
                        i28 = min - this.f810y;
                    } else {
                        i28 = min;
                    }
                    if (z12) {
                        min = Math.min(i27, i28);
                    }
                } else {
                    if (z12) {
                        i23 = this.f809x;
                    } else {
                        i23 = 0;
                    }
                    int i51 = i23 - iArr[0];
                    max += Math.max(0, i51);
                    iArr[0] = Math.max(0, -i51);
                    if (r3) {
                        int measuredWidth2 = this.f796j.getMeasuredWidth() + max;
                        int measuredHeight2 = this.f796j.getMeasuredHeight() + paddingTop;
                        this.f796j.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                        i24 = measuredWidth2 + this.f810y;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((g) this.f796j.getLayoutParams())).bottomMargin;
                    } else {
                        i24 = max;
                    }
                    if (r10) {
                        int i52 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f797k.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f797k.getMeasuredWidth() + max;
                        this.f797k.layout(max, i52, measuredWidth3, this.f797k.getMeasuredHeight() + i52);
                        i25 = measuredWidth3 + this.f810y;
                    } else {
                        i25 = max;
                    }
                    if (z12) {
                        max = Math.max(i24, i25);
                    }
                }
                ArrayList<View> arrayList2 = this.L;
                a(3, arrayList2);
                size = arrayList2.size();
                i29 = max;
                while (i30 < size) {
                }
                int i362 = i22;
                a(5, arrayList2);
                size2 = arrayList2.size();
                while (i31 < size2) {
                }
                a(1, arrayList2);
                int i372 = iArr[0];
                int i382 = iArr[1];
                size3 = arrayList2.size();
                int i392 = i372;
                i32 = 0;
                int i402 = 0;
                while (i32 < size3) {
                }
                i34 = ((((i19 - i21) - i17) / 2) + i21) - (i402 / 2);
                int i432 = i402 + i34;
                if (i34 >= i29) {
                }
                size4 = arrayList2.size();
                while (i33 < size4) {
                }
                arrayList2.clear();
            }
            i15 = n(oVar, paddingLeft, i14, iArr);
        } else {
            i15 = paddingLeft;
        }
        i16 = i35;
        if (r(this.f801p)) {
        }
        if (r(this.f795i)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i15);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - i16));
        int max6 = Math.max(i15, currentContentInsetLeft2);
        int min2 = Math.min(i16, i35 - currentContentInsetRight2);
        if (r(this.f802q)) {
        }
        if (r(this.f799m)) {
        }
        r3 = r(this.f796j);
        r10 = r(this.f797k);
        if (!r3) {
        }
        if (!r10) {
        }
        if (!r3) {
            i21 = paddingLeft;
            i22 = i14;
            ArrayList<View> arrayList22 = this.L;
            a(3, arrayList22);
            size = arrayList22.size();
            i29 = max6;
            while (i30 < size) {
            }
            int i3622 = i22;
            a(5, arrayList22);
            size2 = arrayList22.size();
            while (i31 < size2) {
            }
            a(1, arrayList22);
            int i3722 = iArr[0];
            int i3822 = iArr[1];
            size3 = arrayList22.size();
            int i3922 = i3722;
            i32 = 0;
            int i4022 = 0;
            while (i32 < size3) {
            }
            i34 = ((((i19 - i21) - i17) / 2) + i21) - (i4022 / 2);
            int i4322 = i4022 + i34;
            if (i34 >= i29) {
            }
            size4 = arrayList22.size();
            while (i33 < size4) {
            }
            arrayList22.clear();
        }
        e0 e0Var22 = this.f797k;
        if (!r10) {
        }
        g gVar42 = (g) e0Var22.getLayoutParams();
        g gVar52 = (g) e0Var.getLayoutParams();
        if (!r3) {
        }
        z12 = false;
        i20 = this.E & 112;
        i21 = paddingLeft;
        if (i20 == 48) {
        }
        if (!z11) {
        }
        ArrayList<View> arrayList222 = this.L;
        a(3, arrayList222);
        size = arrayList222.size();
        i29 = max6;
        while (i30 < size) {
        }
        int i36222 = i22;
        a(5, arrayList222);
        size2 = arrayList222.size();
        while (i31 < size2) {
        }
        a(1, arrayList222);
        int i37222 = iArr[0];
        int i38222 = iArr[1];
        size3 = arrayList222.size();
        int i39222 = i37222;
        i32 = 0;
        int i40222 = 0;
        while (i32 < size3) {
        }
        i34 = ((((i19 - i21) - i17) / 2) + i21) - (i40222 / 2);
        int i43222 = i40222 + i34;
        if (i34 >= i29) {
        }
        size4 = arrayList222.size();
        while (i33 < size4) {
        }
        arrayList222.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        boolean a10 = n1.a(this);
        int i19 = !a10 ? 1 : 0;
        int i20 = 0;
        if (r(this.f798l)) {
            q(this.f798l, i10, 0, i11, this.f808w);
            i12 = i(this.f798l) + this.f798l.getMeasuredWidth();
            i13 = Math.max(0, j(this.f798l) + this.f798l.getMeasuredHeight());
            i14 = View.combineMeasuredStates(0, this.f798l.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (r(this.f801p)) {
            q(this.f801p, i10, 0, i11, this.f808w);
            i12 = i(this.f801p) + this.f801p.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f801p) + this.f801p.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f801p.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12) + 0;
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.N;
        iArr[a10 ? 1 : 0] = max2;
        if (r(this.f795i)) {
            q(this.f795i, i10, max, i11, this.f808w);
            i15 = i(this.f795i) + this.f795i.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f795i) + this.f795i.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f795i.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (r(this.f802q)) {
            max3 += p(this.f802q, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f802q) + this.f802q.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f802q.getMeasuredState());
        }
        if (r(this.f799m)) {
            max3 += p(this.f799m, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f799m) + this.f799m.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f799m.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((g) childAt.getLayoutParams()).f819b == 0 && r(childAt)) {
                max3 += p(childAt, i10, max3, i11, 0, iArr);
                i13 = Math.max(i13, j(childAt) + childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i22 = this.f811z + this.A;
        int i23 = this.f809x + this.f810y;
        if (r(this.f796j)) {
            p(this.f796j, i10, max3 + i23, i11, i22, iArr);
            int i24 = i(this.f796j) + this.f796j.getMeasuredWidth();
            i18 = j(this.f796j) + this.f796j.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i14, this.f796j.getMeasuredState());
            i17 = i24;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (r(this.f797k)) {
            i17 = Math.max(i17, p(this.f797k, i10, max3 + i23, i11, i18 + i22, iArr));
            i18 += j(this.f797k) + this.f797k.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.f797k.getMeasuredState());
        } else {
            int i25 = i16;
        }
        int max4 = Math.max(i13, i18);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i17, getSuggestedMinimumWidth()), i10, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i16 << 16);
        if (this.V) {
            int childCount2 = getChildCount();
            for (int i26 = 0; i26 < childCount2; i26++) {
                View childAt2 = getChildAt(i26);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            z10 = true;
            if (z10) {
                i20 = resolveSizeAndState2;
            }
            setMeasuredDimension(resolveSizeAndState, i20);
        }
        z10 = false;
        if (z10) {
        }
        setMeasuredDimension(resolveSizeAndState, i20);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f11358i);
        ActionMenuView actionMenuView = this.f795i;
        if (actionMenuView != null) {
            fVar = actionMenuView.f734x;
        } else {
            fVar = null;
        }
        int i10 = iVar.f820k;
        if (i10 != 0 && this.U != null && fVar != null && (findItem = fVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f821l) {
            b bVar = this.c0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        int i11;
        super.onRtlPropertiesChanged(i10);
        if (this.B == null) {
            this.B = new u0();
        }
        u0 u0Var = this.B;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != u0Var.f1118g) {
            u0Var.f1118g = z10;
            if (u0Var.f1119h) {
                if (z10) {
                    int i12 = u0Var.f1115d;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = u0Var.f1116e;
                    }
                    u0Var.f1113a = i12;
                    i11 = u0Var.c;
                    if (i11 != Integer.MIN_VALUE) {
                    }
                } else {
                    int i13 = u0Var.c;
                    if (i13 == Integer.MIN_VALUE) {
                        i13 = u0Var.f1116e;
                    }
                    u0Var.f1113a = i13;
                    i11 = u0Var.f1115d;
                    if (i11 != Integer.MIN_VALUE) {
                    }
                }
                u0Var.f1114b = i11;
            }
            u0Var.f1113a = u0Var.f1116e;
            i11 = u0Var.f1117f;
            u0Var.f1114b = i11;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.U;
        if (fVar != null && (hVar = fVar.f817j) != null) {
            iVar.f820k = hVar.f638a;
        }
        ActionMenuView actionMenuView = this.f795i;
        boolean z11 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.B;
            if (cVar != null && cVar.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        iVar.f821l = z11;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = false;
        }
        if (!this.J) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.U;
            boolean z11 = true;
            if (fVar != null && fVar.f817j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && a10 != null) {
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                if (j0.g.b(this) && this.f794b0) {
                    if (!z11 && this.f793a0 == null) {
                        if (this.W == null) {
                            this.W = e.b(new androidx.activity.b(3, this));
                        }
                        e.c(a10, this.W);
                    } else if (z11 && (onBackInvokedDispatcher = this.f793a0) != null) {
                        e.d(onBackInvokedDispatcher, this.W);
                        a10 = null;
                    }
                    this.f793a0 = a10;
                    return;
                }
            }
            z11 = false;
            if (!z11) {
            }
            if (z11) {
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f794b0 != z10) {
            this.f794b0 = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        o oVar = this.f801p;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(e.a.a(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f801p.setImageDrawable(drawable);
            return;
        }
        o oVar = this.f801p;
        if (oVar != null) {
            oVar.setImageDrawable(this.n);
        }
    }

    public void setCollapsible(boolean z10) {
        this.V = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.D) {
            this.D = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(e.a.a(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f799m == null) {
                this.f799m = new q(getContext());
            }
            if (!m(this.f799m)) {
                b(this.f799m, true);
            }
        } else {
            q qVar = this.f799m;
            if (qVar != null && m(qVar)) {
                removeView(this.f799m);
                this.M.remove(this.f799m);
            }
        }
        q qVar2 = this.f799m;
        if (qVar2 != null) {
            qVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f799m == null) {
            this.f799m = new q(getContext());
        }
        q qVar = this.f799m;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        o oVar = this.f798l;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
            i1.a(this.f798l, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(e.a.a(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f798l)) {
                b(this.f798l, true);
            }
        } else {
            o oVar = this.f798l;
            if (oVar != null && m(oVar)) {
                removeView(this.f798l);
                this.M.remove(this.f798l);
            }
        }
        o oVar2 = this.f798l;
        if (oVar2 != null) {
            oVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f798l.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.Q = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f795i.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f804s != i10) {
            this.f804s = i10;
            if (i10 == 0) {
                this.f803r = getContext();
            } else {
                this.f803r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f797k == null) {
                Context context = getContext();
                e0 e0Var = new e0(context, null);
                this.f797k = e0Var;
                e0Var.setSingleLine();
                this.f797k.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f806u;
                if (i10 != 0) {
                    this.f797k.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.f797k.setTextColor(colorStateList);
                }
            }
            if (!m(this.f797k)) {
                b(this.f797k, true);
            }
        } else {
            e0 e0Var2 = this.f797k;
            if (e0Var2 != null && m(e0Var2)) {
                removeView(this.f797k);
                this.M.remove(this.f797k);
            }
        }
        e0 e0Var3 = this.f797k;
        if (e0Var3 != null) {
            e0Var3.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        e0 e0Var = this.f797k;
        if (e0Var != null) {
            e0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f796j == null) {
                Context context = getContext();
                e0 e0Var = new e0(context, null);
                this.f796j = e0Var;
                e0Var.setSingleLine();
                this.f796j.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f805t;
                if (i10 != 0) {
                    this.f796j.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f796j.setTextColor(colorStateList);
                }
            }
            if (!m(this.f796j)) {
                b(this.f796j, true);
            }
        } else {
            e0 e0Var2 = this.f796j;
            if (e0Var2 != null && m(e0Var2)) {
                removeView(this.f796j);
                this.M.remove(this.f796j);
            }
        }
        e0 e0Var3 = this.f796j;
        if (e0Var3 != null) {
            e0Var3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f810y = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f809x = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f811z = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        e0 e0Var = this.f796j;
        if (e0Var != null) {
            e0Var.setTextColor(colorStateList);
        }
    }
}
