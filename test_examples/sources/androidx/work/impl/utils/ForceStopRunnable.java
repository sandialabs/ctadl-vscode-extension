package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.WorkInfo$State;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ma.i;
import n4.g;
import o4.a0;
import r4.c;
import w4.d;
import w4.l;
import w4.q;
import w4.s;
import w4.t;
import x4.m;
import x4.n;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public static final String f6297m = g.f("ForceStopRunnable");
    public static final long n = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: i  reason: collision with root package name */
    public final Context f6298i;

    /* renamed from: j  reason: collision with root package name */
    public final a0 f6299j;

    /* renamed from: k  reason: collision with root package name */
    public final m f6300k;

    /* renamed from: l  reason: collision with root package name */
    public int f6301l = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f6302a = g.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                if (((g.a) g.d()).c <= 2) {
                    Log.v(f6302a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, a0 a0Var) {
        this.f6298i = context.getApplicationContext();
        this.f6299j = a0Var;
        this.f6300k = a0Var.f16285g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + n;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        boolean z12;
        Long a10;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        int i12;
        m mVar = this.f6300k;
        int i13 = Build.VERSION.SDK_INT;
        Context context = this.f6298i;
        a0 a0Var = this.f6299j;
        if (i13 >= 23) {
            String str = c.f17060m;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ArrayList e10 = c.e(context, jobScheduler);
            ArrayList<String> b5 = a0Var.c.t().b();
            if (e10 != null) {
                i12 = e10.size();
            } else {
                i12 = 0;
            }
            HashSet hashSet = new HashSet(i12);
            if (e10 != null && !e10.isEmpty()) {
                Iterator it = e10.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    l g10 = c.g(jobInfo);
                    if (g10 != null) {
                        hashSet.add(g10.f18326a);
                    } else {
                        c.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = b5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        g.d().a(c.f17060m, "Reconciling jobs");
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                workDatabase = a0Var.c;
                workDatabase.c();
                try {
                    t w10 = workDatabase.w();
                    for (String str2 : b5) {
                        w10.g(-1L, str2);
                    }
                    workDatabase.p();
                    workDatabase.k();
                } finally {
                }
            }
        } else {
            z10 = false;
        }
        workDatabase = a0Var.c;
        t w11 = workDatabase.w();
        q v3 = workDatabase.v();
        workDatabase.c();
        try {
            ArrayList<s> b10 = w11.b();
            if (b10 != null && !b10.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                for (s sVar : b10) {
                    w11.o(WorkInfo$State.ENQUEUED, sVar.f18334a);
                    w11.g(-1L, sVar.f18334a);
                }
            }
            v3.b();
            workDatabase.p();
            if (!z11 && !z10) {
                z12 = false;
                a10 = a0Var.f16285g.f18592a.s().a("reschedule_needed");
                if (a10 == null && a10.longValue() == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                long j2 = 0;
                String str3 = f6297m;
                if (!z13) {
                    g.d().a(str3, "Rescheduling Workers.");
                    a0Var.g();
                    m mVar2 = a0Var.f16285g;
                    mVar2.getClass();
                    mVar2.f18592a.s().b(new d("reschedule_needed", 0L));
                    return;
                }
                try {
                    i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        i11 = 570425344;
                    } else {
                        i11 = 536870912;
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
                    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                    broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    if (((g.a) g.d()).c <= 5) {
                        Log.w(str3, "Ignoring exception", e);
                    }
                    z14 = true;
                    if (z14) {
                    }
                } catch (SecurityException e12) {
                    e = e12;
                    if (((g.a) g.d()).c <= 5) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                }
                if (i10 >= 30) {
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        Long a11 = mVar.f18592a.s().a("last_force_stop_ms");
                        if (a11 != null) {
                            j2 = a11.longValue();
                        }
                        for (int i14 = 0; i14 < historicalProcessExitReasons.size(); i14++) {
                            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i14);
                            reason = applicationExitInfo.getReason();
                            if (reason == 10) {
                                timestamp = applicationExitInfo.getTimestamp();
                                if (timestamp >= j2) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                    }
                    z14 = false;
                } else {
                    if (broadcast == null) {
                        c(context);
                        z14 = true;
                        break;
                    }
                    z14 = false;
                }
                if (z14) {
                    g.d().a(str3, "Application was force-stopped, rescheduling.");
                    a0Var.g();
                    long currentTimeMillis = System.currentTimeMillis();
                    mVar.getClass();
                    mVar.f18592a.s().b(new d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                    return;
                } else if (z12) {
                    g.d().a(str3, "Found unfinished work, scheduling it.");
                    o4.s.a(a0Var.f16281b, a0Var.c, a0Var.f16283e);
                    return;
                } else {
                    return;
                }
            }
            z12 = true;
            a10 = a0Var.f16285g.f18592a.s().a("reschedule_needed");
            if (a10 == null) {
            }
            z13 = false;
            long j22 = 0;
            String str32 = f6297m;
            if (!z13) {
            }
        } finally {
        }
    }

    public final boolean b() {
        a aVar = this.f6299j.f16281b;
        aVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f6297m;
        if (isEmpty) {
            g.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a10 = n.a(this.f6298i, aVar);
        g d5 = g.d();
        d5.a(str, "Is default app process = " + a10);
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[Catch: all -> 0x008e, TryCatch #9 {all -> 0x008e, blocks: (B:3:0x0004, B:7:0x000e, B:8:0x0013, B:9:0x001c, B:25:0x0030, B:27:0x0039, B:29:0x0059, B:30:0x005c, B:32:0x0061, B:34:0x0065, B:35:0x0078, B:37:0x007a, B:38:0x008d), top: B:47:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        String str = f6297m;
        a0 a0Var = this.f6299j;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    i.D(this.f6298i);
                    g.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException e10) {
                        e = e10;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                            String str2 = "Retrying after " + (i10 * 300);
                            if (((g.a) g.d()).c <= 3) {
                                Log.d(str, str2, e);
                            }
                            try {
                                Thread.sleep(this.f6301l * 300);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            g.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            a0Var.f16281b.getClass();
                            throw illegalStateException;
                        }
                    } catch (SQLiteCantOpenDatabaseException e11) {
                        e = e11;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    } catch (SQLiteConstraintException e12) {
                        e = e12;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    } catch (SQLiteDatabaseCorruptException e13) {
                        e = e13;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    } catch (SQLiteDatabaseLockedException e14) {
                        e = e14;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    } catch (SQLiteDiskIOException e15) {
                        e = e15;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    } catch (SQLiteTableLockedException e16) {
                        e = e16;
                        i10 = this.f6301l + 1;
                        this.f6301l = i10;
                        if (i10 < 3) {
                        }
                    }
                } catch (SQLiteException e17) {
                    g.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e17);
                    a0Var.f16281b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            a0Var.f();
        }
    }
}
