package androidx.work.impl.workers;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o4.a0;
import v7.g;
import w4.j;
import w4.n;
import w4.t;
import w4.w;
import z4.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.f(context, "context");
        g.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final d.a.c i() {
        a0 d5 = a0.d(this.f6218i);
        g.e(d5, "getInstance(applicationContext)");
        WorkDatabase workDatabase = d5.c;
        g.e(workDatabase, "workManager.workDatabase");
        t w10 = workDatabase.w();
        n u10 = workDatabase.u();
        w x3 = workDatabase.x();
        j t10 = workDatabase.t();
        ArrayList i10 = w10.i(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList b5 = w10.b();
        ArrayList c = w10.c();
        if (!i10.isEmpty()) {
            n4.g d10 = n4.g.d();
            String str = b.f19118a;
            d10.e(str, "Recently completed work:\n\n");
            n4.g.d().e(str, b.a(u10, x3, t10, i10));
        }
        if (!b5.isEmpty()) {
            n4.g d11 = n4.g.d();
            String str2 = b.f19118a;
            d11.e(str2, "Running work:\n\n");
            n4.g.d().e(str2, b.a(u10, x3, t10, b5));
        }
        if (!c.isEmpty()) {
            n4.g d12 = n4.g.d();
            String str3 = b.f19118a;
            d12.e(str3, "Enqueued work:\n\n");
            n4.g.d().e(str3, b.a(u10, x3, t10, c));
        }
        return new d.a.c();
    }
}
