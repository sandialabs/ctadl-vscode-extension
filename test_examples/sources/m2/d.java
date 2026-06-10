package m2;

import android.app.Application;
import m2.f;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Application f15911i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f.a f15912j;

    public d(Application application, f.a aVar) {
        this.f15911i = application;
        this.f15912j = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15911i.unregisterActivityLifecycleCallbacks(this.f15912j);
    }
}
