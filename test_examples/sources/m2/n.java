package m2;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f15936b;

    @Override // m2.p
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // m2.p
    public final void b(q qVar) {
        new Notification.BigTextStyle(qVar.f15959a).setBigContentTitle(null).bigText(this.f15936b);
    }

    @Override // m2.p
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
