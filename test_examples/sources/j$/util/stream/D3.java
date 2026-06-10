package j$.util.stream;

/* loaded from: classes2.dex */
final class D3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f12301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f12302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(Runnable runnable, Runnable runnable2) {
        this.f12301a = runnable;
        this.f12302b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f12302b;
        try {
            this.f12301a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
