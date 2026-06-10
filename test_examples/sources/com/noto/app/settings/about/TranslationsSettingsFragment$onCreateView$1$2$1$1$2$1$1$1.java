package com.noto.app.settings.about;

import android.content.Intent;
import android.net.Uri;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.a;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TranslationsSettingsFragment$onCreateView$1$2$1$1$2$1$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TranslationsSettingsFragment f9634j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationsSettingsFragment$onCreateView$1$2$1$1$2$1$1$1(TranslationsSettingsFragment translationsSettingsFragment) {
        super(0);
        this.f9634j = translationsSettingsFragment;
    }

    @Override // u7.a
    public final n k0() {
        this.f9634j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://linkedin.com/in/nuraysabri")));
        return n.f16010a;
    }
}
