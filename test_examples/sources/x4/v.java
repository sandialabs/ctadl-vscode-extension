package x4;

import android.content.Context;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f18618i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ UUID f18619j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n4.c f18620k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Context f18621l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ w f18622m;

    public v(w wVar, androidx.work.impl.utils.futures.a aVar, UUID uuid, n4.c cVar, Context context) {
        this.f18622m = wVar;
        this.f18618i = aVar;
        this.f18619j = uuid;
        this.f18620k = cVar;
        this.f18621l = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f18618i.f6306i instanceof AbstractFuture.b)) {
                String uuid = this.f18619j.toString();
                w4.s l2 = this.f18622m.c.l(uuid);
                if (l2 != null && !l2.f18335b.a()) {
                    ((o4.p) this.f18622m.f18624b).i(uuid, this.f18620k);
                    this.f18621l.startService(androidx.work.impl.foreground.a.a(this.f18621l, ma.i.x(l2), this.f18620k));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f18618i.i(null);
        } catch (Throwable th) {
            this.f18618i.j(th);
        }
    }
}
