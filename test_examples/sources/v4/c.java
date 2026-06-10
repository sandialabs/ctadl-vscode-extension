package v4;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18157i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Notification f18158j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f18159k;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f18159k = systemForegroundService;
        this.f18157i = i10;
        this.f18158j = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18159k.f6283m.notify(this.f18157i, this.f18158j);
    }
}
