package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import g0.g0;
import g0.g1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m7.n;
import t.e;
import t.f;
import t.i;
import u7.p;

/* loaded from: classes.dex */
public final class c implements f, e {

    /* renamed from: a  reason: collision with root package name */
    public final g1<ScrollingLogic> f1865a;

    /* renamed from: b  reason: collision with root package name */
    public i f1866b = ScrollableKt.f1782a;

    public c(g0 g0Var) {
        this.f1865a = g0Var;
    }

    @Override // t.e
    public final void a(float f10, long j2) {
        ScrollingLogic value = this.f1865a.getValue();
        value.a(this.f1866b, value.e(f10), new u0.c(j2), 1);
    }

    @Override // t.f
    public final Object b(p pVar, p7.c cVar) {
        Object c = this.f1865a.getValue().f1813d.c(MutatePriority.UserInput, new ScrollDraggableState$drag$2(this, pVar, null), (ContinuationImpl) cVar);
        if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c;
        }
        return n.f16010a;
    }
}
