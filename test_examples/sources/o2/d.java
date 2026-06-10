package o2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o2.b;
import o2.c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile c<?> f16234a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile ArrayList f16235b;

    public static boolean a(Context context, b bVar) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = bVar.f16225h;
        if (iconCompat2 == null) {
            return false;
        }
        int i10 = iconCompat2.f4616a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream f10 = iconCompat2.f(context);
        if (f10 == null || (decodeStream = BitmapFactory.decodeStream(f10)) == null) {
            return false;
        }
        if (i10 == 6) {
            iconCompat = new IconCompat(5);
            iconCompat.f4617b = decodeStream;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.f4617b = decodeStream;
        }
        bVar.f16225h = iconCompat;
        return true;
    }

    public static ArrayList b(Context context) {
        Object systemService;
        List<ShortcutInfo> dynamicShortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ShortcutManager.class);
            dynamicShortcuts = ((ShortcutManager) systemService).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                arrayList.add(new b.a(context, shortcutInfo).a());
            }
            return arrayList;
        }
        try {
            d(context).getClass();
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static List<a> c(Context context) {
        Bundle bundle;
        String string;
        if (f16235b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((a) Class.forName(string, false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f16235b == null) {
                f16235b = arrayList;
            }
        }
        return f16235b;
    }

    public static c<?> d(Context context) {
        if (f16234a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f16234a = (c) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f16234a == null) {
                f16234a = new c.a();
            }
        }
        return f16234a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(Context context) {
        Object systemService;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService(ShortcutManager.class);
            isRequestPinShortcutSupported = ((ShortcutManager) systemService).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        } else if (n2.a.a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        } else {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0)) {
                String str = resolveInfo.activityInfo.permission;
                if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                    return true;
                }
                while (r4.hasNext()) {
                }
            }
            return false;
        }
    }

    public static void f(Context context, b bVar) {
        int i10;
        Object systemService;
        boolean isRateLimitingActive;
        List<ShortcutInfo> dynamicShortcuts;
        int rank;
        Object systemService2;
        Object systemService3;
        boolean z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 31) {
            if ((bVar.f16232p & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Iterator it = ((ArrayList) c(context)).iterator();
                while (it.hasNext()) {
                    Collections.singletonList(bVar);
                    ((a) it.next()).getClass();
                }
                return;
            }
        }
        if (i11 >= 25) {
            systemService3 = context.getSystemService(ShortcutManager.class);
            i10 = ((ShortcutManager) systemService3).getMaxShortcutCountPerActivity();
        } else {
            i10 = 5;
        }
        if (i10 == 0) {
            return;
        }
        if (i11 <= 29) {
            a(context, bVar);
        }
        int i12 = -1;
        String str = null;
        if (i11 >= 30) {
            systemService2 = context.getSystemService(ShortcutManager.class);
            ((ShortcutManager) systemService2).pushDynamicShortcut(bVar.b());
        } else if (i11 >= 25) {
            systemService = context.getSystemService(ShortcutManager.class);
            ShortcutManager shortcutManager = (ShortcutManager) systemService;
            isRateLimitingActive = shortcutManager.isRateLimitingActive();
            if (isRateLimitingActive) {
                return;
            }
            dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= i10) {
                String[] strArr = new String[1];
                String str2 = null;
                int i13 = -1;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    rank = shortcutInfo.getRank();
                    if (rank > i13) {
                        str2 = shortcutInfo.getId();
                        i13 = shortcutInfo.getRank();
                    }
                }
                strArr[0] = str2;
                shortcutManager.removeDynamicShortcuts(Arrays.asList(strArr));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(bVar.b()));
        }
        c<?> d5 = d(context);
        try {
            d5.getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= i10) {
                String[] strArr2 = new String[1];
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b bVar2 = (b) it2.next();
                    int i14 = bVar2.n;
                    if (i14 > i12) {
                        str = bVar2.f16220b;
                        i12 = i14;
                    }
                }
                strArr2[0] = str;
                Arrays.asList(strArr2);
                d5.c();
            }
            Arrays.asList(bVar);
            d5.a();
            Iterator it3 = ((ArrayList) c(context)).iterator();
            while (it3.hasNext()) {
                Collections.singletonList(bVar);
                ((a) it3.next()).getClass();
            }
        } catch (Exception unused) {
            Iterator it4 = ((ArrayList) c(context)).iterator();
            while (it4.hasNext()) {
                Collections.singletonList(bVar);
                ((a) it4.next()).getClass();
            }
        } catch (Throwable th) {
            Iterator it5 = ((ArrayList) c(context)).iterator();
            while (it5.hasNext()) {
                Collections.singletonList(bVar);
                ((a) it5.next()).getClass();
            }
            h(context, bVar.f16220b);
            throw th;
        }
        h(context, bVar.f16220b);
    }

    public static List g(List list) {
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            boolean z10 = true;
            if ((bVar.f16232p & 1) == 0) {
                z10 = false;
            }
            if (z10) {
                arrayList.remove(bVar);
            }
        }
        return arrayList;
    }

    public static void h(Context context, String str) {
        Object systemService;
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService(ShortcutManager.class);
            ((ShortcutManager) systemService).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) c(context)).iterator();
        while (it.hasNext()) {
            Collections.singletonList(str);
            ((a) it.next()).getClass();
        }
    }

    public static void i(Context context, ArrayList arrayList) {
        Object systemService;
        boolean dynamicShortcuts;
        List<b> g10 = g(arrayList);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList(g10.size());
            for (b bVar : g10) {
                arrayList2.add(bVar.b());
            }
            systemService = context.getSystemService(ShortcutManager.class);
            dynamicShortcuts = ((ShortcutManager) systemService).setDynamicShortcuts(arrayList2);
            if (!dynamicShortcuts) {
                return;
            }
        }
        d(context).b();
        d(context).a();
        Iterator it = ((ArrayList) c(context)).iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    public static void j(Context context, List list) {
        Object systemService;
        boolean updateShortcuts;
        List<b> g10 = g(list);
        if (Build.VERSION.SDK_INT <= 29) {
            Iterator it = new ArrayList(g10).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!a(context, bVar)) {
                    g10.remove(bVar);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (b bVar2 : g10) {
                arrayList.add(bVar2.b());
            }
            systemService = context.getSystemService(ShortcutManager.class);
            updateShortcuts = ((ShortcutManager) systemService).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return;
            }
        }
        d(context).a();
        Iterator it2 = ((ArrayList) c(context)).iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).getClass();
        }
    }
}
