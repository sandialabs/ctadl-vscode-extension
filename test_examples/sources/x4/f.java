package x4;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import n4.i;
import o4.a0;
import w4.s;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    public static final String f18585k = n4.g.f("EnqueueRunnable");

    /* renamed from: i  reason: collision with root package name */
    public final o4.u f18586i;

    /* renamed from: j  reason: collision with root package name */
    public final o4.m f18587j;

    public f(o4.u uVar) {
        o4.m mVar = new o4.m();
        this.f18586i = uVar;
        this.f18587j = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0242, code lost:
        if (r3 != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(o4.u uVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        a0 a0Var;
        boolean z18;
        boolean z19;
        Iterator<? extends n4.k> it;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        WorkInfo$State workInfo$State;
        WorkInfo$State workInfo$State2;
        boolean z25;
        boolean z26;
        List<o4.u> list = uVar.f16350o;
        String str = f18585k;
        if (list != null) {
            z10 = false;
            for (o4.u uVar2 : list) {
                if (!uVar2.f16351p) {
                    z10 |= a(uVar2);
                } else {
                    n4.g.d().g(str, "Already enqueued work ids (" + TextUtils.join(", ", uVar2.f16349m) + ")");
                }
            }
        } else {
            z10 = false;
        }
        String[] strArr = (String[]) o4.u.M0(uVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        a0 a0Var2 = uVar.f16345i;
        WorkDatabase workDatabase = a0Var2.c;
        if (strArr != null && strArr.length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        WorkInfo$State workInfo$State3 = WorkInfo$State.SUCCEEDED;
        WorkInfo$State workInfo$State4 = WorkInfo$State.CANCELLED;
        WorkInfo$State workInfo$State5 = WorkInfo$State.FAILED;
        if (z11) {
            z12 = true;
            z13 = false;
            z14 = false;
            for (String str2 : strArr) {
                w4.s l2 = workDatabase.w().l(str2);
                if (l2 == null) {
                    n4.g.d().b(str, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    z17 = z10;
                    break;
                }
                WorkInfo$State workInfo$State6 = l2.f18335b;
                if (workInfo$State6 == workInfo$State3) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z12 &= z26;
                if (workInfo$State6 == workInfo$State5) {
                    z14 = true;
                } else if (workInfo$State6 == workInfo$State4) {
                    z13 = true;
                }
            }
        } else {
            z12 = true;
            z13 = false;
            z14 = false;
        }
        String str3 = uVar.f16346j;
        boolean z27 = !TextUtils.isEmpty(str3);
        if (z27 && !z11) {
            z15 = true;
        } else {
            z15 = false;
        }
        WorkInfo$State workInfo$State7 = WorkInfo$State.ENQUEUED;
        if (z15) {
            ArrayList<s.a> h10 = workDatabase.w().h(str3);
            if (!h10.isEmpty()) {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.APPEND;
                boolean z28 = z11;
                ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.APPEND_OR_REPLACE;
                z17 = z10;
                ExistingWorkPolicy existingWorkPolicy3 = uVar.f16347k;
                if (existingWorkPolicy3 != existingWorkPolicy && existingWorkPolicy3 != existingWorkPolicy2) {
                    if (existingWorkPolicy3 == ExistingWorkPolicy.KEEP) {
                        for (s.a aVar : h10) {
                            WorkInfo$State workInfo$State8 = aVar.f18353b;
                            if (workInfo$State8 != workInfo$State7) {
                                if (workInfo$State8 == WorkInfo$State.RUNNING) {
                                }
                            }
                            z21 = true;
                            z20 = false;
                        }
                    }
                    new d(a0Var2, str3).run();
                    w4.t w10 = workDatabase.w();
                    for (s.a aVar2 : h10) {
                        w10.a(aVar2.f18352a);
                    }
                    z16 = z27;
                    a0Var = a0Var2;
                    z18 = z28;
                    z19 = true;
                    it = uVar.f16348l.iterator();
                    while (it.hasNext()) {
                        n4.k next = it.next();
                        w4.s sVar = next.f16094b;
                        if (z18 && !z12) {
                            if (z14) {
                                sVar.f18335b = workInfo$State5;
                            } else if (z13) {
                                sVar.f18335b = workInfo$State4;
                            } else {
                                sVar.f18335b = WorkInfo$State.BLOCKED;
                            }
                        } else {
                            sVar.n = currentTimeMillis;
                        }
                        if (sVar.f18335b == workInfo$State7) {
                            z19 = true;
                        }
                        w4.t w11 = workDatabase.w();
                        Iterator<? extends n4.k> it2 = it;
                        a0 a0Var3 = a0Var;
                        List<o4.r> list2 = a0Var3.f16283e;
                        long j2 = currentTimeMillis;
                        v7.g.f(list2, "schedulers");
                        int i10 = Build.VERSION.SDK_INT;
                        if (23 <= i10 && i10 < 26) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (!z22) {
                            if (i10 <= 22) {
                                try {
                                    Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                                    if (!list2.isEmpty()) {
                                        for (o4.r rVar : list2) {
                                            if (cls.isAssignableFrom(rVar.getClass())) {
                                                z23 = true;
                                                break;
                                            }
                                        }
                                    }
                                } catch (ClassNotFoundException unused) {
                                }
                                z23 = false;
                            }
                            z24 = z19;
                            workInfo$State = workInfo$State4;
                            workInfo$State2 = workInfo$State5;
                            w11.n(sVar);
                            UUID uuid = next.f16093a;
                            if (z18) {
                                for (String str4 : strArr) {
                                    String uuid2 = uuid.toString();
                                    v7.g.e(uuid2, "id.toString()");
                                    workDatabase.r().d(new w4.a(uuid2, str4));
                                }
                            }
                            w4.w x3 = workDatabase.x();
                            String uuid3 = uuid.toString();
                            v7.g.e(uuid3, "id.toString()");
                            x3.a(uuid3, next.c);
                            if (!z16) {
                                w4.n u10 = workDatabase.u();
                                String uuid4 = uuid.toString();
                                v7.g.e(uuid4, "id.toString()");
                                u10.a(new w4.m(str3, uuid4));
                            }
                            workInfo$State5 = workInfo$State2;
                            it = it2;
                            currentTimeMillis = j2;
                            z19 = z24;
                            workInfo$State4 = workInfo$State;
                            a0Var = a0Var3;
                        }
                        String name = ConstraintTrackingWorker.class.getName();
                        String str5 = sVar.c;
                        if (!v7.g.a(str5, name)) {
                            n4.b bVar = sVar.f18342j;
                            z24 = z19;
                            if (bVar.f16078d || bVar.f16079e) {
                                b.a aVar3 = new b.a();
                                workInfo$State = workInfo$State4;
                                aVar3.a(sVar.f18337e.f6214a);
                                HashMap hashMap = aVar3.f6215a;
                                hashMap.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str5);
                                androidx.work.b bVar2 = new androidx.work.b(hashMap);
                                androidx.work.b.b(bVar2);
                                String name2 = ConstraintTrackingWorker.class.getName();
                                WorkInfo$State workInfo$State9 = sVar.f18335b;
                                String str6 = sVar.f18336d;
                                workInfo$State2 = workInfo$State5;
                                long j10 = sVar.f18339g;
                                long j11 = sVar.f18340h;
                                long j12 = sVar.f18341i;
                                int i11 = sVar.f18343k;
                                long j13 = sVar.f18345m;
                                long j14 = sVar.n;
                                long j15 = sVar.f18346o;
                                long j16 = sVar.f18347p;
                                boolean z29 = sVar.f18348q;
                                int i12 = sVar.f18350s;
                                int i13 = sVar.f18351t;
                                String str7 = sVar.f18334a;
                                v7.g.f(str7, "id");
                                v7.g.f(workInfo$State9, "state");
                                androidx.work.b bVar3 = sVar.f18338f;
                                v7.g.f(bVar3, "output");
                                BackoffPolicy backoffPolicy = sVar.f18344l;
                                v7.g.f(backoffPolicy, "backoffPolicy");
                                OutOfQuotaPolicy outOfQuotaPolicy = sVar.f18349r;
                                v7.g.f(outOfQuotaPolicy, "outOfQuotaPolicy");
                                sVar = new w4.s(str7, workInfo$State9, name2, str6, bVar2, bVar3, j10, j11, j12, bVar, i11, backoffPolicy, j13, j14, j15, j16, z29, outOfQuotaPolicy, i12, i13);
                                w11.n(sVar);
                                UUID uuid5 = next.f16093a;
                                if (z18) {
                                }
                                w4.w x32 = workDatabase.x();
                                String uuid32 = uuid5.toString();
                                v7.g.e(uuid32, "id.toString()");
                                x32.a(uuid32, next.c);
                                if (!z16) {
                                }
                                workInfo$State5 = workInfo$State2;
                                it = it2;
                                currentTimeMillis = j2;
                                z19 = z24;
                                workInfo$State4 = workInfo$State;
                                a0Var = a0Var3;
                            }
                            workInfo$State = workInfo$State4;
                            workInfo$State2 = workInfo$State5;
                            w11.n(sVar);
                            UUID uuid52 = next.f16093a;
                            if (z18) {
                            }
                            w4.w x322 = workDatabase.x();
                            String uuid322 = uuid52.toString();
                            v7.g.e(uuid322, "id.toString()");
                            x322.a(uuid322, next.c);
                            if (!z16) {
                            }
                            workInfo$State5 = workInfo$State2;
                            it = it2;
                            currentTimeMillis = j2;
                            z19 = z24;
                            workInfo$State4 = workInfo$State;
                            a0Var = a0Var3;
                        }
                        z24 = z19;
                        workInfo$State = workInfo$State4;
                        workInfo$State2 = workInfo$State5;
                        w11.n(sVar);
                        UUID uuid522 = next.f16093a;
                        if (z18) {
                        }
                        w4.w x3222 = workDatabase.x();
                        String uuid3222 = uuid522.toString();
                        v7.g.e(uuid3222, "id.toString()");
                        x3222.a(uuid3222, next.c);
                        if (!z16) {
                        }
                        workInfo$State5 = workInfo$State2;
                        it = it2;
                        currentTimeMillis = j2;
                        z19 = z24;
                        workInfo$State4 = workInfo$State;
                        a0Var = a0Var3;
                    }
                    z20 = z19;
                    z21 = true;
                    uVar.f16351p = z21;
                    return z17 | z20;
                }
                w4.b r3 = workDatabase.r();
                z16 = z27;
                ArrayList arrayList = new ArrayList();
                Iterator it3 = h10.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    s.a aVar4 = (s.a) it3.next();
                    a0 a0Var4 = a0Var2;
                    if (!r3.b(aVar4.f18352a)) {
                        WorkInfo$State workInfo$State10 = aVar4.f18353b;
                        if (workInfo$State10 == workInfo$State3) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z12 &= z25;
                        if (workInfo$State10 == workInfo$State5) {
                            z14 = true;
                        } else if (workInfo$State10 == workInfo$State4) {
                            z13 = true;
                        }
                        arrayList.add(aVar4.f18352a);
                    }
                    it3 = it4;
                    a0Var2 = a0Var4;
                }
                a0Var = a0Var2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (existingWorkPolicy3 == existingWorkPolicy2 && (z13 || z14)) {
                    w4.t w12 = workDatabase.w();
                    for (s.a aVar5 : w12.h(str3)) {
                        w12.a(aVar5.f18352a);
                    }
                    z13 = false;
                    z14 = false;
                    arrayList2 = Collections.emptyList();
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                if (strArr.length > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = false;
                it = uVar.f16348l.iterator();
                while (it.hasNext()) {
                }
                z20 = z19;
                z21 = true;
                uVar.f16351p = z21;
                return z17 | z20;
            }
        }
        z16 = z27;
        z17 = z10;
        a0Var = a0Var2;
        z18 = z11;
        z19 = false;
        it = uVar.f16348l.iterator();
        while (it.hasNext()) {
        }
        z20 = z19;
        z21 = true;
        uVar.f16351p = z21;
        return z17 | z20;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o4.m mVar = this.f18587j;
        o4.u uVar = this.f18586i;
        try {
            uVar.getClass();
            a0 a0Var = uVar.f16345i;
            if (!o4.u.L0(uVar, new HashSet())) {
                WorkDatabase workDatabase = a0Var.c;
                workDatabase.c();
                boolean a10 = a(uVar);
                workDatabase.p();
                workDatabase.k();
                if (a10) {
                    l.a(a0Var.f16280a, RescheduleReceiver.class, true);
                    o4.s.a(a0Var.f16281b, a0Var.c, a0Var.f16283e);
                }
                mVar.a(n4.i.f16090a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + uVar + ")");
        } catch (Throwable th) {
            mVar.a(new i.a.C0191a(th));
        }
    }
}
