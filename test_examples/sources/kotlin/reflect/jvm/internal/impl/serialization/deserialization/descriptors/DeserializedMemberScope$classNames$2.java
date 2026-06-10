package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$classNames$2 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<Collection<e>> f14888j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializedMemberScope$classNames$2(u7.a<? extends Collection<e>> aVar) {
        super(0);
        this.f14888j = aVar;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        return c.Q2(this.f14888j.k0());
    }
}
