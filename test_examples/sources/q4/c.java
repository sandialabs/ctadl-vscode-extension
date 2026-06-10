package q4;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ma.i;
import n4.g;
import o4.r;
import w4.l;
import w4.s;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: j  reason: collision with root package name */
    public static final String f16920j = g.f("SystemAlarmScheduler");

    /* renamed from: i  reason: collision with root package name */
    public final Context f16921i;

    public c(Context context) {
        this.f16921i = context.getApplicationContext();
    }

    @Override // o4.r
    public final void a(String str) {
        String str2 = androidx.work.impl.background.systemalarm.a.f6241m;
        Context context = this.f16921i;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // o4.r
    public final void c(s... sVarArr) {
        for (s sVar : sVarArr) {
            g.d().a(f16920j, "Scheduling work with workSpecId " + sVar.f18334a);
            l x3 = i.x(sVar);
            String str = androidx.work.impl.background.systemalarm.a.f6241m;
            Context context = this.f16921i;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            androidx.work.impl.background.systemalarm.a.d(intent, x3);
            context.startService(intent);
        }
    }

    @Override // o4.r
    public final boolean f() {
        return true;
    }
}
