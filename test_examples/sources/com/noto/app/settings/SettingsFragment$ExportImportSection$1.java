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
final class SettingsFragment$ExportImportSection$1 extends Lambda implements q<d, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9486j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$ExportImportSection$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9487j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsFragment settingsFragment) {
            super(0);
            this.f9487j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            NavController g10 = ViewUtilsKt.g(this.f9487j);
            if (g10 != null) {
                a4.b.r(R.id.action_settingsFragment_to_exportImportDialogFragment, g10, null);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$ExportImportSection$1(SettingsFragment settingsFragment) {
        super(3);
        this.f9486j = settingsFragment;
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
        SettingsItemKt.a(m0.b.m1(R.string.export_import_data, dVar3), b.a.f9656a, new AnonymousClass1(this.f9486j), null, 0L, m0.b.V0(R.drawable.ic_round_import_export_24, dVar3), 0L, null, dVar3, 262192, 216);
        return n.f16010a;
    }
}
