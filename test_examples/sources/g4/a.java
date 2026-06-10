package g4;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f11222a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f11223b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        boolean isEnabled;
        try {
            if (f11223b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        boolean z10 = false;
        try {
            if (f11223b == null) {
                f11222a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f11223b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            z10 = ((Boolean) f11223b.invoke(null, Long.valueOf(f11222a))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
        }
        return z10;
    }
}
