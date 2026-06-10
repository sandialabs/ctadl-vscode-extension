package o4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import n2.a;
import o4.d0;

/* loaded from: classes.dex */
public final class p implements c, v4.a {

    /* renamed from: u  reason: collision with root package name */
    public static final String f16326u = n4.g.f("Processor");

    /* renamed from: j  reason: collision with root package name */
    public final Context f16328j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.work.a f16329k;

    /* renamed from: l  reason: collision with root package name */
    public final y4.a f16330l;

    /* renamed from: m  reason: collision with root package name */
    public final WorkDatabase f16331m;

    /* renamed from: q  reason: collision with root package name */
    public final List<r> f16334q;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f16332o = new HashMap();
    public final HashMap n = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f16335r = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f16336s = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public PowerManager.WakeLock f16327i = null;

    /* renamed from: t  reason: collision with root package name */
    public final Object f16337t = new Object();

    /* renamed from: p  reason: collision with root package name */
    public final HashMap f16333p = new HashMap();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final c f16338i;

        /* renamed from: j  reason: collision with root package name */
        public final w4.l f16339j;

        /* renamed from: k  reason: collision with root package name */
        public final m6.a<Boolean> f16340k;

        public a(c cVar, w4.l lVar, androidx.work.impl.utils.futures.a aVar) {
            this.f16338i = cVar;
            this.f16339j = lVar;
            this.f16340k = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.f16340k.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f16338i.e(this.f16339j, z10);
        }
    }

    public p(Context context, androidx.work.a aVar, y4.b bVar, WorkDatabase workDatabase, List list) {
        this.f16328j = context;
        this.f16329k = aVar;
        this.f16330l = bVar;
        this.f16331m = workDatabase;
        this.f16334q = list;
    }

    public static boolean c(d0 d0Var, String str) {
        if (d0Var != null) {
            d0Var.f16310y = true;
            d0Var.h();
            d0Var.f16309x.cancel(true);
            if (d0Var.f16299m != null && (d0Var.f16309x.f6306i instanceof AbstractFuture.b)) {
                d0Var.f16299m.h();
            } else {
                n4.g.d().a(d0.f16294z, "WorkSpec " + d0Var.f16298l + " is already done. Not interrupting.");
            }
            n4.g d5 = n4.g.d();
            String str2 = f16326u;
            d5.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        n4.g d10 = n4.g.d();
        String str3 = f16326u;
        d10.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(c cVar) {
        synchronized (this.f16337t) {
            this.f16336s.add(cVar);
        }
    }

    public final w4.s b(String str) {
        synchronized (this.f16337t) {
            d0 d0Var = (d0) this.n.get(str);
            if (d0Var == null) {
                d0Var = (d0) this.f16332o.get(str);
            }
            if (d0Var != null) {
                return d0Var.f16298l;
            }
            return null;
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.f16337t) {
            contains = this.f16335r.contains(str);
        }
        return contains;
    }

    @Override // o4.c
    public final void e(w4.l lVar, boolean z10) {
        synchronized (this.f16337t) {
            d0 d0Var = (d0) this.f16332o.get(lVar.f18326a);
            if (d0Var != null && lVar.equals(ma.i.x(d0Var.f16298l))) {
                this.f16332o.remove(lVar.f18326a);
            }
            n4.g d5 = n4.g.d();
            String str = f16326u;
            d5.a(str, p.class.getSimpleName() + " " + lVar.f18326a + " executed; reschedule = " + z10);
            Iterator it = this.f16336s.iterator();
            while (it.hasNext()) {
                ((c) it.next()).e(lVar, z10);
            }
        }
    }

    public final boolean f(String str) {
        boolean z10;
        synchronized (this.f16337t) {
            z10 = this.f16332o.containsKey(str) || this.n.containsKey(str);
        }
        return z10;
    }

    public final void g(c cVar) {
        synchronized (this.f16337t) {
            this.f16336s.remove(cVar);
        }
    }

    public final void h(w4.l lVar) {
        ((y4.b) this.f16330l).c.execute(new o(this, lVar));
    }

    public final void i(String str, n4.c cVar) {
        synchronized (this.f16337t) {
            n4.g d5 = n4.g.d();
            String str2 = f16326u;
            d5.e(str2, "Moving WorkSpec (" + str + ") to the foreground");
            d0 d0Var = (d0) this.f16332o.remove(str);
            if (d0Var != null) {
                if (this.f16327i == null) {
                    PowerManager.WakeLock a10 = x4.s.a(this.f16328j, "ProcessorForegroundLck");
                    this.f16327i = a10;
                    a10.acquire();
                }
                this.n.put(str, d0Var);
                Intent c = androidx.work.impl.foreground.a.c(this.f16328j, ma.i.x(d0Var.f16298l), cVar);
                Context context = this.f16328j;
                Object obj = n2.a.f16069a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.d.b(context, c);
                } else {
                    context.startService(c);
                }
            }
        }
    }

    public final boolean j(t tVar, WorkerParameters.a aVar) {
        w4.l lVar = tVar.f16343a;
        final String str = lVar.f18326a;
        final ArrayList arrayList = new ArrayList();
        w4.s sVar = (w4.s) this.f16331m.o(new Callable() { // from class: o4.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = p.this.f16331m;
                w4.w x3 = workDatabase.x();
                String str2 = str;
                arrayList.addAll(x3.b(str2));
                return workDatabase.w().l(str2);
            }
        });
        if (sVar == null) {
            n4.g d5 = n4.g.d();
            String str2 = f16326u;
            d5.g(str2, "Didn't find WorkSpec for id " + lVar);
            h(lVar);
            return false;
        }
        synchronized (this.f16337t) {
            if (f(str)) {
                Set set = (Set) this.f16333p.get(str);
                if (((t) set.iterator().next()).f16343a.f18327b == lVar.f18327b) {
                    set.add(tVar);
                    n4.g d10 = n4.g.d();
                    String str3 = f16326u;
                    d10.a(str3, "Work " + lVar + " is already enqueued for processing");
                } else {
                    h(lVar);
                }
                return false;
            } else if (sVar.f18351t != lVar.f18327b) {
                h(lVar);
                return false;
            } else {
                d0.a aVar2 = new d0.a(this.f16328j, this.f16329k, this.f16330l, this, this.f16331m, sVar, arrayList);
                aVar2.f16316g = this.f16334q;
                if (aVar != null) {
                    aVar2.f16318i = aVar;
                }
                d0 d0Var = new d0(aVar2);
                androidx.work.impl.utils.futures.a<Boolean> aVar3 = d0Var.f16308w;
                aVar3.a(new a(this, tVar.f16343a, aVar3), ((y4.b) this.f16330l).c);
                this.f16332o.put(str, d0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(tVar);
                this.f16333p.put(str, hashSet);
                ((y4.b) this.f16330l).f18884a.execute(d0Var);
                n4.g d11 = n4.g.d();
                String str4 = f16326u;
                d11.a(str4, p.class.getSimpleName() + ": processing " + lVar);
                return true;
            }
        }
    }

    public final void k(String str) {
        synchronized (this.f16337t) {
            this.n.remove(str);
            l();
        }
    }

    public final void l() {
        synchronized (this.f16337t) {
            if (!(!this.n.isEmpty())) {
                Context context = this.f16328j;
                String str = androidx.work.impl.foreground.a.f6284r;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f16328j.startService(intent);
                PowerManager.WakeLock wakeLock = this.f16327i;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f16327i = null;
                }
            }
        }
    }

    public final boolean m(t tVar) {
        d0 d0Var;
        String str = tVar.f16343a.f18326a;
        synchronized (this.f16337t) {
            n4.g d5 = n4.g.d();
            String str2 = f16326u;
            d5.a(str2, "Processor stopping foreground work " + str);
            d0Var = (d0) this.n.remove(str);
            if (d0Var != null) {
                this.f16333p.remove(str);
            }
        }
        return c(d0Var, str);
    }
}
