package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
/* loaded from: classes.dex */
public final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Ref$ObjectRef f15278l;

    /* renamed from: m  reason: collision with root package name */
    public FlowKt__ReduceKt.b f15279m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f15280o;

    public FlowKt__ReduceKt$firstOrNull$1(p7.c<? super FlowKt__ReduceKt$firstOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f15280o |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.c(null, this);
    }
}
