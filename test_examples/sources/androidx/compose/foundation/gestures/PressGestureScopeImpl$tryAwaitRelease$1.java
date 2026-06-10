package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {327}, m = "tryAwaitRelease")
/* loaded from: classes.dex */
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public PressGestureScopeImpl f1768l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1769m;
    public final /* synthetic */ PressGestureScopeImpl n;

    /* renamed from: o  reason: collision with root package name */
    public int f1770o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, p7.c<? super PressGestureScopeImpl$tryAwaitRelease$1> cVar) {
        super(cVar);
        this.n = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1769m = obj;
        this.f1770o |= Integer.MIN_VALUE;
        return this.n.M(this);
    }
}
