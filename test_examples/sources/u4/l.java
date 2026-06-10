package u4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17795a;

    static {
        String f10 = n4.g.f("NetworkStateTracker");
        v7.g.e(f10, "tagWithPrefix(\"NetworkStateTracker\")");
        f17795a = f10;
    }

    public static final s4.b a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities a10;
        boolean b5;
        v7.g.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                a10 = x4.i.a(connectivityManager, x4.j.a(connectivityManager));
            } catch (SecurityException e10) {
                n4.g.d().c(f17795a, "Unable to validate active network", e10);
            }
            if (a10 != null) {
                b5 = x4.i.b(a10, 16);
                boolean a11 = u2.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z11 = false;
                }
                return new s4.b(z10, b5, a11, z11);
            }
        }
        b5 = false;
        boolean a112 = u2.a.a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z11 = false;
        return new s4.b(z10, b5, a112, z11);
    }
}
