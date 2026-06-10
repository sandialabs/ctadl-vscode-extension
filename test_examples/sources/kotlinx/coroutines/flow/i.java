package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class i implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f15363i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f15364j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.q f15365k;

    public i(b bVar, b bVar2, u7.q qVar) {
        this.f15363i = bVar;
        this.f15364j = bVar2;
        this.f15365k = qVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c<? super m7.n> cVar2) {
        Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, FlowKt__ZipKt$nullArrayFactory$1.f15320j, new FlowKt__ZipKt$combine$1$1(this.f15365k, null), cVar, new b[]{this.f15363i, this.f15364j});
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return m7.n.f16010a;
    }
}
