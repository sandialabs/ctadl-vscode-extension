package androidx.appcompat.view.menu;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l extends j.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A;
    public boolean C;

    /* renamed from: j  reason: collision with root package name */
    public final Context f675j;

    /* renamed from: k  reason: collision with root package name */
    public final f f676k;

    /* renamed from: l  reason: collision with root package name */
    public final e f677l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f678m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f679o;

    /* renamed from: p  reason: collision with root package name */
    public final int f680p;

    /* renamed from: q  reason: collision with root package name */
    public final r0 f681q;

    /* renamed from: t  reason: collision with root package name */
    public PopupWindow.OnDismissListener f684t;

    /* renamed from: u  reason: collision with root package name */
    public View f685u;

    /* renamed from: v  reason: collision with root package name */
    public View f686v;

    /* renamed from: w  reason: collision with root package name */
    public j.a f687w;

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver f688x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f689y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f690z;

    /* renamed from: r  reason: collision with root package name */
    public final a f682r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final b f683s = new b();
    public int B = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.c() && !lVar.f681q.G) {
                View view = lVar.f686v;
                if (view != null && view.isShown()) {
                    lVar.f681q.a();
                    return;
                }
                lVar.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.f688x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.f688x = view.getViewTreeObserver();
                }
                lVar.f688x.removeGlobalOnLayoutListener(lVar.f682r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f675j = context;
        this.f676k = fVar;
        this.f678m = z10;
        this.f677l = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f679o = i10;
        this.f680p = i11;
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f685u = view;
        this.f681q = new r0(context, i10, i11);
        fVar.b(this, context);
    }

    @Override // j.f
    public final void a() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!c()) {
            if (!this.f689y && (view = this.f685u) != null) {
                this.f686v = view;
                r0 r0Var = this.f681q;
                r0Var.H.setOnDismissListener(this);
                r0Var.f1079x = this;
                r0Var.G = true;
                s sVar = r0Var.H;
                sVar.setFocusable(true);
                View view2 = this.f686v;
                if (this.f688x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f688x = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f682r);
                }
                view2.addOnAttachStateChangeListener(this.f683s);
                r0Var.f1078w = view2;
                r0Var.f1075t = this.B;
                boolean z12 = this.f690z;
                Context context = this.f675j;
                e eVar = this.f677l;
                if (!z12) {
                    this.A = j.d.m(eVar, context, this.n);
                    this.f690z = true;
                }
                r0Var.r(this.A);
                sVar.setInputMethodMode(2);
                Rect rect2 = this.f12618i;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                r0Var.F = rect;
                r0Var.a();
                k0 k0Var = r0Var.f1067k;
                k0Var.setOnKeyListener(this);
                if (this.C) {
                    f fVar = this.f676k;
                    if (fVar.f624m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) k0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.f624m);
                        }
                        frameLayout.setEnabled(false);
                        k0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                r0Var.p(eVar);
                r0Var.a();
            }
            z11 = false;
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        if (fVar != this.f676k) {
            return;
        }
        dismiss();
        j.a aVar = this.f687w;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // j.f
    public final boolean c() {
        return !this.f689y && this.f681q.c();
    }

    @Override // j.f
    public final void dismiss() {
        if (c()) {
            this.f681q.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f() {
        this.f690z = false;
        e eVar = this.f677l;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // j.f
    public final k0 g() {
        return this.f681q.f1067k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(m mVar) {
        boolean z10;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f679o, this.f680p, this.f675j, this.f686v, mVar, this.f678m);
            j.a aVar = this.f687w;
            iVar.f670i = aVar;
            j.d dVar = iVar.f671j;
            if (dVar != null) {
                dVar.j(aVar);
            }
            boolean u10 = j.d.u(mVar);
            iVar.f669h = u10;
            j.d dVar2 = iVar.f671j;
            if (dVar2 != null) {
                dVar2.o(u10);
            }
            iVar.f672k = this.f684t;
            this.f684t = null;
            this.f676k.c(false);
            r0 r0Var = this.f681q;
            int i10 = r0Var.n;
            int n = r0Var.n();
            int i11 = this.B;
            View view = this.f685u;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if ((Gravity.getAbsoluteGravity(i11, j0.e.d(view)) & 7) == 5) {
                i10 += this.f685u.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f667f == null) {
                    z10 = false;
                    if (z10) {
                        j.a aVar2 = this.f687w;
                        if (aVar2 != null) {
                            aVar2.c(mVar);
                        }
                        return true;
                    }
                } else {
                    iVar.d(i10, n, true, true);
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(j.a aVar) {
        this.f687w = aVar;
    }

    @Override // j.d
    public final void l(f fVar) {
    }

    @Override // j.d
    public final void n(View view) {
        this.f685u = view;
    }

    @Override // j.d
    public final void o(boolean z10) {
        this.f677l.f609k = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f689y = true;
        this.f676k.c(true);
        ViewTreeObserver viewTreeObserver = this.f688x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f688x = this.f686v.getViewTreeObserver();
            }
            this.f688x.removeGlobalOnLayoutListener(this.f682r);
            this.f688x = null;
        }
        this.f686v.removeOnAttachStateChangeListener(this.f683s);
        PopupWindow.OnDismissListener onDismissListener = this.f684t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // j.d
    public final void p(int i10) {
        this.B = i10;
    }

    @Override // j.d
    public final void q(int i10) {
        this.f681q.n = i10;
    }

    @Override // j.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f684t = onDismissListener;
    }

    @Override // j.d
    public final void s(boolean z10) {
        this.C = z10;
    }

    @Override // j.d
    public final void t(int i10) {
        this.f681q.j(i10);
    }
}
