package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import ma.e;
import u7.q;

/* loaded from: classes.dex */
public final class c {
    public static final Object a(p7.c cVar, u7.a aVar, q qVar, kotlinx.coroutines.flow.c cVar2, kotlinx.coroutines.flow.b[] bVarArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(null, aVar, qVar, cVar2, bVarArr);
        e eVar = new e(cVar, cVar.f());
        Object B1 = a1.c.B1(eVar, eVar, combineKt$combineInternal$2);
        if (B1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return B1;
        }
        return n.f16010a;
    }
}
