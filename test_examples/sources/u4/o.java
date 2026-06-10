package u4;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17798a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17799b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f17800d;

    public o(Context context, y4.b bVar) {
        v7.g.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        v7.g.e(applicationContext, "context.applicationContext");
        a aVar = new a(applicationContext, bVar);
        Context applicationContext2 = context.getApplicationContext();
        v7.g.e(applicationContext2, "context.applicationContext");
        c cVar = new c(applicationContext2, bVar, 0);
        Context applicationContext3 = context.getApplicationContext();
        v7.g.e(applicationContext3, "context.applicationContext");
        String str = l.f17795a;
        Object kVar = Build.VERSION.SDK_INT >= 24 ? new k(applicationContext3, bVar) : new m(applicationContext3, bVar);
        Context applicationContext4 = context.getApplicationContext();
        v7.g.e(applicationContext4, "context.applicationContext");
        c cVar2 = new c(applicationContext4, bVar, 1);
        this.f17798a = aVar;
        this.f17800d = cVar;
        this.f17799b = kVar;
        this.c = cVar2;
    }

    public /* synthetic */ o(com.robinhood.ticker.c cVar) {
        this.f17798a = new ArrayList();
        this.f17799b = cVar;
    }

    public final float a() {
        Object obj = this.f17798a;
        int size = ((ArrayList) obj).size();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) ((ArrayList) obj).get(i10);
            bVar.a();
            f10 += bVar.f10192l;
        }
        return f10;
    }

    public final void b() {
        Object obj = this.f17798a;
        int size = ((ArrayList) obj).size();
        for (int i10 = 0; i10 < size; i10++) {
            com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) ((ArrayList) obj).get(i10);
            bVar.a();
            bVar.n = bVar.f10192l;
        }
    }

    public final void c(float f10) {
        Object obj = this.f17798a;
        int size = ((ArrayList) obj).size();
        for (int i10 = 0; i10 < size; i10++) {
            com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) ((ArrayList) obj).get(i10);
            if (f10 == 1.0f) {
                bVar.c = bVar.f10184d;
                bVar.f10194o = 0.0f;
                bVar.f10195p = 0.0f;
            }
            float f11 = bVar.f10183b.c;
            float abs = ((Math.abs(bVar.f10187g - bVar.f10186f) * f11) * f10) / f11;
            int i11 = (int) abs;
            float f12 = (1.0f - f10) * bVar.f10195p;
            int i12 = bVar.f10196q;
            bVar.f10189i = ((abs - i11) * f11 * i12) + f12;
            bVar.f10188h = (i11 * i12) + bVar.f10186f;
            bVar.f10190j = f11;
            float f13 = bVar.f10191k;
            bVar.f10192l = a4.b.f(bVar.f10193m, f13, f10, f13);
        }
    }
}
