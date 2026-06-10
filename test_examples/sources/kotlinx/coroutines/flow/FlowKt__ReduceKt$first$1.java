package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes.dex */
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Ref$ObjectRef f15271l;

    /* renamed from: m  reason: collision with root package name */
    public FlowKt__ReduceKt.a f15272m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f15273o;

    public FlowKt__ReduceKt$first$1(p7.c<? super FlowKt__ReduceKt$first$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f15273o |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.a(null, this);
    }
}
