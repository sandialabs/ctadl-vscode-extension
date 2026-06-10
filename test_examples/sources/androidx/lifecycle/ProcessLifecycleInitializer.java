package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lf4/b;", "Landroidx/lifecycle/q;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements f4.b<q> {
    @Override // f4.b
    public final List<Class<? extends f4.b<?>>> a() {
        return EmptyList.f12981i;
    }

    @Override // f4.b
    public final q b(Context context) {
        v7.g.f(context, "context");
        f4.a c = f4.a.c(context);
        v7.g.e(c, "getInstance(context)");
        if (c.f10913b.contains(ProcessLifecycleInitializer.class)) {
            if (!n.f5411a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                v7.g.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n.a());
            }
            z zVar = z.f5425q;
            zVar.getClass();
            zVar.f5430m = new Handler();
            zVar.n.f(Lifecycle.Event.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            v7.g.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(zVar));
            return zVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
