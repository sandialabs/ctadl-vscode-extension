package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import b2.g;
import g0.d;
import g0.g0;
import g0.s;
import g0.t0;
import g0.z0;
import java.util.Map;
import m7.n;
import ma.i;
import r.d;
import r.e;
import r.j0;
import r.z;
import u0.f;
import u7.l;
import u7.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1364a = 0;

    static {
        Map<z<?, ?>, Float> map = j0.f16998a;
        int i10 = f.f17737d;
        a1.c.v(0.5f, 0.5f);
        int i11 = u0.c.f17723e;
        a1.c.s(0.5f, 0.5f);
        int i12 = g.c;
        i.g(1, 1);
    }

    public static final e a(Object obj, z zVar, d dVar, String str, l lVar, g0.d dVar2, int i10) {
        v7.g.f(zVar, "typeConverter");
        dVar2.f(-1994373980);
        d.a.C0120a c0120a = d.a.f11039a;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar2.f(-492369756);
        Object g10 = dVar2.g();
        if (g10 == c0120a) {
            g10 = new a(obj, zVar, null, str);
            dVar2.q(g10);
        }
        dVar2.u();
        a aVar = (a) g10;
        g0 l12 = a1.c.l1(lVar, dVar2);
        g0 l13 = a1.c.l1(dVar, dVar2);
        dVar2.f(-492369756);
        Object g11 = dVar2.g();
        if (g11 == c0120a) {
            g11 = a1.b.f(-1, null, 6);
            dVar2.q(g11);
        }
        dVar2.u();
        la.c cVar = (la.c) g11;
        s.d(new AnimateAsStateKt$animateValueAsState$2(cVar, obj), dVar2);
        s.c(cVar, new AnimateAsStateKt$animateValueAsState$3(cVar, aVar, l13, l12, null), dVar2);
        e<T, V> eVar = aVar.c;
        dVar2.u();
        return eVar;
    }
}
