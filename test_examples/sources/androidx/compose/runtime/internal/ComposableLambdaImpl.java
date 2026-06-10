package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposerImpl;
import g0.d;
import g0.q0;
import g0.r0;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import u7.b;
import u7.c;
import u7.e;
import u7.f;
import u7.g;
import u7.h;
import u7.i;
import u7.j;
import u7.k;
import u7.m;
import u7.n;
import u7.p;
import u7.q;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.v;
import u7.w;
import v7.l;

/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements p, q, r, s, t, u, v, w, b, c, e, f, g, h, i, j, k, m, n {

    /* renamed from: i  reason: collision with root package name */
    public final int f2888i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2889j;

    /* renamed from: k  reason: collision with root package name */
    public Object f2890k;

    /* renamed from: l  reason: collision with root package name */
    public q0 f2891l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f2892m;

    public ComposableLambdaImpl(int i10, boolean z10) {
        this.f2888i = i10;
        this.f2889j = z10;
    }

    @Override // u7.t
    public final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return d(obj, obj2, obj3, obj4, (d) obj5, ((Number) obj6).intValue());
    }

    @Override // u7.q
    public final /* bridge */ /* synthetic */ Object O(Object obj, Object obj2, Object obj3) {
        return a(obj, (d) obj2, ((Number) obj3).intValue());
    }

    @Override // u7.p
    public final Object R(Object obj, Object obj2) {
        int R;
        d dVar = (d) obj;
        int intValue = ((Number) obj2).intValue();
        v7.g.f(dVar, "c");
        ComposerImpl p10 = dVar.p(this.f2888i);
        e(p10);
        if (p10.z(this)) {
            R = a1.c.R(2, 0);
        } else {
            R = a1.c.R(1, 0);
        }
        int i10 = intValue | R;
        Object obj3 = this.f2890k;
        v7.g.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        l.d(2, obj3);
        Object R2 = ((p) obj3).R(p10, Integer.valueOf(i10));
        r0 T = p10.T();
        if (T != null) {
            l.d(2, this);
            T.f11073d = this;
        }
        return R2;
    }

    @Override // u7.s
    public final /* bridge */ /* synthetic */ Object V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, (d) obj4, ((Number) obj5).intValue());
    }

    public final Object a(Object obj, d dVar, int i10) {
        int R;
        v7.g.f(dVar, "c");
        ComposerImpl p10 = dVar.p(this.f2888i);
        e(p10);
        if (p10.z(this)) {
            R = a1.c.R(2, 1);
        } else {
            R = a1.c.R(1, 1);
        }
        Object obj2 = this.f2890k;
        v7.g.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        l.d(3, obj2);
        Object O = ((q) obj2).O(obj, p10, Integer.valueOf(R | i10));
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new ComposableLambdaImpl$invoke$1(this, obj, i10);
        }
        return O;
    }

    public final Object b(Object obj, Object obj2, d dVar, int i10) {
        int R;
        v7.g.f(dVar, "c");
        ComposerImpl p10 = dVar.p(this.f2888i);
        e(p10);
        if (p10.z(this)) {
            R = a1.c.R(2, 2);
        } else {
            R = a1.c.R(1, 2);
        }
        Object obj3 = this.f2890k;
        v7.g.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        l.d(4, obj3);
        Object l02 = ((r) obj3).l0(obj, obj2, p10, Integer.valueOf(R | i10));
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new ComposableLambdaImpl$invoke$2(this, obj, obj2, i10);
        }
        return l02;
    }

    public final Object c(Object obj, Object obj2, Object obj3, d dVar, int i10) {
        int R;
        v7.g.f(dVar, "c");
        ComposerImpl p10 = dVar.p(this.f2888i);
        e(p10);
        if (p10.z(this)) {
            R = a1.c.R(2, 3);
        } else {
            R = a1.c.R(1, 3);
        }
        Object obj4 = this.f2890k;
        v7.g.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        l.d(5, obj4);
        Object V = ((s) obj4).V(obj, obj2, obj3, p10, Integer.valueOf(R | i10));
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i10);
        }
        return V;
    }

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, d dVar, int i10) {
        int R;
        v7.g.f(dVar, "c");
        ComposerImpl p10 = dVar.p(this.f2888i);
        e(p10);
        if (p10.z(this)) {
            R = a1.c.R(2, 4);
        } else {
            R = a1.c.R(1, 4);
        }
        Object obj5 = this.f2890k;
        v7.g.d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        l.d(6, obj5);
        Object E = ((t) obj5).E(obj, obj2, obj3, obj4, p10, Integer.valueOf(R | i10));
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new ComposableLambdaImpl$invoke$4(this, obj, obj2, obj3, obj4, i10);
        }
        return E;
    }

    public final void e(d dVar) {
        r0 b5;
        if (!this.f2889j || (b5 = dVar.b()) == null) {
            return;
        }
        dVar.A(b5);
        if (a1.c.m1(this.f2891l, b5)) {
            this.f2891l = b5;
            return;
        }
        ArrayList arrayList = this.f2892m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f2892m = arrayList;
        } else {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (a1.c.m1((q0) arrayList.get(i10), b5)) {
                    arrayList.set(i10, b5);
                    return;
                }
            }
        }
        arrayList.add(b5);
    }

    public final void f(Lambda lambda) {
        boolean z10;
        v7.g.f(lambda, "block");
        if (!v7.g.a(this.f2890k, lambda)) {
            if (this.f2890k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2890k = lambda;
            if (!z10 && this.f2889j) {
                q0 q0Var = this.f2891l;
                if (q0Var != null) {
                    q0Var.invalidate();
                    this.f2891l = null;
                }
                ArrayList arrayList = this.f2892m;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((q0) arrayList.get(i10)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    @Override // u7.r
    public final /* bridge */ /* synthetic */ Object l0(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (d) obj3, ((Number) obj4).intValue());
    }
}
