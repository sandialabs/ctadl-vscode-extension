package u8;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.c f17862a;

    /* renamed from: b  reason: collision with root package name */
    public static final h9.b f17863b;

    static {
        h9.c cVar = new h9.c("kotlin.jvm.JvmField");
        f17862a = cVar;
        h9.b.l(cVar);
        h9.b.l(new h9.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f17863b = h9.b.f("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        v7.g.f(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + m0.b.B(str);
    }

    public static final String b(String str) {
        String B;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            B = str.substring(2);
            v7.g.e(B, "this as java.lang.String).substring(startIndex)");
        } else {
            B = m0.b.B(str);
        }
        sb.append(B);
        return sb.toString();
    }

    public static final boolean c(String str) {
        v7.g.f(str, "name");
        if (!ha.i.X0(str, "is", false) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (v7.g.h(97, charAt) <= 0 && v7.g.h(charAt, 122) <= 0) {
            return false;
        }
        return true;
    }
}
