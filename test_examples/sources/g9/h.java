package g9;

import f9.b;
import g9.d;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import n7.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.protobuf.d f11279a;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = new kotlin.reflect.jvm.internal.impl.protobuf.d();
        dVar.a(JvmProtoBuf.f14435a);
        dVar.a(JvmProtoBuf.f14436b);
        dVar.a(JvmProtoBuf.c);
        dVar.a(JvmProtoBuf.f14437d);
        dVar.a(JvmProtoBuf.f14438e);
        dVar.a(JvmProtoBuf.f14439f);
        dVar.a(JvmProtoBuf.f14440g);
        dVar.a(JvmProtoBuf.f14441h);
        dVar.a(JvmProtoBuf.f14442i);
        dVar.a(JvmProtoBuf.f14443j);
        dVar.a(JvmProtoBuf.f14444k);
        dVar.a(JvmProtoBuf.f14445l);
        dVar.a(JvmProtoBuf.f14446m);
        dVar.a(JvmProtoBuf.n);
        f11279a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.b a(ProtoBuf$Constructor protoBuf$Constructor, f9.c cVar, f9.g gVar) {
        String str;
        String t22;
        boolean z10;
        v7.g.f(protoBuf$Constructor, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        GeneratedMessageLite.d<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> dVar = JvmProtoBuf.f14435a;
        v7.g.e(dVar, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) f9.e.a(protoBuf$Constructor, dVar);
        boolean z11 = false;
        if (jvmMethodSignature != null) {
            if ((jvmMethodSignature.f14460j & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = cVar.getString(jvmMethodSignature.f14461k);
                if (jvmMethodSignature != null) {
                    if ((jvmMethodSignature.f14460j & 2) == 2) {
                        z11 = true;
                    }
                    if (z11) {
                        t22 = cVar.getString(jvmMethodSignature.f14462l);
                        return new d.b(str, t22);
                    }
                }
                List<ProtoBuf$ValueParameter> list = protoBuf$Constructor.f14088m;
                v7.g.e(list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(l.Z1(list, 10));
                for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                    v7.g.e(protoBuf$ValueParameter, "it");
                    String e10 = e(f9.f.e(protoBuf$ValueParameter, gVar), cVar);
                    if (e10 == null) {
                        return null;
                    }
                    arrayList.add(e10);
                }
                t22 = kotlin.collections.c.t2(arrayList, "", "(", ")V", null, 56);
                return new d.b(str, t22);
            }
        }
        str = "<init>";
        if (jvmMethodSignature != null) {
        }
        List<ProtoBuf$ValueParameter> list2 = protoBuf$Constructor.f14088m;
        v7.g.e(list2, "proto.valueParameterList");
        ArrayList arrayList2 = new ArrayList(l.Z1(list2, 10));
        while (r10.hasNext()) {
        }
        t22 = kotlin.collections.c.t2(arrayList2, "", "(", ")V", null, 56);
        return new d.b(str, t22);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.a b(ProtoBuf$Property protoBuf$Property, f9.c cVar, f9.g gVar, boolean z10) {
        boolean z11;
        JvmProtoBuf.JvmFieldSignature jvmFieldSignature;
        int i10;
        String e10;
        boolean z12;
        v7.g.f(protoBuf$Property, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        GeneratedMessageLite.d<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> dVar = JvmProtoBuf.f14437d;
        v7.g.e(dVar, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) f9.e.a(protoBuf$Property, dVar);
        if (jvmPropertySignature == null) {
            return null;
        }
        boolean z13 = true;
        if ((jvmPropertySignature.f14470j & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            jvmFieldSignature = jvmPropertySignature.f14471k;
        } else {
            jvmFieldSignature = null;
        }
        if (jvmFieldSignature == null && z10) {
            return null;
        }
        if (jvmFieldSignature != null) {
            if ((jvmFieldSignature.f14450j & 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i10 = jvmFieldSignature.f14451k;
                if (jvmFieldSignature != null) {
                    if ((jvmFieldSignature.f14450j & 2) != 2) {
                        z13 = false;
                    }
                    if (z13) {
                        e10 = cVar.getString(jvmFieldSignature.f14452l);
                        return new d.a(cVar.getString(i10), e10);
                    }
                }
                e10 = e(f9.f.d(protoBuf$Property, gVar), cVar);
                if (e10 == null) {
                    return null;
                }
                return new d.a(cVar.getString(i10), e10);
            }
        }
        i10 = protoBuf$Property.n;
        if (jvmFieldSignature != null) {
        }
        e10 = e(f9.f.d(protoBuf$Property, gVar), cVar);
        if (e10 == null) {
        }
        return new d.a(cVar.getString(i10), e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[LOOP:0: B:18:0x0060->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.b c(ProtoBuf$Function protoBuf$Function, f9.c cVar, f9.g gVar) {
        int i10;
        Iterator it;
        String e10;
        String concat;
        boolean z10;
        v7.g.f(protoBuf$Function, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        GeneratedMessageLite.d<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> dVar = JvmProtoBuf.f14436b;
        v7.g.e(dVar, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) f9.e.a(protoBuf$Function, dVar);
        boolean z11 = false;
        if (jvmMethodSignature != null) {
            if ((jvmMethodSignature.f14460j & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = jvmMethodSignature.f14461k;
                if (jvmMethodSignature != null) {
                    if ((jvmMethodSignature.f14460j & 2) == 2) {
                        z11 = true;
                    }
                    if (z11) {
                        concat = cVar.getString(jvmMethodSignature.f14462l);
                        return new d.b(cVar.getString(i10), concat);
                    }
                }
                List P0 = a1.c.P0(f9.f.b(protoBuf$Function, gVar));
                List<ProtoBuf$ValueParameter> list = protoBuf$Function.f14168w;
                v7.g.e(list, "proto.valueParameterList");
                ArrayList arrayList = new ArrayList(l.Z1(list, 10));
                for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                    v7.g.e(protoBuf$ValueParameter, "it");
                    arrayList.add(f9.f.e(protoBuf$ValueParameter, gVar));
                }
                ArrayList z22 = kotlin.collections.c.z2(arrayList, P0);
                ArrayList arrayList2 = new ArrayList(l.Z1(z22, 10));
                it = z22.iterator();
                while (it.hasNext()) {
                    String e11 = e((ProtoBuf$Type) it.next(), cVar);
                    if (e11 == null) {
                        return null;
                    }
                    arrayList2.add(e11);
                }
                e10 = e(f9.f.c(protoBuf$Function, gVar), cVar);
                if (e10 != null) {
                    return null;
                }
                concat = kotlin.collections.c.t2(arrayList2, "", "(", ")", null, 56).concat(e10);
                return new d.b(cVar.getString(i10), concat);
            }
        }
        i10 = protoBuf$Function.n;
        if (jvmMethodSignature != null) {
        }
        List P02 = a1.c.P0(f9.f.b(protoBuf$Function, gVar));
        List<ProtoBuf$ValueParameter> list2 = protoBuf$Function.f14168w;
        v7.g.e(list2, "proto.valueParameterList");
        ArrayList arrayList3 = new ArrayList(l.Z1(list2, 10));
        while (r1.hasNext()) {
        }
        ArrayList z222 = kotlin.collections.c.z2(arrayList3, P02);
        ArrayList arrayList22 = new ArrayList(l.Z1(z222, 10));
        it = z222.iterator();
        while (it.hasNext()) {
        }
        e10 = e(f9.f.c(protoBuf$Function, gVar), cVar);
        if (e10 != null) {
        }
    }

    public static final boolean d(ProtoBuf$Property protoBuf$Property) {
        v7.g.f(protoBuf$Property, "proto");
        b.a aVar = c.f11269a;
        b.a aVar2 = c.f11269a;
        Object l2 = protoBuf$Property.l(JvmProtoBuf.f14438e);
        v7.g.e(l2, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean c = aVar2.c(((Number) l2).intValue());
        v7.g.e(c, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return c.booleanValue();
    }

    public static String e(ProtoBuf$Type protoBuf$Type, f9.c cVar) {
        if (protoBuf$Type.r()) {
            return b.b(cVar.b(protoBuf$Type.f14285q));
        }
        return null;
    }

    public static final Pair<f, ProtoBuf$Class> f(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.b(strArr));
        f g10 = g(byteArrayInputStream, strArr2);
        ProtoBuf$Class.a aVar = ProtoBuf$Class.S;
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.c cVar = new kotlin.reflect.jvm.internal.impl.protobuf.c(byteArrayInputStream);
        kotlin.reflect.jvm.internal.impl.protobuf.h hVar = (kotlin.reflect.jvm.internal.impl.protobuf.h) aVar.a(cVar, f11279a);
        try {
            cVar.a(0);
            kotlin.reflect.jvm.internal.impl.protobuf.b.b(hVar);
            return new Pair<>(g10, (ProtoBuf$Class) hVar);
        } catch (InvalidProtocolBufferException e10) {
            e10.f14537i = hVar;
            throw e10;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) JvmProtoBuf.StringTableTypes.f14483p.c(byteArrayInputStream, f11279a);
        v7.g.e(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new f(stringTableTypes, strArr);
    }

    public static final Pair<f, ProtoBuf$Package> h(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.b(strArr));
        f g10 = g(byteArrayInputStream, strArr2);
        ProtoBuf$Package.a aVar = ProtoBuf$Package.f14191t;
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.c cVar = new kotlin.reflect.jvm.internal.impl.protobuf.c(byteArrayInputStream);
        kotlin.reflect.jvm.internal.impl.protobuf.h hVar = (kotlin.reflect.jvm.internal.impl.protobuf.h) aVar.a(cVar, f11279a);
        try {
            cVar.a(0);
            kotlin.reflect.jvm.internal.impl.protobuf.b.b(hVar);
            return new Pair<>(g10, (ProtoBuf$Package) hVar);
        } catch (InvalidProtocolBufferException e10) {
            e10.f14537i = hVar;
            throw e10;
        }
    }
}
