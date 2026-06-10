package m2;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f15915a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f15916b;
    public static final Field c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f15917d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f15918e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f15919f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f15920g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f15921a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f15922b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15923d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f15924e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15925f = false;

        public a(Activity activity) {
            this.f15922b = activity;
            this.c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f15922b == activity) {
                this.f15922b = null;
                this.f15924e = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
            r5.f15925f = true;
            r5.f15921a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onActivityPaused(Activity activity) {
            if (this.f15924e && !this.f15925f && !this.f15923d) {
                Object obj = this.f15921a;
                boolean z10 = false;
                try {
                    Object obj2 = f.c.get(activity);
                    if (obj2 == obj && activity.hashCode() == this.c) {
                        f.f15920g.postAtFrontOfQueue(new e(f.f15916b.get(activity), obj2));
                        z10 = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f15922b == activity) {
                this.f15923d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class<?> cls2;
        Method declaredMethod2;
        int i10;
        boolean z10;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f15915a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f15916b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        c = field2;
        Class<?> cls3 = f15915a;
        if (cls3 != null) {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f15917d = declaredMethod;
            cls2 = f15915a;
            if (cls2 == null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f15918e = declaredMethod2;
                Class<?> cls4 = f15915a;
                i10 = Build.VERSION.SDK_INT;
                if (i10 != 26 && i10 != 27) {
                    z10 = false;
                    if (z10 && cls4 != null) {
                        try {
                            Class<?> cls5 = Boolean.TYPE;
                            Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                            declaredMethod3.setAccessible(true);
                            method = declaredMethod3;
                        } catch (Throwable unused6) {
                        }
                    }
                    f15919f = method;
                }
                z10 = true;
                if (z10) {
                    Class<?> cls52 = Boolean.TYPE;
                    Method declaredMethod32 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
                    declaredMethod32.setAccessible(true);
                    method = declaredMethod32;
                }
                f15919f = method;
            }
            declaredMethod2 = null;
            f15918e = declaredMethod2;
            Class<?> cls42 = f15915a;
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 26) {
                z10 = false;
                if (z10) {
                }
                f15919f = method;
            }
            z10 = true;
            if (z10) {
            }
            f15919f = method;
        }
        declaredMethod = null;
        f15917d = declaredMethod;
        cls2 = f15915a;
        if (cls2 == null) {
        }
        declaredMethod2 = null;
        f15918e = declaredMethod2;
        Class<?> cls422 = f15915a;
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
        }
        z10 = true;
        if (z10) {
        }
        f15919f = method;
    }
}
