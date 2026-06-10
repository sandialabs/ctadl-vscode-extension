package com.google.android.material.behavior;

import a3.j0;
import a3.v0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import i3.c;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public i3.c f6830a;

    /* renamed from: b  reason: collision with root package name */
    public b f6831b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6832d;

    /* renamed from: e  reason: collision with root package name */
    public int f6833e = 2;

    /* renamed from: f  reason: collision with root package name */
    public final float f6834f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public float f6835g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f6836h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public final a f6837i = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0131c {

        /* renamed from: a  reason: collision with root package name */
        public int f6838a;

        /* renamed from: b  reason: collision with root package name */
        public int f6839b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            if (r0 != false) goto L12;
         */
        @Override // i3.c.AbstractC0131c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(View view, int i10) {
            boolean z10;
            int width;
            int width2;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = SwipeDismissBehavior.this.f6833e;
            if (i11 == 0) {
                if (z10) {
                    width = this.f6838a - view.getWidth();
                    width2 = this.f6838a;
                }
                width = this.f6838a;
                width2 = view.getWidth() + width;
            } else if (i11 != 1) {
                width = this.f6838a - view.getWidth();
                width2 = view.getWidth() + this.f6838a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // i3.c.AbstractC0131c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // i3.c.AbstractC0131c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // i3.c.AbstractC0131c
        public final void e(View view, int i10) {
            this.f6839b = i10;
            this.f6838a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f6832d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f6832d = false;
            }
        }

        @Override // i3.c.AbstractC0131c
        public final void f(int i10) {
            b bVar = SwipeDismissBehavior.this.f6831b;
            if (bVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((e) bVar).f7339a;
                if (i10 != 0) {
                    if (i10 == 1 || i10 == 2) {
                        g.b().d(baseTransientBottomBar.f7313u);
                        return;
                    }
                    return;
                }
                g b5 = g.b();
                BaseTransientBottomBar.c cVar = baseTransientBottomBar.f7313u;
                synchronized (b5.f7342a) {
                    if (b5.c(cVar)) {
                        g.c cVar2 = b5.c;
                        if (cVar2.c) {
                            cVar2.c = false;
                            b5.f(cVar2);
                        }
                    }
                }
            }
        }

        @Override // i3.c.AbstractC0131c
        public final void g(View view, int i10, int i11) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = view.getWidth() * swipeDismissBehavior.f6835g;
            float width2 = view.getWidth() * swipeDismissBehavior.f6836h;
            float abs = Math.abs(i10 - this.f6838a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f6838a) >= java.lang.Math.round(r9.getWidth() * r2.f6834f)) goto L9;
         */
        @Override // i3.c.AbstractC0131c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f10, float f11) {
            boolean z10;
            int i10;
            b bVar;
            boolean z11;
            this.f6839b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z12 = true;
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                if (j0.e.d(view) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = swipeDismissBehavior.f6833e;
                if (i12 != 2) {
                    if (i12 == 0) {
                        if (z11) {
                            if (f10 < 0.0f) {
                            }
                            z10 = false;
                        } else {
                            if (i11 > 0) {
                            }
                            z10 = false;
                        }
                    } else {
                        if (i12 == 1) {
                            if (z11) {
                                if (i11 > 0) {
                                }
                            } else if (f10 < 0.0f) {
                            }
                        }
                        z10 = false;
                    }
                }
                z10 = true;
            }
            if (z10) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i13 = this.f6838a;
                    if (left >= i13) {
                        i10 = i13 + width;
                    }
                }
                i10 = this.f6838a - width;
            } else {
                i10 = this.f6838a;
                z12 = false;
            }
            if (swipeDismissBehavior.f6830a.q(i10, view.getTop())) {
                c cVar = new c(view, z12);
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.d.m(view, cVar);
            } else if (z12 && (bVar = swipeDismissBehavior.f6831b) != null) {
                ((e) bVar).a(view);
            }
        }

        @Override // i3.c.AbstractC0131c
        public final boolean i(View view, int i10) {
            int i11 = this.f6839b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final View f6840i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f6841j;

        public c(View view, boolean z10) {
            this.f6840i = view;
            this.f6841j = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            i3.c cVar = swipeDismissBehavior.f6830a;
            View view = this.f6840i;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.m(view, this);
            } else if (this.f6841j && (bVar = swipeDismissBehavior.f6831b) != null) {
                ((e) bVar).a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10 = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        } else {
            z10 = coordinatorLayout.p(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f6830a == null) {
            this.f6830a = new i3.c(coordinatorLayout.getContext(), coordinatorLayout, this.f6837i);
        }
        if (!this.f6832d && this.f6830a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i10) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.d.c(v3) == 0) {
            j0.d.s(v3, 1);
            j0.m(v3, 1048576);
            j0.i(v3, 0);
            if (s(v3)) {
                j0.n(v3, g.a.f6366l, new com.google.android.material.behavior.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (this.f6830a != null) {
            if (this.f6832d && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.f6830a.k(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
