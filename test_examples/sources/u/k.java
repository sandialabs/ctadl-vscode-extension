package u;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.p;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final p f17712a = kotlinx.coroutines.flow.e.b(0, 16, BufferOverflow.DROP_OLDEST, 1);

    @Override // u.j
    public final Object a(h hVar, p7.c<? super m7.n> cVar) {
        Object c = this.f17712a.c(hVar, cVar);
        if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c;
        }
        return m7.n.f16010a;
    }

    @Override // u.j
    public final boolean b(h hVar) {
        return this.f17712a.e(hVar);
    }

    @Override // u.i
    public final p c() {
        return this.f17712a;
    }
}
