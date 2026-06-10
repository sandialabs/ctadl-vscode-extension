package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import r.d;
import t.j;
import u7.p;

/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, float f10, d<Float> dVar, p7.c<? super Float> cVar) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i10;
        Ref$FloatRef ref$FloatRef;
        if (cVar instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) cVar;
            int i11 = scrollExtensionsKt$animateScrollBy$1.n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.n = i11 - Integer.MIN_VALUE;
                Object obj = scrollExtensionsKt$animateScrollBy$1.f1775m;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = scrollExtensionsKt$animateScrollBy$1.n;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$FloatRef = scrollExtensionsKt$animateScrollBy$1.f1774l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    p scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f10, dVar, ref$FloatRef2, null);
                    scrollExtensionsKt$animateScrollBy$1.f1774l = ref$FloatRef2;
                    scrollExtensionsKt$animateScrollBy$1.n = 1;
                    if (jVar.c(MutatePriority.Default, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                }
                return new Float(ref$FloatRef.f13057i);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(cVar);
        Object obj3 = scrollExtensionsKt$animateScrollBy$1.f1775m;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = scrollExtensionsKt$animateScrollBy$1.n;
        if (i10 == 0) {
        }
        return new Float(ref$FloatRef.f13057i);
    }
}
