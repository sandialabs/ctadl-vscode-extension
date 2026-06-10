package androidx.work;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Worker f6224i;

    public e(Worker worker) {
        this.f6224i = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f6224i;
        try {
            worker.f6196m.i(worker.i());
        } catch (Throwable th) {
            worker.f6196m.j(th);
        }
    }
}
