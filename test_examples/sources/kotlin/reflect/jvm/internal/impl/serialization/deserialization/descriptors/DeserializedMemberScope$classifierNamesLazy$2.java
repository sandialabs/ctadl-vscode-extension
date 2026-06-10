package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import n7.l;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope f14889j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f14889j = deserializedMemberScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        DeserializedMemberScope deserializedMemberScope = this.f14889j;
        Set<e> n = deserializedMemberScope.n();
        if (n == null) {
            return null;
        }
        return l.c2(l.c2(deserializedMemberScope.m(), deserializedMemberScope.c.e()), n);
    }
}
