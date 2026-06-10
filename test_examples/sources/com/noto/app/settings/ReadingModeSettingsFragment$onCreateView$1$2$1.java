package com.noto.app.settings;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.components.ScreenKt;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.settings.b;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import g0.d;
import g0.g0;
import g0.g1;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o6.e;
import u7.p;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReadingModeSettingsFragment$onCreateView$1$2$1 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ReadingModeSettingsFragment f9452j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements q<v.d, d, Integer, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ReadingModeSettingsFragment f9453j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9454k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9455l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ g1<Boolean> f9456m;
        public final /* synthetic */ g1<ScreenBrightnessLevel> n;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        final class C00721 extends Lambda implements q<v.d, d, Integer, n> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ ReadingModeSettingsFragment f9457j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9458k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9459l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ g1<Boolean> f9460m;
            public final /* synthetic */ g1<ScreenBrightnessLevel> n;

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            final class C00731 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ ReadingModeSettingsFragment f9461j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00731(ReadingModeSettingsFragment readingModeSettingsFragment) {
                    super(0);
                    this.f9461j = readingModeSettingsFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                @Override // u7.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final n k0() {
                    boolean z10;
                    boolean isNotificationPolicyAccessGranted;
                    int i10 = ReadingModeSettingsFragment.f9444h0;
                    ReadingModeSettingsFragment readingModeSettingsFragment = this.f9461j;
                    if (!((Boolean) readingModeSettingsFragment.Z().n.getValue()).booleanValue()) {
                        if (readingModeSettingsFragment.f9448g0) {
                            NotificationManager notificationManager = (NotificationManager) readingModeSettingsFragment.f9446e0.getValue();
                            if (notificationManager != null) {
                                isNotificationPolicyAccessGranted = notificationManager.isNotificationPolicyAccessGranted();
                                z10 = true;
                                if (isNotificationPolicyAccessGranted) {
                                    if (!z10) {
                                        readingModeSettingsFragment.f9447f0.a(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
                                    }
                                }
                            }
                            z10 = false;
                            if (!z10) {
                            }
                        }
                        return n.f16010a;
                    }
                    readingModeSettingsFragment.Z().i();
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass2 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ ReadingModeSettingsFragment f9462j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ReadingModeSettingsFragment readingModeSettingsFragment) {
                    super(0);
                    this.f9462j = readingModeSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    int i10 = ReadingModeSettingsFragment.f9444h0;
                    c Z = this.f9462j.Z();
                    Z.getClass();
                    m0.b.M0(a1.b.d0(Z), null, null, new SettingsViewModel$toggleScreenOn$1(Z, null), 3);
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1$1$3  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass3 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ ReadingModeSettingsFragment f9463j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(ReadingModeSettingsFragment readingModeSettingsFragment) {
                    super(0);
                    this.f9463j = readingModeSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    int i10 = ReadingModeSettingsFragment.f9444h0;
                    c Z = this.f9463j.Z();
                    Z.getClass();
                    m0.b.M0(a1.b.d0(Z), null, null, new SettingsViewModel$toggleFullScreen$1(Z, null), 3);
                    return n.f16010a;
                }
            }

            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.noto.app.settings.ReadingModeSettingsFragment$onCreateView$1$2$1$1$1$4  reason: invalid class name */
            /* loaded from: classes.dex */
            final class AnonymousClass4 extends Lambda implements u7.a<n> {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ ReadingModeSettingsFragment f9464j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(ReadingModeSettingsFragment readingModeSettingsFragment) {
                    super(0);
                    this.f9464j = readingModeSettingsFragment;
                }

                @Override // u7.a
                public final n k0() {
                    NavController g10 = ViewUtilsKt.g(this.f9464j);
                    if (g10 != null) {
                        g10.h(R.id.action_readingModeSettingsFragment_to_screenBrightnessLevelDialogFragment, new Bundle(), null);
                    }
                    return n.f16010a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00721(ReadingModeSettingsFragment readingModeSettingsFragment, g1<Boolean> g1Var, g1<Boolean> g1Var2, g1<Boolean> g1Var3, g1<? extends ScreenBrightnessLevel> g1Var4) {
                super(3);
                this.f9457j = readingModeSettingsFragment;
                this.f9458k = g1Var;
                this.f9459l = g1Var2;
                this.f9460m = g1Var3;
                this.n = g1Var4;
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
                dVar3.f(1536811392);
                ReadingModeSettingsFragment readingModeSettingsFragment = this.f9457j;
                if (readingModeSettingsFragment.f9448g0) {
                    String m12 = m0.b.m1(R.string.do_not_disturb, dVar3);
                    boolean booleanValue = this.f9458k.getValue().booleanValue();
                    String m13 = m0.b.m1(R.string.do_not_disturb_description, dVar3);
                    SettingsItemKt.a(m12, new b.C0091b(booleanValue), new C00731(readingModeSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_do_not_disturb_24, dVar3), 0L, m13, dVar3, 262144, 88);
                }
                dVar3.u();
                String m14 = m0.b.m1(R.string.keep_screen_on, dVar3);
                boolean booleanValue2 = this.f9459l.getValue().booleanValue();
                String m15 = m0.b.m1(R.string.keep_screen_on_description, dVar3);
                SettingsItemKt.a(m14, new b.C0091b(booleanValue2), new AnonymousClass2(readingModeSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_visibility_24, dVar3), 0L, m15, dVar3, 262144, 88);
                String m16 = m0.b.m1(R.string.full_screen, dVar3);
                boolean booleanValue3 = this.f9460m.getValue().booleanValue();
                String m17 = m0.b.m1(R.string.full_screen_description, dVar3);
                SettingsItemKt.a(m16, new b.C0091b(booleanValue3), new AnonymousClass3(readingModeSettingsFragment), null, 0L, e.f16364f, 0L, m17, dVar3, 196608, 88);
                String m18 = m0.b.m1(R.string.screen_brightness_level, dVar3);
                String b5 = ModelUtilsKt.b(this.n.getValue(), dVar3);
                String m19 = m0.b.m1(R.string.screen_brightness_level_description, dVar3);
                SettingsItemKt.a(m18, new b.c(b5), new AnonymousClass4(readingModeSettingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_brightness_24, dVar3), 0L, m19, dVar3, 262144, 88);
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReadingModeSettingsFragment readingModeSettingsFragment, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
            super(3);
            this.f9453j = readingModeSettingsFragment;
            this.f9454k = g0Var;
            this.f9455l = g0Var2;
            this.f9456m = g0Var3;
            this.n = g0Var4;
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
            SettingsSectionKt.a(null, null, null, a1.c.i0(dVar3, -302629291, new C00721(this.f9453j, this.f9454k, this.f9455l, this.f9456m, this.n)), dVar3, 3072, 7);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingModeSettingsFragment$onCreateView$1$2$1(ReadingModeSettingsFragment readingModeSettingsFragment) {
        super(2);
        this.f9452j = readingModeSettingsFragment;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        int i10 = ReadingModeSettingsFragment.f9444h0;
        ReadingModeSettingsFragment readingModeSettingsFragment = this.f9452j;
        ScreenKt.a(this.f9452j, m0.b.m1(R.string.reading_mode, dVar2), null, null, null, null, null, a1.c.i0(dVar2, -166795023, new AnonymousClass1(this.f9452j, a1.c.f0(readingModeSettingsFragment.Z().n, dVar2), a1.c.f0(readingModeSettingsFragment.Z().f9669o, dVar2), a1.c.f0(readingModeSettingsFragment.Z().f9670p, dVar2), a1.c.f0(readingModeSettingsFragment.Z().f9671q, dVar2))), dVar2, 12582920, 62);
        return n.f16010a;
    }
}
