package f9;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;

/* loaded from: classes.dex */
public final class f {
    public static final ProtoBuf$Type a(ProtoBuf$Type protoBuf$Type, g gVar) {
        boolean z10;
        v7.g.f(protoBuf$Type, "<this>");
        v7.g.f(gVar, "typeTable");
        int i10 = protoBuf$Type.f14280k;
        boolean z11 = true;
        if ((i10 & 256) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return protoBuf$Type.f14289u;
        }
        if ((i10 & 512) != 512) {
            z11 = false;
        }
        if (z11) {
            return gVar.a(protoBuf$Type.f14290v);
        }
        return null;
    }

    public static final ProtoBuf$Type b(ProtoBuf$Function protoBuf$Function, g gVar) {
        boolean z10;
        v7.g.f(protoBuf$Function, "<this>");
        v7.g.f(gVar, "typeTable");
        int i10 = protoBuf$Function.f14157k;
        boolean z11 = true;
        if ((i10 & 32) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return protoBuf$Function.f14163r;
        }
        if ((i10 & 64) != 64) {
            z11 = false;
        }
        if (z11) {
            return gVar.a(protoBuf$Function.f14164s);
        }
        return null;
    }

    public static final ProtoBuf$Type c(ProtoBuf$Function protoBuf$Function, g gVar) {
        boolean z10;
        v7.g.f(protoBuf$Function, "<this>");
        v7.g.f(gVar, "typeTable");
        int i10 = protoBuf$Function.f14157k;
        boolean z11 = true;
        if ((i10 & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Function.f14160o;
            v7.g.e(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((i10 & 16) != 16) {
            z11 = false;
        }
        if (z11) {
            return gVar.a(protoBuf$Function.f14161p);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final ProtoBuf$Type d(ProtoBuf$Property protoBuf$Property, g gVar) {
        boolean z10;
        v7.g.f(protoBuf$Property, "<this>");
        v7.g.f(gVar, "typeTable");
        int i10 = protoBuf$Property.f14219k;
        boolean z11 = true;
        if ((i10 & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Property.f14222o;
            v7.g.e(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((i10 & 16) != 16) {
            z11 = false;
        }
        if (z11) {
            return gVar.a(protoBuf$Property.f14223p);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final ProtoBuf$Type e(ProtoBuf$ValueParameter protoBuf$ValueParameter, g gVar) {
        boolean z10;
        v7.g.f(gVar, "typeTable");
        int i10 = protoBuf$ValueParameter.f14385k;
        boolean z11 = true;
        if ((i10 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ProtoBuf$Type protoBuf$Type = protoBuf$ValueParameter.n;
            v7.g.e(protoBuf$Type, "type");
            return protoBuf$Type;
        }
        if ((i10 & 8) != 8) {
            z11 = false;
        }
        if (z11) {
            return gVar.a(protoBuf$ValueParameter.f14388o);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
