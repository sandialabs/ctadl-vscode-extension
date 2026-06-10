package a3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final e f169a;

    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f170a;

        /* renamed from: b  reason: collision with root package name */
        public final View f171b;

        public a(Window window, View view) {
            this.f170a = window;
            this.f171b = view;
        }

        @Override // a3.d1.e
        public final void a(int i10) {
            int i11;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 != 1) {
                        i11 = 2;
                        if (i12 != 2) {
                            if (i12 == 8) {
                                Window window = this.f170a;
                                ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                            }
                        }
                    } else {
                        i11 = 4;
                    }
                    g(i11);
                }
            }
        }

        @Override // a3.d1.e
        public final void e() {
            h(2048);
            g(4096);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
        @Override // a3.d1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void f(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    Window window = this.f170a;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 8) {
                                View view = this.f171b;
                                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                                    view = window.getCurrentFocus();
                                    if (view == null) {
                                        view = window.findViewById(16908290);
                                    }
                                    if (view != null && view.hasWindowFocus()) {
                                        view.post(new c1(view, 0));
                                    }
                                }
                                view.requestFocus();
                                if (view == null) {
                                }
                                if (view != null) {
                                    view.post(new c1(view, 0));
                                }
                            }
                        } else {
                            h(2);
                        }
                    } else {
                        h(4);
                        window.clearFlags(1024);
                    }
                }
            }
        }

        public final void g(int i10) {
            View decorView = this.f170a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public final void h(int i10) {
            View decorView = this.f170a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // a3.d1.e
        public final boolean b() {
            return (this.f170a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // a3.d1.e
        public final void d(boolean z10) {
            if (z10) {
                Window window = this.f170a;
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                g(8192);
                return;
            }
            h(8192);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // a3.d1.e
        public final void c(boolean z10) {
            if (z10) {
                Window window = this.f170a;
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                g(16);
                return;
            }
            h(16);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f172a;

        /* renamed from: b  reason: collision with root package name */
        public final Window f173b;

        public d(Window window) {
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            new p.h();
            this.f172a = insetsController;
            this.f173b = window;
        }

        @Override // a3.d1.e
        public final void a(int i10) {
            this.f172a.hide(i10);
        }

        @Override // a3.d1.e
        public final boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f172a.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // a3.d1.e
        public final void c(boolean z10) {
            WindowInsetsController windowInsetsController = this.f172a;
            Window window = this.f173b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // a3.d1.e
        public final void d(boolean z10) {
            WindowInsetsController windowInsetsController = this.f172a;
            Window window = this.f173b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // a3.d1.e
        public final void e() {
            this.f172a.setSystemBarsBehavior(2);
        }

        @Override // a3.d1.e
        public final void f(int i10) {
            Window window = this.f173b;
            if (window != null && (i10 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f172a.show(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void a(int i10) {
            throw null;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }

        public void e() {
            throw null;
        }

        public void f(int i10) {
            throw null;
        }
    }

    public d1(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f169a = new d(window);
        } else {
            this.f169a = i10 >= 26 ? new c(window, view) : i10 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public final void a(boolean z10) {
        this.f169a.d(z10);
    }
}
