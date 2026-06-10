package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import d0.c;
import d0.d;
import d0.e;
import d0.g;
import g0.g0;
import g0.g1;
import g0.k0;
import g0.u0;
import ja.x;
import java.util.ArrayList;
import java.util.Map;
import m7.n;
import u.m;
import u0.f;
import v0.o;
import v0.r;

/* loaded from: classes.dex */
public final class a extends g implements u0 {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2171b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final g1<r> f2172d;

    /* renamed from: e  reason: collision with root package name */
    public final g1<c> f2173e;

    /* renamed from: f  reason: collision with root package name */
    public final e f2174f;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f2175g;

    /* renamed from: h  reason: collision with root package name */
    public final k0 f2176h;

    /* renamed from: i  reason: collision with root package name */
    public long f2177i;

    /* renamed from: j  reason: collision with root package name */
    public int f2178j;

    /* renamed from: k  reason: collision with root package name */
    public final u7.a<n> f2179k;

    public a() {
        throw null;
    }

    public a(boolean z10, float f10, g0 g0Var, g0 g0Var2, e eVar) {
        super(g0Var2, z10);
        this.f2171b = z10;
        this.c = f10;
        this.f2172d = g0Var;
        this.f2173e = g0Var2;
        this.f2174f = eVar;
        this.f2175g = a1.c.V0(null);
        this.f2176h = a1.c.V0(Boolean.TRUE);
        this.f2177i = f.f17736b;
        this.f2178j = -1;
        this.f2179k = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    @Override // g0.u0
    public final void a() {
    }

    @Override // g0.u0
    public final void b() {
        h();
    }

    @Override // g0.u0
    public final void c() {
        h();
    }

    @Override // s.n
    public final void d(x0.c cVar) {
        int a02;
        v7.g.f(cVar, "<this>");
        this.f2177i = cVar.a();
        float f10 = this.c;
        if (Float.isNaN(f10)) {
            a02 = m0.b.g1(d.a(cVar, this.f2171b, cVar.a()));
        } else {
            a02 = cVar.a0(f10);
        }
        this.f2178j = a02;
        long j2 = this.f2172d.getValue().f18135a;
        float f11 = this.f2173e.getValue().f10351d;
        cVar.o0();
        f(cVar, f10, j2);
        o b5 = cVar.N().b();
        ((Boolean) this.f2176h.getValue()).booleanValue();
        d0.f fVar = (d0.f) this.f2175g.getValue();
        if (fVar != null) {
            fVar.d(cVar.a(), this.f2178j, j2, f11);
            Canvas canvas = v0.d.f18088a;
            v7.g.f(b5, "<this>");
            fVar.draw(((v0.c) b5).f18085a);
        }
    }

    @Override // d0.g
    public final void e(m mVar, x xVar) {
        Object remove;
        v7.g.f(mVar, "interaction");
        v7.g.f(xVar, "scope");
        e eVar = this.f2174f;
        eVar.getClass();
        androidx.appcompat.widget.m mVar2 = eVar.f10356l;
        mVar2.getClass();
        d0.f fVar = (d0.f) ((Map) mVar2.f1027a).get(this);
        if (fVar == null) {
            ArrayList arrayList = eVar.f10355k;
            v7.g.f(arrayList, "<this>");
            if (arrayList.isEmpty()) {
                remove = null;
            } else {
                remove = arrayList.remove(0);
            }
            fVar = (d0.f) remove;
            Object obj = mVar2.f1028b;
            if (fVar == null) {
                int i10 = eVar.f10357m;
                ArrayList arrayList2 = eVar.f10354j;
                if (i10 > a1.c.B0(arrayList2)) {
                    Context context = eVar.getContext();
                    v7.g.e(context, "context");
                    fVar = new d0.f(context);
                    eVar.addView(fVar);
                    arrayList2.add(fVar);
                } else {
                    fVar = (d0.f) arrayList2.get(eVar.f10357m);
                    v7.g.f(fVar, "rippleHostView");
                    a aVar = (a) ((Map) obj).get(fVar);
                    if (aVar != null) {
                        aVar.f2175g.setValue(null);
                        mVar2.d(aVar);
                        fVar.b();
                    }
                }
                int i11 = eVar.f10357m;
                if (i11 < eVar.f10353i - 1) {
                    eVar.f10357m = i11 + 1;
                } else {
                    eVar.f10357m = 0;
                }
            }
            ((Map) mVar2.f1027a).put(this, fVar);
            ((Map) obj).put(fVar, this);
        }
        fVar.a(mVar, this.f2171b, this.f2177i, this.f2178j, this.f2172d.getValue().f18135a, this.f2173e.getValue().f10351d, this.f2179k);
        this.f2175g.setValue(fVar);
    }

    @Override // d0.g
    public final void g(m mVar) {
        v7.g.f(mVar, "interaction");
        d0.f fVar = (d0.f) this.f2175g.getValue();
        if (fVar != null) {
            fVar.c();
        }
    }

    public final void h() {
        e eVar = this.f2174f;
        eVar.getClass();
        this.f2175g.setValue(null);
        androidx.appcompat.widget.m mVar = eVar.f10356l;
        mVar.getClass();
        d0.f fVar = (d0.f) ((Map) mVar.f1027a).get(this);
        if (fVar != null) {
            fVar.b();
            mVar.d(this);
            eVar.f10355k.add(fVar);
        }
    }
}
