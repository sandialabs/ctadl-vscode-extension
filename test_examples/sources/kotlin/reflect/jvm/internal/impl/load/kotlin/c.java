package kotlin.reflect.jvm.internal.impl.load.kotlin;

import g9.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class c {
    public static final i a(ProtoBuf$Property protoBuf$Property, f9.c cVar, f9.g gVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        v7.g.f(protoBuf$Property, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        GeneratedMessageLite.d<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> dVar = JvmProtoBuf.f14437d;
        v7.g.e(dVar, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) f9.e.a(protoBuf$Property, dVar);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z10) {
            d.a b5 = g9.h.b(protoBuf$Property, cVar, gVar, z12);
            if (b5 == null) {
                return null;
            }
            return i.a.a(b5);
        }
        if (z11) {
            if ((jvmPropertySignature.f14470j & 2) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f14472l;
                v7.g.e(jvmMethodSignature, "signature.syntheticMethod");
                String string = cVar.getString(jvmMethodSignature.f14461k);
                String string2 = cVar.getString(jvmMethodSignature.f14462l);
                v7.g.f(string, "name");
                v7.g.f(string2, "desc");
                return new i(string.concat(string2));
            }
        }
        return null;
    }

    public static /* synthetic */ i b(ProtoBuf$Property protoBuf$Property, f9.c cVar, f9.g gVar, boolean z10, boolean z11, int i10) {
        return a(protoBuf$Property, cVar, gVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0);
    }
}
