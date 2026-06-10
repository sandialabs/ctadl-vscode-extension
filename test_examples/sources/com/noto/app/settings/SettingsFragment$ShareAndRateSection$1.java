package com.noto.app.settings;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.settings.b;
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
final class SettingsFragment$ShareAndRateSection$1 extends Lambda implements q<d, g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f9500j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9501k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f9502l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f9503m;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$ShareAndRateSection$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f9504j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9505k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f9506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SettingsFragment settingsFragment, String str2) {
            super(0);
            this.f9504j = str;
            this.f9505k = settingsFragment;
            this.f9506l = str2;
        }

        @Override // u7.a
        public final n k0() {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this.f9506l + " https://play.google.com/store/apps/details?id=com.noto");
            this.f9505k.Y(Intent.createChooser(intent, this.f9504j));
            return n.f16010a;
        }
    }

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.noto.app.settings.SettingsFragment$ShareAndRateSection$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f9507j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ SettingsFragment f9508k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, SettingsFragment settingsFragment) {
            super(0);
            this.f9507j = str;
            this.f9508k = settingsFragment;
        }

        @Override // u7.a
        public final n k0() {
            this.f9508k.Y(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.noto")), this.f9507j));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$ShareAndRateSection$1(String str, SettingsFragment settingsFragment, String str2, String str3) {
        super(3);
        this.f9500j = str;
        this.f9501k = settingsFragment;
        this.f9502l = str2;
        this.f9503m = str3;
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
        String m12 = m0.b.m1(R.string.share_app_with_others, dVar3);
        b.a aVar = b.a.f9656a;
        String str = this.f9502l;
        String str2 = this.f9500j;
        SettingsFragment settingsFragment = this.f9501k;
        SettingsItemKt.a(m12, aVar, new AnonymousClass1(str2, settingsFragment, str), null, 0L, m0.b.V0(R.drawable.ic_round_share_24, dVar3), 0L, null, dVar3, 262192, 216);
        SettingsItemKt.a(m0.b.m1(R.string.rate_app_on_play_store, dVar3), aVar, new AnonymousClass2(this.f9503m, settingsFragment), null, 0L, m0.b.V0(R.drawable.ic_round_star_rate_24, dVar3), 0L, null, dVar3, 262192, 216);
        return n.f16010a;
    }
}
