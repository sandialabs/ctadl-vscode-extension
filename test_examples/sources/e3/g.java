package e3;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Method f10635a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10636b;
    public static Field c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10637d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(PopupWindow popupWindow) {
            boolean overlapAnchor;
            overlapAnchor = popupWindow.getOverlapAnchor();
            return overlapAnchor;
        }

        public static int b(PopupWindow popupWindow) {
            int windowLayoutType;
            windowLayoutType = popupWindow.getWindowLayoutType();
            return windowLayoutType;
        }

        public static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        public static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z10);
            return;
        }
        if (!f10637d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f10637d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i10);
            return;
        }
        if (!f10636b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f10635a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f10636b = true;
        }
        Method method = f10635a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
