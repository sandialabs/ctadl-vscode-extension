package androidx.compose.ui.input.pointer;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.v;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@c(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", f = "SuspendingPointerInputFilter.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SuspendingPointerInputFilterKt$pointerInput$2$2$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f3295m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputFilter f3296o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<v, p7.c<? super n>, Object> f3297p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputFilterKt$pointerInput$2$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, p<? super v, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super SuspendingPointerInputFilterKt$pointerInput$2$2$1> cVar) {
        super(2, cVar);
        this.f3296o = suspendingPointerInputFilter;
        this.f3297p = pVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SuspendingPointerInputFilterKt$pointerInput$2$2$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SuspendingPointerInputFilterKt$pointerInput$2$2$1 suspendingPointerInputFilterKt$pointerInput$2$2$1 = new SuspendingPointerInputFilterKt$pointerInput$2$2$1(this.f3296o, this.f3297p, cVar);
        suspendingPointerInputFilterKt$pointerInput$2$2$1.n = obj;
        return suspendingPointerInputFilterKt$pointerInput$2$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3295m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            x xVar = (x) this.n;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f3296o;
            suspendingPointerInputFilter.getClass();
            g.f(xVar, "<set-?>");
            suspendingPointerInputFilter.f3285q = xVar;
            this.f3295m = 1;
            if (this.f3297p.R(suspendingPointerInputFilter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
