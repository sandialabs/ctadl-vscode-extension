package v2;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        v7.g.f(bundle, "bundle");
        v7.g.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
