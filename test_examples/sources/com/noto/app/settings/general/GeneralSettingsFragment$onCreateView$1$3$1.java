package com.noto.app.settings.general;

import a1.b;
import android.content.Context;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.f;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.Theme;
import com.noto.app.settings.FolderIdType;
import com.noto.app.settings.SettingsItemKt;
import com.noto.app.settings.SettingsSectionKt;
import com.noto.app.settings.b;
import com.noto.app.settings.c;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import g0.d;
import g0.g0;
import g0.g1;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m7.n;
import ma.i;
import o6.e;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GeneralSettingsFragment$onCreateView$1$3$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ GeneralSettingsFragment f9690j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f9691k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g1<String> f9692j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ GeneralSettingsFragment f9693k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Context f9694l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g1<Long> f9695m;
        public final /* synthetic */ g1<String> n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ g1<Long> f9696o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ String f9697p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ String f9698q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ String f9699r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ String f9700s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9701t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9702u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9703v;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00921 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ g1<String> f9704j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsFragment f9705k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ Context f9706l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ g1<Long> f9707m;
            public final /* synthetic */ g1<String> n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ g1<Long> f9708o;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00931 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9709j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ Context f9710k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ g1<Long> f9711l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00931(GeneralSettingsFragment generalSettingsFragment, Context context, g1<Long> g1Var) {
                    super(0);
                    this.f9709j = generalSettingsFragment;
                    this.f9710k = context;
                    this.f9711l = g1Var;
                }

                @Override // u7.a
                public final n k0() {
                    GeneralSettingsFragment generalSettingsFragment = this.f9709j;
                    c Z = GeneralSettingsFragment.Z(generalSettingsFragment);
                    FolderIdType folderIdType = FolderIdType.MainInterface;
                    Z.getClass();
                    Z.f9680z = folderIdType;
                    NavController g10 = ViewUtilsKt.g(generalSettingsFragment);
                    if (g10 != null) {
                        long a10 = GeneralSettingsFragment$onCreateView$1$3$1.a(this.f9711l);
                        Context context = this.f9710k;
                        g.e(context, "context");
                        ViewUtilsKt.o(g10, b.i(new long[0], a10, true, f7.q.f(context, R.string.select_main_interface, new Object[0]), 10), null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass2 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9712j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ Context f9713k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ g1<Long> f9714l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(GeneralSettingsFragment generalSettingsFragment, Context context, g1<Long> g1Var) {
                    super(0);
                    this.f9712j = generalSettingsFragment;
                    this.f9713k = context;
                    this.f9714l = g1Var;
                }

                @Override // u7.a
                public final n k0() {
                    GeneralSettingsFragment generalSettingsFragment = this.f9712j;
                    c Z = GeneralSettingsFragment.Z(generalSettingsFragment);
                    FolderIdType folderIdType = FolderIdType.QuickNote;
                    Z.getClass();
                    Z.f9680z = folderIdType;
                    NavController g10 = ViewUtilsKt.g(generalSettingsFragment);
                    if (g10 != null) {
                        long longValue = this.f9714l.getValue().longValue();
                        Context context = this.f9713k;
                        g.e(context, "context");
                        ViewUtilsKt.o(g10, b.i(new long[0], longValue, false, f7.q.f(context, R.string.select_quick_note_folder, new Object[0]), 26), null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00921(g1<String> g1Var, GeneralSettingsFragment generalSettingsFragment, Context context, g1<Long> g1Var2, g1<String> g1Var3, g1<Long> g1Var4) {
                super(3);
                this.f9704j = g1Var;
                this.f9705k = generalSettingsFragment;
                this.f9706l = context;
                this.f9707m = g1Var2;
                this.n = g1Var3;
                this.f9708o = g1Var4;
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
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.main_interface, dVar3);
                String value = this.f9704j.getValue();
                g.f(value, "value");
                String m13 = m0.b.m1(R.string.main_interface_description, dVar3);
                y0.b V0 = m0.b.V0(R.drawable.ic_round_home_24, dVar3);
                b.c cVar = new b.c(value);
                g1<Long> g1Var = this.f9707m;
                GeneralSettingsFragment generalSettingsFragment = this.f9705k;
                Context context = this.f9706l;
                SettingsItemKt.a(m12, cVar, new C00931(generalSettingsFragment, context, g1Var), null, 0L, V0, 0L, m13, dVar3, 262144, 88);
                String m14 = m0.b.m1(R.string.quick_note_folder, dVar3);
                String value2 = this.n.getValue();
                g.f(value2, "value");
                String m15 = m0.b.m1(R.string.quick_note_folder_description, dVar3);
                SettingsItemKt.a(m14, new b.c(value2), new AnonymousClass2(generalSettingsFragment, context, this.f9708o), null, 0L, m0.b.V0(R.drawable.ic_round_folder_24, dVar3), 0L, m15, dVar3, 262144, 88);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass2 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ String f9715j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ String f9716k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ String f9717l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsFragment f9718m;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00941 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9719j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00941(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9719j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9719j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_generalSettingsFragment_to_themeDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$2$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00952 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9720j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00952(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9720j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9720j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_generalSettingsFragment_to_languageDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$2$3  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass3 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9721j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9721j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9721j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_generalSettingsFragment_to_iconDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, String str2, String str3, GeneralSettingsFragment generalSettingsFragment) {
                super(3);
                this.f9715j = str;
                this.f9716k = str2;
                this.f9717l = str3;
                this.f9718m = generalSettingsFragment;
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
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.theme, dVar3);
                String str = this.f9715j;
                g.f(str, "value");
                b.c cVar = new b.c(str);
                GeneralSettingsFragment generalSettingsFragment = this.f9718m;
                SettingsItemKt.a(m12, cVar, new C00941(generalSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_theme_24, dVar3), 0L, null, dVar3, 262144, 216);
                String m13 = m0.b.m1(R.string.language, dVar3);
                String str2 = this.f9716k;
                g.f(str2, "value");
                SettingsItemKt.a(m13, new b.c(str2), new C00952(generalSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_language_24, dVar3), 0L, null, dVar3, 262144, 216);
                String m14 = m0.b.m1(R.string.icon, dVar3);
                String str3 = this.f9717l;
                g.f(str3, "value");
                SettingsItemKt.a(m14, new b.c(str3), new AnonymousClass3(generalSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_noto_24, dVar3), 0L, null, dVar3, 262144, 216);
                return n.f16010a;
            }
        }

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass3 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ String f9722j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsFragment f9723k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9724l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9725m;
            public final /* synthetic */ g1<Boolean> n;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$3$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00961 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9726j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00961(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9726j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9726j);
                    if (g10 != null) {
                        a4.b.r(R.id.action_generalSettingsFragment_to_fontDialogFragment, g10, null);
                    }
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$3$2  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass2 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9727j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9727j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    GeneralSettingsFragment.Z(this.f9727j).m();
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$3$3  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00973 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9728j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00973(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9728j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    GeneralSettingsFragment.Z(this.f9728j).l();
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.general.GeneralSettingsFragment$onCreateView$1$3$1$1$3$4  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass4 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ GeneralSettingsFragment f9729j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(GeneralSettingsFragment generalSettingsFragment) {
                    super(0);
                    this.f9729j = generalSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    GeneralSettingsFragment.Z(this.f9729j).k();
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str, GeneralSettingsFragment generalSettingsFragment, g1<Boolean> g1Var, g1<Boolean> g1Var2, g1<Boolean> g1Var3) {
                super(3);
                this.f9722j = str;
                this.f9723k = generalSettingsFragment;
                this.f9724l = g1Var;
                this.f9725m = g1Var2;
                this.n = g1Var3;
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
                q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
                String m12 = m0.b.m1(R.string.notes_font, dVar3);
                String str = this.f9722j;
                g.f(str, "value");
                b.c cVar = new b.c(str);
                GeneralSettingsFragment generalSettingsFragment = this.f9723k;
                C00961 c00961 = new C00961(generalSettingsFragment);
                e eVar = e.f16364f;
                SettingsItemKt.a(m12, cVar, c00961, null, 0L, eVar, 0L, null, dVar3, 196608, 216);
                String m13 = m0.b.m1(R.string.show_notes_count, dVar3);
                boolean booleanValue = this.f9724l.getValue().booleanValue();
                String m14 = m0.b.m1(R.string.show_notes_count_description, dVar3);
                SettingsItemKt.a(m13, new b.C0091b(booleanValue), new AnonymousClass2(generalSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_tag_24, dVar3), 0L, m14, dVar3, 262144, 88);
                String m15 = m0.b.m1(R.string.remember_scrolling_position, dVar3);
                boolean booleanValue2 = this.f9725m.getValue().booleanValue();
                SettingsItemKt.a(m15, new b.C0091b(booleanValue2), new C00973(generalSettingsFragment), null, 0L, eVar, 0L, m0.b.m1(R.string.remember_scrolling_position_description, dVar3), dVar3, 196608, 88);
                String m16 = m0.b.m1(R.string.quick_exit, dVar3);
                boolean booleanValue3 = this.n.getValue().booleanValue();
                SettingsItemKt.a(m16, new b.C0091b(booleanValue3), new AnonymousClass4(generalSettingsFragment), null, 0L, eVar, 0L, m0.b.m1(R.string.quick_exit_description, dVar3), dVar3, 196608, 88);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g0 g0Var, GeneralSettingsFragment generalSettingsFragment, Context context, g0 g0Var2, g0 g0Var3, g0 g0Var4, String str, String str2, String str3, String str4, g0 g0Var5, g0 g0Var6, g0 g0Var7) {
            super(3);
            this.f9692j = g0Var;
            this.f9693k = generalSettingsFragment;
            this.f9694l = context;
            this.f9695m = g0Var2;
            this.n = g0Var3;
            this.f9696o = g0Var4;
            this.f9697p = str;
            this.f9698q = str2;
            this.f9699r = str3;
            this.f9700s = str4;
            this.f9701t = g0Var5;
            this.f9702u = g0Var6;
            this.f9703v = g0Var7;
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
            q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -992917521, new C00921(this.f9692j, this.f9693k, this.f9694l, this.f9695m, this.n, this.f9696o)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -1611475674, new AnonymousClass2(this.f9697p, this.f9698q, this.f9699r, this.f9693k)), dVar3, 3072, 7);
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -1083235225, new AnonymousClass3(this.f9700s, this.f9693k, this.f9701t, this.f9702u, this.f9703v)), dVar3, 3072, 7);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralSettingsFragment$onCreateView$1$3$1(GeneralSettingsFragment generalSettingsFragment, Context context) {
        super(2);
        this.f9690j = generalSettingsFragment;
        this.f9691k = context;
    }

    public static final long a(g1<Long> g1Var) {
        return g1Var.getValue().longValue();
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        int i10;
        int i11;
        int i12;
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        String m12 = m0.b.m1(R.string.all_folders, dVar2);
        String m13 = m0.b.m1(R.string.all, dVar2);
        String m14 = m0.b.m1(R.string.archived, dVar2);
        String m15 = m0.b.m1(R.string.recent, dVar2);
        String m16 = m0.b.m1(R.string.scheduled, dVar2);
        GeneralSettingsFragment generalSettingsFragment = this.f9690j;
        g0 f02 = a1.c.f0(GeneralSettingsFragment.Z(generalSettingsFragment).f9675u, dVar2);
        g0 b5 = f.b(m12, Long.valueOf(a(f02)), new GeneralSettingsFragment$onCreateView$1$3$1$mainInterfaceText$2(m12, m13, m15, m16, m14, this.f9690j, this.f9691k, f02, null), dVar2);
        m7.e eVar = generalSettingsFragment.f9685d0;
        int ordinal = ((Theme) a1.c.f0(((c) eVar.getValue()).f9664i, dVar2).getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            dVar2.f(-1833493728);
                            i10 = R.string.black_theme;
                        } else {
                            dVar2.f(-1833497136);
                            dVar2.u();
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        dVar2.f(-1833493804);
                        i10 = R.string.dark_theme;
                    }
                } else {
                    dVar2.f(-1833493880);
                    i10 = R.string.light_theme;
                }
            } else {
                dVar2.f(-1833493964);
                i10 = R.string.system_black_theme;
            }
        } else {
            dVar2.f(-1833494053);
            i10 = R.string.system_dark_theme;
        }
        String m17 = m0.b.m1(i10, dVar2);
        dVar2.u();
        String a10 = ModelUtilsKt.a((Language) a1.c.f0(((c) eVar.getValue()).f9666k, dVar2).getValue(), dVar2);
        switch (((Icon) a1.c.f0(((c) eVar.getValue()).f9667l, dVar2).getValue()).ordinal()) {
            case 0:
                dVar2.f(-1833493401);
                i11 = R.string.futuristic;
                break;
            case 1:
                dVar2.f(-1833493323);
                i11 = R.string.dark_rain;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                dVar2.f(-1833493246);
                i11 = R.string.airplane;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                dVar2.f(-1833493168);
                i11 = R.string.blossom_ice;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                dVar2.f(-1833493087);
                i11 = R.string.dark_alpine;
                break;
            case 5:
                dVar2.f(-1833493008);
                i11 = R.string.dark_side;
                break;
            case 6:
                dVar2.f(-1833492934);
                i11 = R.string.earth;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                dVar2.f(-1833492865);
                i11 = R.string.fire;
                break;
            case 8:
                dVar2.f(-1833492790);
                i11 = R.string.purpleberry;
                break;
            case i.f16046m /* 9 */:
                dVar2.f(-1833492708);
                i11 = R.string.sanguine_sun;
                break;
            default:
                dVar2.f(-1833497136);
                dVar2.u();
                throw new NoWhenBranchMatchedException();
        }
        String m18 = m0.b.m1(i11, dVar2);
        dVar2.u();
        int ordinal2 = ((Font) a1.c.f0(((c) eVar.getValue()).f9665j, dVar2).getValue()).ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                dVar2.f(-1833492431);
                i12 = R.string.monospace;
            } else {
                dVar2.f(-1833497136);
                dVar2.u();
                throw new NoWhenBranchMatchedException();
            }
        } else {
            dVar2.f(-1833492506);
            i12 = R.string.nunito;
        }
        String m19 = m0.b.m1(i12, dVar2);
        dVar2.u();
        g0 f03 = a1.c.f0(((c) eVar.getValue()).f9668m, dVar2);
        g0 f04 = a1.c.f0(((c) eVar.getValue()).f9676v, dVar2);
        g0 f05 = a1.c.f0(((c) eVar.getValue()).f9679y, dVar2);
        g0 f06 = a1.c.f0(((c) eVar.getValue()).f9678x, dVar2);
        ScreenKt.a(this.f9690j, m0.b.m1(R.string.general, dVar2), null, null, null, null, null, a1.c.i0(dVar2, -857083253, new AnonymousClass1(b5, this.f9690j, this.f9691k, f02, f.b(m0.b.m1(R.string.general, dVar2), Long.valueOf(((Number) f06.getValue()).longValue()), new GeneralSettingsFragment$onCreateView$1$3$1$quickNoteFolderTitle$2(generalSettingsFragment, f06, this.f9691k, null), dVar2), f06, m17, a10, m18, m19, f03, f04, f05)), dVar2, 12582920, 62);
        return n.f16010a;
    }
}
