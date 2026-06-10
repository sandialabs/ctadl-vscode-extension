package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import g0.e1;
import java.util.ArrayList;
import java.util.Iterator;
import n4.g;
import o4.a0;
import o4.p;
import w4.l;
import x4.o;
import x4.s;
import x4.y;
import y4.b;

/* loaded from: classes.dex */
public final class d implements o4.c {

    /* renamed from: r  reason: collision with root package name */
    public static final String f6261r = g.f("SystemAlarmDispatcher");

    /* renamed from: i  reason: collision with root package name */
    public final Context f6262i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.a f6263j;

    /* renamed from: k  reason: collision with root package name */
    public final y f6264k;

    /* renamed from: l  reason: collision with root package name */
    public final p f6265l;

    /* renamed from: m  reason: collision with root package name */
    public final a0 f6266m;
    public final androidx.work.impl.background.systemalarm.a n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f6267o;

    /* renamed from: p  reason: collision with root package name */
    public Intent f6268p;

    /* renamed from: q  reason: collision with root package name */
    public c f6269q;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.a aVar;
            RunnableC0049d runnableC0049d;
            synchronized (d.this.f6267o) {
                d dVar = d.this;
                dVar.f6268p = (Intent) dVar.f6267o.get(0);
            }
            Intent intent = d.this.f6268p;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f6268p.getIntExtra("KEY_START_ID", 0);
                g d5 = g.d();
                String str = d.f6261r;
                d5.a(str, "Processing command " + d.this.f6268p + ", " + intExtra);
                Context context = d.this.f6262i;
                PowerManager.WakeLock a10 = s.a(context, action + " (" + intExtra + ")");
                try {
                    g d10 = g.d();
                    d10.a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                    a10.acquire();
                    d dVar2 = d.this;
                    dVar2.n.b(intExtra, dVar2.f6268p, dVar2);
                    g d11 = g.d();
                    d11.a(str, "Releasing operation wake lock (" + action + ") " + a10);
                    a10.release();
                    d dVar3 = d.this;
                    aVar = ((y4.b) dVar3.f6263j).c;
                    runnableC0049d = new RunnableC0049d(dVar3);
                } catch (Throwable th) {
                    try {
                        g d12 = g.d();
                        String str2 = d.f6261r;
                        d12.c(str2, "Unexpected error in onHandleIntent", th);
                        g d13 = g.d();
                        d13.a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        d dVar4 = d.this;
                        aVar = ((y4.b) dVar4.f6263j).c;
                        runnableC0049d = new RunnableC0049d(dVar4);
                    } catch (Throwable th2) {
                        g d14 = g.d();
                        String str3 = d.f6261r;
                        d14.a(str3, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        d dVar5 = d.this;
                        ((y4.b) dVar5.f6263j).c.execute(new RunnableC0049d(dVar5));
                        throw th2;
                    }
                }
                aVar.execute(runnableC0049d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final d f6271i;

        /* renamed from: j  reason: collision with root package name */
        public final Intent f6272j;

        /* renamed from: k  reason: collision with root package name */
        public final int f6273k;

        public b(int i10, Intent intent, d dVar) {
            this.f6271i = dVar;
            this.f6272j = intent;
            this.f6273k = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6271i.a(this.f6272j, this.f6273k);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0049d implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final d f6274i;

        public RunnableC0049d(d dVar) {
            this.f6274i = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = this.f6274i;
            dVar.getClass();
            g d5 = g.d();
            String str = d.f6261r;
            d5.a(str, "Checking if commands are complete.");
            d.b();
            synchronized (dVar.f6267o) {
                if (dVar.f6268p != null) {
                    g d10 = g.d();
                    d10.a(str, "Removing command " + dVar.f6268p);
                    if (((Intent) dVar.f6267o.remove(0)).equals(dVar.f6268p)) {
                        dVar.f6268p = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                o oVar = ((y4.b) dVar.f6263j).f18884a;
                if (!dVar.n.a() && dVar.f6267o.isEmpty() && !oVar.a()) {
                    g.d().a(str, "No more commands & intents.");
                    c cVar = dVar.f6269q;
                    if (cVar != null) {
                        ((SystemAlarmService) cVar).a();
                    }
                } else if (!dVar.f6267o.isEmpty()) {
                    dVar.d();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6262i = applicationContext;
        this.n = new androidx.work.impl.background.systemalarm.a(applicationContext, new e1(3));
        a0 d5 = a0.d(context);
        this.f6266m = d5;
        this.f6264k = new y(d5.f16281b.f6209e);
        p pVar = d5.f16284f;
        this.f6265l = pVar;
        this.f6263j = d5.f16282d;
        pVar.a(this);
        this.f6267o = new ArrayList();
        this.f6268p = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i10) {
        g d5 = g.d();
        String str = f6261r;
        d5.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            g.d().g(str, "Unknown command. Ignoring");
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && c()) {
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f6267o) {
                boolean z10 = !this.f6267o.isEmpty();
                this.f6267o.add(intent);
                if (!z10) {
                    d();
                }
            }
        }
    }

    public final boolean c() {
        b();
        synchronized (this.f6267o) {
            Iterator it = this.f6267o.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void d() {
        b();
        PowerManager.WakeLock a10 = s.a(this.f6262i, "ProcessCommand");
        try {
            a10.acquire();
            ((y4.b) this.f6266m.f16282d).a(new a());
        } finally {
            a10.release();
        }
    }

    @Override // o4.c
    public final void e(l lVar, boolean z10) {
        b.a aVar = ((y4.b) this.f6263j).c;
        String str = androidx.work.impl.background.systemalarm.a.f6241m;
        Intent intent = new Intent(this.f6262i, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        aVar.execute(new b(0, intent, this));
    }
}
