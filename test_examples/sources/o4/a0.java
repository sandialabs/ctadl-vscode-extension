package o4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import c4.c;
import com.noto.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n4.g;

/* loaded from: classes.dex */
public final class a0 extends n4.j {

    /* renamed from: k  reason: collision with root package name */
    public static a0 f16277k;

    /* renamed from: l  reason: collision with root package name */
    public static a0 f16278l;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f16279m;

    /* renamed from: a  reason: collision with root package name */
    public Context f16280a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.a f16281b;
    public WorkDatabase c;

    /* renamed from: d  reason: collision with root package name */
    public y4.a f16282d;

    /* renamed from: e  reason: collision with root package name */
    public List<r> f16283e;

    /* renamed from: f  reason: collision with root package name */
    public p f16284f;

    /* renamed from: g  reason: collision with root package name */
    public x4.m f16285g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16286h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f16287i;

    /* renamed from: j  reason: collision with root package name */
    public final u4.o f16288j;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    static {
        n4.g.f("WorkManagerImpl");
        f16277k = null;
        f16278l = null;
        f16279m = new Object();
    }

    public a0(Context context, androidx.work.a aVar, y4.b bVar) {
        RoomDatabase.a w10;
        r cVar;
        n4.g d5;
        String str;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        final Context applicationContext = context.getApplicationContext();
        x4.o oVar = bVar.f18884a;
        v7.g.f(applicationContext, "context");
        v7.g.f(oVar, "queryExecutor");
        r rVar = null;
        if (z10) {
            w10 = new RoomDatabase.a(applicationContext, WorkDatabase.class, null);
            w10.f6050j = true;
        } else {
            w10 = ma.i.w(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            w10.f6049i = new c.InterfaceC0055c() { // from class: o4.v
                /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
                @Override // c4.c.InterfaceC0055c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final c4.c f(c.b bVar2) {
                    boolean z11;
                    Context context2 = applicationContext;
                    v7.g.f(context2, "$context");
                    String str2 = bVar2.f6530b;
                    c.a aVar2 = bVar2.c;
                    v7.g.f(aVar2, "callback");
                    if (str2 != null && str2.length() != 0) {
                        z11 = false;
                        if (!(true ^ z11)) {
                            return new FrameworkSQLiteOpenHelper(context2, str2, aVar2, true, true);
                        }
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    z11 = true;
                    if (!(true ^ z11)) {
                    }
                }
            };
        }
        w10.f6047g = oVar;
        b bVar2 = b.f16289a;
        v7.g.f(bVar2, "callback");
        w10.f6044d.add(bVar2);
        w10.a(g.c);
        w10.a(new q(applicationContext, 2, 3));
        w10.a(h.c);
        w10.a(i.c);
        w10.a(new q(applicationContext, 5, 6));
        w10.a(j.c);
        w10.a(k.c);
        w10.a(l.c);
        w10.a(new q(applicationContext));
        w10.a(new q(applicationContext, 10, 11));
        w10.a(d.c);
        w10.a(e.c);
        w10.a(f.c);
        w10.f6052l = false;
        w10.f6053m = true;
        WorkDatabase workDatabase = (WorkDatabase) w10.b();
        Context applicationContext2 = context.getApplicationContext();
        g.a aVar2 = new g.a(aVar.f6210f);
        synchronized (n4.g.f16088a) {
            n4.g.f16089b = aVar2;
        }
        u4.o oVar2 = new u4.o(applicationContext2, bVar);
        this.f16288j = oVar2;
        r[] rVarArr = new r[2];
        int i10 = Build.VERSION.SDK_INT;
        String str2 = s.f16342a;
        if (i10 >= 23) {
            cVar = new r4.c(applicationContext2, this);
            x4.l.a(applicationContext2, SystemJobService.class, true);
            d5 = n4.g.d();
            str = "Created SystemJobScheduler and enabled SystemJobService";
        } else {
            try {
                r rVar2 = (r) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                n4.g.d().a(str2, "Created androidx.work.impl.background.gcm.GcmScheduler");
                rVar = rVar2;
            } catch (Throwable th) {
                if (((g.a) n4.g.d()).c <= 3) {
                    Log.d(str2, "Unable to create GCM Scheduler", th);
                }
            }
            if (rVar == null) {
                cVar = new q4.c(applicationContext2);
                x4.l.a(applicationContext2, SystemAlarmService.class, true);
                d5 = n4.g.d();
                str = "Created SystemAlarmScheduler";
            }
            rVarArr[0] = rVar;
            rVarArr[1] = new p4.c(applicationContext2, aVar, oVar2, this);
            List<r> asList = Arrays.asList(rVarArr);
            p pVar = new p(context, aVar, bVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f16280a = applicationContext3;
            this.f16281b = aVar;
            this.f16282d = bVar;
            this.c = workDatabase;
            this.f16283e = asList;
            this.f16284f = pVar;
            this.f16285g = new x4.m(workDatabase);
            this.f16286h = false;
            if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext3)) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((y4.b) this.f16282d).a(new ForceStopRunnable(applicationContext3, this));
        }
        d5.a(str2, str);
        rVar = cVar;
        rVarArr[0] = rVar;
        rVarArr[1] = new p4.c(applicationContext2, aVar, oVar2, this);
        List<r> asList2 = Arrays.asList(rVarArr);
        p pVar2 = new p(context, aVar, bVar, workDatabase, asList2);
        Context applicationContext32 = context.getApplicationContext();
        this.f16280a = applicationContext32;
        this.f16281b = aVar;
        this.f16282d = bVar;
        this.c = workDatabase;
        this.f16283e = asList2;
        this.f16284f = pVar2;
        this.f16285g = new x4.m(workDatabase);
        this.f16286h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((y4.b) this.f16282d).a(new ForceStopRunnable(applicationContext32, this));
    }

