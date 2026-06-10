package x4;

import g0.l0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final String f18625e = n4.g.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final l0 f18626a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f18627b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f18628d = new Object();

    /* loaded from: classes.dex */
    public interface a {
        void a(w4.l lVar);
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final y f18629i;

        /* renamed from: j  reason: collision with root package name */
        public final w4.l f18630j;

        public b(y yVar, w4.l lVar) {
            this.f18629i = yVar;
            this.f18630j = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f18629i.f18628d) {
                if (((b) this.f18629i.f18627b.remove(this.f18630j)) != null) {
                    a aVar = (a) this.f18629i.c.remove(this.f18630j);
                    if (aVar != null) {
                        aVar.a(this.f18630j);
                    }
                } else {
                    n4.g.d().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f18630j));
                }
            }
        }
    }

    public y(l0 l0Var) {
        this.f18626a = l0Var;
    }

    public final void a(w4.l lVar) {
        synchronized (this.f18628d) {
            if (((b) this.f18627b.remove(lVar)) != null) {
                n4.g d5 = n4.g.d();
                String str = f18625e;
                d5.a(str, "Stopping timer for " + lVar);
                this.c.remove(lVar);
            }
        }
    }
}
