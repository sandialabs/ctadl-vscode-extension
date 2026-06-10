package x4;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import n4.i;
import o4.a0;
import o4.d0;

/* loaded from: classes.dex */
public abstract class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final o4.m f18584i = new o4.m();

    public static void a(a0 a0Var, String str) {
        d0 d0Var;
        boolean z10;
        WorkDatabase workDatabase = a0Var.c;
        w4.t w10 = workDatabase.w();
        w4.b r3 = workDatabase.r();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo$State j2 = w10.j(str2);
            if (j2 != WorkInfo$State.SUCCEEDED && j2 != WorkInfo$State.FAILED) {
                w10.o(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(r3.c(str2));
        }
        o4.p pVar = a0Var.f16284f;
        synchronized (pVar.f16337t) {
            n4.g d5 = n4.g.d();
            String str3 = o4.p.f16326u;
            d5.a(str3, "Processor cancelling " + str);
            pVar.f16335r.add(str);
            d0Var = (d0) pVar.n.remove(str);
            if (d0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d0Var == null) {
                d0Var = (d0) pVar.f16332o.remove(str);
            }
            if (d0Var != null) {
                pVar.f16333p.remove(str);
            }
        }
        o4.p.c(d0Var, str);
        if (z10) {
            pVar.l();
        }
        for (o4.r rVar : a0Var.f16283e) {
            rVar.a(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        o4.m mVar = this.f18584i;
        try {
            b();
            mVar.a(n4.i.f16090a);
        } catch (Throwable th) {
            mVar.a(new i.a.C0191a(th));
        }
    }
}
