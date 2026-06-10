package r7;

import java.lang.reflect.Method;
import kotlin.random.Random;
import v7.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: r7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0216a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f17133a;

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[LOOP:0: B:3:0x000e->B:16:0x003a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0038 A[SYNTHETIC] */
        static {
            Method method;
            boolean z10;
            Method[] methods = Throwable.class.getMethods();
            g.e(methods, "throwableMethods");
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    break;
                }
                Method method2 = methods[i10];
                if (g.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    g.e(parameterTypes, "it.parameterTypes");
                    z10 = true;
                    if (parameterTypes.length == 1) {
                        method = parameterTypes[0];
                    }
                    if (g.a(method, Throwable.class)) {
                        if (!z10) {
                            method = method2;
                            break;
                        }
                        i10++;
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            f17133a = method;
            int length2 = methods.length;
            for (int i11 = 0; i11 < length2 && !g.a(methods[i11].getName(), "getSuppressed"); i11++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) {
        g.f(th, "cause");
        g.f(th2, "exception");
        Method method = C0216a.f17133a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public Random b() {
        return new z7.b();
    }
}
