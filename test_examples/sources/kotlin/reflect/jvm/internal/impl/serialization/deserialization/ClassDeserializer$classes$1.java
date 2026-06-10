package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import f9.h;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import l8.d0;
import l8.u;
import u7.l;
import u9.g;
import u9.i;

/* loaded from: classes.dex */
public final class ClassDeserializer$classes$1 extends Lambda implements l<ClassDeserializer.a, l8.b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ClassDeserializer f14767j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        super(1);
        this.f14767j = classDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC] */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l8.b U(ClassDeserializer.a aVar) {
        Object obj;
        g a10;
        boolean z10;
        DeserializedClassDescriptor deserializedClassDescriptor;
        l8.b b5;
        ClassDeserializer.a aVar2 = aVar;
        v7.g.f(aVar2, "key");
        ClassDeserializer classDeserializer = this.f14767j;
        classDeserializer.getClass();
        u9.e eVar = classDeserializer.f14763a;
        Iterator<n8.b> it = eVar.f17910k.iterator();
        do {
            boolean hasNext = it.hasNext();
            h9.b bVar = aVar2.f14765a;
            if (hasNext) {
                b5 = it.next().b(bVar);
            } else if (ClassDeserializer.c.contains(bVar)) {
                return null;
            } else {
                u9.b bVar2 = aVar2.f14766b;
                if (bVar2 == null && (bVar2 = eVar.f17903d.a(bVar)) == null) {
                    return null;
                }
                f9.c cVar = bVar2.f17897a;
                ProtoBuf$Class protoBuf$Class = bVar2.f17898b;
                f9.a aVar3 = bVar2.c;
                d0 d0Var = bVar2.f17899d;
                h9.b g10 = bVar.g();
                if (g10 != null) {
                    l8.b a11 = classDeserializer.a(g10, null);
                    if (a11 instanceof DeserializedClassDescriptor) {
                        deserializedClassDescriptor = (DeserializedClassDescriptor) a11;
                    } else {
                        deserializedClassDescriptor = null;
                    }
                    if (deserializedClassDescriptor == null) {
                        return null;
                    }
                    h9.e j2 = bVar.j();
                    v7.g.e(j2, "classId.shortClassName");
                    if (!deserializedClassDescriptor.S0().m().contains(j2)) {
                        return null;
                    }
                    a10 = deserializedClassDescriptor.f14831t;
                } else {
                    h9.c h10 = bVar.h();
                    v7.g.e(h10, "classId.packageFqName");
                    Iterator it2 = m0.b.T0(eVar.f17905f, h10).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            u uVar = (u) obj;
                            if (uVar instanceof i) {
                                i iVar = (i) uVar;
                                h9.e j10 = bVar.j();
                                v7.g.e(j10, "classId.shortClassName");
                                iVar.getClass();
                                if (!((DeserializedMemberScope) ((DeserializedPackageFragmentImpl) iVar).w()).m().contains(j10)) {
                                    z10 = false;
                                    continue;
                                    if (z10) {
                                        break;
                                    }
                                }
                            }
                            z10 = true;
                            continue;
                            if (z10) {
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    u uVar2 = (u) obj;
                    if (uVar2 == null) {
                        return null;
                    }
                    u9.e eVar2 = classDeserializer.f14763a;
                    ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Class.M;
                    v7.g.e(protoBuf$TypeTable, "classProto.typeTable");
                    f9.g gVar = new f9.g(protoBuf$TypeTable);
                    h hVar = h.f11006b;
                    ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Class.O;
                    v7.g.e(protoBuf$VersionRequirementTable, "classProto.versionRequirementTable");
                    a10 = eVar2.a(uVar2, cVar, gVar, h.a.a(protoBuf$VersionRequirementTable), aVar3, null);
                }
                return new DeserializedClassDescriptor(a10, protoBuf$Class, cVar, aVar3, d0Var);
            }
        } while (b5 == null);
        return b5;
    }
}
