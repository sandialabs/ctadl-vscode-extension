package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import g0.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ma.i;
import n4.g;
import o4.t;
import w4.j;
import w4.l;
import w4.s;

/* loaded from: classes.dex */
public final class a implements o4.c {

    /* renamed from: m  reason: collision with root package name */
    public static final String f6241m = g.f("CommandHandler");

    /* renamed from: i  reason: collision with root package name */
    public final Context f6242i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f6243j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final Object f6244k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final e1 f6245l;

    public a(Context context, e1 e1Var) {
        this.f6242i = context;
        this.f6245l = e1Var;
    }

    public static l c(Intent intent) {
        return new l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, l lVar) {
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f18326a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", lVar.f18327b);
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f6244k) {
            z10 = !this.f6243j.isEmpty();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, Intent intent, d dVar) {
        boolean z10;
        List<t> list;
        g d5;
        StringBuilder sb;
        String str;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g.d().a(f6241m, "Handling constraints changed " + intent);
            b bVar = new b(this.f6242i, i10, dVar);
            ArrayList<s> s10 = dVar.f6266m.c.w().s();
            String str2 = ConstraintProxy.f6232a;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (s sVar : s10) {
                n4.b bVar2 = sVar.f18342j;
                z12 |= bVar2.f16078d;
                z13 |= bVar2.f16077b;
                z14 |= bVar2.f16079e;
                if (bVar2.f16076a != NetworkType.NOT_REQUIRED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            String str3 = ConstraintProxyUpdateReceiver.f6233a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.f6247a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            s4.d dVar2 = bVar.c;
            dVar2.d(s10);
            ArrayList arrayList = new ArrayList(s10.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (s sVar2 : s10) {
                String str4 = sVar2.f18334a;
                if (currentTimeMillis >= sVar2.a() && (!sVar2.b() || dVar2.c(str4))) {
                    arrayList.add(sVar2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar3 = (s) it.next();
                String str5 = sVar3.f18334a;
                l x3 = i.x(sVar3);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, x3);
                g.d().a(b.f6246d, a4.b.m("Creating a delay_met command for workSpec with id (", str5, ")"));
                ((y4.b) dVar.f6263j).c.execute(new d.b(bVar.f6248b, intent3, dVar));
            }
            dVar2.e();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            g.d().a(f6241m, "Handling reschedule " + intent + ", " + i10);
            dVar.f6266m.g();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                z10 = true;
                if (z10) {
                    g.d().b(f6241m, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
                    return;
                } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                    l c = c(intent);
                    String str6 = f6241m;
                    g.d().a(str6, "Handling schedule work for " + c);
                    WorkDatabase workDatabase = dVar.f6266m.c;
                    workDatabase.c();
                    try {
                        s l2 = workDatabase.w().l(c.f18326a);
                        if (l2 == null) {
                            d5 = g.d();
                            sb = new StringBuilder("Skipping scheduling ");
                            sb.append(c);
                            str = " because it's no longer in the DB";
                        } else if (l2.f18335b.a()) {
                            d5 = g.d();
                            sb = new StringBuilder("Skipping scheduling ");
                            sb.append(c);
                            str = "because it is finished.";
                        } else {
                            long a10 = l2.a();
                            boolean b5 = l2.b();
                            Context context2 = this.f6242i;
                            if (!b5) {
                                g.d().a(str6, "Setting up Alarms for " + c + "at " + a10);
                                q4.a.b(context2, workDatabase, c, a10);
                            } else {
                                g.d().a(str6, "Opportunistically setting an alarm for " + c + "at " + a10);
                                q4.a.b(context2, workDatabase, c, a10);
                                Intent intent4 = new Intent(context2, SystemAlarmService.class);
                                intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                                ((y4.b) dVar.f6263j).c.execute(new d.b(i10, intent4, dVar));
                            }
                            workDatabase.p();
                            workDatabase.k();
                            return;
                        }
                        sb.append(str);
                        d5.g(str6, sb.toString());
                        workDatabase.k();
                        return;
                    } catch (Throwable th) {
                        workDatabase.k();
                        throw th;
                    }
                } else if ("ACTION_DELAY_MET".equals(action)) {
                    synchronized (this.f6244k) {
                        l c10 = c(intent);
                        g d10 = g.d();
                        String str7 = f6241m;
                        d10.a(str7, "Handing delay met for " + c10);
                        if (!this.f6243j.containsKey(c10)) {
                            c cVar = new c(this.f6242i, i10, dVar, this.f6245l.h(c10));
                            this.f6243j.put(c10, cVar);
                            cVar.f();
                        } else {
                            g.d().a(str7, "WorkSpec " + c10 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    }
                    return;
                } else if ("ACTION_STOP_WORK".equals(action)) {
                    Bundle extras2 = intent.getExtras();
                    String string = extras2.getString("KEY_WORKSPEC_ID");
                    boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                    e1 e1Var = this.f6245l;
                    if (containsKey) {
                        int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                        ArrayList arrayList2 = new ArrayList(1);
                        t f10 = e1Var.f(new l(string, i11));
                        list = arrayList2;
                        if (f10 != null) {
                            arrayList2.add(f10);
                            list = arrayList2;
                        }
                    } else {
                        list = e1Var.e(string);
                    }
                    for (t tVar : list) {
                        g.d().a(f6241m, "Handing stopWork work for " + string);
                        dVar.f6266m.i(tVar);
                        WorkDatabase workDatabase2 = dVar.f6266m.c;
                        l lVar = tVar.f16343a;
                        String str8 = q4.a.f16917a;
                        j t10 = workDatabase2.t();
                        w4.i a11 = t10.a(lVar);
                        if (a11 != null) {
                            q4.a.a(this.f6242i, lVar, a11.c);
                            g.d().a(q4.a.f16917a, "Removing SystemIdInfo for workSpecId (" + lVar + ")");
                            t10.d(lVar);
                        }
                        dVar.e(tVar.f16343a, false);
                    }
                    return;
                } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                    l c11 = c(intent);
                    boolean z16 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                    g.d().a(f6241m, "Handling onExecutionCompleted " + intent + ", " + i10);
                    e(c11, z16);
                    return;
                } else {
                    g.d().g(f6241m, "Ignoring intent " + intent);
                    return;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    @Override // o4.c
    public final void e(l lVar, boolean z10) {
        synchronized (this.f6244k) {
            c cVar = (c) this.f6243j.remove(lVar);
            this.f6245l.f(lVar);
            if (cVar != null) {
                cVar.g(z10);
            }
        }
    }
}
