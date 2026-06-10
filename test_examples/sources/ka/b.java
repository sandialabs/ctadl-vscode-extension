package ka;

import android.os.Build;
import ja.w;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b extends p7.a implements w {
    private volatile Object _preHandler;

    public b() {
        super(w.a.f12807i);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // ja.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M(CoroutineContext coroutineContext, Throwable th) {
        boolean z10;
        Method method;
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (26 <= i10 && i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object obj2 = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                } catch (Throwable unused) {
                }
                if (Modifier.isPublic(method.getModifiers())) {
                    if (Modifier.isStatic(method.getModifiers())) {
                        if (z11) {
                            this._preHandler = method;
                        }
                        method = null;
                        this._preHandler = method;
                    }
                }
                z11 = false;
                if (z11) {
                }
                method = null;
                this._preHandler = method;
            }
            if (method != null) {
                obj = method.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
