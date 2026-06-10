package com.noto.app.settings;

import android.content.Intent;
import android.net.Uri;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SettingsFragment$SupportNotoItem$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9513j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$SupportNotoItem$1(SettingsFragment settingsFragment) {
        super(0);
        this.f9513j = settingsFragment;
    }

    @Override // u7.a
    public final n k0() {
        this.f9513j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto#support")));
        return n.f16010a;
    }
}
