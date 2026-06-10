package com.noto.app.settings;

import android.app.NotificationManager;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadingModeSettingsFragment$notificationManager$2 extends Lambda implements u7.a<NotificationManager> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ReadingModeSettingsFragment f9450j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingModeSettingsFragment$notificationManager$2(ReadingModeSettingsFragment readingModeSettingsFragment) {
        super(0);
        this.f9450j = readingModeSettingsFragment;
    }

    @Override // u7.a
    public final NotificationManager k0() {
        Context j2 = this.f9450j.j();
        return (NotificationManager) (j2 != null ? j2.getSystemService("notification") : null);
    }
}
