package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f971a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f972b = new int[0];
    public static final Rect c = new Rect();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f973a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f974b;
        public static final Field c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f975d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f976e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f977f;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                                if (z10) {
                                }
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                        }
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                        }
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                        }
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f974b = null;
                c = null;
                f975d = null;
                f976e = null;
                f977f = null;
                f973a = false;
                return;
            }
            f974b = method;
            c = field;
            f975d = field2;
            f976e = field3;
            f977f = field4;
            f973a = true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 != 21 || !"android.graphics.drawable.VectorDrawable".equals(name)) && (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        b(drawable);
    }

    public static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f972b);
            drawable.setState(state);
        }
        drawable.setState(f971a);
        drawable.setState(state);
    }

    public static Rect c(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            Insets a10 = b.a(drawable);
            i10 = a10.left;
            i11 = a10.top;
            i12 = a10.right;
            i13 = a10.bottom;
            return new Rect(i10, i11, i12, i13);
        }
        if (drawable instanceof r2.c) {
            drawable = ((r2.c) drawable).b();
        }
        if (i14 < 29) {
            if (a.f973a) {
                try {
                    Object invoke = a.f974b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(a.c.getInt(invoke), a.f975d.getInt(invoke), a.f976e.getInt(invoke), a.f977f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z10 = a.f973a;
        }
        return c;
    }

    public static PorterDuff.Mode d(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case ma.i.f16049q /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
