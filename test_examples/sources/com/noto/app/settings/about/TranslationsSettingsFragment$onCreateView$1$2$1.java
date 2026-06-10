package com.noto.app.settings.about;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import com.noto.app.domain.model.Language;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.SettingsSectionKt;
import com.noto.app.settings.b;
import com.noto.app.util.ModelUtilsKt;
import g0.c;
import g0.d;
import g0.h1;
import g0.p0;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import o6.e;
import u7.a;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TranslationsSettingsFragment$onCreateView$1$2$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TranslationsSettingsFragment f9627j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ TranslationsSettingsFragment f9628j;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00821 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9629j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00831 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9630j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00831(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9630j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = b.m1(R.string.arabic_proofreader, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9630j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    if (z10 || g10 == d.a.f11039a) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$1$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, e.f16364f, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00821(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9629j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.arabic, dVar2), m0.b.V0(R.drawable.ic_saudi_arabia, dVar2), a1.c.i0(dVar2, 1824056318, new C00831(this.f9629j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass2 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9632j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00841 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9633j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00841(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9633j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.turkish_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9633j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    Object obj = d.a.f11039a;
                    if (z10 || g10 == obj) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$2$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    e eVar = e.f16364f;
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    String m13 = m0.b.m1(R.string.turkish_proofreader, dVar3);
                    dVar3.f(1157296644);
                    boolean z11 = dVar3.z(translationsSettingsFragment);
                    Object g11 = dVar3.g();
                    if (z11 || g11 == obj) {
                        g11 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$2$1$2$1(translationsSettingsFragment);
                        dVar3.q(g11);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m13, aVar, (a) g11, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9632j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.turkish, dVar2), m0.b.V0(R.drawable.ic_turkey, dVar2), a1.c.i0(dVar2, -1807984075, new C00841(this.f9632j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9636j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$3$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00851 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9637j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00851(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9637j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.spanish_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9637j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    if (z10 || g10 == d.a.f11039a) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$3$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, e.f16364f, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9636j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.spanish, dVar2), m0.b.V0(R.drawable.ic_spain, dVar2), a1.c.i0(dVar2, -495495497, new C00851(this.f9636j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$4  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass4 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9639j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$4$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00861 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9640j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00861(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9640j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.french_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9640j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    Object obj = d.a.f11039a;
                    if (z10 || g10 == obj) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$4$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    e eVar = e.f16364f;
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    String m13 = m0.b.m1(R.string.french_translator2, dVar3);
                    dVar3.f(1157296644);
                    boolean z11 = dVar3.z(translationsSettingsFragment);
                    Object g11 = dVar3.g();
                    if (z11 || g11 == obj) {
                        g11 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$4$1$2$1(translationsSettingsFragment);
                        dVar3.q(g11);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m13, aVar, (a) g11, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9639j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.french, dVar2), m0.b.V0(R.drawable.ic_france, dVar2), a1.c.i0(dVar2, -1986734856, new C00861(this.f9639j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$5  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass5 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9643j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$5$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00871 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9644j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00871(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9644j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.italian_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9644j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    Object obj = d.a.f11039a;
                    if (z10 || g10 == obj) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$5$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    e eVar = e.f16364f;
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    String m13 = m0.b.m1(R.string.italian_translator2, dVar3);
                    dVar3.f(1157296644);
                    boolean z11 = dVar3.z(translationsSettingsFragment);
                    Object g11 = dVar3.g();
                    if (z11 || g11 == obj) {
                        g11 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$5$1$2$1(translationsSettingsFragment);
                        dVar3.q(g11);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m13, aVar, (a) g11, null, 0L, eVar, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9643j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.italian, dVar2), m0.b.V0(R.drawable.ic_italy, dVar2), a1.c.i0(dVar2, 816993081, new C00871(this.f9643j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$6  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass6 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9647j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$6$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00881 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9648j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00881(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9648j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.czech_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9648j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    if (z10 || g10 == d.a.f11039a) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$6$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, e.f16364f, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9647j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.czech, dVar2), m0.b.V0(R.drawable.ic_czech, dVar2), a1.c.i0(dVar2, -674246278, new C00881(this.f9647j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$7  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass7 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9650j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$7$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00891 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9651j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00891(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9651j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.lithuanian_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9651j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    if (z10 || g10 == d.a.f11039a) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$7$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, e.f16364f, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9650j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.lithuanian, dVar2), m0.b.V0(R.drawable.ic_lithuania, dVar2), a1.c.i0(dVar2, 2129481659, new C00891(this.f9650j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$8  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass8 extends Lambda implements p<d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ TranslationsSettingsFragment f9653j;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.about.TranslationsSettingsFragment$onCreateView$1$2$1$1$8$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00901 extends Lambda implements q<v.d, d, Integer, n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ TranslationsSettingsFragment f9654j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00901(TranslationsSettingsFragment translationsSettingsFragment) {
                    super(3);
                    this.f9654j = translationsSettingsFragment;
                }

                @Override // u7.q
                public final n O(v.d dVar, d dVar2, Integer num) {
                    d dVar3 = dVar2;
                    int intValue = num.intValue();
                    g.f(dVar, "$this$SettingsSection");
                    if ((intValue & 81) == 16 && dVar3.s()) {
                        dVar3.e();
                        return n.f16010a;
                    }
                    q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                    String m12 = m0.b.m1(R.string.simplified_chinese_translator, dVar3);
                    b.a aVar = b.a.f9656a;
                    dVar3.f(1157296644);
                    TranslationsSettingsFragment translationsSettingsFragment = this.f9654j;
                    boolean z10 = dVar3.z(translationsSettingsFragment);
                    Object g10 = dVar3.g();
                    if (z10 || g10 == d.a.f11039a) {
                        g10 = new TranslationsSettingsFragment$onCreateView$1$2$1$1$8$1$1$1(translationsSettingsFragment);
                        dVar3.q(g10);
                    }
                    dVar3.u();
                    SettingsItemKt.a(m12, aVar, (a) g10, null, 0L, e.f16364f, 0L, null, dVar3, 196656, 216);
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(TranslationsSettingsFragment translationsSettingsFragment) {
                super(2);
                this.f9653j = translationsSettingsFragment;
            }

            @Override // u7.p
            public final n R(d dVar, Integer num) {
                d dVar2 = dVar;
                if ((num.intValue() & 11) == 2 && dVar2.s()) {
                    dVar2.e();
                    return n.f16010a;
                }
                q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                SettingsSectionKt.a(null, m0.b.m1(R.string.simplified_chinese, dVar2), m0.b.V0(R.drawable.ic_china, dVar2), a1.c.i0(dVar2, 638242300, new C00901(this.f9653j)), dVar2, 3584, 1);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TranslationsSettingsFragment translationsSettingsFragment) {
            super(3);
            this.f9628j = translationsSettingsFragment;
        }

        @Override // u7.q
        public final n O(v.d dVar, d dVar2, Integer num) {
            d dVar3 = dVar2;
            int intValue = num.intValue();
            g.f(dVar, "$this$Screen");
            if ((intValue & 81) == 16 && dVar3.s()) {
                dVar3.e();
                return n.f16010a;
            }
            q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            h1 h1Var = AndroidCompositionLocals_androidKt.f3656b;
            p0[] p0VarArr = {h1Var.b(ModelUtilsKt.G(Language.Arabic, dVar3))};
            TranslationsSettingsFragment translationsSettingsFragment = this.f9628j;
            CompositionLocalKt.a(p0VarArr, a1.c.i0(dVar3, 1961260954, new C00821(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.Turkish, dVar3))}, a1.c.i0(dVar3, 1196652241, new AnonymousClass2(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.German, dVar3))}, ComposableSingletons$TranslationsSettingsFragmentKt.f9616b, dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.Spanish, dVar3))}, a1.c.i0(dVar3, -1785826477, new AnonymousClass3(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.French, dVar3))}, a1.c.i0(dVar3, 1017901460, new AnonymousClass4(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.Italian, dVar3))}, a1.c.i0(dVar3, -473337899, new AnonymousClass5(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.Czech, dVar3))}, a1.c.i0(dVar3, -1964577258, new AnonymousClass6(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.Lithuanian, dVar3))}, a1.c.i0(dVar3, 839150679, new AnonymousClass7(translationsSettingsFragment)), dVar3, 56);
            CompositionLocalKt.a(new p0[]{h1Var.b(ModelUtilsKt.G(Language.SimplifiedChinese, dVar3))}, a1.c.i0(dVar3, -652088680, new AnonymousClass8(translationsSettingsFragment)), dVar3, 56);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationsSettingsFragment$onCreateView$1$2$1(TranslationsSettingsFragment translationsSettingsFragment) {
        super(2);
        this.f9627j = translationsSettingsFragment;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        ScreenKt.a(this.f9627j, m0.b.m1(R.string.translations, dVar2), null, null, null, null, null, a1.c.i0(dVar2, -1282120998, new AnonymousClass1(this.f9627j)), dVar2, 12582912, 62);
        return n.f16010a;
    }
}
