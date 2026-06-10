package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import l8.c0;
import l8.z;
import y9.r;

/* loaded from: classes.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: a  reason: collision with root package name */
    public static final DescriptorRendererImpl f13232a = DescriptorRenderer.f14593a;

    public static void a(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        boolean z10;
        c0 g10 = f8.i.g(aVar);
        c0 R = aVar.R();
        if (g10 != null) {
            r b5 = g10.b();
            v7.g.e(b5, "receiver.type");
            sb.append(d(b5));
            sb.append(".");
        }
        if (g10 != null && R != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb.append("(");
        }
        if (R != null) {
            r b10 = R.b();
            v7.g.e(b10, "receiver.type");
            sb.append(d(b10));
            sb.append(".");
        }
        if (z10) {
            sb.append(")");
        }
    }

    public static String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        v7.g.f(eVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, eVar);
        h9.e name = eVar.getName();
        v7.g.e(name, "descriptor.name");
        sb.append(f13232a.t(name, true));
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = eVar.m();
        v7.g.e(m10, "descriptor.valueParameters");
        kotlin.collections.c.s2(m10, sb, ", ", "(", ")", ReflectionObjectRenderer$renderFunction$1$1.f13233j, 48);
        sb.append(": ");
        r k3 = eVar.k();
        v7.g.c(k3);
        sb.append(d(k3));
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String c(z zVar) {
        v7.g.f(zVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.M() ? "var " : "val ");
        a(sb, zVar);
        h9.e name = zVar.getName();
        v7.g.e(name, "descriptor.name");
        sb.append(f13232a.t(name, true));
        sb.append(": ");
        r b5 = zVar.b();
        v7.g.e(b5, "descriptor.type");
        sb.append(d(b5));
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String d(r rVar) {
        v7.g.f(rVar, "type");
        return f13232a.u(rVar);
    }
}
