package x4;

import java.util.Set;
import o4.a0;
import o4.d0;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: l  reason: collision with root package name */
    public static final String f18603l = n4.g.f("StopWorkRunnable");

    /* renamed from: i  reason: collision with root package name */
    public final a0 f18604i;

    /* renamed from: j  reason: collision with root package name */
    public final o4.t f18605j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18606k;

    public q(a0 a0Var, o4.t tVar, boolean z10) {
        this.f18604i = a0Var;
        this.f18605j = tVar;
        this.f18606k = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c;
        if (this.f18606k) {
            c = this.f18604i.f16284f.m(this.f18605j);
        } else {
            o4.p pVar = this.f18604i.f16284f;
            o4.t tVar = this.f18605j;
            pVar.getClass();
            String str = tVar.f16343a.f18326a;
            synchronized (pVar.f16337t) {
                d0 d0Var = (d0) pVar.f16332o.remove(str);
                if (d0Var == null) {
                    n4.g d5 = n4.g.d();
                    String str2 = o4.p.f16326u;
                    d5.a(str2, "WorkerWrapper could not be found for " + str);
                } else {
                    Set set = (Set) pVar.f16333p.get(str);
                    if (set != null && set.contains(tVar)) {
                        n4.g d10 = n4.g.d();
                        String str3 = o4.p.f16326u;
                        d10.a(str3, "Processor stopping background work " + str);
                        pVar.f16333p.remove(str);
                        c = o4.p.c(d0Var, str);
                    }
                }
                c = false;
            }
        }
        n4.g d11 = n4.g.d();
        String str4 = f18603l;
        d11.a(str4, "StopWorkRunnable for " + this.f18605j.f16343a.f18326a + "; Processor.stopWork = " + c);
    }
}
