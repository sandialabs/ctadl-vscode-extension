package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.t;
import androidx.work.impl.background.systemalarm.d;
import java.util.LinkedHashMap;
import java.util.Map;
import m7.n;
import n4.g;
import x4.s;

/* loaded from: classes.dex */
public class SystemAlarmService extends t implements d.c {

    /* renamed from: l  reason: collision with root package name */
    public static final String f6238l = g.f("SystemAlarmService");

    /* renamed from: j  reason: collision with root package name */
    public d f6239j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6240k;

    public final void a() {
        boolean z10;
        this.f6240k = true;
        g.d().a(f6238l, "All commands completed in dispatcher");
        String str = s.f18607a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (x4.t.f18608a) {
            linkedHashMap.putAll(x4.t.f18609b);
            n nVar = n.f16010a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g d5 = g.d();
                String str3 = s.f18607a;
                d5.g(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(this);
        this.f6239j = dVar;
        if (dVar.f6269q != null) {
            g.d().b(d.f6261r, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            dVar.f6269q = this;
        }
        this.f6240k = false;
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f6240k = true;
        d dVar = this.f6239j;
        dVar.getClass();
        g.d().a(d.f6261r, "Destroying SystemAlarmDispatcher");
        dVar.f6265l.g(dVar);
        dVar.f6269q = null;
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f6240k) {
            g.d().e(f6238l, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            d dVar = this.f6239j;
            dVar.getClass();
            g d5 = g.d();
            String str = d.f6261r;
            d5.a(str, "Destroying SystemAlarmDispatcher");
            dVar.f6265l.g(dVar);
            dVar.f6269q = null;
            d dVar2 = new d(this);
            this.f6239j = dVar2;
            if (dVar2.f6269q != null) {
                g.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                dVar2.f6269q = this;
            }
            this.f6240k = false;
        }
        if (intent != null) {
            this.f6239j.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
