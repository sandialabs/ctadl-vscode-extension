package g0;

import androidx.compose.runtime.ComposerKt;
import g0.d;
import ja.u0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final q f11077a = new q();

    public static final void a(Object obj, u7.l lVar, d dVar) {
        v7.g.f(lVar, "effect");
        dVar.f(-1371986847);
        u7.q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        dVar.f(1157296644);
        boolean z10 = dVar.z(obj);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            dVar.q(new o(lVar));
        }
        dVar.u();
        dVar.u();
    }

    public static final void b(Object obj, Object obj2, u7.p pVar, d dVar) {
        dVar.f(590241125);
        u7.q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        CoroutineContext k3 = dVar.k();
        dVar.f(511388516);
        boolean z10 = dVar.z(obj) | dVar.z(obj2);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            dVar.q(new a0(k3, pVar));
        }
        dVar.u();
        dVar.u();
    }

    public static final void c(Object obj, u7.p pVar, d dVar) {
        v7.g.f(pVar, "block");
        dVar.f(1179185413);
        u7.q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        CoroutineContext k3 = dVar.k();
        dVar.f(1157296644);
        boolean z10 = dVar.z(obj);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            dVar.q(new a0(k3, pVar));
        }
        dVar.u();
        dVar.u();
    }

    public static final void d(u7.a aVar, d dVar) {
        v7.g.f(aVar, "effect");
        dVar.f(-1288466761);
        u7.q<c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        dVar.B(aVar);
        dVar.u();
    }

    public static final kotlinx.coroutines.internal.e e(EmptyCoroutineContext emptyCoroutineContext, d dVar) {
        v7.g.f(emptyCoroutineContext, "coroutineContext");
        v7.g.f(dVar, "composer");
        u0.b bVar = u0.b.f12806i;
        CoroutineContext k3 = dVar.k();
        return a1.b.g(k3.m(new ja.w0((ja.u0) k3.a(bVar))).m(emptyCoroutineContext));
    }
}
