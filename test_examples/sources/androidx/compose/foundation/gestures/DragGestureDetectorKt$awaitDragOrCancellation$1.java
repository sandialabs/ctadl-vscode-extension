package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {823}, m = "awaitDragOrCancellation-rnUCldI")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g1.c f1623l;

    /* renamed from: m  reason: collision with root package name */
    public Ref$LongRef f1624m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f1625o;

    public DragGestureDetectorKt$awaitDragOrCancellation$1(p7.c<? super DragGestureDetectorKt$awaitDragOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f1625o |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.b(null, 0L, this);
    }
}
