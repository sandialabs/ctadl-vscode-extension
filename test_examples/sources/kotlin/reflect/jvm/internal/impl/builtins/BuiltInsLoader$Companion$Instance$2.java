package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class BuiltInsLoader$Companion$Instance$2 extends Lambda implements u7.a<BuiltInsLoader> {

    /* renamed from: j  reason: collision with root package name */
    public static final BuiltInsLoader$Companion$Instance$2 f13295j = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    @Override // u7.a
    public final BuiltInsLoader k0() {
        ServiceLoader load = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        v7.g.e(load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) kotlin.collections.c.o2(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
