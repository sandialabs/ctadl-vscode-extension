package y4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import x4.o;

/* loaded from: classes.dex */
public final class b implements y4.a {

    /* renamed from: a  reason: collision with root package name */
    public final o f18884a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f18885b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f18885b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f18884a = new o(executorService);
    }

    public final void a(Runnable runnable) {
        this.f18884a.execute(runnable);
    }
}
