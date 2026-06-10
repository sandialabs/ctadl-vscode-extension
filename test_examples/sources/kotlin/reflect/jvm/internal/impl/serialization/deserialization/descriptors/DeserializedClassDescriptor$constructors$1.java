package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import n7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$constructors$1 extends Lambda implements u7.a<Collection<? extends b>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$constructors$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14857j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final Collection<? extends b> k0() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14857j;
        List<ProtoBuf$Constructor> list = deserializedClassDescriptor.f14825m.f14060x;
        g.e(list, "classProto.constructorList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a4.b.v(f9.b.f10988m, ((ProtoBuf$Constructor) obj).f14087l, "IS_SECONDARY.get(it.flags)")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            u9.g gVar = deserializedClassDescriptor.f14831t;
            if (hasNext) {
                ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) it.next();
                MemberDeserializer memberDeserializer = gVar.f17927i;
                g.e(protoBuf$Constructor, "it");
                arrayList2.add(memberDeserializer.d(protoBuf$Constructor, false));
            } else {
                return c.z2(gVar.f17920a.n.e(deserializedClassDescriptor), c.z2(a1.c.P0(deserializedClassDescriptor.A0()), arrayList2));
            }
        }
    }
}
