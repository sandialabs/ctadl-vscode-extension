package com.noto.app.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.fragment.app.Fragment;
import com.noto.app.NotoThemeKt;
import com.noto.app.domain.model.Theme;
import g0.c;
import g0.d;
import g0.g0;
import g0.k;
import g0.r0;
import g0.s;
import g0.t0;
import g0.z0;
import ja.x;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import m7.n;
import q0.a;
import q0.b;
import q0.d;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

/* loaded from: classes.dex */
public final class ScreenKt {
    public static final void a(Fragment fragment, String str, d dVar, a<n> aVar, p<? super g0.d, ? super Integer, n> pVar, b.k kVar, a.b bVar, q<? super v.d, ? super g0.d, ? super Integer, n> qVar, g0.d dVar2, int i10, int i11) {
        ScreenKt$Screen$1 screenKt$Screen$1;
        int i12;
        b.h hVar;
        g.f(fragment, "<this>");
        g.f(str, "title");
        g.f(qVar, "content");
        ComposerImpl p10 = dVar2.p(-472232387);
        d.a aVar2 = (i11 & 2) != 0 ? d.a.f16824i : dVar;
        if ((i11 & 4) != 0) {
            i12 = i10 & (-7169);
            screenKt$Screen$1 = new ScreenKt$Screen$1(fragment);
        } else {
            screenKt$Screen$1 = aVar;
            i12 = i10;
        }
        ComposableLambdaImpl composableLambdaImpl = (i11 & 8) != 0 ? ComposableSingletons$ScreenKt.f7621a : pVar;
        if ((i11 & 16) != 0) {
            b.i iVar = b.f1998a;
            p10.f(2054871046);
            q<c<?>, z0, t0, n> qVar2 = ComposerKt.f2737a;
            p10.Q(false);
            i12 &= -458753;
            hVar = b.g(((n6.b) p10.w(NotoThemeKt.f7585h)).c);
        } else {
            hVar = kVar;
        }
        int i13 = i12;
        b.a aVar3 = (i11 & 32) != 0 ? a.C0210a.f16817g : bVar;
        q<c<?>, z0, t0, n> qVar3 = ComposerKt.f2737a;
        ScrollState b5 = androidx.compose.foundation.a.b(p10);
        g0 f02 = a1.c.f0(((com.noto.app.settings.c) kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ScreenKt$Screen$$inlined$viewModel$default$1(fragment)).getValue()).f9664i, p10);
        p10.f(773894976);
        p10.f(-492369756);
        Object a02 = p10.a0();
        if (a02 == d.a.f11039a) {
            k kVar2 = new k(s.e(EmptyCoroutineContext.f13021i, p10));
            p10.I0(kVar2);
            a02 = kVar2;
        }
        p10.Q(false);
        x xVar = ((k) a02).f11060a;
        p10.Q(false);
        NotoThemeKt.a((Theme) f02.getValue(), a1.c.i0(p10, -646130082, new ScreenKt$Screen$2(composableLambdaImpl, i13, str, b5, screenKt$Screen$1, xVar, aVar2, hVar, aVar3, qVar)), p10, 48);
        r0 T = p10.T();
        if (T == null) {
            return;
        }
        T.f11073d = new ScreenKt$Screen$3(fragment, str, aVar2, screenKt$Screen$1, composableLambdaImpl, hVar, aVar3, qVar, i10, i11);
    }
}
