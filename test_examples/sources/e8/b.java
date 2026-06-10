package e8;

import c8.e;
import c8.j;
import f8.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static final Field a(j<?> jVar) {
        g.f(jVar, "<this>");
        KPropertyImpl<?> c = i.c(jVar);
        if (c != null) {
            return c.n.k0();
        }
        return null;
    }

    public static final Method b(e<?> eVar) {
        kotlin.reflect.jvm.internal.calls.a<?> b5;
        g.f(eVar, "<this>");
        KCallableImpl<?> a10 = i.a(eVar);
        Object m10 = (a10 == null || (b5 = a10.b()) == null) ? null : b5.m();
        if (m10 instanceof Method) {
            return (Method) m10;
        }
        return null;
    }
}
