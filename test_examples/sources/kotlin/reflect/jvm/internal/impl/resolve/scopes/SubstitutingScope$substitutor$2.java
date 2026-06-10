package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.q;

/* loaded from: classes.dex */
public final class SubstitutingScope$substitutor$2 extends Lambda implements u7.a<TypeSubstitutor> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeSubstitutor f14751j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutingScope$substitutor$2(TypeSubstitutor typeSubstitutor) {
        super(0);
        this.f14751j = typeSubstitutor;
    }

    @Override // u7.a
    public final TypeSubstitutor k0() {
        q g10 = this.f14751j.g();
        g10.getClass();
        return TypeSubstitutor.d(g10);
    }
}
