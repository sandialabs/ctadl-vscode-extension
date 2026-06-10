package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import e3.g;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p0 implements j.f {
    public static final Method I;
    public static final Method J;
    public static final Method K;
    public final Handler D;
    public Rect F;
    public boolean G;
    public final s H;

    /* renamed from: i  reason: collision with root package name */
    public final Context f1065i;

    /* renamed from: j  reason: collision with root package name */
    public ListAdapter f1066j;

    /* renamed from: k  reason: collision with root package name */
    public k0 f1067k;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f1070o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1072q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1073r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1074s;

    /* renamed from: v  reason: collision with root package name */
    public d f1077v;

    /* renamed from: w  reason: collision with root package name */
    public View f1078w;

    /* renamed from: x  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1079x;

    /* renamed from: y  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1080y;

    /* renamed from: l  reason: collision with root package name */
    public final int f1068l = -2;

    /* renamed from: m  reason: collision with root package name */
    public int f1069m = -2;

    /* renamed from: p  reason: collision with root package name */
    public final int f1071p = 1002;

    /* renamed from: t  reason: collision with root package name */
    public int f1075t = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f1076u = Integer.MAX_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public final g f1081z = new g();
    public final f A = new f();
    public final e B = new e();
    public final c C = new c();
    public final Rect E = new Rect();

    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i10, z10);
            return maxAvailableHeight;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k0 k0Var = p0.this.f1067k;
            if (k0Var != null) {
                k0Var.setListSelectionHidden(true);
                k0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            p0 p0Var = p0.this;
            if (p0Var.c()) {
                p0Var.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            p0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                p0 p0Var = p0.this;
                if (p0Var.H.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && p0Var.H.getContentView() != null) {
                    Handler handler = p0Var.D;
                    g gVar = p0Var.f1081z;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            s sVar;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            p0 p0Var = p0.this;
            if (action == 0 && (sVar = p0Var.H) != null && sVar.isShowing() && x3 >= 0) {
                s sVar2 = p0Var.H;
                if (x3 < sVar2.getWidth() && y10 >= 0 && y10 < sVar2.getHeight()) {
                    p0Var.D.postDelayed(p0Var.f1081z, 250L);
                    return false;
                }
            }
            if (action == 1) {
                p0Var.D.removeCallbacks(p0Var.f1081z);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p0 p0Var = p0.this;
            k0 k0Var = p0Var.f1067k;
            if (k0Var != null) {
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                if (j0.g.b(k0Var) && p0Var.f1067k.getCount() > p0Var.f1067k.getChildCount() && p0Var.f1067k.getChildCount() <= p0Var.f1076u) {
                    p0Var.H.setInputMethodMode(2);
                    p0Var.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public p0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1065i = context;
        this.D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f62y, i10, i11);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1070o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1072q = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.H = sVar;
        sVar.setInputMethodMode(1);
    }

    @Override // j.f
    public final void a() {
        int i10;
        boolean z10;
        int a10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        k0 k0Var;
        int i13;
        int i14;
        k0 k0Var2 = this.f1067k;
        s sVar = this.H;
        Context context = this.f1065i;
        if (k0Var2 == null) {
            k0 q10 = q(context, !this.G);
            this.f1067k = q10;
            q10.setAdapter(this.f1066j);
            this.f1067k.setOnItemClickListener(this.f1079x);
            this.f1067k.setFocusable(true);
            this.f1067k.setFocusableInTouchMode(true);
            this.f1067k.setOnItemSelectedListener(new o0(this));
            this.f1067k.setOnScrollListener(this.B);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1080y;
            if (onItemSelectedListener != null) {
                this.f1067k.setOnItemSelectedListener(onItemSelectedListener);
            }
            sVar.setContentView(this.f1067k);
        } else {
            ViewGroup viewGroup = (ViewGroup) sVar.getContentView();
        }
        Drawable background = sVar.getBackground();
        int i15 = 0;
        Rect rect = this.E;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f1072q) {
                this.f1070o = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (sVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f1078w;
        int i17 = this.f1070o;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = J;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(sVar, view, Integer.valueOf(i17), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = sVar.getMaxAvailableHeight(view, i17);
        } else {
            a10 = a.a(sVar, view, i17, z10);
        }
        int i18 = this.f1068l;
        if (i18 == -1) {
            i12 = a10 + i10;
        } else {
            int i19 = this.f1069m;
            if (i19 != -2) {
                if (i19 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.f1067k.a(makeMeasureSpec, a10 + 0);
            if (a11 > 0) {
                i11 = this.f1067k.getPaddingBottom() + this.f1067k.getPaddingTop() + i10 + 0;
            } else {
                i11 = 0;
            }
            i12 = a11 + i11;
        }
        if (sVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        e3.g.b(sVar, this.f1071p);
        if (sVar.isShowing()) {
            View view2 = this.f1078w;
            WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
            if (!j0.g.b(view2)) {
                return;
            }
            int i20 = this.f1069m;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.f1078w.getWidth();
            }
            if (i18 == -1) {
                if (z11) {
                    i18 = i12;
                } else {
                    i18 = -1;
                }
                int i21 = this.f1069m;
                if (z11) {
                    if (i21 == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    sVar.setWidth(i14);
                    sVar.setHeight(0);
                } else {
                    if (i21 == -1) {
                        i15 = -1;
                    }
                    sVar.setWidth(i15);
                    sVar.setHeight(-1);
                }
            } else if (i18 == -2) {
                i18 = i12;
            }
            sVar.setOutsideTouchable(true);
            View view3 = this.f1078w;
            int i22 = this.n;
            int i23 = this.f1070o;
            if (i20 < 0) {
                i20 = -1;
            }
            if (i18 < 0) {
                i13 = -1;
            } else {
                i13 = i18;
            }
            sVar.update(view3, i22, i23, i20, i13);
            return;
        }
        int i24 = this.f1069m;
        if (i24 == -1) {
            i24 = -1;
        } else if (i24 == -2) {
            i24 = this.f1078w.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        sVar.setWidth(i24);
        sVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = I;
            if (method2 != null) {
                try {
                    method2.invoke(sVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(sVar, true);
        }
        sVar.setOutsideTouchable(true);
        sVar.setTouchInterceptor(this.A);
        if (this.f1074s) {
            e3.g.a(sVar, this.f1073r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = K;
            if (method3 != null) {
                try {
                    method3.invoke(sVar, this.F);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(sVar, this.F);
        }
        g.a.a(sVar, this.f1078w, this.n, this.f1070o, this.f1075t);
        this.f1067k.setSelection(-1);
        if ((!this.G || this.f1067k.isInTouchMode()) && (k0Var = this.f1067k) != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
        if (!this.G) {
            this.D.post(this.C);
        }
    }

    @Override // j.f
    public final boolean c() {
        return this.H.isShowing();
    }

    public final int d() {
        return this.n;
    }

    @Override // j.f
    public final void dismiss() {
        s sVar = this.H;
        sVar.dismiss();
        sVar.setContentView(null);
        this.f1067k = null;
        this.D.removeCallbacks(this.f1081z);
    }

    public final Drawable f() {
        return this.H.getBackground();
    }

    @Override // j.f
    public final k0 g() {
        return this.f1067k;
    }

    public final void i(Drawable drawable) {
        this.H.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.f1070o = i10;
        this.f1072q = true;
    }

    public final void l(int i10) {
        this.n = i10;
    }

    public final int n() {
        if (this.f1072q) {
            return this.f1070o;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f1077v;
        if (dVar == null) {
            this.f1077v = new d();
        } else {
            ListAdapter listAdapter2 = this.f1066j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1066j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1077v);
        }
        k0 k0Var = this.f1067k;
        if (k0Var != null) {
            k0Var.setAdapter(this.f1066j);
        }
    }

    public k0 q(Context context, boolean z10) {
        return new k0(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.H.getBackground();
        if (background != null) {
            Rect rect = this.E;
            background.getPadding(rect);
            this.f1069m = rect.left + rect.right + i10;
            return;
        }
        this.f1069m = i10;
    }
}
