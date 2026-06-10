package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {477}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public long f1808l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1809m;
    public final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 n;

    /* renamed from: o  reason: collision with root package name */
    public int f1810o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, p7.c<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.n = scrollableKt$scrollableNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1809m = obj;
        this.f1810o |= Integer.MIN_VALUE;
        return this.n.d(0L, 0L, this);
    }
}
