package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import k9.c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$primaryConstructor$1 extends Lambda implements u7.a<b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14858j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$primaryConstructor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14858j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final b k0() {
        Object obj;
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14858j;
        if (deserializedClassDescriptor.f14830s.a()) {
            c.a aVar = new c.a(deserializedClassDescriptor);
            aVar.a1(deserializedClassDescriptor.r());
            return aVar;
        }
        List<ProtoBuf$Constructor> list = deserializedClassDescriptor.f14825m.f14060x;
        g.e(list, "classProto.constructorList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!f9.b.f10988m.c(((ProtoBuf$Constructor) obj).f14087l).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) obj;
        if (protoBuf$Constructor == null) {
            return null;
        }
        return deserializedClassDescriptor.f14831t.f17927i.d(protoBuf$Constructor, true);
    }
}
