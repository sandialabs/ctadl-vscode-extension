package m2;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f15913i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f15914j;

    public e(Object obj, Object obj2) {
        this.f15913i = obj;
        this.f15914j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f15917d;
            Object obj = this.f15914j;
            Object obj2 = this.f15913i;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f15918e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
