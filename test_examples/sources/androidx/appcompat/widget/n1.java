package androidx.appcompat.widget;

import a3.j0;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1056a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1057b;

    static {
        f1057b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1056a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, a3.v0> weakHashMap = a3.j0.f188a;
        if (j0.e.d(view) == 1) {
            return true;
        }
        return false;
    }
}
