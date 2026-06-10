package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 extends Lambda implements u7.a<List<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<e> f14842j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$2$1(ArrayList arrayList) {
        super(0);
        this.f14842j = arrayList;
    }

    @Override // u7.a
    public final List<? extends e> k0() {
        return this.f14842j;
    }
}
