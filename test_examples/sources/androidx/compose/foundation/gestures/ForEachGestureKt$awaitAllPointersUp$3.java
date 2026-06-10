package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {79}, m = "awaitAllPointersUp")
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g1.c f1755l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1756m;
    public int n;

    public ForEachGestureKt$awaitAllPointersUp$3(p7.c<? super ForEachGestureKt$awaitAllPointersUp$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1756m = obj;
        this.n |= Integer.MIN_VALUE;
        return ForEachGestureKt.a(null, this);
    }
}
