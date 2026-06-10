package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public c f2765l;

    /* renamed from: m  reason: collision with root package name */
    public l f2766m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f2767o;

    /* renamed from: p  reason: collision with root package name */
    public int f2768p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(c cVar, p7.c<? super PausableMonotonicFrameClock$withFrameNanos$1> cVar2) {
        super(cVar2);
        this.f2767o = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f2768p |= Integer.MIN_VALUE;
        return this.f2767o.D(this, null);
    }
}
