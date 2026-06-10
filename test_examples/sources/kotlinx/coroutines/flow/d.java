package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f15356i = SharingCommand.START;

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c<? super m7.n> cVar2) {
        Object c = cVar.c(this.f15356i, cVar2);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : m7.n.f16010a;
    }
}
