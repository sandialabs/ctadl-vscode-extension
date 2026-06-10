package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import g0.e1;
import java.util.Arrays;
import java.util.HashMap;
import n4.g;
import o4.a0;
import o4.c;
import o4.t;
import w4.l;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: l  reason: collision with root package name */
    public static final String f6275l = g.f("SystemJobService");

    /* renamed from: i  reason: collision with root package name */
    public a0 f6276i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f6277j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final e1 f6278k = new e1(3);

    /* loaded from: classes.dex */
    public static class a {
        public static String[] a(JobParameters jobParameters) {
            String[] triggeredContentAuthorities;
            triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
            return triggeredContentAuthorities;
        }

        public static Uri[] b(JobParameters jobParameters) {
            Uri[] triggeredContentUris;
            triggeredContentUris = jobParameters.getTriggeredContentUris();
            return triggeredContentUris;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Network a(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    public static l a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o4.c
    public final void e(l lVar, boolean z10) {
        JobParameters jobParameters;
        g d5 = g.d();
        String str = f6275l;
        d5.a(str, lVar.f18326a + " executed on JobScheduler");
        synchronized (this.f6277j) {
            jobParameters = (JobParameters) this.f6277j.remove(lVar);
        }
        this.f6278k.f(lVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            a0 d5 = a0.d(getApplicationContext());
            this.f6276i = d5;
            d5.f16284f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                g.d().g(f6275l, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a0 a0Var = this.f6276i;
        if (a0Var != null) {
            a0Var.f16284f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.f6276i == null) {
            g.d().a(f6275l, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        l a10 = a(jobParameters);
        if (a10 == null) {
            g.d().b(f6275l, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f6277j) {
            if (this.f6277j.containsKey(a10)) {
                g d5 = g.d();
                String str = f6275l;
                d5.a(str, "Job is already being executed by SystemJobService: " + a10);
                return false;
            }
            g d10 = g.d();
            String str2 = f6275l;
            d10.a(str2, "onStartJob for " + a10);
            this.f6277j.put(a10, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f6205b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f6204a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    b.a(jobParameters);
                }
            } else {
                aVar = null;
            }
            this.f6276i.h(this.f6278k.h(a10), aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f6276i == null) {
            g.d().a(f6275l, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        l a10 = a(jobParameters);
        if (a10 == null) {
            g.d().b(f6275l, "WorkSpec id not found!");
            return false;
        }
        g d5 = g.d();
        String str = f6275l;
        d5.a(str, "onStopJob for " + a10);
        synchronized (this.f6277j) {
            this.f6277j.remove(a10);
        }
        t f10 = this.f6278k.f(a10);
        if (f10 != null) {
            this.f6276i.i(f10);
        }
        return !this.f6276i.f16284f.d(a10.f18326a);
    }
}
