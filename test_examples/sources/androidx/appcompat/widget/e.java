package androidx.appcompat.widget;

import a3.j0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f904a;

    /* renamed from: d  reason: collision with root package name */
    public b1 f906d;

    /* renamed from: e  reason: collision with root package name */
    public b1 f907e;

    /* renamed from: f  reason: collision with root package name */
    public b1 f908f;
    public int c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final k f905b = k.a();

    public e(View view) {
        this.f904a = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 == 21) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        View view = this.f904a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i10 > 21) {
                if (this.f906d != null) {
                    z10 = true;
                }
                z10 = false;
            }
            if (z10) {
                if (this.f908f == null) {
                    this.f908f = new b1();
                }
                b1 b1Var = this.f908f;
                b1Var.f859a = null;
                b1Var.f861d = false;
                b1Var.f860b = null;
                b1Var.c = false;
                WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
                ColorStateList g10 = j0.i.g(view);
                if (g10 != null) {
                    b1Var.f861d = true;
                    b1Var.f859a = g10;
                }
                PorterDuff.Mode h10 = j0.i.h(view);
                if (h10 != null) {
                    b1Var.c = true;
                    b1Var.f860b = h10;
                }
                if (!b1Var.f861d && !b1Var.c) {
                    z11 = false;
                    if (z11) {
                        return;
                    }
                }
                k.e(background, b1Var, view.getDrawableState());
                if (z11) {
                }
            }
            b1 b1Var2 = this.f907e;
            if (b1Var2 != null) {
                k.e(background, b1Var2, view.getDrawableState());
                return;
            }
            b1 b1Var3 = this.f906d;
            if (b1Var3 != null) {
                k.e(background, b1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        b1 b1Var = this.f907e;
        if (b1Var != null) {
            return b1Var.f859a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        b1 b1Var = this.f907e;
        if (b1Var != null) {
            return b1Var.f860b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = this.f904a;
        Context context = view.getContext();
        int[] iArr = a1.b.K;
        d1 m10 = d1.m(context, attributeSet, iArr, i10);
        View view2 = this.f904a;
        a3.j0.o(view2, view2.getContext(), iArr, attributeSet, m10.f903b, i10, 0);
        boolean z10 = false;
        try {
            if (m10.l(0)) {
                this.c = m10.i(0, -1);
                k kVar = this.f905b;
                Context context2 = view.getContext();
                int i12 = this.c;
                synchronized (kVar) {
                    i11 = kVar.f981a.i(context2, i12);
                }
                if (i11 != null) {
                    g(i11);
                }
            }
            if (m10.l(1)) {
                a3.j0.r(view, m10.b(1));
            }
            if (m10.l(2)) {
                PorterDuff.Mode d5 = j0.d(m10.h(2, -1), null);
                int i13 = Build.VERSION.SDK_INT;
                j0.i.r(view, d5);
                if (i13 == 21) {
                    Drawable background = view.getBackground();
                    z10 = (j0.i.g(view) == null && j0.i.h(view) == null) ? true : true;
                    if (background != null && z10) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        j0.d.q(view, background);
                    }
                }
            }
        } finally {
            m10.n();
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.c = i10;
        k kVar = this.f905b;
        if (kVar != null) {
            Context context = this.f904a.getContext();
            synchronized (kVar) {
                colorStateList = kVar.f981a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f906d == null) {
                this.f906d = new b1();
            }
            b1 b1Var = this.f906d;
            b1Var.f859a = colorStateList;
            b1Var.f861d = true;
        } else {
            this.f906d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f907e == null) {
            this.f907e = new b1();
        }
        b1 b1Var = this.f907e;
        b1Var.f859a = colorStateList;
        b1Var.f861d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f907e == null) {
            this.f907e = new b1();
        }
        b1 b1Var = this.f907e;
        b1Var.f860b = mode;
        b1Var.c = true;
        a();
    }
}
