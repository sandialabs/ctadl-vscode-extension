package f8;

import kotlin.Result;
import u7.l;

/* loaded from: classes.dex */
public final class a {
    static {
        Object Q;
        try {
            Q = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        if (!(Q instanceof Result.Failure)) {
            Class cls = (Class) Q;
            Q = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (Q instanceof Result.Failure) {
            Q = obj;
        }
        ((Boolean) Q).booleanValue();
    }

    public static final b a(l lVar) {
        v7.g.f(lVar, "compute");
        return new b(lVar);
    }
}
