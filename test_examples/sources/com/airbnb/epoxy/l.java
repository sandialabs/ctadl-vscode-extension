package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f6653a = a(Looper.getMainLooper(), false);

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f6654b = a(Looper.getMainLooper(), true);
    public static Handler c;

    public static Handler a(Looper looper, boolean z10) {
        Handler createAsync;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 28) {
                createAsync = Handler.createAsync(looper);
                return createAsync;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (Throwable unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
