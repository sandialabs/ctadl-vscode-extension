package j1;

import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class b0 implements u {

    /* renamed from: i  reason: collision with root package name */
    public int f12640i;

    /* renamed from: j  reason: collision with root package name */
    public int f12641j;

    /* renamed from: k  reason: collision with root package name */
    public long f12642k = v8.b.f(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public long f12643l = PlaceableKt.f3324b;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0134a f12644a = new C0134a();

        /* renamed from: b  reason: collision with root package name */
        public static LayoutDirection f12645b = LayoutDirection.Ltr;
        public static int c;

        /* renamed from: d  reason: collision with root package name */
        public static h f12646d;

        /* renamed from: j1.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0134a extends a {
            public static final boolean i(C0134a c0134a, l1.q qVar) {
                c0134a.getClass();
                boolean z10 = false;
                if (qVar == null) {
                    a.f12646d = null;
                    return false;
                }
                boolean z11 = qVar.n;
                l1.q D0 = qVar.D0();
                if (D0 != null && D0.n) {
                    z10 = true;
                }
                if (z10) {
                    qVar.n = true;
                }
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = qVar.B0().K;
                if (!qVar.n && !qVar.f15759m) {
                    a.f12646d = qVar.z0();
                    return z11;
                }
                a.f12646d = null;
                return z11;
            }

            @Override // j1.b0.a
            public final LayoutDirection a() {
                return a.f12645b;
            }

            @Override // j1.b0.a
            public final int b() {
                return a.c;
            }
        }

        public static void c(a aVar, b0 b0Var, int i10, int i11) {
            aVar.getClass();
            v7.g.f(b0Var, "<this>");
            long g10 = ma.i.g(i10, i11);
            long h02 = b0Var.h0();
            b0Var.s0(ma.i.g(((int) (g10 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(g10)), 0.0f, null);
        }

        public static void d(b0 b0Var, long j2, float f10) {
            v7.g.f(b0Var, "$this$place");
            long h02 = b0Var.h0();
            b0Var.s0(ma.i.g(((int) (j2 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(j2)), f10, null);
        }

        public static /* synthetic */ void e(a aVar, b0 b0Var, long j2) {
            aVar.getClass();
            d(b0Var, j2, 0.0f);
        }

        public static void f(a aVar, b0 b0Var, int i10, int i11) {
            aVar.getClass();
            v7.g.f(b0Var, "<this>");
            long g10 = ma.i.g(i10, i11);
            if (aVar.a() != LayoutDirection.Ltr && aVar.b() != 0) {
                g10 = ma.i.g((aVar.b() - b0Var.f12640i) - ((int) (g10 >> 32)), b2.g.a(g10));
            }
            long h02 = b0Var.h0();
            b0Var.s0(ma.i.g(((int) (g10 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(g10)), 0.0f, null);
        }

        public static void g(a aVar, b0 b0Var, int i10, int i11) {
            u7.l<v0.u, m7.n> lVar = PlaceableKt.f3323a;
            aVar.getClass();
            v7.g.f(b0Var, "<this>");
            v7.g.f(lVar, "layerBlock");
            long g10 = ma.i.g(i10, i11);
            if (aVar.a() != LayoutDirection.Ltr && aVar.b() != 0) {
                g10 = ma.i.g((aVar.b() - b0Var.f12640i) - ((int) (g10 >> 32)), b2.g.a(g10));
            }
            long h02 = b0Var.h0();
            b0Var.s0(ma.i.g(((int) (g10 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(g10)), 0.0f, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void h(a aVar, b0 b0Var, int i10, int i11, u7.l lVar, int i12) {
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f3323a;
            }
            aVar.getClass();
            v7.g.f(b0Var, "<this>");
            v7.g.f(lVar, "layerBlock");
            long g10 = ma.i.g(i10, i11);
            long h02 = b0Var.h0();
            b0Var.s0(ma.i.g(((int) (g10 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(g10)), 0.0f, lVar);
        }

        public abstract LayoutDirection a();

        public abstract int b();
    }

    public final long h0() {
        int i10 = this.f12640i;
        long j2 = this.f12642k;
        return ma.i.g((i10 - ((int) (j2 >> 32))) / 2, (this.f12641j - b2.h.b(j2)) / 2);
    }

    public int n0() {
        return b2.h.b(this.f12642k);
    }

    public int q0() {
        return (int) (this.f12642k >> 32);
    }

    public abstract void s0(long j2, float f10, u7.l<? super v0.u, m7.n> lVar);

    public final void u0() {
        this.f12640i = a1.c.c0((int) (this.f12642k >> 32), b2.a.h(this.f12643l), b2.a.f(this.f12643l));
        this.f12641j = a1.c.c0(b2.h.b(this.f12642k), b2.a.g(this.f12643l), b2.a.e(this.f12643l));
    }

    public final void v0(long j2) {
        if (b2.h.a(this.f12642k, j2)) {
            return;
        }
        this.f12642k = j2;
        u0();
    }

    public final void w0(long j2) {
        if (b2.a.b(this.f12643l, j2)) {
            return;
        }
        this.f12643l = j2;
        u0();
    }
}
