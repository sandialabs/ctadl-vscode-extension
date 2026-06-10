package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* loaded from: classes.dex */
final class TypeParameterUpperBoundEraser$erroneousErasedBound$2 extends Lambda implements u7.a<aa.f> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p f14959j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$erroneousErasedBound$2(p pVar) {
        super(0);
        this.f14959j = pVar;
    }

    @Override // u7.a
    public final aa.f k0() {
        return aa.h.c(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.f14959j.toString());
    }
}
