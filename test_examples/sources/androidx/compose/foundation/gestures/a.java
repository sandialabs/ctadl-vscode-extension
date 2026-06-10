package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import r.e;
import r.n;
import v7.g;

/* loaded from: classes.dex */
public final class a implements t.c {

    /* renamed from: a  reason: collision with root package name */
    public final n<Float> f1860a;

    public a(n<Float> nVar) {
        g.f(nVar, "flingDecay");
        this.f1860a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // t.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, p7.c cVar) {
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$1;
        int i10;
        Ref$FloatRef ref$FloatRef;
        if (cVar instanceof DefaultFlingBehavior$performFling$1) {
            defaultFlingBehavior$performFling$1 = (DefaultFlingBehavior$performFling$1) cVar;
            int i11 = defaultFlingBehavior$performFling$1.f1612o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                defaultFlingBehavior$performFling$1.f1612o = i11 - Integer.MIN_VALUE;
                Object obj = defaultFlingBehavior$performFling$1.f1611m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = defaultFlingBehavior$performFling$1.f1612o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$FloatRef = defaultFlingBehavior$performFling$1.f1610l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    if (Math.abs(f10) > 1.0f) {
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        ref$FloatRef2.f13057i = f10;
                        Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        e i12 = a1.c.i(0.0f, f10, 28);
                        DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2(ref$FloatRef3, aVar, ref$FloatRef2);
                        defaultFlingBehavior$performFling$1.f1610l = ref$FloatRef2;
                        defaultFlingBehavior$performFling$1.f1612o = 1;
                        if (SuspendAnimationKt.c(i12, this.f1860a, defaultFlingBehavior$performFling$2, defaultFlingBehavior$performFling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$FloatRef = ref$FloatRef2;
                    }
                    return new Float(f10);
                }
                f10 = ref$FloatRef.f13057i;
                return new Float(f10);
            }
        }
        defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, cVar);
        Object obj2 = defaultFlingBehavior$performFling$1.f1611m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = defaultFlingBehavior$performFling$1.f1612o;
        if (i10 == 0) {
        }
        f10 = ref$FloatRef.f13057i;
        return new Float(f10);
    }
}
