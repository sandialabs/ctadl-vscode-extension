package x4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public static final String f18610o = n4.g.f("WorkForegroundRunnable");

    /* renamed from: i  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Void> f18611i = new androidx.work.impl.utils.futures.a<>();

    /* renamed from: j  reason: collision with root package name */
    public final Context f18612j;

    /* renamed from: k  reason: collision with root package name */
    public final w4.s f18613k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.work.d f18614l;

    /* renamed from: m  reason: collision with root package name */
    public final n4.d f18615m;
    public final y4.a n;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f18616i;

        public a(androidx.work.impl.utils.futures.a aVar) {
            this.f18616i = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (u.this.f18611i.f6306i instanceof AbstractFuture.b) {
                return;
            }
            try {
                n4.c cVar = (n4.c) this.f18616i.get();
                if (cVar != null) {
                    n4.g d5 = n4.g.d();
                    String str = u.f18610o;
                    d5.a(str, "Updating notification for " + u.this.f18613k.c);
                    u uVar = u.this;
                    androidx.work.impl.utils.futures.a<Void> aVar = uVar.f18611i;
                    n4.d dVar = uVar.f18615m;
                    Context context = uVar.f18612j;
                    UUID uuid = uVar.f18614l.f6219j.f6199a;
                    w wVar = (w) dVar;
                    wVar.getClass();
                    androidx.work.impl.utils.futures.a aVar2 = new androidx.work.impl.utils.futures.a();
                    ((y4.b) wVar.f18623a).a(new v(wVar, aVar2, uuid, cVar, context));
                    aVar.k(aVar2);
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + u.this.f18613k.c + ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                u.this.f18611i.j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public u(Context context, w4.s sVar, androidx.work.d dVar, n4.d dVar2, y4.a aVar) {
        this.f18612j = context;
        this.f18613k = sVar;
        this.f18614l = dVar;
        this.f18615m = dVar2;
        this.n = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.f18613k.f18348q && Build.VERSION.SDK_INT < 31) {
            androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
            y4.b bVar = (y4.b) this.n;
            bVar.c.execute(new d.v(this, 4, aVar));
            aVar.a(new a(aVar), bVar.c);
            return;
        }
        this.f18611i.i(null);
    }
}
