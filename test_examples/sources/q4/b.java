package q4;

import android.os.Handler;
import n4.g;
import w4.l;
import x4.y;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16918i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.background.systemalarm.c f16919j;

    public /* synthetic */ b(androidx.work.impl.background.systemalarm.c cVar, int i10) {
        this.f16918i = i10;
        this.f16919j = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16918i) {
            case 0:
                androidx.work.impl.background.systemalarm.c.c(this.f16919j);
                return;
            default:
                androidx.work.impl.background.systemalarm.c cVar = this.f16919j;
                if (cVar.f6255o == 0) {
                    cVar.f6255o = 1;
                    g d5 = g.d();
                    String str = androidx.work.impl.background.systemalarm.c.f6249u;
                    d5.a(str, "onAllConstraintsMet for " + cVar.f6252k);
                    if (cVar.f6253l.f6265l.j(cVar.f6260t, null)) {
                        y yVar = cVar.f6253l.f6264k;
                        l lVar = cVar.f6252k;
                        synchronized (yVar.f18628d) {
                            g d10 = g.d();
                            String str2 = y.f18625e;
                            d10.a(str2, "Starting timer for " + lVar);
                            yVar.a(lVar);
                            y.b bVar = new y.b(yVar, lVar);
                            yVar.f18627b.put(lVar, bVar);
                            yVar.c.put(lVar, cVar);
                            ((Handler) yVar.f18626a.f11061b).postDelayed(bVar, 600000L);
                        }
                        return;
                    }
                    cVar.e();
                    return;
                }
                g d11 = g.d();
                String str3 = androidx.work.impl.background.systemalarm.c.f6249u;
                d11.a(str3, "Already started work for " + cVar.f6252k);
                return;
        }
    }
}
