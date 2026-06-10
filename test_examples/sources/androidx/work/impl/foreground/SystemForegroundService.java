package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.t;
import androidx.work.impl.foreground.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import n4.c;
import n4.g;
import o4.a0;
import w4.l;

/* loaded from: classes.dex */
public class SystemForegroundService extends t implements a.InterfaceC0050a {
    public static final String n = g.f("SystemFgService");

    /* renamed from: j  reason: collision with root package name */
    public Handler f6280j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6281k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.impl.foreground.a f6282l;

    /* renamed from: m  reason: collision with root package name */
    public NotificationManager f6283m;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                g d5 = g.d();
                String str = SystemForegroundService.n;
                if (((g.a) d5).c <= 5) {
                    Log.w(str, "Unable to start foreground service", e10);
                }
            }
        }
    }

    public final void a() {
        this.f6280j = new Handler(Looper.getMainLooper());
        this.f6283m = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f6282l = aVar;
        if (aVar.f6292q != null) {
            g.d().b(androidx.work.impl.foreground.a.f6284r, "A callback already exists.");
        } else {
            aVar.f6292q = this;
        }
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        androidx.work.impl.foreground.a aVar = this.f6282l;
        aVar.f6292q = null;
        synchronized (aVar.f6287k) {
            aVar.f6291p.e();
        }
        aVar.f6285i.f16284f.g(aVar);
    }

    @Override // androidx.lifecycle.t, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f6281k;
        String str = n;
        int i12 = 0;
        if (z10) {
            g.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            androidx.work.impl.foreground.a aVar = this.f6282l;
            aVar.f6292q = null;
            synchronized (aVar.f6287k) {
                aVar.f6291p.e();
            }
            aVar.f6285i.f16284f.g(aVar);
            a();
            this.f6281k = false;
        }
        if (intent != null) {
            androidx.work.impl.foreground.a aVar2 = this.f6282l;
            aVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = androidx.work.impl.foreground.a.f6284r;
            if (equals) {
                g d5 = g.d();
                d5.e(str2, "Started foreground service " + intent);
                ((y4.b) aVar2.f6286j).a(new v4.b(aVar2, intent.getStringExtra("KEY_WORKSPEC_ID")));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    g d10 = g.d();
                    d10.e(str2, "Stopping foreground work for " + intent);
                    String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                        UUID fromString = UUID.fromString(stringExtra);
                        a0 a0Var = aVar2.f6285i;
                        a0Var.getClass();
                        ((y4.b) a0Var.f16282d).a(new x4.b(a0Var, fromString));
                        return 3;
                    }
                    return 3;
                } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    g.d().e(str2, "Stopping foreground service");
                    a.InterfaceC0050a interfaceC0050a = aVar2.f6292q;
                    if (interfaceC0050a != null) {
                        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0050a;
                        systemForegroundService.f6281k = true;
                        g.d().a(str, "All commands completed.");
                        if (Build.VERSION.SDK_INT >= 26) {
                            systemForegroundService.stopForeground(true);
                        }
                        systemForegroundService.stopSelf();
                        return 3;
                    }
                    return 3;
                } else {
                    return 3;
                }
            }
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            l lVar = new l(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            g d11 = g.d();
            d11.a(str2, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra2 + ", notificationType :" + intExtra2 + ")");
            if (notification != null && aVar2.f6292q != null) {
                c cVar = new c(intExtra, intExtra2, notification);
                LinkedHashMap linkedHashMap = aVar2.f6289m;
                linkedHashMap.put(lVar, cVar);
                if (aVar2.f6288l == null) {
                    aVar2.f6288l = lVar;
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar2.f6292q;
                    systemForegroundService2.f6280j.post(new androidx.work.impl.foreground.b(systemForegroundService2, intExtra, notification, intExtra2));
                    return 3;
                }
                SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar2.f6292q;
                systemForegroundService3.f6280j.post(new v4.c(systemForegroundService3, intExtra, notification));
                if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        i12 |= ((c) entry.getValue()).f16086b;
                    }
                    c cVar2 = (c) linkedHashMap.get(aVar2.f6288l);
                    if (cVar2 != null) {
                        SystemForegroundService systemForegroundService4 = (SystemForegroundService) aVar2.f6292q;
                        systemForegroundService4.f6280j.post(new androidx.work.impl.foreground.b(systemForegroundService4, cVar2.f16085a, cVar2.c, i12));
                        return 3;
                    }
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
