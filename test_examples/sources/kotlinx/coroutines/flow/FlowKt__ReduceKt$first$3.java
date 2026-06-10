package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* loaded from: classes.dex */
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public u7.p f15274l;

    /* renamed from: m  reason: collision with root package name */
    public Ref$ObjectRef f15275m;
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2 n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f15276o;

    /* renamed from: p  reason: collision with root package name */
    public int f15277p;

    public FlowKt__ReduceKt$first$3(p7.c<? super FlowKt__ReduceKt$first$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15276o = obj;
        this.f15277p |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.b(null, null, this);
    }
}
