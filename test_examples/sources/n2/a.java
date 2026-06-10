package n2;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import m2.s;
import p2.f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16069a = new Object();

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0190a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Context context, int i10) {
            int color;
            color = context.getColor(i10);
            return color;
        }

        public static <T> T b(Context context, Class<T> cls) {
            Object systemService;
            systemService = context.getSystemService(cls);
            return (T) systemService;
        }

        public static String c(Context context, Class<?> cls) {
            String systemServiceName;
            systemServiceName = context.getSystemServiceName(cls);
            return systemServiceName;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            if ((i10 & 4) != 0 && str == null) {
                Object obj = a.f16069a;
                String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                if (a1.b.w(context, str2) == 0) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
                }
                throw new RuntimeException(a4.b.m("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            return registerReceiver;
        }

        public static ComponentName b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    public static int a(Context context, String str) {
        boolean z10;
        Class<?> cls;
        Class<?> cls2;
        if (str != null) {
            if (!v2.a.a() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                s sVar = new s(context);
                if (Build.VERSION.SDK_INT >= 24) {
                    z10 = sVar.f15962a.areNotificationsEnabled();
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i10 = applicationInfo.uid;
                    try {
                        cls = Class.forName(AppOpsManager.class.getName());
                        cls2 = Integer.TYPE;
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                    }
                    if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (z10) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(context, i10) : context.getResources().getColor(i10);
    }

    public static ColorStateList c(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.c) {
            SparseArray<f.c> sparseArray = f.f16727b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f16729b.equals(resources.getConfiguration()) && ((theme == null && cVar.c == 0) || (theme != null && cVar.c == theme.hashCode()))) {
                    colorStateList2 = cVar.f16728a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = f.f16726a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z10 = true;
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (i11 < 28 || i11 > 31) {
                z10 = false;
            }
            if (!z10) {
                try {
                    colorStateList = p2.b.a(resources, resources.getXml(i10), theme);
                } catch (Exception e10) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
                }
            }
            if (colorStateList != null) {
                f.a(dVar, i10, colorStateList, theme);
                return colorStateList;
            } else if (Build.VERSION.SDK_INT >= 23) {
                return f.b.b(resources, i10, theme);
            } else {
                return resources.getColorStateList(i10);
            }
        }
        return colorStateList2;
    }
}
