package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import l8.b;
import l8.f;
import l8.u;
import u9.e;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$sealedSubclasses$1 extends Lambda implements u7.a<Collection<? extends b>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14859j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14859j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final Collection<? extends b> k0() {
        Modality modality = Modality.SEALED;
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14859j;
        if (deserializedClassDescriptor.f14828q != modality) {
            return EmptyList.f12981i;
        }
        List<Integer> list = deserializedClassDescriptor.f14825m.C;
        g.e(list, "fqNames");
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Integer num : list) {
                u9.g gVar = deserializedClassDescriptor.f14831t;
                e eVar = gVar.f17920a;
                g.e(num, "index");
                b b5 = eVar.b(m0.b.j0(gVar.f17921b, num.intValue()));
                if (b5 != null) {
                    arrayList.add(b5);
                }
            }
            return arrayList;
        } else if (deserializedClassDescriptor.f14828q != modality) {
            return EmptyList.f12981i;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f fVar = deserializedClassDescriptor.f14836y;
            if (fVar instanceof u) {
                k9.b.L0(deserializedClassDescriptor, linkedHashSet, ((u) fVar).w(), false);
            }
            k9.b.L0(deserializedClassDescriptor, linkedHashSet, deserializedClassDescriptor.w0(), true);
            return c.G2(linkedHashSet, new k9.a());
        }
    }
}
