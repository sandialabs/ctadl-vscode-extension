package v4;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18160i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f18161j;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f18161j = systemForegroundService;
        this.f18160i = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18161j.f6283m.cancel(this.f18160i);
    }
}
