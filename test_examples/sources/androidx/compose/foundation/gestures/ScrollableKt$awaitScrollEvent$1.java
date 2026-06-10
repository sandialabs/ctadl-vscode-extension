package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {293}, m = "awaitScrollEvent")
/* loaded from: classes.dex */
public final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public g1.c f1785l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1786m;
    public int n;

    public ScrollableKt$awaitScrollEvent$1(p7.c<? super ScrollableKt$awaitScrollEvent$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1786m = obj;
        this.n |= Integer.MIN_VALUE;
        return ScrollableKt.a(null, this);
    }
}
