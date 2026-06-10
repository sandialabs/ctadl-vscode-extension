package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import p7.c;
import v7.f;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lv7/f;", "", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements f<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final int f13038j;

    public RestrictedSuspendLambda(int i10, c<Object> cVar) {
        super(cVar);
        this.f13038j = i10;
    }

    @Override // v7.f
    public final int D() {
        return this.f13038j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (this.f13035i == null) {
            String h10 = i.f18169a.h(this);
            g.e(h10, "renderLambdaToString(this)");
            return h10;
        }
        return super.toString();
    }
}
