package com.noto.app.settings;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WrapContentModifier;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.lifecycle.v;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.NotoThemeKt;
import com.noto.app.settings.a;
import com.noto.app.util.ViewUtilsKt;
import d0.h;
import e0.r;
import g0.d;
import g0.h1;
import g0.r0;
import g0.t0;
import g0.v0;
import g0.z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import m7.e;
import m7.n;
import n7.i;
import q0.a;
import q0.b;
import q0.d;
import u.j;
import u.k;
import u1.g;
import u1.m;
import u7.q;
import v0.l;
import v0.p;
import v0.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/SettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SettingsFragment extends Fragment {

    /* renamed from: d0  reason: collision with root package name */
    public final e f9476d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new SettingsFragment$special$$inlined$viewModel$default$1(this));

    public static final void Z(SettingsFragment settingsFragment, d dVar, g0.d dVar2, int i10, int i11) {
        settingsFragment.getClass();
        ComposerImpl p10 = dVar2.p(1841822938);
        if ((i11 & 1) != 0) {
            dVar = d.a.f16824i;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SettingsSectionKt.a(dVar, null, null, a1.c.i0(p10, -2121433866, new SettingsFragment$AboutSection$1(settingsFragment)), p10, (i10 & 14) | 3072, 6);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new SettingsFragment$AboutSection$2(settingsFragment, dVar, i10, i11);
        }
    }

    public static final void a0(SettingsFragment settingsFragment, d dVar, g0.d dVar2, int i10, int i11) {
        settingsFragment.getClass();
        ComposerImpl p10 = dVar2.p(-967428270);
        if ((i11 & 1) != 0) {
            dVar = d.a.f16824i;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SettingsSectionKt.a(dVar, null, null, a1.c.i0(p10, -838754378, new SettingsFragment$ExportImportSection$1(settingsFragment)), p10, (i10 & 14) | 3072, 6);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new SettingsFragment$ExportImportSection$2(settingsFragment, dVar, i10, i11);
        }
    }

    public static final void b0(SettingsFragment settingsFragment, d dVar, g0.d dVar2, int i10, int i11) {
        settingsFragment.getClass();
        ComposerImpl p10 = dVar2.p(-1115580398);
        if ((i11 & 1) != 0) {
            dVar = d.a.f16824i;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        SettingsSectionKt.a(dVar, null, null, a1.c.i0(p10, 557687926, new SettingsFragment$MainSection$1(settingsFragment)), p10, (i10 & 14) | 3072, 6);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new SettingsFragment$MainSection$2(settingsFragment, dVar, i10, i11);
        }
    }

    public static final void c0(SettingsFragment settingsFragment, d dVar, g0.d dVar2, int i10, int i11) {
        settingsFragment.getClass();
        ComposerImpl p10 = dVar2.p(2102138227);
        if ((i11 & 1) != 0) {
            dVar = d.a.f16824i;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        int i12 = (i10 & 14) | 3072;
        d dVar3 = dVar;
        SettingsSectionKt.a(dVar3, null, null, a1.c.i0(p10, -2064155177, new SettingsFragment$ShareAndRateSection$1(m0.b.m1(R.string.share_with, p10), settingsFragment, m0.b.m1(R.string.invite_text, p10), m0.b.m1(R.string.open_with, p10))), p10, i12, 6);
        r0 T = p10.T();
        if (T != null) {
            T.f11073d = new SettingsFragment$ShareAndRateSection$2(settingsFragment, dVar, i10, i11);
        }
    }

    public static final void d0(SettingsFragment settingsFragment, d dVar, g0.d dVar2, int i10, int i11) {
        d.a aVar;
        long j2;
        WrapContentModifier a10;
        ColorFilter porterDuffColorFilter;
        settingsFragment.getClass();
        ComposerImpl p10 = dVar2.p(1317044292);
        int i12 = i11 & 1;
        d.a aVar2 = d.a.f16824i;
        if (i12 != 0) {
            aVar = aVar2;
        } else {
            aVar = dVar;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        p10.f(-492369756);
        Object a02 = p10.a0();
        d.a.C0120a c0120a = d.a.f11039a;
        if (a02 == c0120a) {
            a02 = new k();
            p10.I0(a02);
        }
        p10.Q(false);
        j jVar = (j) a02;
        long j10 = a.f9582a;
        d0.b a11 = h.a(0.0f, j10, p10, 384, 3);
        p10.f(-492369756);
        Object a03 = p10.a0();
        if (a03 == c0120a) {
            a03 = new g(i.Z1(new u1.d[]{p.a(R.font.pacifico, null, 0, 14)}));
            p10.I0(a03);
        }
        p10.Q(false);
        u1.e eVar = (u1.e) a03;
        p10.f(-492369756);
        Object a04 = p10.a0();
        if (a04 == c0120a) {
            if (Build.VERSION.SDK_INT >= 29) {
                j2 = j10;
                porterDuffColorFilter = l.f18122a.a(j2, 5);
            } else {
                j2 = j10;
                porterDuffColorFilter = new PorterDuffColorFilter(a1.c.I1(j2), a1.c.N1(5));
            }
            s sVar = new s(porterDuffColorFilter);
            p10.I0(sVar);
            a04 = sVar;
        } else {
            j2 = j10;
        }
        p10.Q(false);
        s sVar2 = (s) a04;
        q0.d c = ClickableKt.c(a1.c.Y(aVar, ((e0.l) p10.w(ShapesKt.f2400a)).f10555b), jVar, a11, false, null, new SettingsFragment$SupportNotoItem$1(settingsFragment), 28);
        p10.f(2054871046);
        h1 h1Var = NotoThemeKt.f7585h;
        p10.Q(false);
        q0.d c12 = a1.c.c1(c, ((n6.b) p10.w(h1Var)).c);
        FillModifier fillModifier = SizeKt.f1957a;
        b.C0211b c0211b = a.C0210a.f16815e;
        v7.g.f(c12, "<this>");
        if (v7.g.a(c0211b, c0211b)) {
            a10 = SizeKt.c;
        } else if (v7.g.a(c0211b, a.C0210a.f16814d)) {
            a10 = SizeKt.f1959d;
        } else {
            a10 = SizeKt.a(c0211b, false);
        }
        q0.d c10 = SizeKt.c(c12.Z(a10));
        b.C0019b c0019b = androidx.compose.foundation.layout.b.f2001e;
        p10.f(693286680);
        j1.q a12 = RowKt.a(c0019b, c0211b, p10);
        p10.f(-1323940314);
        b2.b bVar = (b2.b) p10.w(CompositionLocalsKt.f3703e);
        LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
        j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
        ComposeUiNode.f3400a.getClass();
        u7.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3402b;
        ComposableLambdaImpl a13 = androidx.compose.ui.layout.a.a(c10);
        if (p10.f2640a instanceof g0.c) {
            p10.r();
            if (p10.L) {
                p10.m(aVar3);
            } else {
                p10.n();
            }
            p10.f2661x = false;
            a1.c.s1(p10, a12, ComposeUiNode.Companion.f3404e);
            a1.c.s1(p10, bVar, ComposeUiNode.Companion.f3403d);
            a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
            a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
            p10.h();
            androidx.activity.e.o(0, a13, new v0(p10), p10, 2058660585, -678309503);
            ImageKt.a(m0.b.V0(R.drawable.ic_round_favorite_24, p10), m0.b.m1(R.string.support_noto, p10), SizeKt.d(aVar2, 32), null, null, 0.0f, sVar2, p10, 1573256, 56);
            p10.f(2054871046);
            p10.Q(false);
            a1.c.w(SizeKt.e(aVar2, ((n6.b) p10.w(h1Var)).f16107b), p10);
            q0.d dVar3 = aVar;
            TextKt.b(m0.b.m1(R.string.support_noto, p10), null, j2, 0L, null, null, eVar, 0L, null, null, 0L, 0, false, 0, null, p1.p.a(((r) p10.w(TypographyKt.f2598a)).f10582h, 0L, m.f17754m, null, 262139), p10, 1573248, 0, 32698);
            p10.Q(false);
            p10.Q(false);
            p10.Q(true);
            p10.Q(false);
            p10.Q(false);
            r0 T = p10.T();
            if (T != null) {
                T.f11073d = new SettingsFragment$SupportNotoItem$3(settingsFragment, dVar3, i10, i11);
                return;
            }
            return;
        }
        a1.c.L0();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        androidx.navigation.i d5;
        d0 a10;
        OnBackPressedDispatcher onBackPressedDispatcher;
        v7.g.f(layoutInflater, "inflater");
        Context j2 = j();
        if (j2 != null) {
            androidx.fragment.app.s c = c();
            if (c != null && (onBackPressedDispatcher = c.f417p) != null) {
                a1.b.j(onBackPressedDispatcher, null, new SettingsFragment$onCreateView$1$1(this), 3);
            }
            NavController g10 = ViewUtilsKt.g(this);
            if (g10 != null && (d5 = g10.d()) != null && (a10 = d5.a()) != null) {
                v c10 = a10.c("IsPasscodeValid");
                c10.d(r(), new a.C0074a(new SettingsFragment$onCreateView$1$2$1(this, c10)));
            }
            f7.c.f(this);
            ComposeView composeView = new ComposeView(j2);
            composeView.setTransitionGroup(true);
            composeView.setContent(a1.c.j0(-1721422130, new SettingsFragment$onCreateView$1$3$1(this), true));
            return composeView;
        }
        return null;
    }
}
