package com.noto.app.settings;

import android.content.Intent;
import android.net.Uri;
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
final class SettingsFragment$AboutSection$1 extends Lambda implements q<d, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9478j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$AboutSection$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9479j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsFragment settingsFragment) {
            super(0);
            this.f9479j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            this.f9479j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto/issues/new")));
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$AboutSection$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9480j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SettingsFragment settingsFragment) {
            super(0);
            this.f9480j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            NavController g10 = ViewUtilsKt.g(this.f9480j);
            if (g10 != null) {
                a4.b.r(R.id.action_settingsFragment_to_whatsNewFragment, g10, null);
            }
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$AboutSection$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9481j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SettingsFragment settingsFragment) {
            super(0);
            this.f9481j = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            NavController g10 = ViewUtilsKt.g(this.f9481j);
            if (g10 != null) {
                a4.b.r(R.id.action_settingsFragment_to_aboutSettingsFragment, g10, null);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$AboutSection$1(SettingsFragment settingsFragment) {
        super(3);
        this.f9478j = settingsFragment;
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
        String m12 = m0.b.m1(R.string.report_issue, dVar3);
        b.a aVar = b.a.f9656a;
        SettingsFragment settingsFragment = this.f9478j;
        SettingsItemKt.a(m12, aVar, new AnonymousClass1(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_report_problem_24, dVar3), 0L, null, dVar3, 262192, 216);
        SettingsItemKt.a(m0.b.m1(R.string.whats_new, dVar3), aVar, new AnonymousClass2(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_new_releases_24, dVar3), 0L, null, dVar3, 262192, 216);
        SettingsItemKt.a(m0.b.m1(R.string.about, dVar3), aVar, new AnonymousClass3(settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_info_24, dVar3), 0L, null, dVar3, 262192, 216);
        return n.f16010a;
    }
}
