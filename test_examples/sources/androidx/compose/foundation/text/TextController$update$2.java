package androidx.compose.foundation.text;

import a0.d;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g1.v;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/v;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@c(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextController$update$2 extends SuspendLambda implements p<v, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2116m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ TextController f2117o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$update$2(TextController textController, p7.c<? super TextController$update$2> cVar) {
        super(2, cVar);
        this.f2117o = textController;
    }

    @Override // u7.p
    public final Object R(v vVar, p7.c<? super n> cVar) {
        return ((TextController$update$2) a(vVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        TextController$update$2 textController$update$2 = new TextController$update$2(this.f2117o, cVar);
        textController$update$2.n = obj;
        return textController$update$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2116m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            v vVar = (v) this.n;
            d dVar = this.f2117o.c;
            if (dVar != null) {
                this.f2116m = 1;
                Object e10 = DragGestureDetectorKt.e(vVar, new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(dVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(dVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(dVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(dVar), this);
                if (e10 != obj2) {
                    e10 = n.f16010a;
                }
                if (e10 == obj2) {
                    return obj2;
                }
            } else {
                g.l("longPressDragObserver");
                throw null;
            }
        }
        return n.f16010a;
    }
}
