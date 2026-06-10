package x4;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class j {
    public static final Network a(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        v7.g.f(connectivityManager, "<this>");
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
