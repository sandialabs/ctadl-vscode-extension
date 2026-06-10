package androidx.compose.foundation.layout;

import a3.b1;
import a3.h;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.noto.R;
import g0.d;
import g0.s;
import java.util.Set;
import java.util.WeakHashMap;
import p0.w;
import v.j;
import v.l;
import v.u;
import v7.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: s  reason: collision with root package name */
    public static final WeakHashMap<View, c> f2010s;

    /* renamed from: a  reason: collision with root package name */
    public final v.a f2011a = a.a(4, "captionBar");

    /* renamed from: b  reason: collision with root package name */
    public final v.a f2012b;
    public final v.a c;

    /* renamed from: d  reason: collision with root package name */
    public final v.a f2013d;

    /* renamed from: e  reason: collision with root package name */
    public final v.a f2014e;

    /* renamed from: f  reason: collision with root package name */
    public final v.a f2015f;

    /* renamed from: g  reason: collision with root package name */
    public final v.a f2016g;

    /* renamed from: h  reason: collision with root package name */
    public final v.a f2017h;

    /* renamed from: i  reason: collision with root package name */
    public final v.a f2018i;

    /* renamed from: j  reason: collision with root package name */
    public final u f2019j;

    /* renamed from: k  reason: collision with root package name */
    public final u f2020k;

    /* renamed from: l  reason: collision with root package name */
    public final u f2021l;

    /* renamed from: m  reason: collision with root package name */
    public final u f2022m;
    public final u n;

    /* renamed from: o  reason: collision with root package name */
    public final u f2023o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2024p;

    /* renamed from: q  reason: collision with root package name */
    public int f2025q;

    /* renamed from: r  reason: collision with root package name */
    public final j f2026r;

    /* loaded from: classes.dex */
    public static final class a {
        public static final v.a a(int i10, String str) {
            WeakHashMap<View, c> weakHashMap = c.f2010s;
            return new v.a(str, i10);
        }

        public static final u b(int i10, String str) {
            WeakHashMap<View, c> weakHashMap = c.f2010s;
            return new u(new l(0, 0, 0, 0), str);
        }

        public static c c(d dVar) {
            c cVar;
            dVar.f(-1366542614);
            View view = (View) dVar.w(AndroidCompositionLocals_androidKt.f3659f);
            WeakHashMap<View, c> weakHashMap = c.f2010s;
            synchronized (weakHashMap) {
                c cVar2 = weakHashMap.get(view);
                if (cVar2 == null) {
                    cVar2 = new c(view);
                    weakHashMap.put(view, cVar2);
                }
                cVar = cVar2;
            }
            s.a(cVar, new WindowInsetsHolder$Companion$current$1(cVar, view), dVar);
            dVar.u();
            return cVar;
        }
    }

    static {
        new a();
        f2010s = new WeakHashMap<>();
    }

    public c(View view) {
        View view2;
        Object obj;
        v.a a10 = a.a(128, "displayCutout");
        this.f2012b = a10;
        v.a a11 = a.a(8, "ime");
        this.c = a11;
        v.a a12 = a.a(32, "mandatorySystemGestures");
        this.f2013d = a12;
        this.f2014e = a.a(2, "navigationBars");
        this.f2015f = a.a(1, "statusBars");
        v.a a13 = a.a(7, "systemBars");
        this.f2016g = a13;
        v.a a14 = a.a(16, "systemGestures");
        this.f2017h = a14;
        v.a a15 = a.a(64, "tappableElement");
        this.f2018i = a15;
        u uVar = new u(new l(0, 0, 0, 0), "waterfall");
        this.f2019j = uVar;
        a1.c.U1(a1.c.U1(a1.c.U1(a13, a11), a10), a1.c.U1(a1.c.U1(a1.c.U1(a15, a12), a14), uVar));
        this.f2020k = a.b(4, "captionBarIgnoringVisibility");
        this.f2021l = a.b(2, "navigationBarsIgnoringVisibility");
        this.f2022m = a.b(1, "statusBarsIgnoringVisibility");
        this.n = a.b(7, "systemBarsIgnoringVisibility");
        this.f2023o = a.b(64, "tappableElementIgnoringVisibility");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? obj : null;
        this.f2024p = bool != null ? bool.booleanValue() : true;
        this.f2026r = new j(this);
    }

    public final void a(b1 b1Var, int i10) {
        q2.b bVar;
        g.f(b1Var, "windowInsets");
        this.f2011a.f(b1Var, i10);
        this.c.f(b1Var, i10);
        this.f2012b.f(b1Var, i10);
        this.f2014e.f(b1Var, i10);
        this.f2015f.f(b1Var, i10);
        this.f2016g.f(b1Var, i10);
        this.f2017h.f(b1Var, i10);
        this.f2018i.f(b1Var, i10);
        this.f2013d.f(b1Var, i10);
        boolean z10 = true;
        if (i10 == 0) {
            u uVar = this.f2020k;
            q2.b b5 = b1Var.b(4);
            g.e(b5, "insets.getInsetsIgnoring…aptionBar()\n            )");
            uVar.f18081b.setValue(a1.c.M1(b5));
            u uVar2 = this.f2021l;
            q2.b b10 = b1Var.b(2);
            g.e(b10, "insets.getInsetsIgnoring…ationBars()\n            )");
            uVar2.f18081b.setValue(a1.c.M1(b10));
            u uVar3 = this.f2022m;
            q2.b b11 = b1Var.b(1);
            g.e(b11, "insets.getInsetsIgnoring…tatusBars()\n            )");
            uVar3.f18081b.setValue(a1.c.M1(b11));
            u uVar4 = this.n;
            q2.b b12 = b1Var.b(7);
            g.e(b12, "insets.getInsetsIgnoring…ystemBars()\n            )");
            uVar4.f18081b.setValue(a1.c.M1(b12));
            u uVar5 = this.f2023o;
            q2.b b13 = b1Var.b(64);
            g.e(b13, "insets.getInsetsIgnoring…leElement()\n            )");
            uVar5.f18081b.setValue(a1.c.M1(b13));
            h e10 = b1Var.f140a.e();
            if (e10 != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    bVar = q2.b.c(h.b.b(e10.f185a));
                } else {
                    bVar = q2.b.f16870e;
                }
                u uVar6 = this.f2019j;
                uVar6.f18081b.setValue(a1.c.M1(bVar));
            }
        }
        synchronized (SnapshotKt.c) {
            Set<w> set = SnapshotKt.f2945i.get().f16588g;
            if (set != null) {
                if (!set.isEmpty()) {
                }
            }
            z10 = false;
        }
        if (z10) {
            SnapshotKt.a();
        }
    }
}
