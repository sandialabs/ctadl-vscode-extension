package v2;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18144a;

    /* renamed from: b  reason: collision with root package name */
    public b f18145b;
    public CancellationSignal c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18146d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            if (this.f18144a) {
                return;
            }
            this.f18144a = true;
            this.f18146d = true;
            b bVar = this.f18145b;
            CancellationSignal cancellationSignal = this.c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f18146d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (cancellationSignal != null) {
                a.a(cancellationSignal);
            }
            synchronized (this) {
                this.f18146d = false;
                notifyAll();
            }
        }
    }

    public final void b(b bVar) {
        synchronized (this) {
            while (this.f18146d) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f18145b == bVar) {
                return;
            }
            this.f18145b = bVar;
            if (this.f18144a) {
                bVar.onCancel();
            }
        }
    }
}
