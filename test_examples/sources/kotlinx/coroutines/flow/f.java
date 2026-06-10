package kotlinx.coroutines.flow;

import ja.k1;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f15358a = new kotlinx.coroutines.internal.r("NONE");

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f15359b = new kotlinx.coroutines.internal.r("PENDING");

    public static final StateFlowImpl a(Object obj) {
        if (obj == null) {
            obj = ma.i.f16036b;
        }
        return new StateFlowImpl(obj);
    }

    public static final k1 b(b bVar, ja.x xVar) {
        return m0.b.M0(xVar, null, null, new FlowKt__CollectKt$launchIn$1(bVar, null), 3);
    }
}
