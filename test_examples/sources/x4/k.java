package x4;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class k {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        v7.g.f(connectivityManager, "<this>");
        v7.g.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
