package kotlinx.serialization.descriptors;

import ha.i;
import kotlinx.serialization.descriptors.b;
import sa.d;
import sa.e;
import sa.h;
import u7.l;
import ua.k1;
import ua.l1;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final k1 a(String str, d.i iVar) {
        g.f(iVar, "kind");
        if (!i.T0(str)) {
            for (c8.b<? extends Object> bVar : l1.f17990a.keySet()) {
                String d5 = bVar.d();
                g.c(d5);
                String a10 = l1.a(d5);
                if (i.S0(str, "kotlin." + a10) || i.S0(str, a10)) {
                    StringBuilder p10 = a4.b.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ");
                    p10.append(l1.a(a10));
                    p10.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    throw new IllegalArgumentException(kotlin.text.a.N0(p10.toString()));
                }
            }
            return new k1(str, iVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final SerialDescriptorImpl b(String str, e[] eVarArr, l lVar) {
        g.f(lVar, "builderAction");
        if (!i.T0(str)) {
            sa.a aVar = new sa.a(str);
            lVar.U(aVar);
            return new SerialDescriptorImpl(str, b.a.f15609a, aVar.c.size(), kotlin.collections.b.w2(eVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final SerialDescriptorImpl c(String str, h hVar, e[] eVarArr, l lVar) {
        g.f(str, "serialName");
        g.f(hVar, "kind");
        g.f(lVar, "builder");
        if (!i.T0(str)) {
            if (!g.a(hVar, b.a.f15609a)) {
                sa.a aVar = new sa.a(str);
                lVar.U(aVar);
                return new SerialDescriptorImpl(str, hVar, aVar.c.size(), kotlin.collections.b.w2(eVarArr), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ SerialDescriptorImpl d(String str, h hVar, e[] eVarArr) {
        return c(str, hVar, eVarArr, SerialDescriptorsKt$buildSerialDescriptor$1.f15608j);
    }
}
