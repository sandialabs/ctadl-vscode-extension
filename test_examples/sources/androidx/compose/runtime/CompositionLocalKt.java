package androidx.compose.runtime;

import g0.h1;
import g0.j1;
import g0.p0;
import g0.r;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import u7.p;
import u7.q;

/* loaded from: classes.dex */
public final class CompositionLocalKt {
    public static final void a(p0<?>[] p0VarArr, p<? super g0.d, ? super Integer, n> pVar, g0.d dVar, int i10) {
        v7.g.f(p0VarArr, "values");
        v7.g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(-1390796515);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        p10.x0(p0VarArr);
        pVar.R(p10, Integer.valueOf((i10 >> 3) & 14));
        p10.S();
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new CompositionLocalKt$CompositionLocalProvider$1(p0VarArr, pVar, i10);
        }
    }

    public static r b(u7.a aVar) {
        j1 j1Var = j1.f11059a;
        v7.g.f(aVar, "defaultFactory");
        return new r(j1Var, aVar);
    }

    public static final h1 c(u7.a aVar) {
        v7.g.f(aVar, "defaultFactory");
        return new h1(aVar);
    }
}
