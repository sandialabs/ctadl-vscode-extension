package kotlin.reflect.jvm;

import f8.i;
import g9.e;
import g9.f;
import g9.h;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.b;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import m7.c;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final KFunctionImpl a(c cVar) {
        boolean z10;
        g.f(cVar, "<this>");
        Metadata metadata = (Metadata) cVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        boolean z11 = true;
        if (d12.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        String[] d22 = metadata.d2();
        d dVar = h.f11279a;
        g.f(d22, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(g9.a.b(d12));
        f g10 = h.g(byteArrayInputStream, d22);
        ProtoBuf$Function.a aVar = ProtoBuf$Function.D;
        d dVar2 = h.f11279a;
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.protobuf.c cVar2 = new kotlin.reflect.jvm.internal.impl.protobuf.c(byteArrayInputStream);
        kotlin.reflect.jvm.internal.impl.protobuf.h hVar = (kotlin.reflect.jvm.internal.impl.protobuf.h) aVar.a(cVar2, dVar2);
        try {
            cVar2.a(0);
            b.b(hVar);
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) hVar;
            int[] mv = metadata.mv();
            if ((metadata.xi() & 8) == 0) {
                z11 = false;
            }
            e eVar = new e(mv, z11);
            Class<?> cls = cVar.getClass();
            ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Function.f14169x;
            g.e(protoBuf$TypeTable, "proto.typeTable");
            return new KFunctionImpl(kotlin.reflect.jvm.internal.a.f13236j, (kotlin.reflect.jvm.internal.impl.descriptors.g) i.f(cls, protoBuf$Function, g10, new f9.g(protoBuf$TypeTable), eVar, ReflectLambdaKt$reflect$descriptor$1.f13075r));
        } catch (InvalidProtocolBufferException e10) {
            e10.f14537i = hVar;
            throw e10;
        }
    }
}
