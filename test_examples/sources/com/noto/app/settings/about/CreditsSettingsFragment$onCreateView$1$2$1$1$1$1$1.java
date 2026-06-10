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
final class CreditsSettingsFragment$onCreateView$1$2$1$1$1$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CreditsSettingsFragment f9623j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditsSettingsFragment$onCreateView$1$2$1$1$1$1$1(CreditsSettingsFragment creditsSettingsFragment) {
        super(0);
        this.f9623j = creditsSettingsFragment;
    }

    @Override // u7.a
    public final n k0() {
        this.f9623j.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://www.figma.com/community/file/830405806109119447")));
        return n.f16010a;
    }
}
