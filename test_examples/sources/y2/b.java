package y2;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f18799a;

    /* loaded from: classes.dex */
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: y2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0242b {
        public static ULocale a(Object obj) {
            ULocale addLikelySubtags;
            addLikelySubtags = ULocale.addLikelySubtags((ULocale) obj);
            return addLikelySubtags;
        }

        public static ULocale b(Locale locale) {
            ULocale forLocale;
            forLocale = ULocale.forLocale(locale);
            return forLocale;
        }

        public static String c(Object obj) {
            String script;
            script = ((ULocale) obj).getScript();
            return script;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f18799a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0242b.c(C0242b.a(C0242b.b(locale)));
        }
        try {
            return a.a((Locale) f18799a.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("ICUCompat", e);
            return a.a(locale);
        } catch (InvocationTargetException e11) {
            e = e11;
            Log.w("ICUCompat", e);
            return a.a(locale);
        }
    }
}
