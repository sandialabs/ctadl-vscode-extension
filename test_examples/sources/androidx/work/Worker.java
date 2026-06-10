package androidx.work;

import android.content.Context;
import androidx.work.d;

/* loaded from: classes.dex */
public abstract class Worker extends d {

    /* renamed from: m  reason: collision with root package name */
    public androidx.work.impl.utils.futures.a<d.a> f6196m;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f6197i;

        public a(androidx.work.impl.utils.futures.a aVar) {
            this.f6197i = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th) {
                this.f6197i.j(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.d
    public final m6.a<n4.c> e() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        this.f6219j.c.execute(new a(aVar));
        return aVar;
    }

    @Override // androidx.work.d
    public final androidx.work.impl.utils.futures.a g() {
        this.f6196m = new androidx.work.impl.utils.futures.a<>();
        this.f6219j.c.execute(new e(this));
        return this.f6196m;
    }

    public abstract d.a.c i();
}
