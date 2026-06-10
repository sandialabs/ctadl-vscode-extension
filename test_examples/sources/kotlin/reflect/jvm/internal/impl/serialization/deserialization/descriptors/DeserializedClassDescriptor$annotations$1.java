package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m8.c;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$annotations$1 extends Lambda implements u7.a<List<? extends c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$annotations$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14855j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final List<? extends c> k0() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14855j;
        return kotlin.collections.c.L2(deserializedClassDescriptor.f14831t.f17920a.f17904e.g(deserializedClassDescriptor.E));
    }
}
