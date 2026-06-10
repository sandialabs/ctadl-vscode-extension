package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {262, 277}, m = "waitForUpOrCancellation")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForUpOrCancellation$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g1.c f1858l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1859m;
    public int n;

    public TapGestureDetectorKt$waitForUpOrCancellation$1(p7.c<? super TapGestureDetectorKt$waitForUpOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1859m = obj;
        this.n |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.c(null, this);
    }
}
