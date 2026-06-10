package d9;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* loaded from: classes.dex */
public final class c implements w9.d {

    /* renamed from: b  reason: collision with root package name */
    public final p9.b f10447b;
    public final p9.b c;

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.h f10448d;

    public c() {
        throw null;
    }

    public c(kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar, ProtoBuf$Package protoBuf$Package, g9.f fVar, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        v7.g.f(hVar, "kotlinClass");
        v7.g.f(protoBuf$Package, "packageProto");
        v7.g.f(fVar, "nameResolver");
        p9.b b5 = p9.b.b(hVar.d());
        KotlinClassHeader a10 = hVar.a();
        a10.getClass();
        boolean z10 = true;
        p9.b bVar = null;
        String str = a10.f13953a == KotlinClassHeader.Kind.f13964p ? a10.f13957f : null;
        if (str != null) {
            if (str.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                bVar = p9.b.d(str);
            }
        }
        this.f10447b = b5;
        this.c = bVar;
        this.f10448d = hVar;
        GeneratedMessageLite.d<ProtoBuf$Package, Integer> dVar = JvmProtoBuf.f14446m;
        v7.g.e(dVar, "packageModuleName");
        Integer num = (Integer) f9.e.a(protoBuf$Package, dVar);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    @Override // l8.d0
    public final void a() {
    }

    @Override // w9.d
    public final String b() {
        return "Class '" + d().b().b() + '\'';
    }

    public final h9.b d() {
        h9.c cVar;
        p9.b bVar = this.f10447b;
        String str = bVar.f16781a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = h9.c.c;
            if (cVar == null) {
                p9.b.a(7);
                throw null;
            }
        } else {
            cVar = new h9.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String e10 = bVar.e();
        v7.g.e(e10, "className.internalName");
        return new h9.b(cVar, h9.e.k(kotlin.text.b.t1(e10, '/', e10)));
    }

    public final String toString() {
        return c.class.getSimpleName() + ": " + this.f10447b;
    }
}
