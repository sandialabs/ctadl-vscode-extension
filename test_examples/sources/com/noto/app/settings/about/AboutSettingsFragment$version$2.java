package com.noto.app.settings.about;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AboutSettingsFragment$version$2 extends Lambda implements a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AboutSettingsFragment f9614j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutSettingsFragment$version$2(AboutSettingsFragment aboutSettingsFragment) {
        super(0);
        this.f9614j = aboutSettingsFragment;
    }

    @Override // u7.a
    public final String k0() {
        PackageManager packageManager;
        PackageInfo packageInfo;
        Context j2 = this.f9614j.j();
        if (j2 == null || (packageManager = j2.getPackageManager()) == null || (packageInfo = packageManager.getPackageInfo(j2.getPackageName(), 0)) == null) {
            return null;
        }
        return packageInfo.versionName;
    }
}
