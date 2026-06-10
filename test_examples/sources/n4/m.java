package n4;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16097a = g.f("WorkerFactory");

    public final androidx.work.d a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f16097a;
        androidx.work.d dVar = null;
        try {
            cls = Class.forName(str).asSubclass(androidx.work.d.class);
        } catch (Throwable th) {
            g d5 = g.d();
            d5.c(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                dVar = (androidx.work.d) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                g d10 = g.d();
                d10.c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (dVar != null && dVar.f6221l) {
            String name = getClass().getName();
            throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return dVar;
    }
}
