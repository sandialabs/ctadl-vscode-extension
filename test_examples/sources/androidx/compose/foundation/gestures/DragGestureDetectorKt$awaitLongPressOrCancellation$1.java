package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {754}, m = "awaitLongPressOrCancellation")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public o f1633l;

    /* renamed from: m  reason: collision with root package name */
    public Ref$ObjectRef f1634m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public int f1635o;

    public DragGestureDetectorKt$awaitLongPressOrCancellation$1(p7.c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f1635o |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.a(null, null, this);
    }
}
