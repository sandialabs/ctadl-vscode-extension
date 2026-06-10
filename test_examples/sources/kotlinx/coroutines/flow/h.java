package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15362a = 0;

    static {
        a1.c.D1("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }

    public static final ChannelFlowTransformLatest a(u7.p pVar, b bVar) {
        return new ChannelFlowTransformLatest(new FlowKt__MergeKt$mapLatest$1(pVar, null), bVar, EmptyCoroutineContext.f13021i, -2, BufferOverflow.SUSPEND);
    }
}
