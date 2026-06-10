package com.noto.app.settings;

import androidx.lifecycle.i0;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import ja.k1;
import ja.x;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;
import u6.d;
import u6.e;
import v7.g;

/* loaded from: classes.dex */
public final class c extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f9659d;

    /* renamed from: e  reason: collision with root package name */
    public final d f9660e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.b f9661f;

    /* renamed from: g  reason: collision with root package name */
    public final u6.c f9662g;

    /* renamed from: h  reason: collision with root package name */
    public final e f9663h;

    /* renamed from: i  reason: collision with root package name */
    public final m f9664i;

    /* renamed from: j  reason: collision with root package name */
    public final m f9665j;

    /* renamed from: k  reason: collision with root package name */
    public final m f9666k;

    /* renamed from: l  reason: collision with root package name */
    public final m f9667l;

    /* renamed from: m  reason: collision with root package name */
    public final m f9668m;
    public final m n;

    /* renamed from: o  reason: collision with root package name */
    public final m f9669o;

    /* renamed from: p  reason: collision with root package name */
    public final m f9670p;

    /* renamed from: q  reason: collision with root package name */
    public final m f9671q;

    /* renamed from: r  reason: collision with root package name */
    public final m f9672r;

    /* renamed from: s  reason: collision with root package name */
    public final m f9673s;

    /* renamed from: t  reason: collision with root package name */
    public final m f9674t;

    /* renamed from: u  reason: collision with root package name */
    public final m f9675u;

    /* renamed from: v  reason: collision with root package name */
    public final m f9676v;

    /* renamed from: w  reason: collision with root package name */
    public final p f9677w;

    /* renamed from: x  reason: collision with root package name */
    public final m f9678x;

    /* renamed from: y  reason: collision with root package name */
    public final m f9679y;

    /* renamed from: z  reason: collision with root package name */
    public FolderIdType f9680z;

    public c(u6.a aVar, d dVar, u6.b bVar, u6.c cVar, e eVar) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(bVar, "labelRepository");
        g.f(cVar, "noteLabelRepository");
        g.f(eVar, "settingsRepository");
        this.f9659d = aVar;
        this.f9660e = dVar;
        this.f9661f = bVar;
        this.f9662g = cVar;
        this.f9663h = eVar;
        kotlinx.coroutines.flow.b<Theme> k02 = eVar.k0();
        x d02 = a1.b.d0(this);
        StartedLazily startedLazily = s.a.f15450b;
        this.f9664i = a1.b.C0(k02, d02, startedLazily, Theme.System);
        this.f9665j = a1.b.C0(eVar.h(), a1.b.d0(this), startedLazily, Font.Nunito);
        this.f9666k = a1.b.C0(eVar.h0(), a1.b.d0(this), startedLazily, Language.System);
        kotlinx.coroutines.flow.b<Icon> icon = eVar.getIcon();
        x d03 = a1.b.d0(this);
        t tVar = s.a.f15449a;
        this.f9667l = a1.b.C0(icon, d03, tVar, Icon.Futuristic);
        kotlinx.coroutines.flow.b<Boolean> z10 = eVar.z();
        x d04 = a1.b.d0(this);
        Boolean bool = Boolean.TRUE;
        this.f9668m = a1.b.C0(z10, d04, startedLazily, bool);
        kotlinx.coroutines.flow.b<Boolean> p10 = eVar.p();
        x d05 = a1.b.d0(this);
        Boolean bool2 = Boolean.FALSE;
        this.n = a1.b.C0(p10, d05, startedLazily, bool2);
        this.f9669o = a1.b.C0(eVar.Q(), a1.b.d0(this), startedLazily, bool);
        this.f9670p = a1.b.C0(eVar.g(), a1.b.d0(this), startedLazily, bool);
        this.f9671q = a1.b.C0(eVar.M(), a1.b.d0(this), tVar, ScreenBrightnessLevel.System);
        this.f9672r = a1.b.C0(eVar.j0(), a1.b.d0(this), tVar, null);
        this.f9673s = a1.b.C0(eVar.u(), a1.b.d0(this), startedLazily, VaultTimeout.Immediately);
        this.f9674t = a1.b.C0(eVar.c0(), a1.b.d0(this), tVar, bool2);
        this.f9675u = a1.b.C0(eVar.e0(), a1.b.d0(this), tVar, -1L);
        this.f9676v = a1.b.C0(eVar.P(), a1.b.d0(this), tVar, bool);
        this.f9677w = kotlinx.coroutines.flow.e.b(Integer.MAX_VALUE, 0, null, 6);
        this.f9678x = a1.b.C0(eVar.K(), a1.b.d0(this), tVar, -1L);
        this.f9679y = a1.b.C0(eVar.x(), a1.b.d0(this), tVar, bool2);
        this.f9680z = FolderIdType.MainInterface;
    }

    public final k1 d() {
        return m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$disableVault$1(this, null), 3);
    }

    public final void e(long j2) {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$setMainInterfaceId$1(this, j2, null), 3);
    }

    public final void f(long j2) {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$setQuickNoteFolderId$1(this, j2, null), 3);
    }

    public final k1 g(String str) {
        return m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$setVaultPasscode$1(this, str, null), 3);
    }

    public final void h(VaultTimeout vaultTimeout) {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$setVaultTimeout$1(this, vaultTimeout, null), 3);
    }

    public final void i() {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$toggleDoNotDisturb$1(this, null), 3);
    }

    public final void j() {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$toggleIsBioAuthEnabled$1(this, null), 3);
    }

    public final void k() {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$toggleQuickExit$1(this, null), 3);
    }

    public final void l() {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$toggleRememberScrollingPosition$1(this, null), 3);
    }

    public final void m() {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$toggleShowNotesCount$1(this, null), 3);
    }

    public final void n(Font font) {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$updateFont$1(this, font, null), 3);
    }

    public final void o(Icon icon) {
        g.f(icon, "value");
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$updateIcon$1(this, icon, null), 3);
    }

    public final void p(Language language) {
        g.f(language, "value");
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$updateLanguage$1(this, language, null), 3);
    }

    public final k1 q() {
        return m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$updateLastVersion$1(this, null), 3);
    }

    public final void r(Theme theme) {
        m0.b.M0(a1.b.d0(this), null, null, new SettingsViewModel$updateTheme$1(this, theme, null), 3);
    }
}
