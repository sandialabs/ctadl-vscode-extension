package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public FlowKt__LimitKt$dropWhile$1$1 f15256l;

    /* renamed from: m  reason: collision with root package name */
    public Object f15257m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1<T> f15258o;

    /* renamed from: p  reason: collision with root package name */
    public int f15259p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1<? super T> flowKt__LimitKt$dropWhile$1$1, p7.c<? super FlowKt__LimitKt$dropWhile$1$1$emit$1> cVar) {
        super(cVar);
        this.f15258o = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f15259p |= Integer.MIN_VALUE;
        return this.f15258o.c(null, this);
    }
}
