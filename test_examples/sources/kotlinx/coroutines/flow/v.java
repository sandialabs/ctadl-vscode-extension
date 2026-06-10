package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class v extends ma.b<StateFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15451a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // ma.b
    public final boolean a(ma.a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        if (this._state != null) {
            return false;
        }
        this._state = f.f15358a;
        return true;
    }

    @Override // ma.b
    public final p7.c[] b(ma.a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        this._state = null;
        return m0.b.c;
    }
}
