package w9;

import f9.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import l8.u;
import n7.n;
import u7.l;

/* loaded from: classes.dex */
public final class f extends DeserializedMemberScope {

    /* renamed from: g  reason: collision with root package name */
    public final u f18484g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18485h;

    /* renamed from: i  reason: collision with root package name */
    public final h9.c f18486i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(u uVar, ProtoBuf$Package protoBuf$Package, f9.c cVar, f9.a aVar, d dVar, u9.e eVar, String str, u7.a<? extends Collection<h9.e>> aVar2) {
        super(r1, r2, r3, r4, aVar2);
        v7.g.f(uVar, "packageDescriptor");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(aVar, "metadataVersion");
        v7.g.f(str, "debugName");
        v7.g.f(aVar2, "classNames");
        ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Package.f14196o;
        v7.g.e(protoBuf$TypeTable, "proto.typeTable");
        f9.g gVar = new f9.g(protoBuf$TypeTable);
        f9.h hVar = f9.h.f11006b;
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Package.f14197p;
        v7.g.e(protoBuf$VersionRequirementTable, "proto.versionRequirementTable");
        u9.g a10 = eVar.a(uVar, cVar, gVar, h.a.a(protoBuf$VersionRequirementTable), aVar, dVar);
        List<ProtoBuf$Function> list = protoBuf$Package.f14194l;
        v7.g.e(list, "proto.functionList");
        List<ProtoBuf$Property> list2 = protoBuf$Package.f14195m;
        v7.g.e(list2, "proto.propertyList");
        List<ProtoBuf$TypeAlias> list3 = protoBuf$Package.n;
        v7.g.e(list3, "proto.typeAliasList");
        this.f18484g = uVar;
        this.f18485h = str;
        this.f18486i = uVar.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        s8.a.b(this.f14866b.f17920a.f17908i, noLookupLocation, this.f18484g, eVar);
        return super.e(eVar, noLookupLocation);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public final Collection f(r9.c cVar, l lVar) {
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        List i10 = i(cVar, lVar);
        Iterable<n8.b> iterable = this.f14866b.f17920a.f17910k;
        ArrayList arrayList = new ArrayList();
        for (n8.b bVar : iterable) {
            n.f2(bVar.a(this.f18486i), arrayList);
        }
        return kotlin.collections.c.z2(arrayList, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void h(ArrayList arrayList, l lVar) {
        v7.g.f(lVar, "nameFilter");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final h9.b l(h9.e eVar) {
        v7.g.f(eVar, "name");
        return new h9.b(this.f18486i, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set<h9.e> n() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set<h9.e> o() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set<h9.e> p() {
        return EmptySet.f12983i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean q(h9.e eVar) {
        boolean z10;
        v7.g.f(eVar, "name");
        if (super.q(eVar)) {
            return true;
        }
        Iterable<n8.b> iterable = this.f14866b.f17920a.f17910k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (n8.b bVar : iterable) {
                if (bVar.c(this.f18486i, eVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f18485h;
    }
}
