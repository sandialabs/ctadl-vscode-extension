package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6293i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Notification f6294j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6295k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f6296l;

    public b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f6296l = systemForegroundService;
        this.f6293i = i10;
        this.f6294j = notification;
        this.f6295k = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f6295k;
        Notification notification = this.f6294j;
        int i12 = this.f6293i;
        SystemForegroundService systemForegroundService = this.f6296l;
        if (i10 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}
