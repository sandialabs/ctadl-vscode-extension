package androidx.work.impl.foreground;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ma.i;
import n4.g;
import o4.a0;
import o4.t;
import s4.c;
import s4.d;
import w4.l;
import w4.s;
import x4.q;

/* loaded from: classes.dex */
public final class a implements c, o4.c {

    /* renamed from: r  reason: collision with root package name */
    public static final String f6284r = g.f("SystemFgDispatcher");

    /* renamed from: i  reason: collision with root package name */
    public final a0 f6285i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.a f6286j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f6287k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public l f6288l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f6289m;
    public final HashMap n;

    /* renamed from: o  reason: collision with root package name */
    public final HashSet f6290o;

    /* renamed from: p  reason: collision with root package name */
    public final d f6291p;

    /* renamed from: q  reason: collision with root package name */
    public InterfaceC0050a f6292q;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0050a {
    }

    public a(Context context) {
        a0 d5 = a0.d(context);
        this.f6285i = d5;
        this.f6286j = d5.f16282d;
        this.f6288l = null;
        this.f6289m = new LinkedHashMap();
        this.f6290o = new HashSet();
        this.n = new HashMap();
        this.f6291p = new d(d5.f16288j, this);
        d5.f16284f.a(this);
    }

    public static Intent a(Context context, l lVar, n4.c cVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", cVar.f16085a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cVar.f16086b);
        intent.putExtra("KEY_NOTIFICATION", cVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f18326a);
        intent.putExtra("KEY_GENERATION", lVar.f18327b);
        return intent;
    }

    public static Intent c(Context context, l lVar, n4.c cVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f18326a);
        intent.putExtra("KEY_GENERATION", lVar.f18327b);
        intent.putExtra("KEY_NOTIFICATION_ID", cVar.f16085a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cVar.f16086b);
        intent.putExtra("KEY_NOTIFICATION", cVar.c);
        return intent;
    }

    @Override // s4.c
    public final void b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                String str = sVar.f18334a;
                g d5 = g.d();
                d5.a(f6284r, "Constraints unmet for WorkSpec " + str);
                l x3 = i.x(sVar);
                a0 a0Var = this.f6285i;
                ((y4.b) a0Var.f16282d).a(new q(a0Var, new t(x3), true));
            }
        }
    }

    @Override // s4.c
    public final void d(List<s> list) {
    }

    @Override // o4.c
    public final void e(l lVar, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f6287k) {
            try {
                s sVar = (s) this.n.remove(lVar);
                if (sVar != null) {
                    z11 = this.f6290o.remove(sVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f6291p.d(this.f6290o);
                }
            } finally {
            }
        }
        n4.c cVar = (n4.c) this.f6289m.remove(lVar);
        if (lVar.equals(this.f6288l) && this.f6289m.size() > 0) {
            Iterator it = this.f6289m.entrySet().iterator();
            while (true) {
                entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    break;
                }
            }
            this.f6288l = (l) entry.getKey();
            if (this.f6292q != null) {
                n4.c cVar2 = (n4.c) entry.getValue();
                InterfaceC0050a interfaceC0050a = this.f6292q;
                int i10 = cVar2.f16085a;
                int i11 = cVar2.f16086b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0050a;
                systemForegroundService.f6280j.post(new b(systemForegroundService, i10, cVar2.c, i11));
                InterfaceC0050a interfaceC0050a2 = this.f6292q;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) interfaceC0050a2;
                systemForegroundService2.f6280j.post(new v4.d(systemForegroundService2, cVar2.f16085a));
            }
        }
        InterfaceC0050a interfaceC0050a3 = this.f6292q;
        if (cVar != null && interfaceC0050a3 != null) {
            g d5 = g.d();
            String str = f6284r;
            d5.a(str, "Removing Notification (id: " + cVar.f16085a + ", workSpecId: " + lVar + ", notificationType: " + cVar.f16086b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0050a3;
            systemForegroundService3.f6280j.post(new v4.d(systemForegroundService3, cVar.f16085a));
        }
    }
}
