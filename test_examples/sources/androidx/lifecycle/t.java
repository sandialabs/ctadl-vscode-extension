package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class t extends Service implements q {

    /* renamed from: i  reason: collision with root package name */
    public final h0 f5421i = new h0(this);

    @Override // androidx.lifecycle.q
    public final r i0() {
        return this.f5421i.f5392a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        v7.g.f(intent, "intent");
        this.f5421i.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5421i.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        h0 h0Var = this.f5421i;
        h0Var.a(event);
        h0Var.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f5421i.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
