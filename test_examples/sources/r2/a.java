package r2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import e3.j;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f17045a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17046b;
    public static Method c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f17047d;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0214a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Drawable drawable) {
            int layoutDirection;
            layoutDirection = drawable.getLayoutDirection();
            return layoutDirection;
        }

        public static boolean b(Drawable drawable, int i10) {
            return j.y(drawable, i10);
        }
    }

    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable b5;
        int i10 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i10 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            b5 = C0214a.c((InsetDrawable) drawable);
        } else if (!(drawable instanceof r2.c)) {
            if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                return;
            }
            int childCount = drawableContainerState.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                Drawable b10 = C0214a.b(drawableContainerState, i11);
                if (b10 != null) {
                    a(b10);
                }
            }
            return;
        } else {
            b5 = ((r2.c) drawable).b();
        }
        a(b5);
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f17047d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f17047d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                c = null;
            }
        }
        return 0;
    }

    public static boolean c(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i10);
        }
        if (!f17046b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f17045a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f17046b = true;
        }
        Method method = f17045a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f17045a = null;
            }
        }
        return false;
    }

    public static void d(Drawable drawable, int i10) {
        b.g(drawable, i10);
    }

    public static void e(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void f(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    public static Drawable g(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof r2.b)) ? new e(drawable) : drawable;
    }
}
