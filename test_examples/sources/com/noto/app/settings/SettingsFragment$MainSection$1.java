package com.noto.app.settings;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.settings.b;
import com.noto.app.util.ViewUtilsKt;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;
import v.d;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SettingsFragment$MainSection$1 extends Lambda implements q<d, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9492j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$MainSection$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9493j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsFragment settingsFragment) {
            super(0);
            this.f9493j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            NavController g10 = ViewUtilsKt.g(this.f9493j);
            if (g10 != null) {
                a4.b.r(R.id.action_settingsFragment_to_generalSettingsFragment, g10, null);
            }
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$MainSection$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9494j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SettingsFragment settingsFragment) {
            super(0);
            this.f9494j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            NavController g10 = ViewUtilsKt.g(this.f9494j);
            if (g10 != null) {
                a4.b.r(R.id.action_settingsFragment_to_readingModeSettingsFragment, g10, null);
            }
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$MainSection$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9495j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SettingsFragment settingsFragment) {
            super(0);
            this.f9495j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            androidx.navigation.a aVar;
            SettingsFragment settingsFragment = this.f9495j;
            Object value = ((c) settingsFragment.f9476d0.getValue()).f9672r.getValue();
            NavController g10 = ViewUtilsKt.g(settingsFragment);
            if (value == null) {
                if (g10 != null) {
                    aVar = new androidx.navigation.a(R.id.action_settingsFragment_to_vaultPasscodeDialogFragment);
                    ViewUtilsKt.o(g10, aVar, null);
                }
            } else if (g10 != null) {
                aVar = new androidx.navigation.a(R.id.action_settingsFragment_to_validateVaultPasscodeDialogFragment);
                ViewUtilsKt.o(g10, aVar, null);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$MainSection$1(SettingsFragment settingsFragment) {
        super(3);
        this.f9492j = settingsFragment;
    }

    @Override // u7.q
    public final n O(d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        int intValue = num.intValue();
        g.f(dVar, "$this$SettingsSection");
        if ((intValue & 81) == 16 && dVar3.s()) {
            dVar3.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        String m12 = m0.b.m1(R.string.general, dVar3);
        b.a aVar = b.a.f9656a;
        SettingsFragment settingsFragment = this.f9492j;
        SettingsItemKt.a(m12, aVar, new AnonymousClass1(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_settings_24, dVar3), 0L, null, dVar3, 262192, 216);
        SettingsItemKt.a(m0.b.m1(R.string.reading_mode, dVar3), aVar, new AnonymousClass2(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_reading_mode_24, dVar3), 0L, null, dVar3, 262192, 216);
        SettingsItemKt.a(m0.b.m1(R.string.vault, dVar3), aVar, new AnonymousClass3(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_shield_24, dVar3), 0L, null, dVar3, 262192, 216);
        return n.f16010a;
    }
}
