package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.f;
import l8.g0;
import m0.b;
import m8.e;
import n7.l;
import o8.c;
import u9.e;
import u9.g;
import x9.h;
import y9.r;

/* loaded from: classes.dex */
public final class DeserializedTypeParameterDescriptor extends c {

    /* renamed from: s  reason: collision with root package name */
    public final g f14890s;

    /* renamed from: t  reason: collision with root package name */
    public final ProtoBuf$TypeParameter f14891t;

    /* renamed from: u  reason: collision with root package name */
    public final w9.a f14892u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedTypeParameterDescriptor(g gVar, ProtoBuf$TypeParameter protoBuf$TypeParameter, int i10) {
        super(r2, r3, r4, r5, r1, protoBuf$TypeParameter.n, i10, g0.a.f15837a);
        Variance variance;
        v7.g.f(gVar, "c");
        e eVar = gVar.f17920a;
        h hVar = eVar.f17901a;
        f fVar = gVar.c;
        e.a.C0187a c0187a = e.a.f16014a;
        h9.e r02 = b.r0(gVar.f17921b, protoBuf$TypeParameter.f14354m);
        ProtoBuf$TypeParameter.Variance variance2 = protoBuf$TypeParameter.f14355o;
        v7.g.e(variance2, "proto.variance");
        int ordinal = variance2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    variance = Variance.INVARIANT;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                variance = Variance.OUT_VARIANCE;
            }
        } else {
            variance = Variance.IN_VARIANCE;
        }
        this.f14890s = gVar;
        this.f14891t = protoBuf$TypeParameter;
        this.f14892u = new w9.a(eVar.f17901a, new DeserializedTypeParameterDescriptor$annotations$1(this));
    }

    @Override // o8.i
    public final void S0(r rVar) {
        v7.g.f(rVar, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // o8.i
    public final List<r> T0() {
        g gVar = this.f14890s;
        f9.g gVar2 = gVar.f17922d;
        ProtoBuf$TypeParameter protoBuf$TypeParameter = this.f14891t;
        v7.g.f(protoBuf$TypeParameter, "<this>");
        v7.g.f(gVar2, "typeTable");
        List<ProtoBuf$Type> list = protoBuf$TypeParameter.f14356p;
        if (!(!list.isEmpty())) {
            list = null;
        }
        ArrayList arrayList = list;
        if (list == null) {
            List<Integer> list2 = protoBuf$TypeParameter.f14357q;
            v7.g.e(list2, "upperBoundIdList");
            ArrayList arrayList2 = new ArrayList(l.Z1(list2, 10));
            for (Integer num : list2) {
                v7.g.e(num, "it");
                arrayList2.add(gVar2.a(num.intValue()));
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return a1.c.N0(DescriptorUtilsKt.e(this).n());
        }
        TypeDeserializer typeDeserializer = gVar.f17926h;
        ArrayList arrayList3 = new ArrayList(l.Z1(arrayList, 10));
        for (ProtoBuf$Type protoBuf$Type : arrayList) {
            arrayList3.add(typeDeserializer.g(protoBuf$Type));
        }
        return arrayList3;
    }

    @Override // m8.b, m8.a
    public final m8.e getAnnotations() {
        return this.f14892u;
    }
}
