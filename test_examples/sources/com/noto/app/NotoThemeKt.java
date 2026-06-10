package com.noto.app;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import com.noto.R;
import com.noto.app.domain.model.Theme;
import e0.c;
import e0.l;
import e0.r;
import g0.h1;
import g0.p0;
import g0.r0;
import g0.t0;
import g0.z0;
import m7.n;
import n6.b;
import n7.i;
import u1.d;
import u1.g;
import u1.m;
import u7.q;
import v0.p;
import z.f;

/* loaded from: classes.dex */
public final class NotoThemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final b f7579a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f7580b;
    public static final c c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f7581d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f7582e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f7583f;

    /* renamed from: g  reason: collision with root package name */
    public static final r f7584g;

    /* renamed from: h  reason: collision with root package name */
    public static final h1 f7585h;

    static {
        long j2 = v0.r.f18129b;
        long j10 = v0.r.c;
        f7580b = ColorSchemeKt.c(j2, j10, a1.c.k(4285558896L), j10, j10, j2, a1.c.k(4294440951L), j2, a1.c.k(4294440951L), j2, a1.c.k(4285558896L), 469245852);
        c = ColorSchemeKt.b(j10, j2, a1.c.k(4290624957L), j2, a1.c.k(4279374354L), j10, a1.c.k(4280163870L), j10, a1.c.k(4280163870L), j10, a1.c.k(4290624957L));
        f7581d = ColorSchemeKt.b(j10, j2, a1.c.k(4290624957L), j2, j2, j10, a1.c.k(4279374354L), j10, a1.c.k(4279374354L), j10, a1.c.k(4290624957L));
        f7582e = new l(f.a(4), f.a(8), f.a(16), f.a(24), f.a(32));
        m mVar = m.n;
        m mVar2 = m.f17755o;
        m mVar3 = m.f17756p;
        m mVar4 = m.f17757q;
        f7583f = new g(i.Z1(new d[]{p.a(R.font.nunito_regular, mVar, 0, 8), p.a(R.font.nunito_regular_italic, mVar, 1, 8), p.a(R.font.nunito_medium, mVar2, 0, 8), p.a(R.font.nunito_medium_italic, mVar2, 1, 8), p.a(R.font.nunito_semibold, mVar3, 0, 8), p.a(R.font.nunito_semibold_italic, mVar3, 1, 8), p.a(R.font.nunito_bold, mVar4, 0, 8), p.a(R.font.nunito_bold_italic, mVar4, 1, 8)}));
        f7584g = new r(0);
        f7585h = CompositionLocalKt.c(NotoThemeKt$LocalDimensions$1.f7586j);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Theme theme, u7.p<? super g0.d, ? super Integer, n> pVar, g0.d dVar, int i10) {
        int i11;
        r0 T;
        int i12;
        int i13;
        v7.g.f(theme, "theme");
        v7.g.f(pVar, "content");
        ComposerImpl p10 = dVar.p(-1407447945);
        if ((i10 & 14) == 0) {
            if (p10.z(theme)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (p10.z(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && p10.s()) {
            p10.e();
            T = p10.T();
            if (T == null) {
                T.f11073d = new NotoThemeKt$NotoTheme$2(theme, pVar, i10);
                return;
            }
            return;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        CompositionLocalKt.a(new p0[]{f7585h.b(f7579a)}, a1.c.i0(p10, 1321853239, new NotoThemeKt$NotoTheme$1(theme, pVar, i11)), p10, 56);
        T = p10.T();
        if (T == null) {
        }
    }
}
