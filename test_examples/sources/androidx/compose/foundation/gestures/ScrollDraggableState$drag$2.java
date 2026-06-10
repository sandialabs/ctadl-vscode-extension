package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t.e;
import t.i;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lt/i;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {445}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollDraggableState$drag$2 extends SuspendLambda implements p<i, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1771m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f1772o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<e, p7.c<? super n>, Object> f1773p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollDraggableState$drag$2(c cVar, p<? super e, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super ScrollDraggableState$drag$2> cVar2) {
        super(2, cVar2);
        this.f1772o = cVar;
        this.f1773p = pVar;
    }

    @Override // u7.p
    public final Object R(i iVar, p7.c<? super n> cVar) {
        return ((ScrollDraggableState$drag$2) a(iVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.f1772o, this.f1773p, cVar);
        scrollDraggableState$drag$2.n = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1771m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            i iVar = (i) this.n;
            c cVar = this.f1772o;
            cVar.getClass();
            g.f(iVar, "<set-?>");
            cVar.f1866b = iVar;
            this.f1771m = 1;
            if (this.f1773p.R(cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
