package u4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class j extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17792a;

    public j(k kVar) {
        this.f17792a = kVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        v7.g.f(network, "network");
        v7.g.f(networkCapabilities, "capabilities");
        n4.g d5 = n4.g.d();
        String str = l.f17795a;
        d5.a(str, "Network capabilities changed: " + networkCapabilities);
        k kVar = this.f17792a;
        kVar.c(l.a(kVar.f17793f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        v7.g.f(network, "network");
        n4.g.d().a(l.f17795a, "Network connection lost");
        k kVar = this.f17792a;
        kVar.c(l.a(kVar.f17793f));
    }
}
