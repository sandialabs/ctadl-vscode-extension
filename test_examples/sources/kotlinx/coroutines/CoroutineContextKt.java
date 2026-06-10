package kotlinx.coroutines;

import ja.c0;
import ja.f0;
import ja.p1;
import ja.q1;
import ja.x;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import p7.d;

/* loaded from: classes.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z10) {
        boolean b5 = b(coroutineContext);
        boolean b10 = b(coroutineContext2);
        if (b5 || b10) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f13060i = coroutineContext2;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
            CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.J(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z10));
            if (b10) {
                ref$ObjectRef.f13060i = ((CoroutineContext) ref$ObjectRef.f13060i).J(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.f15143j);
            }
            return coroutineContext3.m((CoroutineContext) ref$ObjectRef.f13060i);
        }
        return coroutineContext.m(coroutineContext2);
    }

    public static final boolean b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.J(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f15146j)).booleanValue();
    }

    public static final CoroutineContext c(x xVar, CoroutineContext coroutineContext) {
        CoroutineContext a10 = a(xVar.j(), coroutineContext, true);
        kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
        if (a10 != bVar && a10.a(d.a.f16777i) == null) {
            return a10.m(bVar);
        }
        return a10;
    }

    public static final p1<?> d(p7.c<?> cVar, CoroutineContext coroutineContext, Object obj) {
        boolean z10;
        p1<?> p1Var = null;
        if (!(cVar instanceof q7.b)) {
            return null;
        }
        if (coroutineContext.a(q1.f12792i) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        q7.b bVar = (q7.b) cVar;
        while (true) {
            if (!(bVar instanceof c0) && (bVar = bVar.g()) != null) {
                if (bVar instanceof p1) {
                    p1Var = (p1) bVar;
                    break;
                }
            }
        }
        if (p1Var != null) {
            p1Var.f12790l.set(new Pair<>(coroutineContext, obj));
        }
        return p1Var;
    }
}
