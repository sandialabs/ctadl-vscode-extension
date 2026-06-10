package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import g0.d;
import g0.h1;
import g0.p0;
import g0.r;
import g0.t0;
import g0.z0;
import m7.n;
import q0.d;
import u.j;
import u.k;
import u7.q;
import v0.c0;
import v0.h0;
import v7.g;

/* loaded from: classes.dex */
public final class SurfaceKt {

    /* renamed from: a  reason: collision with root package name */
    public static final r f2510a = CompositionLocalKt.b(SurfaceKt$LocalAbsoluteTonalElevation$1.f2511j);

    public static final void a(q0.d dVar, h0 h0Var, long j2, long j10, float f10, ComposableLambdaImpl composableLambdaImpl, g0.d dVar2, int i10, int i11) {
        d.a aVar;
        c0.a aVar2;
        long j11;
        long j12;
        float f11;
        float f12;
        dVar2.f(-513881741);
        if ((i11 & 1) != 0) {
            aVar = d.a.f16824i;
        } else {
            aVar = dVar;
        }
        if ((i11 & 2) != 0) {
            aVar2 = c0.f18087a;
        } else {
            aVar2 = h0Var;
        }
        if ((i11 & 4) != 0) {
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            j11 = ((e0.c) dVar2.w(ColorSchemeKt.f2278a)).u();
        } else {
            j11 = j2;
        }
        if ((i11 & 8) != 0) {
            j12 = ColorSchemeKt.a(j11, dVar2);
        } else {
            j12 = j10;
        }
        if ((i11 & 16) != 0) {
            f11 = 0;
        } else {
            f11 = 0.0f;
        }
        if ((i11 & 32) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        q<g0.c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
        r rVar = f2510a;
        float f13 = f11 + ((b2.d) dVar2.w(rVar)).f6339i;
        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new v0.r(j12)), rVar.b(new b2.d(f13))}, a1.c.i0(dVar2, -70914509, new SurfaceKt$Surface$1(aVar, aVar2, j11, f13, i10, f12, composableLambdaImpl)), dVar2, 56);
        dVar2.u();
    }

    public static final void b(boolean z10, u7.a aVar, q0.d dVar, boolean z11, long j2, ComposableLambdaImpl composableLambdaImpl, g0.d dVar2, int i10) {
        g.f(aVar, "onClick");
        dVar2.f(540296512);
        c0.a aVar2 = c0.f18087a;
        long a10 = ColorSchemeKt.a(j2, dVar2);
        float f10 = 0;
        float f11 = 0;
        dVar2.f(-492369756);
        Object g10 = dVar2.g();
        if (g10 == d.a.f11039a) {
            g10 = new k();
            dVar2.q(g10);
        }
        dVar2.u();
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        r rVar = f2510a;
        float f12 = f10 + ((b2.d) dVar2.w(rVar)).f6339i;
        CompositionLocalKt.a(new p0[]{ContentColorKt.f2305a.b(new v0.r(a10)), rVar.b(new b2.d(f12))}, a1.c.i0(dVar2, -1164547968, new SurfaceKt$Surface$5(dVar, aVar2, j2, f12, i10, f11, z10, (j) g10, z11, aVar, composableLambdaImpl)), dVar2, 56);
        dVar2.u();
    }

    public static final q0.d c(q0.d dVar, h0 h0Var, long j2, float f10) {
        return a1.c.Y(a1.c.P(androidx.compose.ui.draw.b.a(dVar, f10, h0Var, 24).Z(d.a.f16824i), j2, h0Var), h0Var);
    }

    public static final long d(long j2, float f10, g0.d dVar) {
        dVar.f(-2079918090);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        h1 h1Var = ColorSchemeKt.f2278a;
        if (v0.r.c(j2, ((e0.c) dVar.w(h1Var)).u())) {
            j2 = ColorSchemeKt.d((e0.c) dVar.w(h1Var), f10);
        }
        dVar.u();
        return j2;
    }
}
