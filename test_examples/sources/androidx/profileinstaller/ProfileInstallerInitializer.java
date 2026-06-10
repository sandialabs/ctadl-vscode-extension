package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p2.g;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements f4.b<c> {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: w3.b
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    runnable.run();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    @Override // f4.b
    public final List<Class<? extends f4.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // f4.b
    public final c b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        a.a(new g(this, 2, context.getApplicationContext()));
        return new c();
    }
}
