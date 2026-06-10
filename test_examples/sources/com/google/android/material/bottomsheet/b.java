package com.google.android.material.bottomsheet;

import a3.b1;
import a3.d1;
import a3.j0;
import a3.v0;
import a3.y0;
import a3.z0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.noto.R;
import d.r;
import i5.d;
import i5.e;
import i5.f;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends r {

    /* renamed from: m  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f6921m;
    public FrameLayout n;

    /* renamed from: o  reason: collision with root package name */
    public CoordinatorLayout f6922o;

    /* renamed from: p  reason: collision with root package name */
    public FrameLayout f6923p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6924q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6925r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6926s;

    /* renamed from: t  reason: collision with root package name */
    public C0059b f6927t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6928u;

    /* renamed from: v  reason: collision with root package name */
    public final a f6929v;

    /* loaded from: classes.dex */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            if (i10 == 5) {
                b.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0059b extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f6931a;

        /* renamed from: b  reason: collision with root package name */
        public final b1 f6932b;
        public Window c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6933d;

        public C0059b(FrameLayout frameLayout, b1 b1Var) {
            ColorStateList g10;
            Boolean bool;
            int color;
            this.f6932b = b1Var;
            g gVar = BottomSheetBehavior.w(frameLayout).f6891i;
            if (gVar != null) {
                g10 = gVar.f6391i.c;
            } else {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                g10 = j0.i.g(frameLayout);
            }
            if (g10 != null) {
                color = g10.getDefaultColor();
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                color = ((ColorDrawable) frameLayout.getBackground()).getColor();
            } else {
                bool = null;
                this.f6931a = bool;
            }
            bool = Boolean.valueOf(a1.b.j0(color));
            this.f6931a = bool;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            boolean booleanValue;
            int top = view.getTop();
            b1 b1Var = this.f6932b;
            if (top < b1Var.f()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.f6931a;
                    if (bool == null) {
                        booleanValue = this.f6933d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    new d1(window, window.getDecorView()).a(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), b1Var.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    new d1(window2, window2.getDecorView()).a(this.f6933d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.f6933d = new d1(window, window.getDecorView()).f169a.b();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, int i10) {
        super(context, i10);
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i10 = typedValue.resourceId;
            } else {
                i10 = 2132083274;
            }
        }
        this.f6924q = true;
        this.f6925r = true;
        this.f6929v = new a();
        c().w(1);
        this.f6928u = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f6921m == null) {
            g();
        }
        super.cancel();
    }

    public final void g() {
        if (this.n == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.n = frameLayout;
            this.f6922o = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.n.findViewById(R.id.design_bottom_sheet);
            this.f6923p = frameLayout2;
            BottomSheetBehavior<FrameLayout> w10 = BottomSheetBehavior.w(frameLayout2);
            this.f6921m = w10;
            ArrayList<BottomSheetBehavior.c> arrayList = w10.W;
            a aVar = this.f6929v;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f6921m.C(this.f6924q);
        }
    }

    public final FrameLayout k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.n.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f6928u) {
            FrameLayout frameLayout = this.f6923p;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.i.u(frameLayout, aVar);
        }
        this.f6923p.removeAllViews();
        FrameLayout frameLayout2 = this.f6923p;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        j0.p(this.f6923p, new e(this));
        this.f6923p.setOnTouchListener(new f());
        return this.n;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f6928u && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.n;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f6922o;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            boolean z11 = !z10;
            if (Build.VERSION.SDK_INT >= 30) {
                z0.a(window, z11);
            } else {
                y0.a(window, z11);
            }
            C0059b c0059b = this.f6927t;
            if (c0059b != null) {
                c0059b.e(window);
            }
        }
    }

    @Override // d.r, androidx.activity.h, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i10 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C0059b c0059b = this.f6927t;
        if (c0059b != null) {
            c0059b.e(null);
        }
    }

    @Override // androidx.activity.h, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f6921m;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.E(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f6924q != z10) {
            this.f6924q = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f6921m;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f6924q) {
            this.f6924q = true;
        }
        this.f6925r = z10;
        this.f6926s = true;
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(k(null, i10, null));
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(k(view, 0, null));
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(view, 0, layoutParams));
    }
}
