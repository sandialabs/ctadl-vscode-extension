package r4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import d.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import ma.i;
import n4.g;
import o4.a0;
import o4.r;
import w4.l;
import w4.s;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: m  reason: collision with root package name */
    public static final String f17060m = g.f("SystemJobScheduler");

    /* renamed from: i  reason: collision with root package name */
    public final Context f17061i;

    /* renamed from: j  reason: collision with root package name */
    public final JobScheduler f17062j;

    /* renamed from: k  reason: collision with root package name */
    public final a0 f17063k;

    /* renamed from: l  reason: collision with root package name */
    public final b f17064l;

    public c(Context context, a0 a0Var) {
        b bVar = new b(context);
        this.f17061i = context;
        this.f17063k = a0Var;
        this.f17062j = (JobScheduler) context.getSystemService("jobscheduler");
        this.f17064l = bVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            g.d().c(f17060m, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList e10 = e(context, jobScheduler);
        if (e10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            l g10 = g(jobInfo);
            if (g10 != null && str.equals(g10.f18326a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            g.d().c(f17060m, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static l g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // o4.r
    public final void a(String str) {
        Context context = this.f17061i;
        JobScheduler jobScheduler = this.f17062j;
        ArrayList d5 = d(context, jobScheduler, str);
        if (d5 != null && !d5.isEmpty()) {
            Iterator it = d5.iterator();
            while (it.hasNext()) {
                b(jobScheduler, ((Integer) it.next()).intValue());
            }
            this.f17063k.c.t().e(str);
        }
    }

    @Override // o4.r
    public final void c(s... sVarArr) {
        int intValue;
        ArrayList d5;
        int intValue2;
        g d10;
        String str;
        a0 a0Var = this.f17063k;
        WorkDatabase workDatabase = a0Var.c;
        final x xVar = new x(workDatabase);
        for (s sVar : sVarArr) {
            workDatabase.c();
            try {
                s l2 = workDatabase.w().l(sVar.f18334a);
                String str2 = f17060m;
                String str3 = sVar.f18334a;
                if (l2 == null) {
                    d10 = g.d();
                    str = "Skipping scheduling " + str3 + " because it's no longer in the DB";
                } else if (l2.f18335b != WorkInfo$State.ENQUEUED) {
                    d10 = g.d();
                    str = "Skipping scheduling " + str3 + " because it is no longer enqueued";
                } else {
                    l x3 = i.x(sVar);
                    w4.i a10 = workDatabase.t().a(x3);
                    Object obj = xVar.f10337a;
                    if (a10 != null) {
                        intValue = a10.c;
                    } else {
                        a0Var.f16281b.getClass();
                        final int i10 = a0Var.f16281b.f6211g;
                        Object o10 = ((WorkDatabase) obj).o(new Callable() { // from class: x4.h

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ int f18590b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                boolean z10;
                                d.x xVar2 = d.x.this;
                                v7.g.f(xVar2, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) xVar2.f10337a;
                                int i11 = ma.i.i(workDatabase2, "next_job_scheduler_id");
                                int i12 = this.f18590b;
                                if (i12 <= i11 && i11 <= i10) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    workDatabase2.s().b(new w4.d("next_job_scheduler_id", Long.valueOf(i12 + 1)));
                                    i11 = i12;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        v7.g.e(o10, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) o10).intValue();
                    }
                    if (a10 == null) {
                        a0Var.c.t().c(new w4.i(x3.f18327b, intValue, x3.f18326a));
                    }
                    h(sVar, intValue);
                    if (Build.VERSION.SDK_INT == 23 && (d5 = d(this.f17061i, this.f17062j, str3)) != null) {
                        int indexOf = d5.indexOf(Integer.valueOf(intValue));
                        if (indexOf >= 0) {
                            d5.remove(indexOf);
                        }
                        if (!d5.isEmpty()) {
                            intValue2 = ((Integer) d5.get(0)).intValue();
                        } else {
                            a0Var.f16281b.getClass();
                            final int i11 = a0Var.f16281b.f6211g;
                            Object o11 = ((WorkDatabase) obj).o(new Callable() { // from class: x4.h

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ int f18590b = 0;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    boolean z10;
                                    d.x xVar2 = d.x.this;
                                    v7.g.f(xVar2, "this$0");
                                    WorkDatabase workDatabase2 = (WorkDatabase) xVar2.f10337a;
                                    int i112 = ma.i.i(workDatabase2, "next_job_scheduler_id");
                                    int i12 = this.f18590b;
                                    if (i12 <= i112 && i112 <= i11) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        workDatabase2.s().b(new w4.d("next_job_scheduler_id", Long.valueOf(i12 + 1)));
                                        i112 = i12;
                                    }
                                    return Integer.valueOf(i112);
                                }
                            });
                            v7.g.e(o11, "workDatabase.runInTransa…            id\n        })");
                            intValue2 = ((Number) o11).intValue();
                        }
                        h(sVar, intValue2);
                        workDatabase.p();
                        workDatabase.k();
                    }
                    workDatabase.p();
                    workDatabase.k();
                }
                d10.g(str2, str);
                workDatabase.p();
                workDatabase.k();
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // o4.r
    public final boolean f() {
        return true;
    }

    public final void h(s sVar, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f17062j;
        JobInfo a10 = this.f17064l.a(sVar, i10);
        g d5 = g.d();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = sVar.f18334a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i10);
        String sb2 = sb.toString();
        String str2 = f17060m;
        d5.a(str2, sb2);
        try {
            if (jobScheduler.schedule(a10) == 0) {
                g d10 = g.d();
                d10.g(str2, "Unable to schedule work ID " + str);
                if (sVar.f18348q && sVar.f18349r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    sVar.f18348q = false;
                    g.d().a(str2, String.format("Scheduling a non-expedited job (work ID %s)", str));
                    h(sVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList e11 = e(this.f17061i, jobScheduler);
            if (e11 != null) {
                i11 = e11.size();
            } else {
                i11 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i11);
            a0 a0Var = this.f17063k;
            objArr[1] = Integer.valueOf(a0Var.c.w().s().size());
            androidx.work.a aVar = a0Var.f16281b;
            int i12 = Build.VERSION.SDK_INT;
            int i13 = aVar.f6212h;
            if (i12 == 23) {
                i13 /= 2;
            }
            objArr[2] = Integer.valueOf(i13);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            g.d().b(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            a0Var.f16281b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            g d11 = g.d();
            d11.c(str2, "Unable to schedule " + sVar, th);
        }
    }
}
