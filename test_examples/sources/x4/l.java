package x4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import n4.g;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18591a = n4.g.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        int i10;
        String str;
        String str2 = "enabled";
        String str3 = f18591a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            n4.g d5 = n4.g.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z10) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
            d5.a(str3, sb.toString());
        } catch (Exception e10) {
            n4.g d10 = n4.g.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (!z10) {
                str2 = "disabled";
            }
            sb2.append(str2);
            String sb3 = sb2.toString();
            if (((g.a) d10).c <= 3) {
                Log.d(str3, sb3, e10);
            }
        }
    }
}
