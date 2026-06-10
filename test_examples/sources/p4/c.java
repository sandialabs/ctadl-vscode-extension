package p4;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import g0.e1;
import g0.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ma.i;
import n4.g;
import o4.a0;
import o4.r;
import o4.t;
import s4.d;
import u4.o;
import w4.l;
import w4.s;
import x4.n;

/* loaded from: classes.dex */
public final class c implements r, s4.c, o4.c {

    /* renamed from: r  reason: collision with root package name */
    public static final String f16758r = g.f("GreedyScheduler");

    /* renamed from: i  reason: collision with root package name */
    public final Context f16759i;

    /* renamed from: j  reason: collision with root package name */
    public final a0 f16760j;

    /* renamed from: k  reason: collision with root package name */
    public final d f16761k;

    /* renamed from: m  reason: collision with root package name */
    public final b f16763m;
    public boolean n;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f16766q;

    /* renamed from: l  reason: collision with root package name */
    public final HashSet f16762l = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    public final e1 f16765p = new e1(3);

    /* renamed from: o  reason: collision with root package name */
    public final Object f16764o = new Object();

    public c(Context context, androidx.work.a aVar, o oVar, a0 a0Var) {
        this.f16759i = context;
        this.f16760j = a0Var;
        this.f16761k = new d(oVar, this);
        this.f16763m = new b(this, aVar.f6209e);
    }

    @Override // o4.r
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f16766q;
        a0 a0Var = this.f16760j;
        if (bool == null) {
            this.f16766q = Boolean.valueOf(n.a(this.f16759i, a0Var.f16281b));
        }
        boolean booleanValue = this.f16766q.booleanValue();
        String str2 = f16758r;
        if (!booleanValue) {
            g.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.n) {
            a0Var.f16284f.a(this);
            this.n = true;
        }
        g d5 = g.d();
        d5.a(str2, "Cancelling work ID " + str);
        b bVar = this.f16763m;
        if (bVar != null && (runnable = (Runnable) bVar.c.remove(str)) != null) {
            ((Handler) bVar.f16757b.f11061b).removeCallbacks(runnable);
        }
        for (t tVar : this.f16765p.e(str)) {
            a0Var.i(tVar);
        }
    }

    @Override // s4.c
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l x3 = i.x((s) it.next());
            g d5 = g.d();
            d5.a(f16758r, "Constraints not met: Cancelling work ID " + x3);
            t f10 = this.f16765p.f(x3);
            if (f10 != null) {
                this.f16760j.i(f10);
            }
        }
    }

    @Override // o4.r
    public final void c(s... sVarArr) {
        g d5;
        String str;
        StringBuilder sb;
        String str2;
        if (this.f16766q == null) {
            this.f16766q = Boolean.valueOf(n.a(this.f16759i, this.f16760j.f16281b));
        }
        if (!this.f16766q.booleanValue()) {
            g.d().e(f16758r, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.n) {
            this.f16760j.f16284f.a(this);
            this.n = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (s sVar : sVarArr) {
            if (!this.f16765p.c(i.x(sVar))) {
                long a10 = sVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (sVar.f18335b == WorkInfo$State.ENQUEUED) {
                    if (currentTimeMillis < a10) {
                        b bVar = this.f16763m;
                        if (bVar != null) {
                            HashMap hashMap = bVar.c;
                            Runnable runnable = (Runnable) hashMap.remove(sVar.f18334a);
                            l0 l0Var = bVar.f16757b;
                            if (runnable != null) {
                                ((Handler) l0Var.f11061b).removeCallbacks(runnable);
                            }
                            a aVar = new a(bVar, sVar);
                            hashMap.put(sVar.f18334a, aVar);
                            ((Handler) l0Var.f11061b).postDelayed(aVar, sVar.a() - System.currentTimeMillis());
                        }
                    } else if (sVar.b()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 23 && sVar.f18342j.c) {
                            d5 = g.d();
                            str = f16758r;
                            sb = new StringBuilder("Ignoring ");
                            sb.append(sVar);
                            str2 = ". Requires device idle.";
                        } else if (i10 >= 24 && (!sVar.f18342j.f16082h.isEmpty())) {
                            d5 = g.d();
                            str = f16758r;
                            sb = new StringBuilder("Ignoring ");
                            sb.append(sVar);
                            str2 = ". Requires ContentUri triggers.";
                        } else {
                            hashSet.add(sVar);
                            hashSet2.add(sVar.f18334a);
                        }
                        sb.append(str2);
                        d5.a(str, sb.toString());
                    } else if (!this.f16765p.c(i.x(sVar))) {
                        g.d().a(f16758r, "Starting work for " + sVar.f18334a);
                        a0 a0Var = this.f16760j;
                        e1 e1Var = this.f16765p;
                        e1Var.getClass();
                        a0Var.h(e1Var.h(i.x(sVar)), null);
                    }
                }
            }
        }
        synchronized (this.f16764o) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                g.d().a(f16758r, "Starting tracking for " + join);
                this.f16762l.addAll(hashSet);
                this.f16761k.d(this.f16762l);
            }
        }
    }

    @Override // s4.c
    public final void d(List<s> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            l x3 = i.x((s) it.next());
            e1 e1Var = this.f16765p;
            if (!e1Var.c(x3)) {
                g d5 = g.d();
                d5.a(f16758r, "Constraints met: Scheduling work ID " + x3);
                this.f16760j.h(e1Var.h(x3), null);
            }
        }
    }

    @Override // o4.c
    public final void e(l lVar, boolean z10) {
        this.f16765p.f(lVar);
        synchronized (this.f16764o) {
            Iterator it = this.f16762l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if (i.x(sVar).equals(lVar)) {
                    g d5 = g.d();
                    String str = f16758r;
                    d5.a(str, "Stopping tracking for " + lVar);
                    this.f16762l.remove(sVar);
                    this.f16761k.d(this.f16762l);
                    break;
                }
            }
        }
    }

    @Override // o4.r
    public final boolean f() {
        return false;
    }
}
