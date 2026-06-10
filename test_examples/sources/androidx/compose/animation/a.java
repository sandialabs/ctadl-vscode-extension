package androidx.compose.animation;

import a1.c;
import androidx.compose.animation.core.b;
import androidx.compose.runtime.ComposerKt;
import g0.d;
import g0.t0;
import g0.z0;
import m7.n;
import r.e;
import r.h;
import r.w;
import r.z;
import u7.q;
import v0.r;

/* loaded from: classes.dex */
public final class a {
    static {
        c.z1(0.0f, null, 7);
    }

    public static final e a(long j2, w wVar, d dVar) {
        dVar.f(-1942442407);
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar.f(-451899108);
        w0.c f10 = r.f(j2);
        dVar.f(1157296644);
        boolean z10 = dVar.z(f10);
        z<r, h> g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = ((ColorVectorConverterKt$ColorToVector$1) ColorVectorConverterKt.f1250a).U(r.f(j2));
            dVar.q(g10);
        }
        dVar.u();
        e a10 = b.a(new r(j2), (z) g10, wVar, "ColorAnimation", null, dVar, 576);
        dVar.u();
        dVar.u();
        return a10;
    }
}
