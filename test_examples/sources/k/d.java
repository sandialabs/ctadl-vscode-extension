package k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: i  reason: collision with root package name */
    public final Object f12825i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f12826j = Executors.newFixedThreadPool(4, new a());

    /* renamed from: k  reason: collision with root package name */
    public volatile Handler f12827k;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f12828a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f12828a.getAndIncrement());
            return thread;
        }
    }

    public static Handler L0(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
