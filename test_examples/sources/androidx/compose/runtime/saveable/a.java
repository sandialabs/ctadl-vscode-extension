package androidx.compose.runtime.saveable;

import a1.b;
import androidx.compose.runtime.ComposerKt;
import g0.c;
import g0.d;
import g0.o;
import g0.s;
import g0.t0;
import g0.z0;
import java.util.Arrays;
import m7.n;
import o0.f;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final Object a(Object[] objArr, f fVar, u7.a aVar, d dVar) {
        Object c;
        dVar.f(441892779);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar.f(1059366469);
        int t10 = dVar.t();
        b.v(36);
        String num = Integer.toString(t10, 36);
        g.e(num, "toString(this, checkRadix(radix))");
        dVar.u();
        g.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        o0.c cVar = (o0.c) dVar.w(SaveableStateRegistryKt.f2916a);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        dVar.f(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= dVar.z(obj);
        }
        Object g10 = dVar.g();
        Object obj2 = d.a.f11039a;
        if (z10 || g10 == obj2) {
            if (cVar != null && (c = cVar.c(num)) != null) {
                g10 = fVar.f16183b.U(c);
            } else {
                g10 = null;
            }
            if (g10 == null) {
                g10 = aVar.k0();
            }
            dVar.q(g10);
        }
        dVar.u();
        if (cVar != null) {
            RememberSaveableKt$rememberSaveable$1 rememberSaveableKt$rememberSaveable$1 = new RememberSaveableKt$rememberSaveable$1(cVar, num, a1.c.l1(fVar, dVar), a1.c.l1(g10, dVar));
            g0.q qVar2 = s.f11077a;
            dVar.f(1429097729);
            q<c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
            dVar.f(511388516);
            boolean z11 = dVar.z(cVar) | dVar.z(num);
            Object g11 = dVar.g();
            if (z11 || g11 == obj2) {
                dVar.q(new o(rememberSaveableKt$rememberSaveable$1));
            }
            dVar.u();
            dVar.u();
        }
        q<c<?>, z0, t0, n> qVar4 = ComposerKt.f2737a;
        dVar.u();
        return g10;
    }
}
