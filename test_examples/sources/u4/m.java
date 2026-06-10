package u4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class m extends f<s4.b> {

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f17796g;

    public m(Context context, y4.b bVar) {
        super(context, bVar);
        Object systemService = this.f17788b.getSystemService("connectivity");
        v7.g.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f17796g = (ConnectivityManager) systemService;
    }

    @Override // u4.h
    public final Object a() {
        return l.a(this.f17796g);
    }

    @Override // u4.f
    public final IntentFilter f() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // u4.f
    public final void g(Intent intent) {
        v7.g.f(intent, "intent");
        if (v7.g.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            n4.g.d().a(l.f17795a, "Network broadcast received");
            c(l.a(this.f17796g));
        }
    }
}