    @Deprecated
    public static a0 c() {
        synchronized (f16279m) {
            a0 a0Var = f16277k;
            if (a0Var != null) {
                return a0Var;
            }
            return f16278l;
        }
    }

    public static a0 d(Context context) {
        a0 c;
        synchronized (f16279m) {
            c = c();
            if (c == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((a.b) applicationContext).a());
                c = d(applicationContext);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (o4.a0.f16278l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        o4.a0.f16278l = new o4.a0(r4, r5, new y4.b(r5.f6207b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        o4.a0.f16277k = o4.a0.f16278l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f16279m) {
            a0 a0Var = f16277k;
            if (a0Var != null && f16278l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @Override // n4.j
    public final m a() {
        x4.c cVar = new x4.c(this);
        ((y4.b) this.f16282d).a(cVar);
        return cVar.f18584i;
    }

    @Override // n4.j
    public final m b(List list) {
        if (!list.isEmpty()) {
            u uVar = new u(this, list);
            if (!uVar.f16351p) {
                x4.f fVar = new x4.f(uVar);
                ((y4.b) this.f16282d).a(fVar);
                uVar.f16352q = fVar.f18587j;
            } else {
                n4.g d5 = n4.g.d();
                d5.g(u.f16344r, "Already enqueued work ids (" + TextUtils.join(", ", uVar.f16349m) + ")");
            }
            return uVar.f16352q;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void f() {
        synchronized (f16279m) {
            this.f16286h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f16287i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f16287i = null;
            }
        }
    }

    public final void g() {
        ArrayList e10;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f16280a;
            String str = r4.c.f17060m;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (e10 = r4.c.e(context, jobScheduler)) != null && !e10.isEmpty()) {
                Iterator it = e10.iterator();
                while (it.hasNext()) {
                    r4.c.b(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        this.c.w().u();
        s.a(this.f16281b, this.c, this.f16283e);
    }

    public final void h(t tVar, WorkerParameters.a aVar) {
        ((y4.b) this.f16282d).a(new x4.p(this, tVar, aVar));
    }

    public final void i(t tVar) {
        ((y4.b) this.f16282d).a(new x4.q(this, tVar, false));
    }
}
