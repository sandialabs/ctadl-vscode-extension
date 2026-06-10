package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.appcompat.widget.e1;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ma.i;
import n4.g;
import o4.t;
import w4.l;
import w4.s;
import x4.o;
import x4.y;
import y4.b;

/* loaded from: classes.dex */
public final class c implements s4.c, y.a {

    /* renamed from: u  reason: collision with root package name */
    public static final String f6249u = g.f("DelayMetCommandHandler");

    /* renamed from: i  reason: collision with root package name */
    public final Context f6250i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6251j;

    /* renamed from: k  reason: collision with root package name */
    public final l f6252k;

    /* renamed from: l  reason: collision with root package name */
    public final d f6253l;

    /* renamed from: m  reason: collision with root package name */
    public final s4.d f6254m;
    public final Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f6255o;

    /* renamed from: p  reason: collision with root package name */
    public final o f6256p;

    /* renamed from: q  reason: collision with root package name */
    public final b.a f6257q;

    /* renamed from: r  reason: collision with root package name */
    public PowerManager.WakeLock f6258r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6259s;

    /* renamed from: t  reason: collision with root package name */
    public final t f6260t;

    public c(Context context, int i10, d dVar, t tVar) {
        this.f6250i = context;
        this.f6251j = i10;
        this.f6253l = dVar;
        this.f6252k = tVar.f16343a;
        this.f6260t = tVar;
        u4.o oVar = dVar.f6266m.f16288j;
        y4.b bVar = (y4.b) dVar.f6263j;
        this.f6256p = bVar.f18884a;
        this.f6257q = bVar.c;
        this.f6254m = new s4.d(oVar, this);
        this.f6259s = false;
        this.f6255o = 0;
        this.n = new Object();
    }

    public static void c(c cVar) {
        g d5;
        StringBuilder sb;
        l lVar = cVar.f6252k;
        String str = lVar.f18326a;
        int i10 = cVar.f6255o;
        String str2 = f6249u;
        if (i10 < 2) {
            cVar.f6255o = 2;
            g d10 = g.d();
            d10.a(str2, "Stopping work for WorkSpec " + str);
            String str3 = a.f6241m;
            Context context = cVar.f6250i;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            a.d(intent, lVar);
            int i11 = cVar.f6251j;
            d dVar = cVar.f6253l;
            d.b bVar = new d.b(i11, intent, dVar);
            b.a aVar = cVar.f6257q;
            aVar.execute(bVar);
            if (dVar.f6265l.f(lVar.f18326a)) {
                g d11 = g.d();
                d11.a(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                a.d(intent2, lVar);
                aVar.execute(new d.b(i11, intent2, dVar));
                return;
            }
            d5 = g.d();
            sb = new StringBuilder("Processor does not have WorkSpec ");
            sb.append(str);
            str = ". No need to reschedule";
        } else {
            d5 = g.d();
            sb = new StringBuilder("Already stopped work for ");
        }
        sb.append(str);
        d5.a(str2, sb.toString());
    }

    @Override // x4.y.a
    public final void a(l lVar) {
        g d5 = g.d();
        d5.a(f6249u, "Exceeded time limits on execution for " + lVar);
        this.f6256p.execute(new q4.b(this, 0));
    }

    @Override // s4.c
    public final void b(ArrayList arrayList) {
        this.f6256p.execute(new e1(9, this));
    }

    @Override // s4.c
    public final void d(List<s> list) {
        for (s sVar : list) {
            if (i.x(sVar).equals(this.f6252k)) {
                this.f6256p.execute(new q4.b(this, 1));
                return;
            }
        }
    }

    public final void e() {
        synchronized (this.n) {
            this.f6254m.e();
            this.f6253l.f6264k.a(this.f6252k);
            PowerManager.WakeLock wakeLock = this.f6258r;
            if (wakeLock != null && wakeLock.isHeld()) {
                g d5 = g.d();
                String str = f6249u;
                d5.a(str, "Releasing wakelock " + this.f6258r + "for WorkSpec " + this.f6252k);
                this.f6258r.release();
            }
        }
    }

    public final void f() {
        String str = this.f6252k.f18326a;
        this.f6258r = x4.s.a(this.f6250i, str + " (" + this.f6251j + ")");
        String str2 = f6249u;
        g.d().a(str2, "Acquiring wakelock " + this.f6258r + "for WorkSpec " + str);
        this.f6258r.acquire();
        s l2 = this.f6253l.f6266m.c.w().l(str);
        if (l2 == null) {
            this.f6256p.execute(new androidx.activity.b(10, this));
            return;
        }
        boolean b5 = l2.b();
        this.f6259s = b5;
        if (!b5) {
            g.d().a(str2, "No constraints for " + str);
            d(Collections.singletonList(l2));
            return;
        }
        this.f6254m.d(Collections.singletonList(l2));
    }

    public final void g(boolean z10) {
        g d5 = g.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        l lVar = this.f6252k;
        sb.append(lVar);
        sb.append(", ");
        sb.append(z10);
        d5.a(f6249u, sb.toString());
        e();
        int i10 = this.f6251j;
        d dVar = this.f6253l;
        b.a aVar = this.f6257q;
        Context context = this.f6250i;
        if (z10) {
            String str = a.f6241m;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            a.d(intent, lVar);
            aVar.execute(new d.b(i10, intent, dVar));
        }
        if (this.f6259s) {
            String str2 = a.f6241m;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new d.b(i10, intent2, dVar));
        }
    }
}
