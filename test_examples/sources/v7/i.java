package v7;

import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final j f18169a;

    /* renamed from: b  reason: collision with root package name */
    public static final c8.b[] f18170b;

    static {
        j jVar = null;
        try {
            jVar = (j) kotlin.reflect.jvm.internal.h.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jVar == null) {
            jVar = new j();
        }
        f18169a = jVar;
        f18170b = new c8.b[0];
    }

    public static c8.b a(Class cls) {
        return f18169a.b(cls);
    }

    public static c8.g b(MutablePropertyReference1 mutablePropertyReference1) {
        return f18169a.d(mutablePropertyReference1);
    }

    public static c8.i c(PropertyReference1 propertyReference1) {
        return f18169a.f(propertyReference1);
    }
}
