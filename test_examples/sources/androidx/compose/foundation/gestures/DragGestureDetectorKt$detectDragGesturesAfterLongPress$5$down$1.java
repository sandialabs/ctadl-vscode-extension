package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lg1/o;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super o>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public int f1662k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f1663l;

    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(p7.c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1> cVar) {
        super(2, cVar);
    }

    @Override // u7.p
    public final Object R(g1.c cVar, p7.c<? super o> cVar2) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1.f1663l = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1662k;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            this.f1662k = 1;
            obj = TapGestureDetectorKt.a((g1.c) this.f1663l, PointerEventPass.Main, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
