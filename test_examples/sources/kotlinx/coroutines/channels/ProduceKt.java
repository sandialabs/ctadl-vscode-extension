package kotlinx.coroutines.channels;

import ja.j;
import ja.u0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import la.k;
import m0.b;
import m7.n;
import p7.c;
import v7.g;

/* loaded from: classes.dex */
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k<?> kVar, u7.a<n> aVar, c<? super n> cVar) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        int i10;
        boolean z10;
        try {
            if (cVar instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) cVar;
                int i11 = produceKt$awaitClose$1.f15197o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    produceKt$awaitClose$1.f15197o = i11 - Integer.MIN_VALUE;
                    Object obj = produceKt$awaitClose$1.n;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = produceKt$awaitClose$1.f15197o;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            aVar = produceKt$awaitClose$1.f15196m;
                            b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        b.n1(obj);
                        CoroutineContext coroutineContext = produceKt$awaitClose$1.f13036j;
                        g.c(coroutineContext);
                        if (coroutineContext.a(u0.b.f12806i) == kVar) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            produceKt$awaitClose$1.f15195l = kVar;
                            produceKt$awaitClose$1.f15196m = aVar;
                            produceKt$awaitClose$1.f15197o = 1;
                            j jVar = new j(1, b.y0(produceKt$awaitClose$1));
                            jVar.u();
                            kVar.l(new ProduceKt$awaitClose$4$1(jVar));
                            if (jVar.s() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                    }
                    aVar.k0();
                    return n.f16010a;
                }
            }
            if (i10 == 0) {
            }
            aVar.k0();
            return n.f16010a;
        } catch (Throwable th) {
            aVar.k0();
            throw th;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
        Object obj2 = produceKt$awaitClose$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = produceKt$awaitClose$1.f15197o;
    }
}
