package u4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class a extends f<Boolean> {
    public a(Context context, y4.b bVar) {
        super(context, bVar);
    }

    @Override // u4.h
    public final Object a() {
        Intent registerReceiver = this.f17788b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            n4.g.d().b(b.f17781a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 23) {
        }
        return Boolean.valueOf(z10);
    }

    @Override // u4.f
    public final IntentFilter f() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    @Override // u4.f
    public final void g(Intent intent) {
        Boolean bool;
        v7.g.f(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        n4.g.d().a(b.f17781a, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    return;
                }
                bool = Boolean.FALSE;
                c(bool);
                return;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    return;
                }
                bool = Boolean.FALSE;
                c(bool);
                return;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    return;
                }
                bool = Boolean.TRUE;
                c(bool);
                return;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    return;
                }
                bool = Boolean.TRUE;
                c(bool);
                return;
            default:
                return;
        }
    }
}
