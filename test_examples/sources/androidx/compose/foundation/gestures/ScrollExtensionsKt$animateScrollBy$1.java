package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Ref$FloatRef f1774l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1775m;
    public int n;

    public ScrollExtensionsKt$animateScrollBy$1(p7.c<? super ScrollExtensionsKt$animateScrollBy$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1775m = obj;
        this.n |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a(null, 0.0f, null, this);
    }
}
