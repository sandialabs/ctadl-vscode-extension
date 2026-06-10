package u4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f<Object> f17784a;

    public e(f<Object> fVar) {
        this.f17784a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v7.g.f(context, "context");
        v7.g.f(intent, "intent");
        this.f17784a.g(intent);
    }
}
