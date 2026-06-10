package o4;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public static final String f16294z = n4.g.f("WorkerWrapper");

    /* renamed from: i  reason: collision with root package name */
    public final Context f16295i;

    /* renamed from: j  reason: collision with root package name */
    public final String f16296j;

    /* renamed from: k  reason: collision with root package name */
    public final List<r> f16297k;

    /* renamed from: l  reason: collision with root package name */
    public final w4.s f16298l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.work.d f16299m;
    public final y4.a n;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.work.a f16301p;

    /* renamed from: q  reason: collision with root package name */
    public final v4.a f16302q;

    /* renamed from: r  reason: collision with root package name */
    public final WorkDatabase f16303r;

    /* renamed from: s  reason: collision with root package name */
    public final w4.t f16304s;

    /* renamed from: t  reason: collision with root package name */
    public final w4.b f16305t;

    /* renamed from: u  reason: collision with root package name */
    public final List<String> f16306u;

    /* renamed from: v  reason: collision with root package name */
    public String f16307v;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f16310y;

    /* renamed from: o  reason: collision with root package name */
    public d.a f16300o = new d.a.C0048a();

    /* renamed from: w  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Boolean> f16308w = new androidx.work.impl.utils.futures.a<>();

    /* renamed from: x  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<d.a> f16309x = new androidx.work.impl.utils.futures.a<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16311a;

        /* renamed from: b  reason: collision with root package name */
        public final v4.a f16312b;
        public final y4.a c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.work.a f16313d;

        /* renamed from: e  reason: collision with root package name */
        public final WorkDatabase f16314e;

        /* renamed from: f  reason: collision with root package name */
        public final w4.s f16315f;

        /* renamed from: g  reason: collision with root package name */
        public List<r> f16316g;

        /* renamed from: h  reason: collision with root package name */
        public final List<String> f16317h;

        /* renamed from: i  reason: collision with root package name */
        public WorkerParameters.a f16318i = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, y4.a aVar2, v4.a aVar3, WorkDatabase workDatabase, w4.s sVar, ArrayList arrayList) {
            this.f16311a = context.getApplicationContext();
            this.c = aVar2;
            this.f16312b = aVar3;
            this.f16313d = aVar;
            this.f16314e = workDatabase;
            this.f16315f = sVar;
            this.f16317h = arrayList;
        }
    }

    public d0(a aVar) {
        this.f16295i = aVar.f16311a;
        this.n = aVar.c;
        this.f16302q = aVar.f16312b;
        w4.s sVar = aVar.f16315f;
        this.f16298l = sVar;
        this.f16296j = sVar.f18334a;
        this.f16297k = aVar.f16316g;
        WorkerParameters.a aVar2 = aVar.f16318i;
        this.f16299m = null;
        this.f16301p = aVar.f16313d;
        WorkDatabase workDatabase = aVar.f16314e;
        this.f16303r = workDatabase;
        this.f16304s = workDatabase.w();
        this.f16305t = workDatabase.r();
        this.f16306u = aVar.f16317h;
    }

    public final void a(d.a aVar) {
        boolean z10 = aVar instanceof d.a.c;
        w4.s sVar = this.f16298l;
        String str = f16294z;
        if (z10) {
            n4.g d5 = n4.g.d();
            d5.e(str, "Worker result SUCCESS for " + this.f16307v);
            if (!sVar.c()) {
                w4.b bVar = this.f16305t;
                String str2 = this.f16296j;
                w4.t tVar = this.f16304s;
                WorkDatabase workDatabase = this.f16303r;
                workDatabase.c();
                try {
                    tVar.o(WorkInfo$State.SUCCEEDED, str2);
                    tVar.t(str2, ((d.a.c) this.f16300o).f6223a);
                    long currentTimeMillis = System.currentTimeMillis();
                    for (String str3 : bVar.c(str2)) {
                        if (tVar.j(str3) == WorkInfo$State.BLOCKED && bVar.a(str3)) {
                            n4.g d10 = n4.g.d();
                            d10.e(str, "Setting status to enqueued for " + str3);
                            tVar.o(WorkInfo$State.ENQUEUED, str3);
                            tVar.v(currentTimeMillis, str3);
                        }
                    }
                    workDatabase.p();
                    workDatabase.k();
                    e(false);
                    return;
                } catch (Throwable th) {
                    workDatabase.k();
                    e(false);
                    throw th;
                }
            }
        } else if (aVar instanceof d.a.b) {
            n4.g d11 = n4.g.d();
            d11.e(str, "Worker result RETRY for " + this.f16307v);
            c();
            return;
        } else {
            n4.g d12 = n4.g.d();
            d12.e(str, "Worker result FAILURE for " + this.f16307v);
            if (!sVar.c()) {
                g();
                return;
            }
        }
        d();
    }

    public final void b() {
        boolean h10 = h();
        String str = this.f16296j;
        WorkDatabase workDatabase = this.f16303r;
        if (!h10) {
            workDatabase.c();
            try {
                WorkInfo$State j2 = this.f16304s.j(str);
                workDatabase.v().a(str);
                if (j2 == null) {
                    e(false);
                } else if (j2 == WorkInfo$State.RUNNING) {
                    a(this.f16300o);
                } else if (!j2.a()) {
                    c();
                }
                workDatabase.p();
                workDatabase.k();
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List<r> list = this.f16297k;
        if (list != null) {
            for (r rVar : list) {
                rVar.a(str);
            }
            s.a(this.f16301p, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f16296j;
        w4.t tVar = this.f16304s;
        WorkDatabase workDatabase = this.f16303r;
        workDatabase.c();
        try {
            tVar.o(WorkInfo$State.ENQUEUED, str);
            tVar.v(System.currentTimeMillis(), str);
            tVar.g(-1L, str);
            workDatabase.p();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f16296j;
        w4.t tVar = this.f16304s;
        WorkDatabase workDatabase = this.f16303r;
        workDatabase.c();
        try {
            tVar.v(System.currentTimeMillis(), str);
            tVar.o(WorkInfo$State.ENQUEUED, str);
            tVar.m(str);
            tVar.d(str);
            tVar.g(-1L, str);
            workDatabase.p();
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final void e(boolean z10) {
        boolean containsKey;
        this.f16303r.c();
        try {
            if (!this.f16303r.w().e()) {
                x4.l.a(this.f16295i, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f16304s.o(WorkInfo$State.ENQUEUED, this.f16296j);
                this.f16304s.g(-1L, this.f16296j);
            }
            if (this.f16298l != null && this.f16299m != null) {
                v4.a aVar = this.f16302q;
                String str = this.f16296j;
                p pVar = (p) aVar;
                synchronized (pVar.f16337t) {
                    containsKey = pVar.n.containsKey(str);
                }
                if (containsKey) {
                    ((p) this.f16302q).k(this.f16296j);
                }
            }
            this.f16303r.p();
            this.f16303r.k();
            this.f16308w.i(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f16303r.k();
            throw th;
        }
    }

    public final void f() {
        boolean z10;
        w4.t tVar = this.f16304s;
        String str = this.f16296j;
        WorkInfo$State j2 = tVar.j(str);
        WorkInfo$State workInfo$State = WorkInfo$State.RUNNING;
        String str2 = f16294z;
        if (j2 == workInfo$State) {
            n4.g d5 = n4.g.d();
            d5.a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            z10 = true;
        } else {
            n4.g d10 = n4.g.d();
            d10.a(str2, "Status for " + str + " is " + j2 + " ; not doing any work");
            z10 = false;
        }
        e(z10);
    }

    public final void g() {
        String str = this.f16296j;
        WorkDatabase workDatabase = this.f16303r;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                w4.t tVar = this.f16304s;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (tVar.j(str2) != WorkInfo$State.CANCELLED) {
                        tVar.o(WorkInfo$State.FAILED, str2);
                    }
                    linkedList.addAll(this.f16305t.c(str2));
                } else {
                    tVar.t(str, ((d.a.C0048a) this.f16300o).f6222a);
                    workDatabase.p();
                    return;
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f16310y) {
            n4.g d5 = n4.g.d();
            String str = f16294z;
            d5.a(str, "Work interrupted for " + this.f16307v);
            WorkInfo$State j2 = this.f16304s.j(this.f16296j);
            if (j2 == null) {
                e(false);
            } else {
                e(!j2.a());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r0 != false) goto L81;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        n4.e eVar;
        n4.g d5;
        StringBuilder sb;
        String str;
        boolean z10;
        boolean z11;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str2 = this.f16296j;
        sb2.append(str2);
        sb2.append(", tags={ ");
        boolean z12 = true;
        for (String str3 : this.f16306u) {
            if (z12) {
                z12 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str3);
        }
        sb2.append(" } ]");
        this.f16307v = sb2.toString();
        w4.s sVar = this.f16298l;
        if (!h()) {
            WorkDatabase workDatabase = this.f16303r;
            workDatabase.c();
            try {
                WorkInfo$State workInfo$State = sVar.f18335b;
                WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                String str4 = sVar.c;
                String str5 = f16294z;
                if (workInfo$State != workInfo$State2) {
                    f();
                    workDatabase.p();
                    n4.g d10 = n4.g.d();
                    d10.a(str5, str4 + " is not in ENQUEUED state. Nothing more to do");
                } else {
                    if (!sVar.c()) {
                        if (sVar.f18335b == workInfo$State2 && sVar.f18343k > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (System.currentTimeMillis() < sVar.a()) {
                        n4.g.d().a(str5, String.format("Delaying execution for %s because it is being executed before schedule.", str4));
                        e(true);
                        workDatabase.p();
                    }
                    workDatabase.p();
                    workDatabase.k();
                    boolean c = sVar.c();
                    androidx.work.b bVar = sVar.f18337e;
                    w4.t tVar = this.f16304s;
                    androidx.work.a aVar = this.f16301p;
                    if (!c) {
                        n4.f fVar = aVar.f6208d;
                        String str6 = sVar.f18336d;
                        fVar.getClass();
                        String str7 = n4.e.f16087a;
                        try {
                            eVar = (n4.e) Class.forName(str6).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        } catch (Exception e10) {
                            n4.g d11 = n4.g.d();
                            d11.c(n4.e.f16087a, "Trouble instantiating + " + str6, e10);
                            eVar = null;
                        }
                        if (eVar == null) {
                            d5 = n4.g.d();
                            sb = new StringBuilder("Could not create Input Merger ");
                            str = sVar.f18336d;
                            sb.append(str);
                            d5.b(str5, sb.toString());
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bVar);
                        arrayList.addAll(tVar.q(str2));
                        bVar = eVar.a(arrayList);
                    }
                    androidx.work.b bVar2 = bVar;
                    UUID fromString = UUID.fromString(str2);
                    List<String> list = this.f16306u;
                    ExecutorService executorService = aVar.f6206a;
                    y4.a aVar2 = this.n;
                    n4.l lVar = aVar.c;
                    v4.a aVar3 = this.f16302q;
                    y4.a aVar4 = this.n;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, bVar2, list, executorService, aVar2, lVar, new x4.w(workDatabase, aVar3, aVar4));
                    if (this.f16299m == null) {
                        this.f16299m = lVar.a(this.f16295i, str4, workerParameters);
                    }
                    androidx.work.d dVar = this.f16299m;
                    if (dVar == null) {
                        d5 = n4.g.d();
                        sb = new StringBuilder("Could not create Worker ");
                        sb.append(str4);
                        d5.b(str5, sb.toString());
                        g();
                        return;
                    } else if (dVar.f6221l) {
                        d5 = n4.g.d();
                        sb = new StringBuilder("Received an already-used Worker ");
                        sb.append(str4);
                        str = "; Worker Factory should return new instances";
                        sb.append(str);
                        d5.b(str5, sb.toString());
                        g();
                        return;
                    } else {
                        dVar.f6221l = true;
                        workDatabase.c();
                        try {
                            if (tVar.j(str2) == workInfo$State2) {
                                tVar.o(WorkInfo$State.RUNNING, str2);
                                tVar.r(str2);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            workDatabase.p();
                            if (z10) {
                                if (!h()) {
                                    x4.u uVar = new x4.u(this.f16295i, this.f16298l, this.f16299m, workerParameters.f6203f, this.n);
                                    y4.b bVar3 = (y4.b) aVar4;
                                    bVar3.c.execute(uVar);
                                    androidx.work.impl.utils.futures.a<Void> aVar5 = uVar.f18611i;
                                    androidx.biometric.f fVar2 = new androidx.biometric.f(this, 1, aVar5);
                                    x4.r rVar = new x4.r();
                                    androidx.work.impl.utils.futures.a<d.a> aVar6 = this.f16309x;
                                    aVar6.a(fVar2, rVar);
                                    aVar5.a(new b0(this, aVar5), bVar3.c);
                                    aVar6.a(new c0(this, this.f16307v), bVar3.f18884a);
                                    return;
                                }
                                return;
                            }
                            f();
                            return;
                        } finally {
                        }
                    }
                }
                workDatabase.k();
            } finally {
            }
        }
    }
}
