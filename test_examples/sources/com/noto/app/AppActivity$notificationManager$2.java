package com.noto.app;

import android.app.NotificationManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/NotificationManager;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppActivity$notificationManager$2 extends Lambda implements u7.a<NotificationManager> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$notificationManager$2(AppActivity appActivity) {
        super(0);
        this.f7530j = appActivity;
    }

    @Override // u7.a
    public final NotificationManager k0() {
        Object systemService = this.f7530j.getSystemService("notification");
        g.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }
}
