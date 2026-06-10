package u4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f17782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, y4.b bVar, int i10) {
        super(context, bVar);
        this.f17782g = i10;
        if (i10 != 1) {
        } else {
            super(context, bVar);
        }
    }

    @Override // u4.h
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f17782g) {
            case 0:
                return h();
            default:
                return h();
        }
    }

    @Override // u4.f
    public final IntentFilter f() {
        switch (this.f17782g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter2;
        }
    }

    @Override // u4.f
    public final void g(Intent intent) {
        Boolean bool;
        Boolean bool2;
        switch (this.f17782g) {
            case 0:
                v7.g.f(intent, "intent");
                if (intent.getAction() != null) {
                    n4.g d5 = n4.g.d();
                    String str = d.f17783a;
                    d5.a(str, "Received " + intent.getAction());
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                                bool = Boolean.FALSE;
                            }
                            return;
                        } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                            bool = Boolean.TRUE;
                        } else {
                            return;
                        }
                        c(bool);
                        return;
                    }
                    return;
                }
                return;
            default:
                v7.g.f(intent, "intent");
                if (intent.getAction() != null) {
                    n4.g d10 = n4.g.d();
                    String str2 = n.f17797a;
                    d10.a(str2, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode2 = action2.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action2.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                bool2 = Boolean.TRUE;
                            }
                            return;
                        } else if (action2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            bool2 = Boolean.FALSE;
                        } else {
                            return;
                        }
                        c(bool2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final Boolean h() {
        int i10 = this.f17782g;
        boolean z10 = false;
        Context context = this.f17788b;
        switch (i10) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    n4.g.d().b(d.f17783a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
            default:
                Intent registerReceiver2 = context.registerReceiver(null, f());
                if (registerReceiver2 != null && registerReceiver2.getAction() != null) {
                    String action = registerReceiver2.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                }
                            }
                        } else {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
        }
    }
}
