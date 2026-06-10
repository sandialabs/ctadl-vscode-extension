package d;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static Field f10338a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10339b;
    public static Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10340d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f10341e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f10342f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f10343g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f10344h;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f10340d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f10340d = true;
        }
        Class<?> cls = c;
        if (cls == null) {
            return;
        }
        if (!f10342f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f10341e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f10342f = true;
        }
        Field field = f10341e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
