package z9;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import v7.g;
import y9.e0;

/* loaded from: classes.dex */
public final class f {
    public static final String a(e0 e0Var) {
        StringBuilder sb = new StringBuilder();
        b("type: " + e0Var, sb);
        b("hashCode: " + e0Var.hashCode(), sb);
        b("javaClass: " + e0Var.getClass().getCanonicalName(), sb);
        for (l8.f c = e0Var.c(); c != null; c = c.c()) {
            b("fqName: ".concat(DescriptorRenderer.f14593a.F(c)), sb);
            b("javaClass: " + c.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final void b(String str, StringBuilder sb) {
        g.f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }
}
