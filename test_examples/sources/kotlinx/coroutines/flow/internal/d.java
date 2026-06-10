package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import ma.e;
import u7.q;

/* loaded from: classes.dex */
public final class d implements kotlinx.coroutines.flow.b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f15427i;

    public d(q qVar) {
        this.f15427i = qVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(kotlinx.coroutines.flow.c<? super Object> cVar, p7.c<? super n> cVar2) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f15427i, cVar, null);
        e eVar = new e(cVar2, cVar2.f());
        Object B1 = a1.c.B1(eVar, eVar, flowCoroutineKt$scopedFlow$1$1);
        if (B1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return B1;
        }
        return n.f16010a;
    }
}
