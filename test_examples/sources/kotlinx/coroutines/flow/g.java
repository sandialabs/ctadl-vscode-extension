package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class g implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f15360i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.p f15361j;

    public g(u7.p pVar, ChannelFlowTransformLatest channelFlowTransformLatest) {
        this.f15360i = channelFlowTransformLatest;
        this.f15361j = pVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c<? super m7.n> cVar2) {
        Object a10 = this.f15360i.a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), cVar, this.f15361j), cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
    }
}
