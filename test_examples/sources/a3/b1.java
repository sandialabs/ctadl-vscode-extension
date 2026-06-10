package a3;

import a3.h;
import a3.j0;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final b1 f139b;

    /* renamed from: a  reason: collision with root package name */
    public final k f140a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f141a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f142b;
        public static final Field c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f143d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f141a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f142b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f143d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public static Field f144e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f145f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f146g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f147h = false;
        public WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public q2.b f148d;

        public b() {
            this.c = i();
        }

        public b(b1 b1Var) {
            super(b1Var);
            this.c = b1Var.h();
        }

        private static WindowInsets i() {
            if (!f145f) {
                try {
                    f144e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f145f = true;
            }
            Field field = f144e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f147h) {
                try {
                    f146g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f147h = true;
            }
            Constructor<WindowInsets> constructor = f146g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // a3.b1.e
        public b1 b() {
            a();
            b1 i10 = b1.i(null, this.c);
            q2.b[] bVarArr = this.f150b;
            k kVar = i10.f140a;
            kVar.q(bVarArr);
            kVar.s(this.f148d);
            return i10;
        }

        @Override // a3.b1.e
        public void e(q2.b bVar) {
            this.f148d = bVar;
        }

        @Override // a3.b1.e
        public void g(q2.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.f16871a, bVar.f16872b, bVar.c, bVar.f16873d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {
        public final WindowInsets.Builder c;

        public c() {
            this.c = new WindowInsets.Builder();
        }

        public c(b1 b1Var) {
            super(b1Var);
            WindowInsets h10 = b1Var.h();
            this.c = h10 != null ? new WindowInsets.Builder(h10) : new WindowInsets.Builder();
        }

        @Override // a3.b1.e
        public b1 b() {
            WindowInsets build;
            a();
            build = this.c.build();
            b1 i10 = b1.i(null, build);
            i10.f140a.q(this.f150b);
            return i10;
        }

        @Override // a3.b1.e
        public void d(q2.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // a3.b1.e
        public void e(q2.b bVar) {
            this.c.setStableInsets(bVar.d());
        }

        @Override // a3.b1.e
        public void f(q2.b bVar) {
            this.c.setSystemGestureInsets(bVar.d());
        }

        @Override // a3.b1.e
        public void g(q2.b bVar) {
            this.c.setSystemWindowInsets(bVar.d());
        }

        @Override // a3.b1.e
        public void h(q2.b bVar) {
            this.c.setTappableElementInsets(bVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(b1 b1Var) {
            super(b1Var);
        }

        @Override // a3.b1.e
        public void c(int i10, q2.b bVar) {
            this.c.setInsets(m.a(i10), bVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final b1 f149a;

        /* renamed from: b  reason: collision with root package name */
        public q2.b[] f150b;

        public e() {
            this(new b1());
        }

        public e(b1 b1Var) {
            this.f149a = b1Var;
        }

        public final void a() {
            q2.b[] bVarArr = this.f150b;
            if (bVarArr != null) {
                q2.b bVar = bVarArr[l.a(1)];
                q2.b bVar2 = this.f150b[l.a(2)];
                b1 b1Var = this.f149a;
                if (bVar2 == null) {
                    bVar2 = b1Var.a(2);
                }
                if (bVar == null) {
                    bVar = b1Var.a(1);
                }
                g(q2.b.a(bVar, bVar2));
                q2.b bVar3 = this.f150b[l.a(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                q2.b bVar4 = this.f150b[l.a(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                q2.b bVar5 = this.f150b[l.a(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public b1 b() {
            throw null;
        }

        public void c(int i10, q2.b bVar) {
            if (this.f150b == null) {
                this.f150b = new q2.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f150b[l.a(i11)] = bVar;
                }
            }
        }

        public void d(q2.b bVar) {
        }

        public void e(q2.b bVar) {
            throw null;
        }

        public void f(q2.b bVar) {
        }

        public void g(q2.b bVar) {
            throw null;
        }

        public void h(q2.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f151h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f152i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f153j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f154k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f155l;
        public final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public q2.b[] f156d;

        /* renamed from: e  reason: collision with root package name */
        public q2.b f157e;

        /* renamed from: f  reason: collision with root package name */
        public b1 f158f;

        /* renamed from: g  reason: collision with root package name */
        public q2.b f159g;

        public f(b1 b1Var, WindowInsets windowInsets) {
            super(b1Var);
            this.f157e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private q2.b t(int i10, boolean z10) {
            q2.b bVar = q2.b.f16870e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = q2.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private q2.b v() {
            b1 b1Var = this.f158f;
            if (b1Var != null) {
                return b1Var.f140a.i();
            }
            return q2.b.f16870e;
        }

        private q2.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f151h) {
                    y();
                }
                Method method = f152i;
                if (method != null && f153j != null && f154k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f154k.get(f155l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return q2.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void y() {
            try {
                f152i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f153j = cls;
                f154k = cls.getDeclaredField("mVisibleInsets");
                f155l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f154k.setAccessible(true);
                f155l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f151h = true;
        }

        @Override // a3.b1.k
        public void d(View view) {
            q2.b w10 = w(view);
            if (w10 == null) {
                w10 = q2.b.f16870e;
            }
            z(w10);
        }

        @Override // a3.b1.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f159g, ((f) obj).f159g);
            }
            return false;
        }

        @Override // a3.b1.k
        public q2.b f(int i10) {
            return t(i10, false);
        }

        @Override // a3.b1.k
        public q2.b g(int i10) {
            return t(i10, true);
        }

        @Override // a3.b1.k
        public final q2.b k() {
            if (this.f157e == null) {
                WindowInsets windowInsets = this.c;
                this.f157e = q2.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f157e;
        }

        @Override // a3.b1.k
        public b1 m(int i10, int i11, int i12, int i13) {
            e bVar;
            b1 i14 = b1.i(null, this.c);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                bVar = new d(i14);
            } else if (i15 >= 29) {
                bVar = new c(i14);
            } else {
                bVar = new b(i14);
            }
            bVar.g(b1.g(k(), i10, i11, i12, i13));
            bVar.e(b1.g(i(), i10, i11, i12, i13));
            return bVar.b();
        }

        @Override // a3.b1.k
        public boolean o() {
            return this.c.isRound();
        }

        @Override // a3.b1.k
        @SuppressLint({"WrongConstant"})
        public boolean p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !x(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // a3.b1.k
        public void q(q2.b[] bVarArr) {
            this.f156d = bVarArr;
        }

        @Override // a3.b1.k
        public void r(b1 b1Var) {
            this.f158f = b1Var;
        }

        public q2.b u(int i10, boolean z10) {
            int i11;
            a3.h e10;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (i10 != 1) {
                q2.b bVar = null;
                if (i10 != 2) {
                    q2.b bVar2 = q2.b.f16870e;
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return bVar2;
                                    }
                                    b1 b1Var = this.f158f;
                                    if (b1Var != null) {
                                        e10 = b1Var.f140a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = e10.f185a;
                                        if (i16 >= 28) {
                                            i12 = h.a.d(displayCutout);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = h.a.f(displayCutout);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = h.a.e(displayCutout);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = h.a.c(displayCutout);
                                        }
                                        return q2.b.b(i12, i13, i14, i15);
                                    }
                                    return bVar2;
                                }
                                return l();
                            }
                            return h();
                        }
                        return j();
                    }
                    q2.b[] bVarArr = this.f156d;
                    if (bVarArr != null) {
                        bVar = bVarArr[l.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    q2.b k3 = k();
                    q2.b v3 = v();
                    int i17 = k3.f16873d;
                    if (i17 > v3.f16873d) {
                        return q2.b.b(0, 0, 0, i17);
                    }
                    q2.b bVar3 = this.f159g;
                    if (bVar3 != null && !bVar3.equals(bVar2) && (i11 = this.f159g.f16873d) > v3.f16873d) {
                        return q2.b.b(0, 0, 0, i11);
                    }
                    return bVar2;
                } else if (z10) {
                    q2.b v10 = v();
                    q2.b i18 = i();
                    return q2.b.b(Math.max(v10.f16871a, i18.f16871a), 0, Math.max(v10.c, i18.c), Math.max(v10.f16873d, i18.f16873d));
                } else {
                    q2.b k10 = k();
                    b1 b1Var2 = this.f158f;
                    if (b1Var2 != null) {
                        bVar = b1Var2.f140a.i();
                    }
                    int i19 = k10.f16873d;
                    if (bVar != null) {
                        i19 = Math.min(i19, bVar.f16873d);
                    }
                    return q2.b.b(k10.f16871a, 0, k10.c, i19);
                }
            } else if (z10) {
                return q2.b.b(0, Math.max(v().f16872b, k().f16872b), 0, 0);
            } else {
                return q2.b.b(0, k().f16872b, 0, 0);
            }
        }

        public boolean x(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !u(i10, false).equals(q2.b.f16870e);
        }

        public void z(q2.b bVar) {
            this.f159g = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public q2.b f160m;

        public g(b1 b1Var, WindowInsets windowInsets) {
            super(b1Var, windowInsets);
            this.f160m = null;
        }

        @Override // a3.b1.k
        public b1 b() {
            return b1.i(null, this.c.consumeStableInsets());
        }

        @Override // a3.b1.k
        public b1 c() {
            return b1.i(null, this.c.consumeSystemWindowInsets());
        }

        @Override // a3.b1.k
        public final q2.b i() {
            if (this.f160m == null) {
                WindowInsets windowInsets = this.c;
                this.f160m = q2.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f160m;
        }

        @Override // a3.b1.k
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override // a3.b1.k
        public void s(q2.b bVar) {
            this.f160m = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(b1 b1Var, WindowInsets windowInsets) {
            super(b1Var, windowInsets);
        }

        @Override // a3.b1.k
        public b1 a() {
            return b1.i(null, a3.g.f(this.c));
        }

        @Override // a3.b1.k
        public a3.h e() {
            DisplayCutout j2 = a3.f.j(this.c);
            if (j2 == null) {
                return null;
            }
            return new a3.h(j2);
        }

        @Override // a3.b1.f, a3.b1.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.c, hVar.c) && Objects.equals(this.f159g, hVar.f159g);
            }
            return false;
        }

        @Override // a3.b1.k
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public q2.b n;

        /* renamed from: o  reason: collision with root package name */
        public q2.b f161o;

        /* renamed from: p  reason: collision with root package name */
        public q2.b f162p;

        public i(b1 b1Var, WindowInsets windowInsets) {
            super(b1Var, windowInsets);
            this.n = null;
            this.f161o = null;
            this.f162p = null;
        }

        @Override // a3.b1.k
        public q2.b h() {
            Insets mandatorySystemGestureInsets;
            if (this.f161o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.f161o = q2.b.c(mandatorySystemGestureInsets);
            }
            return this.f161o;
        }

        @Override // a3.b1.k
        public q2.b j() {
            Insets systemGestureInsets;
            if (this.n == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.n = q2.b.c(systemGestureInsets);
            }
            return this.n;
        }

        @Override // a3.b1.k
        public q2.b l() {
            Insets tappableElementInsets;
            if (this.f162p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.f162p = q2.b.c(tappableElementInsets);
            }
            return this.f162p;
        }

        @Override // a3.b1.f, a3.b1.k
        public b1 m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.c.inset(i10, i11, i12, i13);
            return b1.i(null, inset);
        }

        @Override // a3.b1.g, a3.b1.k
        public void s(q2.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final b1 f163q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f163q = b1.i(null, windowInsets);
        }

        public j(b1 b1Var, WindowInsets windowInsets) {
            super(b1Var, windowInsets);
        }

        @Override // a3.b1.f, a3.b1.k
        public final void d(View view) {
        }

        @Override // a3.b1.f, a3.b1.k
        public q2.b f(int i10) {
            Insets insets;
            insets = this.c.getInsets(m.a(i10));
            return q2.b.c(insets);
        }

        @Override // a3.b1.f, a3.b1.k
        public q2.b g(int i10) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(m.a(i10));
            return q2.b.c(insetsIgnoringVisibility);
        }

        @Override // a3.b1.f, a3.b1.k
        public boolean p(int i10) {
            boolean isVisible;
            isVisible = this.c.isVisible(m.a(i10));
            return isVisible;
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final b1 f164b;

        /* renamed from: a  reason: collision with root package name */
        public final b1 f165a;

        static {
            e bVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                bVar = new d();
            } else if (i10 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f164b = bVar.b().f140a.a().f140a.b().f140a.c();
        }

        public k(b1 b1Var) {
            this.f165a = b1Var;
        }

        public b1 a() {
            return this.f165a;
        }

        public b1 b() {
            return this.f165a;
        }

        public b1 c() {
            return this.f165a;
        }

        public void d(View view) {
        }

        public a3.h e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (o() == kVar.o() && n() == kVar.n() && z2.b.a(k(), kVar.k()) && z2.b.a(i(), kVar.i()) && z2.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public q2.b f(int i10) {
            return q2.b.f16870e;
        }

        public q2.b g(int i10) {
            if ((i10 & 8) == 0) {
                return q2.b.f16870e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public q2.b h() {
            return k();
        }

        public int hashCode() {
            return z2.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
        }

        public q2.b i() {
            return q2.b.f16870e;
        }

        public q2.b j() {
            return k();
        }

        public q2.b k() {
            return q2.b.f16870e;
        }

        public q2.b l() {
            return k();
        }

        public b1 m(int i10, int i11, int i12, int i13) {
            return f164b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public boolean p(int i10) {
            return true;
        }

        public void q(q2.b[] bVarArr) {
        }

        public void r(b1 b1Var) {
        }

        public void s(q2.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 != 8) {
                    if (i10 == 16) {
                        return 4;
                    }
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                if (i10 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException(androidx.activity.e.g("type needs to be >= FIRST and <= LAST, type=", i10));
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f139b = Build.VERSION.SDK_INT >= 30 ? j.f163q : k.f164b;
    }

    public b1() {
        this.f140a = new k(this);
    }

    public b1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f140a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static q2.b g(q2.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f16871a - i10);
        int max2 = Math.max(0, bVar.f16872b - i11);
        int max3 = Math.max(0, bVar.c - i12);
        int max4 = Math.max(0, bVar.f16873d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : q2.b.b(max, max2, max3, max4);
    }

    public static b1 i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        b1 b1Var = new b1(windowInsets);
        if (view != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.b(view)) {
                b1 h10 = j0.h(view);
                k kVar = b1Var.f140a;
                kVar.r(h10);
                kVar.d(view.getRootView());
            }
        }
        return b1Var;
    }

    public final q2.b a(int i10) {
        return this.f140a.f(i10);
    }

    public final q2.b b(int i10) {
        return this.f140a.g(i10);
    }

    @Deprecated
    public final int c() {
        return this.f140a.k().f16873d;
    }

    @Deprecated
    public final int d() {
        return this.f140a.k().f16871a;
    }

    @Deprecated
    public final int e() {
        return this.f140a.k().c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        return z2.b.a(this.f140a, ((b1) obj).f140a);
    }

    @Deprecated
    public final int f() {
        return this.f140a.k().f16872b;
    }

    public final WindowInsets h() {
        k kVar = this.f140a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f140a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
