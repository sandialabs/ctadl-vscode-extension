package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import n4.g;
import n4.h;
import o4.a0;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6279a = g.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        g d5 = g.d();
        String str = f6279a;
        d5.a(str, "Requesting diagnostics");
        try {
            a0 d10 = a0.d(context);
            d10.getClass();
            d10.b(Collections.singletonList(new h.a(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e10) {
            g.d().c(str, "WorkManager is not initialized", e10);
        }
    }
}
