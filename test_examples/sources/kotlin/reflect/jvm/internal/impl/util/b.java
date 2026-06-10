package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(b bVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            if (bVar.c(eVar)) {
                return null;
            }
            return bVar.a();
        }
    }

    String a();

    String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
