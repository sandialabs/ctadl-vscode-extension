package ka;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12955a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object Q;
        try {
            Q = new kotlinx.coroutines.android.a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        if (Q instanceof Result.Failure) {
            Q = null;
        }
        e eVar = (e) Q;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
